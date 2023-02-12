package com.whispir.model;
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
 * Mapping the data column in your resource file to the contact field value
 */

public class FieldMapping {
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
  @SerializedName("firstName")
  private String firstName;

  @SerializedName("lastName")
  private String lastName;

  @SerializedName("workMobilePhone1")
  private String workMobilePhone1;

  @SerializedName("workCountry")
  private String workCountry;

  @SerializedName("timezone")
  private String timezone;

  public FieldMapping() {
    super();
  }


   /**
   * First Name of the Contact. Value of this field is used to map the field within the resource.
   * @return firstName
  **/
  @javax.annotation.Nonnull
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

   /**
   * Last Name of the Contact. Value of this field is used to map the field within the resource.
   * @return lastName
  **/
  @javax.annotation.Nonnull
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

   /**
   * The mobile phone number of the Contact. Value of this field is used to map the field within the newly created resource.
   * @return workMobilePhone1
  **/
  @javax.annotation.Nonnull
  public String getWorkMobilePhone1() {
    return workMobilePhone1;
  }
  public void setWorkMobilePhone1(String workMobilePhone1) {
    this.workMobilePhone1 = workMobilePhone1;
  }

   /**
   * The country field of the contact. The value of this field is used to map to the field within the newly created contact.
   * @return workCountry
  **/
  @javax.annotation.Nonnull
  public String getWorkCountry() {
    return workCountry;
  }
  public void setWorkCountry(String workCountry) {
    this.workCountry = workCountry;
  }

   /**
   * The timezone field of the contact. The value of this field is used to map to the timezone field within the newly created contact.
   * @return timezone
  **/
  @javax.annotation.Nonnull
  public String getTimezone() {
    return timezone;
  }
  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldMapping fieldMapping = (FieldMapping) o;
    return Objects.equals(this.firstName, fieldMapping.firstName) &&
        Objects.equals(this.lastName, fieldMapping.lastName) &&
        Objects.equals(this.workMobilePhone1, fieldMapping.workMobilePhone1) &&
        Objects.equals(this.workCountry, fieldMapping.workCountry) &&
        Objects.equals(this.timezone, fieldMapping.timezone);
  }
  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, workMobilePhone1, workCountry, timezone);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldMapping {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    workMobilePhone1: ").append(toIndentedString(workMobilePhone1)).append("\n");
    sb.append("    workCountry: ").append(toIndentedString(workCountry)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
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
       if (!FieldMapping.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FieldMapping' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FieldMapping> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FieldMapping.class));

       return (TypeAdapter<T>) new TypeAdapter<FieldMapping>() {
           @Override
           public void write(JsonWriter out, FieldMapping value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FieldMapping read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FieldMapping given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FieldMapping
  * @throws IOException if the JSON string is invalid with respect to FieldMapping
  */
  public static FieldMapping fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FieldMapping.class);
  }

 /**
  * Convert an instance of FieldMapping to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

