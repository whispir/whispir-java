/*
 * Whispir Platform API
 * Whispir Platform API for cross channel and multi channel communications. Documentation on each endpoint is available at https://developers.whispir.com.
 *
 * The version of the OpenAPI document: 1.0.4
 * Contact: support@whispir.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.client.model.VoiceResources;

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
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import whispir_sdk_java.JSON;

/**
 * The voice channel payload, used when sending a Message.  Calls are charged in 30 seconds intervals (rounded up).  Text max length is 5000 characters.  The maximum payload size rule applies for the body, header and type usage.  &lt;!-- theme: info --&gt;  &gt; #### Requirements &gt; &gt; In order to use this functionality your account must be enabled to use the Voice module. If you&#39;re unsure whether you can use Voice, please contact the Whispir Support Team.  ---  ### Overview  Whispir’s API provides you with the ability to send a voice message to any landline phone or mobile phone around the world, both via text-to-speech and custom WAV files to be played over the phone  Whispir’s Voice module can easily connect all recipients to a single bridged call, simplifying your teleconferences and ensuring your message gets through  Each voice call is made up of three parts:  - Message introduction: Either Text-To-Speech (TTS) or a WAV file - Message acceptance: Asks the recipient to press a button or insert a PIN to hear the message - Message content: The concatenation of the message subject and message body. The latter can be either TTS or a WAV file. At the end the recipient will be given the possibility to acknowledge the message. &lt;!-- theme: info --&gt;  &gt; #### Adding pauses &gt; &gt; Pauses can be added to conference call details using the &#x60;+&#x60; character. Each &#x60;+&#x60; represents 1 second. Pauses allow some wait time to ensure the conference call service is ready to accept the account number and PIN.  ### WAV files requirements  WAV files can be used in place of Text-To-Speech to provide a custom &#x60;header&#x60; and &#x60;body&#x60;.  Before a WAV file can be used for the Voice module, it needs to conform to certain criteria:  - All the WAV files combined must not exceed 10 MB in total file size - All the WAV files must be a maximum of 8 bit, 8000 Hz, 1ch, 64 kbps - If a WAV file is outside these criteria please use TTS instead
 */
@ApiModel(description = "The voice channel payload, used when sending a Message.  Calls are charged in 30 seconds intervals (rounded up).  Text max length is 5000 characters.  The maximum payload size rule applies for the body, header and type usage.  <!-- theme: info -->  > #### Requirements > > In order to use this functionality your account must be enabled to use the Voice module. If you're unsure whether you can use Voice, please contact the Whispir Support Team.  ---  ### Overview  Whispir’s API provides you with the ability to send a voice message to any landline phone or mobile phone around the world, both via text-to-speech and custom WAV files to be played over the phone  Whispir’s Voice module can easily connect all recipients to a single bridged call, simplifying your teleconferences and ensuring your message gets through  Each voice call is made up of three parts:  - Message introduction: Either Text-To-Speech (TTS) or a WAV file - Message acceptance: Asks the recipient to press a button or insert a PIN to hear the message - Message content: The concatenation of the message subject and message body. The latter can be either TTS or a WAV file. At the end the recipient will be given the possibility to acknowledge the message. <!-- theme: info -->  > #### Adding pauses > > Pauses can be added to conference call details using the `+` character. Each `+` represents 1 second. Pauses allow some wait time to ensure the conference call service is ready to accept the account number and PIN.  ### WAV files requirements  WAV files can be used in place of Text-To-Speech to provide a custom `header` and `body`.  Before a WAV file can be used for the Voice module, it needs to conform to certain criteria:  - All the WAV files combined must not exceed 10 MB in total file size - All the WAV files must be a maximum of 8 bit, 8000 Hz, 1ch, 64 kbps - If a WAV file is outside these criteria please use TTS instead")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-08T00:42:12.980940Z[Etc/UTC]")
public class Voice {
  public static final String SERIALIZED_NAME_HEADER = "header";
  @SerializedName(SERIALIZED_NAME_HEADER)
  private String header;

  public static final String SERIALIZED_NAME_BODY = "body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private String body;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type = "Pin:,ConfCall:,ConfAccountNo:,ConfPinNo:,ConfModPinNo:";

