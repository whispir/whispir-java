

# CallbackCall

A callback call object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique ID of the specific call within Whispir |  [optional] [readonly] |
|**messageId** | **String** | The unique ID of the message within Whispir |  [optional] [readonly] |
|**messageLocation** | **String** | The fully qualified URL to the original message within Whispir |  [optional] [readonly] |
|**link** | [**List&lt;Link&gt;**](Link.md) | A [HATEOAS](https://en.wikipedia.org/wiki/HATEOAS) link array, describing all discoverable resources in relation to the original request. |  [optional] [readonly] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of this particular callback attempt. |  |
|**from** | [**Responder**](Responder.md) |  |  [optional] |
|**responseMessage** | [**Response**](Response.md) |  |  [optional] |
|**callback** | [**CallbackInvocation**](CallbackInvocation.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SUCCESS | &quot;SUCCESS&quot; |
| FAILED | &quot;FAILED&quot; |



