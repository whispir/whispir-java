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
 * When you’re creating a resource, the following conditions apply:  - Maximum of 10 MB per file being uploaded - Transactions have an enforced timeout - Resources are available in the Whispir platform for a limited time [90 days]. After this time they are automatically cleaned. This is a configurable setting for Whispir Administrators
 */

public class Resource {
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

  @SerializedName("name")
  private String name;

  @SerializedName("scope")
  private String scope;

  @SerializedName("mimeType")
  private String mimeType;

  @SerializedName("derefUri")
  private String derefUri;

  public Resource() {
    super();
  }

  public Resource(
    String id, 
    List<Link> link
  ) {
    this();
    this.id = id;
    this.link = link;
  }
   /**
   * The identifier for the resource.
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
   * Specifies the name of the file being uploaded. The extension of the file too is allowed to be present in the name.
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
   * Specifies the permission scope of the file being uploaded. The scope defines the access restriction of the resource. It can only be one of the following:  - **public**: Public files have an addressable URL and are available publicly - **private**: Private files have no URL and are only available for bulk messaging purposes and for importing contacts
   * @return scope
  **/
  @javax.annotation.Nonnull
  public String getScope() {
    return scope;
  }
  public void setScope(String scope) {
    this.scope = scope;
  }

   /**
   * The mime type of the file that is being uploaded. The type is dependent on the scope of the resource.  - **public**: Public files can be any mimetype, e.g. text/HTML or text/CSV - **private**: Private files are restricted to CSV, JSON and XML. The respective mimetypes to be used are text/csv, application/json, application/xml
   * @return mimeType
  **/
  @javax.annotation.Nonnull
  public String getMimeType() {
    return mimeType;
  }
  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

   /**
   * The base64 representation of the file being submitted.
   * @return derefUri
  **/
  @javax.annotation.Nonnull
  public String getDerefUri() {
    return derefUri;
  }
  public void setDerefUri(String derefUri) {
    this.derefUri = derefUri;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Resource resource = (Resource) o;
    return Objects.equals(this.id, resource.id) &&
        Objects.equals(this.link, resource.link) &&
        Objects.equals(this.name, resource.name) &&
        Objects.equals(this.scope, resource.scope) &&
        Objects.equals(this.mimeType, resource.mimeType) &&
        Objects.equals(this.derefUri, resource.derefUri);
  }
  @Override
  public int hashCode() {
    return Objects.hash(id, link, name, scope, mimeType, derefUri);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Resource {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    derefUri: ").append(toIndentedString(derefUri)).append("\n");
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
       if (!Resource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Resource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Resource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Resource.class));

       return (TypeAdapter<T>) new TypeAdapter<Resource>() {
           @Override
           public void write(JsonWriter out, Resource value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Resource read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Resource given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Resource
  * @throws IOException if the JSON string is invalid with respect to Resource
  */
  public static Resource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Resource.class);
  }

 /**
  * Convert an instance of Resource to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

