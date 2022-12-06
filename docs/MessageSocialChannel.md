

# MessageSocialChannel

The social channel object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**IdEnum**](#IdEnum) | The identifier for the social content channel. Read the following section for information on each channel.  | Channel        | id | | -------------- |--------------- | | Twitter        | &#x60;\&quot;social\&quot;&#x60; | | Facebook       | &#x60;\&quot;social_long\&quot;&#x60; | |  [optional] |
|**body** | **String** | The social content body. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The social message content type. |  [optional] |



## Enum: IdEnum

| Name | Value |
|---- | -----|
| SOCIAL | &quot;social&quot; |
| SOCIAL_LONG | &quot;social_long&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| PLAIN | &quot;text/plain&quot; |
| HTML | &quot;text/html&quot; |



