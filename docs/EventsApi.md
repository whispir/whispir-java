# EventsApi

All URIs are relative to *https://api.au.whispir.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**eventCreate**](EventsApi.md#eventCreate) | **POST** /workspaces/{workspaceId}/events | Create an event |
| [**eventList**](EventsApi.md#eventList) | **GET** /workspaces/{workspaceId}/events | List events |
| [**eventRetrieve**](EventsApi.md#eventRetrieve) | **GET** /workspaces/{workspaceId}/events/{eventId} | Retrieve an event |
| [**eventUpdate**](EventsApi.md#eventUpdate) | **PUT** /workspaces/{workspaceId}/events/{eventId} | Update an event |


<a name="eventCreate"></a>
# **eventCreate**
> Event eventCreate(workspaceId, xApiKey, contentType, accept, event)

Create an event

The bulk of the &#x60;Event&#x60; metadata is from fields that are generic, and only applicable to the customer that is using the module.  The owner or responsible person for the event could be a &#x60;/contacts&#x60; in the system. This ensures that proper communication is sent to the individual based on their preferred channel (&#x60;message&#x60;, &#x60;email&#x60;, &#x60;voice&#x60;) automatically without having to key in the phone, email, and other communication information again.  Most importantly, to create an event, one must have the create access for &#x60;Incident&#x60; row in the &#x60;Roles &amp; Permission&#x60; section of the account settings.  When an &#x60;Event&#x60; occurs/is triggered, the related actions are to be performed. Each action has an owner (&#x60;actionOwner&#x60;), a set time (&#x60;actionDate&#x60;), and details associated with it (&#x60;actionDetails&#x60;).   &#x60;Events&#x60; have sub sections under them called as ‘actions’ (maximum of 10). So the action values are numbered: &lt;li&gt; actionDate1, actionOwner1, actionDetails1 &lt;/li&gt; &lt;li&gt; actionDate2, actionOwner2, actionDetails2 &lt;/li&gt; &lt;li&gt; … &lt;/li&gt; &lt;li&gt; actionDate10, actionOwner10, actionDetails10 &lt;/li&gt;  &lt;!-- theme: warning --&gt; &gt; #### Things to note &gt; The fields described below are defined through &#x60;name/value&#x60; pairs and to be added as part of &#x60;eventFieldList&#x60; array  &#x60;&#x60;&#x60;generic_attributes json_schema {   \&quot;title\&quot;: \&quot;Event Fields\&quot;,   \&quot;type\&quot;: \&quot;object\&quot;,   \&quot;properties\&quot;: {     \&quot;actionDate\&quot;: {       \&quot;type\&quot;: \&quot;string\&quot;       \&quot;description: \&quot;The start date of this action in dd/mm/yyyy HH:MI:SS 24 hour format\&quot;,       \&quot;example\&quot;: \&quot;11/09/2019 17:41:00\&quot;     },     \&quot;actionOwner\&quot;: {       \&quot;type\&quot;: \&quot;string\&quot;,       \&quot;description\&quot;: \&quot;The individual (contact) responsible for this action’s execution\&quot;,       \&quot;example\&quot;: \&quot;John Wick\&quot;,     },     \&quot;actionDetails\&quot;: {       \&quot;type\&quot;: \&quot;string\&quot;,       \&quot;description\&quot;: \&quot;The detail description of this action\&quot;,       \&quot;example\&quot;:\&quot;investigation to take place asap.\&quot;     },     \&quot;summary\&quot;: {       \&quot;type\&quot;: \&quot;string\&quot;,       \&quot;description\&quot;: \&quot;Specifies the summary of the event. A single line that can be the equivalent of the subject of an email\&quot;,       \&quot;example\&quot;:\&quot;investigation to take place asap\&quot;     },     \&quot;status\&quot;: {       \&quot;type\&quot;: \&quot;string\&quot;,       \&quot;description\&quot;: \&quot;Specifies the status of the event. The status can be one of the following\&quot;,       \&quot;enum\&quot;: [\&quot;Active\&quot;, \&quot;Resolved\&quot;, \&quot;Open\&quot;],       \&quot;default\&quot;:\&quot;Open\&quot;,       \&quot;example\&quot;:\&quot;Open\&quot;     },        \&quot;description\&quot;: {       \&quot;type\&quot;: \&quot;string\&quot;,       \&quot;description\&quot;: \&quot;Specifies the detailed description of the event\&quot;,       \&quot;example\&quot;:\&quot;investigation to take place asap\&quot;     },    \&quot;location\&quot;: {       \&quot;type\&quot;: \&quot;string\&quot;,       \&quot;description\&quot;: \&quot;Specifies the latitude and longitude values of the event location. This helps to show the event location on Whispir’s geo-map feature set and coordinated communication based on the geo-location of the event\&quot;,       \&quot;example\&quot;:\&quot;0.0,0.0\&quot;     },    \&quot;startDate\&quot;: {       \&quot;type\&quot;: \&quot;string\&quot;,       \&quot;description\&quot;: \&quot;Specifies the start date of the event. The date and time should be in the format &#x60;DD/MM/YYYY HH:MI:SS&#x60; (24 hour format)\&quot;,       \&quot;example\&quot;:\&quot;23/09/2019 17:21:00\&quot;     },    \&quot;endDate\&quot;: {       \&quot;type\&quot;: \&quot;string\&quot;,       \&quot;description\&quot;: \&quot;Specifies the end date of the event. The date and time should be in the format &#x60;DD/MM/YYYY HH:MI:SS&#x60; (24 hour format)\&quot;,       \&quot;example\&quot;:\&quot;23/09/2019 17:21:00\&quot;     },     \&quot;severity\&quot; :{       \&quot;type\&quot;: \&quot;string\&quot;,       \&quot;description\&quot;: \&quot;Specifies the severity of the event. While this can change from company to company, the standard value set to be chosen from is            &lt;li&gt;&lt;b&gt;Severity 5&lt;/b&gt; – Routine Maintenance Tasks&lt;/li&gt;          &lt;li&gt;&lt;b&gt;Severity 4&lt;/b&gt; – Scheduled System Changes&lt;/li&gt;          &lt;li&gt;&lt;b&gt;Severity SL3&lt;/b&gt; – Minor Outage (some service degradation)&lt;/li&gt;          &lt;li&gt;&lt;b&gt;Severity SL2&lt;/b&gt; – Moderate Outage (service degradation)&lt;/li&gt;          &lt;li&gt;&lt;b&gt;Severity SL1&lt;/b&gt; – Major Outage (significant service unavailability)&lt;/li&gt;       \&quot;,       \&quot;example\&quot;: \&quot;Severity 5\&quot;     },     \&quot;priority\&quot; :{       \&quot;type\&quot;: \&quot;string\&quot;,       \&quot;description\&quot;: \&quot;Specifies the priority of the event. While this can change from company to company, the standard value set to choose from is         &lt;li&gt;&lt;b&gt;Priority 5&lt;/b&gt; – No Set Resolution Period&lt;/li&gt;         &lt;li&gt;&lt;b&gt;Priority 4&lt;/b&gt; – &lt; 1 week Resolution&lt;/li&gt;         &lt;li&gt;&lt;b&gt;Priority 3&lt;/b&gt; – &lt; 3 day Resolution&lt;/li&gt;         &lt;li&gt;&lt;b&gt;Priority 2&lt;/b&gt; – &lt; 1 day Resolution&lt;/li&gt;         &lt;li&gt;&lt;b&gt;Priority 1&lt;/b&gt; – &lt; 2 hour Resolution&lt;/li&gt;       \&quot;,       \&quot;enum\&quot;: [\&quot;Priority 5\&quot;, \&quot;Priority 4\&quot;, \&quot;Priority 3\&quot;, \&quot;Priority 2\&quot;, \&quot;Priority 1\&quot;],       \&quot;example\&quot;: \&quot;Severity 5\&quot;     },    \&quot;duration\&quot;: {       \&quot;type\&quot;: \&quot;string\&quot;,       \&quot;description\&quot;: \&quot;The duration of the event in &#x60;HH:MI:SS&#x60;. For example, &#x60;02:05:00&#x60;. This can be substituted in the place of end date if required. Or a subset of the time between the start and end dates.\&quot;,       \&quot;example\&quot;:\&quot;02:05:00\&quot;     }        },   required: [\&quot;actionDate\&quot;, \&quot;actionOwner\&quot;, \&quot;actionDetails\&quot;, \&quot;startDate\&quot;] } &#x60;&#x60;&#x60; &#x60;&#x60;&#x60; categorisation json_schema {   \&quot;title\&quot;: \&quot;Event Fields\&quot;,   \&quot;type\&quot;: \&quot;object\&quot;,   \&quot;description: \&quot;\&quot;,   \&quot;properties\&quot;: {     \&quot;category\&quot; :{       \&quot;type\&quot;: \&quot;string\&quot;,       \&quot;description\&quot;: \&quot;Specifies the category of event. The default values to choose from are (&#x60;Internal Systems&#x60;, &#x60;External Systems&#x60;, &#x60;Infrastructure&#x60;)\&quot;,       \&quot;example\&quot;: \&quot;Internal Systems\&quot;     },     \&quot;subcategory\&quot; :{       \&quot;type\&quot;: \&quot;string\&quot;,       \&quot;description\&quot;: \&quot;Specifies the subcategory in the category. The default values to choose from are (&#x60;Customer Impact&#x60;, &#x60;Cust &amp; Staff Impact&#x60;,&#x60;Staff Impact&#x60;, &#x60;Impact Unknown&#x60;)\&quot;,       \&quot;example\&quot;: \&quot;Customer Impact\&quot;     },     \&quot;type\&quot; :{       \&quot;type\&quot;: \&quot;string\&quot;,       \&quot;description\&quot;: \&quot;Specifies the type of event. The default values to choose from are (&#x60;Multiple Issues&#x60;, &#x60;NIL&#x60;,&#x60;Network&#x60;, &#x60;Applications&#x60;, &#x60;Mobile Apps&#x60;)\&quot;,       \&quot;example\&quot;: \&quot;Customer Impact\&quot;     },     \&quot;externalVendor\&quot; :{       \&quot;type\&quot;: \&quot;string\&quot;,       \&quot;description\&quot;: \&quot;Specifies the name/contact who is the external vendor related to this event\&quot;,       \&quot;example\&quot;: \&quot;ABC\&quot;     },      \&quot;lineNumber\&quot; :{       \&quot;type\&quot;: \&quot;string\&quot;,       \&quot;description\&quot;: \&quot;Specifies the line number (production lines)\&quot;,       \&quot;example\&quot;: \&quot;ABC\&quot;     },     \&quot;externalCaseNumber\&quot; :{       \&quot;type\&quot;: \&quot;string\&quot;,       \&quot;description\&quot;: \&quot;Specifies the number as tracked by an external party related to this event\&quot;,       \&quot;example\&quot;: \&quot;ABC\&quot;     },   } } &#x60;&#x60;&#x60; &#x60;&#x60;&#x60; affected_services json_schema {   \&quot;title\&quot;: \&quot;Event Fields\&quot;,   \&quot;type\&quot;: \&quot;object\&quot;,   \&quot;description: \&quot;\&quot;,   \&quot;properties\&quot;: {     \&quot;platform\&quot; :{       \&quot;type\&quot;: \&quot;string\&quot;,       \&quot;description\&quot;: \&quot;Specifies the platform in the company that this event is associated with\&quot;,       \&quot;example\&quot;: \&quot;ABC\&quot;     },     \&quot;services\&quot; :{       \&quot;type\&quot;: \&quot;string\&quot;,       \&quot;description\&quot;: \&quot;Specifies the service in the company that this event is associated with\&quot;,       \&quot;example\&quot;: \&quot;ABC\&quot;     },   } } &#x60;&#x60;&#x60; &#x60;&#x60;&#x60; impact json_schema {   \&quot;title\&quot;: \&quot;Event Fields\&quot;,   \&quot;type\&quot;: \&quot;object\&quot;,   \&quot;description: \&quot;\&quot;,   \&quot;properties\&quot;: {     \&quot;impactCondition\&quot; :{       \&quot;type\&quot;: \&quot;string\&quot;,       \&quot;description\&quot;: \&quot;Specifies the impact condition of this event to the company. These values can be configured via custom lists as these can be very specific to the company. The default values to choose from are (&#x60;All services not available&#x60;, &#x60;All services degraded&#x60;, &#x60;Some services not available&#x60;, &#x60;Some services degraded&#x60;, &#x60;No Impact&#x60;, &#x60;Unknown&#x60;)\&quot;,       \&quot;example\&quot;: \&quot;Unknown\&quot;     },     \&quot;impactToOrg\&quot; :{       \&quot;type\&quot;: \&quot;string\&quot;,       \&quot;description\&quot;: \&quot;Specifies the impact condition of this event to the company. These values can be configured via custom lists as these can be very specific to the company. The default values to choose from are (&#x60;All services not available&#x60;, &#x60;All services degraded&#x60;, &#x60;Some services not available&#x60;, &#x60;Some services degraded&#x60;, &#x60;No Impact&#x60;, &#x60;Unknown&#x60;)\&quot;,       \&quot;example\&quot;: \&quot;Unknown\&quot;     },     \&quot;locations\&quot; :{       \&quot;type\&quot;: \&quot;string\&quot;,       \&quot;description\&quot;: \&quot;Specifies the impact location of this event to a company’s operational geographies. These values can be configured via custom lists as these can be very specific to the company\&quot;,       \&quot;example\&quot;: \&quot;0.0,0.0\&quot;     },   } } &#x60;&#x60;&#x60; &#x60;&#x60;&#x60; example {     ...,     eventFieldList: [{         \&quot;name\&quot;: \&quot;actionDate1\&quot;,         \&quot;value\&quot;: \&quot;11/09/2019 17:41:00\&quot;       },       {         \&quot;name\&quot;: \&quot;actionOwner1\&quot;,         \&quot;value\&quot;: \&quot;John Wick\&quot;       },       {           \&quot;name\&quot;: \&quot;actionDetails1\&quot;,         \&quot;value\&quot;: \&quot;investigation to take place asap.\&quot;       },       {         \&quot;name\&quot;: \&quot;summary\&quot;,         \&quot;value\&quot;: \&quot;Outage of systems in Sydney\&quot;       },       {         \&quot;name\&quot;: \&quot;status\&quot;,         \&quot;value\&quot;: \&quot;Open\&quot;       },       {         \&quot;name\&quot;: \&quot;description\&quot;,         \&quot;value\&quot;: \&quot;ATMs are non responsive, teams to be sent to investigate.\&quot;       },       {         \&quot;name\&quot;: \&quot;category\&quot;,         \&quot;value\&quot;: \&quot;Internal\&quot;       },       {        \&quot;name\&quot;: \&quot;startDate\&quot;,        \&quot;value\&quot;: \&quot;11/09/2019 17:41:00\&quot;       },       {        \&quot;name\&quot;: \&quot;severity\&quot;,        \&quot;value\&quot;: \&quot;Severity 3 - Minor Outage (Some Service Degradation)\&quot;       },       ... and so on,   }] }                   &#x60;&#x60;&#x60; &lt;!-- theme: info --&gt;  &gt; #### A thing to know &gt; On top of the list of event attributes listed above, you may introduce other (alias) name and title fields &lt;li&gt; e.g (&#x60;otherFirstName&#x60;, &#x60;otherLastName&#x60;, &#x60;otherTitle&#x60;) &lt;/li&gt;  &lt;h2&gt;Sending messages using event data&lt;/h2&gt;  Once you’ve finished creating your event data in the Whispir platform, the next logical step is to deliver a notification about the event. This action can be performed using the existing &#x60;/messages&#x60; endpoint, with the &#x60;eventId&#x60; as an attribute of the message.  * Including this &#x60;eventId&#x60; links the message to the event, and allow you to use any attribute of the event within your message payload. * Any event fields populated on the event are automatically populated within the message. * Any attributes that are supplied within the message take priority over any attributes that are from the event. * The user should not be required to enter any &#x60;attributes&#x60; as these will be retrieved from the linked event. * The event fields automatically populate the attributes in the message body (based on the relationships set in the &lt;b&gt; Admin &gt; Settings &gt; Attributes &gt; Message Event Attribute Map&lt;/b&gt;).  &lt;!-- theme: warning --&gt; &gt; #### Things to note &gt; * If the &#x60;Event&#x60; doesn&#39;t contain an event field, and there is no relevant attribute field supplied &gt; in the message payload, the &#x60;@@&#x60; tag will not be resolved. &gt; * If you don&#39;t supply an attribute in the message payload, and this has also not been supplied from the event, the field simply will not be resolved within the message.

### Example
```java
// Import classes:
import com.whispir.client.ApiClient;
import com.whispir.client.ApiException;
import com.whispir.client.Configuration;
import com.whispir.client.auth.*;
import com.whispir.client.models.*;
import com.whispir.api.EventsApi;

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

    EventsApi apiInstance = new EventsApi(defaultClient);
    String workspaceId = "9A4C5521FFC7B15B"; // String | The identifier for the workspace.
    String xApiKey = "xApiKey_example"; // String | The API key for authentication.
    String contentType = "application/vnd.whispir.event-v1+json"; // String | Application specific mime-type.
    String accept = "application/vnd.whispir.event-v1+json"; // String | Application specific mime-type.
    Event event = new Event(); // Event | The Event object to create
    try {
      Event result = apiInstance.eventCreate(workspaceId, xApiKey, contentType, accept, event);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#eventCreate");
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
| **contentType** | **String**| Application specific mime-type. | [default to application/vnd.whispir.event-v1+json] [enum: application/vnd.whispir.event-v1+json, application/vnd.whispir.event-v1+xml] |
| **accept** | **String**| Application specific mime-type. | [default to application/vnd.whispir.event-v1+json] [enum: application/vnd.whispir.event-v1+json, application/vnd.whispir.event-v1+xml] |
| **event** | [**Event**](Event.md)| The Event object to create | [optional] |

### Return type

[**Event**](Event.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.whispir.event-v1+json
 - **Accept**: application/vnd.whispir.event-v1+json, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Example Event response |  * Access-Control-Allow-Origin -  <br>  * Expires -  <br>  * Cache-Control -  <br>  * Content-Length -  <br>  * Content-Type -  <br>  * Location -  <br>  |
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

<a name="eventList"></a>
# **eventList**
> EventCollection eventList(workspaceId, xApiKey, accept, eventType, limit, offset, sortOrder, sortFields)

List events

List event objects

### Example
```java
// Import classes:
import com.whispir.client.ApiClient;
import com.whispir.client.ApiException;
import com.whispir.client.Configuration;
import com.whispir.client.auth.*;
import com.whispir.client.models.*;
import com.whispir.api.EventsApi;

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

    EventsApi apiInstance = new EventsApi(defaultClient);
    String workspaceId = "9A4C5521FFC7B15B"; // String | The identifier for the workspace.
    String xApiKey = "xApiKey_example"; // String | The API key for authentication.
    String accept = "application/vnd.whispir.event-v1+json"; // String | Application specific mime-type.
    String eventType = "eventType_example"; // String | The name of the event template used 
    BigDecimal limit = new BigDecimal("20"); // BigDecimal | The number of records to be returned.
    BigDecimal offset = new BigDecimal("0"); // BigDecimal | The record number to start returning from.
    String sortOrder = "asc"; // String | The order in which you require the results to be returned. Either ‘asc’ or ‘desc’
    String sortFields = "lastName,jobTitle"; // String | The fields that you require the ordering to be performed on. Multiple fields can be provided, separated by a comma.
    try {
      EventCollection result = apiInstance.eventList(workspaceId, xApiKey, accept, eventType, limit, offset, sortOrder, sortFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#eventList");
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
| **accept** | **String**| Application specific mime-type. | [default to application/vnd.whispir.event-v1+json] [enum: application/vnd.whispir.event-v1+json, application/vnd.whispir.event-v1+xml] |
| **eventType** | **String**| The name of the event template used  | |
| **limit** | **BigDecimal**| The number of records to be returned. | [optional] [default to 20] |
| **offset** | **BigDecimal**| The record number to start returning from. | [optional] [default to 0] |
| **sortOrder** | **String**| The order in which you require the results to be returned. Either ‘asc’ or ‘desc’ | [optional] [enum: asc, desc] |
| **sortFields** | **String**| The fields that you require the ordering to be performed on. Multiple fields can be provided, separated by a comma. | [optional] |

### Return type

[**EventCollection**](EventCollection.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.whispir.event-v1+json, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of events response example |  * Access-Control-Allow-Origin -  <br>  * Expires -  <br>  * Content-Type -  <br>  * Content-Length -  <br>  * Cache-Control -  <br>  |
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

<a name="eventRetrieve"></a>
# **eventRetrieve**
> Event eventRetrieve(workspaceId, eventId, xApiKey, accept, limit, offset, sortOrder, sortFields)

Retrieve an event

Retrieve an event object

### Example
```java
// Import classes:
import com.whispir.client.ApiClient;
import com.whispir.client.ApiException;
import com.whispir.client.Configuration;
import com.whispir.client.auth.*;
import com.whispir.client.models.*;
import com.whispir.api.EventsApi;

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

    EventsApi apiInstance = new EventsApi(defaultClient);
    String workspaceId = "9A4C5521FFC7B15B"; // String | The identifier for the workspace.
    String eventId = "eventId_example"; // String | The identifier for the event.
    String xApiKey = "xApiKey_example"; // String | The API key for authentication.
    String accept = "application/vnd.whispir.event-v1+json"; // String | Application specific mime-type.
    BigDecimal limit = new BigDecimal("20"); // BigDecimal | The number of records to be returned.
    BigDecimal offset = new BigDecimal("0"); // BigDecimal | The record number to start returning from.
    String sortOrder = "asc"; // String | The order in which you require the results to be returned. Either ‘asc’ or ‘desc’
    String sortFields = "lastName,jobTitle"; // String | The fields that you require the ordering to be performed on. Multiple fields can be provided, separated by a comma.
    try {
      Event result = apiInstance.eventRetrieve(workspaceId, eventId, xApiKey, accept, limit, offset, sortOrder, sortFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#eventRetrieve");
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
| **eventId** | **String**| The identifier for the event. | |
| **xApiKey** | **String**| The API key for authentication. | |
| **accept** | **String**| Application specific mime-type. | [default to application/vnd.whispir.event-v1+json] [enum: application/vnd.whispir.event-v1+json, application/vnd.whispir.event-v1+xml] |
| **limit** | **BigDecimal**| The number of records to be returned. | [optional] [default to 20] |
| **offset** | **BigDecimal**| The record number to start returning from. | [optional] [default to 0] |
| **sortOrder** | **String**| The order in which you require the results to be returned. Either ‘asc’ or ‘desc’ | [optional] [enum: asc, desc] |
| **sortFields** | **String**| The fields that you require the ordering to be performed on. Multiple fields can be provided, separated by a comma. | [optional] |

### Return type

[**Event**](Event.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.whispir.event-v1+json, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Example Event response |  * Access-Control-Allow-Origin -  <br>  * Expires -  <br>  * Cache-Control -  <br>  * Content-Length -  <br>  * Content-Type -  <br>  * Location -  <br>  |
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

<a name="eventUpdate"></a>
# **eventUpdate**
> eventUpdate(workspaceId, eventId, xApiKey, contentType, accept, event)

Update an event

Update an event object

### Example
```java
// Import classes:
import com.whispir.client.ApiClient;
import com.whispir.client.ApiException;
import com.whispir.client.Configuration;
import com.whispir.client.auth.*;
import com.whispir.client.models.*;
import com.whispir.api.EventsApi;

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

    EventsApi apiInstance = new EventsApi(defaultClient);
    String workspaceId = "9A4C5521FFC7B15B"; // String | The identifier for the workspace.
    String eventId = "eventId_example"; // String | The identifier for the event.
    String xApiKey = "xApiKey_example"; // String | The API key for authentication.
    String contentType = "application/vnd.whispir.event-v1+json"; // String | Application specific mime-type.
    String accept = "application/vnd.whispir.event-v1+json"; // String | Application specific mime-type.
    Event event = new Event(); // Event | The Event object to update
    try {
      apiInstance.eventUpdate(workspaceId, eventId, xApiKey, contentType, accept, event);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#eventUpdate");
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
| **eventId** | **String**| The identifier for the event. | |
| **xApiKey** | **String**| The API key for authentication. | |
| **contentType** | **String**| Application specific mime-type. | [default to application/vnd.whispir.event-v1+json] [enum: application/vnd.whispir.event-v1+json, application/vnd.whispir.event-v1+xml] |
| **accept** | **String**| Application specific mime-type. | [default to application/vnd.whispir.event-v1+json] [enum: application/vnd.whispir.event-v1+json, application/vnd.whispir.event-v1+xml] |
| **event** | [**Event**](Event.md)| The Event object to update | [optional] |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.whispir.event-v1+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  * Content-Type -  <br>  * Content-Length -  <br>  * Access-Control-Allow-Origin -  <br>  * Expires -  <br>  * Cache-Control -  <br>  |
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

