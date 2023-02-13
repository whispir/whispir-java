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
import com.whispir.model.ResponseRule;
import com.whispir.model.ResponseRuleCollection;

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

public class ResponseRulesApi {
    private static ApiClient localVarApiClient = Configuration.getDefaultApiClient();

    private static okhttp3.Call reponseRuleListCall(String workspaceId, String xApiKey, String accept, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/workspaces/{workspaceId}/responserules"
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

        if (xApiKey != null) {
            localVarHeaderParams.put("X-Api-Key", localVarApiClient.parameterToString(xApiKey));
        }

        if (accept != null) {
            localVarHeaderParams.put("Accept", localVarApiClient.parameterToString(accept));
        }

        final String[] localVarAccepts = {
            "application/vnd.whispir.responserule-v1+json",
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
    private static okhttp3.Call reponseRuleListValidateBeforeCall(String workspaceId, String xApiKey, String accept, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'workspaceId' is set
        if (workspaceId == null) {
            throw new ApiException("Missing the required parameter 'workspaceId' when calling reponseRuleList(Async)");
        }

        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling reponseRuleList(Async)");
        }

        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling reponseRuleList(Async)");
        }

        return reponseRuleListCall(workspaceId, xApiKey, accept, limit, offset, sortOrder, sortFields, _callback);
    }

