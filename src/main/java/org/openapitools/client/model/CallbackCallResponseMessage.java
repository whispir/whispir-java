/*
 * Whispir Platform API
 * Whispir Platform API for cross channel and multi channel communications. Documentation on each endpoint is available at https://developers.whispir.com.
 *
 * The version of the OpenAPI document: 1.1.1
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
 * The details about this particular message that have been sent to the callback  IMPORTANT: Depending on the flow, you may only see  one of the acknowledged or undeliverable keys with timestamps as their value
 */
@ApiModel(description = "The details about this particular message that have been sent to the callback  IMPORTANT: Depending on the flow, you may only see  one of the acknowledged or undeliverable keys with timestamps as their value")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-22T09:15:03.121580Z[Etc/UTC]")
public class CallbackCallResponseMessage {
  /**
   * The channel that this message was sent on. Either SMS, email or voice
   */
  @JsonAdapter(ChannelEnum.Adapter.class)
  public enum ChannelEnum {
    SMS("sms"),
    
    EMAIL("email"),
    
    VOICE("voice"),
    
    N_A("N/A");

    private String value;

    ChannelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ChannelEnum fromValue(String value) {
      for (ChannelEnum b : ChannelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ChannelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ChannelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ChannelEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ChannelEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private ChannelEnum channel;

  public static final String SERIALIZED_NAME_ACKNOWLEDGED = "acknowledged";
  @SerializedName(SERIALIZED_NAME_ACKNOWLEDGED)
  private String acknowledged;

  public static final String SERIALIZED_NAME_UNDELIVERABLE = "undeliverable";
  @SerializedName(SERIALIZED_NAME_UNDELIVERABLE)
  private String undeliverable;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public CallbackCallResponseMessage() { 
  }

  
  public CallbackCallResponseMessage(
     ChannelEnum channel, 
     String acknowledged, 
     String undeliverable, 
     String content
  ) {
    this();
    this.channel = channel;
    this.acknowledged = acknowledged;
    this.undeliverable = undeliverable;
    this.content = content;
  }

   /**
   * The channel that this message was sent on. Either SMS, email or voice
   * @return channel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The channel that this message was sent on. Either SMS, email or voice")

  public ChannelEnum getChannel() {
    return channel;
  }




   /**
   * The date/time that this message was acknowledged
   * @return acknowledged
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "22/10/20 10:29", value = "The date/time that this message was acknowledged")

  public String getAcknowledged() {
    return acknowledged;
  }




   /**
   * The date/time that this message was marked as undeliverable
   * @return undeliverable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "22/10/20 10:29", value = "The date/time that this message was marked as undeliverable")

  public String getUndeliverable() {
    return undeliverable;
  }




   /**
   * The content of the message
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Delivered successfully to 61430430306 at 22/10/20 09:28", value = "The content of the message")

  public String getContent() {
    return content;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallbackCallResponseMessage callbackCallResponseMessage = (CallbackCallResponseMessage) o;
    return Objects.equals(this.channel, callbackCallResponseMessage.channel) &&
        Objects.equals(this.acknowledged, callbackCallResponseMessage.acknowledged) &&
        Objects.equals(this.undeliverable, callbackCallResponseMessage.undeliverable) &&
        Objects.equals(this.content, callbackCallResponseMessage.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channel, acknowledged, undeliverable, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallbackCallResponseMessage {\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    acknowledged: ").append(toIndentedString(acknowledged)).append("\n");
    sb.append("    undeliverable: ").append(toIndentedString(undeliverable)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
    openapiFields.add("channel");
    openapiFields.add("acknowledged");
    openapiFields.add("undeliverable");
    openapiFields.add("content");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CallbackCallResponseMessage
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CallbackCallResponseMessage.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CallbackCallResponseMessage is not found in the empty JSON string", CallbackCallResponseMessage.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CallbackCallResponseMessage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CallbackCallResponseMessage` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("channel") != null && !jsonObj.get("channel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel").toString()));
      }
      if (jsonObj.get("acknowledged") != null && !jsonObj.get("acknowledged").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `acknowledged` to be a primitive type in the JSON string but got `%s`", jsonObj.get("acknowledged").toString()));
      }
      if (jsonObj.get("undeliverable") != null && !jsonObj.get("undeliverable").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `undeliverable` to be a primitive type in the JSON string but got `%s`", jsonObj.get("undeliverable").toString()));
      }
      if (jsonObj.get("content") != null && !jsonObj.get("content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CallbackCallResponseMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CallbackCallResponseMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CallbackCallResponseMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CallbackCallResponseMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<CallbackCallResponseMessage>() {
           @Override
           public void write(JsonWriter out, CallbackCallResponseMessage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CallbackCallResponseMessage read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CallbackCallResponseMessage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CallbackCallResponseMessage
  * @throws IOException if the JSON string is invalid with respect to CallbackCallResponseMessage
  */
  public static CallbackCallResponseMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CallbackCallResponseMessage.class);
  }

 /**
  * Convert an instance of CallbackCallResponseMessage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

