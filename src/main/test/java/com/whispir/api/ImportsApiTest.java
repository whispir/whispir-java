package com.whispir.api;

import com.whispir.client.ApiException;
import com.whispir.model.ApiError;
import java.math.BigDecimal;
import com.whispir.model.ModelImport;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.net.URI;

import com.whispir.api.ImportsApi.ImportCreateParams;

/**
 * API tests for ImportsApi
 */
@Disabled
public class ImportsApiTest {
    private final ImportsApi api = new ImportsApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ImportCreateTest() throws ApiException {
        String workspaceId = null;
        ModelImport modelImport = null;
        ImportCreateParams params = ImportCreateParams.builder()
                                        .setWorkspaceId(workspaceId)
                                        .setModelImport(modelImport)
                                        .build();
        api.create(params);
        // TODO: test validations
    }

}
