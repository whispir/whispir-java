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
 * DeliveryCategory
 */

public class DeliveryCategory {
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

  @SerializedName("recipientCount")
  private BigDecimal recipientCount;

  @SerializedName("percentageTotal")
  private String percentageTotal;

  public DeliveryCategory() {
    super();
  }


   /**
   * The delivery status of the message.
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
   * The number of recipients with the given &#x60;name&#x60; status.
   * @return recipientCount
  **/
  @javax.annotation.Nullable
  public BigDecimal getRecipientCount() {
    return recipientCount;
  }
  public void setRecipientCount(BigDecimal recipientCount) {
    this.recipientCount = recipientCount;
  }

   /**
   * The percentage of recipients with the given &#x60;name&#x60; status.
   * @return percentageTotal
  **/
  @javax.annotation.Nullable
  public String getPercentageTotal() {
    return percentageTotal;
  }
  public void setPercentageTotal(String percentageTotal) {
    this.percentageTotal = percentageTotal;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliveryCategory deliveryCategory = (DeliveryCategory) o;
    return Objects.equals(this.name, deliveryCategory.name) &&
        Objects.equals(this.recipientCount, deliveryCategory.recipientCount) &&
        Objects.equals(this.percentageTotal, deliveryCategory.percentageTotal);
  }
  @Override
  public int hashCode() {
    return Objects.hash(name, recipientCount, percentageTotal);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryCategory {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    recipientCount: ").append(toIndentedString(recipientCount)).append("\n");
    sb.append("    percentageTotal: ").append(toIndentedString(percentageTotal)).append("\n");
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
       if (!DeliveryCategory.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeliveryCategory' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeliveryCategory> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeliveryCategory.class));

       return (TypeAdapter<T>) new TypeAdapter<DeliveryCategory>() {
           @Override
           public void write(JsonWriter out, DeliveryCategory value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DeliveryCategory read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DeliveryCategory given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DeliveryCategory
  * @throws IOException if the JSON string is invalid with respect to DeliveryCategory
  */
  public static DeliveryCategory fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeliveryCategory.class);
  }

 /**
  * Convert an instance of DeliveryCategory to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

