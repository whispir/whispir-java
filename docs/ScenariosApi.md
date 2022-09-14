# ScenariosApi

All URIs are relative to *https://api.au.whispir.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteScenariosById**](ScenariosApi.md#deleteScenariosById) | **DELETE** /workspaces/{workspaceId}/scenarios/{scenarioId} | Delete a scenario |
| [**getScenarios**](ScenariosApi.md#getScenarios) | **GET** /workspaces/{workspaceId}/scenarios | List scenarios |
| [**getScenariosById**](ScenariosApi.md#getScenariosById) | **GET** /workspaces/{workspaceId}/scenarios/{scenarioId} | Retrieve a scenario |
| [**postScenarios**](ScenariosApi.md#postScenarios) | **POST** /workspaces/{workspaceId}/scenarios | Create a scenario |
| [**postScenariosById**](ScenariosApi.md#postScenariosById) | **POST** /workspaces/{workspaceId}/scenarios/{scenarioId} | Run a scenario |
| [**putScenariosById**](ScenariosApi.md#putScenariosById) | **PUT** /workspaces/{workspaceId}/scenarios/{scenarioId} | Update a scenario |


<a name="deleteScenariosById"></a>
# **deleteScenariosById**
> deleteScenariosById(workspaceId, xApiKey, scenarioId)

Delete a scenario

Deletes a Scenario object.

### Example
```java
// Import classes:
import whispir_sdk_java.ApiClient;
import whispir_sdk_java.ApiException;
import whispir_sdk_java.Configuration;
import whispir_sdk_java.auth.*;
import whispir_sdk_java.models.*;
import org.whispir.api.ScenariosApi;

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

    ScenariosApi apiInstance = new ScenariosApi(defaultClient);
    String workspaceId = "9A4C5521FFC7B15B"; // String | The identifier for the workspace.
    String xApiKey = "xApiKey_example"; // String | The API key for authentication.
    String scenarioId = "41048D9483C8CF2A"; // String | The id of the Scenarios to be deleted
    try {
      apiInstance.deleteScenariosById(workspaceId, xApiKey, scenarioId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenariosApi#deleteScenariosById");
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
| **scenarioId** | **String**| The id of the Scenarios to be deleted | |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  * Access-Control-Allow-Origin -  <br>  * Cache-Control -  <br>  * Expires -  <br>  |
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

<a name="getScenarios"></a>
# **getScenarios**
> GetScenarios200Response getScenarios(workspaceId, xApiKey, accept, limit, offset, sortOrder, sortFields)

List scenarios

Returns a list of your scenarios.

### Example
```java
// Import classes:
import whispir_sdk_java.ApiClient;
import whispir_sdk_java.ApiException;
import whispir_sdk_java.Configuration;
import whispir_sdk_java.auth.*;
import whispir_sdk_java.models.*;
import org.whispir.api.ScenariosApi;

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

    ScenariosApi apiInstance = new ScenariosApi(defaultClient);
    String workspaceId = "9A4C5521FFC7B15B"; // String | The identifier for the workspace.
    String xApiKey = "xApiKey_example"; // String | The API key for authentication.
    String accept = "application/vnd.whispir.scenario-v1+json"; // String | Application specific mime-type.
    BigDecimal limit = new BigDecimal("20"); // BigDecimal | The number of records to be returned.
    BigDecimal offset = new BigDecimal("0"); // BigDecimal | The record number to start returning from.
    String sortOrder = "asc"; // String | The order in which you require the results to be returned. Either ‘asc’ or ‘desc’
    String sortFields = "lastName,jobTitle"; // String | The fields that you require the ordering to be performed on. Multiple fields can be provided, separated by a comma.
    try {
      GetScenarios200Response result = apiInstance.getScenarios(workspaceId, xApiKey, accept, limit, offset, sortOrder, sortFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenariosApi#getScenarios");
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
| **accept** | **String**| Application specific mime-type. | [enum: application/vnd.whispir.scenario-v1+json, application/vnd.whispir.scenario-v1+xml] |
| **limit** | **BigDecimal**| The number of records to be returned. | [optional] [default to 20] |
| **offset** | **BigDecimal**| The record number to start returning from. | [optional] [default to 0] |
| **sortOrder** | **String**| The order in which you require the results to be returned. Either ‘asc’ or ‘desc’ | [optional] [enum: asc, desc] |
| **sortFields** | **String**| The fields that you require the ordering to be performed on. Multiple fields can be provided, separated by a comma. | [optional] |

### Return type

[**GetScenarios200Response**](GetScenarios200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

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

<a name="getScenariosById"></a>
# **getScenariosById**
> Scenario getScenariosById(workspaceId, xApiKey, accept, scenarioId)

Retrieve a scenario

Retrieves a Scenario object.

### Example
```java
// Import classes:
import whispir_sdk_java.ApiClient;
import whispir_sdk_java.ApiException;
import whispir_sdk_java.Configuration;
import whispir_sdk_java.auth.*;
import whispir_sdk_java.models.*;
import org.whispir.api.ScenariosApi;

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

    ScenariosApi apiInstance = new ScenariosApi(defaultClient);
    String workspaceId = "9A4C5521FFC7B15B"; // String | The identifier for the workspace.
    String xApiKey = "xApiKey_example"; // String | The API key for authentication.
    String accept = "application/vnd.whispir.scenario-v1+json"; // String | Application specific mime-type.
    String scenarioId = "41048D9483C8CF2A"; // String | Enter Scenarios id.
    try {
      Scenario result = apiInstance.getScenariosById(workspaceId, xApiKey, accept, scenarioId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenariosApi#getScenariosById");
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
| **accept** | **String**| Application specific mime-type. | [enum: application/vnd.whispir.scenario-v1+json, application/vnd.whispir.scenario-v1+xml] |
| **scenarioId** | **String**| Enter Scenarios id. | |

### Return type

[**Scenario**](Scenario.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

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

<a name="postScenarios"></a>
# **postScenarios**
> postScenarios(workspaceId, xApiKey, contentType, accept, scenario)

Create a scenario

A scenario is a combination of a message and contacts. So, its structure contains section for both message as well as contact information. API currently only supports creation of scenario with SMS as communication mode. 

### Example
```java
// Import classes:
import whispir_sdk_java.ApiClient;
import whispir_sdk_java.ApiException;
import whispir_sdk_java.Configuration;
import whispir_sdk_java.auth.*;
import whispir_sdk_java.models.*;
import org.whispir.api.ScenariosApi;

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

    ScenariosApi apiInstance = new ScenariosApi(defaultClient);
    String workspaceId = "9A4C5521FFC7B15B"; // String | The identifier for the workspace.
    String xApiKey = "xApiKey_example"; // String | The API key for authentication.
    String contentType = "application/vnd.whispir.scenario-v1+json"; // String | Application specific mime-type.
    String accept = "application/vnd.whispir.scenario-v1+json"; // String | Application specific mime-type.
    Scenario scenario = new Scenario(); // Scenario | Scenario list object that needs to be create Scenario
    try {
      apiInstance.postScenarios(workspaceId, xApiKey, contentType, accept, scenario);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenariosApi#postScenarios");
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
| **contentType** | **String**| Application specific mime-type. | [enum: application/vnd.whispir.scenario-v1+json, application/vnd.whispir.scenario-v1+xml] |
| **accept** | **String**| Application specific mime-type. | [enum: application/vnd.whispir.scenario-v1+json, application/vnd.whispir.scenario-v1+xml] |
| **scenario** | [**Scenario**](Scenario.md)| Scenario list object that needs to be create Scenario | |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.whispir.scenario-v1+json
 - **Accept**: application/json

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

<a name="postScenariosById"></a>
# **postScenariosById**
> postScenariosById(workspaceId, xApiKey, contentType, accept, scenarioId)

Run a scenario

Running a scenario triggers the communication to the intended recipients. The message (static or dynamic) will be sent on all the provided channels.  Running a scenario is very simple to do. The specific scenario has to called via a /POST request.  Step wise example: 1. Get all the scenarios 2. Pick the required scenario’s link attribute 3. Make a /POST call  Now invoking this scenario is just making a /POST call. 

### Example
```java
// Import classes:
import whispir_sdk_java.ApiClient;
import whispir_sdk_java.ApiException;
import whispir_sdk_java.Configuration;
import whispir_sdk_java.auth.*;
import whispir_sdk_java.models.*;
import org.whispir.api.ScenariosApi;

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

    ScenariosApi apiInstance = new ScenariosApi(defaultClient);
    String workspaceId = "9A4C5521FFC7B15B"; // String | The identifier for the workspace.
    String xApiKey = "xApiKey_example"; // String | The API key for authentication.
    String contentType = "application/vnd.whispir.scenario-v1+json"; // String | Application specific mime-type.
    String accept = "application/vnd.whispir.scenario-v1+json"; // String | Application specific mime-type.
    String scenarioId = "41048D9483C8CF2A"; // String | Enter Scenarios id.
    try {
      apiInstance.postScenariosById(workspaceId, xApiKey, contentType, accept, scenarioId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenariosApi#postScenariosById");
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
| **contentType** | **String**| Application specific mime-type. | [enum: application/vnd.whispir.scenario-v1+json, application/vnd.whispir.scenario-v1+xml] |
| **accept** | **String**| Application specific mime-type. | [enum: application/vnd.whispir.scenario-v1+json, application/vnd.whispir.scenario-v1+xml] |
| **scenarioId** | **String**| Enter Scenarios id. | |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  * Access-Control-Allow-Origin -  <br>  * Cache-Control -  <br>  * Expires -  <br>  * Location - The URI to fetch details of the resource. <br>  * Content-Type -  <br>  * Content-Length - Length of the response content. <br>  |
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

<a name="putScenariosById"></a>
# **putScenariosById**
> putScenariosById(workspaceId, xApiKey, contentType, accept, scenarioId, scenario)

Update a scenario

Updates a Scenario object.

### Example
```java
// Import classes:
import whispir_sdk_java.ApiClient;
import whispir_sdk_java.ApiException;
import whispir_sdk_java.Configuration;
import whispir_sdk_java.auth.*;
import whispir_sdk_java.models.*;
import org.whispir.api.ScenariosApi;

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

    ScenariosApi apiInstance = new ScenariosApi(defaultClient);
    String workspaceId = "9A4C5521FFC7B15B"; // String | The identifier for the workspace.
    String xApiKey = "xApiKey_example"; // String | The API key for authentication.
    String contentType = "application/vnd.whispir.scenario-v1+json"; // String | Application specific mime-type.
    String accept = "application/vnd.whispir.scenario-v1+json"; // String | Application specific mime-type.
    String scenarioId = "41048D9483C8CF2A"; // String | Enter Scenarios id.
    Scenario scenario = new Scenario(); // Scenario | Modifying a scenario obeys the same requirements seen at the moment of their creation
    try {
      apiInstance.putScenariosById(workspaceId, xApiKey, contentType, accept, scenarioId, scenario);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenariosApi#putScenariosById");
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
| **contentType** | **String**| Application specific mime-type. | [enum: application/vnd.whispir.scenario-v1+json, application/vnd.whispir.scenario-v1+xml] |
| **accept** | **String**| Application specific mime-type. | [enum: application/vnd.whispir.scenario-v1+json, application/vnd.whispir.scenario-v1+xml] |
| **scenarioId** | **String**| Enter Scenarios id. | |
| **scenario** | [**Scenario**](Scenario.md)| Modifying a scenario obeys the same requirements seen at the moment of their creation | |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.whispir.scenario-v1+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  * Access-Control-Allow-Origin -  <br>  * Cache-Control -  <br>  * Expires -  <br>  |
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

