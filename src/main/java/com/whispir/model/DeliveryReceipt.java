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
 * A fixed object structure used by for Whispir internally for tracking purposes.
 */

public class DeliveryReceipt {
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
  @SerializedName("period")
  private String period;

  @SerializedName("rule")
  private String rule;

  @SerializedName("type")
  private String type;

  @SerializedName("publishToWeb")
  private Boolean publishToWeb;

  @SerializedName("expiryDay")
  private BigDecimal expiryDay;

  @SerializedName("expiryHour")
  private BigDecimal expiryHour;

  @SerializedName("expiryMin")
  private BigDecimal expiryMin;

  @SerializedName("feedIds")
  private String feedIds;

  @SerializedName("bool")
  private Boolean bool;

  public DeliveryReceipt() {
    super();
  }

  public DeliveryReceipt(
    String period, 
    String rule, 
    String type, 
    Boolean publishToWeb, 
    BigDecimal expiryDay, 
    BigDecimal expiryHour, 
    BigDecimal expiryMin, 
    String feedIds, 
    Boolean bool
  ) {
    this();
    this.period = period;
    this.rule = rule;
    this.type = type;
    this.publishToWeb = publishToWeb;
    this.expiryDay = expiryDay;
    this.expiryHour = expiryHour;
    this.expiryMin = expiryMin;
    this.feedIds = feedIds;
    this.bool = bool;
  }
   /**
   * The period of the message delivery.
   * @return period
  **/
  @javax.annotation.Nullable
  public String getPeriod() {
    return period;
  }
   /**
   * The rule of the message delivery.
   * @return rule
  **/
  @javax.annotation.Nullable
  public String getRule() {
    return rule;
  }
   /**
   * The type of the message delivery.
   * @return type
  **/
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }
   /**
   * Specifies whether the message was published to the web.
   * @return publishToWeb
  **/
  @javax.annotation.Nullable
  public Boolean getPublishToWeb() {
    return publishToWeb;
  }
   /**
   * Specifies the number of days before the message expires.
   * @return expiryDay
  **/
  @javax.annotation.Nullable
  public BigDecimal getExpiryDay() {
    return expiryDay;
  }
   /**
   * Specifies the number of hours before the message expires.
   * @return expiryHour
  **/
  @javax.annotation.Nullable
  public BigDecimal getExpiryHour() {
    return expiryHour;
  }
   /**
   * Specifies the number of minutes before the message expires.
   * @return expiryMin
  **/
  @javax.annotation.Nullable
  public BigDecimal getExpiryMin() {
    return expiryMin;
  }
   /**
   * The feeds identifier for the message delivery.
   * @return feedIds
  **/
  @javax.annotation.Nullable
  public String getFeedIds() {
    return feedIds;
  }
   /**
   * The bool field for the message delivery.
   * @return bool
  **/
  @javax.annotation.Nullable
  public Boolean getBool() {
    return bool;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliveryReceipt deliveryReceipt = (DeliveryReceipt) o;
    return Objects.equals(this.period, deliveryReceipt.period) &&
        Objects.equals(this.rule, deliveryReceipt.rule) &&
        Objects.equals(this.type, deliveryReceipt.type) &&
        Objects.equals(this.publishToWeb, deliveryReceipt.publishToWeb) &&
        Objects.equals(this.expiryDay, deliveryReceipt.expiryDay) &&
        Objects.equals(this.expiryHour, deliveryReceipt.expiryHour) &&
        Objects.equals(this.expiryMin, deliveryReceipt.expiryMin) &&
        Objects.equals(this.feedIds, deliveryReceipt.feedIds) &&
        Objects.equals(this.bool, deliveryReceipt.bool);
  }
  @Override
  public int hashCode() {
    return Objects.hash(period, rule, type, publishToWeb, expiryDay, expiryHour, expiryMin, feedIds, bool);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryReceipt {\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    publishToWeb: ").append(toIndentedString(publishToWeb)).append("\n");
    sb.append("    expiryDay: ").append(toIndentedString(expiryDay)).append("\n");
    sb.append("    expiryHour: ").append(toIndentedString(expiryHour)).append("\n");
    sb.append("    expiryMin: ").append(toIndentedString(expiryMin)).append("\n");
    sb.append("    feedIds: ").append(toIndentedString(feedIds)).append("\n");
    sb.append("    bool: ").append(toIndentedString(bool)).append("\n");
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
       if (!DeliveryReceipt.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeliveryReceipt' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeliveryReceipt> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeliveryReceipt.class));

       return (TypeAdapter<T>) new TypeAdapter<DeliveryReceipt>() {
           @Override
           public void write(JsonWriter out, DeliveryReceipt value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DeliveryReceipt read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DeliveryReceipt given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DeliveryReceipt
  * @throws IOException if the JSON string is invalid with respect to DeliveryReceipt
  */
  public static DeliveryReceipt fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeliveryReceipt.class);
  }

 /**
  * Convert an instance of DeliveryReceipt to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

