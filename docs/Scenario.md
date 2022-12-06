

# Scenario

Scenarios allows you to simplify the message delivery process through automated, one-click communications.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Specifies the name of the scenario |  |
|**description** | **String** | Specifies the description of the scenario |  |
|**allowedUsers** | [**AllowedUsersEnum**](#AllowedUsersEnum) | Specifies the usage permission - 1)EVERYONE 2)SELECTEDUSERS When SELECTEDUSERS is provided, then &#x60;allowedUserIds&#x60; shall contain the userID of the allowed users. |  [optional] |
|**allowedUserIds** | **String** | Specifies the comma separated list of users who can run this scenario.Only contains value when the allowedUsers is set to &#x60;SELECTEDUSERS&#x60; |  [optional] |
|**message** | [**Message**](Message.md) |  |  |
|**to** | **String** | Specifies the phone number or MRI or distribution list to which the message has to be sent |  [optional] |
|**subject** | **String** | Specifies the subject of the message |  [optional] |
|**label** | **String** | Specifies the label for the message (to view during reporting) |  [optional] |
|**email** | [**MessageEmail**](MessageEmail.md) |  |  [optional] |
|**voice** | [**MessageVoice**](MessageVoice.md) |  |  [optional] |
|**web** | [**MessageWeb**](MessageWeb.md) |  |  [optional] |
|**social** | [**MessageSocial**](MessageSocial.md) |  |  [optional] |



## Enum: AllowedUsersEnum

| Name | Value |
|---- | -----|
| EVERYONE | &quot;EVERYONE&quot; |
| SELECTEDUSERS | &quot;SELECTEDUSERS&quot; |



