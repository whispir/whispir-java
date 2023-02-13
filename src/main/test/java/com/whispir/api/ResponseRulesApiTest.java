package com.whispir.api;

import com.whispir.client.ApiException;
import com.whispir.model.ApiError;
import java.math.BigDecimal;
import com.whispir.model.ResponseRule;
import com.whispir.model.ResponseRuleCollection;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.net.URI;

import com.whispir.api.ResponseRulesApi.ReponseRuleListParams;
import com.whispir.api.ResponseRulesApi.ResponseRuleCreateParams;
import com.whispir.api.ResponseRulesApi.ResponseRuleDeleteParams;
import com.whispir.api.ResponseRulesApi.ResponseRuleRetrieveParams;
import com.whispir.api.ResponseRulesApi.ResponseRuleUpdateParams;

/**
 * API tests for ResponseRulesApi
 */
@Disabled
public class ResponseRulesApiTest {
    private final ResponseRulesApi api = new ResponseRulesApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ReponseRuleListTest() throws ApiException {
        String workspaceId = null;
        BigDecimal limit = null;
        BigDecimal offset = null;
        String sortOrder = null;
        String sortFields = null;
        ReponseRuleListParams params = ReponseRuleListParams.builder()
                                        .setWorkspaceId(workspaceId)
                                        .setLimit(limit)
                                        .setOffset(offset)
                                        .setSortOrder(sortOrder)
                                        .setSortFields(sortFields)
                                        .build();
        ResponseRuleCollection response = api.list(params);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ResponseRuleCreateTest() throws ApiException {
        String workspaceId = null;
        String name = null;
        String description = null;
        ResponseRuleCreateParams.TemplatePattern responseTemplatePatterns = null;
        ResponseRuleCreateParams params = ResponseRuleCreateParams.builder()
                                        .setWorkspaceId(workspaceId)
                                        .setName(name)
                                        .setDescription(description)
                                        .setResponseTemplatePatterns(responseTemplatePatterns)
                                        .build();
        api.create(params);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ResponseRuleDeleteTest() throws ApiException {
        String workspaceId = null;
        String responseRuleId = null;
        ResponseRuleDeleteParams params = ResponseRuleDeleteParams.builder()
                                        .setWorkspaceId(workspaceId)
                                        .setResponseRuleId(responseRuleId)
                                        .build();
        api.delete(params);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ResponseRuleRetrieveTest() throws ApiException {
        String workspaceId = null;
        String responseRuleId = null;
        ResponseRuleRetrieveParams params = ResponseRuleRetrieveParams.builder()
                                        .setWorkspaceId(workspaceId)
                                        .setResponseRuleId(responseRuleId)
                                        .build();
        ResponseRule response = api.retrieve(params);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ResponseRuleUpdateTest() throws ApiException {
        String workspaceId = null;
        String responseRuleId = null;
        String name = null;
        String description = null;
        ResponseRuleUpdateParams.TemplatePattern responseTemplatePatterns = null;
        ResponseRuleUpdateParams params = ResponseRuleUpdateParams.builder()
                                        .setWorkspaceId(workspaceId)
                                        .setResponseRuleId(responseRuleId)
                                        .setName(name)
                                        .setDescription(description)
                                        .setResponseTemplatePatterns(responseTemplatePatterns)
                                        .build();
        api.update(params);
        // TODO: test validations
    }

}
