

# Event

The event object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Id of the event |  [optional] [readonly] |
|**link** | [**List&lt;Link&gt;**](Link.md) | A [HATEOAS](https://en.wikipedia.org/wiki/HATEOAS) link array, describing all discoverable resources in relation to the original request. |  [optional] [readonly] |
|**eventLabel** | **String** | Specifies the name of the label used for the messages sent under this event. This needs to match with the name of the event templates available |  |
|**status** | [**StatusEnum**](#StatusEnum) | Specifies the status of the event. The status can be one of &lt;ul&gt;&lt;li&gt;Active&lt;/li&gt;&lt;li&gt;Resolved&lt;l&gt;&lt;/ul&gt;Note:The default status is Open. |  |
|**eventFormList** | [**List&lt;Form&gt;**](Form.md) | Event form list |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| OPEN | &quot;Open&quot; |
| ACTIVE | &quot;Active&quot; |
| RESOLVED | &quot;Resolved&quot; |



