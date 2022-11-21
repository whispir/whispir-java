/*
 * Whispir Platform API
 * Whispir Platform API for cross channel and multi channel communications. Documentation on each endpoint is available at https://developers.whispir.com.
 *
 * The version of the OpenAPI document: 1.1.0
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
import java.math.BigDecimal;

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
 * MessageStatusMessageStatusesInnerCategoriesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-21T01:55:16.197234Z[Etc/UTC]")
public class MessageStatusMessageStatusesInnerCategoriesInner {
  /**
   * The delivery status of the message.
   */
  @JsonAdapter(NameEnum.Adapter.class)
  public enum NameEnum {
    SENT("Sent"),
    
    PENDING("Pending"),
    
    RECEIVED("Received"),
    
    ACKNOWLEDGED("Acknowledged"),
    
    UNDELIVERABLE("Undeliverable");

    private String value;

    NameEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NameEnum fromValue(String value) {
      for (NameEnum b : NameEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<NameEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NameEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NameEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return NameEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private NameEnum name;

  public static final String SERIALIZED_NAME_RECIPIENT_COUNT = "recipientCount";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_COUNT)
  private BigDecimal recipientCount;

  public static final String SERIALIZED_NAME_PERCENTAGE_TOTAL = "percentageTotal";
  @SerializedName(SERIALIZED_NAME_PERCENTAGE_TOTAL)
  private String percentageTotal;

  public MessageStatusMessageStatusesInnerCategoriesInner() { 
  }

  public MessageStatusMessageStatusesInnerCategoriesInner name(NameEnum name) {
    
    this.name = name;
    return this;
  }

   /**
   * The delivery status of the message.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The delivery status of the message.")

  public NameEnum getName() {
    return name;
  }


  public void setName(NameEnum name) {
    this.name = name;
  }


  public MessageStatusMessageStatusesInnerCategoriesInner recipientCount(BigDecimal recipientCount) {
    
    this.recipientCount = recipientCount;
    return this;
  }

   /**
   * The number of recipients with the given &#x60;name&#x60; status.
   * @return recipientCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "The number of recipients with the given `name` status.")

  public BigDecimal getRecipientCount() {
    return recipientCount;
  }


  public void setRecipientCount(BigDecimal recipientCount) {
    this.recipientCount = recipientCount;
  }


  public MessageStatusMessageStatusesInnerCategoriesInner percentageTotal(String percentageTotal) {
    
    this.percentageTotal = percentageTotal;
    return this;
  }

   /**
   * The percentage of recipients with the given &#x60;name&#x60; status.
   * @return percentageTotal
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "100.0%", required = true, value = "The percentage of recipients with the given `name` status.")

  public String getPercentageTotal() {
    return percentageTotal;
  }


  public void setPercentageTotal(String percentageTotal) {
    this.percentageTotal = percentageTotal;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageStatusMessageStatusesInnerCategoriesInner messageStatusMessageStatusesInnerCategoriesInner = (MessageStatusMessageStatusesInnerCategoriesInner) o;
    return Objects.equals(this.name, messageStatusMessageStatusesInnerCategoriesInner.name) &&
        Objects.equals(this.recipientCount, messageStatusMessageStatusesInnerCategoriesInner.recipientCount) &&
        Objects.equals(this.percentageTotal, messageStatusMessageStatusesInnerCategoriesInner.percentageTotal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, recipientCount, percentageTotal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageStatusMessageStatusesInnerCategoriesInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    recipientCount: ").append(toIndentedString(recipientCount)).append("\n");
    sb.append("    percentageTotal: ").append(toIndentedString(percentageTotal)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("recipientCount");
    openapiFields.add("percentageTotal");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("recipientCount");
    openapiRequiredFields.add("percentageTotal");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MessageStatusMessageStatusesInnerCategoriesInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (MessageStatusMessageStatusesInnerCategoriesInner.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in MessageStatusMessageStatusesInnerCategoriesInner is not found in the empty JSON string", MessageStatusMessageStatusesInnerCategoriesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MessageStatusMessageStatusesInnerCategoriesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MessageStatusMessageStatusesInnerCategoriesInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MessageStatusMessageStatusesInnerCategoriesInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("percentageTotal") != null && !jsonObj.get("percentageTotal").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `percentageTotal` to be a primitive type in the JSON string but got `%s`", jsonObj.get("percentageTotal").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MessageStatusMessageStatusesInnerCategoriesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MessageStatusMessageStatusesInnerCategoriesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MessageStatusMessageStatusesInnerCategoriesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MessageStatusMessageStatusesInnerCategoriesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<MessageStatusMessageStatusesInnerCategoriesInner>() {
           @Override
           public void write(JsonWriter out, MessageStatusMessageStatusesInnerCategoriesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MessageStatusMessageStatusesInnerCategoriesInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MessageStatusMessageStatusesInnerCategoriesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MessageStatusMessageStatusesInnerCategoriesInner
  * @throws IOException if the JSON string is invalid with respect to MessageStatusMessageStatusesInnerCategoriesInner
  */
  public static MessageStatusMessageStatusesInnerCategoriesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MessageStatusMessageStatusesInnerCategoriesInner.class);
  }

 /**
  * Convert an instance of MessageStatusMessageStatusesInnerCategoriesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

