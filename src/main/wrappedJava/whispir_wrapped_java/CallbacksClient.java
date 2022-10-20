/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whispir_wrapped_java;

import java.math.BigDecimal;
import whispir_sdk_java.ApiClient;
import org.whispir.api.CallbacksApi;
import org.openapitools.client.model.Callback;
import org.openapitools.client.model.GetCallbackInstances200Response;
import org.openapitools.client.model.GetCallbacks200Response;
import org.openapitools.client.model.PutCallbackInstanceStatusRequest;
import whispir_sdk_java.ApiException;

/**
 *
 * @author carlangeloorale
 */
public class CallbacksClient {

    private static String USERNAME, PASSWORD, API_URL;
    private static final String CONTENT_TYPE = "application/vnd.whispir.api-callback-v1+json";
    private static final String ACCEPT = "application/vnd.whispir.api-callback-v1+json";

    public CallbacksClient(String username, String password, String apiUrl) {
        CallbacksClient.USERNAME = username;
        CallbacksClient.PASSWORD = password;
        CallbacksClient.API_URL = apiUrl;
    }

    public static ApiClient createClient() {
        ApiClient client;
        client = new ApiClient();

        client.setBasePath(API_URL);
        client.setUsername(USERNAME);
        client.setPassword(PASSWORD);
        return client;
    }

    public static Callback createCallback(Callback CALLBACK, String API_KEY) {
        CallbacksApi callback = new CallbacksApi(createClient());
        try {
            return callback.postCallbacks(API_KEY, CONTENT_TYPE, ACCEPT, CALLBACK);
        } catch (ApiException e) {
            throw new Error(e);
        }
    }

    public static GetCallbacks200Response listCallbacks(
            String API_KEY,
            BigDecimal LIMIT,
            BigDecimal OFFSET,
            String SORT_ORDER,
            String SORT_FIELDS) {
        CallbacksApi callback = new CallbacksApi(createClient());
        try {
            return callback.getCallbacks(
                    API_KEY,
                    ACCEPT,
                    LIMIT,
                    OFFSET,
                    SORT_ORDER,
                    SORT_FIELDS);
        } catch (ApiException e) {
            throw new Error(e);
        }
    }

    public static Callback getCallback(
            String API_KEY,
            String CALLBACK_ID) {
        CallbacksApi callback = new CallbacksApi(createClient());
        try {
            return callback.getCallbackById(
                    API_KEY,
                    CALLBACK_ID,
                    ACCEPT);
        } catch (ApiException e) {
            throw new Error(e);
        }
    }

    public static void updateCallback(
            String API_KEY,
            String CALLBACK_ID,
            Callback CALLBACK) {
        CallbacksApi callback = new CallbacksApi(createClient());
        try {
            callback.putCallbackById(
                    API_KEY,
                    CALLBACK_ID,
                    CONTENT_TYPE,
                    ACCEPT,
                    CALLBACK);
        } catch (ApiException e) {
            throw new Error(e);
        }
    }

    public static void deleteCallback(
            String API_KEY,
            String CALLBACK_ID) {
        CallbacksApi callback = new CallbacksApi(createClient());
        try {
            callback.deleteCallbackById(
                    API_KEY,
                    CALLBACK_ID,
                    CONTENT_TYPE,
                    ACCEPT);
        } catch (ApiException e) {
            throw new Error(e);
        }
    }

    public static GetCallbackInstances200Response listCallbackInstances(
            String API_KEY,
            String CALLBACK_ID,
            BigDecimal LIMIT,
            BigDecimal OFFSET,
            String SORT_ORDER,
            String SORT_FIELDS,
            String STATUS) {
        CallbacksApi callback = new CallbacksApi(createClient());
        try {
            return callback.getCallbackInstances(
                    API_KEY,
                    CALLBACK_ID,
                    ACCEPT,
                    LIMIT,
                    OFFSET,
                    SORT_ORDER,
                    SORT_FIELDS,
                    STATUS);
        } catch (ApiException e) {
            throw new Error(e);
        }
    }

    public static void updateCallbackInstanceStatus(
            String API_KEY,
            String CALLBACK_ID,
            String ID,
            PutCallbackInstanceStatusRequest PUT_CALLBACK_INSTANCE_STATUS_REQUEST) {
        CallbacksApi callback = new CallbacksApi(createClient());
        try {
            callback.putCallbackInstanceStatus(
                    API_KEY,
                    CALLBACK_ID,
                    CONTENT_TYPE,
                    ACCEPT,
                    ID,
                    PUT_CALLBACK_INSTANCE_STATUS_REQUEST);
        } catch (ApiException e) {
            throw new Error(e);
        }
    }
}
