package com.whispir.api;

import com.whispir.client.ApiException;
import com.whispir.model.Activity;
import com.whispir.model.ActivityCollection;
import com.whispir.model.ApiError;
import java.math.BigDecimal;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.net.URI;

import com.whispir.api.ActivitiesApi.ActivityCreateParams;
import com.whispir.api.ActivitiesApi.ActivityListParams;
import com.whispir.api.ActivitiesApi.ActivityWorkspaceListParams;

/**
 * API tests for ActivitiesApi
 */
@Disabled
public class ActivitiesApiTest {
    private final ActivitiesApi api = new ActivitiesApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ActivityCreateTest() throws ApiException {
        String user = null;
        String time = null;
        ActivityCreateParams.ActionEnum action = null;
        String description = null;
        String status = null;
        ActivityCreateParams.ModuleEnum module = null;
        String workspaceName = null;
        String fullname = null;
        ActivityCreateParams params = ActivityCreateParams.builder()
                                        .setUser(user)
                                        .setTime(time)
                                        .setAction(action)
                                        .setDescription(description)
                                        .setStatus(status)
                                        .setModule(module)
                                        .setWorkspaceName(workspaceName)
                                        .setFullname(fullname)
                                        .build();
        Activity response = api.create(params);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ActivityListTest() throws ApiException {
        BigDecimal limit = null;
        BigDecimal offset = null;
        String sortOrder = null;
        String sortFields = null;
        String action = null;
        String module = null;
        String user = null;
        String workspace = null;
        String status = null;
        String description = null;
        String startTime = null;
        String endTime = null;
        ActivityListParams params = ActivityListParams.builder()
                                        .setLimit(limit)
                                        .setOffset(offset)
                                        .setSortOrder(sortOrder)
                                        .setSortFields(sortFields)
                                        .setAction(action)
                                        .setModule(module)
                                        .setUser(user)
                                        .setWorkspace(workspace)
                                        .setStatus(status)
                                        .setDescription(description)
                                        .setStartTime(startTime)
                                        .setEndTime(endTime)
                                        .build();
        ActivityCollection response = api.list(params);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ActivityWorkspaceListTest() throws ApiException {
        String workspaceId = null;
        BigDecimal limit = null;
        BigDecimal offset = null;
        String sortOrder = null;
        String sortFields = null;
        ActivityWorkspaceListParams params = ActivityWorkspaceListParams.builder()
                                        .setWorkspaceId(workspaceId)
                                        .setLimit(limit)
                                        .setOffset(offset)
                                        .setSortOrder(sortOrder)
                                        .setSortFields(sortFields)
                                        .build();
        ActivityCollection response = api.listByWorkspace(params);
        // TODO: test validations
    }

}
