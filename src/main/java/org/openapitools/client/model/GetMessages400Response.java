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
 * The bad request response object.
 */
@ApiModel(description = "The bad request response object.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-22T09:15:03.121580Z[Etc/UTC]")
public class GetMessages400Response {
  public static final String SERIALIZED_NAME_ERROR_SUMMARY = "errorSummary";
  @SerializedName(SERIALIZED_NAME_ERROR_SUMMARY)
  private String errorSummary;

  public static final String SERIALIZED_NAME_ERROR_TEXT = "errorText";
  @SerializedName(SERIALIZED_NAME_ERROR_TEXT)
  private String errorText;

  public static final String SERIALIZED_NAME_ERROR_DETAIL = "errorDetail";
  @SerializedName(SERIALIZED_NAME_ERROR_DETAIL)
  private String errorDetail;

  public GetMessages400Response() { 
  }

  public GetMessages400Response errorSummary(String errorSummary) {
    
    this.errorSummary = errorSummary;
    return this;
  }

   /**
   * The summary of the error encountered.
   * @return errorSummary
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Your request was malformed and could not be processed by the server. Please try again", required = true, value = "The summary of the error encountered.")

  public String getErrorSummary() {
    return errorSummary;
  }


  public void setErrorSummary(String errorSummary) {
    this.errorSummary = errorSummary;
  }


  public GetMessages400Response errorText(String errorText) {
    
    this.errorText = errorText;
    return this;
  }

   /**
   * The detailed description of the error encountered.
   * @return errorText
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Bad Request", required = true, value = "The detailed description of the error encountered.")

  public String getErrorText() {
    return errorText;
  }


  public void setErrorText(String errorText) {
    this.errorText = errorText;
  }


  public GetMessages400Response errorDetail(String errorDetail) {
    
    this.errorDetail = errorDetail;
    return this;
  }

   /**
   * The additional details describing the error.
   * @return errorDetail
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "\"java.io.EOFException: No content to map to Object due to end of inpu", required = true, value = "The additional details describing the error.")

  public String getErrorDetail() {
    return errorDetail;
  }


  public void setErrorDetail(String errorDetail) {
    this.errorDetail = errorDetail;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMessages400Response getMessages400Response = (GetMessages400Response) o;
    return Objects.equals(this.errorSummary, getMessages400Response.errorSummary) &&
        Objects.equals(this.errorText, getMessages400Response.errorText) &&
        Objects.equals(this.errorDetail, getMessages400Response.errorDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorSummary, errorText, errorDetail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMessages400Response {\n");
    sb.append("    errorSummary: ").append(toIndentedString(errorSummary)).append("\n");
    sb.append("    errorText: ").append(toIndentedString(errorText)).append("\n");
    sb.append("    errorDetail: ").append(toIndentedString(errorDetail)).append("\n");
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
    openapiFields.add("errorSummary");
    openapiFields.add("errorText");
    openapiFields.add("errorDetail");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("errorSummary");
    openapiRequiredFields.add("errorText");
    openapiRequiredFields.add("errorDetail");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetMessages400Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetMessages400Response.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetMessages400Response is not found in the empty JSON string", GetMessages400Response.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetMessages400Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetMessages400Response` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetMessages400Response.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("errorSummary") != null && !jsonObj.get("errorSummary").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `errorSummary` to be a primitive type in the JSON string but got `%s`", jsonObj.get("errorSummary").toString()));
      }
      if (jsonObj.get("errorText") != null && !jsonObj.get("errorText").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `errorText` to be a primitive type in the JSON string but got `%s`", jsonObj.get("errorText").toString()));
      }
      if (jsonObj.get("errorDetail") != null && !jsonObj.get("errorDetail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `errorDetail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("errorDetail").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetMessages400Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetMessages400Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetMessages400Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetMessages400Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetMessages400Response>() {
           @Override
           public void write(JsonWriter out, GetMessages400Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetMessages400Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetMessages400Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetMessages400Response
  * @throws IOException if the JSON string is invalid with respect to GetMessages400Response
  */
  public static GetMessages400Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetMessages400Response.class);
  }

 /**
  * Convert an instance of GetMessages400Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

