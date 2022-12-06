

# DistributionListDynamic

Dynamic Distribution Lists are lists that are updated based on rules to automatically determine and update the members. For this reason - unlike the Static Distribution Lists - we don't need to specify any members because only the rule[s] will determine the members of a Dynamic Distribution List

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Specifies the name of the distribution list. This has to be unique, and should not contain any special characters (except spaces) in it |  |
|**description** | **String** | Specifies a description for other users to see what this distribution list should be used for. |  [optional] |
|**access** | **String** | Allows you to specify the access type for this DL  - Open: anyone can subscribe to this distribution list via the Whispir Contact Portal - ByApproval: anyone can subscribe using the Whispir Contact Portal. However, they are not officially on the list until their access is approved - Restricted: the distribution list is not visible in the Whispir Contact Portal |  |
|**type** | **String** | Allows you to specify the type for this DL  - Static: The contacts on the list don’t change unless you manually add or remove them (unlike a dynamic DL)  NOTE: \&quot;static\&quot; is also the default value for this parameter when this field is omitted |  |
|**entityType** | **String** | The value is currently strictly limited to \&quot;contact\&quot; |  |
|**visibility** | **String** | Allows you to specify the visibility for this DL  - Public: Any user or active contact in any workspace can map themselves to this DL in the Whispir Contact Portal - Private: Only users or active contacts in the current workspace can map themselves to this DL |  |
|**rules** | **String** | The array that specify the rules that should be applied on the entityType values to pick the appropriate contacts at the moment of usage [not creation]  Each rule is an object with 3 keys in it. At least one rule must be specified when creating a Dynamic Distribution List  - ruleFilter: contains any of the contact profile elements that are available for searching. For example, division, department, role. More details on the values for this field can be found below [required] - ruleFilterActualName: Contains the matching string to be compared for the DL. More details on the the values for this field can be found below [required] - ruleContent: Contains the matching string to be compared with the contact element for being a part of the DL [required] |  |
|**link** | [**List&lt;Link&gt;**](Link.md) | A [HATEOAS](https://en.wikipedia.org/wiki/HATEOAS) link object, describing all discoverable resources in relation to the original request. |  [optional] [readonly] |



