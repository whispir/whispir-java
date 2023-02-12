package com.whispir.model;
import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.whispir.model.DistributionListContacts;
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
 * Static Distribution Lists are manually managed and maintained. They can include Contacts, Users and other Distribution Lists
 */

public class DistributionList {
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

  @SerializedName("mri")
  private String mri;

  @SerializedName("distlistdetails")
  private List<DistributionListContacts> distlistdetails;

  @SerializedName("link")
  private List<Link> link;

  @SerializedName("name")
  private String name;

  @SerializedName("description")
  private String description;

  @SerializedName("memberCount")
  private String memberCount;

  @SerializedName("access")
  private String access;

  @SerializedName("visibility")
  private String visibility;

  @SerializedName("contactIds")
  private String contactIds;

  @SerializedName("userIds")
  private String userIds;

  @SerializedName("distListIds")
  private String distListIds;

  @SerializedName("type")
  private String type;

  @SerializedName("rules")
  private String rules;

  public DistributionList() {
    super();
  }

  public DistributionList(
    String id, 
    String mri, 
    List<DistributionListContacts> distlistdetails, 
    List<Link> link
  ) {
    this();
    this.id = id;
    this.mri = mri;
    this.distlistdetails = distlistdetails;
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
   * Specifies the Message Resource Identifier of the Distribution List in Whispir
   * @return mri
  **/
  @javax.annotation.Nullable
  public String getMri() {
    return mri;
  }
   /**
   * Details of Contacts included in the Distribution List
   * @return distlistdetails
  **/
  @javax.annotation.Nullable
  public List<DistributionListContacts> getDistlistdetails() {
    return distlistdetails;
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
   * Specifies the name of the distribution list. This has to be unique, and should not contain any special characters (except spaces) in it
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

   /**
   * Specifies a description for other users to see what this distribution list should be used for.
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

   /**
   * Total number of contacts in a Distribution List
   * @return memberCount
  **/
  @javax.annotation.Nullable
  public String getMemberCount() {
    return memberCount;
  }
  public void setMemberCount(String memberCount) {
    this.memberCount = memberCount;
  }

   /**
   * Allows you to specify the access type for this DL  - Open: anyone can subscribe to this distribution list via the Whispir Contact Portal - ByApproval: anyone can subscribe using the Whispir Contact Portal. However, they are not officially on the list until their access is approved - Restricted: the distribution list is not visible in the Whispir Contact Portal
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
   * Allows you to specify the visibility for this DL  - Public: Any user or active contact in any workspace can map themselves to this DL in the Whispir Contact Portal - Private: Only users or active contacts in the current workspace can map themselves to this DL
   * @return visibility
  **/
  @javax.annotation.Nullable
  public String getVisibility() {
    return visibility;
  }
  public void setVisibility(String visibility) {
    this.visibility = visibility;
  }

   /**
   * Comma separated list of Contacts to be associated to this DL. This information can be provided at the time of the DL creation or updated later via a PUT request
   * @return contactIds
  **/
  @javax.annotation.Nullable
  public String getContactIds() {
    return contactIds;
  }
  public void setContactIds(String contactIds) {
    this.contactIds = contactIds;
  }

   /**
   * Comma separated list of userIds who can manage this DL. This information can be provided at the time of the DL creation or also later updated via a PUT request
   * @return userIds
  **/
  @javax.annotation.Nullable
  public String getUserIds() {
    return userIds;
  }
  public void setUserIds(String userIds) {
    this.userIds = userIds;
  }

   /**
   * Comma separated list of Distribution List IDs that can be nested under this DL. This information can be provided at the time of the DL creation or later updated via a PUT request
   * @return distListIds
  **/
  @javax.annotation.Nullable
  public String getDistListIds() {
    return distListIds;
  }
  public void setDistListIds(String distListIds) {
    this.distListIds = distListIds;
  }

   /**
   * Allows you to specify the type for this DL  - Static: The contacts on the list don’t change unless you manually add or remove them (unlike a dynamic DL)  NOTE: \&quot;static\&quot; is also the default value for this parameter when this field is omitted
   * @return type
  **/
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

   /**
   * Present when &#x60;type&#x60; is &#x60;dynamic&#x60;.  The array that specify the rules that should be applied on the entityType values to pick the appropriate contacts at the moment of usage [not creation]  Each rule is an object with 3 keys in it. At least one rule must be specified when creating a Dynamic Distribution List  - ruleFilter: contains any of the contact profile elements that are available for searching. For example, division, department, role. More details on the values for this field can be found below [required] - ruleFilterActualName: Contains the matching string to be compared for the DL. More details on the the values for this field can be found below [required] - ruleContent: Contains the matching string to be compared with the contact element for being a part of the DL [required]
   * @return rules
  **/
  @javax.annotation.Nullable
  public String getRules() {
    return rules;
  }
  public void setRules(String rules) {
    this.rules = rules;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DistributionList distributionList = (DistributionList) o;
    return Objects.equals(this.id, distributionList.id) &&
        Objects.equals(this.mri, distributionList.mri) &&
        Objects.equals(this.distlistdetails, distributionList.distlistdetails) &&
        Objects.equals(this.link, distributionList.link) &&
        Objects.equals(this.name, distributionList.name) &&
        Objects.equals(this.description, distributionList.description) &&
        Objects.equals(this.memberCount, distributionList.memberCount) &&
        Objects.equals(this.access, distributionList.access) &&
        Objects.equals(this.visibility, distributionList.visibility) &&
        Objects.equals(this.contactIds, distributionList.contactIds) &&
        Objects.equals(this.userIds, distributionList.userIds) &&
        Objects.equals(this.distListIds, distributionList.distListIds) &&
        Objects.equals(this.type, distributionList.type) &&
        Objects.equals(this.rules, distributionList.rules);
  }
  @Override
  public int hashCode() {
    return Objects.hash(id, mri, distlistdetails, link, name, description, memberCount, access, visibility, contactIds, userIds, distListIds, type, rules);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DistributionList {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mri: ").append(toIndentedString(mri)).append("\n");
    sb.append("    distlistdetails: ").append(toIndentedString(distlistdetails)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    memberCount: ").append(toIndentedString(memberCount)).append("\n");
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    contactIds: ").append(toIndentedString(contactIds)).append("\n");
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
    sb.append("    distListIds: ").append(toIndentedString(distListIds)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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
       if (!DistributionList.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DistributionList' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DistributionList> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DistributionList.class));

       return (TypeAdapter<T>) new TypeAdapter<DistributionList>() {
           @Override
           public void write(JsonWriter out, DistributionList value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DistributionList read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DistributionList given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DistributionList
  * @throws IOException if the JSON string is invalid with respect to DistributionList
  */
  public static DistributionList fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DistributionList.class);
  }

 /**
  * Convert an instance of DistributionList to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

