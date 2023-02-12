

# Activity

Activities are all the individual changes, tasks, calls, messages and so on performed in a given company workspace.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**link** | [**List&lt;Link&gt;**](Link.md) | A [HATEOAS](https://en.wikipedia.org/wiki/HATEOAS) link array, describing all discoverable resources in relation to the original request. |  [optional] [readonly] |
|**user** | **String** |  The username of the person who performed this activity. This will usually be the API user invoking the creation. |  [optional] |
|**time** | **String** | The date and time of the activity in the format:dd/mm/yy hh:mm. This will be defaulted to the time at which this activity is created. |  [optional] |
|**action** | [**ActionEnum**](#ActionEnum) | Specifies the action performed during this activity. |  [optional] |
|**description** | **String** | The description of the activity. This is a free text that details about the activity. |  [optional] |
|**status** | **String** | Specifies the status of the activity. |  [optional] |
|**module** | [**ModuleEnum**](#ModuleEnum) | Specifies the module to which this activity belongs to. |  [optional] |
|**workspaceName** | **String** | The workspace in which this activity is performed. This will usually be the API user’s default workspace |  [optional] |
|**fullname** | **String** | Fullname of the user |  [optional] |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| CREATE | &quot;Create&quot; |
| UPDATE | &quot;Update&quot; |
| MOVE | &quot;Move&quot; |
| COPY | &quot;Copy&quot; |
| DRAFT | &quot;Draft&quot; |
| SEND | &quot;Send&quot; |
| MODIFIED | &quot;Modified&quot; |
| DELETE | &quot;Delete&quot; |
| CONTACT_IMPORT_FILE | &quot;Contact Import File&quot; |
| LOGIN | &quot;Login&quot; |
| APPROVE | &quot;Approve&quot; |
| REJECT | &quot;Reject&quot; |
| DISPATCH | &quot;Dispatch&quot; |
| REGISTER | &quot;Register&quot; |
| ACCEPT | &quot;Accept&quot; |
| CLOSED | &quot;Closed&quot; |
| MAP | &quot;Map&quot; |
| UN_MAP | &quot;Un-map&quot; |
| LOGOUT | &quot;Logout&quot; |



## Enum: ModuleEnum

| Name | Value |
|---- | -----|
| SYSTEM | &quot;System&quot; |
| MESSAGE | &quot;Message&quot; |
| SCHEDULED_MESSAGE | &quot;Scheduled Message&quot; |
| USER | &quot;User&quot; |
| CONTACT | &quot;Contact&quot; |
| DISTRIBUTION_LIST | &quot;Distribution List&quot; |
| TEMPLATE | &quot;Template&quot; |
| WORKSPACE | &quot;Workspace&quot; |
| EVENT | &quot;Event&quot; |
| WEBSERVICE | &quot;WebService&quot; |
| SETTINGS | &quot;Settings&quot; |
| CONVERSATION | &quot;Conversation&quot; |
| GATEWAY | &quot;Gateway&quot; |
| WORKSPACE_MAPPING | &quot;Workspace Mapping&quot; |
| FOLDERS | &quot;Folders&quot; |
| TEAM | &quot;Team&quot; |
| RSS | &quot;RSS&quot; |
| API_MAPPING | &quot;API Mapping&quot; |
| ASSET | &quot;Asset&quot; |
| INSTRUCTION | &quot;Instruction&quot; |



