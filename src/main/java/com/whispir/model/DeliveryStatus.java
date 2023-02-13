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
 * DeliveryStatus
 */

public class DeliveryStatus {
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
  @SerializedName("type")
  private String type;

  @SerializedName("status")
  private String status;

  @SerializedName("destination")
  private String destination;

  public DeliveryStatus() {
    super();
  }


   /**
   * The message channel
   * @return type
  **/
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

   /**
   * The delivery status
   * @return status
  **/
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

   /**
   * The message destination
   * @return destination
  **/
  @javax.annotation.Nullable
  public String getDestination() {
    return destination;
  }
  public void setDestination(String destination) {
    this.destination = destination;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliveryStatus deliveryStatus = (DeliveryStatus) o;
    return Objects.equals(this.type, deliveryStatus.type) &&
        Objects.equals(this.status, deliveryStatus.status) &&
        Objects.equals(this.destination, deliveryStatus.destination);
  }
  @Override
  public int hashCode() {
    return Objects.hash(type, status, destination);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryStatus {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
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
       if (!DeliveryStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeliveryStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeliveryStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeliveryStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<DeliveryStatus>() {
           @Override
           public void write(JsonWriter out, DeliveryStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DeliveryStatus read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DeliveryStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DeliveryStatus
  * @throws IOException if the JSON string is invalid with respect to DeliveryStatus
  */
  public static DeliveryStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeliveryStatus.class);
  }

 /**
  * Convert an instance of DeliveryStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

