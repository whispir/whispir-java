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
 * “Longitude”, \&quot;latitude\&quot;, \&quot;name\&quot;, and \&quot;address\&quot;
 */

public class Object3 {
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
  @SerializedName("longitude")
  private BigDecimal longitude;

  @SerializedName("latitude")
  private BigDecimal latitude;

  @SerializedName("name")
  private String name;

  @SerializedName("address")
  private String address;

  public Object3() {
    super();
  }


   /**
   * Longitude value of the location
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
   * Latitude value of the location
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
   * Name of the location
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

   /**
   * Address of the location
   * @return address
  **/
  @javax.annotation.Nullable
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Object3 object3 = (Object3) o;
    return Objects.equals(this.longitude, object3.longitude) &&
        Objects.equals(this.latitude, object3.latitude) &&
        Objects.equals(this.name, object3.name) &&
        Objects.equals(this.address, object3.address);
  }
  @Override
  public int hashCode() {
    return Objects.hash(longitude, latitude, name, address);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Object3 {\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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
       if (!Object3.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Object3' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Object3> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Object3.class));

       return (TypeAdapter<T>) new TypeAdapter<Object3>() {
           @Override
           public void write(JsonWriter out, Object3 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Object3 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Object3 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Object3
  * @throws IOException if the JSON string is invalid with respect to Object3
  */
  public static Object3 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Object3.class);
  }

 /**
  * Convert an instance of Object3 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

