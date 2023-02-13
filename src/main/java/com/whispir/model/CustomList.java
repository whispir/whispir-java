package com.whispir.model;
import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.whispir.model.Link;
import com.whispir.model.ListLabel;
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
 * A custom list is a predefined list of options that can be inserted into a message or template. A list might be made up of capital city names, days of the week, incident types, business phone numbers and so on. Custom lists make it easy to add information quickly and consistently to your message content.
 */

public class CustomList {
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

  @SerializedName("type")
  private String type;

  @SerializedName("createdDate")
  private String createdDate;

  @SerializedName("sortType")
  private String sortType;

  @SerializedName("linked")
  private String linked;

  @SerializedName("customlabellists")
  private List<ListLabel> customlabellists;

  @SerializedName("link")
  private List<Link> link;

  public CustomList() {
    super();
  }

  public CustomList(
    String id, 
    String name, 
    String type, 
    String createdDate, 
    String sortType, 
    String linked, 
    List<ListLabel> customlabellists, 
    List<Link> link
  ) {
    this();
    this.id = id;
    this.name = name;
    this.type = type;
    this.createdDate = createdDate;
    this.sortType = sortType;
    this.linked = linked;
    this.customlabellists = customlabellists;
    this.link = link;
  }
   /**
   * Specifies the unique ID of the list
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }
   /**
   * Specifies the name of the list
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }
   /**
   * Specifies the type
   * @return type
  **/
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }
   /**
   * Specifies the creation date of the list
   * @return createdDate
  **/
  @javax.annotation.Nullable
  public String getCreatedDate() {
    return createdDate;
  }
   /**
   * Specifies the sorting order
   * @return sortType
  **/
  @javax.annotation.Nullable
  public String getSortType() {
    return sortType;
  }
   /**
   * Specifies the linked status. When enabled the value selected for one channel is automatically applied on the other channels.
   * @return linked
  **/
  @javax.annotation.Nullable
  public String getLinked() {
    return linked;
  }
   /**
   * Contains the individual items that make up this list
   * @return customlabellists
  **/
  @javax.annotation.Nullable
  public List<ListLabel> getCustomlabellists() {
    return customlabellists;
  }
   /**
   * A [HATEOAS](https://en.wikipedia.org/wiki/HATEOAS) link array, describing all discoverable resources in relation to the original request.
   * @return link
  **/
  @javax.annotation.Nullable
  public List<Link> getLink() {
    return link;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomList customList = (CustomList) o;
    return Objects.equals(this.id, customList.id) &&
        Objects.equals(this.name, customList.name) &&
        Objects.equals(this.type, customList.type) &&
        Objects.equals(this.createdDate, customList.createdDate) &&
        Objects.equals(this.sortType, customList.sortType) &&
        Objects.equals(this.linked, customList.linked) &&
        Objects.equals(this.customlabellists, customList.customlabellists) &&
        Objects.equals(this.link, customList.link);
  }
  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, createdDate, sortType, linked, customlabellists, link);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomList {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    sortType: ").append(toIndentedString(sortType)).append("\n");
    sb.append("    linked: ").append(toIndentedString(linked)).append("\n");
    sb.append("    customlabellists: ").append(toIndentedString(customlabellists)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
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
       if (!CustomList.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomList' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomList> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomList.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomList>() {
           @Override
           public void write(JsonWriter out, CustomList value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomList read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomList given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomList
  * @throws IOException if the JSON string is invalid with respect to CustomList
  */
  public static CustomList fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomList.class);
  }

 /**
  * Convert an instance of CustomList to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

