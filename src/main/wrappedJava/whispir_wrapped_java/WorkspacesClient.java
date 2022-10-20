/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whispir_wrapped_java;

import java.math.BigDecimal;
import whispir_sdk_java.ApiClient;
import org.whispir.api.WorkspacesApi;
import org.openapitools.client.model.Workspace;
import org.openapitools.client.model.GetWorkspaces200Response;
import whispir_sdk_java.ApiException;

/**
 *
 * @author carlangeloorale
 */
public class WorkspacesClient {

    private static String USERNAME, PASSWORD, API_URL, WORKSPACE_ID;
    private static final String CONTENT_TYPE = "application/vnd.whispir.workspace-v1+json";
    private static final String ACCEPT = "application/vnd.whispir.workspace-v1+json";

    public WorkspacesClient(String username, String password, String apiUrl, String workspaceId) {
        WorkspacesClient.USERNAME = username;
        WorkspacesClient.PASSWORD = password;
        WorkspacesClient.API_URL = apiUrl;
        WorkspacesClient.WORKSPACE_ID = workspaceId;
    }

    public static ApiClient createClient() {
        ApiClient client;
        client = new ApiClient();

        client.setBasePath(API_URL);
        client.setUsername(USERNAME);
        client.setPassword(PASSWORD);
        return client;
    }

    public static Workspace createWorkspace(Workspace WORKSPACE, String API_KEY) {
        WorkspacesApi workspace = new WorkspacesApi(createClient());
        try {
            return workspace.postWorkspaces(API_KEY, CONTENT_TYPE, ACCEPT, WORKSPACE);
        } catch (ApiException e) {
            throw new Error(e);
        }
    }

    public static GetWorkspaces200Response listWorkspaces(
            String API_KEY,
            BigDecimal LIMIT,
            BigDecimal OFFSET,
            String SORT_ORDER,
            String SORT_FIELDS) {

        WorkspacesApi workspace = new WorkspacesApi(createClient());
        try {
            return workspace.getWorkspaces(
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

    public static Workspace retrieveWorkspace(
            String API_KEY) {

        WorkspacesApi workspace = new WorkspacesApi(createClient());
        try {
            return workspace.getWorkspacesById(
                    WORKSPACE_ID,
                    API_KEY,
                    ACCEPT);
        } catch (ApiException e) {
            throw new Error(e);
        }
    }

    public static void updateWorkspace(
            String API_KEY,
            Workspace WORKSPACE) {

        WorkspacesApi workspace = new WorkspacesApi(createClient());
        try {
            workspace.putWorkspaceById(
                    WORKSPACE_ID,
                    API_KEY,
                    CONTENT_TYPE,
                    ACCEPT,
                    WORKSPACE
            );
        } catch (ApiException e) {
            throw new Error(e);
        }
    }

}
