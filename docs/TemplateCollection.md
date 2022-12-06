

# TemplateCollection

Returns a list of templates

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | **String** | Provides the total number of records fetched. This attribute may return \&quot;No records found\&quot; when there are no message templates available. |  [readonly] |
|**messagetemplates** | [**Set&lt;MessageTemplateShort&gt;**](MessageTemplateShort.md) | Specifies the name of the message template |  [readonly] |
|**link** | [**List&lt;Link&gt;**](Link.md) | A [HATEOAS](https://en.wikipedia.org/wiki/HATEOAS) link object, describing all discoverable resources in relation to the original request. |  [optional] [readonly] |



