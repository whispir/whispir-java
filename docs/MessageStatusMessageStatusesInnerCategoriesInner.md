

# MessageStatusMessageStatusesInnerCategoriesInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | [**NameEnum**](#NameEnum) | The delivery status of the message. |  |
|**recipientCount** | **BigDecimal** | The number of recipients with the given &#x60;name&#x60; status. |  |
|**percentageTotal** | **String** | The percentage of recipients with the given &#x60;name&#x60; status. |  |



## Enum: NameEnum

| Name | Value |
|---- | -----|
| SENT | &quot;Sent&quot; |
| PENDING | &quot;Pending&quot; |
| RECEIVED | &quot;Received&quot; |
| ACKNOWLEDGED | &quot;Acknowledged&quot; |
| UNDELIVERABLE | &quot;Undeliverable&quot; |



