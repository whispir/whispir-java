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
import org.openapitools.client.model.MessageResponseDetailedMessageresponsesInnerFrom;
import org.openapitools.client.model.MessageResponseDetailedMessageresponsesInnerResponseMessage;

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
 * MessageResponseDetailedMessageresponsesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-14T10:37:13.711751+10:00[Australia/Melbourne]")
public class MessageResponseDetailedMessageresponsesInner {
  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  private MessageResponseDetailedMessageresponsesInnerFrom from;

  /**
   * The message response category.  * &#x60;noresponse&#x60; - the message was sent but was not replied to * &#x60;notmatched&#x60; - the message was replied to and the answer didn&#39;t match any search criteria
   */
  @JsonAdapter(ResponseCategoryEnum.Adapter.class)
  public enum ResponseCategoryEnum {
    NORESPONSE("noresponse"),
    
    NOTMATCHED("notmatched");

    private String value;

    ResponseCategoryEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ResponseCategoryEnum fromValue(String value) {
      for (ResponseCategoryEnum b : ResponseCategoryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ResponseCategoryEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ResponseCategoryEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ResponseCategoryEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ResponseCategoryEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_RESPONSE_CATEGORY = "responseCategory";
  @SerializedName(SERIALIZED_NAME_RESPONSE_CATEGORY)
  private ResponseCategoryEnum responseCategory;

  public static final String SERIALIZED_NAME_RESPONSE_MESSAGE = "responseMessage";
  @SerializedName(SERIALIZED_NAME_RESPONSE_MESSAGE)
  private MessageResponseDetailedMessageresponsesInnerResponseMessage responseMessage;

  public MessageResponseDetailedMessageresponsesInner() { 
  }

  public MessageResponseDetailedMessageresponsesInner from(MessageResponseDetailedMessageresponsesInnerFrom from) {
    
    this.from = from;
    return this;
  }

   /**
   * Get from
   * @return from
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public MessageResponseDetailedMessageresponsesInnerFrom getFrom() {
    return from;
  }


  public void setFrom(MessageResponseDetailedMessageresponsesInnerFrom from) {
    this.from = from;
  }


  public MessageResponseDetailedMessageresponsesInner responseCategory(ResponseCategoryEnum responseCategory) {
    
    this.responseCategory = responseCategory;
    return this;
  }

   /**
   * The message response category.  * &#x60;noresponse&#x60; - the message was sent but was not replied to * &#x60;notmatched&#x60; - the message was replied to and the answer didn&#39;t match any search criteria
   * @return responseCategory
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The message response category.  * `noresponse` - the message was sent but was not replied to * `notmatched` - the message was replied to and the answer didn't match any search criteria")

  public ResponseCategoryEnum getResponseCategory() {
    return responseCategory;
  }


  public void setResponseCategory(ResponseCategoryEnum responseCategory) {
    this.responseCategory = responseCategory;
  }


  public MessageResponseDetailedMessageresponsesInner responseMessage(MessageResponseDetailedMessageresponsesInnerResponseMessage responseMessage) {
    
    this.responseMessage = responseMessage;
    return this;
  }

   /**
   * Get responseMessage
   * @return responseMessage
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public MessageResponseDetailedMessageresponsesInnerResponseMessage getResponseMessage() {
    return responseMessage;
  }


  public void setResponseMessage(MessageResponseDetailedMessageresponsesInnerResponseMessage responseMessage) {
    this.responseMessage = responseMessage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageResponseDetailedMessageresponsesInner messageResponseDetailedMessageresponsesInner = (MessageResponseDetailedMessageresponsesInner) o;
    return Objects.equals(this.from, messageResponseDetailedMessageresponsesInner.from) &&
        Objects.equals(this.responseCategory, messageResponseDetailedMessageresponsesInner.responseCategory) &&
        Objects.equals(this.responseMessage, messageResponseDetailedMessageresponsesInner.responseMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, responseCategory, responseMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageResponseDetailedMessageresponsesInner {\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    responseCategory: ").append(toIndentedString(responseCategory)).append("\n");
    sb.append("    responseMessage: ").append(toIndentedString(responseMessage)).append("\n");
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
    openapiFields.add("from");
    openapiFields.add("responseCategory");
    openapiFields.add("responseMessage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("from");
    openapiRequiredFields.add("responseCategory");
    openapiRequiredFields.add("responseMessage");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MessageResponseDetailedMessageresponsesInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (MessageResponseDetailedMessageresponsesInner.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in MessageResponseDetailedMessageresponsesInner is not found in the empty JSON string", MessageResponseDetailedMessageresponsesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MessageResponseDetailedMessageresponsesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MessageResponseDetailedMessageresponsesInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MessageResponseDetailedMessageresponsesInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `from`
      if (jsonObj.getAsJsonObject("from") != null) {
        MessageResponseDetailedMessageresponsesInnerFrom.validateJsonObject(jsonObj.getAsJsonObject("from"));
      }
      if (jsonObj.get("responseCategory") != null && !jsonObj.get("responseCategory").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `responseCategory` to be a primitive type in the JSON string but got `%s`", jsonObj.get("responseCategory").toString()));
      }
      // validate the optional field `responseMessage`
      if (jsonObj.getAsJsonObject("responseMessage") != null) {
        MessageResponseDetailedMessageresponsesInnerResponseMessage.validateJsonObject(jsonObj.getAsJsonObject("responseMessage"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MessageResponseDetailedMessageresponsesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MessageResponseDetailedMessageresponsesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MessageResponseDetailedMessageresponsesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MessageResponseDetailedMessageresponsesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<MessageResponseDetailedMessageresponsesInner>() {
           @Override
           public void write(JsonWriter out, MessageResponseDetailedMessageresponsesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MessageResponseDetailedMessageresponsesInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MessageResponseDetailedMessageresponsesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MessageResponseDetailedMessageresponsesInner
  * @throws IOException if the JSON string is invalid with respect to MessageResponseDetailedMessageresponsesInner
  */
  public static MessageResponseDetailedMessageresponsesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MessageResponseDetailedMessageresponsesInner.class);
  }

 /**
  * Convert an instance of MessageResponseDetailedMessageresponsesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

