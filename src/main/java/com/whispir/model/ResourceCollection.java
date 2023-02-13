package com.whispir.model;
import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.whispir.model.Resource;
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
 * List of resources object
 */

public class ResourceCollection {
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
  @SerializedName("status")
  private String status;

  @SerializedName("resources")
  private List<Resource> resources;

  public ResourceCollection() {
    super();
  }

  public ResourceCollection(
    String status, 
    List<Resource> resources
  ) {
    this();
    this.status = status;
    this.resources = resources;
  }
   /**
   * Provides the total number of records fetched. This attribute may return \&quot;No records found\&quot; when there are no callbacks available.
   * @return status
  **/
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }
   /**
   * List of resources
   * @return resources
  **/
  @javax.annotation.Nullable
  public List<Resource> getResources() {
    return resources;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceCollection resourceCollection = (ResourceCollection) o;
    return Objects.equals(this.status, resourceCollection.status) &&
        Objects.equals(this.resources, resourceCollection.resources);
  }
  @Override
  public int hashCode() {
    return Objects.hash(status, resources);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceCollection {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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
       if (!ResourceCollection.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResourceCollection' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResourceCollection> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResourceCollection.class));

       return (TypeAdapter<T>) new TypeAdapter<ResourceCollection>() {
           @Override
           public void write(JsonWriter out, ResourceCollection value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResourceCollection read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ResourceCollection given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ResourceCollection
  * @throws IOException if the JSON string is invalid with respect to ResourceCollection
  */
  public static ResourceCollection fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResourceCollection.class);
  }

 /**
  * Convert an instance of ResourceCollection to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

