

# PushOptions

The object defining options for push messages.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**notifications** | [**NotificationsEnum**](#NotificationsEnum) | A flag indicating whether notifications should be enabled for message replies. |  [optional] |
|**escalationMins** | **String** | The number of minutes to wait for a reply until escalating to the next contact. |  [optional] |
|**appId** | **String** | The identifier for the registered application. |  |
|**priority** | [**PriorityEnum**](#PriorityEnum) | The priority of the notification.   NORMAL (the default value) will indicate to FCM/APNS to take into consideration the target device&#39;s battery consumption at the expense of delivering the message with a delay.   The value NORMAL maps to priority *NORMAL* in FCM and priority *5* in APNS.   The value HIGH maps to priority *HIGH* in FCM and *10* in APNS. |  [optional] |
|**fcm** | [**Fcm**](Fcm.md) |  |  [optional] |
|**apns** | [**Apns**](Apns.md) |  |  [optional] |
|**data** | **Object** | Custom key-value pairs of the notification&#39;s payload. These values can be used by the target app for enhanced functionality provided that it has been designed to handle them (images, videos, links etc).  These attributes translate to &lt;span style&#x3D;\&quot;color:red\&quot;&gt;*data*&lt;/span&gt;  in the FCM payload.  For APNS, the custom attributes of *data* are inserted as custom properties outside of the &lt;span style&#x3D;\&quot;color:red\&quot;&gt;*aps*&lt;/span&gt; payload. |  [optional] |



## Enum: NotificationsEnum

| Name | Value |
|---- | -----|
| ENABLED | &quot;enabled&quot; |
| DISABLED | &quot;disabled&quot; |



## Enum: PriorityEnum

| Name | Value |
|---- | -----|
| NORMAL | &quot;NORMAL&quot; |
| HIGH | &quot;HIGH&quot; |



