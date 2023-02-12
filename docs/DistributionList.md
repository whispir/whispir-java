

# DistributionList

Static Distribution Lists are manually managed and maintained. They can include Contacts, Users and other Distribution Lists

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | ID of the distribution list  |  [optional] [readonly] |
|**mri** | **String** | Specifies the Message Resource Identifier of the Distribution List in Whispir |  [optional] [readonly] |
|**distlistdetails** | [**List&lt;DistributionListContacts&gt;**](DistributionListContacts.md) | Details of Contacts included in the Distribution List |  [optional] [readonly] |
|**link** | [**List&lt;Link&gt;**](Link.md) | A [HATEOAS](https://en.wikipedia.org/wiki/HATEOAS) link array, describing all discoverable resources in relation to the original request. |  [optional] [readonly] |
|**name** | **String** | Specifies the name of the distribution list. This has to be unique, and should not contain any special characters (except spaces) in it |  |
|**description** | **String** | Specifies a description for other users to see what this distribution list should be used for. |  [optional] |
|**memberCount** | **String** | Total number of contacts in a Distribution List |  [optional] |
|**access** | **String** | Allows you to specify the access type for this DL  - Open: anyone can subscribe to this distribution list via the Whispir Contact Portal - ByApproval: anyone can subscribe using the Whispir Contact Portal. However, they are not officially on the list until their access is approved - Restricted: the distribution list is not visible in the Whispir Contact Portal |  [optional] |
|**visibility** | **String** | Allows you to specify the visibility for this DL  - Public: Any user or active contact in any workspace can map themselves to this DL in the Whispir Contact Portal - Private: Only users or active contacts in the current workspace can map themselves to this DL |  [optional] |
|**contactIds** | **String** | Comma separated list of Contacts to be associated to this DL. This information can be provided at the time of the DL creation or updated later via a PUT request |  [optional] |
|**userIds** | **String** | Comma separated list of userIds who can manage this DL. This information can be provided at the time of the DL creation or also later updated via a PUT request |  [optional] |
|**distListIds** | **String** | Comma separated list of Distribution List IDs that can be nested under this DL. This information can be provided at the time of the DL creation or later updated via a PUT request |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Allows you to specify the type for this DL  - Static: The contacts on the list don’t change unless you manually add or remove them (unlike a dynamic DL)  NOTE: \&quot;static\&quot; is also the default value for this parameter when this field is omitted |  [optional] |
|**rules** | **String** | Present when &#x60;type&#x60; is &#x60;dynamic&#x60;.  The array that specify the rules that should be applied on the entityType values to pick the appropriate contacts at the moment of usage [not creation]  Each rule is an object with 3 keys in it. At least one rule must be specified when creating a Dynamic Distribution List  - ruleFilter: contains any of the contact profile elements that are available for searching. For example, division, department, role. More details on the values for this field can be found below [required] - ruleFilterActualName: Contains the matching string to be compared for the DL. More details on the the values for this field can be found below [required] - ruleContent: Contains the matching string to be compared with the contact element for being a part of the DL [required] |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| STATIC | &quot;static&quot; |
| DYNAMIC | &quot;dynamic&quot; |



