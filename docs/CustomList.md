

# CustomList

A custom list is a predefined list of options that can be inserted into a message or template. A list might be made up of capital city names, days of the week, incident types, business phone numbers and so on. Custom lists make it easy to add information quickly and consistently to your message content.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Specifies the unique ID of the list |  [optional] [readonly] |
|**name** | **String** | Specifies the name of the list |  [optional] [readonly] |
|**type** | [**TypeEnum**](#TypeEnum) | Specifies the type |  [optional] [readonly] |
|**createdDate** | **String** | Specifies the creation date of the list |  [optional] [readonly] |
|**sortType** | [**SortTypeEnum**](#SortTypeEnum) | Specifies the sorting order |  [optional] [readonly] |
|**linked** | [**LinkedEnum**](#LinkedEnum) | Specifies the linked status. When enabled the value selected for one channel is automatically applied on the other channels. |  [optional] [readonly] |
|**customlabellists** | [**List&lt;CustomListItem&gt;**](CustomListItem.md) | Contains the individual items that make up this list |  [optional] [readonly] |
|**link** | [**List&lt;Link&gt;**](Link.md) | A [HATEOAS](https://en.wikipedia.org/wiki/HATEOAS) link object, describing all discoverable resources in relation to the original request. |  [optional] [readonly] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| INCIDENT | &quot;INCIDENT&quot; |
| MESSAGE | &quot;MESSAGE&quot; |
| CONTACT | &quot;CONTACT&quot; |
| RSS | &quot;RSS&quot; |



## Enum: SortTypeEnum

| Name | Value |
|---- | -----|
| AS_DISPLAYED | &quot;As Displayed&quot; |
| ASCENDING | &quot;Ascending&quot; |
| DESCENDING | &quot;Descending&quot; |



## Enum: LinkedEnum

| Name | Value |
|---- | -----|
| DISABLED | &quot;disabled&quot; |
| ENABLED | &quot;enabled&quot; |



