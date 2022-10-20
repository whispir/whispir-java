/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whispir_wrapped_java;

import whispir_sdk_java.ApiClient;
import org.whispir.api.ImportsApi;
import org.openapitools.client.model.ModelImport;
import whispir_sdk_java.ApiException;

/**
 *
 * @author carlangeloorale
 */
public class ImportsClient {

    private static String USERNAME, PASSWORD, API_URL, WORKSPACE_ID;
    private static final String CONTENT_TYPE = "application/vnd.whispir.importcontact-v1+json";
    private static final String ACCEPT = "application/vnd.whispir.importcontact-v1+json";

    public ImportsClient(String username, String password, String apiUrl, String workspaceId) {
        ImportsClient.USERNAME = username;
        ImportsClient.PASSWORD = password;
        ImportsClient.API_URL = apiUrl;
        ImportsClient.WORKSPACE_ID = workspaceId;
    }

    public static ApiClient createClient() {
        ApiClient client;
        client = new ApiClient();

        client.setBasePath(API_URL);
        client.setUsername(USERNAME);
        client.setPassword(PASSWORD);
        return client;
    }

    public static void createImport(
            String API_KEY,
            ModelImport MODEL_IMPORT) {
        ImportsApi imports = new ImportsApi(createClient());
        try {
            imports.postImports(
                    WORKSPACE_ID,
                    API_KEY,
                    CONTENT_TYPE,
                    ACCEPT,
                    MODEL_IMPORT);
        } catch (ApiException e) {
            throw new Error(e);
        }
    }
}
