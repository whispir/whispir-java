

# VoiceResources

Provides a configuration object for specifying custom audio for the voice header and body.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attachment** | [**List&lt;Attachment&gt;**](Attachment.md) | The header and body attachments containing WAV files. Read the following section for configuring each voice field attachment:  In addition to the parameters already specified for the TTS Voice calls, each attached WAV file must have the &#x60;attachmentDesc&#x60; named these specific values, to override the TTS voice:  | Voice field    | attachmentDesc | | -------------- |--------------- | | header         | &#x60;\&quot;voiceintro.wav\&quot;&#x60; | | body           | &#x60;\&quot;voicebody.wav\&quot;&#x60; | |  [optional] |



