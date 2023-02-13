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
import java.net.URI;

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
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.whispir.client.ApiResponse;
import com.whispir.client.JSON;

/**
 * The generic error object
 */

public class ApiError {
  @SerializedName("docId")
  private String docId;
  @SerializedName("rawOutput")
  private String rawOutput;
  // Additional getters/setters
  /**
   * The identifier for the resource
   * 
   * @return docId
   **/
  public String getDocId() {
    return docId;
  }
  public void setDocId(String docId) {
    this.docId = docId;
  }
  public String getRawOutput() {
    return rawOutput;
  }
  public ApiResponse lastResponse;
  @SerializedName("errorSummary")
  private String errorSummary;

  @SerializedName("errorText")
  private String errorText;

  @SerializedName("errorDetail")
  private String errorDetail;

  public ApiError() {
    super();
  }

  public ApiError(
    String errorSummary, 
    String errorText, 
    String errorDetail
  ) {
    this();
    this.errorSummary = errorSummary;
    this.errorText = errorText;
    this.errorDetail = errorDetail;
  }
   /**
   * The summary of the error encountered.
   * @return errorSummary
  **/
  @javax.annotation.Nonnull
  public String getErrorSummary() {
    return errorSummary;
  }
   /**
   * The detailed description of the error encountered.
   * @return errorText
  **/
  @javax.annotation.Nonnull
  public String getErrorText() {
    return errorText;
  }
   /**
   * The additional details describing the error.
   * @return errorDetail
  **/
  @javax.annotation.Nonnull
  public String getErrorDetail() {
    return errorDetail;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiError apiError = (ApiError) o;
    return Objects.equals(this.errorSummary, apiError.errorSummary) &&
        Objects.equals(this.errorText, apiError.errorText) &&
        Objects.equals(this.errorDetail, apiError.errorDetail);
  }
  @Override
  public int hashCode() {
    return Objects.hash(errorSummary, errorText, errorDetail);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiError {\n");
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

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiError.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiError' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiError> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiError.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiError>() {
           @Override
           public void write(JsonWriter out, ApiError value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiError read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApiError given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApiError
  * @throws IOException if the JSON string is invalid with respect to ApiError
  */
  public static ApiError fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiError.class);
  }

 /**
  * Convert an instance of ApiError to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

