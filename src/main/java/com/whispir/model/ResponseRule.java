package com.whispir.model;
import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.whispir.model.TemplatePattern;
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
 * Response Rules are useful when your Templates require the end-users to select among known responses [for example, Yes/No, Accept/Decline or ranking something from 1 to 5]  Using Response Rules in combination with Templates allows you to automatically categorise any response to these messages into different response groups for reporting purposes
 */

public class ResponseRule {
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
  @SerializedName("name")
  private String name;

  @SerializedName("description")
  private String description;

  @SerializedName("responseTemplatePatterns")
  private TemplatePattern responseTemplatePatterns;

  public ResponseRule() {
    super();
  }


   /**
   * Specifies the name of the response rule
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

   /**
   * Specifies the description of the response rule for others to understand its purpose
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

   /**
   * Get responseTemplatePatterns
   * @return responseTemplatePatterns
  **/
  @javax.annotation.Nonnull
  public TemplatePattern getResponseTemplatePatterns() {
    return responseTemplatePatterns;
  }
  public void setResponseTemplatePatterns(TemplatePattern responseTemplatePatterns) {
    this.responseTemplatePatterns = responseTemplatePatterns;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseRule responseRule = (ResponseRule) o;
    return Objects.equals(this.name, responseRule.name) &&
        Objects.equals(this.description, responseRule.description) &&
        Objects.equals(this.responseTemplatePatterns, responseRule.responseTemplatePatterns);
  }
  @Override
  public int hashCode() {
    return Objects.hash(name, description, responseTemplatePatterns);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseRule {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    responseTemplatePatterns: ").append(toIndentedString(responseTemplatePatterns)).append("\n");
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
       if (!ResponseRule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResponseRule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResponseRule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResponseRule.class));

       return (TypeAdapter<T>) new TypeAdapter<ResponseRule>() {
           @Override
           public void write(JsonWriter out, ResponseRule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResponseRule read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ResponseRule given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ResponseRule
  * @throws IOException if the JSON string is invalid with respect to ResponseRule
  */
  public static ResponseRule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResponseRule.class);
  }

 /**
  * Convert an instance of ResponseRule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

