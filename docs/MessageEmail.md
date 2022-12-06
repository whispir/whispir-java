

# MessageEmail

The email channel payload, used when sending an email Message.  Not required when a template is provided.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**body** | **String** | The email message body. |  |
|**footer** | **String** | Plain text or html displayed at the bottom of your email message. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The email Message content type. |  [optional] |
|**resources** | [**MessageEmailResources**](MessageEmailResources.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| PLAIN | &quot;text/plain&quot; |
| HTML | &quot;text/html&quot; |



