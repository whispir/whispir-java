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
 * The social channel object.
 */

public class Channel {
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

  @SerializedName("body")
  private String body;

  @SerializedName("type")
  private String type;

  public Channel() {
    super();
  }


   /**
   * The identifier for the social content channel. Read the following section for information on each channel.  | Channel        | id | | -------------- |--------------- | | Twitter        | &#x60;\&quot;social\&quot;&#x60; | | Facebook       | &#x60;\&quot;social_long\&quot;&#x60; |
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

   /**
   * The social content body.
   * @return body
  **/
  @javax.annotation.Nullable
  public String getBody() {
    return body;
  }
  public void setBody(String body) {
    this.body = body;
  }

   /**
   * The social message content type.
   * @return type
  **/
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Channel channel = (Channel) o;
    return Objects.equals(this.id, channel.id) &&
        Objects.equals(this.body, channel.body) &&
        Objects.equals(this.type, channel.type);
  }
  @Override
  public int hashCode() {
    return Objects.hash(id, body, type);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Channel {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
       if (!Channel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Channel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Channel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Channel.class));

       return (TypeAdapter<T>) new TypeAdapter<Channel>() {
           @Override
           public void write(JsonWriter out, Channel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Channel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Channel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Channel
  * @throws IOException if the JSON string is invalid with respect to Channel
  */
  public static Channel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Channel.class);
  }

 /**
  * Convert an instance of Channel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

