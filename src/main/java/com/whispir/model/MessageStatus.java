package com.whispir.model;
import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.whispir.model.DeliveryCategory;
import com.whispir.model.DeliveryStatus;
import com.whispir.model.Link;
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
 * MessageStatus
 */

public class MessageStatus {
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

  @SerializedName("categories")
  private Set<DeliveryCategory> categories;

  @SerializedName("name")
  private String name;

  @SerializedName("info")
  private String info;

  @SerializedName("status")
  private Set<DeliveryStatus> status;

  public MessageStatus() {
    super();
  }

  public MessageStatus(
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

  public MessageStatus addCategoriesItem(DeliveryCategory categoriesItem) {
    if (this.categories == null) {
      this.categories = new LinkedHashSet<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * Present when &#x60;view&#x60; is &#x60;summary&#x60;.
   * @return categories
  **/
  @javax.annotation.Nullable
  public Set<DeliveryCategory> getCategories() {
    return categories;
  }
  public void setCategories(Set<DeliveryCategory> categories) {
    this.categories = categories;
  }

   /**
   * Present when &#x60;view&#x60; is &#x60;detailed&#x60;.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

   /**
   * Present when &#x60;view&#x60; is &#x60;detailed&#x60;.
   * @return info
  **/
  @javax.annotation.Nullable
  public String getInfo() {
    return info;
  }
  public void setInfo(String info) {
    this.info = info;
  }

  public MessageStatus addStatusItem(DeliveryStatus statusItem) {
    if (this.status == null) {
      this.status = new LinkedHashSet<>();
    }
    this.status.add(statusItem);
    return this;
  }

   /**
   * Present when &#x60;view&#x60; is &#x60;detailed&#x60;.
   * @return status
  **/
  @javax.annotation.Nullable
  public Set<DeliveryStatus> getStatus() {
    return status;
  }
  public void setStatus(Set<DeliveryStatus> status) {
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
    MessageStatus messageStatus = (MessageStatus) o;
    return Objects.equals(this.link, messageStatus.link) &&
        Objects.equals(this.categories, messageStatus.categories) &&
        Objects.equals(this.name, messageStatus.name) &&
        Objects.equals(this.info, messageStatus.info) &&
        Objects.equals(this.status, messageStatus.status);
  }
  @Override
  public int hashCode() {
    return Objects.hash(link, categories, name, info, status);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageStatus {\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
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
       if (!MessageStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MessageStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MessageStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MessageStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<MessageStatus>() {
           @Override
           public void write(JsonWriter out, MessageStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MessageStatus read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MessageStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MessageStatus
  * @throws IOException if the JSON string is invalid with respect to MessageStatus
  */
  public static MessageStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MessageStatus.class);
  }

 /**
  * Convert an instance of MessageStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

