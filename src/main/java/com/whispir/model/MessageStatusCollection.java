package com.whispir.model;
import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.whispir.model.Link;
import com.whispir.model.MessageStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
 * The message status object, describing the delivery of the sent message.
 */

public class MessageStatusCollection {
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
  @SerializedName("link")
  private List<Link> link;

  @SerializedName("messageStatuses")
  private List<MessageStatus> messageStatuses;

  @SerializedName("status")
  private String status;

  public MessageStatusCollection() {
    super();
  }

  public MessageStatusCollection(
    List<Link> link
  ) {
    this();
    this.link = link;
  }
   /**
   * A [HATEOAS](https://en.wikipedia.org/wiki/HATEOAS) link array, describing all discoverable resources in relation to the original request.
   * @return link
  **/
  @javax.annotation.Nullable
  public List<Link> getLink() {
    return link;
  }

  public MessageStatusCollection addMessageStatusesItem(MessageStatus messageStatusesItem) {
    if (this.messageStatuses == null) {
      this.messageStatuses = new ArrayList<>();
    }
    this.messageStatuses.add(messageStatusesItem);
    return this;
  }

   /**
   * The message statuses.
   * @return messageStatuses
  **/
  @javax.annotation.Nullable
  public List<MessageStatus> getMessageStatuses() {
    return messageStatuses;
  }
  public void setMessageStatuses(List<MessageStatus> messageStatuses) {
    this.messageStatuses = messageStatuses;
  }

   /**
   * Present when &#x60;view&#x60; is &#x60;detailed&#x60;.
   * @return status
  **/
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageStatusCollection messageStatusCollection = (MessageStatusCollection) o;
    return Objects.equals(this.link, messageStatusCollection.link) &&
        Objects.equals(this.messageStatuses, messageStatusCollection.messageStatuses) &&
        Objects.equals(this.status, messageStatusCollection.status);
  }
  @Override
  public int hashCode() {
    return Objects.hash(link, messageStatuses, status);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageStatusCollection {\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    messageStatuses: ").append(toIndentedString(messageStatuses)).append("\n");
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
       if (!MessageStatusCollection.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MessageStatusCollection' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MessageStatusCollection> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MessageStatusCollection.class));

       return (TypeAdapter<T>) new TypeAdapter<MessageStatusCollection>() {
           @Override
           public void write(JsonWriter out, MessageStatusCollection value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MessageStatusCollection read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MessageStatusCollection given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MessageStatusCollection
  * @throws IOException if the JSON string is invalid with respect to MessageStatusCollection
  */
  public static MessageStatusCollection fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MessageStatusCollection.class);
  }

 /**
  * Convert an instance of MessageStatusCollection to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

