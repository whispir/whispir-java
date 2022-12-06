/*
 * Whispir Platform API
 * Whispir Platform API for cross channel and multi channel communications. Documentation on each endpoint is available at https://developers.whispir.com.
 *
 * The version of the OpenAPI document: 1.1.3
 * Contact: support@whispir.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.whispir.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.whispir.model.EventFormField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

import com.whispir.client.JSON;

/**
 * Constitutes the name of the form and its fields
 */
@ApiModel(description = "Constitutes the name of the form and its fields")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-06T03:10:46.360132Z[Etc/UTC]")
public class EventForm {
  public static final String SERIALIZED_NAME_FORM_NAME = "formName";
  @SerializedName(SERIALIZED_NAME_FORM_NAME)
  private String formName;

  public static final String SERIALIZED_NAME_EVENT_FIELD_LIST = "eventFieldList";
  @SerializedName(SERIALIZED_NAME_EVENT_FIELD_LIST)
  private List<EventFormField> eventFieldList = null;

  public EventForm() { 
  }

  public EventForm formName(String formName) {
    
    this.formName = formName;
    return this;
  }

   /**
   * Specifies the name of the event form
   * @return formName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Metro Event", value = "Specifies the name of the event form")

  public String getFormName() {
    return formName;
  }


  public void setFormName(String formName) {
    this.formName = formName;
  }


  public EventForm eventFieldList(List<EventFormField> eventFieldList) {
    
    this.eventFieldList = eventFieldList;
    return this;
  }

  public EventForm addEventFieldListItem(EventFormField eventFieldListItem) {
    if (this.eventFieldList == null) {
      this.eventFieldList = new ArrayList<>();
    }
    this.eventFieldList.add(eventFieldListItem);
    return this;
  }

   /**
   * Contains a list of event fields, see create /POST event endpoint to learn more about the available fields
   * @return eventFieldList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Contains a list of event fields, see create /POST event endpoint to learn more about the available fields")

  public List<EventFormField> getEventFieldList() {
    return eventFieldList;
  }


  public void setEventFieldList(List<EventFormField> eventFieldList) {
    this.eventFieldList = eventFieldList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventForm eventForm = (EventForm) o;
    return Objects.equals(this.formName, eventForm.formName) &&
        Objects.equals(this.eventFieldList, eventForm.eventFieldList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formName, eventFieldList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventForm {\n");
    sb.append("    formName: ").append(toIndentedString(formName)).append("\n");
    sb.append("    eventFieldList: ").append(toIndentedString(eventFieldList)).append("\n");
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
    openapiFields.add("formName");
    openapiFields.add("eventFieldList");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EventForm
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (EventForm.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in EventForm is not found in the empty JSON string", EventForm.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EventForm.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EventForm` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("formName") != null && !jsonObj.get("formName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `formName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("formName").toString()));
      }
      JsonArray jsonArrayeventFieldList = jsonObj.getAsJsonArray("eventFieldList");
      if (jsonArrayeventFieldList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("eventFieldList").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `eventFieldList` to be an array in the JSON string but got `%s`", jsonObj.get("eventFieldList").toString()));
        }

        // validate the optional field `eventFieldList` (array)
        for (int i = 0; i < jsonArrayeventFieldList.size(); i++) {
          EventFormField.validateJsonObject(jsonArrayeventFieldList.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventForm.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventForm' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventForm> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventForm.class));

       return (TypeAdapter<T>) new TypeAdapter<EventForm>() {
           @Override
           public void write(JsonWriter out, EventForm value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventForm read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EventForm given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventForm
  * @throws IOException if the JSON string is invalid with respect to EventForm
  */
  public static EventForm fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventForm.class);
  }

 /**
  * Convert an instance of EventForm to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

