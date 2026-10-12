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
 * DistributionListCollectionDistributionListsInner
 */

public class DistributionListCollectionDistributionListsInner {
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

  @SerializedName("mri")
  private String mri;

  @SerializedName("description")
  private String description;

  @SerializedName("memberCount")
  private String memberCount;

  @SerializedName("link")
  private List<Link> link;

  @SerializedName("access")
  private String access;

  @SerializedName("visibility")
  private String visibility;

  public DistributionListCollectionDistributionListsInner() {
    super();
  }

  public DistributionListCollectionDistributionListsInner(
    String id, 
    String name, 
    String mri, 
    String description, 
    String memberCount, 
    List<Link> link
  ) {
    this();
    this.id = id;
    this.name = name;
    this.mri = mri;
    this.description = description;
    this.memberCount = memberCount;
    this.link = link;
  }
   /**
   * ID of the distribution list
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }
   /**
   * Specifies the name of the distribution list. This has to be unique, and should not contain any special characters (except spaces) in it
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }
   /**
   * Specifies the Message Resource Identifier of the Distribution List in Whispir 
   * @return mri
  **/
  @javax.annotation.Nullable
  public String getMri() {
    return mri;
  }
   /**
   * Specifies a description for other users to see what this distribution list should be used for. 
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }
   /**
   * Total number of contacts in a Distribution List 
   * @return memberCount
  **/
  @javax.annotation.Nullable
  public String getMemberCount() {
    return memberCount;
  }
   /**
   * A [HATEOAS](https://en.wikipedia.org/wiki/HATEOAS) link array, describing all discoverable resources in relation to the original request.
   * @return link
  **/
  @javax.annotation.Nullable
  public List<Link> getLink() {
    return link;
  }

   /**
   * Allows you to specify the access type for this DL  Open: anyone can subscribe to this distribution list via the Whispir Contact Portal ByApproval: anyone can subscribe using the Whispir Contact Portal. However, they are not officially on the list until their access is approved Restricted: the distribution list is not visible in the Whispir Contact Portal
   * @return access
  **/
  @javax.annotation.Nullable
  public String getAccess() {
    return access;
  }
  public void setAccess(String access) {
    this.access = access;
  }

   /**
   * Allows you to specify the visibility for this DL  Public: Any user or active contact in any workspace can map themselves to this DL in the Whispir Contact Portal Private: Only users or active contacts in the current workspace can map themselves to this DL
   * @return visibility
  **/
  @javax.annotation.Nullable
  public String getVisibility() {
    return visibility;
  }
  public void setVisibility(String visibility) {
    this.visibility = visibility;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DistributionListCollectionDistributionListsInner distributionListCollectionDistributionListsInner = (DistributionListCollectionDistributionListsInner) o;
    return Objects.equals(this.id, distributionListCollectionDistributionListsInner.id) &&
        Objects.equals(this.name, distributionListCollectionDistributionListsInner.name) &&
        Objects.equals(this.mri, distributionListCollectionDistributionListsInner.mri) &&
        Objects.equals(this.description, distributionListCollectionDistributionListsInner.description) &&
        Objects.equals(this.memberCount, distributionListCollectionDistributionListsInner.memberCount) &&
        Objects.equals(this.link, distributionListCollectionDistributionListsInner.link) &&
        Objects.equals(this.access, distributionListCollectionDistributionListsInner.access) &&
        Objects.equals(this.visibility, distributionListCollectionDistributionListsInner.visibility);
  }
  @Override
  public int hashCode() {
    return Objects.hash(id, name, mri, description, memberCount, link, access, visibility);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DistributionListCollectionDistributionListsInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    mri: ").append(toIndentedString(mri)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    memberCount: ").append(toIndentedString(memberCount)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
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
       if (!DistributionListCollectionDistributionListsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DistributionListCollectionDistributionListsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DistributionListCollectionDistributionListsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DistributionListCollectionDistributionListsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<DistributionListCollectionDistributionListsInner>() {
           @Override
           public void write(JsonWriter out, DistributionListCollectionDistributionListsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DistributionListCollectionDistributionListsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DistributionListCollectionDistributionListsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DistributionListCollectionDistributionListsInner
  * @throws IOException if the JSON string is invalid with respect to DistributionListCollectionDistributionListsInner
  */
  public static DistributionListCollectionDistributionListsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DistributionListCollectionDistributionListsInner.class);
  }

 /**
  * Convert an instance of DistributionListCollectionDistributionListsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

