/*
 * Whispir Platform API
 * Whispir Platform API for cross channel and multi channel communications. Documentation on each endpoint is available at https://developers.whispir.com.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@whispir.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.LinkInner;

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
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import whispir_sdk_java.JSON;

/**
 * When you’re creating a resource, the following conditions apply:  - Maximum of 10 MB per file being uploaded - Transactions have an enforced timeout - Resources are available in the Whispir platform for a limited time [90 days]. After this time they are automatically cleaned. This is a configurable setting for Whispir Administrators
 */
@ApiModel(description = "When you’re creating a resource, the following conditions apply:  - Maximum of 10 MB per file being uploaded - Transactions have an enforced timeout - Resources are available in the Whispir platform for a limited time [90 days]. After this time they are automatically cleaned. This is a configurable setting for Whispir Administrators")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-14T10:37:13.711751+10:00[Australia/Melbourne]")
public class Resource {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * Specifies the permission scope of the file being uploaded. The scope defines the access restriction of the resource. It can only be one of the following:  - **public**: Public files have an addressable URL and are available publicly - **private**: Private files have no URL and are only available for bulk messaging purposes and for importing contacts
   */
  @JsonAdapter(ScopeEnum.Adapter.class)
  public enum ScopeEnum {
    PRIVATE("private"),
    
    PUBLIC("public");

    private String value;

    ScopeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ScopeEnum fromValue(String value) {
      for (ScopeEnum b : ScopeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ScopeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ScopeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ScopeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ScopeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private ScopeEnum scope;

  public static final String SERIALIZED_NAME_MIME_TYPE = "mimeType";
  @SerializedName(SERIALIZED_NAME_MIME_TYPE)
  private String mimeType;

  public static final String SERIALIZED_NAME_DEREF_URI = "derefUri";
  @SerializedName(SERIALIZED_NAME_DEREF_URI)
  private String derefUri;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private List<LinkInner> link = null;

  public Resource() { 
  }

  
  public Resource(
     String id, 
     List<LinkInner> link
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
  @ApiModelProperty(example = "9B9E2425AAFEEE49E9D9112B6BAC22A9", value = "The identifier for the resource.")

  public String getId() {
    return id;
  }




  public Resource name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Specifies the name of the file being uploaded. The extension of the file too is allowed to be present in the name.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "sample.json", required = true, value = "Specifies the name of the file being uploaded. The extension of the file too is allowed to be present in the name.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Resource scope(ScopeEnum scope) {
    
    this.scope = scope;
    return this;
  }

   /**
   * Specifies the permission scope of the file being uploaded. The scope defines the access restriction of the resource. It can only be one of the following:  - **public**: Public files have an addressable URL and are available publicly - **private**: Private files have no URL and are only available for bulk messaging purposes and for importing contacts
   * @return scope
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the permission scope of the file being uploaded. The scope defines the access restriction of the resource. It can only be one of the following:  - **public**: Public files have an addressable URL and are available publicly - **private**: Private files have no URL and are only available for bulk messaging purposes and for importing contacts")

  public ScopeEnum getScope() {
    return scope;
  }


  public void setScope(ScopeEnum scope) {
    this.scope = scope;
  }


  public Resource mimeType(String mimeType) {
    
    this.mimeType = mimeType;
    return this;
  }

   /**
   * The mime type of the file that is being uploaded. The type is dependent on the scope of the resource.  - **public**: Public files can be any mimetype, e.g. text/HTML or text/CSV - **private**: Private files are restricted to CSV, JSON and XML. The respective mimetypes to be used are text/csv, application/json, application/xml
   * @return mimeType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "application/json", required = true, value = "The mime type of the file that is being uploaded. The type is dependent on the scope of the resource.  - **public**: Public files can be any mimetype, e.g. text/HTML or text/CSV - **private**: Private files are restricted to CSV, JSON and XML. The respective mimetypes to be used are text/csv, application/json, application/xml")

  public String getMimeType() {
    return mimeType;
  }


  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }


  public Resource derefUri(String derefUri) {
    
    this.derefUri = derefUri;
    return this;
  }

   /**
   * The base64 representation of the file being submitted.
   * @return derefUri
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "eyAKICAgICJzYW1wbGUiOiB0cnVlCn0=", required = true, value = "The base64 representation of the file being submitted.")

  public String getDerefUri() {
    return derefUri;
  }


  public void setDerefUri(String derefUri) {
    this.derefUri = derefUri;
  }


   /**
   * A [HATEOAS](https://en.wikipedia.org/wiki/HATEOAS) link object, describing all discoverable resources in relation to the original request.
   * @return link
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A [HATEOAS](https://en.wikipedia.org/wiki/HATEOAS) link object, describing all discoverable resources in relation to the original request.")

  public List<LinkInner> getLink() {
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
    Resource resource = (Resource) o;
    return Objects.equals(this.id, resource.id) &&
        Objects.equals(this.name, resource.name) &&
        Objects.equals(this.scope, resource.scope) &&
        Objects.equals(this.mimeType, resource.mimeType) &&
        Objects.equals(this.derefUri, resource.derefUri) &&
        Objects.equals(this.link, resource.link);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, scope, mimeType, derefUri, link);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Resource {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    derefUri: ").append(toIndentedString(derefUri)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("scope");
    openapiFields.add("mimeType");
    openapiFields.add("derefUri");
    openapiFields.add("link");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("scope");
    openapiRequiredFields.add("mimeType");
    openapiRequiredFields.add("derefUri");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Resource
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Resource.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Resource is not found in the empty JSON string", Resource.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Resource.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Resource` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Resource.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("scope") != null && !jsonObj.get("scope").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scope` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scope").toString()));
      }
      if (jsonObj.get("mimeType") != null && !jsonObj.get("mimeType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mimeType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mimeType").toString()));
      }
      if (jsonObj.get("derefUri") != null && !jsonObj.get("derefUri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `derefUri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("derefUri").toString()));
      }
      JsonArray jsonArraylink = jsonObj.getAsJsonArray("link");
      if (jsonArraylink != null) {
        // ensure the json data is an array
        if (!jsonObj.get("link").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `link` to be an array in the JSON string but got `%s`", jsonObj.get("link").toString()));
        }

        // validate the optional field `link` (array)
        for (int i = 0; i < jsonArraylink.size(); i++) {
          LinkInner.validateJsonObject(jsonArraylink.get(i).getAsJsonObject());
        };
      }
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
             validateJsonObject(jsonObj);
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

