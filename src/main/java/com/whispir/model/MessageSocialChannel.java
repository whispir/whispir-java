/*
 * Whispir Platform API
 * Whispir Platform API for cross channel and multi channel communications. Documentation on each endpoint is available at https://developers.whispir.com.
 *
 * The version of the OpenAPI document: 1.1.3
 * Contact: support@whispir.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.whispir.model;

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

import com.whispir.client.JSON;

/**
 * The social channel object.
 */
@ApiModel(description = "The social channel object.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-06T03:10:46.360132Z[Etc/UTC]")
public class MessageSocialChannel {
  /**
   * The identifier for the social content channel. Read the following section for information on each channel.  | Channel        | id | | -------------- |--------------- | | Twitter        | &#x60;\&quot;social\&quot;&#x60; | | Facebook       | &#x60;\&quot;social_long\&quot;&#x60; |
   */
  @JsonAdapter(IdEnum.Adapter.class)
  public enum IdEnum {
    SOCIAL("social"),
    
    SOCIAL_LONG("social_long");

    private String value;

    IdEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IdEnum fromValue(String value) {
      for (IdEnum b : IdEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<IdEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IdEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IdEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return IdEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private IdEnum id;

  public static final String SERIALIZED_NAME_BODY = "body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private String body;

  /**
   * The social message content type.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    PLAIN("text/plain"),
    
    HTML("text/html");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public MessageSocialChannel() { 
  }

  public MessageSocialChannel id(IdEnum id) {
    
    this.id = id;
    return this;
  }

   /**
   * The identifier for the social content channel. Read the following section for information on each channel.  | Channel        | id | | -------------- |--------------- | | Twitter        | &#x60;\&quot;social\&quot;&#x60; | | Facebook       | &#x60;\&quot;social_long\&quot;&#x60; |
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The identifier for the social content channel. Read the following section for information on each channel.  | Channel        | id | | -------------- |--------------- | | Twitter        | `\"social\"` | | Facebook       | `\"social_long\"` |")

  public IdEnum getId() {
    return id;
  }


  public void setId(IdEnum id) {
    this.id = id;
  }


  public MessageSocialChannel body(String body) {
    
    this.body = body;
    return this;
  }

   /**
   * The social content body.
   * @return body
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Facebook Content", value = "The social content body.")

  public String getBody() {
    return body;
  }


  public void setBody(String body) {
    this.body = body;
  }


  public MessageSocialChannel type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The social message content type.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The social message content type.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageSocialChannel messageSocialChannel = (MessageSocialChannel) o;
    return Objects.equals(this.id, messageSocialChannel.id) &&
        Objects.equals(this.body, messageSocialChannel.body) &&
        Objects.equals(this.type, messageSocialChannel.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, body, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageSocialChannel {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("body");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MessageSocialChannel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (MessageSocialChannel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in MessageSocialChannel is not found in the empty JSON string", MessageSocialChannel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MessageSocialChannel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MessageSocialChannel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("body") != null && !jsonObj.get("body").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `body` to be a primitive type in the JSON string but got `%s`", jsonObj.get("body").toString()));
      }
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MessageSocialChannel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MessageSocialChannel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MessageSocialChannel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MessageSocialChannel.class));

       return (TypeAdapter<T>) new TypeAdapter<MessageSocialChannel>() {
           @Override
           public void write(JsonWriter out, MessageSocialChannel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MessageSocialChannel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MessageSocialChannel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MessageSocialChannel
  * @throws IOException if the JSON string is invalid with respect to MessageSocialChannel
  */
  public static MessageSocialChannel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MessageSocialChannel.class);
  }

 /**
  * Convert an instance of MessageSocialChannel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

