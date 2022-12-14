

# MessageResponseSummaryMessageresponsesInner

First object if `view` is `summary`, second object if `view` is `detailed`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**percentageTotal** | **String** | Details the percentage of responses received for the sent message across all channels. |  |
|**responseCount** | **String** | Details the number of responses received for the sent message across all channels. |  |
|**link** | [**List&lt;LinkInner&gt;**](LinkInner.md) | A [HATEOAS](https://en.wikipedia.org/wiki/HATEOAS) link object, describing all discoverable resources in relation to the original request. |  [readonly] |
|**type** | [**TypeEnum**](#TypeEnum) | The message response category.  * &#x60;noresponse&#x60; - the message was sent but was not replied to * &#x60;notmatched&#x60; - the message was replied to and the answer didn&#39;t match any search criteria |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| NORESPONSE | &quot;noresponse&quot; |
| NOTMATCHED | &quot;notmatched&quot; |



