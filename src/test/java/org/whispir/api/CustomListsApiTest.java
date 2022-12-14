/*
 * Whispir Platform API
 * Whispir Platform API for cross channel and multi channel communications. Documentation on each endpoint is available at https://developers.whispir.com.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@whispir.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.whispir.api;

import whispir_sdk_java.ApiException;
import java.math.BigDecimal;
import org.openapitools.client.model.CustomList;
import org.openapitools.client.model.GetCustomLists200Response;
import org.openapitools.client.model.GetMessages400Response;
import org.openapitools.client.model.GetMessages401Response;
import org.openapitools.client.model.GetMessages403Response;
import org.openapitools.client.model.GetMessages404Response;
import org.openapitools.client.model.GetMessages405Response;
import org.openapitools.client.model.GetMessages415Response;
import org.openapitools.client.model.GetMessages422Response;
import org.openapitools.client.model.GetMessages500Response;
import org.openapitools.client.model.GetMessages501Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CustomListsApi
 */
@Disabled
public class CustomListsApiTest {

    private final CustomListsApi api = new CustomListsApi();

    /**
     * List custom lists
     *
     * ### High-Level Response Elements **id:** Number   Specifies the unique id of the List.  **name:** String   Specifies the name of the List.  **type:** String   Specifies the type. The type can be one of: *   INCIDENT *   MESSAGE *   CONTACT *   RSS  **sorttype:** String   Specifies the sorting order. The order can be one of: *   As Displayed *   Ascending *   Descending  **linked:** String   Specifies the linked status. Linked list item values are dependent on other lists. The linked can be one of: *   disabled *   list id to which this is linked with  **link:** Array   Provides a list of URLs that can be used to manipulate or access the list.  *   uri - the link to access the list *   rel - the descriptor for what the link will do *   method - the HTTP method to use with this particular link  ### Search or Filter on Custom Lists  API allows you to be able to query the GET /customlists endpoint using the following filters.  **Search Criteria** - **name:** &#x60;/customlists?name&#x3D;Category&#x60;  - **type:** &#x60;/customlists?type&#x3D;Message&#x60;  *** **Note:** The API currently results in a 404 Not Found when there are no activities present in the log for a given search criteria. This should not be not confused with a failed response. But rather as No Data Found. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCustomListsTest() throws ApiException {
        String xApiKey = null;
        String accept = null;
        BigDecimal limit = null;
        BigDecimal offset = null;
        String sortOrder = null;
        String sortFields = null;
        String name = null;
        String type = null;
        GetCustomLists200Response response = api.getCustomLists(xApiKey, accept, limit, offset, sortOrder, sortFields, name, type);
        // TODO: test validations
    }

    /**
     * Retrieve a custom list
     *
     * ### High-Level Response Elements  **id:** Number   Specifies the unique id of the List.  **name:** String   Specifies the name of the List.  **type:** String   Specifies the type. The type can be one of: *   INCIDENT *   MESSAGE *   CONTACT *   RSS  **createdDate:** String   Specifies the date of the List creation.  **sorttype:** String   Specifies the sorting order. The order can be one of: *   As Displayed *   Ascending *   Descending  **linked:** String   Specifies the linked status. Linked list item values are dependent on other lists. The linked can be one of: *   disabled *   list id to which this is linked with  **customlabellists:** Object   The &#x60;name&#x60; is the text that is shown to the user, where as the &#x60;value&#x60; is the internally passed in value.  **link:** Array   Provides a list of URLs that can be used to manipulate or access the list. *   uri - the link to access the list *   rel - the descriptor for what the link will do *   method - the HTTP method to use with this particular link 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCustomListsByIdTest() throws ApiException {
        String xApiKey = null;
        String accept = null;
        String customlistId = null;
        CustomList response = api.getCustomListsById(xApiKey, accept, customlistId);
        // TODO: test validations
    }

}
