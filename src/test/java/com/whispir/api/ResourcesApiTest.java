package com.whispir.api;

import com.whispir.client.ApiException;
import com.whispir.model.ApiError;
import java.math.BigDecimal;
import com.whispir.model.Resource;
import com.whispir.model.ResourceCollection;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.net.URI;

import com.whispir.api.ResourcesApi.ResourceCreateParams;
import com.whispir.api.ResourcesApi.ResourceDeleteParams;
import com.whispir.api.ResourcesApi.ResourceListParams;
import com.whispir.api.ResourcesApi.ResourceRetrieveParams;
import com.whispir.api.ResourcesApi.ResourceUpdateParams;

/**
 * API tests for ResourcesApi
 */
@Disabled
public class ResourcesApiTest {
    private final ResourcesApi api = new ResourcesApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ResourceCreateTest() throws ApiException {
        String workspaceId = null;
        String name = null;
        ResourceCreateParams.ScopeEnum scope = null;
        String mimeType = null;
        String derefUri = null;
        ResourceCreateParams params = ResourceCreateParams.builder()
                                        .setWorkspaceId(workspaceId)
                                        .setName(name)
                                        .setScope(scope)
                                        .setMimeType(mimeType)
                                        .setDerefUri(derefUri)
                                        .build();
        Resource response = api.create(params);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ResourceDeleteTest() throws ApiException {
        String workspaceId = null;
        String resourceId = null;
        ResourceDeleteParams params = ResourceDeleteParams.builder()
                                        .setWorkspaceId(workspaceId)
                                        .setResourceId(resourceId)
                                        .build();
        api.delete(params);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ResourceListTest() throws ApiException {
        String workspaceId = null;
        BigDecimal limit = null;
        BigDecimal offset = null;
        String sortOrder = null;
        String sortFields = null;
        String scope = null;
        String name = null;
        ResourceListParams params = ResourceListParams.builder()
                                        .setWorkspaceId(workspaceId)
                                        .setLimit(limit)
                                        .setOffset(offset)
                                        .setSortOrder(sortOrder)
                                        .setSortFields(sortFields)
                                        .setScope(scope)
                                        .setName(name)
                                        .build();
        ResourceCollection response = api.list(params);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ResourceRetrieveTest() throws ApiException {
        String workspaceId = null;
        String resourceId = null;
        ResourceRetrieveParams params = ResourceRetrieveParams.builder()
                                        .setWorkspaceId(workspaceId)
                                        .setResourceId(resourceId)
                                        .build();
        Resource response = api.retrieve(params);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ResourceUpdateTest() throws ApiException {
        String workspaceId = null;
        String resourceId = null;
        String name = null;
        ResourceUpdateParams.ScopeEnum scope = null;
        String mimeType = null;
        String derefUri = null;
        ResourceUpdateParams params = ResourceUpdateParams.builder()
                                        .setWorkspaceId(workspaceId)
                                        .setResourceId(resourceId)
                                        .setName(name)
                                        .setScope(scope)
                                        .setMimeType(mimeType)
                                        .setDerefUri(derefUri)
                                        .build();
        Resource response = api.update(params);
        // TODO: test validations
    }

}
