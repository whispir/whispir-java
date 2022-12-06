

# MessageStatus

The message status object, describing the delivery of the sent message.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**messageStatuses** | [**Set&lt;MessageStatusSummary&gt;**](MessageStatusSummary.md) | The object defining the message delivery status. |  [optional] |
|**link** | [**List&lt;Link&gt;**](Link.md) | A [HATEOAS](https://en.wikipedia.org/wiki/HATEOAS) link object, describing all discoverable resources in relation to the original request. |  [optional] [readonly] |
|**status** | **String** | Present when &#x60;view&#x60; is &#x60;detailed&#x60;. |  [optional] |



