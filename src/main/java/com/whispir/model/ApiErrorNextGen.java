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
import java.math.BigDecimal;
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
 * The generic error object returned by new downstream services
 */

public class ApiErrorNextGen {
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
  @SerializedName("status")
  private BigDecimal status;

  @SerializedName("message")
  private String message;

  @SerializedName("detail")
  private String detail;

  public ApiErrorNextGen() {
    super();
  }

  public ApiErrorNextGen(
    BigDecimal status, 
    String message, 
    String detail
  ) {
    this();
    this.status = status;
    this.message = message;
    this.detail = detail;
  }
   /**
   * The status code
   * @return status
  **/
  @javax.annotation.Nonnull
  public BigDecimal getStatus() {
    return status;
  }
   /**
   * The detailed description of the error encountered.
   * @return message
  **/
  @javax.annotation.Nonnull
  public String getMessage() {
    return message;
  }
   /**
   * The additional details describing the error.
   * @return detail
  **/
  @javax.annotation.Nonnull
  public String getDetail() {
    return detail;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiErrorNextGen apiErrorNextGen = (ApiErrorNextGen) o;
    return Objects.equals(this.status, apiErrorNextGen.status) &&
        Objects.equals(this.message, apiErrorNextGen.message) &&
        Objects.equals(this.detail, apiErrorNextGen.detail);
  }
  @Override
  public int hashCode() {
    return Objects.hash(status, message, detail);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiErrorNextGen {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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
       if (!ApiErrorNextGen.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiErrorNextGen' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiErrorNextGen> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiErrorNextGen.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiErrorNextGen>() {
           @Override
           public void write(JsonWriter out, ApiErrorNextGen value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiErrorNextGen read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApiErrorNextGen given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApiErrorNextGen
  * @throws IOException if the JSON string is invalid with respect to ApiErrorNextGen
  */
  public static ApiErrorNextGen fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiErrorNextGen.class);
  }

 /**
  * Convert an instance of ApiErrorNextGen to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

