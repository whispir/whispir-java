

# Resource

When you’re creating a resource, the following conditions apply:  - Maximum of 10 MB per file being uploaded - Transactions have an enforced timeout - Resources are available in the Whispir platform for a limited time [90 days]. After this time they are automatically cleaned. This is a configurable setting for Whispir Administrators

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The identifier for the resource. |  [optional] [readonly] |
|**name** | **String** | Specifies the name of the file being uploaded. The extension of the file too is allowed to be present in the name. |  |
|**scope** | [**ScopeEnum**](#ScopeEnum) | Specifies the permission scope of the file being uploaded. The scope defines the access restriction of the resource. It can only be one of the following:  - **public**: Public files have an addressable URL and are available publicly - **private**: Private files have no URL and are only available for bulk messaging purposes and for importing contacts |  |
|**mimeType** | **String** | The mime type of the file that is being uploaded. The type is dependent on the scope of the resource.  - **public**: Public files can be any mimetype, e.g. text/HTML or text/CSV - **private**: Private files are restricted to CSV, JSON and XML. The respective mimetypes to be used are text/csv, application/json, application/xml |  |
|**derefUri** | **String** | The base64 representation of the file being submitted. |  |
|**link** | [**List&lt;Link&gt;**](Link.md) | A [HATEOAS](https://en.wikipedia.org/wiki/HATEOAS) link object, describing all discoverable resources in relation to the original request. |  [optional] [readonly] |



## Enum: ScopeEnum

| Name | Value |
|---- | -----|
| PRIVATE | &quot;private&quot; |
| PUBLIC | &quot;public&quot; |



