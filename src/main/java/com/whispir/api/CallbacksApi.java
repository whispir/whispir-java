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
import com.whispir.model.Callback;
import com.whispir.model.CallbackCall;
import com.whispir.model.CallbackCallCollection;
import com.whispir.model.CallbackCollection;

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

public class CallbacksApi {
    private static ApiClient localVarApiClient = Configuration.getDefaultApiClient();

    private static okhttp3.Call callbackCallListCall(String xApiKey, String callbackId, String accept, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields, String status, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/callbacks/{callbackId}/calls"
            .replace("{" + "callbackId" + "}", localVarApiClient.escapeString(callbackId.toString()));

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

        if (status != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("status", status));
        }

        if (xApiKey != null) {
            localVarHeaderParams.put("X-Api-Key", localVarApiClient.parameterToString(xApiKey));
        }

        if (accept != null) {
            localVarHeaderParams.put("Accept", localVarApiClient.parameterToString(accept));
        }

        final String[] localVarAccepts = {
            "application/vnd.whispir.api-call-v1+json",
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
    private static okhttp3.Call callbackCallListValidateBeforeCall(String xApiKey, String callbackId, String accept, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields, String status, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling callbackCallList(Async)");
        }

        // verify the required parameter 'callbackId' is set
        if (callbackId == null) {
            throw new ApiException("Missing the required parameter 'callbackId' when calling callbackCallList(Async)");
        }

        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling callbackCallList(Async)");
        }

