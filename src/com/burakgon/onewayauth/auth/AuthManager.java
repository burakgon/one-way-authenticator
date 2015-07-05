/*
 * Copyright 2015 burakgon.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.burakgon.onewayauth.auth;

/**
 *
 * @author burakgon
 */
public class AuthManager implements AuthMethods {

    private static final String[] methodList = {METHOD_SHA256, METHOD_MD5};

    public String encode(String inputParameter, String authMethod) {

        switch (authMethod) {
            case METHOD_SHA256:
                return new SHA256Auth().auth(inputParameter);

            case METHOD_MD5:
                return new MD5Auth().auth(inputParameter);

            default:
                return "Unsupported operation"; //Won't happen.
        }
    }
    
    public String[] getMethodList(){
        return methodList;
    }

}
