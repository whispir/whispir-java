/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whispir_wrapped_java;

import java.math.BigDecimal;
import whispir_sdk_java.ApiClient;
import org.whispir.api.ScenariosApi;
import org.openapitools.client.model.Scenario;
import org.openapitools.client.model.GetScenarios200Response;
import whispir_sdk_java.ApiException;

/**
 *
 * @author carlangeloorale
 */
public class ScenariosClient {

    private static String USERNAME, PASSWORD, API_URL, WORKSPACE_ID;
    private static final String CONTENT_TYPE = "application/vnd.whispir.scenario-v1+json";
    private static final String ACCEPT = "application/vnd.whispir.scenario-v1+json";

    public ScenariosClient(String username, String password, String apiUrl, String workspaceId) {
        ScenariosClient.USERNAME = username;
        ScenariosClient.PASSWORD = password;
        ScenariosClient.API_URL = apiUrl;
        ScenariosClient.WORKSPACE_ID = workspaceId;
    }

    public static ApiClient createClient() {
        ApiClient client;
        client = new ApiClient();

        client.setBasePath(API_URL);
        client.setUsername(USERNAME);
        client.setPassword(PASSWORD);
        return client;
    }

    public static void createScenario(Scenario SCENARIO, String API_KEY) {
        ScenariosApi scenario = new ScenariosApi(createClient());
        try {
            scenario.postScenarios(WORKSPACE_ID, API_KEY, CONTENT_TYPE, ACCEPT, SCENARIO);
        } catch (ApiException e) {
            throw new Error(e);
        }
    }

    public static GetScenarios200Response listScenarios(
            String API_KEY,
            BigDecimal LIMIT,
            BigDecimal OFFSET,
            String SORT_ORDER,
            String SORT_FIELDS) {
        ScenariosApi scenario = new ScenariosApi(createClient());
        try {
            return scenario.getScenarios(
                    WORKSPACE_ID,
                    API_KEY,
                    ACCEPT,
                    LIMIT,
                    OFFSET,
                    SORT_ORDER,
                    SORT_FIELDS);
        } catch (ApiException e) {
            throw new Error(e);
        }
    }

    public static void retrieveScenario(
            String API_KEY,
            String SCENARIO_ID) {
        ScenariosApi scenario = new ScenariosApi(createClient());
        try {
            scenario.getScenariosById(
                    WORKSPACE_ID,
                    API_KEY,
                    ACCEPT,
                    SCENARIO_ID
            );
        } catch (ApiException e) {
            throw new Error(e);
        }
    }

    public static void runScenario(
            String API_KEY,
            String SCENARIO_ID) {
        ScenariosApi scenario = new ScenariosApi(createClient());
        try {
            scenario.postScenariosById(
                    WORKSPACE_ID,
                    API_KEY,
                    CONTENT_TYPE,
                    ACCEPT,
                    SCENARIO_ID);
        } catch (ApiException e) {
            throw new Error(e);
        }
    }

    public static void updateScenario(
            String API_KEY,
            String SCENARIO_ID,
            Scenario SCENARIO) {
        ScenariosApi scenario = new ScenariosApi(createClient());
        try {
            scenario.putScenariosById(
                    WORKSPACE_ID,
                    API_KEY,
                    CONTENT_TYPE,
                    ACCEPT,
                    SCENARIO_ID,
                    SCENARIO);
        } catch (ApiException e) {
            throw new Error(e);
        }
    }

    public static void deleteScenario(
            String API_KEY,
            String SCENARIO_ID) {
        ScenariosApi scenario = new ScenariosApi(createClient());
        try {
            scenario.deleteScenariosById(
                    WORKSPACE_ID,
                    API_KEY,
                    SCENARIO_ID);
        } catch (ApiException e) {
            throw new Error(e);
        }
    }
}
