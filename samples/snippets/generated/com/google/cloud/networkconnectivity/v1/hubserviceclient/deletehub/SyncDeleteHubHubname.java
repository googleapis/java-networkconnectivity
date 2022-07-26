/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.networkconnectivity.v1.samples;

// [START networkconnectivity_v1_generated_hubserviceclient_deletehub_hubname_sync]
import com.google.cloud.networkconnectivity.v1.HubName;
import com.google.cloud.networkconnectivity.v1.HubServiceClient;
import com.google.protobuf.Empty;

public class SyncDeleteHubHubname {

  public static void main(String[] args) throws Exception {
    syncDeleteHubHubname();
  }

  public static void syncDeleteHubHubname() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (HubServiceClient hubServiceClient = HubServiceClient.create()) {
      HubName name = HubName.of("[PROJECT]", "[HUB]");
      hubServiceClient.deleteHubAsync(name).get();
    }
  }
}
// [END networkconnectivity_v1_generated_hubserviceclient_deletehub_hubname_sync]
