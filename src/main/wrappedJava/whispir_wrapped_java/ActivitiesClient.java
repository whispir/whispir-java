/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whispir_wrapped_java;

import java.math.BigDecimal;
import whispir_sdk_java.ApiClient;
import org.whispir.api.ActivitiesApi;
import org.openapitools.client.model.Activity;
import org.openapitools.client.model.GetActivities200Response;
import whispir_sdk_java.ApiException;

/**
 *
 * @author carlangeloorale
 */
public class ActivitiesClient {

    private static String USERNAME, PASSWORD, API_URL, WORKSPACE_ID;
    private static final String CONTENT_TYPE = "application/vnd.whispir.activity-v1+json";
    private static final String ACCEPT = "application/vnd.whispir.activity-v1+json";

    public ActivitiesClient(String username, String password, String apiUrl, String workspaceId) {
        ActivitiesClient.USERNAME = username;
        ActivitiesClient.PASSWORD = password;
        ActivitiesClient.API_URL = apiUrl;
        ActivitiesClient.WORKSPACE_ID = workspaceId;
    }

    public static ApiClient createClient() {
        ApiClient client;
        client = new ApiClient();

        client.setBasePath(API_URL);
        client.setUsername(USERNAME);
        client.setPassword(PASSWORD);
        return client;
    }

    public static Activity createActivity(Activity ACTIVITY, String API_KEY) {
        ActivitiesApi activity = new ActivitiesApi(createClient());
        try {
            return activity.postActivities(API_KEY, CONTENT_TYPE, ACCEPT, ACTIVITY);
        } catch (ApiException e) {
            throw new Error(e);
        }
    }

    public static GetActivities200Response listActivities(
            String API_KEY,
            BigDecimal LIMIT,
            BigDecimal OFFSET,
            String SORT_ORDER,
            String SORT_FIELDS,
            String ACTION,
            String MODULE,
            String USER,
            String WORKSPACE,
            String STATUS,
            String DESCRIPTION,
            String START_TIME,
            String END_TIME) {

        ActivitiesApi activity = new ActivitiesApi(createClient());
        try {
            return activity.getActivities(
                    API_KEY,
                    ACCEPT,
                    LIMIT,
                    OFFSET,
                    SORT_ORDER,
                    SORT_FIELDS,
                    ACTION,
                    MODULE,
                    USER,
                    WORKSPACE,
                    STATUS,
                    DESCRIPTION,
                    START_TIME,
                    END_TIME);
        } catch (ApiException e) {
            throw new Error(e);
        }
    }

    public static void listWorkspaceActivities(
            String API_KEY,
            BigDecimal LIMIT,
            BigDecimal OFFSET,
            String SORT_ORDER,
            String SORT_FIELDS) {

        ActivitiesApi activity = new ActivitiesApi(createClient());
        try {
            activity.getWorkspaceActivities(
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
}
