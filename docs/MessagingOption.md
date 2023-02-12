

# MessagingOption

The object to configure message channel options.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**channel** | [**ChannelEnum**](#ChannelEnum) | The message channel. |  [optional] |
|**enabled** | **Boolean** | A boolean flag indicating whether messaging is enabled for the &#x60;channel&#x60;. |  [optional] |
|**primary** | [**PrimaryEnum**](#PrimaryEnum) | The primary contact address for the &#x60;channel&#x60;. |  [optional] |
|**secondary** | [**SecondaryEnum**](#SecondaryEnum) | The secondary contact address for the &#x60;channel&#x60;. |  [optional] |
|**tertiary** | [**TertiaryEnum**](#TertiaryEnum) | The tertiary contact address for the &#x60;channel&#x60;. |  [optional] |



## Enum: ChannelEnum

| Name | Value |
|---- | -----|
| SMS | &quot;sms&quot; |
| EMAIL | &quot;email&quot; |
| VOICE | &quot;voice&quot; |



## Enum: PrimaryEnum

| Name | Value |
|---- | -----|
| WORKMOBILEPHONE1 | &quot;WorkMobilePhone1&quot; |
| WORKMOBILEPHONE2 | &quot;WorkMobilePhone2&quot; |
| WORKEMAILADDRESS1 | &quot;WorkEmailAddress1&quot; |
| WORKEMAILADDRESS2 | &quot;WorkEmailAddress2&quot; |
| PERSONALMOBILEPHONE1 | &quot;PersonalMobilePhone1&quot; |
| PERSONALEMAILADDRESS1 | &quot;PersonalEmailAddress1&quot; |



## Enum: SecondaryEnum

| Name | Value |
|---- | -----|
| WORKMOBILEPHONE1 | &quot;WorkMobilePhone1&quot; |
| WORKMOBILEPHONE2 | &quot;WorkMobilePhone2&quot; |
| WORKEMAILADDRESS1 | &quot;WorkEmailAddress1&quot; |
| WORKEMAILADDRESS2 | &quot;WorkEmailAddress2&quot; |
| PERSONALMOBILEPHONE1 | &quot;PersonalMobilePhone1&quot; |
| PERSONALEMAILADDRESS1 | &quot;PersonalEmailAddress1&quot; |



## Enum: TertiaryEnum

| Name | Value |
|---- | -----|
| WORKMOBILEPHONE1 | &quot;WorkMobilePhone1&quot; |
| WORKMOBILEPHONE2 | &quot;WorkMobilePhone2&quot; |
| WORKEMAILADDRESS1 | &quot;WorkEmailAddress1&quot; |
| WORKEMAILADDRESS2 | &quot;WorkEmailAddress2&quot; |
| PERSONALMOBILEPHONE1 | &quot;PersonalMobilePhone1&quot; |
| PERSONALEMAILADDRESS1 | &quot;PersonalEmailAddress1&quot; |



