

# FeaturesPushOptionsFcm

The fcm object holds attributes specific to the contacts' Firebase-registered Android devices

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**androidChannelId** | **String** | Translates to the &lt;span style&#x3D;\&quot;color:red\&quot;&gt;*android_channel_id*&lt;/span&gt; attribute in FCM. Note: use this attribute for devices running Android versions 8 or later. |  [optional] |
|**sound** | **String** | The sound to play when the device receives the notification. The value *default* will play the system sound, otherwise this attribute must point to a sound resource bundled in the app, e.g. *_/res/raw/notification_sound.wav*  Note: This attribute can be used for devices running Android versions older than Android 8. For versions 8+ please use the *androidChannelId* |  [optional] |
|**action** | **String** | The action linked with a user click on the notification. Translates to the &lt;span style&#x3D;\&quot;color:red\&quot;&gt;*click_action*&lt;/span&gt; attribute in FCM. |  [optional] |
|**image** | **String** | The URL of an image to be downloaded and displayed in the notification.  Details of the Android support for images in push notifications can be found [here](https://firebase.google.com/docs/cloud-messaging/android/send-image) |  [optional] |



