package com.whispir.model;
import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.whispir.model.Link;
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
 * DistributionListContacts
 */

public class DistributionListContacts {
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

  @SerializedName("link")
  private List<Link> link;

  public DistributionListContacts() {
    super();
  }

  public DistributionListContacts(
    String id, 
    String name, 
    String type, 
    List<Link> link
  ) {
    this();
    this.id = id;
    this.name = name;
    this.type = type;
    this.link = link;
  }
   /**
   * Id of contact
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }
   /**
   * Name of Contact
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }
   /**
   * Type of Contact
   * @return type
  **/
  @javax.annotation.Nullable
  public String getType() {
    return type;
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
    DistributionListContacts distributionListContacts = (DistributionListContacts) o;
    return Objects.equals(this.id, distributionListContacts.id) &&
        Objects.equals(this.name, distributionListContacts.name) &&
        Objects.equals(this.type, distributionListContacts.type) &&
        Objects.equals(this.link, distributionListContacts.link);
  }
  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, link);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DistributionListContacts {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
       if (!DistributionListContacts.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DistributionListContacts' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DistributionListContacts> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DistributionListContacts.class));

       return (TypeAdapter<T>) new TypeAdapter<DistributionListContacts>() {
           @Override
           public void write(JsonWriter out, DistributionListContacts value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DistributionListContacts read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DistributionListContacts given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DistributionListContacts
  * @throws IOException if the JSON string is invalid with respect to DistributionListContacts
  */
  public static DistributionListContacts fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DistributionListContacts.class);
  }

 /**
  * Convert an instance of DistributionListContacts to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

