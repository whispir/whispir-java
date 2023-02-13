

# MessageStatusMessageStatusesInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**link** | [**List&lt;LinkInner&gt;**](LinkInner.md) | A [HATEOAS](https://en.wikipedia.org/wiki/HATEOAS) link object, describing all discoverable resources in relation to the original request. |  [optional] [readonly] |
|**categories** | [**Set&lt;MessageStatusMessageStatusesInnerCategoriesInner&gt;**](MessageStatusMessageStatusesInnerCategoriesInner.md) | Present when &#x60;view&#x60; is &#x60;summary&#x60;. |  [optional] |
|**name** | **String** | Present when &#x60;view&#x60; is &#x60;detailed&#x60;. |  [optional] |
|**info** | **String** | Present when &#x60;view&#x60; is &#x60;detailed&#x60;. |  [optional] |
|**status** | **List&lt;Object&gt;** | Present when &#x60;view&#x60; is &#x60;detailed&#x60;. |  [optional] |



