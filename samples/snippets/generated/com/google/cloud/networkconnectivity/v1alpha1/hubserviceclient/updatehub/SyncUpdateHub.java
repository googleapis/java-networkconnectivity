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

package com.google.cloud.networkconnectivity.v1alpha1.samples;

// [START networkconnectivity_v1alpha1_generated_hubserviceclient_updatehub_sync]
import com.google.cloud.networkconnectivity.v1alpha1.Hub;
import com.google.cloud.networkconnectivity.v1alpha1.HubServiceClient;
import com.google.cloud.networkconnectivity.v1alpha1.UpdateHubRequest;
import com.google.protobuf.FieldMask;

public class SyncUpdateHub {

  public static void main(String[] args) throws Exception {
    syncUpdateHub();
  }

  public static void syncUpdateHub() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (HubServiceClient hubServiceClient = HubServiceClient.create()) {
      UpdateHubRequest request =
          UpdateHubRequest.newBuilder()
              .setUpdateMask(FieldMask.newBuilder().build())
              .setHub(Hub.newBuilder().build())
              .setRequestId("requestId693933066")
              .build();
      Hub response = hubServiceClient.updateHubAsync(request).get();
    }
  }
}
// [END networkconnectivity_v1alpha1_generated_hubserviceclient_updatehub_sync]
