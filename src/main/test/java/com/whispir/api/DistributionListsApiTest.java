package com.whispir.api;

import com.whispir.client.ApiException;
import com.whispir.model.ApiError;
import java.math.BigDecimal;
import com.whispir.model.DistributionList;
import com.whispir.model.DistributionListCollection;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.net.URI;

import com.whispir.api.DistributionListsApi.DistributionListCreateParams;
import com.whispir.api.DistributionListsApi.DistributionListDeleteParams;
import com.whispir.api.DistributionListsApi.DistributionListListParams;
import com.whispir.api.DistributionListsApi.DistributionListRetrieveParams;
import com.whispir.api.DistributionListsApi.DistributionListUpdateParams;

/**
 * API tests for DistributionListsApi
 */
@Disabled
public class DistributionListsApiTest {
    private final DistributionListsApi api = new DistributionListsApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void DistributionListCreateTest() throws ApiException {
        String workspaceId = null;
        String name = null;
        String description = null;
        String memberCount = null;
        String access = null;
        String visibility = null;
        String contactIds = null;
        String userIds = null;
        String distListIds = null;
        DistributionListCreateParams.TypeEnum type = null;
        String rules = null;
        DistributionListCreateParams params = DistributionListCreateParams.builder()
                                        .setWorkspaceId(workspaceId)
                                        .setName(name)
                                        .setDescription(description)
                                        .setMemberCount(memberCount)
                                        .setAccess(access)
                                        .setVisibility(visibility)
                                        .setContactIds(contactIds)
                                        .setUserIds(userIds)
                                        .setDistListIds(distListIds)
                                        .setType(type)
                                        .setRules(rules)
                                        .build();
        DistributionList response = api.create(params);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void DistributionListDeleteTest() throws ApiException {
        String workspaceId = null;
        String distributionlistId = null;
        DistributionListDeleteParams params = DistributionListDeleteParams.builder()
                                        .setWorkspaceId(workspaceId)
                                        .setDistributionlistId(distributionlistId)
                                        .build();
        api.delete(params);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void DistributionListListTest() throws ApiException {
        String workspaceId = null;
        BigDecimal limit = null;
        BigDecimal offset = null;
        String sortOrder = null;
        String sortFields = null;
        String name = null;
        String description = null;
        DistributionListListParams params = DistributionListListParams.builder()
                                        .setWorkspaceId(workspaceId)
                                        .setLimit(limit)
                                        .setOffset(offset)
                                        .setSortOrder(sortOrder)
                                        .setSortFields(sortFields)
                                        .setName(name)
                                        .setDescription(description)
                                        .build();
        DistributionListCollection response = api.list(params);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void DistributionListRetrieveTest() throws ApiException {
        String workspaceId = null;
        String distributionlistId = null;
        DistributionListRetrieveParams params = DistributionListRetrieveParams.builder()
                                        .setWorkspaceId(workspaceId)
                                        .setDistributionlistId(distributionlistId)
                                        .build();
        DistributionList response = api.retrieve(params);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void DistributionListUpdateTest() throws ApiException {
        String workspaceId = null;
        String distributionlistId = null;
        String name = null;
        String description = null;
        String memberCount = null;
        String access = null;
        String visibility = null;
        String contactIds = null;
        String userIds = null;
        String distListIds = null;
        DistributionListUpdateParams.TypeEnum type = null;
        String rules = null;
        DistributionListUpdateParams params = DistributionListUpdateParams.builder()
                                        .setWorkspaceId(workspaceId)
                                        .setDistributionlistId(distributionlistId)
                                        .setName(name)
                                        .setDescription(description)
                                        .setMemberCount(memberCount)
                                        .setAccess(access)
                                        .setVisibility(visibility)
                                        .setContactIds(contactIds)
                                        .setUserIds(userIds)
                                        .setDistListIds(distListIds)
                                        .setType(type)
                                        .setRules(rules)
                                        .build();
        api.update(params);
        // TODO: test validations
    }

}
