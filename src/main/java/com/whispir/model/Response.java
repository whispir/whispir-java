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
 * The details about this particular message that have been sent to the callback  IMPORTANT: Depending on the flow, you may only see  one of the acknowledged or undeliverable keys with timestamps as their value
 */

public class Response {
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
  @SerializedName("channel")
  private String channel;

  @SerializedName("acknowledged")
  private String acknowledged;

  @SerializedName("undeliverable")
  private String undeliverable;

  @SerializedName("content")
  private String content;

  public Response() {
    super();
  }

  public Response(
    String channel, 
    String acknowledged, 
    String undeliverable, 
    String content
  ) {
    this();
    this.channel = channel;
    this.acknowledged = acknowledged;
    this.undeliverable = undeliverable;
    this.content = content;
  }
   /**
   * The channel that this message was sent on. Either SMS, email or voice
   * @return channel
  **/
  @javax.annotation.Nonnull
  public String getChannel() {
    return channel;
  }
   /**
   * The date/time that this message was acknowledged
   * @return acknowledged
  **/
  @javax.annotation.Nonnull
  public String getAcknowledged() {
    return acknowledged;
  }
   /**
   * The date/time that this message was marked as undeliverable
   * @return undeliverable
  **/
  @javax.annotation.Nullable
  public String getUndeliverable() {
    return undeliverable;
  }
   /**
   * The content of the message
   * @return content
  **/
  @javax.annotation.Nonnull
  public String getContent() {
    return content;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Response response = (Response) o;
    return Objects.equals(this.channel, response.channel) &&
        Objects.equals(this.acknowledged, response.acknowledged) &&
        Objects.equals(this.undeliverable, response.undeliverable) &&
        Objects.equals(this.content, response.content);
  }
  @Override
  public int hashCode() {
    return Objects.hash(channel, acknowledged, undeliverable, content);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Response {\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    acknowledged: ").append(toIndentedString(acknowledged)).append("\n");
    sb.append("    undeliverable: ").append(toIndentedString(undeliverable)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
       if (!Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Response.class));

       return (TypeAdapter<T>) new TypeAdapter<Response>() {
           @Override
           public void write(JsonWriter out, Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Response
  * @throws IOException if the JSON string is invalid with respect to Response
  */
  public static Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Response.class);
  }

 /**
  * Convert an instance of Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

