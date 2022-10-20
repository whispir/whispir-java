/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whispir_wrapped_java;

import java.math.BigDecimal;
import org.openapitools.client.model.GetTemplates200Response;
import whispir_sdk_java.ApiClient;
import org.whispir.api.TemplatesApi;
import org.openapitools.client.model.Template;
import whispir_sdk_java.ApiException;

/**
 *
 * @author carlangeloorale
 */
public class TemplatesClient {

    private static String USERNAME, PASSWORD, API_URL, WORKSPACE_ID;
    private static final String CONTENT_TYPE = "application/vnd.whispir.template-v1+json";
    private static final String ACCEPT = "application/vnd.whispir.template-v1+json";

    public TemplatesClient(String username, String password, String apiUrl, String workspaceId) {
        TemplatesClient.USERNAME = username;
        TemplatesClient.PASSWORD = password;
        TemplatesClient.API_URL = apiUrl;
        TemplatesClient.WORKSPACE_ID = workspaceId;
    }

    public static ApiClient createClient() {
        ApiClient client;
        client = new ApiClient();

        client.setBasePath(API_URL);
        client.setUsername(USERNAME);
        client.setPassword(PASSWORD);
        return client;
    }

    public static Template createTemplate(String API_KEY, Template TEMPLATE) {
        TemplatesApi template = new TemplatesApi(createClient());
        try {
            return template.postTemplates(WORKSPACE_ID, API_KEY, CONTENT_TYPE, ACCEPT, TEMPLATE);
        } catch (ApiException e) {
            throw new Error(e);
        }
    }

    public static GetTemplates200Response listTemplates(
            String API_KEY,
            BigDecimal LIMIT,
            BigDecimal OFFSET,
            String SORT_ORDER,
            String SORT_FIELDS) {
        TemplatesApi template = new TemplatesApi(createClient());

        try {
            return template.getTemplates(
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

    public static void retrieveTemplate(
            String API_KEY,
            String TEMPLATE_ID) {
        TemplatesApi template = new TemplatesApi(createClient());

        try {
            template.getTemplatesById(
                    WORKSPACE_ID,
                    API_KEY,
                    TEMPLATE_ID,
                    ACCEPT
            );
        } catch (ApiException e) {
            throw new Error(e);
        }
    }

    public static void updateTemplate(
            String API_KEY,
            String TEMPLATE_ID,
            Template TEMPLATE) {
        TemplatesApi template = new TemplatesApi(createClient());

        try {
            template.putTemplatesById(
                    WORKSPACE_ID,
                    API_KEY,
                    TEMPLATE_ID,
                    CONTENT_TYPE,
                    ACCEPT,
                    TEMPLATE);
        } catch (ApiException e) {
            throw new Error(e);
        }
    }

    public static void deleteTemplate(
            String API_KEY,
            String TEMPLATE_ID) {
        TemplatesApi template = new TemplatesApi(createClient());
        try {
            template.deleteTemplatesById(
                    WORKSPACE_ID,
                    API_KEY,
                    TEMPLATE_ID,
                    CONTENT_TYPE,
                    ACCEPT);
        } catch (ApiException e) {
            throw new Error(e);
        }
    }
}
