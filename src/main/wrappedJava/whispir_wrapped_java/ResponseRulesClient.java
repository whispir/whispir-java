/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whispir_wrapped_java;

import java.math.BigDecimal;
import whispir_sdk_java.ApiClient;
import org.whispir.api.ResponseRulesApi;
import org.openapitools.client.model.ResponseRule;
import whispir_sdk_java.ApiException;

/**
 *
 * @author carlangeloorale
 */
public class ResponseRulesClient {

    private static String USERNAME, PASSWORD, API_URL, WORKSPACE_ID;
    private static final String CONTENT_TYPE = "application/vnd.whispir.responserule-v1+json";
    private static final String ACCEPT = "application/vnd.whispir.responserule-v1+json";

    public ResponseRulesClient(String username, String password, String apiUrl, String workspaceId) {
        ResponseRulesClient.USERNAME = username;
        ResponseRulesClient.PASSWORD = password;
        ResponseRulesClient.API_URL = apiUrl;
        ResponseRulesClient.WORKSPACE_ID = workspaceId;
    }

    public static ApiClient createClient() {
        ApiClient client;
        client = new ApiClient();

        client.setBasePath(API_URL);
        client.setUsername(USERNAME);
        client.setPassword(PASSWORD);
        return client;
    }

    public static void createResponseRule(ResponseRule RESPONSE_RULE, String API_KEY) {
        ResponseRulesApi responseRule = new ResponseRulesApi(createClient());
        try {
            responseRule.postResponseRules(WORKSPACE_ID, API_KEY, CONTENT_TYPE, ACCEPT, RESPONSE_RULE);
        } catch (ApiException e) {
            throw new Error(e);
        }
    }

    public static void listResponseRules(
            String API_KEY,
            BigDecimal LIMIT,
            BigDecimal OFFSET,
            String SORT_ORDER,
            String SORT_FIELDS) {
        ResponseRulesApi responseRule = new ResponseRulesApi(createClient());

        try {
            responseRule.getResponseRules(
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

    public static void retrieveResponseRule(
            String API_KEY,
            String RESPONSE_RULE_ID) {
        ResponseRulesApi responseRule = new ResponseRulesApi(createClient());

        try {
            responseRule.getResponseRulesById(
                    WORKSPACE_ID,
                    API_KEY,
                    ACCEPT,
                    RESPONSE_RULE_ID);
        } catch (ApiException e) {
            throw new Error(e);
        }
    }

    public static void updateResponseRule(
            String API_KEY,
            String RESPONSE_RULE_ID,
            ResponseRule RESPONSE_RULE) {
        ResponseRulesApi responseRule = new ResponseRulesApi(createClient());
        try {
            responseRule.putResponseRulesById(
                    WORKSPACE_ID,
                    API_KEY,
                    CONTENT_TYPE,
                    ACCEPT,
                    RESPONSE_RULE_ID,
                    RESPONSE_RULE);
        } catch (ApiException e) {
            throw new Error(e);
        }
    }

    public static void deleteResponseRule(
            String API_KEY,
            String RESPONSE_RULE_ID) {
        ResponseRulesApi responseRule = new ResponseRulesApi(createClient());
        try {
            responseRule.deleteResponseRulesById(
                    WORKSPACE_ID,
                    API_KEY,
                    RESPONSE_RULE_ID);
        } catch (ApiException e) {
            throw new Error(e);
        }
    }
}
