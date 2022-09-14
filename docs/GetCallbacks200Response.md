

# GetCallbacks200Response

The callback object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | **String** | Provides the total number of records fetched. This attribute may return \&quot;No records found\&quot; when there are no callbacks available. |  [readonly] |
|**callbacks** | [**Set&lt;GetCallbacks200ResponseCallbacksInner&gt;**](GetCallbacks200ResponseCallbacksInner.md) | A list of callbacks |  [readonly] |
|**link** | [**List&lt;LinkInner&gt;**](LinkInner.md) | A [HATEOAS](https://en.wikipedia.org/wiki/HATEOAS) link object, describing all discoverable resources in relation to the original request. |  [readonly] |



