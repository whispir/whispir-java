/*
 * Whispir Platform API
 * Whispir Platform API for cross channel and multi channel communications. Documentation on each endpoint is available at https://developers.whispir.com.
 *
 * The version of the OpenAPI document: 1.1.2
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
 * Dynamic Distribution Lists are lists that are updated based on rules to automatically determine and update the members. For this reason - unlike the Static Distribution Lists - we don&#39;t need to specify any members because only the rule[s] will determine the members of a Dynamic Distribution List
 */
@ApiModel(description = "Dynamic Distribution Lists are lists that are updated based on rules to automatically determine and update the members. For this reason - unlike the Static Distribution Lists - we don't need to specify any members because only the rule[s] will determine the members of a Dynamic Distribution List")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-22T09:38:29.014059Z[Etc/UTC]")
public class Dynamicdistributionlist {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ACCESS = "access";
  @SerializedName(SERIALIZED_NAME_ACCESS)
  private String access;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type = "static";

  public static final String SERIALIZED_NAME_ENTITY_TYPE = "entityType";
  @SerializedName(SERIALIZED_NAME_ENTITY_TYPE)
  private String entityType;

  public static final String SERIALIZED_NAME_VISIBILITY = "visibility";
  @SerializedName(SERIALIZED_NAME_VISIBILITY)
  private String visibility;

  public static final String SERIALIZED_NAME_RULES = "rules";
  @SerializedName(SERIALIZED_NAME_RULES)
  private String rules;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private List<LinkInner> link = null;

  public Dynamicdistributionlist() { 
  }

  
  public Dynamicdistributionlist(
     List<LinkInner> link
  ) {
    this();
    this.link = link;
  }

