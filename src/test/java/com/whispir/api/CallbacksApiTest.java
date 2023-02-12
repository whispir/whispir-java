package com.whispir.api;

import com.whispir.client.ApiException;
import com.whispir.model.ApiError;
import java.math.BigDecimal;
import com.whispir.model.Callback;
import com.whispir.model.CallbackCall;
import com.whispir.model.CallbackCallCollection;
import com.whispir.model.CallbackCollection;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.net.URI;

import com.whispir.api.CallbacksApi.CallbackCallListParams;
import com.whispir.api.CallbacksApi.CallbackCallUpdateParams;
import com.whispir.api.CallbacksApi.CallbackCreateParams;
import com.whispir.api.CallbacksApi.CallbackDeleteParams;
import com.whispir.api.CallbacksApi.CallbackListParams;
import com.whispir.api.CallbacksApi.CallbackRetrieveParams;
import com.whispir.api.CallbacksApi.CallbackUpdateParams;

/**
 * API tests for CallbacksApi
 */
@Disabled
public class CallbacksApiTest {
    private final CallbacksApi api = new CallbacksApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void CallbackCallListTest() throws ApiException {
        String callbackId = null;
        BigDecimal limit = null;
        BigDecimal offset = null;
        String sortOrder = null;
        String sortFields = null;
        String status = null;
        CallbackCallListParams params = CallbackCallListParams.builder()
                                        .setCallbackId(callbackId)
                                        .setLimit(limit)
                                        .setOffset(offset)
                                        .setSortOrder(sortOrder)
                                        .setSortFields(sortFields)
                                        .setStatus(status)
                                        .build();
        CallbackCallCollection response = api.listCalls(params);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void CallbackCallUpdateTest() throws ApiException {
        String callbackId = null;
        String id = null;
        CallbackCall callbackCall = null;
        CallbackCallUpdateParams params = CallbackCallUpdateParams.builder()
                                        .setCallbackId(callbackId)
                                        .setId(id)
                                        .setCallbackCall(callbackCall)
                                        .build();
        api.updateCall(params);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void CallbackCreateTest() throws ApiException {
        String name = null;
        URI url = null;
        CallbackCreateParams.CallbackAuth auth = null;
        CallbackCreateParams.ContentTypeEnum contentType = null;
        CallbackCreateParams.RemoveHTMLEnum removeHTML = null;
        Boolean retriesEnabled = null;
        String email = null;
        CallbackCreateParams.CallbackOptions callbacks = null;
        CallbackCreateParams params = CallbackCreateParams.builder()
                                        .setName(name)
                                        .setUrl(url)
                                        .setAuth(auth)
                                        .setContentType(contentType)
                                        .setRemoveHTML(removeHTML)
                                        .setRetriesEnabled(retriesEnabled)
                                        .setEmail(email)
                                        .setCallbacks(callbacks)
                                        .build();
        Callback response = api.create(params);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void CallbackDeleteTest() throws ApiException {
        String callbackId = null;
        CallbackDeleteParams params = CallbackDeleteParams.builder()
                                        .setCallbackId(callbackId)
                                        .build();
        api.delete(params);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void CallbackListTest() throws ApiException {
        BigDecimal limit = null;
        BigDecimal offset = null;
        String sortOrder = null;
        String sortFields = null;
        CallbackListParams params = CallbackListParams.builder()
                                        .setLimit(limit)
                                        .setOffset(offset)
                                        .setSortOrder(sortOrder)
                                        .setSortFields(sortFields)
                                        .build();
        CallbackCollection response = api.list(params);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void CallbackRetrieveTest() throws ApiException {
        String callbackId = null;
        CallbackRetrieveParams params = CallbackRetrieveParams.builder()
                                        .setCallbackId(callbackId)
                                        .build();
        Callback response = api.retrieve(params);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void CallbackUpdateTest() throws ApiException {
        String callbackId = null;
        Callback callback = null;
        CallbackUpdateParams params = CallbackUpdateParams.builder()
                                        .setCallbackId(callbackId)
                                        .setCallback(callback)
                                        .build();
        api.update(params);
        // TODO: test validations
    }

}
