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
 * Links related to the resource, verify link is provided to make it easy for UI integrations.
 */

public class OtpLinks {
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
  @SerializedName("verify")
  private String verify;

  public OtpLinks() {
    super();
  }


   /**
   * The link to verify the code.
   * @return verify
  **/
  @javax.annotation.Nullable
  public String getVerify() {
    return verify;
  }
  public void setVerify(String verify) {
    this.verify = verify;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OtpLinks otpLinks = (OtpLinks) o;
    return Objects.equals(this.verify, otpLinks.verify);
  }
  @Override
  public int hashCode() {
    return Objects.hash(verify);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtpLinks {\n");
    sb.append("    verify: ").append(toIndentedString(verify)).append("\n");
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
       if (!OtpLinks.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OtpLinks' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OtpLinks> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OtpLinks.class));

       return (TypeAdapter<T>) new TypeAdapter<OtpLinks>() {
           @Override
           public void write(JsonWriter out, OtpLinks value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OtpLinks read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OtpLinks given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OtpLinks
  * @throws IOException if the JSON string is invalid with respect to OtpLinks
  */
  public static OtpLinks fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OtpLinks.class);
  }

 /**
  * Convert an instance of OtpLinks to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

