/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whispir_wrapped_java;

import whispir_sdk_java.ApiClient;
import org.whispir.api.AuthApi;
import whispir_sdk_java.ApiException;

/**
 *
 * @author carlangeloorale
 */
public class AuthClient {

    private static String USERNAME, PASSWORD, API_URL;
    private static final String CONTENT_TYPE = "application/vnd.whispir.auth-v1+json";
    private static final String ACCEPT = "application/vnd.whispir.auth-v1+json";

    public AuthClient(String username, String password, String apiUrl) {
        AuthClient.USERNAME = username;
        AuthClient.PASSWORD = password;
        AuthClient.API_URL = apiUrl;
    }

    public static ApiClient createClient() {
        ApiClient client;
        client = new ApiClient();

        client.setBasePath(API_URL);
        client.setUsername(USERNAME);
        client.setPassword(PASSWORD);
        return client;
    }

    public static void createAuthToken(
            String API_KEY) {
        AuthApi auth = new AuthApi(createClient());
        try {
            auth.postAuth(
                    API_KEY,
                    CONTENT_TYPE,
                    ACCEPT);
        } catch (ApiException e) {
            throw new Error(e);
        }
    }

    public static void verifyAuthToken(
            String API_KEY) {
        AuthApi auth = new AuthApi(createClient());
        try {
            auth.getAuthVerification(API_KEY, ACCEPT);
        } catch (ApiException e) {
            throw new Error(e);
        }
    }
}
