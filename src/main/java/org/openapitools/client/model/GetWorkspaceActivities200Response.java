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
import org.openapitools.client.model.Activity;

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
 * GetWorkspaceActivities200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-22T09:38:29.014059Z[Etc/UTC]")
public class GetWorkspaceActivities200Response {
  public static final String SERIALIZED_NAME_ACTIVITIES = "activities";
  @SerializedName(SERIALIZED_NAME_ACTIVITIES)
  private List<Activity> activities = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public GetWorkspaceActivities200Response() { 
  }

  
  public GetWorkspaceActivities200Response(
     List<Activity> activities, 
     String status
  ) {
    this();
    this.activities = activities;
    this.status = status;
  }

   /**
   * List of activities
   * @return activities
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of activities")

  public List<Activity> getActivities() {
    return activities;
  }




   /**
   * Provides the total number of records fetched. This attribute may return \&quot;No records found\&quot; when there are no activities available.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "status: 1 to 1 of 1", value = "Provides the total number of records fetched. This attribute may return \"No records found\" when there are no activities available.")

  public String getStatus() {
    return status;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetWorkspaceActivities200Response getWorkspaceActivities200Response = (GetWorkspaceActivities200Response) o;
    return Objects.equals(this.activities, getWorkspaceActivities200Response.activities) &&
        Objects.equals(this.status, getWorkspaceActivities200Response.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activities, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetWorkspaceActivities200Response {\n");
    sb.append("    activities: ").append(toIndentedString(activities)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("activities");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetWorkspaceActivities200Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetWorkspaceActivities200Response.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetWorkspaceActivities200Response is not found in the empty JSON string", GetWorkspaceActivities200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetWorkspaceActivities200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetWorkspaceActivities200Response` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayactivities = jsonObj.getAsJsonArray("activities");
      if (jsonArrayactivities != null) {
        // ensure the json data is an array
        if (!jsonObj.get("activities").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `activities` to be an array in the JSON string but got `%s`", jsonObj.get("activities").toString()));
        }

        // validate the optional field `activities` (array)
        for (int i = 0; i < jsonArrayactivities.size(); i++) {
          Activity.validateJsonObject(jsonArrayactivities.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetWorkspaceActivities200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetWorkspaceActivities200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetWorkspaceActivities200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetWorkspaceActivities200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetWorkspaceActivities200Response>() {
           @Override
           public void write(JsonWriter out, GetWorkspaceActivities200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetWorkspaceActivities200Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetWorkspaceActivities200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetWorkspaceActivities200Response
  * @throws IOException if the JSON string is invalid with respect to GetWorkspaceActivities200Response
  */
  public static GetWorkspaceActivities200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetWorkspaceActivities200Response.class);
  }

 /**
  * Convert an instance of GetWorkspaceActivities200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

