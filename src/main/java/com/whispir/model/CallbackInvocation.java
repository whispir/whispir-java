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
 * The details about this particular callback attempt
 */

public class CallbackInvocation {
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
  @SerializedName("id")
  private String id;

  @SerializedName("name")
  private String name;

  @SerializedName("url")
  private String url;

  @SerializedName("attemptedDate")
  private String attemptedDate;

  @SerializedName("statusCode")
  private Integer statusCode;

  @SerializedName("statusMessage")
  private String statusMessage;

  public CallbackInvocation() {
    super();
  }

  public CallbackInvocation(
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
  public String getId() {
    return id;
  }
   /**
   * The name of the callback server attempting to be invoked
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }
   /**
   * The URL of the callback server attempting to be invoked
   * @return url
  **/
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }
   /**
   * The date/time that the callback server was attempted to be invoked
   * @return attemptedDate
  **/
  @javax.annotation.Nullable
  public String getAttemptedDate() {
    return attemptedDate;
  }
   /**
   * The statuscode that was returned from the callback service
   * @return statusCode
  **/
  @javax.annotation.Nullable
  public Integer getStatusCode() {
    return statusCode;
  }
   /**
   * The status message that was returned from the callback service
   * @return statusMessage
  **/
  @javax.annotation.Nullable
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
    CallbackInvocation callbackInvocation = (CallbackInvocation) o;
    return Objects.equals(this.id, callbackInvocation.id) &&
        Objects.equals(this.name, callbackInvocation.name) &&
        Objects.equals(this.url, callbackInvocation.url) &&
        Objects.equals(this.attemptedDate, callbackInvocation.attemptedDate) &&
        Objects.equals(this.statusCode, callbackInvocation.statusCode) &&
        Objects.equals(this.statusMessage, callbackInvocation.statusMessage);
  }
  @Override
  public int hashCode() {
    return Objects.hash(id, name, url, attemptedDate, statusCode, statusMessage);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallbackInvocation {\n");
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

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CallbackInvocation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CallbackInvocation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CallbackInvocation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CallbackInvocation.class));

       return (TypeAdapter<T>) new TypeAdapter<CallbackInvocation>() {
           @Override
           public void write(JsonWriter out, CallbackInvocation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CallbackInvocation read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CallbackInvocation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CallbackInvocation
  * @throws IOException if the JSON string is invalid with respect to CallbackInvocation
  */
  public static CallbackInvocation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CallbackInvocation.class);
  }

 /**
  * Convert an instance of CallbackInvocation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

