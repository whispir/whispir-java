# ImportsApi

All URIs are relative to *https://api.au.whispir.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**postImports**](ImportsApi.md#postImports) | **POST** /workspaces/{workspaceId}/imports | Create an import |


<a name="postImports"></a>
# **postImports**
> postImports(workspaceId, xApiKey, contentType, accept, modelImport)

Create an import

## Bulk contact import The Whispir API will expose this functionality as a two stage process: 1. Submit contact data within a CSV, JSON, XML payload using the /resource endpoint – which will return a resource ID 2. Create a new import resource by submitting a POST to the /imports endpoint referencing the resource ID created in step 1.  These two stages are further explained below.  Create a resource specifying the contact information  Applications can upload a valid CSV, XML or JSON resource containing the contact information that will be imported into the Whispir Platform. Whispir will return the resource ID which can be used to import or update contacts within a workspace through the imports endpoint as described below.  ### Request Structure Firstly, the application needs to upload a resource using the Creating Resources.  The resource that needs to be provided for contact importing should be in one the following format: *   XML *   JSON *   CSV  Once this resource has been imported with the appropriate mime type, the application can reference this resource within the import request.  Import a resource using the imports endpoint    After receiving a valid resource ID, applications can make a request to the imports endpoint within a workspace and reference the appropriate resource ID. Whispir will then create an import process that will import the specified data into the workspace.    Once the application has an appropriate resource ID to use within the import endpoint, the following request can be used to begin the import process.    **Note:** Import processes take place asynchronously. Any contacts will be created once the import process starts, and users will be able to utilise imported contacts as soon as each is completed. 

### Example
```java
// Import classes:
import whispir_sdk_java.ApiClient;
import whispir_sdk_java.ApiException;
import whispir_sdk_java.Configuration;
import whispir_sdk_java.auth.*;
import whispir_sdk_java.models.*;
import org.whispir.api.ImportsApi;

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

    ImportsApi apiInstance = new ImportsApi(defaultClient);
    String workspaceId = "9A4C5521FFC7B15B"; // String | The identifier for the workspace.
    String xApiKey = "xApiKey_example"; // String | The API key for authentication.
    String contentType = "application/vnd.whispir.importcontact-v1+json"; // String | Application specific mime-type.
    String accept = "application/vnd.whispir.importcontact-v1+json"; // String | Application specific mime-type.
    ModelImport modelImport = new ModelImport(); // ModelImport | import object that needs to be create import
    try {
      apiInstance.postImports(workspaceId, xApiKey, contentType, accept, modelImport);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImportsApi#postImports");
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
| **contentType** | **String**| Application specific mime-type. | [default to application/vnd.whispir.importcontact-v1+json] [enum: application/vnd.whispir.importcontact-v1+json, application/vnd.whispir.importcontact-v1+xml] |
| **accept** | **String**| Application specific mime-type. | [default to application/vnd.whispir.importcontact-v1+json] [enum: application/vnd.whispir.importcontact-v1+json, application/vnd.whispir.importcontact-v1+xml] |
| **modelImport** | [**ModelImport**](ModelImport.md)| import object that needs to be create import | [optional] |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.whispir.importcontact-v1+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  * Content-Type -  <br>  * Content-Length -  <br>  * Access-Control-Allow-Origin -  <br>  * Cache-Control -  <br>  * Expires -  <br>  * Location - The URI to fetch details of the resource. <br>  |
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