  public Dynamicdistributionlist name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Specifies the name of the distribution list. This has to be unique, and should not contain any special characters (except spaces) in it
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "My Distribution List", required = true, value = "Specifies the name of the distribution list. This has to be unique, and should not contain any special characters (except spaces) in it")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Dynamicdistributionlist description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Specifies a description for other users to see what this distribution list should be used for.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "My Distribution list", value = "Specifies a description for other users to see what this distribution list should be used for.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Dynamicdistributionlist access(String access) {
    
    this.access = access;
    return this;
  }

   /**
   * Allows you to specify the access type for this DL  - Open: anyone can subscribe to this distribution list via the Whispir Contact Portal - ByApproval: anyone can subscribe using the Whispir Contact Portal. However, they are not officially on the list until their access is approved - Restricted: the distribution list is not visible in the Whispir Contact Portal
   * @return access
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Open", required = true, value = "Allows you to specify the access type for this DL  - Open: anyone can subscribe to this distribution list via the Whispir Contact Portal - ByApproval: anyone can subscribe using the Whispir Contact Portal. However, they are not officially on the list until their access is approved - Restricted: the distribution list is not visible in the Whispir Contact Portal")

  public String getAccess() {
    return access;
  }


  public void setAccess(String access) {
    this.access = access;
  }


  public Dynamicdistributionlist type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Allows you to specify the type for this DL  - Static: The contacts on the list don’t change unless you manually add or remove them (unlike a dynamic DL)  NOTE: \&quot;static\&quot; is also the default value for this parameter when this field is omitted
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "static", required = true, value = "Allows you to specify the type for this DL  - Static: The contacts on the list don’t change unless you manually add or remove them (unlike a dynamic DL)  NOTE: \"static\" is also the default value for this parameter when this field is omitted")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public Dynamicdistributionlist entityType(String entityType) {
    
    this.entityType = entityType;
    return this;
  }

   /**
   * The value is currently strictly limited to \&quot;contact\&quot;
   * @return entityType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Contact", required = true, value = "The value is currently strictly limited to \"contact\"")

  public String getEntityType() {
    return entityType;
  }


  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }


  public Dynamicdistributionlist visibility(String visibility) {
    
    this.visibility = visibility;
    return this;
  }

   /**
   * Allows you to specify the visibility for this DL  - Public: Any user or active contact in any workspace can map themselves to this DL in the Whispir Contact Portal - Private: Only users or active contacts in the current workspace can map themselves to this DL
   * @return visibility
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Public", required = true, value = "Allows you to specify the visibility for this DL  - Public: Any user or active contact in any workspace can map themselves to this DL in the Whispir Contact Portal - Private: Only users or active contacts in the current workspace can map themselves to this DL")

  public String getVisibility() {
    return visibility;
  }


  public void setVisibility(String visibility) {
    this.visibility = visibility;
  }


  public Dynamicdistributionlist rules(String rules) {
    
    this.rules = rules;
    return this;
  }

   /**
   * The array that specify the rules that should be applied on the entityType values to pick the appropriate contacts at the moment of usage [not creation]  Each rule is an object with 3 keys in it. At least one rule must be specified when creating a Dynamic Distribution List  - ruleFilter: contains any of the contact profile elements that are available for searching. For example, division, department, role. More details on the values for this field can be found below [required] - ruleFilterActualName: Contains the matching string to be compared for the DL. More details on the the values for this field can be found below [required] - ruleContent: Contains the matching string to be compared with the contact element for being a part of the DL [required]
   * @return rules
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "[{\"ruleFilter\" : \"division\", \"ruleFilterActualName\" : \"Division\", \"ruleContent\" : \"sales\"}]", required = true, value = "The array that specify the rules that should be applied on the entityType values to pick the appropriate contacts at the moment of usage [not creation]  Each rule is an object with 3 keys in it. At least one rule must be specified when creating a Dynamic Distribution List  - ruleFilter: contains any of the contact profile elements that are available for searching. For example, division, department, role. More details on the values for this field can be found below [required] - ruleFilterActualName: Contains the matching string to be compared for the DL. More details on the the values for this field can be found below [required] - ruleContent: Contains the matching string to be compared with the contact element for being a part of the DL [required]")

  public String getRules() {
    return rules;
  }


  public void setRules(String rules) {
    this.rules = rules;
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
    Dynamicdistributionlist dynamicdistributionlist = (Dynamicdistributionlist) o;
    return Objects.equals(this.name, dynamicdistributionlist.name) &&
        Objects.equals(this.description, dynamicdistributionlist.description) &&
        Objects.equals(this.access, dynamicdistributionlist.access) &&
        Objects.equals(this.type, dynamicdistributionlist.type) &&
        Objects.equals(this.entityType, dynamicdistributionlist.entityType) &&
        Objects.equals(this.visibility, dynamicdistributionlist.visibility) &&
        Objects.equals(this.rules, dynamicdistributionlist.rules) &&
        Objects.equals(this.link, dynamicdistributionlist.link);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, access, type, entityType, visibility, rules, link);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dynamicdistributionlist {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("access");
    openapiFields.add("type");
    openapiFields.add("entityType");
    openapiFields.add("visibility");
    openapiFields.add("rules");
    openapiFields.add("link");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("access");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("entityType");
    openapiRequiredFields.add("visibility");
    openapiRequiredFields.add("rules");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Dynamicdistributionlist
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Dynamicdistributionlist.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Dynamicdistributionlist is not found in the empty JSON string", Dynamicdistributionlist.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Dynamicdistributionlist.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Dynamicdistributionlist` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Dynamicdistributionlist.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (jsonObj.get("access") != null && !jsonObj.get("access").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access").toString()));
      }
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (jsonObj.get("entityType") != null && !jsonObj.get("entityType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entityType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entityType").toString()));
      }
      if (jsonObj.get("visibility") != null && !jsonObj.get("visibility").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `visibility` to be a primitive type in the JSON string but got `%s`", jsonObj.get("visibility").toString()));
      }
      if (jsonObj.get("rules") != null && !jsonObj.get("rules").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rules` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rules").toString()));
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
       if (!Dynamicdistributionlist.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Dynamicdistributionlist' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Dynamicdistributionlist> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Dynamicdistributionlist.class));

       return (TypeAdapter<T>) new TypeAdapter<Dynamicdistributionlist>() {
           @Override
           public void write(JsonWriter out, Dynamicdistributionlist value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Dynamicdistributionlist read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Dynamicdistributionlist given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Dynamicdistributionlist
  * @throws IOException if the JSON string is invalid with respect to Dynamicdistributionlist
  */
  public static Dynamicdistributionlist fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Dynamicdistributionlist.class);
  }

 /**
  * Convert an instance of Dynamicdistributionlist to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

