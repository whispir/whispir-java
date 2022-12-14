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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.openapitools.client.model.LinkInner;
import org.openapitools.client.model.MessageStatusMessageStatusesInner;

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
 * The message status object, describing the delivery of the sent message.
 */
@ApiModel(description = "The message status object, describing the delivery of the sent message.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-14T10:37:13.711751+10:00[Australia/Melbourne]")
public class MessageStatus {
  public static final String SERIALIZED_NAME_MESSAGE_STATUSES = "messageStatuses";
  @SerializedName(SERIALIZED_NAME_MESSAGE_STATUSES)
  private Set<MessageStatusMessageStatusesInner> messageStatuses = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private List<LinkInner> link = new ArrayList<>();

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public MessageStatus() { 
  }

  
  public MessageStatus(
     List<LinkInner> link
  ) {
    this();
    this.link = link;
  }

  public MessageStatus messageStatuses(Set<MessageStatusMessageStatusesInner> messageStatuses) {
    
    this.messageStatuses = messageStatuses;
    return this;
  }

  public MessageStatus addMessageStatusesItem(MessageStatusMessageStatusesInner messageStatusesItem) {
    this.messageStatuses.add(messageStatusesItem);
    return this;
  }

   /**
   * The object defining the message delivery status.
   * @return messageStatuses
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The object defining the message delivery status.")

  public Set<MessageStatusMessageStatusesInner> getMessageStatuses() {
    return messageStatuses;
  }


  public void setMessageStatuses(Set<MessageStatusMessageStatusesInner> messageStatuses) {
    this.messageStatuses = messageStatuses;
  }


   /**
   * A [HATEOAS](https://en.wikipedia.org/wiki/HATEOAS) link object, describing all discoverable resources in relation to the original request.
   * @return link
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A [HATEOAS](https://en.wikipedia.org/wiki/HATEOAS) link object, describing all discoverable resources in relation to the original request.")

  public List<LinkInner> getLink() {
    return link;
  }




  public MessageStatus status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Present when &#x60;view&#x60; is &#x60;detailed&#x60;.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1 to 1 of 1    ", value = "Present when `view` is `detailed`.")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageStatus messageStatus = (MessageStatus) o;
    return Objects.equals(this.messageStatuses, messageStatus.messageStatuses) &&
        Objects.equals(this.link, messageStatus.link) &&
        Objects.equals(this.status, messageStatus.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageStatuses, link, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageStatus {\n");
    sb.append("    messageStatuses: ").append(toIndentedString(messageStatuses)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("messageStatuses");
    openapiFields.add("link");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("messageStatuses");
    openapiRequiredFields.add("link");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MessageStatus
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (MessageStatus.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in MessageStatus is not found in the empty JSON string", MessageStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MessageStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MessageStatus` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MessageStatus.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      JsonArray jsonArraymessageStatuses = jsonObj.getAsJsonArray("messageStatuses");
      if (jsonArraymessageStatuses != null) {
        // ensure the json data is an array
        if (!jsonObj.get("messageStatuses").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `messageStatuses` to be an array in the JSON string but got `%s`", jsonObj.get("messageStatuses").toString()));
        }

        // validate the optional field `messageStatuses` (array)
        for (int i = 0; i < jsonArraymessageStatuses.size(); i++) {
          MessageStatusMessageStatusesInner.validateJsonObject(jsonArraymessageStatuses.get(i).getAsJsonObject());
        };
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
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MessageStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MessageStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MessageStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MessageStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<MessageStatus>() {
           @Override
           public void write(JsonWriter out, MessageStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MessageStatus read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MessageStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MessageStatus
  * @throws IOException if the JSON string is invalid with respect to MessageStatus
  */
  public static MessageStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MessageStatus.class);
  }

 /**
  * Convert an instance of MessageStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

