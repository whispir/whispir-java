package com.whispir.api;

import com.whispir.client.ApiException;
import com.whispir.model.ApiError;
import java.math.BigDecimal;
import com.whispir.model.Workspace;
import com.whispir.model.WorkspaceCollection;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.net.URI;

import com.whispir.api.WorkspacesApi.WorkspaceCreateParams;
import com.whispir.api.WorkspacesApi.WorkspaceListParams;
import com.whispir.api.WorkspacesApi.WorkspaceRetrieveParams;
import com.whispir.api.WorkspacesApi.WorkspaceUpdateParams;

/**
 * API tests for WorkspacesApi
 */
@Disabled
public class WorkspacesApiTest {
    private final WorkspacesApi api = new WorkspacesApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void WorkspaceCreateTest() throws ApiException {
        String projectName = null;
        String projectNumber = null;
        String status = null;
        String billingcostcentre = null;
        WorkspaceCreateParams params = WorkspaceCreateParams.builder()
                                        .setProjectName(projectName)
                                        .setProjectNumber(projectNumber)
                                        .setStatus(status)
                                        .setBillingcostcentre(billingcostcentre)
                                        .build();
        Workspace response = api.create(params);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void WorkspaceListTest() throws ApiException {
        BigDecimal limit = null;
        BigDecimal offset = null;
        String sortOrder = null;
        String sortFields = null;
        WorkspaceListParams params = WorkspaceListParams.builder()
                                        .setLimit(limit)
                                        .setOffset(offset)
                                        .setSortOrder(sortOrder)
                                        .setSortFields(sortFields)
                                        .build();
        WorkspaceCollection response = api.list(params);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void WorkspaceRetrieveTest() throws ApiException {
        String workspaceId = null;
        WorkspaceRetrieveParams params = WorkspaceRetrieveParams.builder()
                                        .setWorkspaceId(workspaceId)
                                        .build();
        Workspace response = api.retrieve(params);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void WorkspaceUpdateTest() throws ApiException {
        String workspaceId = null;
        Workspace workspace = null;
        WorkspaceUpdateParams params = WorkspaceUpdateParams.builder()
                                        .setWorkspaceId(workspaceId)
                                        .setWorkspace(workspace)
                                        .build();
        Workspace response = api.update(params);
        // TODO: test validations
    }

}
