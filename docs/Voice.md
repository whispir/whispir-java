

# Voice

The voice channel payload, used when sending a Message.  Calls are charged in 30 seconds intervals (rounded up).  Text max length is 5000 characters.  The maximum payload size rule applies for the body, header and type usage.  <!-- theme: info -->  > #### Requirements > > In order to use this functionality your account must be enabled to use the Voice module. If you're unsure whether you can use Voice, please contact the Whispir Support Team.  ---  ### Overview  Whispir’s API provides you with the ability to send a voice message to any landline phone or mobile phone around the world, both via text-to-speech and custom WAV files to be played over the phone  Whispir’s Voice module can easily connect all recipients to a single bridged call, simplifying your teleconferences and ensuring your message gets through  Each voice call is made up of three parts:  - Message introduction: Either Text-To-Speech (TTS) or a WAV file - Message acceptance: Asks the recipient to press a button or insert a PIN to hear the message - Message content: The concatenation of the message subject and message body. The latter can be either TTS or a WAV file. At the end the recipient will be given the possibility to acknowledge the message. <!-- theme: info -->  > #### Adding pauses > > Pauses can be added to conference call details using the `+` character. Each `+` represents 1 second. Pauses allow some wait time to ensure the conference call service is ready to accept the account number and PIN.  ### WAV files requirements  WAV files can be used in place of Text-To-Speech to provide a custom `header` and `body`.  Before a WAV file can be used for the Voice module, it needs to conform to certain criteria:  - All the WAV files combined must not exceed 10 MB in total file size - All the WAV files must be a maximum of 8 bit, 8000 Hz, 1ch, 64 kbps - If a WAV file is outside these criteria please use TTS instead

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**header** | **String** | Introduction text played with the subject. |  [optional] |
|**body** | **String** | Body text, read out to the recipient after the subject and header. |  |
|**type** | **String** | The conference call details of the voice message. Required when no conference call is being used. The minimum string to be used is specified in the example. Read the following section for information on each field.  The following parameters can be set by specifying the value after the &#x60;:&#x60; in the &#x60;type&#x60; string:  | Field         | Description | | ------------- |------------ | | Pin           | The access code required to be inserted from the recipient to hear the Voice message after the \&quot;header\&quot; is over. It can be left blank and then the user will be asked to proceed dialling \&quot;1\&quot;. &lt;br&gt;&lt;br&gt; For example, &#x60;7171&#x60;. &lt;br&gt;&lt;br&gt; If the right code is inserted then \&quot;subject\&quot; and \&quot;body\&quot; of the Voice Message will be reproduced. The user will be able to dial \&quot;1\&quot; to replay the message, \&quot;2\&quot; to join the conference call or \&quot;3\&quot; to receive the details to dial in later. &lt;br&gt;&lt;br&gt; In this last case the details - a Dial-In number and a PIN - will be repeated 3 times. | | ConfCall      | The teleconference line that will be used in the voice call. &lt;br&gt;&lt;br&gt; For example, &#x60;1800123123&#x60;. &lt;br&gt;&lt;br&gt; It is possible to reference this value in other channels using the **@@teleconf_number@@** custom variable. | | ConfAccountNo | The teleconference account or room number that is used in the voice call. &lt;br&gt;&lt;br&gt; For example, &#x60;098711234&#x60;. &lt;br&gt;&lt;br&gt; It is possible to reference this value in other channels using the **@@teleconf_account@@** custom variable. | | ConfPinNo     | The teleconference room PIN that is used in the voice call. &lt;br&gt;&lt;br&gt; For example, &#x60;8181&#x60;. &lt;br&gt;&lt;br&gt; It is possible to reference this value in other channels using the **@@teleconf_pin@@** custom variable. | | ConfModPinNo  | The teleconference moderator PIN that is used in the voice call. &lt;br&gt;&lt;br&gt; For example, &#x60;4242&#x60;. &lt;br&gt;&lt;br&gt; It is possible to reference this value in other channels using the **@@teleconf_mod_pin@@** custom variable. | |  |
|**footer** | [**FooterEnum**](#FooterEnum) | Read-only property returned from the Whispir Platform. This property has no meaning to the API consumer. |  [optional] [readonly] |
|**other** | [**OtherEnum**](#OtherEnum) | Read-only property returned from the Whispir Platform. This property has no meaning to the API consumer. |  [optional] [readonly] |
|**resources** | [**VoiceResources**](VoiceResources.md) |  |  [optional] |



## Enum: FooterEnum

| Name | Value |
|---- | -----|
| EMPTY | &quot;&quot; |



## Enum: OtherEnum

| Name | Value |
|---- | -----|
| EMPTY | &quot;&quot; |



