

# Template

The template object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**messageTemplateName** | **String** | Specifies the name of the message template to be used within message requests. |  [readonly] |
|**messageTemplateDescription** | **String** | Specifies the description of the message template for others to understand its purpose. |  [optional] |
|**responseTemplateId** | **String** | Specifies the ID of the Response Rule that should be associated with this Message Template. |  [optional] |
|**subject** | **String** | Specifies the first line of the SMS message or Voice call, and the subject of the Email message. |  |
|**body** | **String** | Specifies the content of the SMS message. |  |
|**email** | [**Email**](Email.md) |  |  [optional] |
|**voice** | [**Voice**](Voice.md) |  |  [optional] |
|**web** | [**Web**](Web.md) |  |  [optional] |
|**social** | [**Social**](Social.md) |  |  [optional] |
|**type** | **String** | Allows the user to modify the message behaviour for replies and DLRs (delivery receipts) |  [optional] |
|**features** | [**Features**](Features.md) |  |  [optional] |
|**dlr** | [**Dlr**](Dlr.md) |  |  [optional] |
|**link** | [**List&lt;LinkInner&gt;**](LinkInner.md) | A [HATEOAS](https://en.wikipedia.org/wiki/HATEOAS) link object, describing all discoverable resources in relation to the original request. |  [optional] [readonly] |
|**tags** | **String** | Information which helps to label related message templates together |  [optional] [readonly] |
|**id** | **String** | specifies the id of the message template |  [optional] [readonly] |



