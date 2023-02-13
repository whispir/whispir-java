# Messages

All URIs are relative to *https://api.au.whispir.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**messageCreate**](Messages.md#messageCreate) | **POST** /workspaces/{workspaceId}/messages | Send a message |
| [**messageList**](Messages.md#messageList) | **GET** /workspaces/{workspaceId}/messages | List messages |
| [**messageResponseList**](Messages.md#messageResponseList) | **GET** /workspaces/{workspaceId}/messages/{messageId}/messageresponses | List responses for a sent message |
| [**messageRetrieve**](Messages.md#messageRetrieve) | **GET** /workspaces/{workspaceId}/messages/{messageId} | Retrieve a message |
| [**messageStatusList**](Messages.md#messageStatusList) | **GET** /workspaces/{workspaceId}/messages/{messageId}/messagestatus | List message status for a sent message |


<a name="messageCreate"></a>
# **messageCreate**
> Message messageCreate(workspaceId, xApiKey, contentType, accept, message)

Send a message

Communications are the core of what the Whispir Platform API offers as a service to customers.     Whispir has the ability to send communications across 7 different channels in a single API request:   - **SMS** - up to 1600 characters per message, premium routes, delivery receipts   - **Email** - free email messaging with HTML and Plain Text support  - **Voice** - high quality outbound voice calls delivered to mobiles and landlines within seconds   - **Rich Messages** - personalised, targeted rich messaging to drive conversations   - **Twitter** - support for instant publishing to multiple twitter accounts   - **Facebook** - simplify the process of publishing to multiple facebook accounts instantaneously   - **RSS** - easily generate RSS feeds for consumption by other services  All communications are driven from the Messages endpoint resources within the API. This endpoint allows a user to perform the following tasks: 1.  Create and send a new message 2.  Retrieve a list of previously sent messages    * * *  ### Using Templates Messages can simply specify the &#x60;messageTemplateId&#x60; in the messages request, instead of specifying the entire content payload.  The message template can then easily be changed (using either another API request or by logging in to the Whispir Platform) and the part of the application sending the messages does not need to be altered.    * * *  ### Callback Parameters  The callback API allows you to pass in any values (parameters), which you want to be returned as is, included in the callback response.  * * *  ### Using Events  Once you have created an [Event](./openapi.yaml/paths/~1workspaces~1{workspaceId}~1events/post) in the Whispir Platform, the next logical step is to be able to deliver a notification about the event.  &#x60;&#x60;&#x60;json {   \&quot;to\&quot;: \&quot;+1000000000\&quot;,   \&quot;subject\&quot;: \&quot;Event Notification\&quot;,   \&quot;eventId\&quot;: \&quot;2EE7FEA3343662BE\&quot;,   \&quot;body\&quot;: \&quot;An event has occurred: @@summary@@. A resolution is required by @@actionDate1@@.\&quot; } &#x60;&#x60;&#x60;  * * *  ### Message Variables  Whispir allows the use of message variables to dynamically customise the content in a message. Available variables include [Native Tags](#native-tags), [System Tags](#system-tags), and [Custom Tags](#custom-tags). Each of these variables are described in the following sections.  #### Native Tags  When sending messages using the Whispir API you can automatically customise your communications including recipients information as part of the message. This is facilitated by the Whispir&#39;s native message variables [or native tags] that will be resolved against the recipients MRIs. &gt; **IMPORTANT**: the following tags can be included in any SMS, email or voice message. They are NOT meant to be used in rich messages. In this case recipient-specific fields can be populated using the Whispir JavaScript API.  Contact Tag | Description ---------|----------  @@first_name@@ | Recipient’s first name.  &lt;br/&gt; For example, John.   @@last_name@@ | Recipient’s last name. &lt;br/&gt; For example, Smith.  @@recipient_email@@ | Recipient’s primary email address.&lt;br/&gt;For example, jsmith@email.com   @@recipient_sms@@ | Recipient’s primary mobile phone number. &lt;br/&gt;&lt;br/&gt;For example, 61400400400.   @@recipient_voice@@ | Recipient’s primary phone number for voice calls.&lt;br/&gt;&lt;br/&gt; For example, 61400400400.   @@pin@@ | Whispir message retrieval service call back PIN (only populated when voice is used). &lt;br/&gt;&lt;br/&gt; For example, 1234.   @@recipient_role@@ | Resolves to the recipient’s ‘Role’ field.&lt;br/&gt;&lt;br/&gt; For example, Manager.   @@recipient_additionalrole@@ | Resolves to the recipient’s ‘Additional Role’ field. &lt;br/&gt;&lt;br/&gt;For example, Team Leader.   @@team_name1@@ | Resolves to the recipient’s ‘Team Name’ field.&lt;br/&gt;&lt;br/&gt; For example, Red Team.   @@messagelabel@@| Resolves to the label field of the sent message. &lt;br/&gt;&lt;br/&gt;For example, Incident #1234.   @@messagecategories@@ | Resolves to the list of categories used in the message, separated with commas. &lt;br/&gt;&lt;br/&gt;For example, Product Update.    &#x60;&#x60;&#x60; JSON POST https://api.&lt;region&gt;.whispir.com/workspaces/{workspaceId}/messages   Authorization: Basic am9obi5zbWl0aDpteXBhc3N3b3Jk x-api-key: your_api_key Content-Type: application/vnd.whispir.message-v1+json Accept: application/vnd.whispir.message-v1+json   {    \&quot;to\&quot; : \&quot;John_Wick.1143139@Contact.whispir.sg\&quot;,    \&quot;subject\&quot; : \&quot;Test SMS Message with tags\&quot;,    \&quot;body\&quot; : \&quot;Hi @@first_name@@. This is your message.\&quot; } &#x60;&#x60;&#x60; &#x60;&#x60;&#x60; XML POST https://api.&lt;region&gt;.whispir.com/workspaces/{workspaceId}/messages   Authorization: Basic am9obi5zbWl0aDpteXBhc3N3b3Jk x-api-key: your_api_key Content-Type: application/vnd.whispir.message-v1+xml Accept: application/vnd.whispir.message-v1+xml   &lt;?xml version&#x3D;\&quot;1.0\&quot; encoding&#x3D;\&quot;UTF-8\&quot; standalone&#x3D;\&quot;yes\&quot;?&gt; &lt;ns2:message xmlns:ns2&#x3D;\&quot;http://schemas.api.whispir.com\&quot;&gt;     &lt;to&gt;John_Wick.1143139@Contact.whispir.sg&lt;/to&gt;     &lt;subject&gt;Test SMS Message with tags&lt;/subject&gt;     &lt;body&gt;Hi @@first_name@@. This is your message.&lt;/body&gt; &lt;/ns2:message&gt; &#x60;&#x60;&#x60;   The main difference with the examples seen so far is given here by the &#x60;to&#x60; field of the payloads, where a Contact MRI is specified. This reference allows the Whispir platform to inspect the Contact to retrieve the Contact tags.  * * *  #### System Tags  When sending messages using the Whispir API, you can automatically include system-generated information via system variables. Each of them will resolve to the value obtained when you send the message. Unlike the preceding ones, they don&#39;t depend from the Contacts information stored in Whispir, so they can be included also in messages where the recipients are not represented by their MRI.  System Tag | Description| ---------|---------- @@dd@@| Current day with leading zero. &lt;br/&gt; For example, 08. @@mm@@ | Current month with leading zero. &lt;br/&gt; For example, 06. @@yy@@| Current year, short form.&lt;br/&gt;For example, 22. @@yyyy@@| Current year, long form. &lt;br/&gt;&lt;br/&gt;For example, 2022. @@day@@ | Day in spoken form.&lt;br/&gt;&lt;br/&gt; For example, Wednesday.  @@month@@| Month in spoken form. &lt;br/&gt;&lt;br/&gt; For example, January.  @@hrs@@| Current hour with leading zero, in 24 hour format.&lt;br/&gt;&lt;br/&gt; For example, 16.  @@min@@ | Current minute with leading zero.&lt;br/&gt;&lt;br/&gt; For example, 45.  @@date@ | Current date in format (yyyy-mm-dd)&lt;br/&gt;&lt;br/&gt; For example, 2022-02-02. @@time@@| Current time in 24-hour format. &lt;br/&gt;&lt;br/&gt;For example, 16:37.    * * *  #### Custom Tags  Using message attributes and message Templates allows developers to cleanly separate these responsibilities. This is done by combining the message channels being used for the message and the data driving the message. Under the operational point of view this solution is achieved with two steps: 1. Creating a Template including attributes 2. Using the Template and replacing the values for the attributes  Whispir’s API customers can simplify their requests by using the message attributes directly from the API. Using message attributes allows to achieve flexibility in the communications. With this solution, Developers just need to take care of the data behind a message while the Marketing team can focus on the presentation or messaging channels within the message. &gt; Unlike native tags, user-defined attributes require Whispir administrative assistance to enable and are configured at the account level. Please contact your Whispir account manager or the [Whispir Support Team](mailto&#x3D;&#39;support@whispir.com&#39;) if interested in using them. Whispir’s API only accepts message attributes containing alpha-numeric ASCII characters. We are about to see a full example where an initial fixed message has been adapted to be reusable.  **Without Custom Tags**  &#x60;&#x60;&#x60;JSON POST http://api.&lt;region&gt;.whispir.com/workspaces/{workspaceId}/messages   Authorization: Basic am9obi5zbWl0aDpteXBhc3N3b3Jk x-api-key: your_api_key Content-Type: application/vnd.whispir.message-v1+json Accept: application/vnd.whispir.message-v1+json   {    \&quot;to\&quot; : \&quot;jsmith@test.com\&quot;,     \&quot;subject\&quot; : \&quot;Reminder\&quot;,     \&quot;body\&quot; : \&quot;Your invitation to the Acme Event will expire on 13/06/2019 at 23:59:59\&quot;,     \&quot;email\&quot; : {        \&quot;type\&quot; : \&quot;text/plain\&quot;,        \&quot;body\&quot; : \&quot;Your invitation to the Acme Event will expire on 13/06/2019 at 23:59:59\&quot;     } } &#x60;&#x60;&#x60; &#x60;&#x60;&#x60;XML POST http://api.&lt;region&gt;.whispir.com/workspaces/{workspaceId}/messages   Authorization: Basic am9obi5zbWl0aDpteXBhc3N3b3Jk x-api-key: your_api_key Content-Type: application/vnd.whispir.message-v1+xml Accept: application/vnd.whispir.message-v1+xml   &lt;?xml version&#x3D;\&quot;1.0\&quot; encoding&#x3D;\&quot;UTF-8\&quot; standalone&#x3D;\&quot;yes\&quot;?&gt; &lt;ns2:message xmlns:ns2&#x3D;\&quot;http://schemas.api.whispir.com\&quot;&gt;     &lt;to&gt;jsmith@test.com&lt;/to&gt;     &lt;subject&gt;Reminder&lt;/subject&gt;     &lt;body&gt;Your invitation to the Acme Event will expire on 13/06/2019 at 23:59:59&lt;/body&gt;     &lt;email&gt;         &lt;type&gt;text/plain&lt;/type&gt;         &lt;body&gt;Your invitation to the Acme Event will expire on 13/06/2019 at 23:59:59&lt;/body&gt;     &lt;/email&gt; &lt;/ns2:message&gt; &#x60;&#x60;&#x60;  **With Custom Tags**  #### Using Message Variables in Templates  &#x60;&#x60;&#x60;JSON Step 1 - Creating a Template including the attributes POST http://api.&lt;region&gt;.whispir.com/workspaces/{workspaceId}/templates   Authorization: Basic am9obi5zbWl0aDpteXBhc3N3b3Jk x-api-key: your_api_key Content-Type: application/vnd.whispir.template-v1+json Accept: application/vnd.whispir.template-v1+json    {     \&quot;messageTemplateName\&quot; : \&quot;Event Reminder\&quot;,     \&quot;subject\&quot; : \&quot;Reminder:\&quot;,     \&quot;body\&quot; : \&quot;Your invitation to the Acme Event will expire on @@event_expiry@@ at @@event_expiry_time@@\&quot;,     \&quot;email\&quot; : {        \&quot;type\&quot; : \&quot;text/plain\&quot;,        \&quot;body\&quot; : \&quot;Your invitation to the Acme Event will expire on @@event_expiry@@.\&quot;     } } Response - template created 201 - Created Location: http://api.&lt;region&gt;.whispir.com/workspaces/{workspaceId}/templates/DACADB02209CC93C {     ...    \&quot;id\&quot;: \&quot;DACADB02209CC93C\&quot;,     ... } Step 2 - Using Template including attributes to send the message POST http://api.&lt;region&gt;.whispir.com/workspaces/{workspaceId}/messages   Authorization: Basic am9obi5zbWl0aDpteXBhc3N3b3Jk x-api-key: your_api_key Content-Type: application/vnd.whispir.message-v1+json Accept: application/vnd.whispir.message-v1+json   {     \&quot;to\&quot; : \&quot;jsmith@test.com\&quot;,     \&quot;messageTemplateId\&quot; : \&quot;DACADB02209CC93C\&quot;,     \&quot;messageattributes\&quot; : {       \&quot;attribute\&quot; : [{          \&quot;name\&quot; : \&quot;event_expiry\&quot;,               \&quot;value\&quot; : \&quot;13/06/2019\&quot;          },{          \&quot;name\&quot; : \&quot;event_expiry_time\&quot;,               \&quot;value\&quot; : \&quot;23:59:59\&quot;          }]    }  } &#x60;&#x60;&#x60; &#x60;&#x60;&#x60;XML Step 1 - Creating a Template including attributes POST http://api.&lt;region&gt;.whispir.com/workspaces/{workspaceId}/templates   Authorization: Basic am9obi5zbWl0aDpteXBhc3N3b3Jk x-api-key: your_api_key Content-Type: application/vnd.whispir.template-v1+xml Accept: application/vnd.whispir.template-v1+xml   &lt;?xml version&#x3D;\&quot;1.0\&quot; encoding&#x3D;\&quot;UTF-8\&quot;?&gt; &lt;ns3:template xmlns:ns3&#x3D;\&quot;http://schemas.api.whispir.com\&quot;                xmlns:ns2&#x3D;\&quot;http://schemas.api.whispir.com/dap\&quot;&gt;   &lt;messageTemplateName&gt;Event Reminder&lt;/messageTemplateName&gt;   &lt;subject&gt;Reminder&lt;/subject&gt;   &lt;body&gt;Your invitation to the Acme Event will expire on @@event_expiry@@ at @@event_expiry_time@@&lt;/body&gt;   &lt;email&gt;      &lt;type&gt;text/plain&lt;/type&gt;      &lt;body&gt;Your invitation to the Acme Event will expire on @@event_expiry@@ at @@event_expiry_time@@&lt;/body&gt;   &lt;/email&gt; &lt;/ns3:template&gt; Response - template created 201 - Created Location: http://api.&lt;region&gt;.whispir.com/workspaces/{workspaceId}/templates/DACADB02209CC93C &lt;?xml version&#x3D;\&quot;1.0\&quot; encoding&#x3D;\&quot;UTF-8\&quot; standalone&#x3D;\&quot;yes\&quot;?&gt; &lt;ns3:template xmlns:ns2&#x3D;\&quot;http://schemas.api.whispir.com/dap\&quot; xmlns:ns3&#x3D;\&quot;http://schemas.api.whispir.com\&quot;&gt;     ...     &lt;id&gt;DACADB02209CC93C&lt;/id&gt;     ... &lt;ns3:template&gt; Step 2 - Using Template including attributes to send the message POST http://api.&lt;region&gt;.whispir.com/workspaces/{workspaceId}/messages   Authorization: Basic am9obi5zbWl0aDpteXBhc3N3b3Jk x-api-key: your_api_key Content-Type: application/vnd.whispir.message-v1+xml Accept: application/vnd.whispir.message-v1+xml   &lt;?xml version&#x3D;\&quot;1.0\&quot; encoding&#x3D;\&quot;UTF-8\&quot;?&gt; &lt;ns3:template xmlns:ns3&#x3D;\&quot;http://schemas.api.whispir.com\&quot;                xmlns:ns2&#x3D;\&quot;http://schemas.api.whispir.com/dap\&quot;&gt;    &lt;to&gt;jsmith@test.com&lt;/to&gt;    &lt;messageTemplateId&gt;DACADB02209CC93C&lt;/messageTemplateId&gt;    &lt;messageattributes&gt;       &lt;attribute&gt;          &lt;element&gt;             &lt;name&gt;@@event_expiry@@&lt;/name&gt;             &lt;value&gt;13/06/2019&lt;/value&gt;          &lt;/element&gt;          &lt;element&gt;             &lt;name&gt;@@event_expiry_time@@&lt;/name&gt;             &lt;value&gt;23:59:59&lt;/value&gt;          &lt;/element&gt;       &lt;/attribute&gt;    &lt;/messageattributes&gt; &lt;ns3:template&gt; &#x60;&#x60;&#x60; Using this message template ID and now using the message attribute @@event_expiry@@, the updated code example (combining the message template and message attribute) is far simpler to implement and is more efficient.  * * *  ### Scheduled Messages  #### Timezone - Scheduling rules  Using the Whispir API you can schedule messages to be sent later, both once or repeatedly with the possibility to specify the interval between the sessions. The service is available for SMS, email, voice, rich messages  A message is scheduled according to the timezone set in the Whispir account of the user who initiates the message request. This setting can be found in the Whispir Portal under \&quot;Settings\&quot;-&gt;\&quot;User Manager\&quot;-&gt;\&quot;View/Edit\&quot;. Whispir DOES NOT honor the timezone where the sender or the message recipient are currently located in For example if the user’s time zone is set to UTC in their Whispir profile then messages are scheduled to be sent as per UTC, even if the user triggers the message while sitting in Singapore (+8). So please ensure that any scheduled communication is sent at the appropriate/preferred time Also, changing the user&#39;s timezone setting after the message is triggered DOES NOT change the original scheduled time.  #### Sending messages at a later date  &#x60;&#x60;&#x60;JSON POST https://api.&lt;region&gt;.whispir.com/workspaces/{workspaceId}/messages   Authorization: Basic am9obi5zbWl0aDpteXBhc3N3b3Jk x-api-key: your_api_key Content-Type: application/vnd.whispir.message-v1+json Accept: application/vnd.whispir.message-v1+json ONCE In this sample we will schedule a single message to be delivered at 3:55pm on 14 February 2019 {     \&quot;to\&quot; : \&quot;jsmith@test.com\&quot;,     \&quot;subject\&quot; : \&quot;Test scheduled email message\&quot;,     \&quot;email\&quot; : {         \&quot;body\&quot; : \&quot;This is my scheduled content\&quot;,         \&quot;type\&quot; : \&quot;text/plain\&quot;     },     \&quot;messageType\&quot; : \&quot;SCHEDULED\&quot;,     \&quot;scheduleType\&quot; : \&quot;ONCE\&quot;,     \&quot;scheduleDate\&quot; : \&quot;14/02/2019 15:55\&quot; } REPEAT In this sample we will will schedule 10 messages to be delivered every hour starting from 3:55pm on 14 February 2019 {     \&quot;to\&quot; : \&quot;jsmith@test.com\&quot;,     \&quot;subject\&quot; : \&quot;Test scheduled email message\&quot;,     \&quot;email\&quot; : {         \&quot;body\&quot; : \&quot;This is my scheduled content\&quot;,         \&quot;type\&quot; : \&quot;text/plain\&quot;     },     \&quot;messageType\&quot; : \&quot;SCHEDULED\&quot;,     \&quot;scheduleType\&quot; : \&quot;REPEAT\&quot;,     \&quot;scheduleDate\&quot; : \&quot;14/02/2019 15:55\&quot;,     \&quot;repetitionCount\&quot; : \&quot;10\&quot;,     \&quot;repeatDays\&quot; : \&quot;0\&quot;,     \&quot;repeatHrs\&quot; : \&quot;1\&quot;,     \&quot;repeatMin\&quot; : \&quot;0\&quot; } &#x60;&#x60;&#x60; &#x60;&#x60;&#x60;XML POST https://api.&lt;region&gt;.whispir.com/workspaces/{workspaceId}/messages   Authorization: Basic am9obi5zbWl0aDpteXBhc3N3b3Jk x-api-key: your_api_key Content-Type: application/vnd.whispir.message-v1+json Accept: application/vnd.whispir.message-v1+json ONCE In this sample we will schedule a single message to be delivered at 3:55pm on 14 February 2019 &lt;?xml version&#x3D;\&quot;1.0\&quot; encoding&#x3D;\&quot;UTF-8\&quot; standalone&#x3D;\&quot;yes\&quot;?&gt; &lt;ns2:message xmlns:ns2&#x3D;\&quot;http://schemas.api.whispir.com\&quot; xmlns:ns3&#x3D;\&quot;http://schemas.api.whispir.com/dap\&quot;&gt;     &lt;to&gt;john.smith@test.com&lt;/to&gt;     &lt;subject&gt;Test scheduled email message&lt;/subject&gt;     &lt;email&gt;         &lt;body&gt;This is my scheduled content&lt;/body&gt;         &lt;type&gt;text/plain&lt;/type&gt;     &lt;/email&gt;     &lt;messageType&gt;SCHEDULED&lt;/messageType&gt;     &lt;scheduleType&gt;ONCE&lt;/scheduleType&gt;     &lt;scheduleDate&gt;14/02/2019 15:55&lt;/scheduleDate&gt; &lt;/ns2:message&gt; REPEAT In this sample we will will schedule 10 messages to be delivered every hour starting from 3:55pm on 14 February 2019 &lt;?xml version&#x3D;\&quot;1.0\&quot; encoding&#x3D;\&quot;UTF-8\&quot; standalone&#x3D;\&quot;yes\&quot;?&gt; &lt;ns2:message xmlns:ns2&#x3D;\&quot;http://schemas.api.whispir.com\&quot; xmlns:ns3&#x3D;\&quot;http://schemas.api.whispir.com/dap\&quot;&gt;     &lt;to&gt;john.smith@test.com&lt;/to&gt;     &lt;subject&gt;Test scheduled email message&lt;/subject&gt;     &lt;email&gt;         &lt;body&gt;This is my scheduled content&lt;/body&gt;         &lt;type&gt;text/plain&lt;/type&gt;     &lt;/email&gt;     &lt;messageType&gt;SCHEDULED&lt;/messageType&gt;     &lt;scheduleType&gt;REPEAT&lt;/scheduleType&gt;     &lt;scheduleDate&gt;14/02/2019 15:55&lt;/scheduleDate&gt;     &lt;repetitionCount&gt;10&lt;/repetitionCount&gt;     &lt;repeatDays&gt;0&lt;/repeatDays&gt;     &lt;repeatHrs&gt;1&lt;/repeatHrs&gt;     &lt;repeatMin&gt;0&lt;/repeatMin&gt; &lt;/ns2:message&gt; &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
import com.whispir.client.ApiClient;
import com.whispir.client.ApiException;
import com.whispir.client.Configuration;
import com.whispir.client.auth.*;
import com.whispir.client.models.*;
import com.whispir.api.Messages;

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

    Messages apiInstance = new Messages(defaultClient);
    String workspaceId = "9A4C5521FFC7B15B"; // String | The identifier for the workspace.
    String xApiKey = "xApiKey_example"; // String | The API key for authentication.
    String contentType = "application/vnd.whispir.message-v1+json"; // String | Application specific mime-type.
    String accept = "application/vnd.whispir.message-v1+json"; // String | Application specific mime-type.
    Message message = new Message(); // Message | Message object needed to create message. At least one of the Body fields must be populated [SMS, email, voice or web].
    try {
      Message result = apiInstance.messageCreate(workspaceId, xApiKey, contentType, accept, message);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Messages#messageCreate");
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
| **contentType** | **String**| Application specific mime-type. | [default to application/vnd.whispir.message-v1+json] [enum: application/vnd.whispir.message-v1+json, application/vnd.whispir.bulkmessage-v1+json, application/vnd.whispir.message-v1+xml, application/vnd.whispir.bulkmessage-v1+xml] |
| **accept** | **String**| Application specific mime-type. | [default to application/vnd.whispir.message-v1+json] [enum: application/vnd.whispir.message-v1+json, application/vnd.whispir.bulkmessage-v1+json, application/vnd.whispir.message-v1+xml, application/vnd.whispir.bulkmessage-v1+xml] |
| **message** | [**Message**](Message.md)| Message object needed to create message. At least one of the Body fields must be populated [SMS, email, voice or web]. | |

### Return type

[**Message**](Message.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.whispir.message-v1+json
 - **Accept**: application/vnd.whispir.message-v1+json, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The response code for a message that is accepted for scheduled delivery. |  * Content-Type -  <br>  * Content-Length -  <br>  * Access-Control-Allow-Origin -  <br>  * Cache-Control -  <br>  * Expires -  <br>  * Location -  <br>  |
| **202** | The response code for a message that is accepted for immediate delivery. |  * Content-Type -  <br>  * Content-Length -  <br>  * Access-Control-Allow-Origin -  <br>  * Cache-Control -  <br>  * Expires -  <br>  * Location -  <br>  |
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

<a name="messageList"></a>
# **messageList**
> MessageCollection messageList(workspaceId, xApiKey, accept, limit, offset, sortOrder, sortFields)

List messages

List all sent messages for the workspace.  Pagination is available.

### Example
```java
// Import classes:
import com.whispir.client.ApiClient;
import com.whispir.client.ApiException;
import com.whispir.client.Configuration;
import com.whispir.client.auth.*;
import com.whispir.client.models.*;
import com.whispir.api.Messages;

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

    Messages apiInstance = new Messages(defaultClient);
    String workspaceId = "9A4C5521FFC7B15B"; // String | The identifier for the workspace.
    String xApiKey = "xApiKey_example"; // String | The API key for authentication.
    String accept = "application/vnd.whispir.message-v1+json"; // String | Application specific mime-type.
    BigDecimal limit = new BigDecimal("20"); // BigDecimal | The number of records to be returned.
    BigDecimal offset = new BigDecimal("0"); // BigDecimal | The record number to start returning from.
    String sortOrder = "asc"; // String | The order in which you require the results to be returned. Either ‘asc’ or ‘desc’
    String sortFields = "lastName,jobTitle"; // String | The fields that you require the ordering to be performed on. Multiple fields can be provided, separated by a comma.
    try {
      MessageCollection result = apiInstance.messageList(workspaceId, xApiKey, accept, limit, offset, sortOrder, sortFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Messages#messageList");
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
| **accept** | **String**| Application specific mime-type. | [default to application/vnd.whispir.message-v1+json] [enum: application/vnd.whispir.message-v1+json, application/vnd.whispir.bulkmessage-v1+json, application/vnd.whispir.message-v1+xml, application/vnd.whispir.bulkmessage-v1+xml] |
| **limit** | **BigDecimal**| The number of records to be returned. | [optional] [default to 20] |
| **offset** | **BigDecimal**| The record number to start returning from. | [optional] [default to 0] |
| **sortOrder** | **String**| The order in which you require the results to be returned. Either ‘asc’ or ‘desc’ | [optional] [enum: asc, desc] |
| **sortFields** | **String**| The fields that you require the ordering to be performed on. Multiple fields can be provided, separated by a comma. | [optional] |

### Return type

[**MessageCollection**](MessageCollection.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.whispir.message-v1+json, application/json

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

<a name="messageResponseList"></a>
# **messageResponseList**
> MessageResponseCollection messageResponseList(workspaceId, xApiKey, accept, messageId, limit, offset, sortOrder, sortFields, view, filter)

List responses for a sent message

## Summary Responses  Using the links provided in the message response, the user can simply make a new API request to retrieve the summaryStatus URL.  The request for this information would look as follows:  &#x60;GET /messages/069BF68E5E0FE99B/messagestatus?view&#x3D;summary&#x60;  This request is asking for a couple of things:  1.  The URL is specifically asking for all of the **messageresponses** to the message with ID **069BF68E5E0FE99B**  3.  The **View** parameter is specifying that the message responses should be shown in a **summary** view  5.  The **Filter** parameter is specifying that the filter should not use a response rule, it should show the **default** filter  As this is a **GET** request we don’t have to provide any message body.  This response states that of the 2 people that were sent the message, both of them **Acknowledged** it by sending a response.  Your application can use this information to easily determine the numbers of recipients in each state and show a small graph.  ## Detailed Responses Using the links provided in the message response, the user can simply make a new API request to retrieve the detailedResponses URL.  The resulting request would look as follows:  &#x60;GET /messages/069BF68E5E0FE99B/messageresponses?view&#x3D;detailed&amp;filter&#x3D;default&#x60;  This request is asking for a couple of things:  1.  The URL is specifically asking for all of the **messageresponses** to the message with ID &#x60;069BF68E5E0FE99B&#x60; 2.  The **View** parameter is specifying that the message responses should be shown in a **detailed** view 3.  The **Filter** parameter is specifying that the filter should not use a response rule, it should show the **default** filter  As this is a **GET** request we don’t have to provide any message body.  **Note**:Searching responses will be described further on in this documentation.  *   The **responseMessage channel** describes the messaging channel that the response has come in to the Whispir Platform via.  *   The **responseMessage content** describes the actual content of the inbound message.  *   The **responseMessage acknowledged** shows the date of when the response was received by the Whispir Platform 

### Example
```java
// Import classes:
import com.whispir.client.ApiClient;
import com.whispir.client.ApiException;
import com.whispir.client.Configuration;
import com.whispir.client.auth.*;
import com.whispir.client.models.*;
import com.whispir.api.Messages;

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

    Messages apiInstance = new Messages(defaultClient);
    String workspaceId = "9A4C5521FFC7B15B"; // String | The identifier for the workspace.
    String xApiKey = "xApiKey_example"; // String | The API key for authentication.
    String accept = "application/vnd.whispir.messageresponse-v1+json"; // String | Application specific mime-type.
    String messageId = "44F4DA8F04755430BEC5A0E1E2154EBA"; // String | Enter message id
    BigDecimal limit = new BigDecimal("20"); // BigDecimal | The number of records to be returned.
    BigDecimal offset = new BigDecimal("0"); // BigDecimal | The record number to start returning from.
    String sortOrder = "asc"; // String | The order in which you require the results to be returned. Either ‘asc’ or ‘desc’
    String sortFields = "lastName,jobTitle"; // String | The fields that you require the ordering to be performed on. Multiple fields can be provided, separated by a comma.
    String view = "summary"; // String | The view for the message response.
    String filter = "noresponse"; // String | The filter for the message response.
    try {
      MessageResponseCollection result = apiInstance.messageResponseList(workspaceId, xApiKey, accept, messageId, limit, offset, sortOrder, sortFields, view, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Messages#messageResponseList");
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
| **accept** | **String**| Application specific mime-type. | [default to application/vnd.whispir.messageresponse-v1+json] [enum: application/vnd.whispir.messageresponse-v1+json, application/vnd.whispir.messageresponse-v1+xml] |
| **messageId** | **String**| Enter message id | |
| **limit** | **BigDecimal**| The number of records to be returned. | [optional] [default to 20] |
| **offset** | **BigDecimal**| The record number to start returning from. | [optional] [default to 0] |
| **sortOrder** | **String**| The order in which you require the results to be returned. Either ‘asc’ or ‘desc’ | [optional] [enum: asc, desc] |
| **sortFields** | **String**| The fields that you require the ordering to be performed on. Multiple fields can be provided, separated by a comma. | [optional] |
| **view** | **String**| The view for the message response. | [optional] [default to summary] [enum: summary, detailed] |
| **filter** | **String**| The filter for the message response. | [optional] [enum: noresponse, notmatched, responserule] |

### Return type

[**MessageResponseCollection**](MessageResponseCollection.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.whispir.messageresponse-v1+json, application/json

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

<a name="messageRetrieve"></a>
# **messageRetrieve**
> Message messageRetrieve(workspaceId, xApiKey, accept, messageId)

Retrieve a message

Each of the URLs specified in the response can be accessed using the REL and appropriate METHOD to perform the specified functionality.  **Rel Attribute Descriptions**  * * *  - **self:** Retrieves the current message.    - **summaryStatus:** Returns the status information of the message as a messagestatus object, in a summary view.    - **detailedStatus:** Returns the status information of the message as a messagestatus object, in a detailed view.    - **summaryResponses:** Returns the response information of the message as a messageresponse object, in a summary view.    - **detailedResponses:** Returns the response information of the message as a messageresponse object, in a detailed view.   - **summaryResponsesWithResponseRule:** Returns the response information of the message as a messageresponse object, filtered by the Response Rule (if one was used) in a summary view.    - **detailedResponsesWithResponseRule:** Returns the response information of the message as a messageresponse object, filtered by the Response Rule (if one was used) in a detailed view.

### Example
```java
// Import classes:
import com.whispir.client.ApiClient;
import com.whispir.client.ApiException;
import com.whispir.client.Configuration;
import com.whispir.client.auth.*;
import com.whispir.client.models.*;
import com.whispir.api.Messages;

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

    Messages apiInstance = new Messages(defaultClient);
    String workspaceId = "9A4C5521FFC7B15B"; // String | The identifier for the workspace.
    String xApiKey = "xApiKey_example"; // String | The API key for authentication.
    String accept = "application/vnd.whispir.message-v1+json"; // String | Application specific mime-type.
    String messageId = "messageId_example"; // String | The identifier for the message.
    try {
      Message result = apiInstance.messageRetrieve(workspaceId, xApiKey, accept, messageId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Messages#messageRetrieve");
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
| **accept** | **String**| Application specific mime-type. | [default to application/vnd.whispir.message-v1+json] [enum: application/vnd.whispir.message-v1+json, application/vnd.whispir.bulkmessage-v1+json, application/vnd.whispir.message-v1+xml, application/vnd.whispir.bulkmessage-v1+xml] |
| **messageId** | **String**| The identifier for the message. | |

### Return type

[**Message**](Message.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.whispir.message-v1+json, application/json

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

<a name="messageStatusList"></a>
# **messageStatusList**
> MessageStatusCollection messageStatusList(workspaceId, xApiKey, accept, messageId, limit, offset, sortOrder, sortFields, view, filter)

List message status for a sent message

Whispir will automatically monitor the status of each message after it has been sent to each recipient. Using the message status information, you are able to determine who received the message, what exact time they received it, on what message channel (SMS, Email, Voice, Web, Push Notification), whether they replied to the message, what time they replied, and on what messaging channel.       Each message progresses through various states, from Pending to Acknowledged.   ### Message Status Descriptions  - **Pending (PENDING):** The message has not yet been processed by Whispir. It is in a queue and will be processed shortly. - **Sent (SENT):** The message has been sent from Whispir to the recipient, however, there has been no acknowledgement from the recipient via read receipt that the message has arrived. - **Received (DELIVRD):**   - **Email:** Whispir has received acknowledgement via a read receipt that the message has arrived in the inbox.   - **SMS:** Received status can mean one of two things for SMS.     1.  The message has been received by the network and is being processed for delivery to the handset.           How long the message stays in this state is up to the telco.     2.  The message has been received by the handset and confirmed by the telco. - **Acknowledged (READ):** Whispir has received an intended response from the recipient, either by reply SMS, Email or Voice prompt - **Undeliverable (FAILED):** Whispir was not able to deliver the message to the intended recipient on the specified channel. This may be due to incorrect information e.g. wrong phone number or email address, or due to poor network coverage.  Using the API, developers are able to access this status information at either a Summary or Detailed level.  The first thing a developer must do in order to retrieve the status of a sent message is retrieve the message using the API.  ### Retrieve Summary Status  Using the links provided in the message response, the user can simply make a new API request to retrieve the summaryStatus URL.  In the example above, the summaryStatus URL is:  So the request would look as follows:  &#x60;GET /messages/069BF68E5E0FE99B/messagestatus?view&#x3D;summary&#x60;  As this is a GET request we don’t have to provide any message body.  This response states that of the 2 people that were sent the message, both of them Acknowledged it by sending a response.  Your application can use this information to easily determine the numbers of recipients in each state and show a small graph.  ### Retrieve Detailed Status  Similar to the summaryStatus, using the links provided in the message response, the user can simply make a new API request to retrieve the detailedStatus URL.  &#x60;GET /messages/069BF68E5E0FE99B/messagestatus?view&#x3D;detailed&#x60;  As this is a GET request we don’t have to provide any message body.  The user can easily use this information to receive a far more detailed status breakdown of (for each recipient):  *   The name of the recipient *   The channel type (SMS, Email, Voice, Web) *   The sent timestamp for each channel *   The received timestamp for each channel *   The acknowledged timestamp for each channel *   The undeliverable timestamp (only present when the channel is undeliverable) *   The overall status for this recipient (PENDING, SENT, DELIVRD, READ, FAILED) *   The information text describing how this message has progressed.  Once you have processed the status information, the next likely piece of information you will be looking to find is the content of the responses (if any). The section on Message Responses describes how to retrieve this information. 

### Example
```java
// Import classes:
import com.whispir.client.ApiClient;
import com.whispir.client.ApiException;
import com.whispir.client.Configuration;
import com.whispir.client.auth.*;
import com.whispir.client.models.*;
import com.whispir.api.Messages;

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

    Messages apiInstance = new Messages(defaultClient);
    String workspaceId = "9A4C5521FFC7B15B"; // String | The identifier for the workspace.
    String xApiKey = "xApiKey_example"; // String | The API key for authentication.
    String accept = "application/vnd.whispir.messagestatus-v1+json"; // String | Application specific mime-type.
    String messageId = "44F4DA8F04755430BEC5A0E1E2154EBA"; // String | Enter message id
    BigDecimal limit = new BigDecimal("20"); // BigDecimal | The number of records to be returned.
    BigDecimal offset = new BigDecimal("0"); // BigDecimal | The record number to start returning from.
    String sortOrder = "asc"; // String | The order in which you require the results to be returned. Either ‘asc’ or ‘desc’
    String sortFields = "lastName,jobTitle"; // String | The fields that you require the ordering to be performed on. Multiple fields can be provided, separated by a comma.
    String view = "summary"; // String | The view for the message status.
    String filter = "default"; // String | The filter for the message status.
    try {
      MessageStatusCollection result = apiInstance.messageStatusList(workspaceId, xApiKey, accept, messageId, limit, offset, sortOrder, sortFields, view, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Messages#messageStatusList");
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
| **accept** | **String**| Application specific mime-type. | [default to application/vnd.whispir.messagestatus-v1+json] [enum: application/vnd.whispir.messagestatus-v1+json, application/vnd.whispir.messagestatus-v1+xml] |
| **messageId** | **String**| Enter message id | |
| **limit** | **BigDecimal**| The number of records to be returned. | [optional] [default to 20] |
| **offset** | **BigDecimal**| The record number to start returning from. | [optional] [default to 0] |
| **sortOrder** | **String**| The order in which you require the results to be returned. Either ‘asc’ or ‘desc’ | [optional] [enum: asc, desc] |
| **sortFields** | **String**| The fields that you require the ordering to be performed on. Multiple fields can be provided, separated by a comma. | [optional] |
| **view** | **String**| The view for the message status. | [optional] [default to summary] [enum: summary, detailed] |
| **filter** | **String**| The filter for the message status. | [optional] [default to default] [enum: default, responserule] |

### Return type

[**MessageStatusCollection**](MessageStatusCollection.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.whispir.messagestatus-v1+json, application/json

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

