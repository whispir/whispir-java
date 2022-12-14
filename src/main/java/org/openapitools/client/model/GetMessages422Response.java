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
 * The unprocessable entity response object.
 */
@ApiModel(description = "The unprocessable entity response object.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-14T10:37:13.711751+10:00[Australia/Melbourne]")
public class GetMessages422Response {
  public static final String SERIALIZED_NAME_ERROR_SUMMARY = "errorSummary";
  @SerializedName(SERIALIZED_NAME_ERROR_SUMMARY)
  private String errorSummary;

  public static final String SERIALIZED_NAME_ERROR_TEXT = "errorText";
  @SerializedName(SERIALIZED_NAME_ERROR_TEXT)
  private String errorText;

  public static final String SERIALIZED_NAME_ERROR_DETAIL = "errorDetail";
  @SerializedName(SERIALIZED_NAME_ERROR_DETAIL)
  private String errorDetail;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private List<LinkInner> link = null;

  public GetMessages422Response() { 
  }

  
  public GetMessages422Response(
     List<LinkInner> link
  ) {
    this();
    this.link = link;
  }

  public GetMessages422Response errorSummary(String errorSummary) {
    
    this.errorSummary = errorSummary;
    return this;
  }

   /**
   * The summary of the error encountered.
   * @return errorSummary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Your request did not contain all of the information required to perform this method. Please check your request for the required fields to be passed in and try again. Alternatively, contact your administrator or support@whispir.com for more information", value = "The summary of the error encountered.")

  public String getErrorSummary() {
    return errorSummary;
  }


  public void setErrorSummary(String errorSummary) {
    this.errorSummary = errorSummary;
  }


  public GetMessages422Response errorText(String errorText) {
    
    this.errorText = errorText;
    return this;
  }

   /**
   * The detailed description of the error encountered.
   * @return errorText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A Template name already exists in the current Workspace, please select another name and try again.", value = "The detailed description of the error encountered.")

  public String getErrorText() {
    return errorText;
  }


  public void setErrorText(String errorText) {
    this.errorText = errorText;
  }


  public GetMessages422Response errorDetail(String errorDetail) {
    
    this.errorDetail = errorDetail;
    return this;
  }

   /**
   * The additional details describing the error.
   * @return errorDetail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "An exception occurred.", value = "The additional details describing the error.")

  public String getErrorDetail() {
    return errorDetail;
  }


  public void setErrorDetail(String errorDetail) {
    this.errorDetail = errorDetail;
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
    GetMessages422Response getMessages422Response = (GetMessages422Response) o;
    return Objects.equals(this.errorSummary, getMessages422Response.errorSummary) &&
        Objects.equals(this.errorText, getMessages422Response.errorText) &&
        Objects.equals(this.errorDetail, getMessages422Response.errorDetail) &&
        Objects.equals(this.link, getMessages422Response.link);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorSummary, errorText, errorDetail, link);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMessages422Response {\n");
    sb.append("    errorSummary: ").append(toIndentedString(errorSummary)).append("\n");
    sb.append("    errorText: ").append(toIndentedString(errorText)).append("\n");
    sb.append("    errorDetail: ").append(toIndentedString(errorDetail)).append("\n");
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
    openapiFields.add("errorSummary");
    openapiFields.add("errorText");
    openapiFields.add("errorDetail");
    openapiFields.add("link");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetMessages422Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetMessages422Response.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetMessages422Response is not found in the empty JSON string", GetMessages422Response.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetMessages422Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetMessages422Response` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
       if (!GetMessages422Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetMessages422Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetMessages422Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetMessages422Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetMessages422Response>() {
           @Override
           public void write(JsonWriter out, GetMessages422Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetMessages422Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetMessages422Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetMessages422Response
  * @throws IOException if the JSON string is invalid with respect to GetMessages422Response
  */
  public static GetMessages422Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetMessages422Response.class);
  }

 /**
  * Convert an instance of GetMessages422Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

