

# MessageResponseDetailedMessageresponsesInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**from** | [**MessageResponseDetailedMessageresponsesInnerFrom**](MessageResponseDetailedMessageresponsesInnerFrom.md) |  |  |
|**responseCategory** | [**ResponseCategoryEnum**](#ResponseCategoryEnum) | The message response category.  * &#x60;noresponse&#x60; - the message was sent but was not replied to * &#x60;notmatched&#x60; - the message was replied to and the answer didn&#39;t match any search criteria |  |
|**responseMessage** | [**MessageResponseDetailedMessageresponsesInnerResponseMessage**](MessageResponseDetailedMessageresponsesInnerResponseMessage.md) |  |  |



## Enum: ResponseCategoryEnum

| Name | Value |
|---- | -----|
| NORESPONSE | &quot;noresponse&quot; |
| NOTMATCHED | &quot;notmatched&quot; |



