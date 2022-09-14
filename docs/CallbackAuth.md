

# CallbackAuth

The authentication model details. You will receive -   For `queryparam` - `?Auth={{KeyValue}}`  For `httpheader` - `X-Whispir-Callback-Key: {{KeyValue}}`  For `basicauth` - `Authorization: Basic {{KeyValue}}`  For `bearertoken` - `Authorization: Bearer {{KeyValue}}`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The type of authentication allowed by Whispir at the Destination URL |  |
|**key** | **String** | The value that will be passed with the authentication key |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| QUERYPARAM | &quot;queryparam&quot; |
| HTTPHEADER | &quot;httpheader&quot; |
| BASICAUTH | &quot;basicauth&quot; |
| BEARERTOKEN | &quot;bearertoken&quot; |



