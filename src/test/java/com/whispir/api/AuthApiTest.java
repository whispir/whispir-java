package com.whispir.api;

import com.whispir.client.ApiException;
import com.whispir.model.ApiError;
import com.whispir.model.Auth;
import java.math.BigDecimal;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.net.URI;

import com.whispir.api.AuthApi.AuthCreateParams;
import com.whispir.api.AuthApi.AuthVerificationRetrieveParams;

/**
 * API tests for AuthApi
 */
@Disabled
public class AuthApiTest {
    private final AuthApi api = new AuthApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void AuthCreateTest() throws ApiException {
        AuthCreateParams params = AuthCreateParams.builder()
                                        .build();
        Auth response = api.create(params);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void AuthVerificationRetrieveTest() throws ApiException {
        AuthVerificationRetrieveParams params = AuthVerificationRetrieveParams.builder()
                                        .build();
        api.retrieveVerification(params);
        // TODO: test validations
    }

}
