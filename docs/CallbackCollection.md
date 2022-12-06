

# CallbackCollection

List of callbacks

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | **String** | Provides the total number of records fetched. This attribute may return \&quot;No records found\&quot; when there are no callbacks available. |  [optional] [readonly] |
|**callbacks** | [**Set&lt;CallbackShort&gt;**](CallbackShort.md) | A list of callbacks |  [optional] [readonly] |
|**link** | [**List&lt;Link&gt;**](Link.md) | A [HATEOAS](https://en.wikipedia.org/wiki/HATEOAS) link object, describing all discoverable resources in relation to the original request. |  [optional] [readonly] |



