

# CallbackCallCollection

List of callback calls

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**link** | [**List&lt;Link&gt;**](Link.md) | A [HATEOAS](https://en.wikipedia.org/wiki/HATEOAS) link array, describing all discoverable resources in relation to the original request. |  [optional] [readonly] |
|**calls** | [**List&lt;CallbackCall&gt;**](CallbackCall.md) | A list of callbacks |  [optional] |
|**status** | **String** | Provides the total number of records fetched. This attribute may return \&quot;No records found\&quot; when there are no callbacks available. |  [optional] |



