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
import com.whispir.model.ModelImport;

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

public class ImportsApi {
    private static ApiClient localVarApiClient = Configuration.getDefaultApiClient();

    private static okhttp3.Call importCreateCall(String workspaceId, String xApiKey, String contentType, String accept, ModelImport modelImport, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = modelImport;

        // create path and map variables
        String localVarPath = "/workspaces/{workspaceId}/imports"
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
            "application/vnd.whispir.importcontact-v1+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth", "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private static okhttp3.Call importCreateValidateBeforeCall(String workspaceId, String xApiKey, String contentType, String accept, ModelImport modelImport, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'workspaceId' is set
        if (workspaceId == null) {
            throw new ApiException("Missing the required parameter 'workspaceId' when calling importCreate(Async)");
        }

        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling importCreate(Async)");
        }

        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new ApiException("Missing the required parameter 'contentType' when calling importCreate(Async)");
        }

        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling importCreate(Async)");
        }

        return importCreateCall(workspaceId, xApiKey, contentType, accept, modelImport, _callback);
    }

    private static ApiResponse<Void> importCreateWithHttpInfo(String workspaceId, String xApiKey, String contentType, String accept, ModelImport modelImport) throws ApiException {
        okhttp3.Call localVarCall = importCreateCall(workspaceId, xApiKey, contentType, accept, modelImport, null);
        return localVarApiClient.execute(localVarCall);
    }

    private static okhttp3.Call importCreateAsync(String workspaceId, String xApiKey, String contentType, String accept, ModelImport modelImport, final ApiCallback<Void> _callback) throws ApiException {
        okhttp3.Call localVarCall = importCreateValidateBeforeCall(workspaceId, xApiKey, contentType, accept, modelImport, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public static class ImportCreateParams {
        private String workspaceId;
        private ModelImport modelImport;

        private ImportCreateParams(
            String workspaceId,
            ModelImport modelImport
        ){
            this.workspaceId = workspaceId;
            this.modelImport = modelImport;
        }
            public String getWorkspaceId() {
                return workspaceId;
            }
            public ModelImport getModelImport() {
                return modelImport;
            }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private String workspaceId;
            private ModelImport modelImport;

            public ImportCreateParams build() {
                return new ImportCreateParams(
                    workspaceId,
                    modelImport
                );
            }

            public Builder setWorkspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }
            public Builder setModelImport(ModelImport modelImport) {
                this.modelImport = modelImport;
                return this;
            }
        }
        
    }

    public static class ImportCreateRequest {
        private final String workspaceId;
        private final String xApiKey;
        private final String contentType;
        private final String accept;
        private ModelImport modelImport;
        ApiResponse _lastResponse;

        private ImportCreateRequest(String workspaceId, String xApiKey, String contentType, String accept) {
            this.workspaceId = workspaceId;
            this.xApiKey = xApiKey;
            this.contentType = contentType;
            this.accept = accept;
        }

        /**
         * Set modelImport
         * @param modelImport import object that needs to be create import (optional)
         * @return APIimportCreateRequest
         */
        public ImportCreateRequest modelImport(ModelImport modelImport) {
            this.modelImport = modelImport;
            return this;
        }

        /**
         * Build call for importCreate
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return importCreateCall(workspaceId, xApiKey, contentType, accept, modelImport, _callback);
        }

        /**
         * Execute importCreate request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public void execute() throws ApiException {
            importCreateWithHttpInfo(workspaceId, xApiKey, contentType, accept, modelImport);
        }
        /**
         * Return the last executed API response
         * @return ApiResponse
         */
        public ApiResponse getLastResponse()  {
            return _lastResponse;
        }


        /**
         * Execute importCreate request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return importCreateAsync(workspaceId, xApiKey, contentType, accept, modelImport, _callback);
        }
    }

    /**
     * Create an import
     * @param params The param instance required to create ImportCreateRequest
     * @return void
     */

    public static void create(Map<String, Object> params) throws ApiException {
        ModelImport modelImport = null;
        if(params.containsKey("modelImport") && params.get("modelImport") != null){
            modelImport = (ModelImport) params.get("modelImport");
        }
        String workspaceId = (String) params.get("workspaceId");

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }
        ImportCreateParams tempParams = ImportCreateParams.builder()
            .setWorkspaceId(workspaceId)
            .setModelImport(modelImport).build();

        create(tempParams);
    }

    public static void create(ImportCreateParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }


        String workspaceId = params.getWorkspaceId();

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }

        String contentType = "application/vnd.whispir.importcontact-v1+json";

        String accept = "application/vnd.whispir.importcontact-v1+json";

        ImportCreateRequest request = new ImportCreateRequest(workspaceId, xApiKey, contentType, accept);

        // Ensure to include all of the 'optionalParams' that are passed
        if(params.modelImport != null){
            ModelImport modelImport = params.getModelImport();
            request.modelImport(modelImport);
        }

        request.execute();
    }
}
