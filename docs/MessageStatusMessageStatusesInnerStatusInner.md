

# MessageStatusMessageStatusesInnerStatusInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The message delivery channel. |  |
|**status** | [**StatusEnum**](#StatusEnum) | The message delivery status code. |  |
|**destination** | **String** | The delivery address of the message recipient. |  |
|**sentTimestamp** | **BigDecimal** | The time the message was sent from Whispir servers. |  [optional] |
|**receivedTimestamp** | **BigDecimal** | The time the message was received on the message recipient&#39;s device. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SMS | &quot;sms&quot; |
| EMAIL | &quot;email&quot; |
| VOICE | &quot;voice&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| EMPTY | &quot;&quot; |
| PENDING | &quot;PENDING&quot; |
| SENT | &quot;SENT&quot; |
| DELIVRD | &quot;DELIVRD&quot; |
| READ | &quot;READ&quot; |
| FAILED | &quot;FAILED&quot; |



