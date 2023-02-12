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
 * The authentication model details. You will receive -   For &#x60;queryparam&#x60; - &#x60;?Auth&#x3D;{{KeyValue}}&#x60;  For &#x60;httpheader&#x60; - &#x60;X-Whispir-Callback-Key: {{KeyValue}}&#x60;  For &#x60;basicauth&#x60; - &#x60;Authorization: Basic {{KeyValue}}&#x60;  For &#x60;bearertoken&#x60; - &#x60;Authorization: Bearer {{KeyValue}}&#x60;
 */

public class CallbackAuth {
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
  @SerializedName("type")
  private String type;

  @SerializedName("key")
  private String key;

  public CallbackAuth() {
    super();
  }


   /**
   * The type of authentication allowed by Whispir at the Destination URL
   * @return type
  **/
  @javax.annotation.Nonnull
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

   /**
   * The value that will be passed with the authentication key
   * @return key
  **/
  @javax.annotation.Nonnull
  public String getKey() {
    return key;
  }
  public void setKey(String key) {
    this.key = key;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallbackAuth callbackAuth = (CallbackAuth) o;
    return Objects.equals(this.type, callbackAuth.type) &&
        Objects.equals(this.key, callbackAuth.key);
  }
  @Override
  public int hashCode() {
    return Objects.hash(type, key);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallbackAuth {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
       if (!CallbackAuth.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CallbackAuth' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CallbackAuth> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CallbackAuth.class));

       return (TypeAdapter<T>) new TypeAdapter<CallbackAuth>() {
           @Override
           public void write(JsonWriter out, CallbackAuth value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CallbackAuth read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CallbackAuth given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CallbackAuth
  * @throws IOException if the JSON string is invalid with respect to CallbackAuth
  */
  public static CallbackAuth fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CallbackAuth.class);
  }

 /**
  * Convert an instance of CallbackAuth to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

