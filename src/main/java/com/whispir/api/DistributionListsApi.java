package com.whispir.api;

import com.whispir.Whispir;
import com.whispir.client.ApiCallback;
import com.whispir.client.ApiClient;
import com.whispir.client.ApiException;
import com.whispir.client.ApiResponse;
import com.whispir.client.Configuration;
import com.whispir.client.Pair;
import com.whispir.client.ProgressRequestBody;
import com.whispir.client.ProgressResponseBody;
import com.whispir.client.auth.ApiKeyAuth;
import com.whispir.client.Version;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import com.whispir.model.ApiError;
import java.math.BigDecimal;
import com.whispir.model.DistributionList;
import com.whispir.model.DistributionListCollection;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;
import javax.ws.rs.core.GenericType;
import java.net.URI;
import java.util.stream.Collectors;

public class DistributionListsApi {
    private static ApiClient localVarApiClient = Configuration.getDefaultApiClient();

    private static okhttp3.Call distributionListCreateCall(String workspaceId, String xApiKey, String contentType, String accept, DistributionList distributionList, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = distributionList;

        // create path and map variables
        String localVarPath = "/workspaces/{workspaceId}/distributionlists"
            .replace("{" + "workspaceId" + "}", localVarApiClient.escapeString(workspaceId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarHeaderParams.put("Authorization", String.format("Basic %s", authHeader));
        localVarHeaderParams.put("User-Agent", String.format("whispir-java-%s", Version.VERSION));

        if (xApiKey != null) {
            localVarHeaderParams.put("X-Api-Key", localVarApiClient.parameterToString(xApiKey));
        }

        if (contentType != null) {
            localVarHeaderParams.put("Content-Type", localVarApiClient.parameterToString(contentType));
        }

        if (accept != null) {
            localVarHeaderParams.put("Accept", localVarApiClient.parameterToString(accept));
        }

        final String[] localVarAccepts = {
            "application/vnd.whispir.distributionlist-v1+json",
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/vnd.whispir.distributionlist-v1+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth", "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private static okhttp3.Call distributionListCreateValidateBeforeCall(String workspaceId, String xApiKey, String contentType, String accept, DistributionList distributionList, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'workspaceId' is set
        if (workspaceId == null) {
            throw new ApiException("Missing the required parameter 'workspaceId' when calling distributionListCreate(Async)");
        }

        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling distributionListCreate(Async)");
        }

        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new ApiException("Missing the required parameter 'contentType' when calling distributionListCreate(Async)");
        }

        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling distributionListCreate(Async)");
        }

        // verify the required parameter 'distributionList' is set
        if (distributionList == null) {
            throw new ApiException("Missing the required parameter 'distributionList' when calling distributionListCreate(Async)");
        }

        return distributionListCreateCall(workspaceId, xApiKey, contentType, accept, distributionList, _callback);
    }

    private static ApiResponse<DistributionList> distributionListCreateWithHttpInfo(String workspaceId, String xApiKey, String contentType, String accept, DistributionList distributionList) throws ApiException {
        okhttp3.Call localVarCall = distributionListCreateCall(workspaceId, xApiKey, contentType, accept, distributionList, null);
        Type localVarReturnType = new TypeToken<DistributionList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private static okhttp3.Call distributionListCreateAsync(String workspaceId, String xApiKey, String contentType, String accept, DistributionList distributionList, final ApiCallback<DistributionList> _callback) throws ApiException {
        okhttp3.Call localVarCall = distributionListCreateValidateBeforeCall(workspaceId, xApiKey, contentType, accept, distributionList, _callback);
        Type localVarReturnType = new TypeToken<DistributionList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public static class DistributionListCreateParams {
        private String workspaceId;
        private DistributionList distributionList;
        private String name;
        private String description;
        private String memberCount;
        private String access;
        private String visibility;
        private String contactIds;
        private String userIds;
        private String distListIds;
        private String type;
        private String rules;

        private DistributionListCreateParams(
            String workspaceId,
            DistributionList distributionList,
            String name,
            String description,
            String memberCount,
            String access,
            String visibility,
            String contactIds,
            String userIds,
            String distListIds,
            String type,
            String rules
        ){
            this.workspaceId = workspaceId;
            this.distributionList = distributionList;
            this.name = name;
            this.description = description;
            this.memberCount = memberCount;
            this.access = access;
            this.visibility = visibility;
            this.contactIds = contactIds;
            this.userIds = userIds;
            this.distListIds = distListIds;
            this.type = type;
            this.rules = rules;
        }
            public String getWorkspaceId() {
                return workspaceId;
            }
            public DistributionList getDistributionList() {
                return distributionList;
            }
            public String getName() {
                return name;
            }
            public String getDescription() {
                return description;
            }
            public String getMemberCount() {
                return memberCount;
            }
            public String getAccess() {
                return access;
            }
            public String getVisibility() {
                return visibility;
            }
            public String getContactIds() {
                return contactIds;
            }
            public String getUserIds() {
                return userIds;
            }
            public String getDistListIds() {
                return distListIds;
            }
            public enum TypeEnum {
            STATIC("static"),
            
            DYNAMIC("dynamic");
                private String value;
                TypeEnum(String value){
                    this.value = value;
                }

                public String getValue() {
                    return value;
                }
                
                @Override
                public String toString() {
                    return String.valueOf(value);
                }

                public static TypeEnum fromValue(String value) {
                    for (TypeEnum b : TypeEnum.values()) {
                        if (b.value.equals(value)) {
                            return b;
                        }
                    }
                    throw new IllegalArgumentException("Unexpected value '" + value + "'");
                }

            }
            public String getType() {
                return type;
            }
            public String getRules() {
                return rules;
            }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private String workspaceId;
            private DistributionList distributionList;
            private String name;
            private String description;
            private String memberCount;
            private String access;
            private String visibility;
            private String contactIds;
            private String userIds;
            private String distListIds;
            private String type;
            private String rules;

            public DistributionListCreateParams build() {
                return new DistributionListCreateParams(
                    workspaceId,
                    distributionList,
                    name,
                    description,
                    memberCount,
                    access,
                    visibility,
                    contactIds,
                    userIds,
                    distListIds,
                    type,
                    rules
                );
            }

            public Builder setWorkspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }
            public Builder setDistributionList(DistributionList distributionList) {
                this.distributionList = distributionList;
                return this;
            }
            public Builder setName(String name) {
                this.name = name;
                return this;
            }
            public Builder setDescription(String description) {
                this.description = description;
                return this;
            }
            public Builder setMemberCount(String memberCount) {
                this.memberCount = memberCount;
                return this;
            }
            public Builder setAccess(String access) {
                this.access = access;
                return this;
            }
            public Builder setVisibility(String visibility) {
                this.visibility = visibility;
                return this;
            }
            public Builder setContactIds(String contactIds) {
                this.contactIds = contactIds;
                return this;
            }
            public Builder setUserIds(String userIds) {
                this.userIds = userIds;
                return this;
            }
            public Builder setDistListIds(String distListIds) {
                this.distListIds = distListIds;
                return this;
            }
            public Builder setType(TypeEnum type) {
                this.type = type.getValue();
                return this;
            }
            public Builder setRules(String rules) {
                this.rules = rules;
                return this;
            }
        }
        

    }

    public static class DistributionListCreateRequest {
        private final String workspaceId;
        private final String xApiKey;
        private final String contentType;
        private final String accept;
        private final DistributionList distributionList;
        ApiResponse _lastResponse;

        private DistributionListCreateRequest(String workspaceId, String xApiKey, String contentType, String accept, DistributionList distributionList) {
            this.workspaceId = workspaceId;
            this.xApiKey = xApiKey;
            this.contentType = contentType;
            this.accept = accept;
            this.distributionList = distributionList;
        }

        /**
         * Build call for distributionListCreate
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return distributionListCreateCall(workspaceId, xApiKey, contentType, accept, distributionList, _callback);
        }

        /**
         * Execute distributionListCreate request
         * @return DistributionList
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public DistributionList execute() throws ApiException {
            ApiResponse<DistributionList> localVarResp = distributionListCreateWithHttpInfo(workspaceId, xApiKey, contentType, accept, distributionList);
            _lastResponse = localVarResp;
            DistributionList data = localVarResp.getData();

            
            // Special case to extract the resource identifier from the `Location` header.
            // TODO: remove this when ID is returned in response body
            String locationHeader = localVarResp.getHeaders().get("Location").get(0);
            Pattern pattern = Pattern.compile("/([^/]+)/?$", Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(locationHeader);
            if (matcher.find()) {
                data.setDocId(matcher.group(1));
            }
            
            data.lastResponse = localVarResp;
            return data;
        }
        /**
         * Return the last executed API response
         * @return ApiResponse
         */
        public ApiResponse getLastResponse()  {
            return _lastResponse;
        }


        /**
         * Execute distributionListCreate request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<DistributionList> _callback) throws ApiException {
            return distributionListCreateAsync(workspaceId, xApiKey, contentType, accept, distributionList, _callback);
        }
    }

    /**
     * Create a distribution list
     * @param params The param instance required to create DistributionListCreateRequest
     * @return DistributionList
     */

    public static DistributionList create(Map<String, Object> params) throws ApiException {
        String workspaceId = (String) params.get("workspaceId");

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }
        String nameValue = (String) params.get("name");
        if(nameValue == null) {
            throw new ApiException("Missing the required property value of 'name'");
        }
        String descriptionValue = (String) params.get("description");
        String memberCountValue = (String) params.get("memberCount");
        String accessValue = (String) params.get("access");
        String visibilityValue = (String) params.get("visibility");
        String contactIdsValue = (String) params.get("contactIds");
        String userIdsValue = (String) params.get("userIds");
        String distListIdsValue = (String) params.get("distListIds");
        com.whispir.api.DistributionListsApi.DistributionListCreateParams.TypeEnum typeValue = com.whispir.api.DistributionListsApi.DistributionListCreateParams.TypeEnum.valueOf((String) params.get("type"));
        String rulesValue = (String) params.get("rules");
        DistributionListCreateParams tempParams = DistributionListCreateParams.builder()
            .setWorkspaceId(workspaceId)
            .setName(nameValue)
            .setDescription(descriptionValue)
            .setMemberCount(memberCountValue)
            .setAccess(accessValue)
            .setVisibility(visibilityValue)
            .setContactIds(contactIdsValue)
            .setUserIds(userIdsValue)
            .setDistListIds(distListIdsValue)
            .setType(typeValue)
            .setRules(rulesValue).build();

        return create(tempParams);
    }

    public static DistributionList create(DistributionListCreateParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }


        String workspaceId = params.getWorkspaceId();

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }

