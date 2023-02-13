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
import com.whispir.model.Resource;
import com.whispir.model.ResourceCollection;

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

public class ResourcesApi {
    private static ApiClient localVarApiClient = Configuration.getDefaultApiClient();

    private static okhttp3.Call resourceCreateCall(String workspaceId, String xApiKey, String contentType, String accept, Resource resource, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = resource;

        // create path and map variables
        String localVarPath = "/workspaces/{workspaceId}/resources"
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
            "application/vnd.whispir.resource-v1+json",
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/vnd.whispir.resource-v1+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth", "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private static okhttp3.Call resourceCreateValidateBeforeCall(String workspaceId, String xApiKey, String contentType, String accept, Resource resource, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'workspaceId' is set
        if (workspaceId == null) {
            throw new ApiException("Missing the required parameter 'workspaceId' when calling resourceCreate(Async)");
        }

        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling resourceCreate(Async)");
        }

        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new ApiException("Missing the required parameter 'contentType' when calling resourceCreate(Async)");
        }

        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling resourceCreate(Async)");
        }

        // verify the required parameter 'resource' is set
        if (resource == null) {
            throw new ApiException("Missing the required parameter 'resource' when calling resourceCreate(Async)");
        }

        return resourceCreateCall(workspaceId, xApiKey, contentType, accept, resource, _callback);
    }

    private static ApiResponse<Resource> resourceCreateWithHttpInfo(String workspaceId, String xApiKey, String contentType, String accept, Resource resource) throws ApiException {
        okhttp3.Call localVarCall = resourceCreateCall(workspaceId, xApiKey, contentType, accept, resource, null);
        Type localVarReturnType = new TypeToken<Resource>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private static okhttp3.Call resourceCreateAsync(String workspaceId, String xApiKey, String contentType, String accept, Resource resource, final ApiCallback<Resource> _callback) throws ApiException {
        okhttp3.Call localVarCall = resourceCreateValidateBeforeCall(workspaceId, xApiKey, contentType, accept, resource, _callback);
        Type localVarReturnType = new TypeToken<Resource>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public static class ResourceCreateParams {
        private String workspaceId;
        private Resource resource;
        private String name;
        private String scope;
        private String mimeType;
        private String derefUri;

        private ResourceCreateParams(
            String workspaceId,
            Resource resource,
            String name,
            String scope,
            String mimeType,
            String derefUri
        ){
            this.workspaceId = workspaceId;
            this.resource = resource;
            this.name = name;
            this.scope = scope;
            this.mimeType = mimeType;
            this.derefUri = derefUri;
        }
            public String getWorkspaceId() {
                return workspaceId;
            }
            public Resource getResource() {
                return resource;
            }
            public String getName() {
                return name;
            }
            public enum ScopeEnum {
            PRIVATE("private"),
            
            PUBLIC("public");
                private String value;
                ScopeEnum(String value){
                    this.value = value;
                }

                public String getValue() {
                    return value;
                }
                
                @Override
                public String toString() {
                    return String.valueOf(value);
                }

                public static ScopeEnum fromValue(String value) {
                    for (ScopeEnum b : ScopeEnum.values()) {
                        if (b.value.equals(value)) {
                            return b;
                        }
                    }
                    throw new IllegalArgumentException("Unexpected value '" + value + "'");
                }

            }
            public String getScope() {
                return scope;
            }
            public String getMimeType() {
                return mimeType;
            }
            public String getDerefUri() {
                return derefUri;
            }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private String workspaceId;
            private Resource resource;
            private String name;
            private String scope;
            private String mimeType;
            private String derefUri;

            public ResourceCreateParams build() {
                return new ResourceCreateParams(
                    workspaceId,
                    resource,
                    name,
                    scope,
                    mimeType,
                    derefUri
                );
            }

            public Builder setWorkspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }
            public Builder setResource(Resource resource) {
                this.resource = resource;
                return this;
            }
            public Builder setName(String name) {
                this.name = name;
                return this;
            }
            public Builder setScope(ScopeEnum scope) {
                this.scope = scope.getValue();
                return this;
            }
            public Builder setMimeType(String mimeType) {
                this.mimeType = mimeType;
                return this;
            }
            public Builder setDerefUri(String derefUri) {
                this.derefUri = derefUri;
                return this;
            }
        }
        

    }

    public static class ResourceCreateRequest {
        private final String workspaceId;
        private final String xApiKey;
        private final String contentType;
        private final String accept;
        private final Resource resource;
        ApiResponse _lastResponse;

        private ResourceCreateRequest(String workspaceId, String xApiKey, String contentType, String accept, Resource resource) {
            this.workspaceId = workspaceId;
            this.xApiKey = xApiKey;
            this.contentType = contentType;
            this.accept = accept;
            this.resource = resource;
        }

        /**
         * Build call for resourceCreate
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return resourceCreateCall(workspaceId, xApiKey, contentType, accept, resource, _callback);
        }

        /**
         * Execute resourceCreate request
         * @return Resource
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public Resource execute() throws ApiException {
            ApiResponse<Resource> localVarResp = resourceCreateWithHttpInfo(workspaceId, xApiKey, contentType, accept, resource);
            _lastResponse = localVarResp;
            Resource data = localVarResp.getData();

            
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
         * Execute resourceCreate request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<Resource> _callback) throws ApiException {
            return resourceCreateAsync(workspaceId, xApiKey, contentType, accept, resource, _callback);
        }
    }

    /**
     * Create a resource
     * @param params The param instance required to create ResourceCreateRequest
     * @return Resource
     */

    public static Resource create(Map<String, Object> params) throws ApiException {
        String workspaceId = (String) params.get("workspaceId");

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }
        String nameValue = (String) params.get("name");
        if(nameValue == null) {
            throw new ApiException("Missing the required property value of 'name'");
        }
        com.whispir.api.ResourcesApi.ResourceCreateParams.ScopeEnum scopeValue = com.whispir.api.ResourcesApi.ResourceCreateParams.ScopeEnum.valueOf((String) params.get("scope"));
        if(scopeValue == null) {
            throw new ApiException("Missing the required property value of 'scope'");
        }
        String mimeTypeValue = (String) params.get("mimeType");
        if(mimeTypeValue == null) {
            throw new ApiException("Missing the required property value of 'mimeType'");
        }
        String derefUriValue = (String) params.get("derefUri");
        if(derefUriValue == null) {
            throw new ApiException("Missing the required property value of 'derefUri'");
        }
        ResourceCreateParams tempParams = ResourceCreateParams.builder()
            .setWorkspaceId(workspaceId)
            .setName(nameValue)
            .setScope(scopeValue)
            .setMimeType(mimeTypeValue)
            .setDerefUri(derefUriValue).build();

        return create(tempParams);
    }

    public static Resource create(ResourceCreateParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }


        String workspaceId = params.getWorkspaceId();

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }

        String contentType = "application/vnd.whispir.resource-v1+json";

        String accept = "application/vnd.whispir.resource-v1+json";


        // Constructing 'Resource' from 'ResourceCreateParams' instance passed
        Resource resource = new Resource();
        String nameValue = params.getName();
        if(nameValue == null) {
            throw new ApiException("Missing the required property value of 'name'");
        }
        resource.setName(nameValue);

        String scopeValue = params.getScope();
        if(scopeValue == null) {
            throw new ApiException("Missing the required property value of 'scope'");
        }
        resource.setScope(scopeValue);

        String mimeTypeValue = params.getMimeType();
        if(mimeTypeValue == null) {
            throw new ApiException("Missing the required property value of 'mimeType'");
        }
        resource.setMimeType(mimeTypeValue);

        String derefUriValue = params.getDerefUri();
        if(derefUriValue == null) {
            throw new ApiException("Missing the required property value of 'derefUri'");
        }
        resource.setDerefUri(derefUriValue);

        ResourceCreateRequest request = new ResourceCreateRequest(workspaceId, xApiKey, contentType, accept, resource);

        // Ensure to include all of the 'optionalParams' that are passed

        return request.execute();
    }
    private static okhttp3.Call resourceDeleteCall(String workspaceId, String xApiKey, String resourceId, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/workspaces/{workspaceId}/resources/{resourceId}"
            .replace("{" + "workspaceId" + "}", localVarApiClient.escapeString(workspaceId.toString()))
            .replace("{" + "resourceId" + "}", localVarApiClient.escapeString(resourceId.toString()));

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
    private static okhttp3.Call resourceDeleteValidateBeforeCall(String workspaceId, String xApiKey, String resourceId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'workspaceId' is set
        if (workspaceId == null) {
            throw new ApiException("Missing the required parameter 'workspaceId' when calling resourceDelete(Async)");
        }

        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling resourceDelete(Async)");
        }

        // verify the required parameter 'resourceId' is set
        if (resourceId == null) {
            throw new ApiException("Missing the required parameter 'resourceId' when calling resourceDelete(Async)");
        }

        return resourceDeleteCall(workspaceId, xApiKey, resourceId, _callback);
    }

    private static ApiResponse<Void> resourceDeleteWithHttpInfo(String workspaceId, String xApiKey, String resourceId) throws ApiException {
        okhttp3.Call localVarCall = resourceDeleteCall(workspaceId, xApiKey, resourceId, null);
        return localVarApiClient.execute(localVarCall);
    }

    private static okhttp3.Call resourceDeleteAsync(String workspaceId, String xApiKey, String resourceId, final ApiCallback<Void> _callback) throws ApiException {
        okhttp3.Call localVarCall = resourceDeleteValidateBeforeCall(workspaceId, xApiKey, resourceId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public static class ResourceDeleteParams {
        private String workspaceId;
        private String resourceId;

        private ResourceDeleteParams(
            String workspaceId,
            String resourceId
        ){
            this.workspaceId = workspaceId;
            this.resourceId = resourceId;
        }
            public String getWorkspaceId() {
                return workspaceId;
            }
            public String getResourceId() {
                return resourceId;
            }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private String workspaceId;
            private String resourceId;

            public ResourceDeleteParams build() {
                return new ResourceDeleteParams(
                    workspaceId,
                    resourceId
                );
            }

            public Builder setWorkspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }
            public Builder setResourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }
        }
        
    }

    public static class ResourceDeleteRequest {
        private final String workspaceId;
        private final String xApiKey;
        private final String resourceId;
        ApiResponse _lastResponse;

        private ResourceDeleteRequest(String workspaceId, String xApiKey, String resourceId) {
            this.workspaceId = workspaceId;
            this.xApiKey = xApiKey;
            this.resourceId = resourceId;
        }

        /**
         * Build call for resourceDelete
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return resourceDeleteCall(workspaceId, xApiKey, resourceId, _callback);
        }

        /**
         * Execute resourceDelete request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public void execute() throws ApiException {
            resourceDeleteWithHttpInfo(workspaceId, xApiKey, resourceId);
        }
        /**
         * Return the last executed API response
         * @return ApiResponse
         */
        public ApiResponse getLastResponse()  {
            return _lastResponse;
        }


        /**
         * Execute resourceDelete request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return resourceDeleteAsync(workspaceId, xApiKey, resourceId, _callback);
        }
    }

    /**
     * Delete a resource
     * @param params The param instance required to create ResourceDeleteRequest
     * @return void
     */

    public static void delete(Map<String, Object> params) throws ApiException {
        String workspaceId = (String) params.get("workspaceId");

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }
        String resourceId = (String) params.get("resourceId");

        if(resourceId == null || resourceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'resourceId'");
        }
        ResourceDeleteParams tempParams = ResourceDeleteParams.builder()
            .setWorkspaceId(workspaceId)
            .setResourceId(resourceId).build();

        delete(tempParams);
    }

    public static void delete(ResourceDeleteParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }


        String workspaceId = params.getWorkspaceId();

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }


        String resourceId = params.getResourceId();

        if(resourceId == null || resourceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'resourceId'");
        }
        ResourceDeleteRequest request = new ResourceDeleteRequest(workspaceId, xApiKey, resourceId);

        // Ensure to include all of the 'optionalParams' that are passed

        request.execute();
    }
    private static okhttp3.Call resourceListCall(String workspaceId, String xApiKey, String accept, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields, String scope, String name, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/workspaces/{workspaceId}/resources"
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

        if (scope != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("scope", scope));
        }

        if (name != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("name", name));
        }

        if (xApiKey != null) {
            localVarHeaderParams.put("X-Api-Key", localVarApiClient.parameterToString(xApiKey));
        }

        if (accept != null) {
            localVarHeaderParams.put("Accept", localVarApiClient.parameterToString(accept));
        }

        final String[] localVarAccepts = {
            "application/vnd.whispir.resource-v1+json",
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
    private static okhttp3.Call resourceListValidateBeforeCall(String workspaceId, String xApiKey, String accept, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields, String scope, String name, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'workspaceId' is set
        if (workspaceId == null) {
            throw new ApiException("Missing the required parameter 'workspaceId' when calling resourceList(Async)");
        }

        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling resourceList(Async)");
        }

        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling resourceList(Async)");
        }

        return resourceListCall(workspaceId, xApiKey, accept, limit, offset, sortOrder, sortFields, scope, name, _callback);
    }

    private static ApiResponse<ResourceCollection> resourceListWithHttpInfo(String workspaceId, String xApiKey, String accept, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields, String scope, String name) throws ApiException {
        okhttp3.Call localVarCall = resourceListCall(workspaceId, xApiKey, accept, limit, offset, sortOrder, sortFields, scope, name, null);
        Type localVarReturnType = new TypeToken<ResourceCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private static okhttp3.Call resourceListAsync(String workspaceId, String xApiKey, String accept, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields, String scope, String name, final ApiCallback<ResourceCollection> _callback) throws ApiException {
        okhttp3.Call localVarCall = resourceListValidateBeforeCall(workspaceId, xApiKey, accept, limit, offset, sortOrder, sortFields, scope, name, _callback);
        Type localVarReturnType = new TypeToken<ResourceCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public static class ResourceListParams {
        private String workspaceId;
        private BigDecimal limit;
        private BigDecimal offset;
        private String sortOrder;
        private String sortFields;
        private String scope;
        private String name;

        private ResourceListParams(
            String workspaceId,
            BigDecimal limit,
            BigDecimal offset,
            String sortOrder,
            String sortFields,
            String scope,
            String name
        ){
            this.workspaceId = workspaceId;
            this.limit = limit;
            this.offset = offset;
            this.sortOrder = sortOrder;
            this.sortFields = sortFields;
            this.scope = scope;
            this.name = name;
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
            public String getScope() {
                return scope;
            }
            public String getName() {
                return name;
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
            private String scope;
            private String name;

            public ResourceListParams build() {
                return new ResourceListParams(
                    workspaceId,
                    limit,
                    offset,
                    sortOrder,
                    sortFields,
                    scope,
                    name
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
            public Builder setScope(String scope) {
                this.scope = scope;
                return this;
            }
            public Builder setName(String name) {
                this.name = name;
                return this;
            }
        }
        
    }

    public static class ResourceListRequest {
        private final String workspaceId;
        private final String xApiKey;
        private final String accept;
        private BigDecimal limit;
        private BigDecimal offset;
        private String sortOrder;
        private String sortFields;
        private String scope;
        private String name;
        ApiResponse _lastResponse;

        private ResourceListRequest(String workspaceId, String xApiKey, String accept) {
            this.workspaceId = workspaceId;
            this.xApiKey = xApiKey;
            this.accept = accept;
        }

        /**
         * Set limit
         * @param limit The number of records to be returned. (optional, default to 20)
         * @return APIresourceListRequest
         */
        public ResourceListRequest limit(BigDecimal limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Set offset
         * @param offset The record number to start returning from. (optional, default to 0)
         * @return APIresourceListRequest
         */
        public ResourceListRequest offset(BigDecimal offset) {
            this.offset = offset;
            return this;
        }

        /**
         * Set sortOrder
         * @param sortOrder The order in which you require the results to be returned. Either ‘asc’ or ‘desc’ (optional)
         * @return APIresourceListRequest
         */
        public ResourceListRequest sortOrder(String sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * Set sortFields
         * @param sortFields The fields that you require the ordering to be performed on. Multiple fields can be provided, separated by a comma. (optional)
         * @return APIresourceListRequest
         */
        public ResourceListRequest sortFields(String sortFields) {
            this.sortFields = sortFields;
            return this;
        }

        /**
         * Set scope
         * @param scope A filter parameter for the visibility of the resource. (optional)
         * @return APIresourceListRequest
         */
        public ResourceListRequest scope(String scope) {
            this.scope = scope;
            return this;
        }

        /**
         * Set name
         * @param name A filter parameter for the name of the resource. (optional)
         * @return APIresourceListRequest
         */
        public ResourceListRequest name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Build call for resourceList
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return resourceListCall(workspaceId, xApiKey, accept, limit, offset, sortOrder, sortFields, scope, name, _callback);
        }

        /**
         * Execute resourceList request
         * @return ResourceCollection
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public ResourceCollection execute() throws ApiException {
            ApiResponse<ResourceCollection> localVarResp = resourceListWithHttpInfo(workspaceId, xApiKey, accept, limit, offset, sortOrder, sortFields, scope, name);
            _lastResponse = localVarResp;
            ResourceCollection data = localVarResp.getData();

            
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
         * Execute resourceList request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<ResourceCollection> _callback) throws ApiException {
            return resourceListAsync(workspaceId, xApiKey, accept, limit, offset, sortOrder, sortFields, scope, name, _callback);
        }
    }

    /**
     * List resources
     * @param params The param instance required to create ResourceListRequest
     * @return ResourceCollection
     */

    public static ResourceCollection list(Map<String, Object> params) throws ApiException {
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
        String scope = null;
        if(params.containsKey("scope") && params.get("scope") != null){
            scope = (String) params.get("scope");
        }
        String name = null;
        if(params.containsKey("name") && params.get("name") != null){
            name = (String) params.get("name");
        }
        String workspaceId = (String) params.get("workspaceId");

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }
        ResourceListParams tempParams = ResourceListParams.builder()
            .setWorkspaceId(workspaceId)
            .setLimit(limit)
            .setOffset(offset)
            .setSortOrder(sortOrder)
            .setSortFields(sortFields)
            .setScope(scope)
            .setName(name).build();

        return list(tempParams);
    }

    public static ResourceCollection list(ResourceListParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }


        String workspaceId = params.getWorkspaceId();

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }

        String accept = "application/vnd.whispir.resource-v1+json";

        ResourceListRequest request = new ResourceListRequest(workspaceId, xApiKey, accept);

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
        if(params.scope != null){
            String scope = params.getScope();
            request.scope(scope);
        }
        if(params.name != null){
            String name = params.getName();
            request.name(name);
        }

        return request.execute();
    }
    private static okhttp3.Call resourceRetrieveCall(String workspaceId, String xApiKey, String accept, String resourceId, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/workspaces/{workspaceId}/resources/{resourceId}"
            .replace("{" + "workspaceId" + "}", localVarApiClient.escapeString(workspaceId.toString()))
            .replace("{" + "resourceId" + "}", localVarApiClient.escapeString(resourceId.toString()));

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
            "application/vnd.whispir.resource-v1+json",
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
    private static okhttp3.Call resourceRetrieveValidateBeforeCall(String workspaceId, String xApiKey, String accept, String resourceId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'workspaceId' is set
        if (workspaceId == null) {
            throw new ApiException("Missing the required parameter 'workspaceId' when calling resourceRetrieve(Async)");
        }

        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling resourceRetrieve(Async)");
        }

        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling resourceRetrieve(Async)");
        }

        // verify the required parameter 'resourceId' is set
        if (resourceId == null) {
            throw new ApiException("Missing the required parameter 'resourceId' when calling resourceRetrieve(Async)");
        }

        return resourceRetrieveCall(workspaceId, xApiKey, accept, resourceId, _callback);
    }

    private static ApiResponse<Resource> resourceRetrieveWithHttpInfo(String workspaceId, String xApiKey, String accept, String resourceId) throws ApiException {
        okhttp3.Call localVarCall = resourceRetrieveCall(workspaceId, xApiKey, accept, resourceId, null);
        Type localVarReturnType = new TypeToken<Resource>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private static okhttp3.Call resourceRetrieveAsync(String workspaceId, String xApiKey, String accept, String resourceId, final ApiCallback<Resource> _callback) throws ApiException {
        okhttp3.Call localVarCall = resourceRetrieveValidateBeforeCall(workspaceId, xApiKey, accept, resourceId, _callback);
        Type localVarReturnType = new TypeToken<Resource>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public static class ResourceRetrieveParams {
        private String workspaceId;
        private String resourceId;

        private ResourceRetrieveParams(
            String workspaceId,
            String resourceId
        ){
            this.workspaceId = workspaceId;
            this.resourceId = resourceId;
        }
            public String getWorkspaceId() {
                return workspaceId;
            }
            public String getResourceId() {
                return resourceId;
            }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private String workspaceId;
            private String resourceId;

            public ResourceRetrieveParams build() {
                return new ResourceRetrieveParams(
                    workspaceId,
                    resourceId
                );
            }

            public Builder setWorkspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }
            public Builder setResourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }
        }
        
    }

    public static class ResourceRetrieveRequest {
        private final String workspaceId;
        private final String xApiKey;
        private final String accept;
        private final String resourceId;
        ApiResponse _lastResponse;

        private ResourceRetrieveRequest(String workspaceId, String xApiKey, String accept, String resourceId) {
            this.workspaceId = workspaceId;
            this.xApiKey = xApiKey;
            this.accept = accept;
            this.resourceId = resourceId;
        }

        /**
         * Build call for resourceRetrieve
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return resourceRetrieveCall(workspaceId, xApiKey, accept, resourceId, _callback);
        }

        /**
         * Execute resourceRetrieve request
         * @return Resource
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public Resource execute() throws ApiException {
            ApiResponse<Resource> localVarResp = resourceRetrieveWithHttpInfo(workspaceId, xApiKey, accept, resourceId);
            _lastResponse = localVarResp;
            Resource data = localVarResp.getData();

            
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
         * Execute resourceRetrieve request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<Resource> _callback) throws ApiException {
            return resourceRetrieveAsync(workspaceId, xApiKey, accept, resourceId, _callback);
        }
    }

    /**
     * Retrieve a resource
     * @param params The param instance required to create ResourceRetrieveRequest
     * @return Resource
     */

    public static Resource retrieve(Map<String, Object> params) throws ApiException {
        String workspaceId = (String) params.get("workspaceId");

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }
        String resourceId = (String) params.get("resourceId");

        if(resourceId == null || resourceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'resourceId'");
        }
        ResourceRetrieveParams tempParams = ResourceRetrieveParams.builder()
            .setWorkspaceId(workspaceId)
            .setResourceId(resourceId).build();

        return retrieve(tempParams);
    }

    public static Resource retrieve(ResourceRetrieveParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }


        String workspaceId = params.getWorkspaceId();

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }

        String accept = "application/vnd.whispir.resource-v1+json";


        String resourceId = params.getResourceId();

        if(resourceId == null || resourceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'resourceId'");
        }
        ResourceRetrieveRequest request = new ResourceRetrieveRequest(workspaceId, xApiKey, accept, resourceId);

        // Ensure to include all of the 'optionalParams' that are passed

        return request.execute();
    }
    private static okhttp3.Call resourceUpdateCall(String workspaceId, String xApiKey, String contentType, String accept, String resourceId, Resource resource, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = resource;

        // create path and map variables
        String localVarPath = "/workspaces/{workspaceId}/resources/{resourceId}"
            .replace("{" + "workspaceId" + "}", localVarApiClient.escapeString(workspaceId.toString()))
            .replace("{" + "resourceId" + "}", localVarApiClient.escapeString(resourceId.toString()));

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
            "application/vnd.whispir.resource-v1+json",
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/vnd.whispir.resource-v1+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth", "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private static okhttp3.Call resourceUpdateValidateBeforeCall(String workspaceId, String xApiKey, String contentType, String accept, String resourceId, Resource resource, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'workspaceId' is set
        if (workspaceId == null) {
            throw new ApiException("Missing the required parameter 'workspaceId' when calling resourceUpdate(Async)");
        }

        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling resourceUpdate(Async)");
        }

        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new ApiException("Missing the required parameter 'contentType' when calling resourceUpdate(Async)");
        }

        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling resourceUpdate(Async)");
        }

        // verify the required parameter 'resourceId' is set
        if (resourceId == null) {
            throw new ApiException("Missing the required parameter 'resourceId' when calling resourceUpdate(Async)");
        }

        // verify the required parameter 'resource' is set
        if (resource == null) {
            throw new ApiException("Missing the required parameter 'resource' when calling resourceUpdate(Async)");
        }

        return resourceUpdateCall(workspaceId, xApiKey, contentType, accept, resourceId, resource, _callback);
    }

    private static ApiResponse<Resource> resourceUpdateWithHttpInfo(String workspaceId, String xApiKey, String contentType, String accept, String resourceId, Resource resource) throws ApiException {
        okhttp3.Call localVarCall = resourceUpdateCall(workspaceId, xApiKey, contentType, accept, resourceId, resource, null);
        Type localVarReturnType = new TypeToken<Resource>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private static okhttp3.Call resourceUpdateAsync(String workspaceId, String xApiKey, String contentType, String accept, String resourceId, Resource resource, final ApiCallback<Resource> _callback) throws ApiException {
        okhttp3.Call localVarCall = resourceUpdateValidateBeforeCall(workspaceId, xApiKey, contentType, accept, resourceId, resource, _callback);
        Type localVarReturnType = new TypeToken<Resource>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public static class ResourceUpdateParams {
        private String workspaceId;
        private String resourceId;
        private Resource resource;
        private String name;
        private String scope;
        private String mimeType;
        private String derefUri;

        private ResourceUpdateParams(
            String workspaceId,
            String resourceId,
            Resource resource,
            String name,
            String scope,
            String mimeType,
            String derefUri
        ){
            this.workspaceId = workspaceId;
            this.resourceId = resourceId;
            this.resource = resource;
            this.name = name;
            this.scope = scope;
            this.mimeType = mimeType;
            this.derefUri = derefUri;
        }
            public String getWorkspaceId() {
                return workspaceId;
            }
            public String getResourceId() {
                return resourceId;
            }
            public Resource getResource() {
                return resource;
            }
            public String getName() {
                return name;
            }
            public enum ScopeEnum {
            PRIVATE("private"),
            
            PUBLIC("public");
                private String value;
                ScopeEnum(String value){
                    this.value = value;
                }

                public String getValue() {
                    return value;
                }
                
                @Override
                public String toString() {
                    return String.valueOf(value);
                }

                public static ScopeEnum fromValue(String value) {
                    for (ScopeEnum b : ScopeEnum.values()) {
                        if (b.value.equals(value)) {
                            return b;
                        }
                    }
                    throw new IllegalArgumentException("Unexpected value '" + value + "'");
                }

            }
            public String getScope() {
                return scope;
            }
            public String getMimeType() {
                return mimeType;
            }
            public String getDerefUri() {
                return derefUri;
            }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private String workspaceId;
            private String resourceId;
            private Resource resource;
            private String name;
            private String scope;
            private String mimeType;
            private String derefUri;

            public ResourceUpdateParams build() {
                return new ResourceUpdateParams(
                    workspaceId,
                    resourceId,
                    resource,
                    name,
                    scope,
                    mimeType,
                    derefUri
                );
            }

            public Builder setWorkspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }
            public Builder setResourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }
            public Builder setResource(Resource resource) {
                this.resource = resource;
                return this;
            }
            public Builder setName(String name) {
                this.name = name;
                return this;
            }
            public Builder setScope(ScopeEnum scope) {
                this.scope = scope.getValue();
                return this;
            }
            public Builder setMimeType(String mimeType) {
                this.mimeType = mimeType;
                return this;
            }
            public Builder setDerefUri(String derefUri) {
                this.derefUri = derefUri;
                return this;
            }
        }
        

    }

    public static class ResourceUpdateRequest {
        private final String workspaceId;
        private final String xApiKey;
        private final String contentType;
        private final String accept;
        private final String resourceId;
        private final Resource resource;
        ApiResponse _lastResponse;

        private ResourceUpdateRequest(String workspaceId, String xApiKey, String contentType, String accept, String resourceId, Resource resource) {
            this.workspaceId = workspaceId;
            this.xApiKey = xApiKey;
            this.contentType = contentType;
            this.accept = accept;
            this.resourceId = resourceId;
            this.resource = resource;
        }

        /**
         * Build call for resourceUpdate
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return resourceUpdateCall(workspaceId, xApiKey, contentType, accept, resourceId, resource, _callback);
        }

        /**
         * Execute resourceUpdate request
         * @return Resource
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public Resource execute() throws ApiException {
            ApiResponse<Resource> localVarResp = resourceUpdateWithHttpInfo(workspaceId, xApiKey, contentType, accept, resourceId, resource);
            _lastResponse = localVarResp;
            Resource data = localVarResp.getData();

            
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
         * Execute resourceUpdate request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<Resource> _callback) throws ApiException {
            return resourceUpdateAsync(workspaceId, xApiKey, contentType, accept, resourceId, resource, _callback);
        }
    }

    /**
     * Update a resource
     * @param params The param instance required to create ResourceUpdateRequest
     * @return Resource
     */

    public static Resource update(Map<String, Object> params) throws ApiException {
        String workspaceId = (String) params.get("workspaceId");

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }
        String resourceId = (String) params.get("resourceId");

        if(resourceId == null || resourceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'resourceId'");
        }
        String nameValue = (String) params.get("name");
        if(nameValue == null) {
            throw new ApiException("Missing the required property value of 'name'");
        }
        com.whispir.api.ResourcesApi.ResourceUpdateParams.ScopeEnum scopeValue = com.whispir.api.ResourcesApi.ResourceUpdateParams.ScopeEnum.valueOf((String) params.get("scope"));
        if(scopeValue == null) {
            throw new ApiException("Missing the required property value of 'scope'");
        }
        String mimeTypeValue = (String) params.get("mimeType");
        if(mimeTypeValue == null) {
            throw new ApiException("Missing the required property value of 'mimeType'");
        }
        String derefUriValue = (String) params.get("derefUri");
        if(derefUriValue == null) {
            throw new ApiException("Missing the required property value of 'derefUri'");
        }
        ResourceUpdateParams tempParams = ResourceUpdateParams.builder()
            .setWorkspaceId(workspaceId)
            .setResourceId(resourceId)
            .setName(nameValue)
            .setScope(scopeValue)
            .setMimeType(mimeTypeValue)
            .setDerefUri(derefUriValue).build();

        return update(tempParams);
    }

    public static Resource update(ResourceUpdateParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }


        String workspaceId = params.getWorkspaceId();

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }

        String contentType = "application/vnd.whispir.resource-v1+json";

        String accept = "application/vnd.whispir.resource-v1+json";


        String resourceId = params.getResourceId();

        if(resourceId == null || resourceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'resourceId'");
        }

        // Constructing 'Resource' from 'ResourceUpdateParams' instance passed
        Resource resource = new Resource();
        String nameValue = params.getName();
        if(nameValue == null) {
            throw new ApiException("Missing the required property value of 'name'");
        }
        resource.setName(nameValue);

        String scopeValue = params.getScope();
        if(scopeValue == null) {
            throw new ApiException("Missing the required property value of 'scope'");
        }
        resource.setScope(scopeValue);

        String mimeTypeValue = params.getMimeType();
        if(mimeTypeValue == null) {
            throw new ApiException("Missing the required property value of 'mimeType'");
        }
        resource.setMimeType(mimeTypeValue);

        String derefUriValue = params.getDerefUri();
        if(derefUriValue == null) {
            throw new ApiException("Missing the required property value of 'derefUri'");
        }
        resource.setDerefUri(derefUriValue);

        ResourceUpdateRequest request = new ResourceUpdateRequest(workspaceId, xApiKey, contentType, accept, resourceId, resource);

        // Ensure to include all of the 'optionalParams' that are passed

        return request.execute();
    }
}
