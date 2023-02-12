package com.whispir.model;
import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.whispir.model.FieldMapping;
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
 * Import model object
 */

public class ModelImport {
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
  @SerializedName("resourceId")
  private String resourceId;

  @SerializedName("importType")
  private String importType;

  @SerializedName("importOptions")
  private FieldMapping importOptions;

  @SerializedName("importMode")
  private String importMode;

  public ModelImport() {
    super();
  }


   /**
   * The resource identifier returned from the POST to /resources. Resource referred to must be a valid CSV, XML, or JSON file.
   * @return resourceId
  **/
  @javax.annotation.Nonnull
  public String getResourceId() {
    return resourceId;
  }
  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }

   /**
   * This defines the resource that will be created through this import process.   *&#39;contact&#39;* is the only supported *importType* at this stage.
   * @return importType
  **/
  @javax.annotation.Nonnull
  public String getImportType() {
    return importType;
  }
  public void setImportType(String importType) {
    this.importType = importType;
  }

   /**
   * Get importOptions
   * @return importOptions
  **/
  @javax.annotation.Nonnull
  public FieldMapping getImportOptions() {
    return importOptions;
  }
  public void setImportOptions(FieldMapping importOptions) {
    this.importOptions = importOptions;
  }

   /**
   * The type of contact import that is occurring.
   * @return importMode
  **/
  @javax.annotation.Nonnull
  public String getImportMode() {
    return importMode;
  }
  public void setImportMode(String importMode) {
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

