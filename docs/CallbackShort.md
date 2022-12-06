

# CallbackShort


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The id of the callback.   This is the value that should be passed when referring to the callback using the API endpoints |  [optional] [readonly] |
|**name** | **String** | The name of the callback.   This is the value that should be passed in the message payload for triggering the callbacks |  [optional] [readonly] |
|**url** | **String** | The destination url on your servers that Whispir should reach out to. |  [optional] [readonly] |
|**retriesEnabled** | **Boolean** | If retriesEnabled is false, then Whispir will only try once and when a failure (non 200 OK response code) happens, it will not retry again  When true, it will try every 5 mins for a maximum of 10 times.  Refer to callback calls for more details on retrieving the SUCCESS and FAIL logs |  [optional] [readonly] |
|**link** | [**List&lt;Link&gt;**](Link.md) | A [HATEOAS](https://en.wikipedia.org/wiki/HATEOAS) link object, describing all discoverable resources in relation to the original request. |  [optional] [readonly] |



