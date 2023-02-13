package com.whispir.model;
import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.whispir.model.DistributionList;
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
 * list of distribution lists
 */

public class DistributionListCollection {
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

  @SerializedName("link")
  private List<Link> link;

  @SerializedName("distributionLists")
  private List<DistributionList> distributionLists;

  public DistributionListCollection() {
    super();
  }

  public DistributionListCollection(
    String status, 
    List<Link> link
  ) {
    this();
    this.status = status;
    this.link = link;
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
   * A [HATEOAS](https://en.wikipedia.org/wiki/HATEOAS) link array, describing all discoverable resources in relation to the original request.
   * @return link
  **/
  @javax.annotation.Nullable
  public List<Link> getLink() {
    return link;
  }

  public DistributionListCollection addDistributionListsItem(DistributionList distributionListsItem) {
    if (this.distributionLists == null) {
      this.distributionLists = new ArrayList<>();
    }
    this.distributionLists.add(distributionListsItem);
    return this;
  }

   /**
   * List of distribution lists
   * @return distributionLists
  **/
  @javax.annotation.Nullable
  public List<DistributionList> getDistributionLists() {
    return distributionLists;
  }
  public void setDistributionLists(List<DistributionList> distributionLists) {
    this.distributionLists = distributionLists;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DistributionListCollection distributionListCollection = (DistributionListCollection) o;
    return Objects.equals(this.status, distributionListCollection.status) &&
        Objects.equals(this.link, distributionListCollection.link) &&
        Objects.equals(this.distributionLists, distributionListCollection.distributionLists);
  }
  @Override
  public int hashCode() {
    return Objects.hash(status, link, distributionLists);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DistributionListCollection {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    distributionLists: ").append(toIndentedString(distributionLists)).append("\n");
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
       if (!DistributionListCollection.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DistributionListCollection' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DistributionListCollection> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DistributionListCollection.class));

       return (TypeAdapter<T>) new TypeAdapter<DistributionListCollection>() {
           @Override
           public void write(JsonWriter out, DistributionListCollection value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DistributionListCollection read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DistributionListCollection given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DistributionListCollection
  * @throws IOException if the JSON string is invalid with respect to DistributionListCollection
  */
  public static DistributionListCollection fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DistributionListCollection.class);
  }

 /**
  * Convert an instance of DistributionListCollection to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

