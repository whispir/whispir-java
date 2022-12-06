

# Callback

The callback object, used to configure the callback (also known as webhook).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The id of the callback.   This is the value that should be passed when referring to the callback using the API endpoints |  [optional] [readonly] |
|**name** | **String** | The name of the callback.   This is the value that should be passed in the message payload for triggering the callbacks |  |
|**url** | **URI** | Specifies the service URL that API Callbacks should be forwarded to. |  |
|**auth** | [**CallbackAuth**](CallbackAuth.md) |  |  |
|**contentType** | [**ContentTypeEnum**](#ContentTypeEnum) | Specifies the content type that should be sent to this endpoint. |  |
|**removeHTML** | [**RemoveHTMLEnum**](#RemoveHTMLEnum) | Specifies whether HTML should be stripped from responses. |  |
|**retriesEnabled** | **Boolean** | Specifies whether Whispir should perform retries in the event there is a failure accessing the callback service. |  |
|**email** | **String** | Whispir notify this email address that a callback has failed (only when retries are disabled).   The email will contain the details of the callback content. |  |
|**callbacks** | [**CallbackEvent**](CallbackEvent.md) |  |  |
|**link** | [**List&lt;Link&gt;**](Link.md) | A [HATEOAS](https://en.wikipedia.org/wiki/HATEOAS) link object, describing all discoverable resources in relation to the original request. |  [optional] [readonly] |



## Enum: ContentTypeEnum

| Name | Value |
|---- | -----|
| JSON | &quot;json&quot; |
| XML | &quot;xml&quot; |



## Enum: RemoveHTMLEnum

| Name | Value |
|---- | -----|
| ENABLED | &quot;enabled&quot; |
| DISABLED | &quot;disabled&quot; |



