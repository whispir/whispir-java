/*
 * Whispir Platform API
 * Whispir Platform API for cross channel and multi channel communications. Documentation on each endpoint is available at https://developers.whispir.com.
 *
 * The version of the OpenAPI document: 1.1.2
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
 * The details about this particular callback attempt
 */
@ApiModel(description = "The details about this particular callback attempt")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-22T09:38:29.014059Z[Etc/UTC]")
public class CallbackCallCallback {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_ATTEMPTED_DATE = "attemptedDate";
  @SerializedName(SERIALIZED_NAME_ATTEMPTED_DATE)
  private String attemptedDate;

  public static final String SERIALIZED_NAME_STATUS_CODE = "statusCode";
  @SerializedName(SERIALIZED_NAME_STATUS_CODE)
  private Integer statusCode;

  public static final String SERIALIZED_NAME_STATUS_MESSAGE = "statusMessage";
  @SerializedName(SERIALIZED_NAME_STATUS_MESSAGE)
  private String statusMessage;

  public CallbackCallCallback() { 
  }

  
  public CallbackCallCallback(
     String id, 
     String name, 
     String url, 
     String attemptedDate, 
     Integer statusCode, 
     String statusMessage
  ) {
    this();
    this.id = id;
    this.name = name;
    this.url = url;
    this.attemptedDate = attemptedDate;
    this.statusCode = statusCode;
    this.statusMessage = statusMessage;
  }

   /**
   * The ID of the callback attempting to be invoked
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "93528522590CDF9A", value = "The ID of the callback attempting to be invoked")

  public String getId() {
    return id;
  }




   /**
   * The name of the callback server attempting to be invoked
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "test callback", value = "The name of the callback server attempting to be invoked")

  public String getName() {
    return name;
  }




   /**
   * The URL of the callback server attempting to be invoked
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://google.com", value = "The URL of the callback server attempting to be invoked")

  public String getUrl() {
    return url;
  }




   /**
   * The date/time that the callback server was attempted to be invoked
   * @return attemptedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "22/10/20 09:28", value = "The date/time that the callback server was attempted to be invoked")

  public String getAttemptedDate() {
    return attemptedDate;
  }




   /**
   * The statuscode that was returned from the callback service
   * @return statusCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "200", value = "The statuscode that was returned from the callback service")

  public Integer getStatusCode() {
    return statusCode;
  }




   /**
   * The status message that was returned from the callback service
   * @return statusMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "OK", value = "The status message that was returned from the callback service")

  public String getStatusMessage() {
    return statusMessage;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallbackCallCallback callbackCallCallback = (CallbackCallCallback) o;
    return Objects.equals(this.id, callbackCallCallback.id) &&
        Objects.equals(this.name, callbackCallCallback.name) &&
        Objects.equals(this.url, callbackCallCallback.url) &&
        Objects.equals(this.attemptedDate, callbackCallCallback.attemptedDate) &&
        Objects.equals(this.statusCode, callbackCallCallback.statusCode) &&
        Objects.equals(this.statusMessage, callbackCallCallback.statusMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, url, attemptedDate, statusCode, statusMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallbackCallCallback {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    attemptedDate: ").append(toIndentedString(attemptedDate)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("url");
    openapiFields.add("attemptedDate");
    openapiFields.add("statusCode");
    openapiFields.add("statusMessage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CallbackCallCallback
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CallbackCallCallback.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CallbackCallCallback is not found in the empty JSON string", CallbackCallCallback.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CallbackCallCallback.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CallbackCallCallback` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("url") != null && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if (jsonObj.get("attemptedDate") != null && !jsonObj.get("attemptedDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `attemptedDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("attemptedDate").toString()));
      }
      if (jsonObj.get("statusMessage") != null && !jsonObj.get("statusMessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `statusMessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("statusMessage").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CallbackCallCallback.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CallbackCallCallback' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CallbackCallCallback> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CallbackCallCallback.class));

       return (TypeAdapter<T>) new TypeAdapter<CallbackCallCallback>() {
           @Override
           public void write(JsonWriter out, CallbackCallCallback value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CallbackCallCallback read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CallbackCallCallback given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CallbackCallCallback
  * @throws IOException if the JSON string is invalid with respect to CallbackCallCallback
  */
  public static CallbackCallCallback fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CallbackCallCallback.class);
  }

 /**
  * Convert an instance of CallbackCallCallback to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

