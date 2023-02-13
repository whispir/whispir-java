package com.whispir.model;
import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.whispir.model.ResponseRule;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
 * ResponseRuleCollection
 */

public class ResponseRuleCollection {
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
  @SerializedName("status")
  private String status;

  @SerializedName("responseRules")
  private List<ResponseRule> responseRules;

  public ResponseRuleCollection() {
    super();
  }

  public ResponseRuleCollection(
    String status, 
    List<ResponseRule> responseRules
  ) {
    this();
    this.status = status;
    this.responseRules = responseRules;
  }
   /**
   * Provides the total number of records fetched. This attribute may return \&quot;No records found\&quot; when there are no response rules available.
   * @return status
  **/
  @javax.annotation.Nonnull
  public String getStatus() {
    return status;
  }
   /**
   * The list of response rules
   * @return responseRules
  **/
  @javax.annotation.Nonnull
  public List<ResponseRule> getResponseRules() {
    return responseRules;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseRuleCollection responseRuleCollection = (ResponseRuleCollection) o;
    return Objects.equals(this.status, responseRuleCollection.status) &&
        Objects.equals(this.responseRules, responseRuleCollection.responseRules);
  }
  @Override
  public int hashCode() {
    return Objects.hash(status, responseRules);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseRuleCollection {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    responseRules: ").append(toIndentedString(responseRules)).append("\n");
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
       if (!ResponseRuleCollection.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResponseRuleCollection' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResponseRuleCollection> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResponseRuleCollection.class));

       return (TypeAdapter<T>) new TypeAdapter<ResponseRuleCollection>() {
           @Override
           public void write(JsonWriter out, ResponseRuleCollection value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResponseRuleCollection read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ResponseRuleCollection given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ResponseRuleCollection
  * @throws IOException if the JSON string is invalid with respect to ResponseRuleCollection
  */
  public static ResponseRuleCollection fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResponseRuleCollection.class);
  }

 /**
  * Convert an instance of ResponseRuleCollection to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

