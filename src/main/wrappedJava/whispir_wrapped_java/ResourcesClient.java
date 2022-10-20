/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whispir_wrapped_java;

import java.math.BigDecimal;
import org.openapitools.client.model.GetResources200Response;
import whispir_sdk_java.ApiClient;
import org.whispir.api.ResourcesApi;
import org.openapitools.client.model.Resource;
import whispir_sdk_java.ApiException;

/**
 *
 * @author carlangeloorale
 */
public class ResourcesClient {

    private static String USERNAME, PASSWORD, API_URL, WORKSPACE_ID;
    private static final String CONTENT_TYPE = "application/vnd.whispir.auth-v1+json";
    private static final String ACCEPT = "application/vnd.whispir.auth-v1+json";

    public ResourcesClient(String username, String password, String apiUrl, String workspaceId) {
        ResourcesClient.USERNAME = username;
        ResourcesClient.PASSWORD = password;
        ResourcesClient.API_URL = apiUrl;
        ResourcesClient.WORKSPACE_ID = workspaceId;
    }

    public static ApiClient createClient() {
        ApiClient client;
        client = new ApiClient();

        client.setBasePath(API_URL);
        client.setUsername(USERNAME);
        client.setPassword(PASSWORD);
        return client;
    }

    public static Resource createResource(Resource RESOURCE, String API_KEY) {
        ResourcesApi resource = new ResourcesApi(createClient());
        try {
            return resource.postResources(WORKSPACE_ID, API_KEY, ACCEPT, CONTENT_TYPE, RESOURCE);
        } catch (ApiException e) {
            throw new Error(e);
        }
    }

    public static GetResources200Response listResources(
            String API_KEY,
            BigDecimal LIMIT,
            BigDecimal OFFSET,
            String SORT_ORDER,
            String SORT_FIELDS,
            String SCOPE,
            String NAME) {
        ResourcesApi resource = new ResourcesApi(createClient());
        try {
            return resource.getResources(
                    WORKSPACE_ID,
                    API_KEY,
                    ACCEPT,
                    LIMIT,
                    OFFSET,
                    SORT_ORDER,
                    SORT_FIELDS,
                    SCOPE,
                    NAME);
        } catch (ApiException e) {
            throw new Error(e);
        }
    }

    public static Resource retrieveResource(
            String API_KEY,
            String RESOURCE_ID) {
        ResourcesApi resource = new ResourcesApi(createClient());

        try {
            return resource.getResourcesById(
                    WORKSPACE_ID,
                    API_KEY,
                    ACCEPT,
                    RESOURCE_ID);
        } catch (ApiException e) {
            throw new Error(e);
        }
    }

    public static Resource updateResource(
            String API_KEY,
            String RESOURCE_ID,
            Resource RESOURCE) {
        ResourcesApi resource = new ResourcesApi(createClient());
        try {
            return resource.putResourcesById(
                    WORKSPACE_ID,
                    API_KEY,
                    CONTENT_TYPE,
                    ACCEPT,
                    RESOURCE_ID,
                    RESOURCE);
        } catch (ApiException e) {
            throw new Error(e);
        }
    }

    public static void deleteResource(
            String API_KEY,
            String RESOURCE_ID) {
        ResourcesApi resource = new ResourcesApi(createClient());
        try {
            resource.deleteResourcesById(
                    WORKSPACE_ID,
                    API_KEY,
                    RESOURCE_ID);
        } catch (ApiException e) {
            throw new Error(e);
        }
    }
}
