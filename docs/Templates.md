# Templates

All URIs are relative to *https://api.au.whispir.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**templateCreate**](Templates.md#templateCreate) | **POST** /workspaces/{workspaceId}/templates | Create a template |
| [**templateDelete**](Templates.md#templateDelete) | **DELETE** /workspaces/{workspaceId}/templates/{templateId} | Delete a template |
| [**templateList**](Templates.md#templateList) | **GET** /workspaces/{workspaceId}/templates | List templates |
| [**templateRetrieve**](Templates.md#templateRetrieve) | **GET** /workspaces/{workspaceId}/templates/{templateId} | Retrieve a template |
| [**templateUpdate**](Templates.md#templateUpdate) | **PUT** /workspaces/{workspaceId}/templates/{templateId} | Update a template |


<a name="templateCreate"></a>
# **templateCreate**
> Template templateCreate(workspaceId, xApiKey, contentType, accept, template)

Create a template

Create a message template, combining multi-channel content for use with the Message resource. The message template can be reused across multiple sent messages.

### Example
```java
// Import classes:
import com.whispir.client.ApiClient;
import com.whispir.client.ApiException;
import com.whispir.client.Configuration;
import com.whispir.client.auth.*;
import com.whispir.client.models.*;
import com.whispir.api.Templates;

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

    Templates apiInstance = new Templates(defaultClient);
    String workspaceId = "9A4C5521FFC7B15B"; // String | The identifier for the workspace.
    String xApiKey = "xApiKey_example"; // String | The API key for authentication.
    String contentType = "application/vnd.whispir.template-v1+json"; // String | Application specific mime-type.
    String accept = "application/vnd.whispir.template-v1+json"; // String | Application specific mime-type.
    Template template = new Template(); // Template | Templates object that needs to be create Templates
    try {
      Template result = apiInstance.templateCreate(workspaceId, xApiKey, contentType, accept, template);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Templates#templateCreate");
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
| **contentType** | **String**| Application specific mime-type. | [default to application/vnd.whispir.template-v1+json] [enum: application/vnd.whispir.template-v1+json, application/vnd.whispir.template-v1+xml] |
| **accept** | **String**| Application specific mime-type. | [default to application/vnd.whispir.template-v1+json] [enum: application/vnd.whispir.template-v1+json, application/vnd.whispir.template-v1+xml] |
| **template** | [**Template**](Template.md)| Templates object that needs to be create Templates | |

### Return type

[**Template**](Template.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.whispir.template-v1+json
 - **Accept**: application/vnd.whispir.template-v1+json, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Template endpoint response. |  * Content-Type -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * Cache-Control -  <br>  * Expires -  <br>  * Location - The URI to fetch details of the resource. <br>  |
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

<a name="templateDelete"></a>
# **templateDelete**
> templateDelete(workspaceId, xApiKey, contentType, accept, templateId)

Delete a template

**Note:** When a template is DELETED, all the associated Scenarios, events, and references of template use in other endpoints will fail. So, ensure that the template is not used anywhere before it is deleted. Whispir **will not** do that check before it deletes the template. 

### Example
```java
// Import classes:
import com.whispir.client.ApiClient;
import com.whispir.client.ApiException;
import com.whispir.client.Configuration;
import com.whispir.client.auth.*;
import com.whispir.client.models.*;
import com.whispir.api.Templates;

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

    Templates apiInstance = new Templates(defaultClient);
    String workspaceId = "9A4C5521FFC7B15B"; // String | The identifier for the workspace.
    String xApiKey = "xApiKey_example"; // String | The API key for authentication.
    String contentType = "application/vnd.whispir.template-v1+json"; // String | Application specific mime-type.
    String accept = "application/vnd.whispir.template-v1+json"; // String | Application specific mime-type.
    String templateId = "321D8505157C5F27"; // String | The identifier for the template.
    try {
      apiInstance.templateDelete(workspaceId, xApiKey, contentType, accept, templateId);
    } catch (ApiException e) {
      System.err.println("Exception when calling Templates#templateDelete");
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
| **contentType** | **String**| Application specific mime-type. | [default to application/vnd.whispir.template-v1+json] [enum: application/vnd.whispir.template-v1+json, application/vnd.whispir.template-v1+xml] |
| **accept** | **String**| Application specific mime-type. | [default to application/vnd.whispir.template-v1+json] [enum: application/vnd.whispir.template-v1+json, application/vnd.whispir.template-v1+xml] |
| **templateId** | **String**| The identifier for the template. | |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

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

<a name="templateList"></a>
# **templateList**
> TemplateCollection templateList(workspaceId, xApiKey, accept, limit, offset, sortOrder, sortFields)

List templates

List all message templates for the workspace.  Pagination is available. 

### Example
```java
// Import classes:
import com.whispir.client.ApiClient;
import com.whispir.client.ApiException;
import com.whispir.client.Configuration;
import com.whispir.client.auth.*;
import com.whispir.client.models.*;
import com.whispir.api.Templates;

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

    Templates apiInstance = new Templates(defaultClient);
    String workspaceId = "9A4C5521FFC7B15B"; // String | The identifier for the workspace.
    String xApiKey = "xApiKey_example"; // String | The API key for authentication.
    String accept = "application/vnd.whispir.template-v1+json"; // String | Application specific mime-type.
    BigDecimal limit = new BigDecimal("20"); // BigDecimal | The number of records to be returned.
    BigDecimal offset = new BigDecimal("0"); // BigDecimal | The record number to start returning from.
    String sortOrder = "asc"; // String | The order in which you require the results to be returned. Either ‘asc’ or ‘desc’
    String sortFields = "lastName,jobTitle"; // String | The fields that you require the ordering to be performed on. Multiple fields can be provided, separated by a comma.
    try {
      TemplateCollection result = apiInstance.templateList(workspaceId, xApiKey, accept, limit, offset, sortOrder, sortFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Templates#templateList");
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
| **accept** | **String**| Application specific mime-type. | [default to application/vnd.whispir.template-v1+json] [enum: application/vnd.whispir.template-v1+json, application/vnd.whispir.template-v1+xml] |
| **limit** | **BigDecimal**| The number of records to be returned. | [optional] [default to 20] |
| **offset** | **BigDecimal**| The record number to start returning from. | [optional] [default to 0] |
| **sortOrder** | **String**| The order in which you require the results to be returned. Either ‘asc’ or ‘desc’ | [optional] [enum: asc, desc] |
| **sortFields** | **String**| The fields that you require the ordering to be performed on. Multiple fields can be provided, separated by a comma. | [optional] |

### Return type

[**TemplateCollection**](TemplateCollection.md)

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

<a name="templateRetrieve"></a>
# **templateRetrieve**
> Template templateRetrieve(workspaceId, xApiKey, accept, templateId)

Retrieve a template

Retrieves a message template

### Example
```java
// Import classes:
import com.whispir.client.ApiClient;
import com.whispir.client.ApiException;
import com.whispir.client.Configuration;
import com.whispir.client.auth.*;
import com.whispir.client.models.*;
import com.whispir.api.Templates;

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

    Templates apiInstance = new Templates(defaultClient);
    String workspaceId = "9A4C5521FFC7B15B"; // String | The identifier for the workspace.
    String xApiKey = "xApiKey_example"; // String | The API key for authentication.
    String accept = "application/vnd.whispir.template-v1+json"; // String | Application specific mime-type.
    String templateId = "321D8505157C5F27"; // String | The identifier for the template.
    try {
      Template result = apiInstance.templateRetrieve(workspaceId, xApiKey, accept, templateId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Templates#templateRetrieve");
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
| **accept** | **String**| Application specific mime-type. | [default to application/vnd.whispir.template-v1+json] [enum: application/vnd.whispir.template-v1+json, application/vnd.whispir.template-v1+xml] |
| **templateId** | **String**| The identifier for the template. | |

### Return type

[**Template**](Template.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.whispir.template-v1+json, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Template endpoint response. |  * Content-Type -  <br>  * Access-Control-Allow-Origin -  <br>  * Content-Length -  <br>  * Cache-Control -  <br>  * Expires -  <br>  * Location - The URI to fetch details of the resource. <br>  |
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

<a name="templateUpdate"></a>
# **templateUpdate**
> templateUpdate(workspaceId, xApiKey, contentType, accept, templateId, template)

Update a template

**Note:** Currently users cannot update templates with the same name as a template that already exists in Whispir. Users can overcome this by saving the updated template with a new name, then either changing this back in a subsequent save, or retaining the updated name. 

### Example
```java
// Import classes:
import com.whispir.client.ApiClient;
import com.whispir.client.ApiException;
import com.whispir.client.Configuration;
import com.whispir.client.auth.*;
import com.whispir.client.models.*;
import com.whispir.api.Templates;

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

    Templates apiInstance = new Templates(defaultClient);
    String workspaceId = "9A4C5521FFC7B15B"; // String | The identifier for the workspace.
    String xApiKey = "xApiKey_example"; // String | The API key for authentication.
    String contentType = "application/vnd.whispir.template-v1+json"; // String | Application specific mime-type.
    String accept = "application/vnd.whispir.template-v1+json"; // String | Application specific mime-type.
    String templateId = "321D8505157C5F27"; // String | The identifier for the template.
    Template template = new Template(); // Template | Templates object that needs to be update Templates
    try {
      apiInstance.templateUpdate(workspaceId, xApiKey, contentType, accept, templateId, template);
    } catch (ApiException e) {
      System.err.println("Exception when calling Templates#templateUpdate");
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
| **contentType** | **String**| Application specific mime-type. | [default to application/vnd.whispir.template-v1+json] [enum: application/vnd.whispir.template-v1+json, application/vnd.whispir.template-v1+xml] |
| **accept** | **String**| Application specific mime-type. | [default to application/vnd.whispir.template-v1+json] [enum: application/vnd.whispir.template-v1+json, application/vnd.whispir.template-v1+xml] |
| **templateId** | **String**| The identifier for the template. | |
| **template** | [**Template**](Template.md)| Templates object that needs to be update Templates | |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.whispir.template-v1+json
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

