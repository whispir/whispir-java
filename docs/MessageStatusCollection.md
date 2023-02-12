

# MessageStatusCollection

The message status object, describing the delivery of the sent message.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**link** | [**List&lt;Link&gt;**](Link.md) | A [HATEOAS](https://en.wikipedia.org/wiki/HATEOAS) link array, describing all discoverable resources in relation to the original request. |  [optional] [readonly] |
|**messageStatuses** | [**List&lt;MessageStatus&gt;**](MessageStatus.md) | The message statuses. |  [optional] |
|**status** | **String** | Present when &#x60;view&#x60; is &#x60;detailed&#x60;. |  [optional] |



