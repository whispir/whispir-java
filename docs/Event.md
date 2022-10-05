

# Event

The event object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Id of the event |  [optional] [readonly] |
|**eventLabel** | **String** | Specifies the name of the label used for the messages sent under this event. This needs to match with the name of the event templates available |  |
|**status** | [**StatusEnum**](#StatusEnum) | Specifies the status of the event. The status can be one of &lt;ul&gt;&lt;li&gt;Active&lt;/li&gt;&lt;li&gt;Resolved&lt;l&gt;&lt;/ul&gt;Note:The default status is Open. |  |
|**eventFormList** | [**List&lt;EventEventFormListInner&gt;**](EventEventFormListInner.md) | Event form list |  [optional] |
|**link** | [**List&lt;LinkInner&gt;**](LinkInner.md) | A [HATEOAS](https://en.wikipedia.org/wiki/HATEOAS) link object, describing all discoverable resources in relation to the original request. |  [optional] [readonly] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| OPEN | &quot;Open&quot; |
| ACTIVE | &quot;Active&quot; |
| RESOLVED | &quot;Resolved&quot; |



