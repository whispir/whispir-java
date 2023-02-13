package com.whispir.model;
import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.whispir.model.CustomList;
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
 * List of custom lists
 */

public class CustomListCollection {
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

  @SerializedName("customlabels")
  private List<CustomList> customlabels;

  public CustomListCollection() {
    super();
  }

  public CustomListCollection(
    String status, 
    List<CustomList> customlabels
  ) {
    this();
    this.status = status;
    this.customlabels = customlabels;
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
   * A list of custom lists
   * @return customlabels
  **/
  @javax.annotation.Nullable
  public List<CustomList> getCustomlabels() {
    return customlabels;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomListCollection customListCollection = (CustomListCollection) o;
    return Objects.equals(this.status, customListCollection.status) &&
        Objects.equals(this.customlabels, customListCollection.customlabels);
  }
  @Override
  public int hashCode() {
    return Objects.hash(status, customlabels);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomListCollection {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    customlabels: ").append(toIndentedString(customlabels)).append("\n");
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
       if (!CustomListCollection.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomListCollection' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomListCollection> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomListCollection.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomListCollection>() {
           @Override
           public void write(JsonWriter out, CustomListCollection value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomListCollection read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomListCollection given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomListCollection
  * @throws IOException if the JSON string is invalid with respect to CustomListCollection
  */
  public static CustomListCollection fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomListCollection.class);
  }

 /**
  * Convert an instance of CustomListCollection to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

