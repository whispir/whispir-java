/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whispir_wrapped_java;

import java.math.BigDecimal;
import whispir_sdk_java.ApiClient;
import org.whispir.api.CustomListsApi;
import org.openapitools.client.model.CustomList;
import org.openapitools.client.model.GetCustomLists200Response;
import whispir_sdk_java.ApiException;

/**
 *
 * @author carlangeloorale
 */
public class CustomListsClient {

    private static String USERNAME, PASSWORD, API_URL;
    private static final String ACCEPT = "application/vnd.whispir.customlist-v1+json";

    public CustomListsClient(String username, String password, String apiUrl) {
        CustomListsClient.USERNAME = username;
        CustomListsClient.PASSWORD = password;
        CustomListsClient.API_URL = apiUrl;
    }

    public static ApiClient createClient() {
        ApiClient client;
        client = new ApiClient();

        client.setBasePath(API_URL);
        client.setUsername(USERNAME);
        client.setPassword(PASSWORD);
        return client;
    }

    public static GetCustomLists200Response listCustomLists(
            String API_KEY,
            BigDecimal LIMIT,
            BigDecimal OFFSET,
            String SORT_ORDER,
            String SORT_FIELDS,
            String NAME,
            String TYPE) {
        CustomListsApi customList = new CustomListsApi(createClient());
        try {
            return customList.getCustomLists(
                    API_KEY,
                    ACCEPT,
                    LIMIT,
                    OFFSET,
                    SORT_ORDER,
                    SORT_FIELDS,
                    NAME,
                    TYPE);
        } catch (ApiException e) {
            throw new Error(e);
        }
    }

    public static CustomList retrieveCustomList(String API_KEY, String CUSTOM_LIST_ID) {
        CustomListsApi customList = new CustomListsApi(createClient());
        try {
            return customList.getCustomListsById(
                    API_KEY,
                    ACCEPT,
                    CUSTOM_LIST_ID);
        } catch (ApiException e) {
            throw new Error(e);
        }
    }
}
