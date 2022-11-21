

# CallbackCall

A callback call object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique ID of the specific call within Whispir |  [optional] [readonly] |
|**messageId** | **String** | The unique ID of the message within Whispir |  [optional] [readonly] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of this particular callback attempt. |  [optional] [readonly] |
|**messageLocation** | **String** | The fully qualified URL to the original message within Whispir |  [optional] [readonly] |
|**from** | [**CallbackCallFrom**](CallbackCallFrom.md) |  |  [optional] |
|**responseMessage** | [**CallbackCallResponseMessage**](CallbackCallResponseMessage.md) |  |  [optional] |
|**callback** | [**CallbackCallCallback**](CallbackCallCallback.md) |  |  [optional] |
|**link** | [**List&lt;LinkInner&gt;**](LinkInner.md) | A [HATEOAS](https://en.wikipedia.org/wiki/HATEOAS) link object, describing all discoverable resources in relation to the original request. |  [optional] [readonly] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SUCCESS | &quot;SUCCESS&quot; |
| FAILED | &quot;FAILED&quot; |



