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
 * Workspaces allow application developers to create new work areas for the varying use cases of their application. For example they can be associated to the different business units of a company, so to silo the data of the different departments. In fact, the information, assets, contacts and actions performed in a workspace can’t be accessed from another one. This allows the applications to be independent and audited effectively with proper permissions and keys.  Each of these work areas provides different functionalities - such as creating messages, executing scenarios or viewing distribution lists - and can be governed by user permissions. Users can be assigned access to these workspaces to restrict the control of information as needed.  Every account on creation is given a default workspace called \&quot;My Company\&quot; but it is possible to create multiple workspaces suited for each application need. There is no limit on the number of workspaces.
 */

public class Workspace {
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

  @SerializedName("link")
  private List<Link> link;

  @SerializedName("projectName")
  private String projectName;

  @SerializedName("projectNumber")
  private String projectNumber;

  @SerializedName("status")
  private String status;

  @SerializedName("billingcostcentre")
  private String billingcostcentre;

  public Workspace() {
    super();
  }

  public Workspace(
    String id, 
    List<Link> link
  ) {
    this();
    this.id = id;
    this.link = link;
  }
   /**
   * Specifies the ID for the workspace that has been created
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
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
   * Specifies the name of the Workspace to be created.
   * @return projectName
  **/
  @javax.annotation.Nonnull
  public String getProjectName() {
    return projectName;
  }
  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

   /**
   * Specifies the reference ID for the workspace from the User Side. Generally not used. Note:This is not the actual workspace ID. It is just a custom reference ID given by you for your own purposes.
   * @return projectNumber
  **/
  @javax.annotation.Nullable
  public String getProjectNumber() {
    return projectNumber;
  }
  public void setProjectNumber(String projectNumber) {
    this.projectNumber = projectNumber;
  }

   /**
   * Specifies the status of the Workspace being created. The status can be one of - 1) Active (A) 2)Disabled (D)
   * @return status
  **/
  @javax.annotation.Nonnull
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

   /**
   * Only applicable to customers with the Billing Cost Centre Module enabled. Allows the user to set a billing cost centre for the Workspace.
   * @return billingcostcentre
  **/
  @javax.annotation.Nullable
  public String getBillingcostcentre() {
    return billingcostcentre;
  }
  public void setBillingcostcentre(String billingcostcentre) {
    this.billingcostcentre = billingcostcentre;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Workspace workspace = (Workspace) o;
    return Objects.equals(this.id, workspace.id) &&
        Objects.equals(this.link, workspace.link) &&
        Objects.equals(this.projectName, workspace.projectName) &&
        Objects.equals(this.projectNumber, workspace.projectNumber) &&
        Objects.equals(this.status, workspace.status) &&
        Objects.equals(this.billingcostcentre, workspace.billingcostcentre);
  }
  @Override
  public int hashCode() {
    return Objects.hash(id, link, projectName, projectNumber, status, billingcostcentre);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Workspace {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    projectNumber: ").append(toIndentedString(projectNumber)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    billingcostcentre: ").append(toIndentedString(billingcostcentre)).append("\n");
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
       if (!Workspace.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Workspace' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Workspace> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Workspace.class));

       return (TypeAdapter<T>) new TypeAdapter<Workspace>() {
           @Override
           public void write(JsonWriter out, Workspace value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Workspace read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Workspace given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Workspace
  * @throws IOException if the JSON string is invalid with respect to Workspace
  */
  public static Workspace fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Workspace.class);
  }

 /**
  * Convert an instance of Workspace to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

