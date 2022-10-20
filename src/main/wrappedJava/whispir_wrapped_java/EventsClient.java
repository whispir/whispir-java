/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whispir_wrapped_java;

import java.math.BigDecimal;
import whispir_sdk_java.ApiClient;
import org.whispir.api.EventsApi;
import org.openapitools.client.model.Event;
import org.openapitools.client.model.GetEvents200Response;
import whispir_sdk_java.ApiException;

/**
 *
 * @author carlangeloorale
 */
public class EventsClient {

    private static String USERNAME, PASSWORD, API_URL, WORKSPACE_ID;
    private static final String CONTENT_TYPE = "application/vnd.whispir.event-v1+json";
    private static final String ACCEPT = "application/vnd.whispir.event-v1+json";

    public EventsClient(String username, String password, String apiUrl, String workspaceId) {
        EventsClient.USERNAME = username;
        EventsClient.PASSWORD = password;
        EventsClient.API_URL = apiUrl;
        EventsClient.WORKSPACE_ID = workspaceId;
    }

    public static ApiClient createClient() {
        ApiClient client;
        client = new ApiClient();

        client.setBasePath(API_URL);
        client.setUsername(USERNAME);
        client.setPassword(PASSWORD);
        return client;
    }

    public static GetEvents200Response listEvents(String API_KEY,
            String EVENT_TYPE,
            BigDecimal LIMIT,
            BigDecimal OFFSET,
            String SORT_ORDER,
            String SORT_FIELDS) {
        EventsApi event = new EventsApi(createClient());
        try {
            return event.getEvents(WORKSPACE_ID,
                    API_KEY,
                    ACCEPT,
                    EVENT_TYPE,
                    LIMIT,
                    OFFSET,
                    SORT_ORDER,
                    SORT_FIELDS);
        } catch (ApiException e) {
            throw new Error(e);
        }
    }

    public static Event createEvent(
            String API_KEY,
            Event EVENT) {
        EventsApi event = new EventsApi(createClient());
        try {
            return event.createEvent(
                    WORKSPACE_ID,
                    API_KEY,
                    CONTENT_TYPE,
                    ACCEPT,
                    EVENT);
        } catch (ApiException e) {
            throw new Error(e);
        }
    }

    public static Event retrieveEvent(String API_KEY,
            String EVENT_ID,
            BigDecimal LIMIT,
            BigDecimal OFFSET,
            String SORT_ORDER,
            String SORT_FIELDS) {
        EventsApi event = new EventsApi(createClient());
        try {
            return event.getEventById(
                    WORKSPACE_ID,
                    EVENT_ID,
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

    public static void updateEvent(
            String API_KEY,
            String EVENT_ID,
            Event EVENT) {
        EventsApi event = new EventsApi(createClient());
        try {
            event.putEventById(
                    WORKSPACE_ID,
                    EVENT_ID,
                    API_KEY,
                    CONTENT_TYPE,
                    ACCEPT,
                    EVENT
            );
        } catch (ApiException e) {
            throw new Error(e);
        }
    }
}