        return callbackCallListCall(xApiKey, callbackId, accept, limit, offset, sortOrder, sortFields, status, _callback);
    }

    private static ApiResponse<CallbackCallCollection> callbackCallListWithHttpInfo(String xApiKey, String callbackId, String accept, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields, String status) throws ApiException {
        okhttp3.Call localVarCall = callbackCallListCall(xApiKey, callbackId, accept, limit, offset, sortOrder, sortFields, status, null);
        Type localVarReturnType = new TypeToken<CallbackCallCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private static okhttp3.Call callbackCallListAsync(String xApiKey, String callbackId, String accept, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields, String status, final ApiCallback<CallbackCallCollection> _callback) throws ApiException {
        okhttp3.Call localVarCall = callbackCallListValidateBeforeCall(xApiKey, callbackId, accept, limit, offset, sortOrder, sortFields, status, _callback);
        Type localVarReturnType = new TypeToken<CallbackCallCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public static class CallbackCallListParams {
        private String callbackId;
        private BigDecimal limit;
        private BigDecimal offset;
        private String sortOrder;
        private String sortFields;
        private String status;

        private CallbackCallListParams(
            String callbackId,
            BigDecimal limit,
            BigDecimal offset,
            String sortOrder,
            String sortFields,
            String status
        ){
            this.callbackId = callbackId;
            this.limit = limit;
            this.offset = offset;
            this.sortOrder = sortOrder;
            this.sortFields = sortFields;
            this.status = status;
        }
            public String getCallbackId() {
                return callbackId;
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
            public String getStatus() {
                return status;
            }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private String callbackId;
            private BigDecimal limit;
            private BigDecimal offset;
            private String sortOrder;
            private String sortFields;
            private String status;

            public CallbackCallListParams build() {
                return new CallbackCallListParams(
                    callbackId,
                    limit,
                    offset,
                    sortOrder,
                    sortFields,
                    status
                );
            }

            public Builder setCallbackId(String callbackId) {
                this.callbackId = callbackId;
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
            public Builder setStatus(String status) {
                this.status = status;
                return this;
            }
        }
        
    }

    public static class CallbackCallListRequest {
        private final String xApiKey;
        private final String callbackId;
        private final String accept;
        private BigDecimal limit;
        private BigDecimal offset;
        private String sortOrder;
        private String sortFields;
        private String status;
        ApiResponse _lastResponse;

        private CallbackCallListRequest(String xApiKey, String callbackId, String accept) {
            this.xApiKey = xApiKey;
            this.callbackId = callbackId;
            this.accept = accept;
        }

        /**
         * Set limit
         * @param limit The number of records to be returned. (optional, default to 20)
         * @return APIcallbackCallListRequest
         */
        public CallbackCallListRequest limit(BigDecimal limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Set offset
         * @param offset The record number to start returning from. (optional, default to 0)
         * @return APIcallbackCallListRequest
         */
        public CallbackCallListRequest offset(BigDecimal offset) {
            this.offset = offset;
            return this;
        }

        /**
         * Set sortOrder
         * @param sortOrder The order in which you require the results to be returned. Either ‘asc’ or ‘desc’ (optional)
         * @return APIcallbackCallListRequest
         */
        public CallbackCallListRequest sortOrder(String sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * Set sortFields
         * @param sortFields The fields that you require the ordering to be performed on. Multiple fields can be provided, separated by a comma. (optional)
         * @return APIcallbackCallListRequest
         */
        public CallbackCallListRequest sortFields(String sortFields) {
            this.sortFields = sortFields;
            return this;
        }

        /**
         * Set status
         * @param status To specifically retrieve the FAILED/SUCCESS calls, one can pass a status query param in the URL. (optional)
         * @return APIcallbackCallListRequest
         */
        public CallbackCallListRequest status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Build call for callbackCallList
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return callbackCallListCall(xApiKey, callbackId, accept, limit, offset, sortOrder, sortFields, status, _callback);
        }

        /**
         * Execute callbackCallList request
         * @return CallbackCallCollection
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public CallbackCallCollection execute() throws ApiException {
            ApiResponse<CallbackCallCollection> localVarResp = callbackCallListWithHttpInfo(xApiKey, callbackId, accept, limit, offset, sortOrder, sortFields, status);
            _lastResponse = localVarResp;
            CallbackCallCollection data = localVarResp.getData();

            
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
         * Execute callbackCallList request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<CallbackCallCollection> _callback) throws ApiException {
            return callbackCallListAsync(xApiKey, callbackId, accept, limit, offset, sortOrder, sortFields, status, _callback);
        }
    }

    /**
     * List callback calls
     * @param params The param instance required to create CallbackCallListRequest
     * @return CallbackCallCollection
     */

    public static CallbackCallCollection listCalls(Map<String, Object> params) throws ApiException {
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
        String status = null;
        if(params.containsKey("status") && params.get("status") != null){
            status = (String) params.get("status");
        }
        String callbackId = (String) params.get("callbackId");

        if(callbackId == null || callbackId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'callbackId'");
        }
        CallbackCallListParams tempParams = CallbackCallListParams.builder()
            .setCallbackId(callbackId)
            .setLimit(limit)
            .setOffset(offset)
            .setSortOrder(sortOrder)
            .setSortFields(sortFields)
            .setStatus(status).build();

        return listCalls(tempParams);
    }

    public static CallbackCallCollection listCalls(CallbackCallListParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }



        String callbackId = params.getCallbackId();

        if(callbackId == null || callbackId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'callbackId'");
        }
        String accept = "application/vnd.whispir.api-call-v1+json";

        CallbackCallListRequest request = new CallbackCallListRequest(xApiKey, callbackId, accept);

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
        if(params.status != null){
            String status = params.getStatus();
            request.status(status);
        }

        return request.execute();
    }
    private static okhttp3.Call callbackCallUpdateCall(String xApiKey, String callbackId, String contentType, String accept, String id, CallbackCall callbackCall, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = callbackCall;

        // create path and map variables
        String localVarPath = "/callbacks/{callbackId}/calls"
            .replace("{" + "callbackId" + "}", localVarApiClient.escapeString(callbackId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarHeaderParams.put("Authorization", String.format("Basic %s", authHeader));
        localVarHeaderParams.put("User-Agent", String.format("whispir-java-%s", Version.VERSION));

        if (id != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("id", id));
        }

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
            "application/vnd.whispir.api-call-v1+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth", "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private static okhttp3.Call callbackCallUpdateValidateBeforeCall(String xApiKey, String callbackId, String contentType, String accept, String id, CallbackCall callbackCall, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling callbackCallUpdate(Async)");
        }

        // verify the required parameter 'callbackId' is set
        if (callbackId == null) {
            throw new ApiException("Missing the required parameter 'callbackId' when calling callbackCallUpdate(Async)");
        }

        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new ApiException("Missing the required parameter 'contentType' when calling callbackCallUpdate(Async)");
        }

        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling callbackCallUpdate(Async)");
        }

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling callbackCallUpdate(Async)");
        }

        return callbackCallUpdateCall(xApiKey, callbackId, contentType, accept, id, callbackCall, _callback);
    }

    private static ApiResponse<Void> callbackCallUpdateWithHttpInfo(String xApiKey, String callbackId, String contentType, String accept, String id, CallbackCall callbackCall) throws ApiException {
        okhttp3.Call localVarCall = callbackCallUpdateCall(xApiKey, callbackId, contentType, accept, id, callbackCall, null);
        return localVarApiClient.execute(localVarCall);
    }

    private static okhttp3.Call callbackCallUpdateAsync(String xApiKey, String callbackId, String contentType, String accept, String id, CallbackCall callbackCall, final ApiCallback<Void> _callback) throws ApiException {
        okhttp3.Call localVarCall = callbackCallUpdateValidateBeforeCall(xApiKey, callbackId, contentType, accept, id, callbackCall, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public static class CallbackCallUpdateParams {
        private String callbackId;
        private String id;
        private CallbackCall callbackCall;

        private CallbackCallUpdateParams(
            String callbackId,
            String id,
            CallbackCall callbackCall
        ){
            this.callbackId = callbackId;
            this.id = id;
            this.callbackCall = callbackCall;
        }
            public String getCallbackId() {
                return callbackId;
            }
            public String getId() {
                return id;
            }
            public CallbackCall getCallbackCall() {
                return callbackCall;
            }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private String callbackId;
            private String id;
            private CallbackCall callbackCall;

            public CallbackCallUpdateParams build() {
                return new CallbackCallUpdateParams(
                    callbackId,
                    id,
                    callbackCall
                );
            }

            public Builder setCallbackId(String callbackId) {
                this.callbackId = callbackId;
                return this;
            }
            public Builder setId(String id) {
                this.id = id;
                return this;
            }
            public Builder setCallbackCall(CallbackCall callbackCall) {
                this.callbackCall = callbackCall;
                return this;
            }
        }
        
    }

    public static class CallbackCallUpdateRequest {
        private final String xApiKey;
        private final String callbackId;
        private final String contentType;
        private final String accept;
        private final String id;
        private CallbackCall callbackCall;
        ApiResponse _lastResponse;

        private CallbackCallUpdateRequest(String xApiKey, String callbackId, String contentType, String accept, String id) {
            this.xApiKey = xApiKey;
            this.callbackId = callbackId;
            this.contentType = contentType;
            this.accept = accept;
            this.id = id;
        }

        /**
         * Set callbackCall
         * @param callbackCall The Status can be either of SUCCESS or FAILED only, and you can update the status to a singular value for upto 100 ids in a single call by passing the IDs in the URL (optional)
         * @return APIcallbackCallUpdateRequest
         */
        public CallbackCallUpdateRequest callbackCall(CallbackCall callbackCall) {
            this.callbackCall = callbackCall;
            return this;
        }

        /**
         * Build call for callbackCallUpdate
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return callbackCallUpdateCall(xApiKey, callbackId, contentType, accept, id, callbackCall, _callback);
        }

        /**
         * Execute callbackCallUpdate request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public void execute() throws ApiException {
            callbackCallUpdateWithHttpInfo(xApiKey, callbackId, contentType, accept, id, callbackCall);
        }
        /**
         * Return the last executed API response
         * @return ApiResponse
         */
        public ApiResponse getLastResponse()  {
            return _lastResponse;
        }


        /**
         * Execute callbackCallUpdate request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return callbackCallUpdateAsync(xApiKey, callbackId, contentType, accept, id, callbackCall, _callback);
        }
    }

    /**
     * Update a callback call status
     * @param params The param instance required to create CallbackCallUpdateRequest
     * @return void
     */

    public static void updateCall(Map<String, Object> params) throws ApiException {
        CallbackCall callbackCall = null;
        if(params.containsKey("callbackCall") && params.get("callbackCall") != null){
            callbackCall = (CallbackCall) params.get("callbackCall");
        }
        String callbackId = (String) params.get("callbackId");

        if(callbackId == null || callbackId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'callbackId'");
        }
        String id = (String) params.get("id");

        if(id == null || id.isEmpty()) {
            throw new ApiException("Missing the required parameter 'id'");
        }
        CallbackCallUpdateParams tempParams = CallbackCallUpdateParams.builder()
            .setCallbackId(callbackId)
            .setId(id)
            .setCallbackCall(callbackCall).build();

        updateCall(tempParams);
    }

    public static void updateCall(CallbackCallUpdateParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }



        String callbackId = params.getCallbackId();

        if(callbackId == null || callbackId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'callbackId'");
        }
        String contentType = "application/vnd.whispir.api-call-v1+json";

        String accept = "application/vnd.whispir.api-call-v1+json";


        String id = params.getId();

        if(id == null || id.isEmpty()) {
            throw new ApiException("Missing the required parameter 'id'");
        }
        CallbackCallUpdateRequest request = new CallbackCallUpdateRequest(xApiKey, callbackId, contentType, accept, id);

        // Ensure to include all of the 'optionalParams' that are passed
        if(params.callbackCall != null){
            CallbackCall callbackCall = params.getCallbackCall();
            request.callbackCall(callbackCall);
        }

        request.execute();
    }
    private static okhttp3.Call callbackCreateCall(String xApiKey, String contentType, String accept, Callback callback, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = callback;

        // create path and map variables
        String localVarPath = "/callbacks";

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
            "application/vnd.whispir.api-callback-v1+json",
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/vnd.whispir.api-callback-v1+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth", "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private static okhttp3.Call callbackCreateValidateBeforeCall(String xApiKey, String contentType, String accept, Callback callback, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling callbackCreate(Async)");
        }

        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new ApiException("Missing the required parameter 'contentType' when calling callbackCreate(Async)");
        }

        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling callbackCreate(Async)");
        }

        // verify the required parameter 'callback' is set
        if (callback == null) {
            throw new ApiException("Missing the required parameter 'callback' when calling callbackCreate(Async)");
        }

        return callbackCreateCall(xApiKey, contentType, accept, callback, _callback);
    }

    private static ApiResponse<Callback> callbackCreateWithHttpInfo(String xApiKey, String contentType, String accept, Callback callback) throws ApiException {
        okhttp3.Call localVarCall = callbackCreateCall(xApiKey, contentType, accept, callback, null);
        Type localVarReturnType = new TypeToken<Callback>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private static okhttp3.Call callbackCreateAsync(String xApiKey, String contentType, String accept, Callback callback, final ApiCallback<Callback> _callback) throws ApiException {
        okhttp3.Call localVarCall = callbackCreateValidateBeforeCall(xApiKey, contentType, accept, callback, _callback);
        Type localVarReturnType = new TypeToken<Callback>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public static class CallbackCreateParams {
        private Callback callback;
        private String name;
        private URI url;
        private CallbackAuth auth;
        private String contentType;
        private String removeHTML;
        private Boolean retriesEnabled;
        private String email;
        private CallbackOptions callbacks;

        private CallbackCreateParams(
            Callback callback,
            String name,
            URI url,
            CallbackAuth auth,
            String contentType,
            String removeHTML,
            Boolean retriesEnabled,
            String email,
            CallbackOptions callbacks
        ){
            this.callback = callback;
            this.name = name;
            this.url = url;
            this.auth = auth;
            this.contentType = contentType;
            this.removeHTML = removeHTML;
            this.retriesEnabled = retriesEnabled;
            this.email = email;
            this.callbacks = callbacks;
        }
            public Callback getCallback() {
                return callback;
            }
            public String getName() {
                return name;
            }
            public URI getUrl() {
                return url;
            }
            public CallbackAuth getAuth() {
                return auth;
            }
            public enum ContentTypeEnum {
            JSON("json"),
            
            XML("xml");
                private String value;
                ContentTypeEnum(String value){
                    this.value = value;
                }

                public String getValue() {
                    return value;
                }
                
                @Override
                public String toString() {
                    return String.valueOf(value);
                }

                public static ContentTypeEnum fromValue(String value) {
                    for (ContentTypeEnum b : ContentTypeEnum.values()) {
                        if (b.value.equals(value)) {
                            return b;
                        }
                    }
                    throw new IllegalArgumentException("Unexpected value '" + value + "'");
                }

            }
            public String getContentType() {
                return contentType;
            }
            public enum RemoveHTMLEnum {
            ENABLED("enabled"),
            
            DISABLED("disabled");
                private String value;
                RemoveHTMLEnum(String value){
                    this.value = value;
                }

                public String getValue() {
                    return value;
                }
                
                @Override
                public String toString() {
                    return String.valueOf(value);
                }

                public static RemoveHTMLEnum fromValue(String value) {
                    for (RemoveHTMLEnum b : RemoveHTMLEnum.values()) {
                        if (b.value.equals(value)) {
                            return b;
                        }
                    }
                    throw new IllegalArgumentException("Unexpected value '" + value + "'");
                }

            }
            public String getRemoveHTML() {
                return removeHTML;
            }
            public Boolean getRetriesEnabled() {
                return retriesEnabled;
            }
            public String getEmail() {
                return email;
            }
            public CallbackOptions getCallbacks() {
                return callbacks;
            }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private Callback callback;
            private String name;
            private URI url;
            private CallbackAuth auth;
            private String contentType;
            private String removeHTML;
            private Boolean retriesEnabled;
            private String email;
            private CallbackOptions callbacks;

            public CallbackCreateParams build() {
                return new CallbackCreateParams(
                    callback,
                    name,
                    url,
                    auth,
                    contentType,
                    removeHTML,
                    retriesEnabled,
                    email,
                    callbacks
                );
            }

            public Builder setCallback(Callback callback) {
                this.callback = callback;
                return this;
            }
            public Builder setName(String name) {
                this.name = name;
                return this;
            }
            public Builder setUrl(URI url) {
                this.url = url;
                return this;
            }
            public Builder setAuth(CallbackAuth auth) {
                this.auth = auth;
                return this;
            }
            public Builder setContentType(ContentTypeEnum contentType) {
                this.contentType = contentType.getValue();
                return this;
            }
            public Builder setRemoveHTML(RemoveHTMLEnum removeHTML) {
                this.removeHTML = removeHTML.getValue();
                return this;
            }
            public Builder setRetriesEnabled(Boolean retriesEnabled) {
                this.retriesEnabled = retriesEnabled;
                return this;
            }
            public Builder setEmail(String email) {
                this.email = email;
                return this;
            }
            public Builder setCallbacks(CallbackOptions callbacks) {
                this.callbacks = callbacks;
                return this;
            }
        }
        
        public static class CallbackAuth {
            private String type;
            private String key;

            private CallbackAuth(String type, String key){
            this.type = type;
            this.key = key;
            }

            public String getType(){
                return type;
            }
            public enum TypeEnum {
                QUERYPARAM("queryparam"),
                HTTPHEADER("httpheader"),
                BASICAUTH("basicauth"),
                BEARERTOKEN("bearertoken");
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
            public String getKey(){
                return key;
            }

            public static Builder builder() {
                return new Builder();
            }   

            public static class Builder {
                private String type;
                private String key;

                public CallbackAuth build() {
                    return new CallbackAuth(
                        this.type,
                        this.key
                    );
                }
                public Builder setType(TypeEnum type) {
                    this.type = type.getValue();
                    return this;
                }
                public Builder setKey(String key) {
                    this.key = key;
                    return this;
                }
            }

    
        }
        public static class CallbackOptions {
            private String reply;
            private String undeliverable;

            private CallbackOptions(String reply, String undeliverable){
            this.reply = reply;
            this.undeliverable = undeliverable;
            }

            public String getReply(){
                return reply;
            }
            public enum ReplyEnum {
                ENABLED("enabled"),
                DISABLED("disabled");
                private String value;
                ReplyEnum(String value){
                    this.value = value;
                }

                public String getValue() {
                    return value;
                }
                
                @Override
                public String toString() {
                    return String.valueOf(value);
                }

                public static ReplyEnum fromValue(String value) {
                    for (ReplyEnum b : ReplyEnum.values()) {
                        if (b.value.equals(value)) {
                            return b;
                        }
                    }
                    throw new IllegalArgumentException("Unexpected value '" + value + "'");
                }

            }
            public String getUndeliverable(){
                return undeliverable;
            }
            public enum UndeliverableEnum {
                ENABLED("enabled"),
                DISABLED("disabled");
                private String value;
                UndeliverableEnum(String value){
                    this.value = value;
                }

                public String getValue() {
                    return value;
                }
                
                @Override
                public String toString() {
                    return String.valueOf(value);
                }

                public static UndeliverableEnum fromValue(String value) {
                    for (UndeliverableEnum b : UndeliverableEnum.values()) {
                        if (b.value.equals(value)) {
                            return b;
                        }
                    }
                    throw new IllegalArgumentException("Unexpected value '" + value + "'");
                }

            }

            public static Builder builder() {
                return new Builder();
            }   

            public static class Builder {
                private String reply;
                private String undeliverable;

                public CallbackOptions build() {
                    return new CallbackOptions(
                        this.reply,
                        this.undeliverable
                    );
                }
                public Builder setReply(ReplyEnum reply) {
                    this.reply = reply.getValue();
                    return this;
                }
                public Builder setUndeliverable(UndeliverableEnum undeliverable) {
                    this.undeliverable = undeliverable.getValue();
                    return this;
                }
            }

    
        }

    }

    public static class CallbackCreateRequest {
        private final String xApiKey;
        private final String contentType;
        private final String accept;
        private final Callback callback;
        ApiResponse _lastResponse;

        private CallbackCreateRequest(String xApiKey, String contentType, String accept, Callback callback) {
            this.xApiKey = xApiKey;
            this.contentType = contentType;
            this.accept = accept;
            this.callback = callback;
        }

        /**
         * Build call for callbackCreate
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return callbackCreateCall(xApiKey, contentType, accept, callback, _callback);
        }

        /**
         * Execute callbackCreate request
         * @return Callback
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public Callback execute() throws ApiException {
            ApiResponse<Callback> localVarResp = callbackCreateWithHttpInfo(xApiKey, contentType, accept, callback);
            _lastResponse = localVarResp;
            Callback data = localVarResp.getData();

            
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
         * Execute callbackCreate request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<Callback> _callback) throws ApiException {
            return callbackCreateAsync(xApiKey, contentType, accept, callback, _callback);
        }
    }

    /**
     * Create a callback
     * @param params The param instance required to create CallbackCreateRequest
     * @return Callback
     */

    public static Callback create(Map<String, Object> params) throws ApiException {
        String nameValue = (String) params.get("name");
        if(nameValue == null) {
            throw new ApiException("Missing the required property value of 'name'");
        }
        URI urlValue = (URI) params.get("url");
        if(urlValue == null) {
            throw new ApiException("Missing the required property value of 'url'");
        }
        Object authValue = params.get("auth");
        if(authValue == null) {
            throw new ApiException("Missing the required property value of 'auth'");
        }
        com.whispir.api.CallbacksApi.CallbackCreateParams.ContentTypeEnum contentTypeValue = com.whispir.api.CallbacksApi.CallbackCreateParams.ContentTypeEnum.valueOf((String) params.get("contentType"));
        if(contentTypeValue == null) {
            throw new ApiException("Missing the required property value of 'contentType'");
        }
        com.whispir.api.CallbacksApi.CallbackCreateParams.RemoveHTMLEnum removeHTMLValue = com.whispir.api.CallbacksApi.CallbackCreateParams.RemoveHTMLEnum.valueOf((String) params.get("removeHTML"));
        if(removeHTMLValue == null) {
            throw new ApiException("Missing the required property value of 'removeHTML'");
        }
        Boolean retriesEnabledValue = (Boolean) params.get("retriesEnabled");
        if(retriesEnabledValue == null) {
            throw new ApiException("Missing the required property value of 'retriesEnabled'");
        }
        String emailValue = (String) params.get("email");
        if(emailValue == null) {
            throw new ApiException("Missing the required property value of 'email'");
        }
        Object callbacksValue = params.get("callbacks");
        if(callbacksValue == null) {
            throw new ApiException("Missing the required property value of 'callbacks'");
        }
        CallbackCreateParams tempParams = CallbackCreateParams.builder()
            .setName(nameValue)
            .setUrl(urlValue)
            .setAuth((com.whispir.api.CallbacksApi.CallbackCreateParams.CallbackAuth) authValue)
            .setContentType(contentTypeValue)
            .setRemoveHTML(removeHTMLValue)
            .setRetriesEnabled(retriesEnabledValue)
            .setEmail(emailValue)
            .setCallbacks((com.whispir.api.CallbacksApi.CallbackCreateParams.CallbackOptions) callbacksValue).build();

        return create(tempParams);
    }

    public static Callback create(CallbackCreateParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }


        String contentType = "application/vnd.whispir.api-callback-v1+json";

        String accept = "application/vnd.whispir.api-callback-v1+json";


        // Constructing 'Callback' from 'CallbackCreateParams' instance passed
        Callback callback = new Callback();
        String nameValue = params.getName();
        if(nameValue == null) {
            throw new ApiException("Missing the required property value of 'name'");
        }
        callback.setName(nameValue);

        URI urlValue = params.getUrl();
        if(urlValue == null) {
            throw new ApiException("Missing the required property value of 'url'");
        }
        callback.setUrl(urlValue);

        Object authValue = params.getAuth();
        if(authValue == null) {
            throw new ApiException("Missing the required property value of 'auth'");
        }
        callback.setAuth((com.whispir.model.CallbackAuth) authValue);

        String contentTypeValue = params.getContentType();
        if(contentTypeValue == null) {
            throw new ApiException("Missing the required property value of 'contentType'");
        }
        callback.setContentType(contentTypeValue);

        String removeHTMLValue = params.getRemoveHTML();
        if(removeHTMLValue == null) {
            throw new ApiException("Missing the required property value of 'removeHTML'");
        }
        callback.setRemoveHTML(removeHTMLValue);

        Boolean retriesEnabledValue = params.getRetriesEnabled();
        if(retriesEnabledValue == null) {
            throw new ApiException("Missing the required property value of 'retriesEnabled'");
        }
        callback.setRetriesEnabled(retriesEnabledValue);

        String emailValue = params.getEmail();
        if(emailValue == null) {
            throw new ApiException("Missing the required property value of 'email'");
        }
        callback.setEmail(emailValue);

        Object callbacksValue = params.getCallbacks();
        if(callbacksValue == null) {
            throw new ApiException("Missing the required property value of 'callbacks'");
        }
        callback.setCallbacks((com.whispir.model.CallbackOptions) callbacksValue);

        CallbackCreateRequest request = new CallbackCreateRequest(xApiKey, contentType, accept, callback);

        // Ensure to include all of the 'optionalParams' that are passed

        return request.execute();
    }
    private static okhttp3.Call callbackDeleteCall(String xApiKey, String contentType, String accept, String callbackId, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/callbacks/{callbackId}"
            .replace("{" + "callbackId" + "}", localVarApiClient.escapeString(callbackId.toString()));

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
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth", "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private static okhttp3.Call callbackDeleteValidateBeforeCall(String xApiKey, String contentType, String accept, String callbackId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling callbackDelete(Async)");
        }

        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new ApiException("Missing the required parameter 'contentType' when calling callbackDelete(Async)");
        }

        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling callbackDelete(Async)");
        }

        // verify the required parameter 'callbackId' is set
        if (callbackId == null) {
            throw new ApiException("Missing the required parameter 'callbackId' when calling callbackDelete(Async)");
        }

        return callbackDeleteCall(xApiKey, contentType, accept, callbackId, _callback);
    }

    private static ApiResponse<Void> callbackDeleteWithHttpInfo(String xApiKey, String contentType, String accept, String callbackId) throws ApiException {
        okhttp3.Call localVarCall = callbackDeleteCall(xApiKey, contentType, accept, callbackId, null);
        return localVarApiClient.execute(localVarCall);
    }

    private static okhttp3.Call callbackDeleteAsync(String xApiKey, String contentType, String accept, String callbackId, final ApiCallback<Void> _callback) throws ApiException {
        okhttp3.Call localVarCall = callbackDeleteValidateBeforeCall(xApiKey, contentType, accept, callbackId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public static class CallbackDeleteParams {
        private String callbackId;

        private CallbackDeleteParams(
            String callbackId
        ){
            this.callbackId = callbackId;
        }
            public String getCallbackId() {
                return callbackId;
            }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private String callbackId;

            public CallbackDeleteParams build() {
                return new CallbackDeleteParams(
                    callbackId
                );
            }

            public Builder setCallbackId(String callbackId) {
                this.callbackId = callbackId;
                return this;
            }
        }
        
    }

    public static class CallbackDeleteRequest {
        private final String xApiKey;
        private final String contentType;
        private final String accept;
        private final String callbackId;
        ApiResponse _lastResponse;

        private CallbackDeleteRequest(String xApiKey, String contentType, String accept, String callbackId) {
            this.xApiKey = xApiKey;
            this.contentType = contentType;
            this.accept = accept;
            this.callbackId = callbackId;
        }

        /**
         * Build call for callbackDelete
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return callbackDeleteCall(xApiKey, contentType, accept, callbackId, _callback);
        }

        /**
         * Execute callbackDelete request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public void execute() throws ApiException {
            callbackDeleteWithHttpInfo(xApiKey, contentType, accept, callbackId);
        }
        /**
         * Return the last executed API response
         * @return ApiResponse
         */
        public ApiResponse getLastResponse()  {
            return _lastResponse;
        }


        /**
         * Execute callbackDelete request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return callbackDeleteAsync(xApiKey, contentType, accept, callbackId, _callback);
        }
    }

    /**
     * Delete a callback
     * @param params The param instance required to create CallbackDeleteRequest
     * @return void
     */

    public static void delete(Map<String, Object> params) throws ApiException {
        String callbackId = (String) params.get("callbackId");

        if(callbackId == null || callbackId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'callbackId'");
        }
        CallbackDeleteParams tempParams = CallbackDeleteParams.builder()
            .setCallbackId(callbackId).build();

        delete(tempParams);
    }

    public static void delete(CallbackDeleteParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }


        String contentType = "application/vnd.whispir.api-callback-v1+json";

        String accept = "application/vnd.whispir.api-callback-v1+json";


        String callbackId = params.getCallbackId();

        if(callbackId == null || callbackId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'callbackId'");
        }
        CallbackDeleteRequest request = new CallbackDeleteRequest(xApiKey, contentType, accept, callbackId);

        // Ensure to include all of the 'optionalParams' that are passed

        request.execute();
    }
    private static okhttp3.Call callbackListCall(String xApiKey, String accept, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/callbacks";

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

        if (xApiKey != null) {
            localVarHeaderParams.put("X-Api-Key", localVarApiClient.parameterToString(xApiKey));
        }

        if (accept != null) {
            localVarHeaderParams.put("Accept", localVarApiClient.parameterToString(accept));
        }

        final String[] localVarAccepts = {
            "application/vnd.whispir.api-callback-v1+json",
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
    private static okhttp3.Call callbackListValidateBeforeCall(String xApiKey, String accept, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling callbackList(Async)");
        }

        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling callbackList(Async)");
        }

        return callbackListCall(xApiKey, accept, limit, offset, sortOrder, sortFields, _callback);
    }

    private static ApiResponse<CallbackCollection> callbackListWithHttpInfo(String xApiKey, String accept, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields) throws ApiException {
        okhttp3.Call localVarCall = callbackListCall(xApiKey, accept, limit, offset, sortOrder, sortFields, null);
        Type localVarReturnType = new TypeToken<CallbackCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private static okhttp3.Call callbackListAsync(String xApiKey, String accept, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields, final ApiCallback<CallbackCollection> _callback) throws ApiException {
        okhttp3.Call localVarCall = callbackListValidateBeforeCall(xApiKey, accept, limit, offset, sortOrder, sortFields, _callback);
        Type localVarReturnType = new TypeToken<CallbackCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public static class CallbackListParams {
        private BigDecimal limit;
        private BigDecimal offset;
        private String sortOrder;
        private String sortFields;

        private CallbackListParams(
            BigDecimal limit,
            BigDecimal offset,
            String sortOrder,
            String sortFields
        ){
            this.limit = limit;
            this.offset = offset;
            this.sortOrder = sortOrder;
            this.sortFields = sortFields;
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

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private BigDecimal limit;
            private BigDecimal offset;
            private String sortOrder;
            private String sortFields;

            public CallbackListParams build() {
                return new CallbackListParams(
                    limit,
                    offset,
                    sortOrder,
                    sortFields
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
        }
        
    }

    public static class CallbackListRequest {
        private final String xApiKey;
        private final String accept;
        private BigDecimal limit;
        private BigDecimal offset;
        private String sortOrder;
        private String sortFields;
        ApiResponse _lastResponse;

        private CallbackListRequest(String xApiKey, String accept) {
            this.xApiKey = xApiKey;
            this.accept = accept;
        }

        /**
         * Set limit
         * @param limit The number of records to be returned. (optional, default to 20)
         * @return APIcallbackListRequest
         */
        public CallbackListRequest limit(BigDecimal limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Set offset
         * @param offset The record number to start returning from. (optional, default to 0)
         * @return APIcallbackListRequest
         */
        public CallbackListRequest offset(BigDecimal offset) {
            this.offset = offset;
            return this;
        }

        /**
         * Set sortOrder
         * @param sortOrder The order in which you require the results to be returned. Either ‘asc’ or ‘desc’ (optional)
         * @return APIcallbackListRequest
         */
        public CallbackListRequest sortOrder(String sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * Set sortFields
         * @param sortFields The fields that you require the ordering to be performed on. Multiple fields can be provided, separated by a comma. (optional)
         * @return APIcallbackListRequest
         */
        public CallbackListRequest sortFields(String sortFields) {
            this.sortFields = sortFields;
            return this;
        }

        /**
         * Build call for callbackList
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return callbackListCall(xApiKey, accept, limit, offset, sortOrder, sortFields, _callback);
        }

        /**
         * Execute callbackList request
         * @return CallbackCollection
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public CallbackCollection execute() throws ApiException {
            ApiResponse<CallbackCollection> localVarResp = callbackListWithHttpInfo(xApiKey, accept, limit, offset, sortOrder, sortFields);
            _lastResponse = localVarResp;
            CallbackCollection data = localVarResp.getData();

            
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
         * Execute callbackList request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<CallbackCollection> _callback) throws ApiException {
            return callbackListAsync(xApiKey, accept, limit, offset, sortOrder, sortFields, _callback);
        }
    }

    /**
     * List callbacks
     * @param params The param instance required to create CallbackListRequest
     * @return CallbackCollection
     */

    public static CallbackCollection list(Map<String, Object> params) throws ApiException {
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
        CallbackListParams tempParams = CallbackListParams.builder()
            .setLimit(limit)
            .setOffset(offset)
            .setSortOrder(sortOrder)
            .setSortFields(sortFields).build();

        return list(tempParams);
    }

    public static CallbackCollection list(CallbackListParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }


        String accept = "application/vnd.whispir.api-callback-v1+json";

        CallbackListRequest request = new CallbackListRequest(xApiKey, accept);

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

        return request.execute();
    }
    private static okhttp3.Call callbackRetrieveCall(String xApiKey, String accept, String callbackId, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/callbacks/{callbackId}"
            .replace("{" + "callbackId" + "}", localVarApiClient.escapeString(callbackId.toString()));

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
            "application/vnd.whispir.api-callback-v1+json",
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
    private static okhttp3.Call callbackRetrieveValidateBeforeCall(String xApiKey, String accept, String callbackId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling callbackRetrieve(Async)");
        }

        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling callbackRetrieve(Async)");
        }

        // verify the required parameter 'callbackId' is set
        if (callbackId == null) {
            throw new ApiException("Missing the required parameter 'callbackId' when calling callbackRetrieve(Async)");
        }

        return callbackRetrieveCall(xApiKey, accept, callbackId, _callback);
    }

    private static ApiResponse<Callback> callbackRetrieveWithHttpInfo(String xApiKey, String accept, String callbackId) throws ApiException {
        okhttp3.Call localVarCall = callbackRetrieveCall(xApiKey, accept, callbackId, null);
        Type localVarReturnType = new TypeToken<Callback>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private static okhttp3.Call callbackRetrieveAsync(String xApiKey, String accept, String callbackId, final ApiCallback<Callback> _callback) throws ApiException {
        okhttp3.Call localVarCall = callbackRetrieveValidateBeforeCall(xApiKey, accept, callbackId, _callback);
        Type localVarReturnType = new TypeToken<Callback>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public static class CallbackRetrieveParams {
        private String callbackId;

        private CallbackRetrieveParams(
            String callbackId
        ){
            this.callbackId = callbackId;
        }
            public String getCallbackId() {
                return callbackId;
            }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private String callbackId;

            public CallbackRetrieveParams build() {
                return new CallbackRetrieveParams(
                    callbackId
                );
            }

            public Builder setCallbackId(String callbackId) {
                this.callbackId = callbackId;
                return this;
            }
        }
        
    }

    public static class CallbackRetrieveRequest {
        private final String xApiKey;
        private final String accept;
        private final String callbackId;
        ApiResponse _lastResponse;

        private CallbackRetrieveRequest(String xApiKey, String accept, String callbackId) {
            this.xApiKey = xApiKey;
            this.accept = accept;
            this.callbackId = callbackId;
        }

        /**
         * Build call for callbackRetrieve
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return callbackRetrieveCall(xApiKey, accept, callbackId, _callback);
        }

        /**
         * Execute callbackRetrieve request
         * @return Callback
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public Callback execute() throws ApiException {
            ApiResponse<Callback> localVarResp = callbackRetrieveWithHttpInfo(xApiKey, accept, callbackId);
            _lastResponse = localVarResp;
            Callback data = localVarResp.getData();

            
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
         * Execute callbackRetrieve request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<Callback> _callback) throws ApiException {
            return callbackRetrieveAsync(xApiKey, accept, callbackId, _callback);
        }
    }

    /**
     * Retrieve a callback
     * @param params The param instance required to create CallbackRetrieveRequest
     * @return Callback
     */

    public static Callback retrieve(Map<String, Object> params) throws ApiException {
        String callbackId = (String) params.get("callbackId");

        if(callbackId == null || callbackId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'callbackId'");
        }
        CallbackRetrieveParams tempParams = CallbackRetrieveParams.builder()
            .setCallbackId(callbackId).build();

        return retrieve(tempParams);
    }

    public static Callback retrieve(CallbackRetrieveParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }


        String accept = "application/vnd.whispir.api-callback-v1+json";


        String callbackId = params.getCallbackId();

        if(callbackId == null || callbackId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'callbackId'");
        }
        CallbackRetrieveRequest request = new CallbackRetrieveRequest(xApiKey, accept, callbackId);

        // Ensure to include all of the 'optionalParams' that are passed

        return request.execute();
    }
    private static okhttp3.Call callbackUpdateCall(String xApiKey, String callbackId, String contentType, String accept, Callback callback, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = callback;

        // create path and map variables
        String localVarPath = "/callbacks/{callbackId}"
            .replace("{" + "callbackId" + "}", localVarApiClient.escapeString(callbackId.toString()));

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
            "application/vnd.whispir.api-callback-v1+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth", "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private static okhttp3.Call callbackUpdateValidateBeforeCall(String xApiKey, String callbackId, String contentType, String accept, Callback callback, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling callbackUpdate(Async)");
        }

        // verify the required parameter 'callbackId' is set
        if (callbackId == null) {
            throw new ApiException("Missing the required parameter 'callbackId' when calling callbackUpdate(Async)");
        }

        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new ApiException("Missing the required parameter 'contentType' when calling callbackUpdate(Async)");
        }

        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling callbackUpdate(Async)");
        }

        return callbackUpdateCall(xApiKey, callbackId, contentType, accept, callback, _callback);
    }

    private static ApiResponse<Void> callbackUpdateWithHttpInfo(String xApiKey, String callbackId, String contentType, String accept, Callback callback) throws ApiException {
        okhttp3.Call localVarCall = callbackUpdateCall(xApiKey, callbackId, contentType, accept, callback, null);
        return localVarApiClient.execute(localVarCall);
    }

    private static okhttp3.Call callbackUpdateAsync(String xApiKey, String callbackId, String contentType, String accept, Callback callback, final ApiCallback<Void> _callback) throws ApiException {
        okhttp3.Call localVarCall = callbackUpdateValidateBeforeCall(xApiKey, callbackId, contentType, accept, callback, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public static class CallbackUpdateParams {
        private String callbackId;
        private Callback callback;

        private CallbackUpdateParams(
            String callbackId,
            Callback callback
        ){
            this.callbackId = callbackId;
            this.callback = callback;
        }
            public String getCallbackId() {
                return callbackId;
            }
            public Callback getCallback() {
                return callback;
            }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private String callbackId;
            private Callback callback;

            public CallbackUpdateParams build() {
                return new CallbackUpdateParams(
                    callbackId,
                    callback
                );
            }

            public Builder setCallbackId(String callbackId) {
                this.callbackId = callbackId;
                return this;
            }
            public Builder setCallback(Callback callback) {
                this.callback = callback;
                return this;
            }
        }
        
    }

    public static class CallbackUpdateRequest {
        private final String xApiKey;
        private final String callbackId;
        private final String contentType;
        private final String accept;
        private Callback callback;
        ApiResponse _lastResponse;

        private CallbackUpdateRequest(String xApiKey, String callbackId, String contentType, String accept) {
            this.xApiKey = xApiKey;
            this.callbackId = callbackId;
            this.contentType = contentType;
            this.accept = accept;
        }

        /**
         * Set callback
         * @param callback The Callback object to update (optional)
         * @return APIcallbackUpdateRequest
         */
        public CallbackUpdateRequest callback(Callback callback) {
            this.callback = callback;
            return this;
        }

        /**
         * Build call for callbackUpdate
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return callbackUpdateCall(xApiKey, callbackId, contentType, accept, callback, _callback);
        }

        /**
         * Execute callbackUpdate request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public void execute() throws ApiException {
            callbackUpdateWithHttpInfo(xApiKey, callbackId, contentType, accept, callback);
        }
        /**
         * Return the last executed API response
         * @return ApiResponse
         */
        public ApiResponse getLastResponse()  {
            return _lastResponse;
        }


        /**
         * Execute callbackUpdate request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return callbackUpdateAsync(xApiKey, callbackId, contentType, accept, callback, _callback);
        }
    }

    /**
     * Update a callback
     * @param params The param instance required to create CallbackUpdateRequest
     * @return void
     */

    public static void update(Map<String, Object> params) throws ApiException {
        Callback callback = null;
        if(params.containsKey("callback") && params.get("callback") != null){
            callback = (Callback) params.get("callback");
        }
        String callbackId = (String) params.get("callbackId");

        if(callbackId == null || callbackId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'callbackId'");
        }
        CallbackUpdateParams tempParams = CallbackUpdateParams.builder()
            .setCallbackId(callbackId)
            .setCallback(callback).build();

        update(tempParams);
    }

    public static void update(CallbackUpdateParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }



        String callbackId = params.getCallbackId();

        if(callbackId == null || callbackId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'callbackId'");
        }
        String contentType = "application/vnd.whispir.api-callback-v1+json";

        String accept = "application/vnd.whispir.api-callback-v1+json";

        CallbackUpdateRequest request = new CallbackUpdateRequest(xApiKey, callbackId, contentType, accept);

        // Ensure to include all of the 'optionalParams' that are passed
        if(params.callback != null){
            Callback callback = params.getCallback();
            request.callback(callback);
        }

        request.execute();
    }
}
