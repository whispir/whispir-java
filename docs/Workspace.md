

# Workspace

Workspaces allow application developers to create new work areas for the varying use cases of their application. For example they can be associated to the different business units of a company, so to silo the data of the different departments. In fact, the information, assets, contacts and actions performed in a workspace can’t be accessed from another one. This allows the applications to be independent and audited effectively with proper permissions and keys.  Each of these work areas provides different functionalities - such as creating messages, executing scenarios or viewing distribution lists - and can be governed by user permissions. Users can be assigned access to these workspaces to restrict the control of information as needed.  Every account on creation is given a default workspace called \"My Company\" but it is possible to create multiple workspaces suited for each application need. There is no limit on the number of workspaces.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Specifies the ID for the workspace that has been created |  [optional] [readonly] |
|**link** | [**List&lt;Link&gt;**](Link.md) | A [HATEOAS](https://en.wikipedia.org/wiki/HATEOAS) link array, describing all discoverable resources in relation to the original request. |  [optional] [readonly] |
|**projectName** | **String** | Specifies the name of the Workspace to be created. |  |
|**projectNumber** | **String** | Specifies the reference ID for the workspace from the User Side. Generally not used. Note:This is not the actual workspace ID. It is just a custom reference ID given by you for your own purposes. |  [optional] |
|**status** | **String** | Specifies the status of the Workspace being created. The status can be one of - 1) Active (A) 2)Disabled (D) |  |
|**billingcostcentre** | **String** | Only applicable to customers with the Billing Cost Centre Module enabled. Allows the user to set a billing cost centre for the Workspace. |  [optional] |



