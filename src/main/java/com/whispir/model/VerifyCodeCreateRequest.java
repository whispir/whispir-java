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
 * The object containing the information required to verify the one time password.
 */

public class VerifyCodeCreateRequest {
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
  @SerializedName("to")
  private String to;

  @SerializedName("code")
  private String code;

  public VerifyCodeCreateRequest() {
    super();
  }


   /**
   * Indicates the phone number of the recipient
   * @return to
  **/
  @javax.annotation.Nonnull
  public String getTo() {
    return to;
  }
  public void setTo(String to) {
    this.to = to;
  }

   /**
   * The code to match and verify
   * @return code
  **/
  @javax.annotation.Nonnull
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifyCodeCreateRequest verifyCodeCreateRequest = (VerifyCodeCreateRequest) o;
    return Objects.equals(this.to, verifyCodeCreateRequest.to) &&
        Objects.equals(this.code, verifyCodeCreateRequest.code);
  }
  @Override
  public int hashCode() {
    return Objects.hash(to, code);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifyCodeCreateRequest {\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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
       if (!VerifyCodeCreateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VerifyCodeCreateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VerifyCodeCreateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VerifyCodeCreateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<VerifyCodeCreateRequest>() {
           @Override
           public void write(JsonWriter out, VerifyCodeCreateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VerifyCodeCreateRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VerifyCodeCreateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VerifyCodeCreateRequest
  * @throws IOException if the JSON string is invalid with respect to VerifyCodeCreateRequest
  */
  public static VerifyCodeCreateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VerifyCodeCreateRequest.class);
  }

 /**
  * Convert an instance of VerifyCodeCreateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