  /**
   * Read-only property returned from the Whispir Platform. This property has no meaning to the API consumer.
   */
  @JsonAdapter(FooterEnum.Adapter.class)
  public enum FooterEnum {
    EMPTY("");

    private String value;

    FooterEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FooterEnum fromValue(String value) {
      for (FooterEnum b : FooterEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FooterEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FooterEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FooterEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FooterEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FOOTER = "footer";
  @SerializedName(SERIALIZED_NAME_FOOTER)
  private FooterEnum footer;

  /**
   * Read-only property returned from the Whispir Platform. This property has no meaning to the API consumer.
   */
  @JsonAdapter(OtherEnum.Adapter.class)
  public enum OtherEnum {
    EMPTY("");

    private String value;

    OtherEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OtherEnum fromValue(String value) {
      for (OtherEnum b : OtherEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OtherEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OtherEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OtherEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OtherEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_OTHER = "other";
  @SerializedName(SERIALIZED_NAME_OTHER)
  private OtherEnum other;

  public static final String SERIALIZED_NAME_RESOURCES = "resources";
  @SerializedName(SERIALIZED_NAME_RESOURCES)
  private VoiceResources resources;

  public Voice() { 
  }

  
  public Voice(
     FooterEnum footer, 
     OtherEnum other
  ) {
    this();
    this.footer = footer;
    this.other = other;
  }

  public Voice header(String header) {
    
    this.header = header;
    return this;
  }

   /**
   * Introduction text played with the subject.
   * @return header
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "This is the introduction, read out to the recipient prior to any key press.", value = "Introduction text played with the subject.")

  public String getHeader() {
    return header;
  }


  public void setHeader(String header) {
    this.header = header;
  }


  public Voice body(String body) {
    
    this.body = body;
    return this;
  }

   /**
   * Body text, read out to the recipient after the subject and header.
   * @return body
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "This is the body of the voice call, read out after the key press", required = true, value = "Body text, read out to the recipient after the subject and header.")

  public String getBody() {
    return body;
  }


  public void setBody(String body) {
    this.body = body;
  }


  public Voice type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The conference call details of the voice message. Required when no conference call is being used. The minimum string to be used is specified in the example. Read the following section for information on each field.  The following parameters can be set by specifying the value after the &#x60;:&#x60; in the &#x60;type&#x60; string:  | Field         | Description | | ------------- |------------ | | Pin           | The access code required to be inserted from the recipient to hear the Voice message after the \&quot;header\&quot; is over. It can be left blank and then the user will be asked to proceed dialling \&quot;1\&quot;. &lt;br&gt;&lt;br&gt; For example, &#x60;7171&#x60;. &lt;br&gt;&lt;br&gt; If the right code is inserted then \&quot;subject\&quot; and \&quot;body\&quot; of the Voice Message will be reproduced. The user will be able to dial \&quot;1\&quot; to replay the message, \&quot;2\&quot; to join the conference call or \&quot;3\&quot; to receive the details to dial in later. &lt;br&gt;&lt;br&gt; In this last case the details - a Dial-In number and a PIN - will be repeated 3 times. | | ConfCall      | The teleconference line that will be used in the voice call. &lt;br&gt;&lt;br&gt; For example, &#x60;1800123123&#x60;. &lt;br&gt;&lt;br&gt; It is possible to reference this value in other channels using the **@@teleconf_number@@** custom variable. | | ConfAccountNo | The teleconference account or room number that is used in the voice call. &lt;br&gt;&lt;br&gt; For example, &#x60;098711234&#x60;. &lt;br&gt;&lt;br&gt; It is possible to reference this value in other channels using the **@@teleconf_account@@** custom variable. | | ConfPinNo     | The teleconference room PIN that is used in the voice call. &lt;br&gt;&lt;br&gt; For example, &#x60;8181&#x60;. &lt;br&gt;&lt;br&gt; It is possible to reference this value in other channels using the **@@teleconf_pin@@** custom variable. | | ConfModPinNo  | The teleconference moderator PIN that is used in the voice call. &lt;br&gt;&lt;br&gt; For example, &#x60;4242&#x60;. &lt;br&gt;&lt;br&gt; It is possible to reference this value in other channels using the **@@teleconf_mod_pin@@** custom variable. |
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Pin:7171,ConfCall:1800123123,ConfAccountNo:098711234,ConfPinNo:8181,ConfModPinNo:4242", required = true, value = "The conference call details of the voice message. Required when no conference call is being used. The minimum string to be used is specified in the example. Read the following section for information on each field.  The following parameters can be set by specifying the value after the `:` in the `type` string:  | Field         | Description | | ------------- |------------ | | Pin           | The access code required to be inserted from the recipient to hear the Voice message after the \"header\" is over. It can be left blank and then the user will be asked to proceed dialling \"1\". <br><br> For example, `7171`. <br><br> If the right code is inserted then \"subject\" and \"body\" of the Voice Message will be reproduced. The user will be able to dial \"1\" to replay the message, \"2\" to join the conference call or \"3\" to receive the details to dial in later. <br><br> In this last case the details - a Dial-In number and a PIN - will be repeated 3 times. | | ConfCall      | The teleconference line that will be used in the voice call. <br><br> For example, `1800123123`. <br><br> It is possible to reference this value in other channels using the **@@teleconf_number@@** custom variable. | | ConfAccountNo | The teleconference account or room number that is used in the voice call. <br><br> For example, `098711234`. <br><br> It is possible to reference this value in other channels using the **@@teleconf_account@@** custom variable. | | ConfPinNo     | The teleconference room PIN that is used in the voice call. <br><br> For example, `8181`. <br><br> It is possible to reference this value in other channels using the **@@teleconf_pin@@** custom variable. | | ConfModPinNo  | The teleconference moderator PIN that is used in the voice call. <br><br> For example, `4242`. <br><br> It is possible to reference this value in other channels using the **@@teleconf_mod_pin@@** custom variable. |")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


   /**
   * Read-only property returned from the Whispir Platform. This property has no meaning to the API consumer.
   * @return footer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Read-only property returned from the Whispir Platform. This property has no meaning to the API consumer.")

  public FooterEnum getFooter() {
    return footer;
  }




   /**
   * Read-only property returned from the Whispir Platform. This property has no meaning to the API consumer.
   * @return other
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Read-only property returned from the Whispir Platform. This property has no meaning to the API consumer.")

  public OtherEnum getOther() {
    return other;
  }




  public Voice resources(VoiceResources resources) {
    
    this.resources = resources;
    return this;
  }

   /**
   * Get resources
   * @return resources
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoiceResources getResources() {
    return resources;
  }


  public void setResources(VoiceResources resources) {
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
    return Objects.equals(this.header, voice.header) &&
        Objects.equals(this.body, voice.body) &&
        Objects.equals(this.type, voice.type) &&
        Objects.equals(this.footer, voice.footer) &&
        Objects.equals(this.other, voice.other) &&
        Objects.equals(this.resources, voice.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(header, body, type, footer, other, resources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Voice {\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    footer: ").append(toIndentedString(footer)).append("\n");
    sb.append("    other: ").append(toIndentedString(other)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("header");
    openapiFields.add("body");
    openapiFields.add("type");
    openapiFields.add("footer");
    openapiFields.add("other");
    openapiFields.add("resources");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("body");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Voice
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Voice.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Voice is not found in the empty JSON string", Voice.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Voice.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Voice` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Voice.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("header") != null && !jsonObj.get("header").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `header` to be a primitive type in the JSON string but got `%s`", jsonObj.get("header").toString()));
      }
      if (jsonObj.get("body") != null && !jsonObj.get("body").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `body` to be a primitive type in the JSON string but got `%s`", jsonObj.get("body").toString()));
      }
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (jsonObj.get("footer") != null && !jsonObj.get("footer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `footer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("footer").toString()));
      }
      if (jsonObj.get("other") != null && !jsonObj.get("other").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `other` to be a primitive type in the JSON string but got `%s`", jsonObj.get("other").toString()));
      }
      // validate the optional field `resources`
      if (jsonObj.getAsJsonObject("resources") != null) {
        VoiceResources.validateJsonObject(jsonObj.getAsJsonObject("resources"));
      }
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
             validateJsonObject(jsonObj);
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

