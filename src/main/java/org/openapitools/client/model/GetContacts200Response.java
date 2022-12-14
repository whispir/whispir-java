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
import org.openapitools.client.model.Contact;

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
 * List contacts object
 */
@ApiModel(description = "List contacts object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-14T10:37:13.711751+10:00[Australia/Melbourne]")
public class GetContacts200Response {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_CONTACTS = "contacts";
  @SerializedName(SERIALIZED_NAME_CONTACTS)
  private List<Contact> contacts = null;

  public GetContacts200Response() { 
  }

  public GetContacts200Response status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Provides the total number of records fetched. This attribute may return \&quot;No records found\&quot; when there are no callbacks available.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1 to 8 of 8", value = "Provides the total number of records fetched. This attribute may return \"No records found\" when there are no callbacks available.")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public GetContacts200Response contacts(List<Contact> contacts) {
    
    this.contacts = contacts;
    return this;
  }

  public GetContacts200Response addContactsItem(Contact contactsItem) {
    if (this.contacts == null) {
      this.contacts = new ArrayList<>();
    }
    this.contacts.add(contactsItem);
    return this;
  }

   /**
   * list of contacts
   * @return contacts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "list of contacts")

  public List<Contact> getContacts() {
    return contacts;
  }


  public void setContacts(List<Contact> contacts) {
    this.contacts = contacts;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetContacts200Response getContacts200Response = (GetContacts200Response) o;
    return Objects.equals(this.status, getContacts200Response.status) &&
        Objects.equals(this.contacts, getContacts200Response.contacts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, contacts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetContacts200Response {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("contacts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetContacts200Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetContacts200Response.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetContacts200Response is not found in the empty JSON string", GetContacts200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetContacts200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetContacts200Response` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      JsonArray jsonArraycontacts = jsonObj.getAsJsonArray("contacts");
      if (jsonArraycontacts != null) {
        // ensure the json data is an array
        if (!jsonObj.get("contacts").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `contacts` to be an array in the JSON string but got `%s`", jsonObj.get("contacts").toString()));
        }

        // validate the optional field `contacts` (array)
        for (int i = 0; i < jsonArraycontacts.size(); i++) {
          Contact.validateJsonObject(jsonArraycontacts.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetContacts200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetContacts200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetContacts200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetContacts200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetContacts200Response>() {
           @Override
           public void write(JsonWriter out, GetContacts200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetContacts200Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetContacts200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetContacts200Response
  * @throws IOException if the JSON string is invalid with respect to GetContacts200Response
  */
  public static GetContacts200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetContacts200Response.class);
  }

 /**
  * Convert an instance of GetContacts200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

