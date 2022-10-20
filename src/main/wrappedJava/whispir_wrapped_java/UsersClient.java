/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whispir_wrapped_java;

import java.math.BigDecimal;
import whispir_sdk_java.ApiClient;
import org.whispir.api.UsersApi;
import org.openapitools.client.model.User;
import org.openapitools.client.model.GetUsers200Response;
import whispir_sdk_java.ApiException;

/**
 *
 * @author carlangeloorale
 */
public class UsersClient {

    private static String USERNAME, PASSWORD, API_URL, WORKSPACE_ID;
    private static final String CONTENT_TYPE = "application/vnd.whispir.user-v1+json";
    private static final String ACCEPT = "application/vnd.whispir.user-v1+json";

    public UsersClient(String username, String password, String apiUrl, String workspaceId) {
        UsersClient.USERNAME = username;
        UsersClient.PASSWORD = password;
        UsersClient.API_URL = apiUrl;
        UsersClient.WORKSPACE_ID = workspaceId;
    }

    public static ApiClient createClient() {
        ApiClient client;
        client = new ApiClient();

        client.setBasePath(API_URL);
        client.setUsername(USERNAME);
        client.setPassword(PASSWORD);
        return client;
    }

    public static User createUser(User USER, String API_KEY) {
        UsersApi user = new UsersApi(createClient());
        try {
            return user.postUsers(API_KEY, CONTENT_TYPE, ACCEPT, USER);
        } catch (ApiException e) {
            throw new Error(e);
        }
    }

    public static GetUsers200Response listUsers(
            String API_KEY, String FIELD_NAME,
            String SORT_ORDER,
            String SORT_FIELDS,
            BigDecimal LIMIT,
            BigDecimal OFFSET) {
        UsersApi user = new UsersApi(createClient());
        try {
            return user.getUsers(
                    API_KEY,
                    ACCEPT,
                    FIELD_NAME,
                    SORT_ORDER,
                    SORT_FIELDS,
                    LIMIT,
                    OFFSET);
        } catch (ApiException e) {
            throw new Error(e);
        }
    }

    public static void deleteAllUsers(String API_KEY) {
        UsersApi user = new UsersApi(createClient());
        try {
            user.deleteUsers(
                    API_KEY,
                    CONTENT_TYPE,
                    ACCEPT);
        } catch (ApiException e) {
            throw new Error(e);
        }
    }

    public static void retrieveUser(
            String API_KEY,
            String USER_ID,
            User USER) {
        UsersApi user = new UsersApi(createClient());
        try {
            user.putUsersById(
                    API_KEY,
                    USER_ID,
                    CONTENT_TYPE,
                    ACCEPT,
                    USER
            );
        } catch (ApiException e) {
            throw new Error(e);
        }
    }

    public static void deleteUser(
            String API_KEY,
            String USER_ID) {
        UsersApi user = new UsersApi(createClient());
        try {
            user.deleteUsersById(
                    API_KEY,
                    USER_ID,
                    CONTENT_TYPE,
                    ACCEPT);
        } catch (ApiException e) {
            throw new Error(e);
        }
    }

    public static GetUsers200Response listWorkspaceUsers(
            String API_KEY,
            String SORT_ORDER,
            String SORT_FIELDS,
            BigDecimal LIMIT,
            BigDecimal OFFSET) {
        UsersApi user = new UsersApi(createClient());
        try {
            return user.getWorkspaceUsers(
                    WORKSPACE_ID,
                    API_KEY,
                    ACCEPT,
                    SORT_ORDER,
                    SORT_FIELDS,
                    LIMIT,
                    OFFSET);
        } catch (ApiException e) {
            throw new Error(e);
        }
    }
}
