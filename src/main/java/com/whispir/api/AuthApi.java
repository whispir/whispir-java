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
import com.whispir.model.Auth;
import java.math.BigDecimal;

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

public class AuthApi {
    private static ApiClient localVarApiClient = Configuration.getDefaultApiClient();

    private static okhttp3.Call authCreateCall(String xApiKey, String contentType, String accept, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/auth";

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
            "application/vnd.whispir.auth-v1+json",
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
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private static okhttp3.Call authCreateValidateBeforeCall(String xApiKey, String contentType, String accept, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling authCreate(Async)");
        }

        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new ApiException("Missing the required parameter 'contentType' when calling authCreate(Async)");
        }

        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling authCreate(Async)");
        }

        return authCreateCall(xApiKey, contentType, accept, _callback);
    }

    private static ApiResponse<Auth> authCreateWithHttpInfo(String xApiKey, String contentType, String accept) throws ApiException {
        okhttp3.Call localVarCall = authCreateCall(xApiKey, contentType, accept, null);
        Type localVarReturnType = new TypeToken<Auth>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private static okhttp3.Call authCreateAsync(String xApiKey, String contentType, String accept, final ApiCallback<Auth> _callback) throws ApiException {
        okhttp3.Call localVarCall = authCreateValidateBeforeCall(xApiKey, contentType, accept, _callback);
        Type localVarReturnType = new TypeToken<Auth>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public static class AuthCreateParams {

        private AuthCreateParams(
        ){
        }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {

            public AuthCreateParams build() {
                return new AuthCreateParams(
                );
            }

        }
        
    }

    public static class AuthCreateRequest {
        private final String xApiKey;
        private final String contentType;
        private final String accept;
        ApiResponse _lastResponse;

        private AuthCreateRequest(String xApiKey, String contentType, String accept) {
            this.xApiKey = xApiKey;
            this.contentType = contentType;
            this.accept = accept;
        }

        /**
         * Build call for authCreate
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return authCreateCall(xApiKey, contentType, accept, _callback);
        }

        /**
         * Execute authCreate request
         * @return Auth
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public Auth execute() throws ApiException {
            ApiResponse<Auth> localVarResp = authCreateWithHttpInfo(xApiKey, contentType, accept);
            _lastResponse = localVarResp;
            Auth data = localVarResp.getData();

            
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
         * Execute authCreate request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<Auth> _callback) throws ApiException {
            return authCreateAsync(xApiKey, contentType, accept, _callback);
        }
    }

    /**
     * Create an auth token
     * @param params The param instance required to create AuthCreateRequest
     * @return Auth
     */

    public static Auth create(Map<String, Object> params) throws ApiException {
        AuthCreateParams tempParams = null;

        return create(tempParams);
    }

    public static Auth create(AuthCreateParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }


        String contentType = "application/vnd.whispir.auth-v1+json";

        String accept = "application/vnd.whispir.auth-v1+json";

        AuthCreateRequest request = new AuthCreateRequest(xApiKey, contentType, accept);

        // Ensure to include all of the 'optionalParams' that are passed

        return request.execute();
    }
    private static okhttp3.Call authVerificationRetrieveCall(String xApiKey, String accept, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/auth/verify";

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
    private static okhttp3.Call authVerificationRetrieveValidateBeforeCall(String xApiKey, String accept, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling authVerificationRetrieve(Async)");
        }

        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling authVerificationRetrieve(Async)");
        }

        return authVerificationRetrieveCall(xApiKey, accept, _callback);
    }

    private static ApiResponse<Void> authVerificationRetrieveWithHttpInfo(String xApiKey, String accept) throws ApiException {
        okhttp3.Call localVarCall = authVerificationRetrieveCall(xApiKey, accept, null);
        return localVarApiClient.execute(localVarCall);
    }

    private static okhttp3.Call authVerificationRetrieveAsync(String xApiKey, String accept, final ApiCallback<Void> _callback) throws ApiException {
        okhttp3.Call localVarCall = authVerificationRetrieveValidateBeforeCall(xApiKey, accept, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public static class AuthVerificationRetrieveParams {

        private AuthVerificationRetrieveParams(
        ){
        }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {

            public AuthVerificationRetrieveParams build() {
                return new AuthVerificationRetrieveParams(
                );
            }

        }
        
    }

    public static class AuthVerificationRetrieveRequest {
        private final String xApiKey;
        private final String accept;
        ApiResponse _lastResponse;

        private AuthVerificationRetrieveRequest(String xApiKey, String accept) {
            this.xApiKey = xApiKey;
            this.accept = accept;
        }

        /**
         * Build call for authVerificationRetrieve
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return authVerificationRetrieveCall(xApiKey, accept, _callback);
        }

        /**
         * Execute authVerificationRetrieve request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public void execute() throws ApiException {
            authVerificationRetrieveWithHttpInfo(xApiKey, accept);
        }
        /**
         * Return the last executed API response
         * @return ApiResponse
         */
        public ApiResponse getLastResponse()  {
            return _lastResponse;
        }


        /**
         * Execute authVerificationRetrieve request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return authVerificationRetrieveAsync(xApiKey, accept, _callback);
        }
    }

    /**
     * Verify an auth token
     * @param params The param instance required to create AuthVerificationRetrieveRequest
     * @return void
     */

    public static void retrieveVerification(Map<String, Object> params) throws ApiException {
        AuthVerificationRetrieveParams tempParams = null;

        retrieveVerification(tempParams);
    }

    public static void retrieveVerification(AuthVerificationRetrieveParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }


        String accept = "application/vnd.whispir.auth-v1+json";

        AuthVerificationRetrieveRequest request = new AuthVerificationRetrieveRequest(xApiKey, accept);

        // Ensure to include all of the 'optionalParams' that are passed

        request.execute();
    }
}