        String contentType = "application/vnd.whispir.distributionlist-v1+json";

        String accept = "application/vnd.whispir.distributionlist-v1+json";


        // Constructing 'DistributionList' from 'DistributionListCreateParams' instance passed
        DistributionList distributionList = new DistributionList();
        String nameValue = params.getName();
        if(nameValue == null) {
            throw new ApiException("Missing the required property value of 'name'");
        }
        distributionList.setName(nameValue);

        String descriptionValue = params.getDescription();
        distributionList.setDescription(descriptionValue);

        String memberCountValue = params.getMemberCount();
        distributionList.setMemberCount(memberCountValue);

        String accessValue = params.getAccess();
        distributionList.setAccess(accessValue);

        String visibilityValue = params.getVisibility();
        distributionList.setVisibility(visibilityValue);

        String contactIdsValue = params.getContactIds();
        distributionList.setContactIds(contactIdsValue);

        String userIdsValue = params.getUserIds();
        distributionList.setUserIds(userIdsValue);

        String distListIdsValue = params.getDistListIds();
        distributionList.setDistListIds(distListIdsValue);

        String typeValue = params.getType();
        distributionList.setType(typeValue);

        String rulesValue = params.getRules();
        distributionList.setRules(rulesValue);

        DistributionListCreateRequest request = new DistributionListCreateRequest(workspaceId, xApiKey, contentType, accept, distributionList);

