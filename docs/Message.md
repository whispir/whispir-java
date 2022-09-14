

# Message

Whispir has a maximum API request payload size of 10MB. Whispir will reject the request if the payload is any bigger. This payload size limit should be adhered to when creatin the message payload. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**to** | **String** | Allows a combination of phone numbers, email address, Whispir Contact MRIs, User MRI, Distribution List MRI, separated by &#x60;,&#x60;.  Whispir will pick the relevant recipients based on the channels provided in the request payload  (including template information).  The maximum payload size rule applies.  When used for bulk messages, this field is optional, as bulk messages has another model to specify the &#x60;to&#x60; field recipients.  |  |
|**subject** | **String** | The message subject. This is common for both SMS and Email channels.  Read &#x60;body&#x60; notes on limits.  The maximum payload size rule applies.  When used for templates, this field is optional. |  |
|**body** | **String** | The SMS body.  The maximum payload size rule applies.  IMPORTANT: The total SMS length is 1570 characters for english text and 800 when UTF-8 characters are used (primarily non-english)  The 1570 length is a combination of subject and body. |  [optional] |
|**email** | [**Email**](Email.md) |  |  [optional] |
|**voice** | [**Voice**](Voice.md) |  |  [optional] |
|**web** | [**Web**](Web.md) |  |  [optional] |
|**social** | [**Social**](Social.md) |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Allows the user to modify the message behaviour for replies and DLRs (delivery receipts).  - &#x60;defaultNoReply&#x60;: Used to reject any replies to this message. - &#x60;noDlr&#x60;: Used to specify that DLRs should not be enabled for this message. |  [optional] |
|**features** | [**Features**](Features.md) |  |  [optional] |
|**resource** | [**Resource**](Resource.md) |  |  [optional] |
|**messageTemplateId** | **String** | The identifier for the Message Template. Specification of this attribute is preferred over the &#x60;messageTemplateName&#x60;, to provide an absolute and non-changing reference to the Message Template. |  [optional] |
|**messageTemplateName** | **String** | A human-readable name for the Message Template. |  [optional] |
|**callbackId** | **String** | The identifier for the Callback to be invoked on Message delivery events. |  [optional] |
|**callbackParameters** | **Object** | Set of key-value pairs that you can attach to a callback. This can be useful for returning additional information about the object in a structured format. |  [optional] |
|**label** | **String** | A label to tag the message, useful for grouped viewing and filtering in the UI and via API &#x60;GET /messages?label&#x3D;example&#x60;.  **IMPORTANT**: When this label is used, Whispir Reporting ignores the “Category” labels tied to the messages. Please ensure you are using this as per your business needs and such usage does not affect the reports generated via the \&quot;Category\&quot; grouping. |  [optional] |
|**eventId** | **String** | The identifier for the Event to trigger. |  [optional] |
|**messageType** | [**MessageTypeEnum**](#MessageTypeEnum) | The type of message, used to enable message scheduling. |  [optional] |
|**scheduleType** | [**ScheduleTypeEnum**](#ScheduleTypeEnum) | The schedule type, used to enable single or repeated message scheduling. |  [optional] |
|**scheduleDate** | **String** | For &#x60;ONCE&#x60; scheduled messages, specifies the date to trigger the single delivery. For &#x60;REPEATED&#x60; scheduled messages, the time at which the first of them will be sent. |  [optional] |
|**repetitionCount** | **BigDecimal** | Specifies how many times the scheduled message will be sent to the recipient. |  [optional] |
|**repeatDays** | **BigDecimal** | The interval in days between each scheduled message repetition. |  [optional] |
|**repeatHrs** | **BigDecimal** | The interval in hours between each scheduled message repetition. |  [optional] |
|**repeatMin** | **BigDecimal** | The interval in minutes between each scheduled message repetition. |  [optional] |
|**from** | **String** | The message sender&#39;s Whispir User MRI. |  [optional] [readonly] |
|**direction** | [**DirectionEnum**](#DirectionEnum) | The direction of the sent message. |  [optional] [readonly] |
|**responseCount** | **String** | Details the responses received for the sent message across all channels. Refer to &#x60;/messageresponses&#x60; to get the detailed response data. |  [optional] [readonly] |
|**createdTime** | **BigDecimal** | Epoch time (refers to Unix TimeStamp format starting Jan 1, 1970) denoting the time the message was sent. For bulk messages and messages with multiple recipients this value is tied to the timestamp when the message was received and processed by Whispir. |  [optional] [readonly] |
|**whatsappValidMessage** | **Boolean** | The validity of the WhatsApp channel message. |  [optional] [readonly] |
|**validBody** | **Boolean** | The validity of the message body. |  [optional] [readonly] |
|**validSubject** | **Boolean** | The validity of the message subject. |  [optional] [readonly] |
|**dlr** | [**Dlr**](Dlr.md) |  |  [optional] |
|**link** | [**List&lt;LinkInner&gt;**](LinkInner.md) | A [HATEOAS](https://en.wikipedia.org/wiki/HATEOAS) link object, describing all discoverable resources in relation to the original request. |  [optional] [readonly] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DEFAULT | &quot;default&quot; |
| DEFAULTNOREPLY | &quot;defaultNoReply&quot; |
| NODLR | &quot;noDlr&quot; |



## Enum: MessageTypeEnum

| Name | Value |
|---- | -----|
| SCHEDULED | &quot;SCHEDULED&quot; |



## Enum: ScheduleTypeEnum

| Name | Value |
|---- | -----|
| ONCE | &quot;ONCE&quot; |
| REPEAT | &quot;REPEAT&quot; |



## Enum: DirectionEnum

| Name | Value |
|---- | -----|
| OUTGOING | &quot;OUTGOING&quot; |