    private static ApiResponse<ResponseRuleCollection> reponseRuleListWithHttpInfo(String workspaceId, String xApiKey, String accept, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields) throws ApiException {
        okhttp3.Call localVarCall = reponseRuleListCall(workspaceId, xApiKey, accept, limit, offset, sortOrder, sortFields, null);
        Type localVarReturnType = new TypeToken<ResponseRuleCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private static okhttp3.Call reponseRuleListAsync(String workspaceId, String xApiKey, String accept, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields, final ApiCallback<ResponseRuleCollection> _callback) throws ApiException {
        okhttp3.Call localVarCall = reponseRuleListValidateBeforeCall(workspaceId, xApiKey, accept, limit, offset, sortOrder, sortFields, _callback);
        Type localVarReturnType = new TypeToken<ResponseRuleCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public static class ReponseRuleListParams {
        private String workspaceId;
        private BigDecimal limit;
        private BigDecimal offset;
        private String sortOrder;
        private String sortFields;

        private ReponseRuleListParams(
            String workspaceId,
            BigDecimal limit,
            BigDecimal offset,
            String sortOrder,
            String sortFields
        ){
            this.workspaceId = workspaceId;
            this.limit = limit;
            this.offset = offset;
            this.sortOrder = sortOrder;
            this.sortFields = sortFields;
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

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private String workspaceId;
            private BigDecimal limit;
            private BigDecimal offset;
            private String sortOrder;
            private String sortFields;

            public ReponseRuleListParams build() {
                return new ReponseRuleListParams(
                    workspaceId,
                    limit,
                    offset,
                    sortOrder,
                    sortFields
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
        }
        
    }

    public static class ReponseRuleListRequest {
        private final String workspaceId;
        private final String xApiKey;
        private final String accept;
        private BigDecimal limit;
        private BigDecimal offset;
        private String sortOrder;
        private String sortFields;
        ApiResponse _lastResponse;

        private ReponseRuleListRequest(String workspaceId, String xApiKey, String accept) {
            this.workspaceId = workspaceId;
            this.xApiKey = xApiKey;
            this.accept = accept;
        }

        /**
         * Set limit
         * @param limit The number of records to be returned. (optional, default to 20)
         * @return APIreponseRuleListRequest
         */
        public ReponseRuleListRequest limit(BigDecimal limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Set offset
         * @param offset The record number to start returning from. (optional, default to 0)
         * @return APIreponseRuleListRequest
         */
        public ReponseRuleListRequest offset(BigDecimal offset) {
            this.offset = offset;
            return this;
        }

        /**
         * Set sortOrder
         * @param sortOrder The order in which you require the results to be returned. Either ‘asc’ or ‘desc’ (optional)
         * @return APIreponseRuleListRequest
         */
        public ReponseRuleListRequest sortOrder(String sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * Set sortFields
         * @param sortFields The fields that you require the ordering to be performed on. Multiple fields can be provided, separated by a comma. (optional)
         * @return APIreponseRuleListRequest
         */
        public ReponseRuleListRequest sortFields(String sortFields) {
            this.sortFields = sortFields;
            return this;
        }

        /**
         * Build call for reponseRuleList
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return reponseRuleListCall(workspaceId, xApiKey, accept, limit, offset, sortOrder, sortFields, _callback);
        }

        /**
         * Execute reponseRuleList request
         * @return ResponseRuleCollection
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public ResponseRuleCollection execute() throws ApiException {
            ApiResponse<ResponseRuleCollection> localVarResp = reponseRuleListWithHttpInfo(workspaceId, xApiKey, accept, limit, offset, sortOrder, sortFields);
            _lastResponse = localVarResp;
            ResponseRuleCollection data = localVarResp.getData();

            
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
         * Execute reponseRuleList request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<ResponseRuleCollection> _callback) throws ApiException {
            return reponseRuleListAsync(workspaceId, xApiKey, accept, limit, offset, sortOrder, sortFields, _callback);
        }
    }

    /**
     * List response rules
     * @param params The param instance required to create ReponseRuleListRequest
     * @return ResponseRuleCollection
     */

    public static ResponseRuleCollection list(Map<String, Object> params) throws ApiException {
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
        String workspaceId = (String) params.get("workspaceId");

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }
        ReponseRuleListParams tempParams = ReponseRuleListParams.builder()
            .setWorkspaceId(workspaceId)
            .setLimit(limit)
            .setOffset(offset)
            .setSortOrder(sortOrder)
            .setSortFields(sortFields).build();

        return list(tempParams);
    }

    public static ResponseRuleCollection list(ReponseRuleListParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }


        String workspaceId = params.getWorkspaceId();

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }

        String accept = "application/vnd.whispir.responserule-v1+json";

        ReponseRuleListRequest request = new ReponseRuleListRequest(workspaceId, xApiKey, accept);

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
    private static okhttp3.Call responseRuleCreateCall(String workspaceId, String xApiKey, String contentType, String accept, ResponseRule responseRule, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = responseRule;

        // create path and map variables
        String localVarPath = "/workspaces/{workspaceId}/responserules"
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
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/vnd.whispir.responserule-v1+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth", "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private static okhttp3.Call responseRuleCreateValidateBeforeCall(String workspaceId, String xApiKey, String contentType, String accept, ResponseRule responseRule, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'workspaceId' is set
        if (workspaceId == null) {
            throw new ApiException("Missing the required parameter 'workspaceId' when calling responseRuleCreate(Async)");
        }

        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling responseRuleCreate(Async)");
        }

        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new ApiException("Missing the required parameter 'contentType' when calling responseRuleCreate(Async)");
        }

        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling responseRuleCreate(Async)");
        }

        // verify the required parameter 'responseRule' is set
        if (responseRule == null) {
            throw new ApiException("Missing the required parameter 'responseRule' when calling responseRuleCreate(Async)");
        }

        return responseRuleCreateCall(workspaceId, xApiKey, contentType, accept, responseRule, _callback);
    }

    private static ApiResponse<Void> responseRuleCreateWithHttpInfo(String workspaceId, String xApiKey, String contentType, String accept, ResponseRule responseRule) throws ApiException {
        okhttp3.Call localVarCall = responseRuleCreateCall(workspaceId, xApiKey, contentType, accept, responseRule, null);
        return localVarApiClient.execute(localVarCall);
    }

    private static okhttp3.Call responseRuleCreateAsync(String workspaceId, String xApiKey, String contentType, String accept, ResponseRule responseRule, final ApiCallback<Void> _callback) throws ApiException {
        okhttp3.Call localVarCall = responseRuleCreateValidateBeforeCall(workspaceId, xApiKey, contentType, accept, responseRule, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public static class ResponseRuleCreateParams {
        private String workspaceId;
        private ResponseRule responseRule;
        private String name;
        private String description;
        private TemplatePattern responseTemplatePatterns;

        private ResponseRuleCreateParams(
            String workspaceId,
            ResponseRule responseRule,
            String name,
            String description,
            TemplatePattern responseTemplatePatterns
        ){
            this.workspaceId = workspaceId;
            this.responseRule = responseRule;
            this.name = name;
            this.description = description;
            this.responseTemplatePatterns = responseTemplatePatterns;
        }
            public String getWorkspaceId() {
                return workspaceId;
            }
            public ResponseRule getResponseRule() {
                return responseRule;
            }
            public String getName() {
                return name;
            }
            public String getDescription() {
                return description;
            }
            public TemplatePattern getResponseTemplatePatterns() {
                return responseTemplatePatterns;
            }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private String workspaceId;
            private ResponseRule responseRule;
            private String name;
            private String description;
            private TemplatePattern responseTemplatePatterns;

            public ResponseRuleCreateParams build() {
                return new ResponseRuleCreateParams(
                    workspaceId,
                    responseRule,
                    name,
                    description,
                    responseTemplatePatterns
                );
            }

            public Builder setWorkspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }
            public Builder setResponseRule(ResponseRule responseRule) {
                this.responseRule = responseRule;
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
            public Builder setResponseTemplatePatterns(TemplatePattern responseTemplatePatterns) {
                this.responseTemplatePatterns = responseTemplatePatterns;
                return this;
            }
        }
        
        public static class TemplatePattern {
            private String name;
            private String pattern;
            private String textPrompt;
            private String voicePrompt;
            private String spokenVoicePrompt;
            private String colour;

            private TemplatePattern(String name, String pattern, String textPrompt, String voicePrompt, String spokenVoicePrompt, String colour){
            this.name = name;
            this.pattern = pattern;
            this.textPrompt = textPrompt;
            this.voicePrompt = voicePrompt;
            this.spokenVoicePrompt = spokenVoicePrompt;
            this.colour = colour;
            }

            public String getName(){
                return name;
            }
            public String getPattern(){
                return pattern;
            }
            public String getTextPrompt(){
                return textPrompt;
            }
            public String getVoicePrompt(){
                return voicePrompt;
            }
            public String getSpokenVoicePrompt(){
                return spokenVoicePrompt;
            }
            public String getColour(){
                return colour;
            }

            public static Builder builder() {
                return new Builder();
            }   

            public static class Builder {
                private String name;
                private String pattern;
                private String textPrompt;
                private String voicePrompt;
                private String spokenVoicePrompt;
                private String colour;

                public TemplatePattern build() {
                    return new TemplatePattern(
                        this.name,
                        this.pattern,
                        this.textPrompt,
                        this.voicePrompt,
                        this.spokenVoicePrompt,
                        this.colour
                    );
                }
                public Builder setName(String name) {
                    this.name = name;
                    return this;
                }
                public Builder setPattern(String pattern) {
                    this.pattern = pattern;
                    return this;
                }
                public Builder setTextPrompt(String textPrompt) {
                    this.textPrompt = textPrompt;
                    return this;
                }
                public Builder setVoicePrompt(String voicePrompt) {
                    this.voicePrompt = voicePrompt;
                    return this;
                }
                public Builder setSpokenVoicePrompt(String spokenVoicePrompt) {
                    this.spokenVoicePrompt = spokenVoicePrompt;
                    return this;
                }
                public Builder setColour(String colour) {
                    this.colour = colour;
                    return this;
                }
            }

    
        }

    }

    public static class ResponseRuleCreateRequest {
        private final String workspaceId;
        private final String xApiKey;
        private final String contentType;
        private final String accept;
        private final ResponseRule responseRule;
        ApiResponse _lastResponse;

        private ResponseRuleCreateRequest(String workspaceId, String xApiKey, String contentType, String accept, ResponseRule responseRule) {
            this.workspaceId = workspaceId;
            this.xApiKey = xApiKey;
            this.contentType = contentType;
            this.accept = accept;
            this.responseRule = responseRule;
        }

        /**
         * Build call for responseRuleCreate
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return responseRuleCreateCall(workspaceId, xApiKey, contentType, accept, responseRule, _callback);
        }

        /**
         * Execute responseRuleCreate request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public void execute() throws ApiException {
            responseRuleCreateWithHttpInfo(workspaceId, xApiKey, contentType, accept, responseRule);
        }
        /**
         * Return the last executed API response
         * @return ApiResponse
         */
        public ApiResponse getLastResponse()  {
            return _lastResponse;
        }


        /**
         * Execute responseRuleCreate request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return responseRuleCreateAsync(workspaceId, xApiKey, contentType, accept, responseRule, _callback);
        }
    }

    /**
     * Create a response rule
     * @param params The param instance required to create ResponseRuleCreateRequest
     * @return void
     */

    public static void create(Map<String, Object> params) throws ApiException {
        String workspaceId = (String) params.get("workspaceId");

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }
        String nameValue = (String) params.get("name");
        if(nameValue == null) {
            throw new ApiException("Missing the required property value of 'name'");
        }
        String descriptionValue = (String) params.get("description");
        Object responseTemplatePatternsValue = params.get("responseTemplatePatterns");
        if(responseTemplatePatternsValue == null) {
            throw new ApiException("Missing the required property value of 'responseTemplatePatterns'");
        }
        ResponseRuleCreateParams tempParams = ResponseRuleCreateParams.builder()
            .setWorkspaceId(workspaceId)
            .setName(nameValue)
            .setDescription(descriptionValue)
            .setResponseTemplatePatterns((com.whispir.api.ResponseRulesApi.ResponseRuleCreateParams.TemplatePattern) responseTemplatePatternsValue).build();

        create(tempParams);
    }

    public static void create(ResponseRuleCreateParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }


        String workspaceId = params.getWorkspaceId();

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }

        String contentType = "application/vnd.whispir.responserule-v1+json";

        String accept = "application/vnd.whispir.responserule-v1+json";


        // Constructing 'ResponseRule' from 'ResponseRuleCreateParams' instance passed
        ResponseRule responseRule = new ResponseRule();
        String nameValue = params.getName();
        if(nameValue == null) {
            throw new ApiException("Missing the required property value of 'name'");
        }
        responseRule.setName(nameValue);

        String descriptionValue = params.getDescription();
        responseRule.setDescription(descriptionValue);

        Object responseTemplatePatternsValue = params.getResponseTemplatePatterns();
        if(responseTemplatePatternsValue == null) {
            throw new ApiException("Missing the required property value of 'responseTemplatePatterns'");
        }
        responseRule.setResponseTemplatePatterns((com.whispir.model.TemplatePattern) responseTemplatePatternsValue);

        ResponseRuleCreateRequest request = new ResponseRuleCreateRequest(workspaceId, xApiKey, contentType, accept, responseRule);

        // Ensure to include all of the 'optionalParams' that are passed

        request.execute();
    }
    private static okhttp3.Call responseRuleDeleteCall(String workspaceId, String xApiKey, String responseRuleId, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/workspaces/{workspaceId}/responserules/{responseRuleId}"
            .replace("{" + "workspaceId" + "}", localVarApiClient.escapeString(workspaceId.toString()))
            .replace("{" + "responseRuleId" + "}", localVarApiClient.escapeString(responseRuleId.toString()));

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
    private static okhttp3.Call responseRuleDeleteValidateBeforeCall(String workspaceId, String xApiKey, String responseRuleId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'workspaceId' is set
        if (workspaceId == null) {
            throw new ApiException("Missing the required parameter 'workspaceId' when calling responseRuleDelete(Async)");
        }

        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling responseRuleDelete(Async)");
        }

        // verify the required parameter 'responseRuleId' is set
        if (responseRuleId == null) {
            throw new ApiException("Missing the required parameter 'responseRuleId' when calling responseRuleDelete(Async)");
        }

        return responseRuleDeleteCall(workspaceId, xApiKey, responseRuleId, _callback);
    }

    private static ApiResponse<Void> responseRuleDeleteWithHttpInfo(String workspaceId, String xApiKey, String responseRuleId) throws ApiException {
        okhttp3.Call localVarCall = responseRuleDeleteCall(workspaceId, xApiKey, responseRuleId, null);
        return localVarApiClient.execute(localVarCall);
    }

    private static okhttp3.Call responseRuleDeleteAsync(String workspaceId, String xApiKey, String responseRuleId, final ApiCallback<Void> _callback) throws ApiException {
        okhttp3.Call localVarCall = responseRuleDeleteValidateBeforeCall(workspaceId, xApiKey, responseRuleId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public static class ResponseRuleDeleteParams {
        private String workspaceId;
        private String responseRuleId;

        private ResponseRuleDeleteParams(
            String workspaceId,
            String responseRuleId
        ){
            this.workspaceId = workspaceId;
            this.responseRuleId = responseRuleId;
        }
            public String getWorkspaceId() {
                return workspaceId;
            }
            public String getResponseRuleId() {
                return responseRuleId;
            }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private String workspaceId;
            private String responseRuleId;

            public ResponseRuleDeleteParams build() {
                return new ResponseRuleDeleteParams(
                    workspaceId,
                    responseRuleId
                );
            }

            public Builder setWorkspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }
            public Builder setResponseRuleId(String responseRuleId) {
                this.responseRuleId = responseRuleId;
                return this;
            }
        }
        
    }

    public static class ResponseRuleDeleteRequest {
        private final String workspaceId;
        private final String xApiKey;
        private final String responseRuleId;
        ApiResponse _lastResponse;

        private ResponseRuleDeleteRequest(String workspaceId, String xApiKey, String responseRuleId) {
            this.workspaceId = workspaceId;
            this.xApiKey = xApiKey;
            this.responseRuleId = responseRuleId;
        }

        /**
         * Build call for responseRuleDelete
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return responseRuleDeleteCall(workspaceId, xApiKey, responseRuleId, _callback);
        }

        /**
         * Execute responseRuleDelete request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public void execute() throws ApiException {
            responseRuleDeleteWithHttpInfo(workspaceId, xApiKey, responseRuleId);
        }
        /**
         * Return the last executed API response
         * @return ApiResponse
         */
        public ApiResponse getLastResponse()  {
            return _lastResponse;
        }


        /**
         * Execute responseRuleDelete request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return responseRuleDeleteAsync(workspaceId, xApiKey, responseRuleId, _callback);
        }
    }

    /**
     * Delete a response rule
     * @param params The param instance required to create ResponseRuleDeleteRequest
     * @return void
     */

    public static void delete(Map<String, Object> params) throws ApiException {
        String workspaceId = (String) params.get("workspaceId");

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }
        String responseRuleId = (String) params.get("responseRuleId");

        if(responseRuleId == null || responseRuleId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'responseRuleId'");
        }
        ResponseRuleDeleteParams tempParams = ResponseRuleDeleteParams.builder()
            .setWorkspaceId(workspaceId)
            .setResponseRuleId(responseRuleId).build();

        delete(tempParams);
    }

    public static void delete(ResponseRuleDeleteParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }


        String workspaceId = params.getWorkspaceId();

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }


        String responseRuleId = params.getResponseRuleId();

        if(responseRuleId == null || responseRuleId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'responseRuleId'");
        }
        ResponseRuleDeleteRequest request = new ResponseRuleDeleteRequest(workspaceId, xApiKey, responseRuleId);

        // Ensure to include all of the 'optionalParams' that are passed

        request.execute();
    }
    private static okhttp3.Call responseRuleRetrieveCall(String workspaceId, String xApiKey, String accept, String responseRuleId, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/workspaces/{workspaceId}/responserules/{responseRuleId}"
            .replace("{" + "workspaceId" + "}", localVarApiClient.escapeString(workspaceId.toString()))
            .replace("{" + "responseRuleId" + "}", localVarApiClient.escapeString(responseRuleId.toString()));

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
            "application/vnd.whispir.responserule-v1+json",
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
    private static okhttp3.Call responseRuleRetrieveValidateBeforeCall(String workspaceId, String xApiKey, String accept, String responseRuleId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'workspaceId' is set
        if (workspaceId == null) {
            throw new ApiException("Missing the required parameter 'workspaceId' when calling responseRuleRetrieve(Async)");
        }

        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling responseRuleRetrieve(Async)");
        }

        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling responseRuleRetrieve(Async)");
        }

