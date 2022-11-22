

# LinkInner

The HATEOAS link object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uri** | **URI** | The Universal Resource Identifier for the related resource. |  [optional] [readonly] |
|**rel** | **String** | The description of the related resource. |  [optional] [readonly] |
|**method** | **String** | The [REST](https://en.wikipedia.org/wiki/Representational_state_transfer) method required to request the related resource. |  [optional] [readonly] |
|**host** | **String** | The host of the related resource. |  [optional] [readonly] |
|**port** | [**PortEnum**](#PortEnum) | The port of the related resource. |  [optional] [readonly] |



## Enum: PortEnum

| Name | Value |
|---- | -----|
| NUMBER_MINUS_1 | new BigDecimal(&quot;-1&quot;) |



