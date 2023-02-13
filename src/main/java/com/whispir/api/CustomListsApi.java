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
import com.whispir.model.CustomList;
import com.whispir.model.CustomListCollection;

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

public class CustomListsApi {
    private static ApiClient localVarApiClient = Configuration.getDefaultApiClient();

    private static okhttp3.Call customListListCall(String xApiKey, String accept, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields, String name, String type, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/customlists";

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

        if (type != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("type", type));
        }

        if (xApiKey != null) {
            localVarHeaderParams.put("X-Api-Key", localVarApiClient.parameterToString(xApiKey));
        }

        if (accept != null) {
            localVarHeaderParams.put("Accept", localVarApiClient.parameterToString(accept));
        }

        final String[] localVarAccepts = {
            "application/vnd.whispir.customlist-v1+json",
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
    private static okhttp3.Call customListListValidateBeforeCall(String xApiKey, String accept, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields, String name, String type, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling customListList(Async)");
        }

        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling customListList(Async)");
        }

        return customListListCall(xApiKey, accept, limit, offset, sortOrder, sortFields, name, type, _callback);
    }

    private static ApiResponse<CustomListCollection> customListListWithHttpInfo(String xApiKey, String accept, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields, String name, String type) throws ApiException {
        okhttp3.Call localVarCall = customListListCall(xApiKey, accept, limit, offset, sortOrder, sortFields, name, type, null);
        Type localVarReturnType = new TypeToken<CustomListCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private static okhttp3.Call customListListAsync(String xApiKey, String accept, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields, String name, String type, final ApiCallback<CustomListCollection> _callback) throws ApiException {
        okhttp3.Call localVarCall = customListListValidateBeforeCall(xApiKey, accept, limit, offset, sortOrder, sortFields, name, type, _callback);
        Type localVarReturnType = new TypeToken<CustomListCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public static class CustomListListParams {
        private BigDecimal limit;
        private BigDecimal offset;
        private String sortOrder;
        private String sortFields;
        private String name;
        private String type;

        private CustomListListParams(
            BigDecimal limit,
            BigDecimal offset,
            String sortOrder,
            String sortFields,
            String name,
            String type
        ){
            this.limit = limit;
            this.offset = offset;
            this.sortOrder = sortOrder;
            this.sortFields = sortFields;
            this.name = name;
            this.type = type;
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
            public String getType() {
                return type;
            }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private BigDecimal limit;
            private BigDecimal offset;
            private String sortOrder;
            private String sortFields;
            private String name;
            private String type;

            public CustomListListParams build() {
                return new CustomListListParams(
                    limit,
                    offset,
                    sortOrder,
                    sortFields,
                    name,
                    type
                );
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
            public Builder setType(String type) {
                this.type = type;
                return this;
            }
        }
        
    }

    public static class CustomListListRequest {
        private final String xApiKey;
        private final String accept;
        private BigDecimal limit;
        private BigDecimal offset;
        private String sortOrder;
        private String sortFields;
        private String name;
        private String type;
        ApiResponse _lastResponse;

        private CustomListListRequest(String xApiKey, String accept) {
            this.xApiKey = xApiKey;
            this.accept = accept;
        }

        /**
         * Set limit
         * @param limit The number of records to be returned. (optional, default to 20)
         * @return APIcustomListListRequest
         */
        public CustomListListRequest limit(BigDecimal limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Set offset
         * @param offset The record number to start returning from. (optional, default to 0)
         * @return APIcustomListListRequest
         */
        public CustomListListRequest offset(BigDecimal offset) {
            this.offset = offset;
            return this;
        }

        /**
         * Set sortOrder
         * @param sortOrder The order in which you require the results to be returned. Either ‘asc’ or ‘desc’ (optional)
         * @return APIcustomListListRequest
         */
        public CustomListListRequest sortOrder(String sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * Set sortFields
         * @param sortFields The fields that you require the ordering to be performed on. Multiple fields can be provided, separated by a comma. (optional)
         * @return APIcustomListListRequest
         */
        public CustomListListRequest sortFields(String sortFields) {
            this.sortFields = sortFields;
            return this;
        }

        /**
         * Set name
         * @param name Enter search name Eg.Category (optional)
         * @return APIcustomListListRequest
         */
        public CustomListListRequest name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Set type
         * @param type Enter search type Eg.Message (optional)
         * @return APIcustomListListRequest
         */
        public CustomListListRequest type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Build call for customListList
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return customListListCall(xApiKey, accept, limit, offset, sortOrder, sortFields, name, type, _callback);
        }

        /**
         * Execute customListList request
         * @return CustomListCollection
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public CustomListCollection execute() throws ApiException {
            ApiResponse<CustomListCollection> localVarResp = customListListWithHttpInfo(xApiKey, accept, limit, offset, sortOrder, sortFields, name, type);
            _lastResponse = localVarResp;
            CustomListCollection data = localVarResp.getData();

            
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
         * Execute customListList request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<CustomListCollection> _callback) throws ApiException {
            return customListListAsync(xApiKey, accept, limit, offset, sortOrder, sortFields, name, type, _callback);
        }
    }

    /**
     * List custom lists
     * @param params The param instance required to create CustomListListRequest
     * @return CustomListCollection
     */

    public static CustomListCollection list(Map<String, Object> params) throws ApiException {
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
        String type = null;
        if(params.containsKey("type") && params.get("type") != null){
            type = (String) params.get("type");
        }
        CustomListListParams tempParams = CustomListListParams.builder()
            .setLimit(limit)
            .setOffset(offset)
            .setSortOrder(sortOrder)
            .setSortFields(sortFields)
            .setName(name)
            .setType(type).build();

        return list(tempParams);
    }

    public static CustomListCollection list(CustomListListParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }


        String accept = "application/vnd.whispir.customlist-v1+json";

        CustomListListRequest request = new CustomListListRequest(xApiKey, accept);

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
        if(params.type != null){
            String type = params.getType();
            request.type(type);
        }

        return request.execute();
    }
    private static okhttp3.Call customListRetrieveCall(String xApiKey, String accept, String customlistId, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/customlists/{customlistId}"
            .replace("{" + "customlistId" + "}", localVarApiClient.escapeString(customlistId.toString()));

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
            "application/vnd.whispir.customlist-v1+json",
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
    private static okhttp3.Call customListRetrieveValidateBeforeCall(String xApiKey, String accept, String customlistId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling customListRetrieve(Async)");
        }

        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling customListRetrieve(Async)");
        }

        // verify the required parameter 'customlistId' is set
        if (customlistId == null) {
            throw new ApiException("Missing the required parameter 'customlistId' when calling customListRetrieve(Async)");
        }

        return customListRetrieveCall(xApiKey, accept, customlistId, _callback);
    }

    private static ApiResponse<CustomList> customListRetrieveWithHttpInfo(String xApiKey, String accept, String customlistId) throws ApiException {
        okhttp3.Call localVarCall = customListRetrieveCall(xApiKey, accept, customlistId, null);
        Type localVarReturnType = new TypeToken<CustomList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private static okhttp3.Call customListRetrieveAsync(String xApiKey, String accept, String customlistId, final ApiCallback<CustomList> _callback) throws ApiException {
        okhttp3.Call localVarCall = customListRetrieveValidateBeforeCall(xApiKey, accept, customlistId, _callback);
        Type localVarReturnType = new TypeToken<CustomList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public static class CustomListRetrieveParams {
        private String customlistId;

        private CustomListRetrieveParams(
            String customlistId
        ){
            this.customlistId = customlistId;
        }
            public String getCustomlistId() {
                return customlistId;
            }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private String customlistId;

            public CustomListRetrieveParams build() {
                return new CustomListRetrieveParams(
                    customlistId
                );
            }

            public Builder setCustomlistId(String customlistId) {
                this.customlistId = customlistId;
                return this;
            }
        }
        
    }

    public static class CustomListRetrieveRequest {
        private final String xApiKey;
        private final String accept;
        private final String customlistId;
        ApiResponse _lastResponse;

        private CustomListRetrieveRequest(String xApiKey, String accept, String customlistId) {
            this.xApiKey = xApiKey;
            this.accept = accept;
            this.customlistId = customlistId;
        }

        /**
         * Build call for customListRetrieve
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return customListRetrieveCall(xApiKey, accept, customlistId, _callback);
        }

        /**
         * Execute customListRetrieve request
         * @return CustomList
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public CustomList execute() throws ApiException {
            ApiResponse<CustomList> localVarResp = customListRetrieveWithHttpInfo(xApiKey, accept, customlistId);
            _lastResponse = localVarResp;
            CustomList data = localVarResp.getData();

            
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
         * Execute customListRetrieve request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<CustomList> _callback) throws ApiException {
            return customListRetrieveAsync(xApiKey, accept, customlistId, _callback);
        }
    }

    /**
     * Retrieve a custom list
     * @param params The param instance required to create CustomListRetrieveRequest
     * @return CustomList
     */

    public static CustomList retrieve(Map<String, Object> params) throws ApiException {
        String customlistId = (String) params.get("customlistId");

        if(customlistId == null || customlistId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'customlistId'");
        }
        CustomListRetrieveParams tempParams = CustomListRetrieveParams.builder()
            .setCustomlistId(customlistId).build();

        return retrieve(tempParams);
    }

    public static CustomList retrieve(CustomListRetrieveParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }


        String accept = "application/vnd.whispir.customlist-v1+json";


        String customlistId = params.getCustomlistId();

        if(customlistId == null || customlistId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'customlistId'");
        }
        CustomListRetrieveRequest request = new CustomListRetrieveRequest(xApiKey, accept, customlistId);

        // Ensure to include all of the 'optionalParams' that are passed

        return request.execute();
    }
}
