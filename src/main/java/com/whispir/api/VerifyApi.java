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
import com.whispir.model.ApiErrorNextGen;
import java.math.BigDecimal;
import com.whispir.model.Otp;
import com.whispir.model.SendCodeCreateRequest;
import com.whispir.model.VerifyCodeCreateRequest;

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

public class VerifyApi {
    private static ApiClient localVarApiClient = Configuration.getDefaultApiClient();

    private static okhttp3.Call sendCodeCreateCall(String contentType, String accept, SendCodeCreateRequest sendCodeCreateRequest, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = sendCodeCreateRequest;

        // create path and map variables
        String localVarPath = "/otp/send-code";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarHeaderParams.put("Authorization", String.format("Basic %s", authHeader));
        localVarHeaderParams.put("User-Agent", String.format("whispir-java-%s", Version.VERSION));

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
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth", "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private static okhttp3.Call sendCodeCreateValidateBeforeCall(String contentType, String accept, SendCodeCreateRequest sendCodeCreateRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new ApiException("Missing the required parameter 'contentType' when calling sendCodeCreate(Async)");
        }

        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling sendCodeCreate(Async)");
        }

        return sendCodeCreateCall(contentType, accept, sendCodeCreateRequest, _callback);
    }

    private static ApiResponse<Otp> sendCodeCreateWithHttpInfo(String contentType, String accept, SendCodeCreateRequest sendCodeCreateRequest) throws ApiException {
        okhttp3.Call localVarCall = sendCodeCreateCall(contentType, accept, sendCodeCreateRequest, null);
        Type localVarReturnType = new TypeToken<Otp>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private static okhttp3.Call sendCodeCreateAsync(String contentType, String accept, SendCodeCreateRequest sendCodeCreateRequest, final ApiCallback<Otp> _callback) throws ApiException {
        okhttp3.Call localVarCall = sendCodeCreateValidateBeforeCall(contentType, accept, sendCodeCreateRequest, _callback);
        Type localVarReturnType = new TypeToken<Otp>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public static class SendCodeCreateParams {
        private String contentType;
        private String accept;
        private SendCodeCreateRequest sendCodeCreateRequest;

        private SendCodeCreateParams(
            String contentType,
            String accept,
            SendCodeCreateRequest sendCodeCreateRequest
        ){
            this.contentType = contentType;
            this.accept = accept;
            this.sendCodeCreateRequest = sendCodeCreateRequest;
        }
            public String getContentType() {
                return contentType;
            }
            public String getAccept() {
                return accept;
            }
            public SendCodeCreateRequest getSendCodeCreateRequest() {
                return sendCodeCreateRequest;
            }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private String contentType;
            private String accept;
            private SendCodeCreateRequest sendCodeCreateRequest;

            public SendCodeCreateParams build() {
                return new SendCodeCreateParams(
                    contentType,
                    accept,
                    sendCodeCreateRequest
                );
            }

            public Builder setContentType(String contentType) {
                this.contentType = contentType;
                return this;
            }
            public Builder setAccept(String accept) {
                this.accept = accept;
                return this;
            }
            public Builder setSendCodeCreateRequest(SendCodeCreateRequest sendCodeCreateRequest) {
                this.sendCodeCreateRequest = sendCodeCreateRequest;
                return this;
            }
        }
        
    }

    public static class SendCodeCreateRequest {
        private final String contentType;
        private final String accept;
        private SendCodeCreateRequest sendCodeCreateRequest;
        ApiResponse _lastResponse;

        private SendCodeCreateRequest(String contentType, String accept) {
            this.contentType = contentType;
            this.accept = accept;
        }

        /**
         * Set sendCodeCreateRequest
         * @param sendCodeCreateRequest  (optional)
         * @return APIsendCodeCreateRequest
         */
        public SendCodeCreateRequest sendCodeCreateRequest(SendCodeCreateRequest sendCodeCreateRequest) {
            this.sendCodeCreateRequest = sendCodeCreateRequest;
            return this;
        }

        /**
         * Build call for sendCodeCreate
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return sendCodeCreateCall(contentType, accept, sendCodeCreateRequest, _callback);
        }

        /**
         * Execute sendCodeCreate request
         * @return Otp
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public Otp execute() throws ApiException {
            ApiResponse<Otp> localVarResp = sendCodeCreateWithHttpInfo(contentType, accept, sendCodeCreateRequest);
            _lastResponse = localVarResp;
            Otp data = localVarResp.getData();

            
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
         * Execute sendCodeCreate request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<Otp> _callback) throws ApiException {
            return sendCodeCreateAsync(contentType, accept, sendCodeCreateRequest, _callback);
        }
    }

    /**
     * Send Code
     * @param params The param instance required to create SendCodeCreateRequest
     * @return Otp
     */

    public static Otp create(Map<String, Object> params) throws ApiException {
        SendCodeCreateRequest sendCodeCreateRequest = null;
        if(params.containsKey("sendCodeCreateRequest") && params.get("sendCodeCreateRequest") != null){
            sendCodeCreateRequest = (SendCodeCreateRequest) params.get("sendCodeCreateRequest");
        }
        String contentType = (String) params.get("contentType");

        if(contentType == null || contentType.isEmpty()) {
            throw new ApiException("Missing the required parameter 'contentType'");
        }
        String accept = (String) params.get("accept");

        if(accept == null || accept.isEmpty()) {
            throw new ApiException("Missing the required parameter 'accept'");
        }
        SendCodeCreateParams tempParams = SendCodeCreateParams.builder()
            .setContent-Type(Content-Type)
            .setAccept(Accept)
            .setSendCodeCreateRequest(sendCodeCreateRequest).build();

        return create(tempParams);
    }

    public static Otp create(SendCodeCreateParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }


        String contentType = params.getContentType();

        if(contentType == null || contentType.isEmpty()) {
            throw new ApiException("Missing the required parameter 'contentType'");
        }

        String accept = params.getAccept();

        if(accept == null || accept.isEmpty()) {
            throw new ApiException("Missing the required parameter 'accept'");
        }
        SendCodeCreateRequest request = new SendCodeCreateRequest(contentType, accept);

        // Ensure to include all of the 'optionalParams' that are passed
        if(params.sendCodeCreateRequest != null){
            SendCodeCreateRequest sendCodeCreateRequest = params.getSendCodeCreateRequest();
            request.sendCodeCreateRequest(sendCodeCreateRequest);
        }

        return request.execute();
    }
    private static okhttp3.Call verifyCodeCreateCall(String otpId, String contentType, String accept, VerifyCodeCreateRequest verifyCodeCreateRequest, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = verifyCodeCreateRequest;

        // create path and map variables
        String localVarPath = "/otp/{otpId}/verify-code"
            .replace("{" + "otpId" + "}", localVarApiClient.escapeString(otpId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarHeaderParams.put("Authorization", String.format("Basic %s", authHeader));
        localVarHeaderParams.put("User-Agent", String.format("whispir-java-%s", Version.VERSION));

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
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth", "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private static okhttp3.Call verifyCodeCreateValidateBeforeCall(String otpId, String contentType, String accept, VerifyCodeCreateRequest verifyCodeCreateRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'otpId' is set
        if (otpId == null) {
            throw new ApiException("Missing the required parameter 'otpId' when calling verifyCodeCreate(Async)");
        }

        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new ApiException("Missing the required parameter 'contentType' when calling verifyCodeCreate(Async)");
        }

        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling verifyCodeCreate(Async)");
        }

        return verifyCodeCreateCall(otpId, contentType, accept, verifyCodeCreateRequest, _callback);
    }

    private static ApiResponse<Otp> verifyCodeCreateWithHttpInfo(String otpId, String contentType, String accept, VerifyCodeCreateRequest verifyCodeCreateRequest) throws ApiException {
        okhttp3.Call localVarCall = verifyCodeCreateCall(otpId, contentType, accept, verifyCodeCreateRequest, null);
        Type localVarReturnType = new TypeToken<Otp>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private static okhttp3.Call verifyCodeCreateAsync(String otpId, String contentType, String accept, VerifyCodeCreateRequest verifyCodeCreateRequest, final ApiCallback<Otp> _callback) throws ApiException {
        okhttp3.Call localVarCall = verifyCodeCreateValidateBeforeCall(otpId, contentType, accept, verifyCodeCreateRequest, _callback);
        Type localVarReturnType = new TypeToken<Otp>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public static class VerifyCodeCreateParams {
        private String otpId;
        private String contentType;
        private String accept;
        private VerifyCodeCreateRequest verifyCodeCreateRequest;

        private VerifyCodeCreateParams(
            String otpId,
            String contentType,
            String accept,
            VerifyCodeCreateRequest verifyCodeCreateRequest
        ){
            this.otpId = otpId;
            this.contentType = contentType;
            this.accept = accept;
            this.verifyCodeCreateRequest = verifyCodeCreateRequest;
        }
            public String getOtpId() {
                return otpId;
            }
            public String getContentType() {
                return contentType;
            }
            public String getAccept() {
                return accept;
            }
            public VerifyCodeCreateRequest getVerifyCodeCreateRequest() {
                return verifyCodeCreateRequest;
            }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private String otpId;
            private String contentType;
            private String accept;
            private VerifyCodeCreateRequest verifyCodeCreateRequest;

            public VerifyCodeCreateParams build() {
                return new VerifyCodeCreateParams(
                    otpId,
                    contentType,
                    accept,
                    verifyCodeCreateRequest
                );
            }

            public Builder setOtpId(String otpId) {
                this.otpId = otpId;
                return this;
            }
            public Builder setContentType(String contentType) {
                this.contentType = contentType;
                return this;
            }
            public Builder setAccept(String accept) {
                this.accept = accept;
                return this;
            }
            public Builder setVerifyCodeCreateRequest(VerifyCodeCreateRequest verifyCodeCreateRequest) {
                this.verifyCodeCreateRequest = verifyCodeCreateRequest;
                return this;
            }
        }
        
    }

    public static class VerifyCodeCreateRequest {
        private final String otpId;
        private final String contentType;
        private final String accept;
        private VerifyCodeCreateRequest verifyCodeCreateRequest;
        ApiResponse _lastResponse;

        private VerifyCodeCreateRequest(String otpId, String contentType, String accept) {
            this.otpId = otpId;
            this.contentType = contentType;
            this.accept = accept;
        }

        /**
         * Set verifyCodeCreateRequest
         * @param verifyCodeCreateRequest  (optional)
         * @return APIverifyCodeCreateRequest
         */
        public VerifyCodeCreateRequest verifyCodeCreateRequest(VerifyCodeCreateRequest verifyCodeCreateRequest) {
            this.verifyCodeCreateRequest = verifyCodeCreateRequest;
            return this;
        }

        /**
         * Build call for verifyCodeCreate
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return verifyCodeCreateCall(otpId, contentType, accept, verifyCodeCreateRequest, _callback);
        }

        /**
         * Execute verifyCodeCreate request
         * @return Otp
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public Otp execute() throws ApiException {
            ApiResponse<Otp> localVarResp = verifyCodeCreateWithHttpInfo(otpId, contentType, accept, verifyCodeCreateRequest);
            _lastResponse = localVarResp;
            Otp data = localVarResp.getData();

            
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
         * Execute verifyCodeCreate request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<Otp> _callback) throws ApiException {
            return verifyCodeCreateAsync(otpId, contentType, accept, verifyCodeCreateRequest, _callback);
        }
    }

    /**
     * Verify Code
     * @param params The param instance required to create VerifyCodeCreateRequest
     * @return Otp
     */

    public static Otp create(Map<String, Object> params) throws ApiException {
        VerifyCodeCreateRequest verifyCodeCreateRequest = null;
        if(params.containsKey("verifyCodeCreateRequest") && params.get("verifyCodeCreateRequest") != null){
            verifyCodeCreateRequest = (VerifyCodeCreateRequest) params.get("verifyCodeCreateRequest");
        }
        String otpId = (String) params.get("otpId");

        if(otpId == null || otpId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'otpId'");
        }
        String contentType = (String) params.get("contentType");

        if(contentType == null || contentType.isEmpty()) {
            throw new ApiException("Missing the required parameter 'contentType'");
        }
        String accept = (String) params.get("accept");

        if(accept == null || accept.isEmpty()) {
            throw new ApiException("Missing the required parameter 'accept'");
        }
        VerifyCodeCreateParams tempParams = VerifyCodeCreateParams.builder()
            .setOtpId(otpId)
            .setContent-Type(Content-Type)
            .setAccept(Accept)
            .setVerifyCodeCreateRequest(verifyCodeCreateRequest).build();

        return create(tempParams);
    }

    public static Otp create(VerifyCodeCreateParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }


        String otpId = params.getOtpId();

        if(otpId == null || otpId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'otpId'");
        }

        String contentType = params.getContentType();

        if(contentType == null || contentType.isEmpty()) {
            throw new ApiException("Missing the required parameter 'contentType'");
        }

        String accept = params.getAccept();

        if(accept == null || accept.isEmpty()) {
            throw new ApiException("Missing the required parameter 'accept'");
        }
        VerifyCodeCreateRequest request = new VerifyCodeCreateRequest(otpId, contentType, accept);

        // Ensure to include all of the 'optionalParams' that are passed
        if(params.verifyCodeCreateRequest != null){
            VerifyCodeCreateRequest verifyCodeCreateRequest = params.getVerifyCodeCreateRequest();
            request.verifyCodeCreateRequest(verifyCodeCreateRequest);
        }

        return request.execute();
    }
}
