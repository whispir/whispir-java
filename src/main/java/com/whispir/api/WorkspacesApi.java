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
import com.whispir.model.Workspace;
import com.whispir.model.WorkspaceCollection;

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

public class WorkspacesApi {
    private static ApiClient localVarApiClient = Configuration.getDefaultApiClient();

    private static okhttp3.Call workspaceCreateCall(String xApiKey, String contentType, String accept, Workspace workspace, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = workspace;

        // create path and map variables
        String localVarPath = "/workspaces";

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
            "application/vnd.whispir.workspace-v1+json",
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/vnd.whispir.workspace-v1+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth", "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private static okhttp3.Call workspaceCreateValidateBeforeCall(String xApiKey, String contentType, String accept, Workspace workspace, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling workspaceCreate(Async)");
        }

        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new ApiException("Missing the required parameter 'contentType' when calling workspaceCreate(Async)");
        }

        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling workspaceCreate(Async)");
        }

        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new ApiException("Missing the required parameter 'workspace' when calling workspaceCreate(Async)");
        }

        return workspaceCreateCall(xApiKey, contentType, accept, workspace, _callback);
    }

    private static ApiResponse<Workspace> workspaceCreateWithHttpInfo(String xApiKey, String contentType, String accept, Workspace workspace) throws ApiException {
        okhttp3.Call localVarCall = workspaceCreateCall(xApiKey, contentType, accept, workspace, null);
        Type localVarReturnType = new TypeToken<Workspace>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private static okhttp3.Call workspaceCreateAsync(String xApiKey, String contentType, String accept, Workspace workspace, final ApiCallback<Workspace> _callback) throws ApiException {
        okhttp3.Call localVarCall = workspaceCreateValidateBeforeCall(xApiKey, contentType, accept, workspace, _callback);
        Type localVarReturnType = new TypeToken<Workspace>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public static class WorkspaceCreateParams {
        private Workspace workspace;
        private String projectName;
        private String projectNumber;
        private String status;
        private String billingcostcentre;

        private WorkspaceCreateParams(
            Workspace workspace,
            String projectName,
            String projectNumber,
            String status,
            String billingcostcentre
        ){
            this.workspace = workspace;
            this.projectName = projectName;
            this.projectNumber = projectNumber;
            this.status = status;
            this.billingcostcentre = billingcostcentre;
        }
            public Workspace getWorkspace() {
                return workspace;
            }
            public String getProjectName() {
                return projectName;
            }
            public String getProjectNumber() {
                return projectNumber;
            }
            public String getStatus() {
                return status;
            }
            public String getBillingcostcentre() {
                return billingcostcentre;
            }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private Workspace workspace;
            private String projectName;
            private String projectNumber;
            private String status;
            private String billingcostcentre;

            public WorkspaceCreateParams build() {
                return new WorkspaceCreateParams(
                    workspace,
                    projectName,
                    projectNumber,
                    status,
                    billingcostcentre
                );
            }

            public Builder setWorkspace(Workspace workspace) {
                this.workspace = workspace;
                return this;
            }
            public Builder setProjectName(String projectName) {
                this.projectName = projectName;
                return this;
            }
            public Builder setProjectNumber(String projectNumber) {
                this.projectNumber = projectNumber;
                return this;
            }
            public Builder setStatus(String status) {
                this.status = status;
                return this;
            }
            public Builder setBillingcostcentre(String billingcostcentre) {
                this.billingcostcentre = billingcostcentre;
                return this;
            }
        }
        

    }

    public static class WorkspaceCreateRequest {
        private final String xApiKey;
        private final String contentType;
        private final String accept;
        private final Workspace workspace;
        ApiResponse _lastResponse;

        private WorkspaceCreateRequest(String xApiKey, String contentType, String accept, Workspace workspace) {
            this.xApiKey = xApiKey;
            this.contentType = contentType;
            this.accept = accept;
            this.workspace = workspace;
        }

        /**
         * Build call for workspaceCreate
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return workspaceCreateCall(xApiKey, contentType, accept, workspace, _callback);
        }

        /**
         * Execute workspaceCreate request
         * @return Workspace
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public Workspace execute() throws ApiException {
            ApiResponse<Workspace> localVarResp = workspaceCreateWithHttpInfo(xApiKey, contentType, accept, workspace);
            _lastResponse = localVarResp;
            Workspace data = localVarResp.getData();

            
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
         * Execute workspaceCreate request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<Workspace> _callback) throws ApiException {
            return workspaceCreateAsync(xApiKey, contentType, accept, workspace, _callback);
        }
    }

    /**
     * Create a workspace
     * @param params The param instance required to create WorkspaceCreateRequest
     * @return Workspace
     */

    public static Workspace create(Map<String, Object> params) throws ApiException {
        String projectNameValue = (String) params.get("projectName");
        if(projectNameValue == null) {
            throw new ApiException("Missing the required property value of 'projectName'");
        }
        String projectNumberValue = (String) params.get("projectNumber");
        String statusValue = (String) params.get("status");
        if(statusValue == null) {
            throw new ApiException("Missing the required property value of 'status'");
        }
        String billingcostcentreValue = (String) params.get("billingcostcentre");
        WorkspaceCreateParams tempParams = WorkspaceCreateParams.builder()
            .setProjectName(projectNameValue)
            .setProjectNumber(projectNumberValue)
            .setStatus(statusValue)
            .setBillingcostcentre(billingcostcentreValue).build();

        return create(tempParams);
    }

    public static Workspace create(WorkspaceCreateParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }


        String contentType = "application/vnd.whispir.workspace-v1+json";

        String accept = "application/vnd.whispir.workspace-v1+json";


        // Constructing 'Workspace' from 'WorkspaceCreateParams' instance passed
        Workspace workspace = new Workspace();
        String projectNameValue = params.getProjectName();
        if(projectNameValue == null) {
            throw new ApiException("Missing the required property value of 'projectName'");
        }
        workspace.setProjectName(projectNameValue);

        String projectNumberValue = params.getProjectNumber();
        workspace.setProjectNumber(projectNumberValue);

        String statusValue = params.getStatus();
        if(statusValue == null) {
            throw new ApiException("Missing the required property value of 'status'");
        }
        workspace.setStatus(statusValue);

        String billingcostcentreValue = params.getBillingcostcentre();
        workspace.setBillingcostcentre(billingcostcentreValue);

        WorkspaceCreateRequest request = new WorkspaceCreateRequest(xApiKey, contentType, accept, workspace);

        // Ensure to include all of the 'optionalParams' that are passed

        return request.execute();
    }
    private static okhttp3.Call workspaceListCall(String xApiKey, String accept, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/workspaces";

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
            "application/vnd.whispir.workspace-v1+json",
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
    private static okhttp3.Call workspaceListValidateBeforeCall(String xApiKey, String accept, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling workspaceList(Async)");
        }

        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling workspaceList(Async)");
        }

        return workspaceListCall(xApiKey, accept, limit, offset, sortOrder, sortFields, _callback);
    }

    private static ApiResponse<WorkspaceCollection> workspaceListWithHttpInfo(String xApiKey, String accept, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields) throws ApiException {
        okhttp3.Call localVarCall = workspaceListCall(xApiKey, accept, limit, offset, sortOrder, sortFields, null);
        Type localVarReturnType = new TypeToken<WorkspaceCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private static okhttp3.Call workspaceListAsync(String xApiKey, String accept, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields, final ApiCallback<WorkspaceCollection> _callback) throws ApiException {
        okhttp3.Call localVarCall = workspaceListValidateBeforeCall(xApiKey, accept, limit, offset, sortOrder, sortFields, _callback);
        Type localVarReturnType = new TypeToken<WorkspaceCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public static class WorkspaceListParams {
        private BigDecimal limit;
        private BigDecimal offset;
        private String sortOrder;
        private String sortFields;

        private WorkspaceListParams(
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

            public WorkspaceListParams build() {
                return new WorkspaceListParams(
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

    public static class WorkspaceListRequest {
        private final String xApiKey;
        private final String accept;
        private BigDecimal limit;
        private BigDecimal offset;
        private String sortOrder;
        private String sortFields;
        ApiResponse _lastResponse;

        private WorkspaceListRequest(String xApiKey, String accept) {
            this.xApiKey = xApiKey;
            this.accept = accept;
        }

        /**
         * Set limit
         * @param limit The number of records to be returned. (optional, default to 20)
         * @return APIworkspaceListRequest
         */
        public WorkspaceListRequest limit(BigDecimal limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Set offset
         * @param offset The record number to start returning from. (optional, default to 0)
         * @return APIworkspaceListRequest
         */
        public WorkspaceListRequest offset(BigDecimal offset) {
            this.offset = offset;
            return this;
        }

        /**
         * Set sortOrder
         * @param sortOrder The order in which you require the results to be returned. Either ‘asc’ or ‘desc’ (optional)
         * @return APIworkspaceListRequest
         */
        public WorkspaceListRequest sortOrder(String sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * Set sortFields
         * @param sortFields The fields that you require the ordering to be performed on. Multiple fields can be provided, separated by a comma. (optional)
         * @return APIworkspaceListRequest
         */
        public WorkspaceListRequest sortFields(String sortFields) {
            this.sortFields = sortFields;
            return this;
        }

        /**
         * Build call for workspaceList
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return workspaceListCall(xApiKey, accept, limit, offset, sortOrder, sortFields, _callback);
        }

        /**
         * Execute workspaceList request
         * @return WorkspaceCollection
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public WorkspaceCollection execute() throws ApiException {
            ApiResponse<WorkspaceCollection> localVarResp = workspaceListWithHttpInfo(xApiKey, accept, limit, offset, sortOrder, sortFields);
            _lastResponse = localVarResp;
            WorkspaceCollection data = localVarResp.getData();

            
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
         * Execute workspaceList request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<WorkspaceCollection> _callback) throws ApiException {
            return workspaceListAsync(xApiKey, accept, limit, offset, sortOrder, sortFields, _callback);
        }
    }

    /**
     * List workspaces
     * @param params The param instance required to create WorkspaceListRequest
     * @return WorkspaceCollection
     */

    public static WorkspaceCollection list(Map<String, Object> params) throws ApiException {
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
        WorkspaceListParams tempParams = WorkspaceListParams.builder()
            .setLimit(limit)
            .setOffset(offset)
            .setSortOrder(sortOrder)
            .setSortFields(sortFields).build();

        return list(tempParams);
    }

    public static WorkspaceCollection list(WorkspaceListParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }


        String accept = "application/vnd.whispir.workspace-v1+json";

        WorkspaceListRequest request = new WorkspaceListRequest(xApiKey, accept);

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
    private static okhttp3.Call workspaceRetrieveCall(String xApiKey, String accept, String workspaceId, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/workspaces/{workspaceId}"
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

        if (accept != null) {
            localVarHeaderParams.put("Accept", localVarApiClient.parameterToString(accept));
        }

        final String[] localVarAccepts = {
            "application/vnd.whispir.workspace-v1+json",
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
    private static okhttp3.Call workspaceRetrieveValidateBeforeCall(String xApiKey, String accept, String workspaceId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling workspaceRetrieve(Async)");
        }

        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling workspaceRetrieve(Async)");
        }

        // verify the required parameter 'workspaceId' is set
        if (workspaceId == null) {
            throw new ApiException("Missing the required parameter 'workspaceId' when calling workspaceRetrieve(Async)");
        }

        return workspaceRetrieveCall(xApiKey, accept, workspaceId, _callback);
    }

    private static ApiResponse<Workspace> workspaceRetrieveWithHttpInfo(String xApiKey, String accept, String workspaceId) throws ApiException {
        okhttp3.Call localVarCall = workspaceRetrieveCall(xApiKey, accept, workspaceId, null);
        Type localVarReturnType = new TypeToken<Workspace>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private static okhttp3.Call workspaceRetrieveAsync(String xApiKey, String accept, String workspaceId, final ApiCallback<Workspace> _callback) throws ApiException {
        okhttp3.Call localVarCall = workspaceRetrieveValidateBeforeCall(xApiKey, accept, workspaceId, _callback);
        Type localVarReturnType = new TypeToken<Workspace>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public static class WorkspaceRetrieveParams {
        private String workspaceId;

        private WorkspaceRetrieveParams(
            String workspaceId
        ){
            this.workspaceId = workspaceId;
        }
            public String getWorkspaceId() {
                return workspaceId;
            }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private String workspaceId;

            public WorkspaceRetrieveParams build() {
                return new WorkspaceRetrieveParams(
                    workspaceId
                );
            }

            public Builder setWorkspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }
        }
        
    }

    public static class WorkspaceRetrieveRequest {
        private final String xApiKey;
        private final String accept;
        private final String workspaceId;
        ApiResponse _lastResponse;

        private WorkspaceRetrieveRequest(String xApiKey, String accept, String workspaceId) {
            this.xApiKey = xApiKey;
            this.accept = accept;
            this.workspaceId = workspaceId;
        }

        /**
         * Build call for workspaceRetrieve
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return workspaceRetrieveCall(xApiKey, accept, workspaceId, _callback);
        }

        /**
         * Execute workspaceRetrieve request
         * @return Workspace
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public Workspace execute() throws ApiException {
            ApiResponse<Workspace> localVarResp = workspaceRetrieveWithHttpInfo(xApiKey, accept, workspaceId);
            _lastResponse = localVarResp;
            Workspace data = localVarResp.getData();

            
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
         * Execute workspaceRetrieve request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<Workspace> _callback) throws ApiException {
            return workspaceRetrieveAsync(xApiKey, accept, workspaceId, _callback);
        }
    }

    /**
     * Retrieve a workspace
     * @param params The param instance required to create WorkspaceRetrieveRequest
     * @return Workspace
     */

    public static Workspace retrieve(Map<String, Object> params) throws ApiException {
        String workspaceId = (String) params.get("workspaceId");

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }
        WorkspaceRetrieveParams tempParams = WorkspaceRetrieveParams.builder()
            .setWorkspaceId(workspaceId).build();

        return retrieve(tempParams);
    }

    public static Workspace retrieve(WorkspaceRetrieveParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }


        String accept = "application/vnd.whispir.workspace-v1+json";


        String workspaceId = params.getWorkspaceId();

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }
        WorkspaceRetrieveRequest request = new WorkspaceRetrieveRequest(xApiKey, accept, workspaceId);

        // Ensure to include all of the 'optionalParams' that are passed

        return request.execute();
    }
    private static okhttp3.Call workspaceUpdateCall(String xApiKey, String contentType, String accept, String workspaceId, Workspace workspace, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = workspace;

        // create path and map variables
        String localVarPath = "/workspaces/{workspaceId}"
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
            "application/vnd.whispir.workspace-v1+json",
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/vnd.whispir.workspace-v1+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth", "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private static okhttp3.Call workspaceUpdateValidateBeforeCall(String xApiKey, String contentType, String accept, String workspaceId, Workspace workspace, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling workspaceUpdate(Async)");
        }

        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new ApiException("Missing the required parameter 'contentType' when calling workspaceUpdate(Async)");
        }

        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling workspaceUpdate(Async)");
        }

        // verify the required parameter 'workspaceId' is set
        if (workspaceId == null) {
            throw new ApiException("Missing the required parameter 'workspaceId' when calling workspaceUpdate(Async)");
        }

        return workspaceUpdateCall(xApiKey, contentType, accept, workspaceId, workspace, _callback);
    }

    private static ApiResponse<Workspace> workspaceUpdateWithHttpInfo(String xApiKey, String contentType, String accept, String workspaceId, Workspace workspace) throws ApiException {
        okhttp3.Call localVarCall = workspaceUpdateCall(xApiKey, contentType, accept, workspaceId, workspace, null);
        Type localVarReturnType = new TypeToken<Workspace>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private static okhttp3.Call workspaceUpdateAsync(String xApiKey, String contentType, String accept, String workspaceId, Workspace workspace, final ApiCallback<Workspace> _callback) throws ApiException {
        okhttp3.Call localVarCall = workspaceUpdateValidateBeforeCall(xApiKey, contentType, accept, workspaceId, workspace, _callback);
        Type localVarReturnType = new TypeToken<Workspace>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public static class WorkspaceUpdateParams {
        private String workspaceId;
        private Workspace workspace;

        private WorkspaceUpdateParams(
            String workspaceId,
            Workspace workspace
        ){
            this.workspaceId = workspaceId;
            this.workspace = workspace;
        }
            public String getWorkspaceId() {
                return workspaceId;
            }
            public Workspace getWorkspace() {
                return workspace;
            }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private String workspaceId;
            private Workspace workspace;

            public WorkspaceUpdateParams build() {
                return new WorkspaceUpdateParams(
                    workspaceId,
                    workspace
                );
            }

            public Builder setWorkspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }
            public Builder setWorkspace(Workspace workspace) {
                this.workspace = workspace;
                return this;
            }
        }
        
    }

    public static class WorkspaceUpdateRequest {
        private final String xApiKey;
        private final String contentType;
        private final String accept;
        private final String workspaceId;
        private Workspace workspace;
        ApiResponse _lastResponse;

        private WorkspaceUpdateRequest(String xApiKey, String contentType, String accept, String workspaceId) {
            this.xApiKey = xApiKey;
            this.contentType = contentType;
            this.accept = accept;
            this.workspaceId = workspaceId;
        }

        /**
         * Set workspace
         * @param workspace Update a workspace (optional)
         * @return APIworkspaceUpdateRequest
         */
        public WorkspaceUpdateRequest workspace(Workspace workspace) {
            this.workspace = workspace;
            return this;
        }

        /**
         * Build call for workspaceUpdate
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return workspaceUpdateCall(xApiKey, contentType, accept, workspaceId, workspace, _callback);
        }

        /**
         * Execute workspaceUpdate request
         * @return Workspace
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public Workspace execute() throws ApiException {
            ApiResponse<Workspace> localVarResp = workspaceUpdateWithHttpInfo(xApiKey, contentType, accept, workspaceId, workspace);
            _lastResponse = localVarResp;
            Workspace data = localVarResp.getData();

            
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
         * Execute workspaceUpdate request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<Workspace> _callback) throws ApiException {
            return workspaceUpdateAsync(xApiKey, contentType, accept, workspaceId, workspace, _callback);
        }
    }

    /**
     * Update a workspace
     * @param params The param instance required to create WorkspaceUpdateRequest
     * @return Workspace
     */

    public static Workspace update(Map<String, Object> params) throws ApiException {
        Workspace workspace = null;
        if(params.containsKey("workspace") && params.get("workspace") != null){
            workspace = (Workspace) params.get("workspace");
        }
        String workspaceId = (String) params.get("workspaceId");

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }
        WorkspaceUpdateParams tempParams = WorkspaceUpdateParams.builder()
            .setWorkspaceId(workspaceId)
            .setWorkspace(workspace).build();

        return update(tempParams);
    }

    public static Workspace update(WorkspaceUpdateParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }


        String contentType = "application/vnd.whispir.workspace-v1+json";

        String accept = "application/vnd.whispir.workspace-v1+json";


        String workspaceId = params.getWorkspaceId();

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }
        WorkspaceUpdateRequest request = new WorkspaceUpdateRequest(xApiKey, contentType, accept, workspaceId);

        // Ensure to include all of the 'optionalParams' that are passed
        if(params.workspace != null){
            Workspace workspace = params.getWorkspace();
            request.workspace(workspace);
        }

        return request.execute();
    }
}
