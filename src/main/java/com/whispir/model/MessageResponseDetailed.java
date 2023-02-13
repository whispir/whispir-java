package com.whispir.model;
import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.whispir.model.Link;
import com.whispir.model.ResponseStatusDetailed;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
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
 * The detailed message response object.
 */

public class MessageResponseDetailed {
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
  @SerializedName("messageresponses")
  private Set<ResponseStatusDetailed> messageresponses;

  @SerializedName("link")
  private List<Link> link;

  @SerializedName("status")
  private String status;

  public MessageResponseDetailed() {
    super();
  }

  public MessageResponseDetailed(
    Set<ResponseStatusDetailed> messageresponses, 
    List<Link> link, 
    String status
  ) {
    this();
    this.messageresponses = messageresponses;
    this.link = link;
    this.status = status;
  }
   /**
   * The message response statuses.
   * @return messageresponses
  **/
  @javax.annotation.Nonnull
  public Set<ResponseStatusDetailed> getMessageresponses() {
    return messageresponses;
  }
   /**
   * A [HATEOAS](https://en.wikipedia.org/wiki/HATEOAS) link array, describing all discoverable resources in relation to the original request.
   * @return link
  **/
  @javax.annotation.Nonnull
  public List<Link> getLink() {
    return link;
  }
   /**
   * The message response pagination status.
   * @return status
  **/
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageResponseDetailed messageResponseDetailed = (MessageResponseDetailed) o;
    return Objects.equals(this.messageresponses, messageResponseDetailed.messageresponses) &&
        Objects.equals(this.link, messageResponseDetailed.link) &&
        Objects.equals(this.status, messageResponseDetailed.status);
  }
  @Override
  public int hashCode() {
    return Objects.hash(messageresponses, link, status);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageResponseDetailed {\n");
    sb.append("    messageresponses: ").append(toIndentedString(messageresponses)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
       if (!MessageResponseDetailed.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MessageResponseDetailed' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MessageResponseDetailed> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MessageResponseDetailed.class));

       return (TypeAdapter<T>) new TypeAdapter<MessageResponseDetailed>() {
           @Override
           public void write(JsonWriter out, MessageResponseDetailed value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MessageResponseDetailed read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MessageResponseDetailed given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MessageResponseDetailed
  * @throws IOException if the JSON string is invalid with respect to MessageResponseDetailed
  */
  public static MessageResponseDetailed fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MessageResponseDetailed.class);
  }

 /**
  * Convert an instance of MessageResponseDetailed to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

