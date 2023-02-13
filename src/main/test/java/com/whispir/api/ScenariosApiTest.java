package com.whispir.api;

import com.whispir.client.ApiException;
import com.whispir.model.ApiError;
import java.math.BigDecimal;
import com.whispir.model.Scenario;
import com.whispir.model.ScenarioCollection;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.net.URI;

import com.whispir.api.ScenariosApi.ScenarioCreateParams;
import com.whispir.api.ScenariosApi.ScenarioDeleteParams;
import com.whispir.api.ScenariosApi.ScenarioListParams;
import com.whispir.api.ScenariosApi.ScenarioRetrieveParams;
import com.whispir.api.ScenariosApi.ScenarioRunCreateParams;
import com.whispir.api.ScenariosApi.ScenarioUpdateParams;

/**
 * API tests for ScenariosApi
 */
@Disabled
public class ScenariosApiTest {
    private final ScenariosApi api = new ScenariosApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ScenarioCreateTest() throws ApiException {
        String workspaceId = null;
        String name = null;
        String description = null;
        ScenarioCreateParams.AllowedUsersEnum allowedUsers = null;
        String allowedUserIds = null;
        ScenarioCreateParams.Message message = null;
        String to = null;
        String subject = null;
        String label = null;
        ScenarioCreateParams.Email email = null;
        ScenarioCreateParams.Voice voice = null;
        ScenarioCreateParams.Web web = null;
        ScenarioCreateParams.Social social = null;
        ScenarioCreateParams params = ScenarioCreateParams.builder()
                                        .setWorkspaceId(workspaceId)
                                        .setName(name)
                                        .setDescription(description)
                                        .setAllowedUsers(allowedUsers)
                                        .setAllowedUserIds(allowedUserIds)
                                        .setMessage(message)
                                        .setTo(to)
                                        .setSubject(subject)
                                        .setLabel(label)
                                        .setEmail(email)
                                        .setVoice(voice)
                                        .setWeb(web)
                                        .setSocial(social)
                                        .build();
        api.create(params);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ScenarioDeleteTest() throws ApiException {
        String workspaceId = null;
        String scenarioId = null;
        ScenarioDeleteParams params = ScenarioDeleteParams.builder()
                                        .setWorkspaceId(workspaceId)
                                        .setScenarioId(scenarioId)
                                        .build();
        api.delete(params);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ScenarioListTest() throws ApiException {
        String workspaceId = null;
        BigDecimal limit = null;
        BigDecimal offset = null;
        String sortOrder = null;
        String sortFields = null;
        ScenarioListParams params = ScenarioListParams.builder()
                                        .setWorkspaceId(workspaceId)
                                        .setLimit(limit)
                                        .setOffset(offset)
                                        .setSortOrder(sortOrder)
                                        .setSortFields(sortFields)
                                        .build();
        ScenarioCollection response = api.list(params);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ScenarioRetrieveTest() throws ApiException {
        String workspaceId = null;
        String scenarioId = null;
        ScenarioRetrieveParams params = ScenarioRetrieveParams.builder()
                                        .setWorkspaceId(workspaceId)
                                        .setScenarioId(scenarioId)
                                        .build();
        Scenario response = api.retrieve(params);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ScenarioRunCreateTest() throws ApiException {
        String workspaceId = null;
        String scenarioId = null;
        ScenarioRunCreateParams params = ScenarioRunCreateParams.builder()
                                        .setWorkspaceId(workspaceId)
                                        .setScenarioId(scenarioId)
                                        .build();
        api.createRun(params);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ScenarioUpdateTest() throws ApiException {
        String workspaceId = null;
        String scenarioId = null;
        String name = null;
        String description = null;
        ScenarioUpdateParams.AllowedUsersEnum allowedUsers = null;
        String allowedUserIds = null;
        ScenarioUpdateParams.Message message = null;
        String to = null;
        String subject = null;
        String label = null;
        ScenarioUpdateParams.Email email = null;
        ScenarioUpdateParams.Voice voice = null;
        ScenarioUpdateParams.Web web = null;
        ScenarioUpdateParams.Social social = null;
        ScenarioUpdateParams params = ScenarioUpdateParams.builder()
                                        .setWorkspaceId(workspaceId)
                                        .setScenarioId(scenarioId)
                                        .setName(name)
                                        .setDescription(description)
                                        .setAllowedUsers(allowedUsers)
                                        .setAllowedUserIds(allowedUserIds)
                                        .setMessage(message)
                                        .setTo(to)
                                        .setSubject(subject)
                                        .setLabel(label)
                                        .setEmail(email)
                                        .setVoice(voice)
                                        .setWeb(web)
                                        .setSocial(social)
                                        .build();
        api.update(params);
        // TODO: test validations
    }

}
