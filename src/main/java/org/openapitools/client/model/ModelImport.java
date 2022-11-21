/*
 * Whispir Platform API
 * Whispir Platform API for cross channel and multi channel communications. Documentation on each endpoint is available at https://developers.whispir.com.
 *
 * The version of the OpenAPI document: 1.1.0
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
import org.openapitools.client.model.FieldMapping;

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
 * Import model object
 */
@ApiModel(description = "Import model object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-21T01:55:16.197234Z[Etc/UTC]")
public class ModelImport {
  public static final String SERIALIZED_NAME_RESOURCE_ID = "resourceId";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ID)
  private String resourceId;

  public static final String SERIALIZED_NAME_IMPORT_TYPE = "importType";
  @SerializedName(SERIALIZED_NAME_IMPORT_TYPE)
  private String importType;

  public static final String SERIALIZED_NAME_IMPORT_OPTIONS = "importOptions";
  @SerializedName(SERIALIZED_NAME_IMPORT_OPTIONS)
  private FieldMapping importOptions;

  /**
   * The type of contact import that is occurring.
   */
  @JsonAdapter(ImportModeEnum.Adapter.class)
  public enum ImportModeEnum {
    REPLACE("replace"),
    
    DUPLICATE("duplicate"),
    
    IGNORE("ignore");

    private String value;

    ImportModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ImportModeEnum fromValue(String value) {
      for (ImportModeEnum b : ImportModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ImportModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ImportModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ImportModeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ImportModeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_IMPORT_MODE = "importMode";
  @SerializedName(SERIALIZED_NAME_IMPORT_MODE)
  private ImportModeEnum importMode;

  public ModelImport() { 
  }

  public ModelImport resourceId(String resourceId) {
    
    this.resourceId = resourceId;
    return this;
  }

   /**
   * The resource identifier returned from the POST to /resources. Resource referred to must be a valid CSV, XML, or JSON file.
   * @return resourceId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "4FBBC384BCE3DAABFE3", required = true, value = "The resource identifier returned from the POST to /resources. Resource referred to must be a valid CSV, XML, or JSON file.")

  public String getResourceId() {
    return resourceId;
  }


  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }


  public ModelImport importType(String importType) {
    
    this.importType = importType;
    return this;
  }

   /**
   * This defines the resource that will be created through this import process.   *&#39;contact&#39;* is the only supported *importType* at this stage.
   * @return importType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "contact", required = true, value = "This defines the resource that will be created through this import process.   *'contact'* is the only supported *importType* at this stage.")

  public String getImportType() {
    return importType;
  }


  public void setImportType(String importType) {
    this.importType = importType;
  }


  public ModelImport importOptions(FieldMapping importOptions) {
    
    this.importOptions = importOptions;
    return this;
  }

   /**
   * Get importOptions
   * @return importOptions
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public FieldMapping getImportOptions() {
    return importOptions;
  }


  public void setImportOptions(FieldMapping importOptions) {
    this.importOptions = importOptions;
  }


  public ModelImport importMode(ImportModeEnum importMode) {
    
    this.importMode = importMode;
    return this;
  }

   /**
   * The type of contact import that is occurring.
   * @return importMode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "replace", required = true, value = "The type of contact import that is occurring.")

  public ImportModeEnum getImportMode() {
    return importMode;
  }


  public void setImportMode(ImportModeEnum importMode) {
    this.importMode = importMode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelImport _import = (ModelImport) o;
    return Objects.equals(this.resourceId, _import.resourceId) &&
        Objects.equals(this.importType, _import.importType) &&
        Objects.equals(this.importOptions, _import.importOptions) &&
        Objects.equals(this.importMode, _import.importMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceId, importType, importOptions, importMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelImport {\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    importType: ").append(toIndentedString(importType)).append("\n");
    sb.append("    importOptions: ").append(toIndentedString(importOptions)).append("\n");
    sb.append("    importMode: ").append(toIndentedString(importMode)).append("\n");
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
    openapiFields.add("resourceId");
    openapiFields.add("importType");
    openapiFields.add("importOptions");
    openapiFields.add("importMode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("resourceId");
    openapiRequiredFields.add("importType");
    openapiRequiredFields.add("importOptions");
    openapiRequiredFields.add("importMode");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelImport
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ModelImport.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelImport is not found in the empty JSON string", ModelImport.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ModelImport.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelImport` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModelImport.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("resourceId") != null && !jsonObj.get("resourceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resourceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resourceId").toString()));
      }
      if (jsonObj.get("importType") != null && !jsonObj.get("importType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `importType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("importType").toString()));
      }
      // validate the optional field `importOptions`
      if (jsonObj.getAsJsonObject("importOptions") != null) {
        FieldMapping.validateJsonObject(jsonObj.getAsJsonObject("importOptions"));
      }
      if (jsonObj.get("importMode") != null && !jsonObj.get("importMode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `importMode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("importMode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelImport.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelImport' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelImport> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelImport.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelImport>() {
           @Override
           public void write(JsonWriter out, ModelImport value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelImport read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModelImport given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelImport
  * @throws IOException if the JSON string is invalid with respect to ModelImport
  */
  public static ModelImport fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelImport.class);
  }

 /**
  * Convert an instance of ModelImport to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

