/*
 * Whispir Platform API
 * Whispir Platform API for cross channel and multi channel communications. Documentation on each endpoint is available at https://developers.whispir.com.
 *
 * The version of the OpenAPI document: 1.0.0
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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.CallbackInstanceCallback;
import org.openapitools.client.model.CallbackInstanceFrom;
import org.openapitools.client.model.CallbackInstanceResponseMessage;
import org.openapitools.client.model.LinkInner;

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
 * A callback instance object
 */
@ApiModel(description = "A callback instance object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-14T10:37:13.711751+10:00[Australia/Melbourne]")
public class CallbackInstance {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_MESSAGE_ID = "messageId";
  @SerializedName(SERIALIZED_NAME_MESSAGE_ID)
  private String messageId;

  /**
   * The status of this particular callback attempt.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    SUCCESS("SUCCESS"),
    
    FAILED("FAILED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_MESSAGE_LOCATION = "messageLocation";
  @SerializedName(SERIALIZED_NAME_MESSAGE_LOCATION)
  private String messageLocation;

  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  private CallbackInstanceFrom from;

  public static final String SERIALIZED_NAME_RESPONSE_MESSAGE = "responseMessage";
  @SerializedName(SERIALIZED_NAME_RESPONSE_MESSAGE)
  private CallbackInstanceResponseMessage responseMessage;

  public static final String SERIALIZED_NAME_CALLBACK = "callback";
  @SerializedName(SERIALIZED_NAME_CALLBACK)
  private CallbackInstanceCallback callback;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private List<LinkInner> link = null;

  public CallbackInstance() { 
  }

  
  public CallbackInstance(
     String id, 
     String messageId, 
     StatusEnum status, 
     String messageLocation, 
     List<LinkInner> link
  ) {
    this();
    this.id = id;
    this.messageId = messageId;
    this.status = status;
    this.messageLocation = messageLocation;
    this.link = link;
  }

   /**
   * The unique ID of the specific call within Whispir
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "C96962B74DC57EF30F00E7097AC81A45", value = "The unique ID of the specific call within Whispir")

  public String getId() {
    return id;
  }




   /**
   * The unique ID of the message within Whispir
   * @return messageId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8D12688BFCC21BD51174C833F9BC9B9D", value = "The unique ID of the message within Whispir")

  public String getMessageId() {
    return messageId;
  }




   /**
   * The status of this particular callback attempt.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The status of this particular callback attempt.")

  public StatusEnum getStatus() {
    return status;
  }




   /**
   * The fully qualified URL to the original message within Whispir
   * @return messageLocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://api.au.whispir.com/messages/F4651CB151ACF0504FF09CB4D57922A5", value = "The fully qualified URL to the original message within Whispir")

  public String getMessageLocation() {
    return messageLocation;
  }




  public CallbackInstance from(CallbackInstanceFrom from) {
    
    this.from = from;
    return this;
  }

   /**
   * Get from
   * @return from
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CallbackInstanceFrom getFrom() {
    return from;
  }


  public void setFrom(CallbackInstanceFrom from) {
    this.from = from;
  }


  public CallbackInstance responseMessage(CallbackInstanceResponseMessage responseMessage) {
    
    this.responseMessage = responseMessage;
    return this;
  }

   /**
   * Get responseMessage
   * @return responseMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CallbackInstanceResponseMessage getResponseMessage() {
    return responseMessage;
  }


  public void setResponseMessage(CallbackInstanceResponseMessage responseMessage) {
    this.responseMessage = responseMessage;
  }


  public CallbackInstance callback(CallbackInstanceCallback callback) {
    
    this.callback = callback;
    return this;
  }

   /**
   * Get callback
   * @return callback
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CallbackInstanceCallback getCallback() {
    return callback;
  }


  public void setCallback(CallbackInstanceCallback callback) {
    this.callback = callback;
  }


   /**
   * A [HATEOAS](https://en.wikipedia.org/wiki/HATEOAS) link object, describing all discoverable resources in relation to the original request.
   * @return link
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A [HATEOAS](https://en.wikipedia.org/wiki/HATEOAS) link object, describing all discoverable resources in relation to the original request.")

  public List<LinkInner> getLink() {
    return link;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallbackInstance callbackInstance = (CallbackInstance) o;
    return Objects.equals(this.id, callbackInstance.id) &&
        Objects.equals(this.messageId, callbackInstance.messageId) &&
        Objects.equals(this.status, callbackInstance.status) &&
        Objects.equals(this.messageLocation, callbackInstance.messageLocation) &&
        Objects.equals(this.from, callbackInstance.from) &&
        Objects.equals(this.responseMessage, callbackInstance.responseMessage) &&
        Objects.equals(this.callback, callbackInstance.callback) &&
        Objects.equals(this.link, callbackInstance.link);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, messageId, status, messageLocation, from, responseMessage, callback, link);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallbackInstance {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    messageLocation: ").append(toIndentedString(messageLocation)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    responseMessage: ").append(toIndentedString(responseMessage)).append("\n");
    sb.append("    callback: ").append(toIndentedString(callback)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("messageId");
    openapiFields.add("status");
    openapiFields.add("messageLocation");
    openapiFields.add("from");
    openapiFields.add("responseMessage");
    openapiFields.add("callback");
    openapiFields.add("link");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CallbackInstance
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CallbackInstance.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CallbackInstance is not found in the empty JSON string", CallbackInstance.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CallbackInstance.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CallbackInstance` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("messageId") != null && !jsonObj.get("messageId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `messageId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("messageId").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("messageLocation") != null && !jsonObj.get("messageLocation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `messageLocation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("messageLocation").toString()));
      }
      // validate the optional field `from`
      if (jsonObj.getAsJsonObject("from") != null) {
        CallbackInstanceFrom.validateJsonObject(jsonObj.getAsJsonObject("from"));
      }
      // validate the optional field `responseMessage`
      if (jsonObj.getAsJsonObject("responseMessage") != null) {
        CallbackInstanceResponseMessage.validateJsonObject(jsonObj.getAsJsonObject("responseMessage"));
      }
      // validate the optional field `callback`
      if (jsonObj.getAsJsonObject("callback") != null) {
        CallbackInstanceCallback.validateJsonObject(jsonObj.getAsJsonObject("callback"));
      }
      JsonArray jsonArraylink = jsonObj.getAsJsonArray("link");
      if (jsonArraylink != null) {
        // ensure the json data is an array
        if (!jsonObj.get("link").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `link` to be an array in the JSON string but got `%s`", jsonObj.get("link").toString()));
        }

        // validate the optional field `link` (array)
        for (int i = 0; i < jsonArraylink.size(); i++) {
          LinkInner.validateJsonObject(jsonArraylink.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CallbackInstance.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CallbackInstance' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CallbackInstance> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CallbackInstance.class));

       return (TypeAdapter<T>) new TypeAdapter<CallbackInstance>() {
           @Override
           public void write(JsonWriter out, CallbackInstance value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CallbackInstance read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CallbackInstance given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CallbackInstance
  * @throws IOException if the JSON string is invalid with respect to CallbackInstance
  */
  public static CallbackInstance fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CallbackInstance.class);
  }

 /**
  * Convert an instance of CallbackInstance to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

