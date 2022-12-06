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
import com.whispir.model.Scenario;
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
 * List of retrieved scenarios
 */
@ApiModel(description = "List of retrieved scenarios")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-06T03:10:46.360132Z[Etc/UTC]")
public class ScenarioCollection {
  public static final String SERIALIZED_NAME_SCENARIOS = "scenarios";
  @SerializedName(SERIALIZED_NAME_SCENARIOS)
  private List<Scenario> scenarios = null;

  public ScenarioCollection() { 
  }

  public ScenarioCollection scenarios(List<Scenario> scenarios) {
    
    this.scenarios = scenarios;
    return this;
  }

  public ScenarioCollection addScenariosItem(Scenario scenariosItem) {
    if (this.scenarios == null) {
      this.scenarios = new ArrayList<>();
    }
    this.scenarios.add(scenariosItem);
    return this;
  }

   /**
   * Scenario object
   * @return scenarios
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Scenario object")

  public List<Scenario> getScenarios() {
    return scenarios;
  }


  public void setScenarios(List<Scenario> scenarios) {
    this.scenarios = scenarios;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScenarioCollection scenarioCollection = (ScenarioCollection) o;
    return Objects.equals(this.scenarios, scenarioCollection.scenarios);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scenarios);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScenarioCollection {\n");
    sb.append("    scenarios: ").append(toIndentedString(scenarios)).append("\n");
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
    openapiFields.add("scenarios");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ScenarioCollection
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ScenarioCollection.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ScenarioCollection is not found in the empty JSON string", ScenarioCollection.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ScenarioCollection.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ScenarioCollection` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayscenarios = jsonObj.getAsJsonArray("scenarios");
      if (jsonArrayscenarios != null) {
        // ensure the json data is an array
        if (!jsonObj.get("scenarios").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `scenarios` to be an array in the JSON string but got `%s`", jsonObj.get("scenarios").toString()));
        }

        // validate the optional field `scenarios` (array)
        for (int i = 0; i < jsonArrayscenarios.size(); i++) {
          Scenario.validateJsonObject(jsonArrayscenarios.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ScenarioCollection.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ScenarioCollection' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ScenarioCollection> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ScenarioCollection.class));

       return (TypeAdapter<T>) new TypeAdapter<ScenarioCollection>() {
           @Override
           public void write(JsonWriter out, ScenarioCollection value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ScenarioCollection read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ScenarioCollection given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ScenarioCollection
  * @throws IOException if the JSON string is invalid with respect to ScenarioCollection
  */
  public static ScenarioCollection fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ScenarioCollection.class);
  }

 /**
  * Convert an instance of ScenarioCollection to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

