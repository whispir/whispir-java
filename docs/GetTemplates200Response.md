

# GetTemplates200Response

Returns a list of templates

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | **String** | Provides the total number of records fetched. This attribute may return \&quot;No records found\&quot; when there are no message templates available. |  [readonly] |
|**messagetemplates** | [**Set&lt;GetTemplates200ResponseMessagetemplatesInner&gt;**](GetTemplates200ResponseMessagetemplatesInner.md) | Specifies the name of the message template |  [readonly] |
|**link** | **List&lt;Object&gt;** | Provides a list of URLs that can be used to manipulate or access the message template. This following attribute may return an empty array. |  [readonly] |



