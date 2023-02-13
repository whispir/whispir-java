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
 * The object to specify which events callbacks should be enabled for.
 */

public class CallbackOptions {
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
  @SerializedName("reply")
  private String reply;

  @SerializedName("undeliverable")
  private String undeliverable;

  public CallbackOptions() {
    super();
  }


   /**
   * A boolean flag specifying whether message reply callbacks are enabled.
   * @return reply
  **/
  @javax.annotation.Nonnull
  public String getReply() {
    return reply;
  }
  public void setReply(String reply) {
    this.reply = reply;
  }

   /**
   * A boolean flag specifying whether undeliverable message callbacks are enabled.
   * @return undeliverable
  **/
  @javax.annotation.Nonnull
  public String getUndeliverable() {
    return undeliverable;
  }
  public void setUndeliverable(String undeliverable) {
    this.undeliverable = undeliverable;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallbackOptions callbackOptions = (CallbackOptions) o;
    return Objects.equals(this.reply, callbackOptions.reply) &&
        Objects.equals(this.undeliverable, callbackOptions.undeliverable);
  }
  @Override
  public int hashCode() {
    return Objects.hash(reply, undeliverable);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallbackOptions {\n");
    sb.append("    reply: ").append(toIndentedString(reply)).append("\n");
    sb.append("    undeliverable: ").append(toIndentedString(undeliverable)).append("\n");
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
       if (!CallbackOptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CallbackOptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CallbackOptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CallbackOptions.class));

       return (TypeAdapter<T>) new TypeAdapter<CallbackOptions>() {
           @Override
           public void write(JsonWriter out, CallbackOptions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CallbackOptions read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CallbackOptions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CallbackOptions
  * @throws IOException if the JSON string is invalid with respect to CallbackOptions
  */
  public static CallbackOptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CallbackOptions.class);
  }

 /**
  * Convert an instance of CallbackOptions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