        // Ensure to include all of the 'optionalParams' that are passed

        return request.execute();
    }
    private static okhttp3.Call distributionListDeleteCall(String workspaceId, String xApiKey, String distributionlistId, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/workspaces/{workspaceId}/distributionlists/{distributionlistId}"
            .replace("{" + "workspaceId" + "}", localVarApiClient.escapeString(workspaceId.toString()))
            .replace("{" + "distributionlistId" + "}", localVarApiClient.escapeString(distributionlistId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarHeaderParams.put("Authorization", String.format("Basic %s", authHeader));
        localVarHeaderParams.put("User-Agent", String.format("whispir-java-%s", Version.VERSION));

        if (xApiKey != null) {
            localVarHeaderParams.put("X-Api-Key", localVarApiClient.parameterToString(xApiKey));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth", "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private static okhttp3.Call distributionListDeleteValidateBeforeCall(String workspaceId, String xApiKey, String distributionlistId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'workspaceId' is set
        if (workspaceId == null) {
            throw new ApiException("Missing the required parameter 'workspaceId' when calling distributionListDelete(Async)");
        }

        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling distributionListDelete(Async)");
        }

        // verify the required parameter 'distributionlistId' is set
        if (distributionlistId == null) {
            throw new ApiException("Missing the required parameter 'distributionlistId' when calling distributionListDelete(Async)");
        }

        return distributionListDeleteCall(workspaceId, xApiKey, distributionlistId, _callback);
    }

    private static ApiResponse<Void> distributionListDeleteWithHttpInfo(String workspaceId, String xApiKey, String distributionlistId) throws ApiException {
        okhttp3.Call localVarCall = distributionListDeleteCall(workspaceId, xApiKey, distributionlistId, null);
        return localVarApiClient.execute(localVarCall);
    }

    private static okhttp3.Call distributionListDeleteAsync(String workspaceId, String xApiKey, String distributionlistId, final ApiCallback<Void> _callback) throws ApiException {
        okhttp3.Call localVarCall = distributionListDeleteValidateBeforeCall(workspaceId, xApiKey, distributionlistId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public static class DistributionListDeleteParams {
        private String workspaceId;
        private String distributionlistId;

        private DistributionListDeleteParams(
            String workspaceId,
            String distributionlistId
        ){
            this.workspaceId = workspaceId;
            this.distributionlistId = distributionlistId;
        }
            public String getWorkspaceId() {
                return workspaceId;
            }
            public String getDistributionlistId() {
                return distributionlistId;
            }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private String workspaceId;
            private String distributionlistId;

            public DistributionListDeleteParams build() {
                return new DistributionListDeleteParams(
                    workspaceId,
                    distributionlistId
                );
            }

            public Builder setWorkspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }
            public Builder setDistributionlistId(String distributionlistId) {
                this.distributionlistId = distributionlistId;
                return this;
            }
        }
        
    }

    public static class DistributionListDeleteRequest {
        private final String workspaceId;
        private final String xApiKey;
        private final String distributionlistId;
        ApiResponse _lastResponse;

        private DistributionListDeleteRequest(String workspaceId, String xApiKey, String distributionlistId) {
            this.workspaceId = workspaceId;
            this.xApiKey = xApiKey;
            this.distributionlistId = distributionlistId;
        }

        /**
         * Build call for distributionListDelete
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return distributionListDeleteCall(workspaceId, xApiKey, distributionlistId, _callback);
        }

        /**
         * Execute distributionListDelete request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public void execute() throws ApiException {
            distributionListDeleteWithHttpInfo(workspaceId, xApiKey, distributionlistId);
        }
        /**
         * Return the last executed API response
         * @return ApiResponse
         */
        public ApiResponse getLastResponse()  {
            return _lastResponse;
        }


        /**
         * Execute distributionListDelete request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return distributionListDeleteAsync(workspaceId, xApiKey, distributionlistId, _callback);
        }
    }

    /**
     * Delete a distribution list
     * @param params The param instance required to create DistributionListDeleteRequest
     * @return void
     */

    public static void delete(Map<String, Object> params) throws ApiException {
        String workspaceId = (String) params.get("workspaceId");

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }
        String distributionlistId = (String) params.get("distributionlistId");

        if(distributionlistId == null || distributionlistId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'distributionlistId'");
        }
        DistributionListDeleteParams tempParams = DistributionListDeleteParams.builder()
            .setWorkspaceId(workspaceId)
            .setDistributionlistId(distributionlistId).build();

        delete(tempParams);
    }

    public static void delete(DistributionListDeleteParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }


        String workspaceId = params.getWorkspaceId();

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }


        String distributionlistId = params.getDistributionlistId();

        if(distributionlistId == null || distributionlistId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'distributionlistId'");
        }
        DistributionListDeleteRequest request = new DistributionListDeleteRequest(workspaceId, xApiKey, distributionlistId);

        // Ensure to include all of the 'optionalParams' that are passed

        request.execute();
    }
    private static okhttp3.Call distributionListListCall(String workspaceId, String xApiKey, String accept, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields, String name, String description, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/workspaces/{workspaceId}/distributionlists"
            .replace("{" + "workspaceId" + "}", localVarApiClient.escapeString(workspaceId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarHeaderParams.put("Authorization", String.format("Basic %s", authHeader));
        localVarHeaderParams.put("User-Agent", String.format("whispir-java-%s", Version.VERSION));

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (offset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offset", offset));
        }

        if (sortOrder != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sortOrder", sortOrder));
        }

        if (sortFields != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sortFields", sortFields));
        }

        if (name != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("name", name));
        }

        if (description != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("description", description));
        }

        if (xApiKey != null) {
            localVarHeaderParams.put("X-Api-Key", localVarApiClient.parameterToString(xApiKey));
        }

        if (accept != null) {
            localVarHeaderParams.put("Accept", localVarApiClient.parameterToString(accept));
        }

        final String[] localVarAccepts = {
            "application/vnd.whispir.distributionlist-v1+json",
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth", "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private static okhttp3.Call distributionListListValidateBeforeCall(String workspaceId, String xApiKey, String accept, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields, String name, String description, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'workspaceId' is set
        if (workspaceId == null) {
            throw new ApiException("Missing the required parameter 'workspaceId' when calling distributionListList(Async)");
        }

        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling distributionListList(Async)");
        }

        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling distributionListList(Async)");
        }

        return distributionListListCall(workspaceId, xApiKey, accept, limit, offset, sortOrder, sortFields, name, description, _callback);
    }

    private static ApiResponse<DistributionListCollection> distributionListListWithHttpInfo(String workspaceId, String xApiKey, String accept, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields, String name, String description) throws ApiException {
        okhttp3.Call localVarCall = distributionListListCall(workspaceId, xApiKey, accept, limit, offset, sortOrder, sortFields, name, description, null);
        Type localVarReturnType = new TypeToken<DistributionListCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private static okhttp3.Call distributionListListAsync(String workspaceId, String xApiKey, String accept, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields, String name, String description, final ApiCallback<DistributionListCollection> _callback) throws ApiException {
        okhttp3.Call localVarCall = distributionListListValidateBeforeCall(workspaceId, xApiKey, accept, limit, offset, sortOrder, sortFields, name, description, _callback);
        Type localVarReturnType = new TypeToken<DistributionListCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public static class DistributionListListParams {
        private String workspaceId;
        private BigDecimal limit;
        private BigDecimal offset;
        private String sortOrder;
        private String sortFields;
        private String name;
        private String description;

        private DistributionListListParams(
            String workspaceId,
            BigDecimal limit,
            BigDecimal offset,
            String sortOrder,
            String sortFields,
            String name,
            String description
        ){
            this.workspaceId = workspaceId;
            this.limit = limit;
            this.offset = offset;
            this.sortOrder = sortOrder;
            this.sortFields = sortFields;
            this.name = name;
            this.description = description;
        }
            public String getWorkspaceId() {
                return workspaceId;
            }
            public BigDecimal getLimit() {
                return limit;
            }
            public BigDecimal getOffset() {
                return offset;
            }
            public String getSortOrder() {
                return sortOrder;
            }
            public String getSortFields() {
                return sortFields;
            }
            public String getName() {
                return name;
            }
            public String getDescription() {
                return description;
            }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private String workspaceId;
            private BigDecimal limit;
            private BigDecimal offset;
            private String sortOrder;
            private String sortFields;
            private String name;
            private String description;

            public DistributionListListParams build() {
                return new DistributionListListParams(
                    workspaceId,
                    limit,
                    offset,
                    sortOrder,
                    sortFields,
                    name,
                    description
                );
            }

            public Builder setWorkspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }
            public Builder setLimit(BigDecimal limit) {
                this.limit = limit;
                return this;
            }
            public Builder setOffset(BigDecimal offset) {
                this.offset = offset;
                return this;
            }
            public Builder setSortOrder(String sortOrder) {
                this.sortOrder = sortOrder;
                return this;
            }
            public Builder setSortFields(String sortFields) {
                this.sortFields = sortFields;
                return this;
            }
            public Builder setName(String name) {
                this.name = name;
                return this;
            }
            public Builder setDescription(String description) {
                this.description = description;
                return this;
            }
        }
        
    }

    public static class DistributionListListRequest {
        private final String workspaceId;
        private final String xApiKey;
        private final String accept;
        private BigDecimal limit;
        private BigDecimal offset;
        private String sortOrder;
        private String sortFields;
        private String name;
        private String description;
        ApiResponse _lastResponse;

        private DistributionListListRequest(String workspaceId, String xApiKey, String accept) {
            this.workspaceId = workspaceId;
            this.xApiKey = xApiKey;
            this.accept = accept;
        }

        /**
         * Set limit
         * @param limit The number of records to be returned. (optional, default to 20)
         * @return APIdistributionListListRequest
         */
        public DistributionListListRequest limit(BigDecimal limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Set offset
         * @param offset The record number to start returning from. (optional, default to 0)
         * @return APIdistributionListListRequest
         */
        public DistributionListListRequest offset(BigDecimal offset) {
            this.offset = offset;
            return this;
        }

        /**
         * Set sortOrder
         * @param sortOrder The order in which you require the results to be returned. Either ‘asc’ or ‘desc’ (optional)
         * @return APIdistributionListListRequest
         */
        public DistributionListListRequest sortOrder(String sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * Set sortFields
         * @param sortFields The fields that you require the ordering to be performed on. Multiple fields can be provided, separated by a comma. (optional)
         * @return APIdistributionListListRequest
         */
        public DistributionListListRequest sortFields(String sortFields) {
            this.sortFields = sortFields;
            return this;
        }

        /**
         * Set name
         * @param name Specifies the name of the Distribution List to be searched for. It is based on the uniqueness of the name of the Distribution List. If the name contains spaces it is suggested - but not required - to escape them (optional)
         * @return APIdistributionListListRequest
         */
        public DistributionListListRequest name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Set description
         * @param description Specifies the descrition for the Distribution List to be searched for. If the description contains spaces it is suggested - but not required - to escape them (optional)
         * @return APIdistributionListListRequest
         */
        public DistributionListListRequest description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Build call for distributionListList
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return distributionListListCall(workspaceId, xApiKey, accept, limit, offset, sortOrder, sortFields, name, description, _callback);
        }

        /**
         * Execute distributionListList request
         * @return DistributionListCollection
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public DistributionListCollection execute() throws ApiException {
            ApiResponse<DistributionListCollection> localVarResp = distributionListListWithHttpInfo(workspaceId, xApiKey, accept, limit, offset, sortOrder, sortFields, name, description);
            _lastResponse = localVarResp;
            DistributionListCollection data = localVarResp.getData();

            
            data.lastResponse = localVarResp;
            return data;
        }
        /**
         * Return the last executed API response
         * @return ApiResponse
         */
        public ApiResponse getLastResponse()  {
            return _lastResponse;
        }


        /**
         * Execute distributionListList request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<DistributionListCollection> _callback) throws ApiException {
            return distributionListListAsync(workspaceId, xApiKey, accept, limit, offset, sortOrder, sortFields, name, description, _callback);
        }
    }

    /**
     * List distribution lists
     * @param params The param instance required to create DistributionListListRequest
     * @return DistributionListCollection
     */

    public static DistributionListCollection list(Map<String, Object> params) throws ApiException {
        BigDecimal limit = null;
        if(params.containsKey("limit") && params.get("limit") != null){
            limit = (BigDecimal) params.get("limit");
        }
        BigDecimal offset = null;
        if(params.containsKey("offset") && params.get("offset") != null){
            offset = (BigDecimal) params.get("offset");
        }
        String sortOrder = null;
        if(params.containsKey("sortOrder") && params.get("sortOrder") != null){
            sortOrder = (String) params.get("sortOrder");
        }
        String sortFields = null;
        if(params.containsKey("sortFields") && params.get("sortFields") != null){
            sortFields = (String) params.get("sortFields");
        }
        String name = null;
        if(params.containsKey("name") && params.get("name") != null){
            name = (String) params.get("name");
        }
        String description = null;
        if(params.containsKey("description") && params.get("description") != null){
            description = (String) params.get("description");
        }
        String workspaceId = (String) params.get("workspaceId");

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }
        DistributionListListParams tempParams = DistributionListListParams.builder()
            .setWorkspaceId(workspaceId)
            .setLimit(limit)
            .setOffset(offset)
            .setSortOrder(sortOrder)
            .setSortFields(sortFields)
            .setName(name)
            .setDescription(description).build();

        return list(tempParams);
    }

    public static DistributionListCollection list(DistributionListListParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }


        String workspaceId = params.getWorkspaceId();

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }

        String accept = "application/vnd.whispir.distributionlist-v1+json";

        DistributionListListRequest request = new DistributionListListRequest(workspaceId, xApiKey, accept);

        // Ensure to include all of the 'optionalParams' that are passed
        if(params.limit != null){
            BigDecimal limit = params.getLimit();
            request.limit(limit);
        }
        if(params.offset != null){
            BigDecimal offset = params.getOffset();
            request.offset(offset);
        }
        if(params.sortOrder != null){
            String sortOrder = params.getSortOrder();
            request.sortOrder(sortOrder);
        }
        if(params.sortFields != null){
            String sortFields = params.getSortFields();
            request.sortFields(sortFields);
        }
        if(params.name != null){
            String name = params.getName();
            request.name(name);
        }
        if(params.description != null){
            String description = params.getDescription();
            request.description(description);
        }

        return request.execute();
    }
    private static okhttp3.Call distributionListRetrieveCall(String workspaceId, String xApiKey, String accept, String distributionlistId, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/workspaces/{workspaceId}/distributionlists/{distributionlistId}"
            .replace("{" + "workspaceId" + "}", localVarApiClient.escapeString(workspaceId.toString()))
            .replace("{" + "distributionlistId" + "}", localVarApiClient.escapeString(distributionlistId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarHeaderParams.put("Authorization", String.format("Basic %s", authHeader));
        localVarHeaderParams.put("User-Agent", String.format("whispir-java-%s", Version.VERSION));

        if (xApiKey != null) {
            localVarHeaderParams.put("X-Api-Key", localVarApiClient.parameterToString(xApiKey));
        }

        if (accept != null) {
            localVarHeaderParams.put("Accept", localVarApiClient.parameterToString(accept));
        }

        final String[] localVarAccepts = {
            "application/vnd.whispir.distributionlist-v1+json",
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth", "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private static okhttp3.Call distributionListRetrieveValidateBeforeCall(String workspaceId, String xApiKey, String accept, String distributionlistId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'workspaceId' is set
        if (workspaceId == null) {
            throw new ApiException("Missing the required parameter 'workspaceId' when calling distributionListRetrieve(Async)");
        }

        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling distributionListRetrieve(Async)");
        }

        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling distributionListRetrieve(Async)");
        }

        // verify the required parameter 'distributionlistId' is set
        if (distributionlistId == null) {
            throw new ApiException("Missing the required parameter 'distributionlistId' when calling distributionListRetrieve(Async)");
        }

        return distributionListRetrieveCall(workspaceId, xApiKey, accept, distributionlistId, _callback);
    }

    private static ApiResponse<DistributionList> distributionListRetrieveWithHttpInfo(String workspaceId, String xApiKey, String accept, String distributionlistId) throws ApiException {
        okhttp3.Call localVarCall = distributionListRetrieveCall(workspaceId, xApiKey, accept, distributionlistId, null);
        Type localVarReturnType = new TypeToken<DistributionList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private static okhttp3.Call distributionListRetrieveAsync(String workspaceId, String xApiKey, String accept, String distributionlistId, final ApiCallback<DistributionList> _callback) throws ApiException {
        okhttp3.Call localVarCall = distributionListRetrieveValidateBeforeCall(workspaceId, xApiKey, accept, distributionlistId, _callback);
        Type localVarReturnType = new TypeToken<DistributionList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public static class DistributionListRetrieveParams {
        private String workspaceId;
        private String distributionlistId;

        private DistributionListRetrieveParams(
            String workspaceId,
            String distributionlistId
        ){
            this.workspaceId = workspaceId;
            this.distributionlistId = distributionlistId;
        }
            public String getWorkspaceId() {
                return workspaceId;
            }
            public String getDistributionlistId() {
                return distributionlistId;
            }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private String workspaceId;
            private String distributionlistId;

            public DistributionListRetrieveParams build() {
                return new DistributionListRetrieveParams(
                    workspaceId,
                    distributionlistId
                );
            }

            public Builder setWorkspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }
            public Builder setDistributionlistId(String distributionlistId) {
                this.distributionlistId = distributionlistId;
                return this;
            }
        }
        
    }

    public static class DistributionListRetrieveRequest {
        private final String workspaceId;
        private final String xApiKey;
        private final String accept;
        private final String distributionlistId;
        ApiResponse _lastResponse;

        private DistributionListRetrieveRequest(String workspaceId, String xApiKey, String accept, String distributionlistId) {
            this.workspaceId = workspaceId;
            this.xApiKey = xApiKey;
            this.accept = accept;
            this.distributionlistId = distributionlistId;
        }

        /**
         * Build call for distributionListRetrieve
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return distributionListRetrieveCall(workspaceId, xApiKey, accept, distributionlistId, _callback);
        }

        /**
         * Execute distributionListRetrieve request
         * @return DistributionList
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public DistributionList execute() throws ApiException {
            ApiResponse<DistributionList> localVarResp = distributionListRetrieveWithHttpInfo(workspaceId, xApiKey, accept, distributionlistId);
            _lastResponse = localVarResp;
            DistributionList data = localVarResp.getData();

            
            data.lastResponse = localVarResp;
            return data;
        }
        /**
         * Return the last executed API response
         * @return ApiResponse
         */
        public ApiResponse getLastResponse()  {
            return _lastResponse;
        }


        /**
         * Execute distributionListRetrieve request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<DistributionList> _callback) throws ApiException {
            return distributionListRetrieveAsync(workspaceId, xApiKey, accept, distributionlistId, _callback);
        }
    }

    /**
     * Retrieve a distribution list
     * @param params The param instance required to create DistributionListRetrieveRequest
     * @return DistributionList
     */

    public static DistributionList retrieve(Map<String, Object> params) throws ApiException {
        String workspaceId = (String) params.get("workspaceId");

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }
        String distributionlistId = (String) params.get("distributionlistId");

        if(distributionlistId == null || distributionlistId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'distributionlistId'");
        }
        DistributionListRetrieveParams tempParams = DistributionListRetrieveParams.builder()
            .setWorkspaceId(workspaceId)
            .setDistributionlistId(distributionlistId).build();

        return retrieve(tempParams);
    }

    public static DistributionList retrieve(DistributionListRetrieveParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }


        String workspaceId = params.getWorkspaceId();

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }

        String accept = "application/vnd.whispir.distributionlist-v1+json";


        String distributionlistId = params.getDistributionlistId();

        if(distributionlistId == null || distributionlistId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'distributionlistId'");
        }
        DistributionListRetrieveRequest request = new DistributionListRetrieveRequest(workspaceId, xApiKey, accept, distributionlistId);

        // Ensure to include all of the 'optionalParams' that are passed

        return request.execute();
    }
    private static okhttp3.Call distributionListUpdateCall(String workspaceId, String xApiKey, String contentType, String accept, String distributionlistId, DistributionList distributionList, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = distributionList;

        // create path and map variables
        String localVarPath = "/workspaces/{workspaceId}/distributionlists/{distributionlistId}"
            .replace("{" + "workspaceId" + "}", localVarApiClient.escapeString(workspaceId.toString()))
            .replace("{" + "distributionlistId" + "}", localVarApiClient.escapeString(distributionlistId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarHeaderParams.put("Authorization", String.format("Basic %s", authHeader));
        localVarHeaderParams.put("User-Agent", String.format("whispir-java-%s", Version.VERSION));

        if (xApiKey != null) {
            localVarHeaderParams.put("X-Api-Key", localVarApiClient.parameterToString(xApiKey));
        }

        if (contentType != null) {
            localVarHeaderParams.put("Content-Type", localVarApiClient.parameterToString(contentType));
        }

        if (accept != null) {
            localVarHeaderParams.put("Accept", localVarApiClient.parameterToString(accept));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/vnd.whispir.distributionlist-v1+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth", "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private static okhttp3.Call distributionListUpdateValidateBeforeCall(String workspaceId, String xApiKey, String contentType, String accept, String distributionlistId, DistributionList distributionList, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'workspaceId' is set
        if (workspaceId == null) {
            throw new ApiException("Missing the required parameter 'workspaceId' when calling distributionListUpdate(Async)");
        }

        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling distributionListUpdate(Async)");
        }

        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new ApiException("Missing the required parameter 'contentType' when calling distributionListUpdate(Async)");
        }

        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling distributionListUpdate(Async)");
        }

        // verify the required parameter 'distributionlistId' is set
        if (distributionlistId == null) {
            throw new ApiException("Missing the required parameter 'distributionlistId' when calling distributionListUpdate(Async)");
        }

        // verify the required parameter 'distributionList' is set
        if (distributionList == null) {
            throw new ApiException("Missing the required parameter 'distributionList' when calling distributionListUpdate(Async)");
        }

        return distributionListUpdateCall(workspaceId, xApiKey, contentType, accept, distributionlistId, distributionList, _callback);
    }

    private static ApiResponse<Void> distributionListUpdateWithHttpInfo(String workspaceId, String xApiKey, String contentType, String accept, String distributionlistId, DistributionList distributionList) throws ApiException {
        okhttp3.Call localVarCall = distributionListUpdateCall(workspaceId, xApiKey, contentType, accept, distributionlistId, distributionList, null);
        return localVarApiClient.execute(localVarCall);
    }

    private static okhttp3.Call distributionListUpdateAsync(String workspaceId, String xApiKey, String contentType, String accept, String distributionlistId, DistributionList distributionList, final ApiCallback<Void> _callback) throws ApiException {
        okhttp3.Call localVarCall = distributionListUpdateValidateBeforeCall(workspaceId, xApiKey, contentType, accept, distributionlistId, distributionList, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public static class DistributionListUpdateParams {
        private String workspaceId;
        private String distributionlistId;
        private DistributionList distributionList;
        private String name;
        private String description;
        private String memberCount;
        private String access;
        private String visibility;
        private String contactIds;
        private String userIds;
        private String distListIds;
        private String type;
        private String rules;

        private DistributionListUpdateParams(
            String workspaceId,
            String distributionlistId,
            DistributionList distributionList,
            String name,
            String description,
            String memberCount,
            String access,
            String visibility,
            String contactIds,
            String userIds,
            String distListIds,
            String type,
            String rules
        ){
            this.workspaceId = workspaceId;
            this.distributionlistId = distributionlistId;
            this.distributionList = distributionList;
            this.name = name;
            this.description = description;
            this.memberCount = memberCount;
            this.access = access;
            this.visibility = visibility;
            this.contactIds = contactIds;
            this.userIds = userIds;
            this.distListIds = distListIds;
            this.type = type;
            this.rules = rules;
        }
            public String getWorkspaceId() {
                return workspaceId;
            }
            public String getDistributionlistId() {
                return distributionlistId;
            }
            public DistributionList getDistributionList() {
                return distributionList;
            }
            public String getName() {
                return name;
            }
            public String getDescription() {
                return description;
            }
            public String getMemberCount() {
                return memberCount;
            }
            public String getAccess() {
                return access;
            }
            public String getVisibility() {
                return visibility;
            }
            public String getContactIds() {
                return contactIds;
            }
            public String getUserIds() {
                return userIds;
            }
            public String getDistListIds() {
                return distListIds;
            }
            public enum TypeEnum {
            STATIC("static"),
            
            DYNAMIC("dynamic");
                private String value;
                TypeEnum(String value){
                    this.value = value;
                }

                public String getValue() {
                    return value;
                }
                
                @Override
                public String toString() {
                    return String.valueOf(value);
                }

                public static TypeEnum fromValue(String value) {
                    for (TypeEnum b : TypeEnum.values()) {
                        if (b.value.equals(value)) {
                            return b;
                        }
                    }
                    throw new IllegalArgumentException("Unexpected value '" + value + "'");
                }

            }
            public String getType() {
                return type;
            }
            public String getRules() {
                return rules;
            }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private String workspaceId;
            private String distributionlistId;
            private DistributionList distributionList;
            private String name;
            private String description;
            private String memberCount;
            private String access;
            private String visibility;
            private String contactIds;
            private String userIds;
            private String distListIds;
            private String type;
            private String rules;

            public DistributionListUpdateParams build() {
                return new DistributionListUpdateParams(
                    workspaceId,
                    distributionlistId,
                    distributionList,
                    name,
                    description,
                    memberCount,
                    access,
                    visibility,
                    contactIds,
                    userIds,
                    distListIds,
                    type,
                    rules
                );
            }

            public Builder setWorkspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }
            public Builder setDistributionlistId(String distributionlistId) {
                this.distributionlistId = distributionlistId;
                return this;
            }
            public Builder setDistributionList(DistributionList distributionList) {
                this.distributionList = distributionList;
                return this;
            }
            public Builder setName(String name) {
                this.name = name;
                return this;
            }
            public Builder setDescription(String description) {
                this.description = description;
                return this;
            }
            public Builder setMemberCount(String memberCount) {
                this.memberCount = memberCount;
                return this;
            }
            public Builder setAccess(String access) {
                this.access = access;
                return this;
            }
            public Builder setVisibility(String visibility) {
                this.visibility = visibility;
                return this;
            }
            public Builder setContactIds(String contactIds) {
                this.contactIds = contactIds;
                return this;
            }
            public Builder setUserIds(String userIds) {
                this.userIds = userIds;
                return this;
            }
            public Builder setDistListIds(String distListIds) {
                this.distListIds = distListIds;
                return this;
            }
            public Builder setType(TypeEnum type) {
                this.type = type.getValue();
                return this;
            }
            public Builder setRules(String rules) {
                this.rules = rules;
                return this;
            }
        }
        

    }

    public static class DistributionListUpdateRequest {
        private final String workspaceId;
        private final String xApiKey;
        private final String contentType;
        private final String accept;
        private final String distributionlistId;
        private final DistributionList distributionList;
        ApiResponse _lastResponse;

        private DistributionListUpdateRequest(String workspaceId, String xApiKey, String contentType, String accept, String distributionlistId, DistributionList distributionList) {
            this.workspaceId = workspaceId;
            this.xApiKey = xApiKey;
            this.contentType = contentType;
            this.accept = accept;
            this.distributionlistId = distributionlistId;
            this.distributionList = distributionList;
        }

        /**
         * Build call for distributionListUpdate
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return distributionListUpdateCall(workspaceId, xApiKey, contentType, accept, distributionlistId, distributionList, _callback);
        }

        /**
         * Execute distributionListUpdate request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public void execute() throws ApiException {
            distributionListUpdateWithHttpInfo(workspaceId, xApiKey, contentType, accept, distributionlistId, distributionList);
        }
        /**
         * Return the last executed API response
         * @return ApiResponse
         */
        public ApiResponse getLastResponse()  {
            return _lastResponse;
        }


        /**
         * Execute distributionListUpdate request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return distributionListUpdateAsync(workspaceId, xApiKey, contentType, accept, distributionlistId, distributionList, _callback);
        }
    }

    /**
     * Update a distribution list
     * @param params The param instance required to create DistributionListUpdateRequest
     * @return void
     */

    public static void update(Map<String, Object> params) throws ApiException {
        String workspaceId = (String) params.get("workspaceId");

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }
        String distributionlistId = (String) params.get("distributionlistId");

        if(distributionlistId == null || distributionlistId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'distributionlistId'");
        }
        String nameValue = (String) params.get("name");
        if(nameValue == null) {
            throw new ApiException("Missing the required property value of 'name'");
        }
        String descriptionValue = (String) params.get("description");
        String memberCountValue = (String) params.get("memberCount");
        String accessValue = (String) params.get("access");
        String visibilityValue = (String) params.get("visibility");
        String contactIdsValue = (String) params.get("contactIds");
        String userIdsValue = (String) params.get("userIds");
        String distListIdsValue = (String) params.get("distListIds");
        com.whispir.api.DistributionListsApi.DistributionListUpdateParams.TypeEnum typeValue = com.whispir.api.DistributionListsApi.DistributionListUpdateParams.TypeEnum.valueOf((String) params.get("type"));
        String rulesValue = (String) params.get("rules");
        DistributionListUpdateParams tempParams = DistributionListUpdateParams.builder()
            .setWorkspaceId(workspaceId)
            .setDistributionlistId(distributionlistId)
            .setName(nameValue)
            .setDescription(descriptionValue)
            .setMemberCount(memberCountValue)
            .setAccess(accessValue)
            .setVisibility(visibilityValue)
            .setContactIds(contactIdsValue)
            .setUserIds(userIdsValue)
            .setDistListIds(distListIdsValue)
            .setType(typeValue)
            .setRules(rulesValue).build();

        update(tempParams);
    }

    public static void update(DistributionListUpdateParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }


        String workspaceId = params.getWorkspaceId();

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }

        String contentType = "application/vnd.whispir.distributionlist-v1+json";

        String accept = "application/vnd.whispir.distributionlist-v1+json";


        String distributionlistId = params.getDistributionlistId();

        if(distributionlistId == null || distributionlistId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'distributionlistId'");
        }

        // Constructing 'DistributionList' from 'DistributionListUpdateParams' instance passed
        DistributionList distributionList = new DistributionList();
        String nameValue = params.getName();
        if(nameValue == null) {
            throw new ApiException("Missing the required property value of 'name'");
        }
        distributionList.setName(nameValue);

        String descriptionValue = params.getDescription();
        distributionList.setDescription(descriptionValue);

        String memberCountValue = params.getMemberCount();
        distributionList.setMemberCount(memberCountValue);

        String accessValue = params.getAccess();
        distributionList.setAccess(accessValue);

        String visibilityValue = params.getVisibility();
        distributionList.setVisibility(visibilityValue);

        String contactIdsValue = params.getContactIds();
        distributionList.setContactIds(contactIdsValue);

        String userIdsValue = params.getUserIds();
        distributionList.setUserIds(userIdsValue);

        String distListIdsValue = params.getDistListIds();
        distributionList.setDistListIds(distListIdsValue);

        String typeValue = params.getType();
        distributionList.setType(typeValue);

        String rulesValue = params.getRules();
        distributionList.setRules(rulesValue);

        DistributionListUpdateRequest request = new DistributionListUpdateRequest(workspaceId, xApiKey, contentType, accept, distributionlistId, distributionList);

        // Ensure to include all of the 'optionalParams' that are passed

        request.execute();
    }
}
