/*
 * Copyright 2016 Palantir Technologies, Inc. All rights reserved.
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
package com.palantir.atlasdb.services;

import javax.inject.Named;
import javax.inject.Singleton;

import com.palantir.atlasdb.keyvalue.api.KeyValueService;
import com.palantir.atlasdb.util.MetricsManager;

import dagger.Module;
import dagger.Provides;

@Module
public class RawKeyValueServiceModule {

    @Provides
    @Singleton
    @Named("rawKvs")
    public KeyValueService provideRawKeyValueService(ServicesConfig config, MetricsManager metricsManager) {
        return config.atlasDbSupplier(metricsManager).getKeyValueService();
    }

}
