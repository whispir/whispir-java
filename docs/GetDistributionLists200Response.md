

# GetDistributionLists200Response

list of distribution lists

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**distributionLists** | [**List&lt;GetDistributionLists200ResponseDistributionListsInner&gt;**](GetDistributionLists200ResponseDistributionListsInner.md) | Either a static or dynamic distribution list |  [optional] |
|**status** | **String** | Provides the total number of records fetched. This attribute may return \&quot;No records found\&quot; when there are no callbacks available. |  [optional] [readonly] |
|**link** | [**List&lt;LinkInner&gt;**](LinkInner.md) | A [HATEOAS](https://en.wikipedia.org/wiki/HATEOAS) link object, describing all discoverable resources in relation to the original request. |  [optional] [readonly] |



