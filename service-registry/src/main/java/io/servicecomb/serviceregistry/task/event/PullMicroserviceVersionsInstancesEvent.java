/*
 * Copyright 2017 Huawei Technologies Co., Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.servicecomb.serviceregistry.task.event;

import io.servicecomb.serviceregistry.consumer.MicroserviceVersions;

public class PullMicroserviceVersionsInstancesEvent {
  private MicroserviceVersions microserviceVersions;

  private long msDelay;

  public PullMicroserviceVersionsInstancesEvent(MicroserviceVersions microserviceVersions, long msDelay) {
    this.microserviceVersions = microserviceVersions;
    this.msDelay = msDelay;
  }

  public MicroserviceVersions getMicroserviceVersions() {
    return microserviceVersions;
  }

  public long getMsDelay() {
    return msDelay;
  }
}
