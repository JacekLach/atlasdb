/*
 * Copyright 2017 Palantir Technologies, Inc. All rights reserved.
 *
 * Licensed under the BSD-3 License (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://opensource.org/licenses/BSD-3-Clause
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.palantir.atlasdb.timelock;

import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;
import java.util.function.Supplier;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;
import com.palantir.atlasdb.timelock.paxos.PaxosTimeLockConstants;
import com.palantir.lock.LockService;
import com.palantir.logsafe.Safe;
import com.palantir.logsafe.SafeArg;
import com.palantir.timestamp.TimestampManagementService;
import com.palantir.timestamp.TimestampService;

@RolesAllowed("EXTERNAL")
@Path("/{namespace: [a-zA-Z0-9_-]+}")
public class TimeLockResource {
    private final Logger log = LoggerFactory.getLogger(TimeLockResource.class);

    private final Function<String, TimeLockServices>  clientServicesFactory;
    private final ConcurrentMap<String, TimeLockServices> servicesByNamespace = Maps.newConcurrentMap();
    private final Supplier<Integer> maxNumberOfClients;

    public TimeLockResource(
            Function<String, TimeLockServices> clientServicesFactory,
            Supplier<Integer> maxNumberOfClients) {
        this.clientServicesFactory = clientServicesFactory;
        this.maxNumberOfClients = maxNumberOfClients;
    }

    @Path("/lock")
    @RolesAllowed("EXTERNAL")
    public LockService getLockService(@Safe @PathParam("namespace") String namespace) {
        return getOrCreateServices(namespace).getLockService();
    }

    @Path("/timestamp")
    @RolesAllowed("EXTERNAL")
    public TimestampService getTimeService(@Safe @PathParam("namespace") String namespace) {
        return getOrCreateServices(namespace).getTimestampService();
    }

    @Path("/timelock")
    @RolesAllowed("EXTERNAL")
    public Object getTimelockService(@Safe @PathParam("namespace") String namespace) {
        return getOrCreateServices(namespace).getTimelockService().getPresentService();
    }

    @Path("/timestamp-management")
    @RolesAllowed("EXTERNAL")
    public TimestampManagementService getTimestampManagementService(@Safe @PathParam("namespace") String namespace) {
        return getOrCreateServices(namespace).getTimestampManagementService();
    }

    @VisibleForTesting
    TimeLockServices getOrCreateServices(String namespace) {
        return servicesByNamespace.computeIfAbsent(namespace, this::createNewClient);
    }

    public int numberOfClients() {
        return servicesByNamespace.size();
    }

    private TimeLockServices createNewClient(String namespace) {
        Preconditions.checkArgument(!namespace.equals(PaxosTimeLockConstants.LEADER_ELECTION_NAMESPACE),
                "The client name '%s' is reserved for the leader election service, and may not be "
                        + "used.",
                PaxosTimeLockConstants.LEADER_ELECTION_NAMESPACE);

        if (numberOfClients() >= maxNumberOfClients.get()) {
            log.error(
                    "Unable to create timelock services for client {}, as it would exceed the maximum number of "
                            + "allowed clients ({}). If this is intentional, the maximum number of clients can be "
                            + "increased via the maximum-number-of-clients runtime config property.",
                    SafeArg.of("client", namespace),
                    SafeArg.of("maxNumberOfClients", maxNumberOfClients));
            throw new IllegalStateException("Maximum number of clients exceeded");
        }

        return clientServicesFactory.apply(namespace);
    }
}
