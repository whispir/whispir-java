

# Key

The key object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | The identifier for this key |  [optional] [readonly] |
|**type** | [**TypeEnum**](#TypeEnum) | The authentication type that this Key is used for |  [readonly] |
|**userId** | **UUID** | The user identifier associated with this Key |  [readonly] |
|**clientId** | **UUID** | The company identifier (client). Provided by Auth0 Management API used to revoke client access during deletion. |  [readonly] |
|**accountId** | **UUID** | Nextgen account id associated with this Key |  [readonly] |
|**createdTime** | **OffsetDateTime** | Timestamp on when the Key has been created |  [optional] [readonly] |
|**lastModifiedTime** | **String** | Last Modified data and time |  [optional] [readonly] |
|**enabled** | **Boolean** | Determine if this Key is enabled or disabled |  |
|**description** | **String** | User provided description usually used for identifying usage |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| BASIC | &quot;basic&quot; |
| BEARER | &quot;bearer&quot; |



