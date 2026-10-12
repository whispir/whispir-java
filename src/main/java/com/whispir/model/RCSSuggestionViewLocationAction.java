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
import java.math.BigDecimal;
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
 * Allows sending a location so the end recipient can open it on their phone.  The viewLocationAction can have a combination  of latitude, longitude and label AND/OR a  query link (which has those values embedded).   If both combinations are provided,  the phone will give higher priority to the  query link.
 */

public class RCSSuggestionViewLocationAction {
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
  @SerializedName("latitude")
  private BigDecimal latitude;

  @SerializedName("longitude")
  private BigDecimal longitude;

  @SerializedName("label")
  private String label;

  @SerializedName("query")
  private String query;

  public RCSSuggestionViewLocationAction() {
    super();
  }


   /**
   * Get latitude
   * @return latitude
  **/
  @javax.annotation.Nullable
  public BigDecimal getLatitude() {
    return latitude;
  }
  public void setLatitude(BigDecimal latitude) {
    this.latitude = latitude;
  }

   /**
   * Get longitude
   * @return longitude
  **/
  @javax.annotation.Nullable
  public BigDecimal getLongitude() {
    return longitude;
  }
  public void setLongitude(BigDecimal longitude) {
    this.longitude = longitude;
  }

   /**
   * Get label
   * @return label
  **/
  @javax.annotation.Nullable
  public String getLabel() {
    return label;
  }
  public void setLabel(String label) {
    this.label = label;
  }

   /**
   * Get query
   * @return query
  **/
  @javax.annotation.Nullable
  public String getQuery() {
    return query;
  }
  public void setQuery(String query) {
    this.query = query;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RCSSuggestionViewLocationAction rcSSuggestionViewLocationAction = (RCSSuggestionViewLocationAction) o;
    return Objects.equals(this.latitude, rcSSuggestionViewLocationAction.latitude) &&
        Objects.equals(this.longitude, rcSSuggestionViewLocationAction.longitude) &&
        Objects.equals(this.label, rcSSuggestionViewLocationAction.label) &&
        Objects.equals(this.query, rcSSuggestionViewLocationAction.query);
  }
  @Override
  public int hashCode() {
    return Objects.hash(latitude, longitude, label, query);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RCSSuggestionViewLocationAction {\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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
       if (!RCSSuggestionViewLocationAction.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RCSSuggestionViewLocationAction' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RCSSuggestionViewLocationAction> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RCSSuggestionViewLocationAction.class));

       return (TypeAdapter<T>) new TypeAdapter<RCSSuggestionViewLocationAction>() {
           @Override
           public void write(JsonWriter out, RCSSuggestionViewLocationAction value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RCSSuggestionViewLocationAction read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RCSSuggestionViewLocationAction given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RCSSuggestionViewLocationAction
  * @throws IOException if the JSON string is invalid with respect to RCSSuggestionViewLocationAction
  */
  public static RCSSuggestionViewLocationAction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RCSSuggestionViewLocationAction.class);
  }

 /**
  * Convert an instance of RCSSuggestionViewLocationAction to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

