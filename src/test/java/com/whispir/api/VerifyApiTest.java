package com.whispir.api;

import com.whispir.client.ApiException;
import com.whispir.model.ApiErrorNextGen;
import java.math.BigDecimal;
import com.whispir.model.Otp;
import com.whispir.model.SendCodeCreateRequest;
import com.whispir.model.VerifyCodeCreateRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.net.URI;

import com.whispir.api.VerifyApi.SendCodeCreateParams;
import com.whispir.api.VerifyApi.VerifyCodeCreateParams;

/**
 * API tests for VerifyApi
 */
@Disabled
public class VerifyApiTest {
    private final VerifyApi api = new VerifyApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void SendCodeCreateTest() throws ApiException {
        SendCodeCreateRequest sendCodeCreateRequest = null;
        SendCodeCreateParams params = SendCodeCreateParams.builder()
                                        .setSendCodeCreateRequest(sendCodeCreateRequest)
                                        .build();
        Otp response = api.create(params);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void VerifyCodeCreateTest() throws ApiException {
        String otpId = null;
        VerifyCodeCreateRequest verifyCodeCreateRequest = null;
        VerifyCodeCreateParams params = VerifyCodeCreateParams.builder()
                                        .setOtpId(otpId)
                                        .setVerifyCodeCreateRequest(verifyCodeCreateRequest)
                                        .build();
        Otp response = api.create(params);
        // TODO: test validations
    }

}
