

# Response

The details about this particular message that have been sent to the callback  IMPORTANT: Depending on the flow, you may only see  one of the acknowledged or undeliverable keys with timestamps as their value

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**channel** | [**ChannelEnum**](#ChannelEnum) | The channel that this message was sent on. Either SMS, email or voice |  [readonly] |
|**acknowledged** | **String** | The date/time that this message was acknowledged |  [readonly] |
|**undeliverable** | **String** | The date/time that this message was marked as undeliverable |  [optional] [readonly] |
|**content** | **String** | The content of the message |  [readonly] |



## Enum: ChannelEnum

| Name | Value |
|---- | -----|
| SMS | &quot;sms&quot; |
| EMAIL | &quot;email&quot; |
| VOICE | &quot;voice&quot; |
| N_A | &quot;N/A&quot; |



