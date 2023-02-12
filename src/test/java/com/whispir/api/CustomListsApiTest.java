package com.whispir.api;

import com.whispir.client.ApiException;
import com.whispir.model.ApiError;
import java.math.BigDecimal;
import com.whispir.model.CustomList;
import com.whispir.model.CustomListCollection;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.net.URI;

import com.whispir.api.CustomListsApi.CustomListListParams;
import com.whispir.api.CustomListsApi.CustomListRetrieveParams;

/**
 * API tests for CustomListsApi
 */
@Disabled
public class CustomListsApiTest {
    private final CustomListsApi api = new CustomListsApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void CustomListListTest() throws ApiException {
        BigDecimal limit = null;
        BigDecimal offset = null;
        String sortOrder = null;
        String sortFields = null;
        String name = null;
        String type = null;
        CustomListListParams params = CustomListListParams.builder()
                                        .setLimit(limit)
                                        .setOffset(offset)
                                        .setSortOrder(sortOrder)
                                        .setSortFields(sortFields)
                                        .setName(name)
                                        .setType(type)
                                        .build();
        CustomListCollection response = api.list(params);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void CustomListRetrieveTest() throws ApiException {
        String customlistId = null;
        CustomListRetrieveParams params = CustomListRetrieveParams.builder()
                                        .setCustomlistId(customlistId)
                                        .build();
        CustomList response = api.retrieve(params);
        // TODO: test validations
    }

}