        // verify the required parameter 'responseRuleId' is set
        if (responseRuleId == null) {
            throw new ApiException("Missing the required parameter 'responseRuleId' when calling responseRuleRetrieve(Async)");
        }

        return responseRuleRetrieveCall(workspaceId, xApiKey, accept, responseRuleId, _callback);
    }

    private static ApiResponse<ResponseRule> responseRuleRetrieveWithHttpInfo(String workspaceId, String xApiKey, String accept, String responseRuleId) throws ApiException {
        okhttp3.Call localVarCall = responseRuleRetrieveCall(workspaceId, xApiKey, accept, responseRuleId, null);
        Type localVarReturnType = new TypeToken<ResponseRule>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private static okhttp3.Call responseRuleRetrieveAsync(String workspaceId, String xApiKey, String accept, String responseRuleId, final ApiCallback<ResponseRule> _callback) throws ApiException {
        okhttp3.Call localVarCall = responseRuleRetrieveValidateBeforeCall(workspaceId, xApiKey, accept, responseRuleId, _callback);
        Type localVarReturnType = new TypeToken<ResponseRule>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public static class ResponseRuleRetrieveParams {
        private String workspaceId;
        private String responseRuleId;

        private ResponseRuleRetrieveParams(
            String workspaceId,
            String responseRuleId
        ){
            this.workspaceId = workspaceId;
            this.responseRuleId = responseRuleId;
        }
            public String getWorkspaceId() {
                return workspaceId;
            }
            public String getResponseRuleId() {
                return responseRuleId;
            }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private String workspaceId;
            private String responseRuleId;

            public ResponseRuleRetrieveParams build() {
                return new ResponseRuleRetrieveParams(
                    workspaceId,
                    responseRuleId
                );
            }

            public Builder setWorkspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }
            public Builder setResponseRuleId(String responseRuleId) {
                this.responseRuleId = responseRuleId;
                return this;
            }
        }
        
    }

    public static class ResponseRuleRetrieveRequest {
        private final String workspaceId;
        private final String xApiKey;
        private final String accept;
        private final String responseRuleId;
        ApiResponse _lastResponse;

        private ResponseRuleRetrieveRequest(String workspaceId, String xApiKey, String accept, String responseRuleId) {
            this.workspaceId = workspaceId;
            this.xApiKey = xApiKey;
            this.accept = accept;
            this.responseRuleId = responseRuleId;
        }

        /**
         * Build call for responseRuleRetrieve
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return responseRuleRetrieveCall(workspaceId, xApiKey, accept, responseRuleId, _callback);
        }

        /**
         * Execute responseRuleRetrieve request
         * @return ResponseRule
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public ResponseRule execute() throws ApiException {
            ApiResponse<ResponseRule> localVarResp = responseRuleRetrieveWithHttpInfo(workspaceId, xApiKey, accept, responseRuleId);
            _lastResponse = localVarResp;
            ResponseRule data = localVarResp.getData();

            
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
         * Execute responseRuleRetrieve request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<ResponseRule> _callback) throws ApiException {
            return responseRuleRetrieveAsync(workspaceId, xApiKey, accept, responseRuleId, _callback);
        }
    }

    /**
     * Retrieve a response rule
     * @param params The param instance required to create ResponseRuleRetrieveRequest
     * @return ResponseRule
     */

    public static ResponseRule retrieve(Map<String, Object> params) throws ApiException {
        String workspaceId = (String) params.get("workspaceId");

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }
        String responseRuleId = (String) params.get("responseRuleId");

        if(responseRuleId == null || responseRuleId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'responseRuleId'");
        }
        ResponseRuleRetrieveParams tempParams = ResponseRuleRetrieveParams.builder()
            .setWorkspaceId(workspaceId)
            .setResponseRuleId(responseRuleId).build();

        return retrieve(tempParams);
    }

    public static ResponseRule retrieve(ResponseRuleRetrieveParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }


        String workspaceId = params.getWorkspaceId();

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }

        String accept = "application/vnd.whispir.responserule-v1+json";


        String responseRuleId = params.getResponseRuleId();

        if(responseRuleId == null || responseRuleId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'responseRuleId'");
        }
        ResponseRuleRetrieveRequest request = new ResponseRuleRetrieveRequest(workspaceId, xApiKey, accept, responseRuleId);

        // Ensure to include all of the 'optionalParams' that are passed

        return request.execute();
    }
    private static okhttp3.Call responseRuleUpdateCall(String workspaceId, String xApiKey, String contentType, String accept, String responseRuleId, ResponseRule responseRule, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = responseRule;

        // create path and map variables
        String localVarPath = "/workspaces/{workspaceId}/responserules/{responseRuleId}"
            .replace("{" + "workspaceId" + "}", localVarApiClient.escapeString(workspaceId.toString()))
            .replace("{" + "responseRuleId" + "}", localVarApiClient.escapeString(responseRuleId.toString()));

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
            "application/vnd.whispir.responserule-v1+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth", "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private static okhttp3.Call responseRuleUpdateValidateBeforeCall(String workspaceId, String xApiKey, String contentType, String accept, String responseRuleId, ResponseRule responseRule, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'workspaceId' is set
        if (workspaceId == null) {
            throw new ApiException("Missing the required parameter 'workspaceId' when calling responseRuleUpdate(Async)");
        }

        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling responseRuleUpdate(Async)");
        }

        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new ApiException("Missing the required parameter 'contentType' when calling responseRuleUpdate(Async)");
        }

        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling responseRuleUpdate(Async)");
        }

        // verify the required parameter 'responseRuleId' is set
        if (responseRuleId == null) {
            throw new ApiException("Missing the required parameter 'responseRuleId' when calling responseRuleUpdate(Async)");
        }

        // verify the required parameter 'responseRule' is set
        if (responseRule == null) {
            throw new ApiException("Missing the required parameter 'responseRule' when calling responseRuleUpdate(Async)");
        }

        return responseRuleUpdateCall(workspaceId, xApiKey, contentType, accept, responseRuleId, responseRule, _callback);
    }

    private static ApiResponse<Void> responseRuleUpdateWithHttpInfo(String workspaceId, String xApiKey, String contentType, String accept, String responseRuleId, ResponseRule responseRule) throws ApiException {
        okhttp3.Call localVarCall = responseRuleUpdateCall(workspaceId, xApiKey, contentType, accept, responseRuleId, responseRule, null);
        return localVarApiClient.execute(localVarCall);
    }

    private static okhttp3.Call responseRuleUpdateAsync(String workspaceId, String xApiKey, String contentType, String accept, String responseRuleId, ResponseRule responseRule, final ApiCallback<Void> _callback) throws ApiException {
        okhttp3.Call localVarCall = responseRuleUpdateValidateBeforeCall(workspaceId, xApiKey, contentType, accept, responseRuleId, responseRule, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public static class ResponseRuleUpdateParams {
        private String workspaceId;
        private String responseRuleId;
        private ResponseRule responseRule;
        private String name;
        private String description;
        private TemplatePattern responseTemplatePatterns;

        private ResponseRuleUpdateParams(
            String workspaceId,
            String responseRuleId,
            ResponseRule responseRule,
            String name,
            String description,
            TemplatePattern responseTemplatePatterns
        ){
            this.workspaceId = workspaceId;
            this.responseRuleId = responseRuleId;
            this.responseRule = responseRule;
            this.name = name;
            this.description = description;
            this.responseTemplatePatterns = responseTemplatePatterns;
        }
            public String getWorkspaceId() {
                return workspaceId;
            }
            public String getResponseRuleId() {
                return responseRuleId;
            }
            public ResponseRule getResponseRule() {
                return responseRule;
            }
            public String getName() {
                return name;
            }
            public String getDescription() {
                return description;
            }
            public TemplatePattern getResponseTemplatePatterns() {
                return responseTemplatePatterns;
            }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private String workspaceId;
            private String responseRuleId;
            private ResponseRule responseRule;
            private String name;
            private String description;
            private TemplatePattern responseTemplatePatterns;

            public ResponseRuleUpdateParams build() {
                return new ResponseRuleUpdateParams(
                    workspaceId,
                    responseRuleId,
                    responseRule,
                    name,
                    description,
                    responseTemplatePatterns
                );
            }

            public Builder setWorkspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }
            public Builder setResponseRuleId(String responseRuleId) {
                this.responseRuleId = responseRuleId;
                return this;
            }
            public Builder setResponseRule(ResponseRule responseRule) {
                this.responseRule = responseRule;
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
            public Builder setResponseTemplatePatterns(TemplatePattern responseTemplatePatterns) {
                this.responseTemplatePatterns = responseTemplatePatterns;
                return this;
            }
        }
        
        public static class TemplatePattern {
            private String name;
            private String pattern;
            private String textPrompt;
            private String voicePrompt;
            private String spokenVoicePrompt;
            private String colour;

            private TemplatePattern(String name, String pattern, String textPrompt, String voicePrompt, String spokenVoicePrompt, String colour){
            this.name = name;
            this.pattern = pattern;
            this.textPrompt = textPrompt;
            this.voicePrompt = voicePrompt;
            this.spokenVoicePrompt = spokenVoicePrompt;
            this.colour = colour;
            }

            public String getName(){
                return name;
            }
            public String getPattern(){
                return pattern;
            }
            public String getTextPrompt(){
                return textPrompt;
            }
            public String getVoicePrompt(){
                return voicePrompt;
            }
            public String getSpokenVoicePrompt(){
                return spokenVoicePrompt;
            }
            public String getColour(){
                return colour;
            }

            public static Builder builder() {
                return new Builder();
            }   

            public static class Builder {
                private String name;
                private String pattern;
                private String textPrompt;
                private String voicePrompt;
                private String spokenVoicePrompt;
                private String colour;

                public TemplatePattern build() {
                    return new TemplatePattern(
                        this.name,
                        this.pattern,
                        this.textPrompt,
                        this.voicePrompt,
                        this.spokenVoicePrompt,
                        this.colour
                    );
                }
                public Builder setName(String name) {
                    this.name = name;
                    return this;
                }
                public Builder setPattern(String pattern) {
                    this.pattern = pattern;
                    return this;
                }
                public Builder setTextPrompt(String textPrompt) {
                    this.textPrompt = textPrompt;
                    return this;
                }
                public Builder setVoicePrompt(String voicePrompt) {
                    this.voicePrompt = voicePrompt;
                    return this;
                }
                public Builder setSpokenVoicePrompt(String spokenVoicePrompt) {
                    this.spokenVoicePrompt = spokenVoicePrompt;
                    return this;
                }
                public Builder setColour(String colour) {
                    this.colour = colour;
                    return this;
                }
            }

    
        }

    }

    public static class ResponseRuleUpdateRequest {
        private final String workspaceId;
        private final String xApiKey;
        private final String contentType;
        private final String accept;
        private final String responseRuleId;
        private final ResponseRule responseRule;
        ApiResponse _lastResponse;

        private ResponseRuleUpdateRequest(String workspaceId, String xApiKey, String contentType, String accept, String responseRuleId, ResponseRule responseRule) {
            this.workspaceId = workspaceId;
            this.xApiKey = xApiKey;
            this.contentType = contentType;
            this.accept = accept;
            this.responseRuleId = responseRuleId;
            this.responseRule = responseRule;
        }

        /**
         * Build call for responseRuleUpdate
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return responseRuleUpdateCall(workspaceId, xApiKey, contentType, accept, responseRuleId, responseRule, _callback);
        }

        /**
         * Execute responseRuleUpdate request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public void execute() throws ApiException {
            responseRuleUpdateWithHttpInfo(workspaceId, xApiKey, contentType, accept, responseRuleId, responseRule);
        }
        /**
         * Return the last executed API response
         * @return ApiResponse
         */
        public ApiResponse getLastResponse()  {
            return _lastResponse;
        }


        /**
         * Execute responseRuleUpdate request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return responseRuleUpdateAsync(workspaceId, xApiKey, contentType, accept, responseRuleId, responseRule, _callback);
        }
    }

    /**
     * Update a response rule
     * @param params The param instance required to create ResponseRuleUpdateRequest
     * @return void
     */

    public static void update(Map<String, Object> params) throws ApiException {
        String workspaceId = (String) params.get("workspaceId");

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }
        String responseRuleId = (String) params.get("responseRuleId");

        if(responseRuleId == null || responseRuleId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'responseRuleId'");
        }
        String nameValue = (String) params.get("name");
        if(nameValue == null) {
            throw new ApiException("Missing the required property value of 'name'");
        }
        String descriptionValue = (String) params.get("description");
        Object responseTemplatePatternsValue = params.get("responseTemplatePatterns");
        if(responseTemplatePatternsValue == null) {
            throw new ApiException("Missing the required property value of 'responseTemplatePatterns'");
        }
        ResponseRuleUpdateParams tempParams = ResponseRuleUpdateParams.builder()
            .setWorkspaceId(workspaceId)
            .setResponseRuleId(responseRuleId)
            .setName(nameValue)
            .setDescription(descriptionValue)
            .setResponseTemplatePatterns((com.whispir.api.ResponseRulesApi.ResponseRuleUpdateParams.TemplatePattern) responseTemplatePatternsValue).build();

        update(tempParams);
    }

    public static void update(ResponseRuleUpdateParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }


        String workspaceId = params.getWorkspaceId();

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }

        String contentType = "application/vnd.whispir.responserule-v1+json";

        String accept = "application/vnd.whispir.responserule-v1+json";


        String responseRuleId = params.getResponseRuleId();

        if(responseRuleId == null || responseRuleId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'responseRuleId'");
        }

        // Constructing 'ResponseRule' from 'ResponseRuleUpdateParams' instance passed
        ResponseRule responseRule = new ResponseRule();
        String nameValue = params.getName();
        if(nameValue == null) {
            throw new ApiException("Missing the required property value of 'name'");
        }
        responseRule.setName(nameValue);

        String descriptionValue = params.getDescription();
        responseRule.setDescription(descriptionValue);

        Object responseTemplatePatternsValue = params.getResponseTemplatePatterns();
        if(responseTemplatePatternsValue == null) {
            throw new ApiException("Missing the required property value of 'responseTemplatePatterns'");
        }
        responseRule.setResponseTemplatePatterns((com.whispir.model.TemplatePattern) responseTemplatePatternsValue);

        ResponseRuleUpdateRequest request = new ResponseRuleUpdateRequest(workspaceId, xApiKey, contentType, accept, responseRuleId, responseRule);

        // Ensure to include all of the 'optionalParams' that are passed

        request.execute();
    }
}
