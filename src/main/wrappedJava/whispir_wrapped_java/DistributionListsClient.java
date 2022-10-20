/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whispir_wrapped_java;

import java.math.BigDecimal;
import whispir_sdk_java.ApiClient;
import org.whispir.api.DistributionListsApi;
import org.openapitools.client.model.GetDistributionLists200Response;
import org.openapitools.client.model.GetDistributionLists200ResponseDistributionLists;
import whispir_sdk_java.ApiException;

/**
 *
 * @author carlangeloorale
 */
public class DistributionListsClient {

    private static String USERNAME, PASSWORD, API_URL, WORKSPACE_ID;
    private static final String CONTENT_TYPE = "application/vnd.whispir.distributionlist-v1+json";
    private static final String ACCEPT = "application/vnd.whispir.distributionlist-v1+json";

    public DistributionListsClient(String username, String password, String apiUrl, String workspaceId) {
        DistributionListsClient.USERNAME = username;
        DistributionListsClient.PASSWORD = password;
        DistributionListsClient.API_URL = apiUrl;
        DistributionListsClient.WORKSPACE_ID = workspaceId;
    }

    public static ApiClient createClient() {
        ApiClient client;
        client = new ApiClient();

        client.setBasePath(API_URL);
        client.setUsername(USERNAME);
        client.setPassword(PASSWORD);
        return client;
    }

    public static GetDistributionLists200ResponseDistributionLists createDistributionlist(GetDistributionLists200ResponseDistributionLists GET_DISTRIBUTION_LISTS_200_RESPONSE_DISTRIBUTION_LISTS, String API_KEY) {
        DistributionListsApi distributionList = new DistributionListsApi(createClient());
        try {
            return distributionList.postDistributionLists(WORKSPACE_ID, API_KEY, CONTENT_TYPE, ACCEPT, GET_DISTRIBUTION_LISTS_200_RESPONSE_DISTRIBUTION_LISTS);
        } catch (ApiException e) {
            throw new Error(e);
        }
    }

    public static GetDistributionLists200Response listDistributionlists(
            String API_KEY,
            BigDecimal LIMIT,
            BigDecimal OFFSET,
            String SORT_ORDER,
            String SORT_FIELDS,
            String NAME,
            String DESCRIPTION) {
        DistributionListsApi distributionList = new DistributionListsApi(createClient());
        try {
            return distributionList.getDistributionLists(
                    WORKSPACE_ID,
                    API_KEY,
                    ACCEPT,
                    LIMIT,
                    OFFSET,
                    SORT_ORDER,
                    SORT_FIELDS,
                    NAME,
                    DESCRIPTION);
        } catch (ApiException e) {
            throw new Error(e);
        }
    }

    public static void retrieveDistributionlist(
            String API_KEY,
            String DISTRIBUTION_LIST_ID) {
        DistributionListsApi distributionList = new DistributionListsApi(createClient());
        try {
            distributionList.getDistributionListsById(
                    WORKSPACE_ID,
                    API_KEY,
                    ACCEPT,
                    DISTRIBUTION_LIST_ID);
        } catch (ApiException e) {
            throw new Error(e);
        }
    }

    public static void updateDistributionlist(
            String API_KEY,
            String DISTRIBUTION_LIST_ID,
            GetDistributionLists200ResponseDistributionLists GET_DISTRIBUTION_LISTS_200_RESPONSE_DISTRIBUTION_LISTS) {
        DistributionListsApi distributionList = new DistributionListsApi(createClient());
        try {
            distributionList.putDistributionListsById(
                    WORKSPACE_ID,
                    API_KEY,
                    CONTENT_TYPE,
                    ACCEPT,
                    DISTRIBUTION_LIST_ID,
                    GET_DISTRIBUTION_LISTS_200_RESPONSE_DISTRIBUTION_LISTS);
        } catch (ApiException e) {
            throw new Error(e);
        }
    }

    public static void deleteDistributionlist(
            String API_KEY,
            String DISTRIBUTION_LIST_ID) {
        DistributionListsApi distributionList = new DistributionListsApi(createClient());
        try {
            distributionList.deleteDistributionListsById(
                    WORKSPACE_ID,
                    API_KEY,
                    DISTRIBUTION_LIST_ID);
        } catch (ApiException e) {
            throw new Error(e);
        }
    }
}
