# ActivitiesApi

All URIs are relative to *https://api.au.whispir.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getActivities**](ActivitiesApi.md#getActivities) | **GET** /activities | List activities |
| [**getWorkspaceActivities**](ActivitiesApi.md#getWorkspaceActivities) | **GET** /workspaces/{workspaceId}/activities | List workspace activities |
| [**postActivities**](ActivitiesApi.md#postActivities) | **POST** /activities | Create an activity |


<a name="getActivities"></a>
# **getActivities**
> ActivityCollection getActivities(xApiKey, accept, limit, offset, sortOrder, sortFields, action, module, user, workspace, status, description, startTime, endTime)

List activities

### Search or Filter on Activity Logs Activity logs can become quickly huge owing to the amount of actions performed. In such cases, to have a proper filtering of data during a GET /activities, Whispir API provides very neat filtering options on the data.  All filter options are to be passed in as URL query parameters.  **Note:** The API currently results in a 404 Not Found when there are no activities present in the log for a given search criteria. This should not be not confused with a failed response. But rather as No Data Found. 

### Example
```java
// Import classes:
import com.whispir.client.ApiClient;
import com.whispir.client.ApiException;
import com.whispir.client.Configuration;
import com.whispir.client.auth.*;
import com.whispir.client.models.*;
import com.whispir.api.ActivitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.au.whispir.com");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ActivitiesApi apiInstance = new ActivitiesApi(defaultClient);
    String xApiKey = "xApiKey_example"; // String | The API key for authentication.
    String accept = "application/vnd.whispir.activity-v1+json"; // String | Application specific mime-type.
    BigDecimal limit = new BigDecimal("20"); // BigDecimal | The number of records to be returned.
    BigDecimal offset = new BigDecimal("0"); // BigDecimal | The record number to start returning from.
    String sortOrder = "asc"; // String | The order in which you require the results to be returned. Either ‘asc’ or ‘desc’
    String sortFields = "lastName,jobTitle"; // String | The fields that you require the ordering to be performed on. Multiple fields can be provided, separated by a comma.
    String action = "Create"; // String | /activities?action=Map
    String module = "System"; // String | /activities?module=Message
    String user = "james"; // String | /activities?user=james
    String workspace = "workspace_example"; // String | /activities?workspace=Whispir.
    String status = "Successful"; // String | /activities?status=Successful
    String description = "Sample Activity"; // String | /activities?description=Imported
    String startTime = "startTime_example"; // String | The date and time to start searching from in the format:dd/mm/yyyy hh:mm. This will search on the `time` field <p>/activities?startTime=01/01/2015%2000:00</p>
    String endTime = "endTime_example"; // String | The date and time to start searching from in the format:dd/mm/yyyy hh:mm <p>/activities?endTime=01/01/2015%2000:00</p>
    try {
      ActivityCollection result = apiInstance.getActivities(xApiKey, accept, limit, offset, sortOrder, sortFields, action, module, user, workspace, status, description, startTime, endTime);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActivitiesApi#getActivities");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xApiKey** | **String**| The API key for authentication. | |
| **accept** | **String**| Application specific mime-type. | [default to application/vnd.whispir.activity-v1+json] [enum: application/vnd.whispir.activity-v1+json, application/vnd.whispir.activity-v1+xml] |
| **limit** | **BigDecimal**| The number of records to be returned. | [optional] [default to 20] |
| **offset** | **BigDecimal**| The record number to start returning from. | [optional] [default to 0] |
| **sortOrder** | **String**| The order in which you require the results to be returned. Either ‘asc’ or ‘desc’ | [optional] [enum: asc, desc] |
| **sortFields** | **String**| The fields that you require the ordering to be performed on. Multiple fields can be provided, separated by a comma. | [optional] |
| **action** | **String**| /activities?action&#x3D;Map | [optional] [enum: Create, Update, Move, Copy, Draft, Send, Modified, Delete, Contact Import File, Login, Approve, Reject, Dispatch, Register, Accept, Closed, Map, Un-map] |
| **module** | **String**| /activities?module&#x3D;Message | [optional] [enum: System, Message, Scheduled Message, User, Contact, DistributionList, Template, Workspace, Event, WebService, Settings, Conversation, Gateway, Workspace Mapping, Folders, Team, RSS, API Mapping, Asset, Instruction] |
| **user** | **String**| /activities?user&#x3D;james | [optional] |
| **workspace** | **String**| /activities?workspace&#x3D;Whispir. | [optional] |
| **status** | **String**| /activities?status&#x3D;Successful | [optional] [enum: Successful, Failed, Rejected] |
| **description** | **String**| /activities?description&#x3D;Imported | [optional] |
| **startTime** | **String**| The date and time to start searching from in the format:dd/mm/yyyy hh:mm. This will search on the &#x60;time&#x60; field &lt;p&gt;/activities?startTime&#x3D;01/01/2015%2000:00&lt;/p&gt; | [optional] |
| **endTime** | **String**| The date and time to start searching from in the format:dd/mm/yyyy hh:mm &lt;p&gt;/activities?endTime&#x3D;01/01/2015%2000:00&lt;/p&gt; | [optional] |

### Return type

[**ActivityCollection**](ActivityCollection.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: examples, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Content-Type -  <br>  * Content-Length -  <br>  * Access-Control-Allow-Origin -  <br>  * Cache-Control -  <br>  * Expires -  <br>  |
| **400** | Invalid or missing request parameters.  Inspect the request parameters and ensure that all required parameters are supplied.  Note the error text in the response and update the request accordingly. |  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * Content-Type -  <br>  * Cache-Control -  <br>  * Expires -  <br>  |
| **401** | Invalid or no credentials passed in the request.  Inspect the authorisation header and ensure that a valid authentication has been provided. |  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * Content-Type -  <br>  * Cache-Control -  <br>  * Expires -  <br>  |
| **403** | Authorisation credentials passed and accepted but the account doesn&#39;t have permission.  * Inspect the authorisation header and ensure that a valid authentication has been provided. * Returned when HTTP is used instead of HTTPS. * Returned when invalid API key is used. * Returned when you have tried to make more API calls than your allowed quota (QPS). Refer to API rate limits. |  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * Content-Type -  <br>  * Cache-Control -  <br>  * Expires -  <br>  |
| **404** | The requested URL doesn&#39;t exist.  The requested resource was not found. Inspect the ID in the URL that was used and ensure that it&#39;s valid.  Also, inspect the Accept and Content-Type headers that are being used to make sure they’re correct for the URL that is being requested. |  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * Content-Type -  <br>  * Cache-Control -  <br>  * Expires -  <br>  |
| **405** | The requested resource doesn&#39;t support the supplied verb.  Inspect the HTTP method that was used in the request and ensure that it&#39;s valid for the resource being requested. |  * Content-Type -  <br>  * Content-Length -  <br>  * Access-Control-Allow-Origin -  <br>  * Cache-Control -  <br>  * Expires -  <br>  |
| **413** | The request payload was too large.  The maximum allowable request size is 10MB (10485760 bytes). |  * Content-Type -  <br>  * Content-Length -  <br>  * Access-Control-Allow-Origin -  <br>  * Cache-Control -  <br>  * Expires -  <br>  |
| **415** | The request was unsuccessful because the requested content type is not supported by the API.  The application client can use this response to determine if it&#39;s asking for a supported version of a resource. On receiving this response, the client can query the developer documentation to determine the appropriate version for the requested resource.  In most cases, this is due to the user not supplying the correct Accept or Content-Type header for the requested URL. |  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * Content-Type -  <br>  * Cache-Control -  <br>  * Expires -  <br>  |
| **422** | The request is formed correctly but due to some condition it can’t be processed. For example, email is required and it&#39;s not provided in the request.  The request did not contain all the information required to perform this method. Check your request for the required fields to be passed in and try again. The offending fields will be specified in the error text of the response. |  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * Content-Type -  <br>  * Cache-Control -  <br>  * Expires -  <br>  |
| **500** | An internal error occurred when processing the request.  Attempt the request again and if the HTTP 500 error re-occurs contact the Whispir Support Team. |  * Content-Type -  <br>  * Content-Length -  <br>  * Access-Control-Allow-Origin -  <br>  * Cache-Control -  <br>  * Expires -  <br>  |
| **501** | The HTTP method being used has not yet been implemented for the requested resource.  The method being used is not implemented for this resource. Check the documentation for the specific resource type. |  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * Content-Type -  <br>  * Cache-Control -  <br>  * Expires -  <br>  |

<a name="getWorkspaceActivities"></a>
# **getWorkspaceActivities**
> ActivityCollection getWorkspaceActivities(workspaceId, xApiKey, accept, limit, offset, sortOrder, sortFields)

List workspace activities

## Restricting to only a single workspace  By default, GET /activities returns all the activities at company level. This covers all the workspaces. So, if the items has to limited to a specific workspace, one has to use the workspace as the endpoint and activities followed by it. 

### Example
```java
// Import classes:
import com.whispir.client.ApiClient;
import com.whispir.client.ApiException;
import com.whispir.client.Configuration;
import com.whispir.client.auth.*;
import com.whispir.client.models.*;
import com.whispir.api.ActivitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.au.whispir.com");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ActivitiesApi apiInstance = new ActivitiesApi(defaultClient);
    String workspaceId = "9A4C5521FFC7B15B"; // String | The identifier for the workspace.
    String xApiKey = "xApiKey_example"; // String | The API key for authentication.
    String accept = "application/vnd.whispir.activity-v1+json"; // String | Application specific mime-type.
    BigDecimal limit = new BigDecimal("20"); // BigDecimal | The number of records to be returned.
    BigDecimal offset = new BigDecimal("0"); // BigDecimal | The record number to start returning from.
    String sortOrder = "asc"; // String | The order in which you require the results to be returned. Either ‘asc’ or ‘desc’
    String sortFields = "lastName,jobTitle"; // String | The fields that you require the ordering to be performed on. Multiple fields can be provided, separated by a comma.
    try {
      ActivityCollection result = apiInstance.getWorkspaceActivities(workspaceId, xApiKey, accept, limit, offset, sortOrder, sortFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActivitiesApi#getWorkspaceActivities");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **workspaceId** | **String**| The identifier for the workspace. | |
| **xApiKey** | **String**| The API key for authentication. | |
| **accept** | **String**| Application specific mime-type. | [default to application/vnd.whispir.activity-v1+json] [enum: application/vnd.whispir.activity-v1+json, application/vnd.whispir.activity-v1+xml] |
| **limit** | **BigDecimal**| The number of records to be returned. | [optional] [default to 20] |
| **offset** | **BigDecimal**| The record number to start returning from. | [optional] [default to 0] |
| **sortOrder** | **String**| The order in which you require the results to be returned. Either ‘asc’ or ‘desc’ | [optional] [enum: asc, desc] |
| **sortFields** | **String**| The fields that you require the ordering to be performed on. Multiple fields can be provided, separated by a comma. | [optional] |

### Return type

[**ActivityCollection**](ActivityCollection.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.whispir.activity-v1+json, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Content-Type -  <br>  * Content-Length -  <br>  * Access-Control-Allow-Origin -  <br>  * Cache-Control -  <br>  * Expires -  <br>  |
| **400** | Invalid or missing request parameters.  Inspect the request parameters and ensure that all required parameters are supplied.  Note the error text in the response and update the request accordingly. |  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * Content-Type -  <br>  * Cache-Control -  <br>  * Expires -  <br>  |
| **401** | Invalid or no credentials passed in the request.  Inspect the authorisation header and ensure that a valid authentication has been provided. |  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * Content-Type -  <br>  * Cache-Control -  <br>  * Expires -  <br>  |
| **403** | Authorisation credentials passed and accepted but the account doesn&#39;t have permission.  * Inspect the authorisation header and ensure that a valid authentication has been provided. * Returned when HTTP is used instead of HTTPS. * Returned when invalid API key is used. * Returned when you have tried to make more API calls than your allowed quota (QPS). Refer to API rate limits. |  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * Content-Type -  <br>  * Cache-Control -  <br>  * Expires -  <br>  |
| **404** | The requested URL doesn&#39;t exist.  The requested resource was not found. Inspect the ID in the URL that was used and ensure that it&#39;s valid.  Also, inspect the Accept and Content-Type headers that are being used to make sure they’re correct for the URL that is being requested. |  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * Content-Type -  <br>  * Cache-Control -  <br>  * Expires -  <br>  |
| **405** | The requested resource doesn&#39;t support the supplied verb.  Inspect the HTTP method that was used in the request and ensure that it&#39;s valid for the resource being requested. |  * Content-Type -  <br>  * Content-Length -  <br>  * Access-Control-Allow-Origin -  <br>  * Cache-Control -  <br>  * Expires -  <br>  |
| **413** | The request payload was too large.  The maximum allowable request size is 10MB (10485760 bytes). |  * Content-Type -  <br>  * Content-Length -  <br>  * Access-Control-Allow-Origin -  <br>  * Cache-Control -  <br>  * Expires -  <br>  |
| **415** | The request was unsuccessful because the requested content type is not supported by the API.  The application client can use this response to determine if it&#39;s asking for a supported version of a resource. On receiving this response, the client can query the developer documentation to determine the appropriate version for the requested resource.  In most cases, this is due to the user not supplying the correct Accept or Content-Type header for the requested URL. |  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * Content-Type -  <br>  * Cache-Control -  <br>  * Expires -  <br>  |
| **422** | The request is formed correctly but due to some condition it can’t be processed. For example, email is required and it&#39;s not provided in the request.  The request did not contain all the information required to perform this method. Check your request for the required fields to be passed in and try again. The offending fields will be specified in the error text of the response. |  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * Content-Type -  <br>  * Cache-Control -  <br>  * Expires -  <br>  |
| **500** | An internal error occurred when processing the request.  Attempt the request again and if the HTTP 500 error re-occurs contact the Whispir Support Team. |  * Content-Type -  <br>  * Content-Length -  <br>  * Access-Control-Allow-Origin -  <br>  * Cache-Control -  <br>  * Expires -  <br>  |
| **501** | The HTTP method being used has not yet been implemented for the requested resource.  The method being used is not implemented for this resource. Check the documentation for the specific resource type. |  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * Content-Type -  <br>  * Cache-Control -  <br>  * Expires -  <br>  |

<a name="postActivities"></a>
# **postActivities**
> Activity postActivities(xApiKey, contentType, accept, activity)

Create an activity

Activities are all the individual changes, tasks, calls, messages and so on performed in a given company workspace. Each activity log entry contains information about the workspace, the module (message, email, IVR ...), the user who performed the activity, time stamps, description of the activity, its status (success, fail) and so on.  All of these help meet auditing and standards compliance and also change tracking. For example: * As a Whispir API user (Voice module), you want to be able to update the Whispir activity log as a call progresses through the IVR to ensure that the auditing shows exactly what information a caller heard.  * As a Whispir API user (SMS module), you want to able to retrieve information from the activity log about all the messages sent by a specific user. As activity information is sensitive, stricter permission rules apply to the data served by these endpoints.  * If the user is a *Company Administrator* or *Company Leader*, retrieving the activity will produce a **_200 OK_** with the valid response * If the user is a *Company Member* or *Company Guest*, they will receive instead a **_403 Forbidden_** response advising that they don’t have permission to access this resource * A *Company Administrator* or *Company Leader* can also create content within the activity stream. They do this through a POST of data to either the _/activities_ endpoint or to the specific activity ID * They must specify a valid _‘Action’_, _‘Description’_ and _‘Status’_ within their request * Posting to the _/activities_ endpoint will create a new activity * Posting to the _/activities/{ID}_ endpoint will append the content to the detail of the specified activity

### Example
```java
// Import classes:
import com.whispir.client.ApiClient;
import com.whispir.client.ApiException;
import com.whispir.client.Configuration;
import com.whispir.client.auth.*;
import com.whispir.client.models.*;
import com.whispir.api.ActivitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.au.whispir.com");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ActivitiesApi apiInstance = new ActivitiesApi(defaultClient);
    String xApiKey = "xApiKey_example"; // String | The API key for authentication.
    String contentType = "application/vnd.whispir.activity-v1+json"; // String | Application specific mime-type.
    String accept = "application/vnd.whispir.activity-v1+json"; // String | Application specific mime-type.
    Activity activity = new Activity(); // Activity | 
    try {
      Activity result = apiInstance.postActivities(xApiKey, contentType, accept, activity);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActivitiesApi#postActivities");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xApiKey** | **String**| The API key for authentication. | |
| **contentType** | **String**| Application specific mime-type. | [default to application/vnd.whispir.activity-v1+json] [enum: application/vnd.whispir.activity-v1+json, application/vnd.whispir.activity-v1+xml] |
| **accept** | **String**| Application specific mime-type. | [default to application/vnd.whispir.activity-v1+json] [enum: application/vnd.whispir.activity-v1+json, application/vnd.whispir.activity-v1+xml] |
| **activity** | [**Activity**](Activity.md)|  | |

### Return type

[**Activity**](Activity.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.whispir.activity-v1+json
 - **Accept**: application/vnd.whispir.activity-v1+json, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  * Content-Type -  <br>  * Content-Length -  <br>  * Access-Control-Allow-Origin -  <br>  * Cache-Control -  <br>  * Expires -  <br>  * Location - The URI to fetch details of the resource. <br>  |
| **400** | Invalid or missing request parameters.  Inspect the request parameters and ensure that all required parameters are supplied.  Note the error text in the response and update the request accordingly. |  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * Content-Type -  <br>  * Cache-Control -  <br>  * Expires -  <br>  |
| **401** | Invalid or no credentials passed in the request.  Inspect the authorisation header and ensure that a valid authentication has been provided. |  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * Content-Type -  <br>  * Cache-Control -  <br>  * Expires -  <br>  |
| **403** | Authorisation credentials passed and accepted but the account doesn&#39;t have permission.  * Inspect the authorisation header and ensure that a valid authentication has been provided. * Returned when HTTP is used instead of HTTPS. * Returned when invalid API key is used. * Returned when you have tried to make more API calls than your allowed quota (QPS). Refer to API rate limits. |  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * Content-Type -  <br>  * Cache-Control -  <br>  * Expires -  <br>  |
| **404** | The requested URL doesn&#39;t exist.  The requested resource was not found. Inspect the ID in the URL that was used and ensure that it&#39;s valid.  Also, inspect the Accept and Content-Type headers that are being used to make sure they’re correct for the URL that is being requested. |  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * Content-Type -  <br>  * Cache-Control -  <br>  * Expires -  <br>  |
| **405** | The requested resource doesn&#39;t support the supplied verb.  Inspect the HTTP method that was used in the request and ensure that it&#39;s valid for the resource being requested. |  * Content-Type -  <br>  * Content-Length -  <br>  * Access-Control-Allow-Origin -  <br>  * Cache-Control -  <br>  * Expires -  <br>  |
| **413** | The request payload was too large.  The maximum allowable request size is 10MB (10485760 bytes). |  * Content-Type -  <br>  * Content-Length -  <br>  * Access-Control-Allow-Origin -  <br>  * Cache-Control -  <br>  * Expires -  <br>  |
| **415** | The request was unsuccessful because the requested content type is not supported by the API.  The application client can use this response to determine if it&#39;s asking for a supported version of a resource. On receiving this response, the client can query the developer documentation to determine the appropriate version for the requested resource.  In most cases, this is due to the user not supplying the correct Accept or Content-Type header for the requested URL. |  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * Content-Type -  <br>  * Cache-Control -  <br>  * Expires -  <br>  |
| **422** | The request is formed correctly but due to some condition it can’t be processed. For example, email is required and it&#39;s not provided in the request.  The request did not contain all the information required to perform this method. Check your request for the required fields to be passed in and try again. The offending fields will be specified in the error text of the response. |  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * Content-Type -  <br>  * Cache-Control -  <br>  * Expires -  <br>  |
| **500** | An internal error occurred when processing the request.  Attempt the request again and if the HTTP 500 error re-occurs contact the Whispir Support Team. |  * Content-Type -  <br>  * Content-Length -  <br>  * Access-Control-Allow-Origin -  <br>  * Cache-Control -  <br>  * Expires -  <br>  |
| **501** | The HTTP method being used has not yet been implemented for the requested resource.  The method being used is not implemented for this resource. Check the documentation for the specific resource type. |  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * Content-Type -  <br>  * Cache-Control -  <br>  * Expires -  <br>  |

