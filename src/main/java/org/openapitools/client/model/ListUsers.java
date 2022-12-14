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
 * List users response object
 */
@ApiModel(description = "List users response object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-14T10:37:13.711751+10:00[Australia/Melbourne]")
public class ListUsers {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_COMPANY_NAME = "companyName";
  @SerializedName(SERIALIZED_NAME_COMPANY_NAME)
  private String companyName;

  public static final String SERIALIZED_NAME_WORK_EMAIL_ADDRESS1 = "workEmailAddress1";
  @SerializedName(SERIALIZED_NAME_WORK_EMAIL_ADDRESS1)
  private String workEmailAddress1;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private List<LinkInner> link = null;

  public ListUsers() { 
  }

  
  public ListUsers(
     String id, 
     String firstName, 
     String lastName, 
     String companyName, 
     String workEmailAddress1, 
     List<LinkInner> link
  ) {
    this();
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.companyName = companyName;
    this.workEmailAddress1 = workEmailAddress1;
    this.link = link;
  }

   /**
   * The ID of the user.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "4DC922649AFE370C", required = true, value = "The ID of the user.")

  public String getId() {
    return id;
  }




   /**
   * The first name of the user.
   * @return firstName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "John", required = true, value = "The first name of the user.")

  public String getFirstName() {
    return firstName;
  }




   /**
   * The last name of the user.
   * @return lastName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Wick", required = true, value = "The last name of the user.")

  public String getLastName() {
    return lastName;
  }




   /**
   * The company name of the user.
   * @return companyName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Whispir", required = true, value = "The company name of the user.")

  public String getCompanyName() {
    return companyName;
  }




   /**
   * The primary work email address of the user.
   * @return workEmailAddress1
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "testUser@example.com", required = true, value = "The primary work email address of the user.")

  public String getWorkEmailAddress1() {
    return workEmailAddress1;
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
    ListUsers listUsers = (ListUsers) o;
    return Objects.equals(this.id, listUsers.id) &&
        Objects.equals(this.firstName, listUsers.firstName) &&
        Objects.equals(this.lastName, listUsers.lastName) &&
        Objects.equals(this.companyName, listUsers.companyName) &&
        Objects.equals(this.workEmailAddress1, listUsers.workEmailAddress1) &&
        Objects.equals(this.link, listUsers.link);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstName, lastName, companyName, workEmailAddress1, link);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListUsers {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    workEmailAddress1: ").append(toIndentedString(workEmailAddress1)).append("\n");
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
    openapiFields.add("firstName");
    openapiFields.add("lastName");
    openapiFields.add("companyName");
    openapiFields.add("workEmailAddress1");
    openapiFields.add("link");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("firstName");
    openapiRequiredFields.add("lastName");
    openapiRequiredFields.add("companyName");
    openapiRequiredFields.add("workEmailAddress1");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListUsers
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ListUsers.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListUsers is not found in the empty JSON string", ListUsers.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListUsers.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListUsers` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ListUsers.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("firstName") != null && !jsonObj.get("firstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstName").toString()));
      }
      if (jsonObj.get("lastName") != null && !jsonObj.get("lastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastName").toString()));
      }
      if (jsonObj.get("companyName") != null && !jsonObj.get("companyName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `companyName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("companyName").toString()));
      }
      if (jsonObj.get("workEmailAddress1") != null && !jsonObj.get("workEmailAddress1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `workEmailAddress1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("workEmailAddress1").toString()));
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
       if (!ListUsers.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListUsers' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListUsers> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListUsers.class));

       return (TypeAdapter<T>) new TypeAdapter<ListUsers>() {
           @Override
           public void write(JsonWriter out, ListUsers value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListUsers read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListUsers given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListUsers
  * @throws IOException if the JSON string is invalid with respect to ListUsers
  */
  public static ListUsers fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListUsers.class);
  }

 /**
  * Convert an instance of ListUsers to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

