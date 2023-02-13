package com.whispir.model;
import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.whispir.model.Attachments;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.whispir.client.ApiResponse;
import com.whispir.client.JSON;

/**
 * The voice channel payload, used when sending a Message.  Calls are charged in 30 seconds intervals (rounded up).  Text max length is 5000 characters.  The maximum payload size rule applies for the body, header and type usage.  &lt;!-- theme: info --&gt;  &gt; #### Requirements &gt; &gt; In order to use this functionality your account must be enabled to use the Voice module. If you&#39;re unsure whether you can use Voice, please contact the Whispir Support Team.  ---  ### Overview  Whispir’s API provides you with the ability to send a voice message to any landline phone or mobile phone around the world, both via text-to-speech and custom WAV files to be played over the phone  Whispir’s Voice module can easily connect all recipients to a single bridged call, simplifying your teleconferences and ensuring your message gets through  Each voice call is made up of three parts:  - Message introduction: Either Text-To-Speech (TTS) or a WAV file - Message acceptance: Asks the recipient to press a button or insert a PIN to hear the message - Message content: The concatenation of the message subject and message body. The latter can be either TTS or a WAV file. At the end the recipient will be given the possibility to acknowledge the message. &lt;!-- theme: info --&gt;  &gt; #### Adding pauses &gt; &gt; Pauses can be added to conference call details using the &#x60;+&#x60; character. Each &#x60;+&#x60; represents 1 second. Pauses allow some wait time to ensure the conference call service is ready to accept the account number and PIN.  ### WAV files requirements  WAV files can be used in place of Text-To-Speech to provide a custom &#x60;header&#x60; and &#x60;body&#x60;.  | Voice field    | attachmentDesc | | -------------- |--------------- | | header         | &#x60;\&quot;voiceintro.wav\&quot;&#x60; | | body           | &#x60;\&quot;voicebody.wav\&quot;&#x60; |  Before a WAV file can be used for the Voice module, it needs to conform to certain criteria:  - All the WAV files combined must not exceed 10 MB in total file size - All the WAV files must be a maximum of 8 bit, 8000 Hz, 1ch, 64 kbps - If a WAV file is outside these criteria please use TTS instead
 */

public class Voice {
  @SerializedName("docId")
  private String docId;
  @SerializedName("rawOutput")
  private String rawOutput;
  // Additional getters/setters
  /**
   * The identifier for the resource
   * 
   * @return docId
   **/
  public String getDocId() {
    return docId;
  }
  public void setDocId(String docId) {
    this.docId = docId;
  }
  public String getRawOutput() {
    return rawOutput;
  }
  public ApiResponse lastResponse;
  @SerializedName("footer")
  private String footer;

  @SerializedName("other")
  private String other;

  @SerializedName("header")
  private String header;

  @SerializedName("body")
  private String body;

  @SerializedName("type")
  private String type;

  @SerializedName("resources")
  private Attachments resources;

  public Voice() {
    super();
  }

  public Voice(
    String footer, 
    String other
  ) {
    this();
    this.footer = footer;
    this.other = other;
  }
   /**
   * Read-only property returned from the Whispir Platform. This property has no meaning to the API consumer.
   * @return footer
  **/
  @javax.annotation.Nullable
  public String getFooter() {
    return footer;
  }
   /**
   * Read-only property returned from the Whispir Platform. This property has no meaning to the API consumer.
   * @return other
  **/
  @javax.annotation.Nullable
  public String getOther() {
    return other;
  }

   /**
   * Introduction text played with the subject.
   * @return header
  **/
  @javax.annotation.Nullable
  public String getHeader() {
    return header;
  }
  public void setHeader(String header) {
    this.header = header;
  }

   /**
   * Body text, read out to the recipient after the subject and header.
   * @return body
  **/
  @javax.annotation.Nonnull
  public String getBody() {
    return body;
  }
  public void setBody(String body) {
    this.body = body;
  }

   /**
   * The conference call details of the voice message. Required when no conference call is being used. The minimum string to be used is specified in the example. Read the following section for information on each field.  The following parameters can be set by specifying the value after the &#x60;:&#x60; in the &#x60;type&#x60; string:  | Field         | Description | | ------------- |------------ | | Pin           | The access code required to be inserted from the recipient to hear the Voice message after the \&quot;header\&quot; is over. It can be left blank and then the user will be asked to proceed dialling \&quot;1\&quot;. &lt;br&gt;&lt;br&gt; For example, &#x60;7171&#x60;. &lt;br&gt;&lt;br&gt; If the right code is inserted then \&quot;subject\&quot; and \&quot;body\&quot; of the Voice Message will be reproduced. The user will be able to dial \&quot;1\&quot; to replay the message, \&quot;2\&quot; to join the conference call or \&quot;3\&quot; to receive the details to dial in later. &lt;br&gt;&lt;br&gt; In this last case the details - a Dial-In number and a PIN - will be repeated 3 times. | | ConfCall      | The teleconference line that will be used in the voice call. &lt;br&gt;&lt;br&gt; For example, &#x60;1800123123&#x60;. &lt;br&gt;&lt;br&gt; It is possible to reference this value in other channels using the **@@teleconf_number@@** custom variable. | | ConfAccountNo | The teleconference account or room number that is used in the voice call. &lt;br&gt;&lt;br&gt; For example, &#x60;098711234&#x60;. &lt;br&gt;&lt;br&gt; It is possible to reference this value in other channels using the **@@teleconf_account@@** custom variable. | | ConfPinNo     | The teleconference room PIN that is used in the voice call. &lt;br&gt;&lt;br&gt; For example, &#x60;8181&#x60;. &lt;br&gt;&lt;br&gt; It is possible to reference this value in other channels using the **@@teleconf_pin@@** custom variable. | | ConfModPinNo  | The teleconference moderator PIN that is used in the voice call. &lt;br&gt;&lt;br&gt; For example, &#x60;4242&#x60;. &lt;br&gt;&lt;br&gt; It is possible to reference this value in other channels using the **@@teleconf_mod_pin@@** custom variable. |
   * @return type
  **/
  @javax.annotation.Nonnull
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

   /**
   * Get resources
   * @return resources
  **/
  @javax.annotation.Nullable
  public Attachments getResources() {
    return resources;
  }
  public void setResources(Attachments resources) {
    this.resources = resources;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Voice voice = (Voice) o;
    return Objects.equals(this.footer, voice.footer) &&
        Objects.equals(this.other, voice.other) &&
        Objects.equals(this.header, voice.header) &&
        Objects.equals(this.body, voice.body) &&
        Objects.equals(this.type, voice.type) &&
        Objects.equals(this.resources, voice.resources);
  }
  @Override
  public int hashCode() {
    return Objects.hash(footer, other, header, body, type, resources);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Voice {\n");
    sb.append("    footer: ").append(toIndentedString(footer)).append("\n");
    sb.append("    other: ").append(toIndentedString(other)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("}");
    return sb.toString();
  }
  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Voice.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Voice' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Voice> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Voice.class));

       return (TypeAdapter<T>) new TypeAdapter<Voice>() {
           @Override
           public void write(JsonWriter out, Voice value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Voice read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Voice given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Voice
  * @throws IOException if the JSON string is invalid with respect to Voice
  */
  public static Voice fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Voice.class);
  }

 /**
  * Convert an instance of Voice to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

