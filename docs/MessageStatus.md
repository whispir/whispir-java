

# MessageStatus


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**link** | [**List&lt;Link&gt;**](Link.md) | A [HATEOAS](https://en.wikipedia.org/wiki/HATEOAS) link array, describing all discoverable resources in relation to the original request. |  [optional] [readonly] |
|**categories** | [**Set&lt;DeliveryCategory&gt;**](DeliveryCategory.md) | Present when &#x60;view&#x60; is &#x60;summary&#x60;. |  [optional] |
|**name** | **String** | Present when &#x60;view&#x60; is &#x60;detailed&#x60;. |  [optional] |
|**info** | **String** | Present when &#x60;view&#x60; is &#x60;detailed&#x60;. |  [optional] |
|**status** | [**Set&lt;DeliveryStatus&gt;**](DeliveryStatus.md) | Present when &#x60;view&#x60; is &#x60;detailed&#x60;. |  [optional] |



