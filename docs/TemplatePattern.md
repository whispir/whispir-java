

# TemplatePattern

This object contains the responseTemplatePattern array, which contains each of the response rule elements. More details on the configuration of this object can be found below

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the response category. The same key is called &#x60;matchedCategory&#x60; when placed inside the &#x60;customParameters&#x60; of Callbacks payload |  |
|**pattern** | **String** | Specifies the mechanism for matching the textPrompt  The following options are available: - startsWith - contains - exactmatch  NOTE: none of them is case sensitive, so in the example above replying \&quot;YES\&quot; or \&quot;yes\&quot; or \&quot;Yes\&quot; makes no difference |  |
|**textPrompt** | **String** | Specifies the textual string that should be matched using the pattern (specified above) within the email, SMS or web response |  |
|**voicePrompt** | **String** | The character (2–9, * or #) that the recipient of the voice call should enter to select a response option  **IMPORTANT**: please do NOT use the key \&quot;1\&quot; because this is already reserved to repeat the message |  |
|**spokenVoicePrompt** | **String** | The text-to-speech content that is dynamically read out when describing to the user what a particular response option is |  |
|**colour** | **String** | The hexadecimal colour code that is used in the Message Response Report to differentiate the groups of responses |  |



