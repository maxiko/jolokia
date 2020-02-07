package org.jolokia.client.request;

/*
 * Copyright 2009-2013 Roland Huss
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import java.util.Collections;
import java.util.List;
import javax.management.MBeanInfo;
import javax.management.MalformedObjectNameException;
import javax.management.ObjectInstance;
import javax.management.ObjectName;
import org.json.simple.JSONObject;

/**
 * Response for a {@link J4pListRequest}
 *
 * @author roland
 * @since 26.03.11
 */

public final class J4pListResponse extends J4pResponse<J4pListRequest> {

    J4pListResponse(J4pListRequest pRequest, JSONObject pJsonResponse) {
        super(pRequest, pJsonResponse);
    }

    public List<ObjectInstance> getObjectInstances() {
        throw new UnsupportedOperationException();
    }

    public List<MBeanInfo> getMbeanInfoList() {
        throw new UnsupportedOperationException();
    }

    public String getClassName() {
        return (String) ((JSONObject)getValue()).get("class");
    }

}
