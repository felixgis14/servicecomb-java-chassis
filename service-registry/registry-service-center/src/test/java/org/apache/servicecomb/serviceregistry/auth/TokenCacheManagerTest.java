/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.servicecomb.serviceregistry.auth;

import org.apache.servicecomb.foundation.auth.Cipher;
import org.apache.servicecomb.service.center.client.model.RbacTokenRequest;
import org.junit.Assert;
import org.junit.Test;

public class TokenCacheManagerTest {
  RBACBootStrapService rbacBootStrapService = new RBACBootStrapService();

  @Test
  public void testCreateHeaders() {
    Cipher cipher = rbacBootStrapService.getCipher("testCipher");
    Assert.assertSame(cipher.name(), "testCipher");

    RbacTokenRequest request = new RbacTokenRequest();
    request.setName("root");
    Assert.assertEquals(request.getName(), "root");

    request.setPassword(new String(cipher.decrypt("testtest".toCharArray())));
    Assert.assertEquals(request.getPassword(), "test");
  }
}