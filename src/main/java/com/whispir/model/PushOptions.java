package com.whispir.model;
import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.whispir.model.Apns;
import com.whispir.model.Fcm;
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
 * The object defining options for push messages.
 */

public class PushOptions {
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
  @SerializedName("notifications")
  private String notifications;

  @SerializedName("escalationMins")
  private String escalationMins;

  @SerializedName("appId")
  private String appId;

  @SerializedName("priority")
  private String priority;

  @SerializedName("fcm")
  private Fcm fcm;

  @SerializedName("apns")
  private Apns apns;

  @SerializedName("data")
  private Object data;

  public PushOptions() {
    super();
  }


   /**
   * A flag indicating whether notifications should be enabled for message replies.
   * @return notifications
  **/
  @javax.annotation.Nullable
  public String getNotifications() {
    return notifications;
  }
  public void setNotifications(String notifications) {
    this.notifications = notifications;
  }

   /**
   * The number of minutes to wait for a reply until escalating to the next contact.
   * @return escalationMins
  **/
  @javax.annotation.Nullable
  public String getEscalationMins() {
    return escalationMins;
  }
  public void setEscalationMins(String escalationMins) {
    this.escalationMins = escalationMins;
  }

   /**
   * The identifier for the registered application.
   * @return appId
  **/
  @javax.annotation.Nonnull
  public String getAppId() {
    return appId;
  }
  public void setAppId(String appId) {
    this.appId = appId;
  }

   /**
   * The priority of the notification.   NORMAL (the default value) will indicate to FCM/APNS to take into consideration the target device&#39;s battery consumption at the expense of delivering the message with a delay.   The value NORMAL maps to priority *NORMAL* in FCM and priority *5* in APNS.   The value HIGH maps to priority *HIGH* in FCM and *10* in APNS.
   * @return priority
  **/
  @javax.annotation.Nullable
  public String getPriority() {
    return priority;
  }
  public void setPriority(String priority) {
    this.priority = priority;
  }

   /**
   * Get fcm
   * @return fcm
  **/
  @javax.annotation.Nullable
  public Fcm getFcm() {
    return fcm;
  }
  public void setFcm(Fcm fcm) {
    this.fcm = fcm;
  }

   /**
   * Get apns
   * @return apns
  **/
  @javax.annotation.Nullable
  public Apns getApns() {
    return apns;
  }
  public void setApns(Apns apns) {
    this.apns = apns;
  }

   /**
   * Custom key-value pairs of the notification&#39;s payload. These values can be used by the target app for enhanced functionality provided that it has been designed to handle them (images, videos, links etc).  These attributes translate to &lt;span style&#x3D;\&quot;color:red\&quot;&gt;*data*&lt;/span&gt;  in the FCM payload.  For APNS, the custom attributes of *data* are inserted as custom properties outside of the &lt;span style&#x3D;\&quot;color:red\&quot;&gt;*aps*&lt;/span&gt; payload.
   * @return data
  **/
  @javax.annotation.Nullable
  public Object getData() {
    return data;
  }
  public void setData(Object data) {
    this.data = data;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PushOptions pushOptions = (PushOptions) o;
    return Objects.equals(this.notifications, pushOptions.notifications) &&
        Objects.equals(this.escalationMins, pushOptions.escalationMins) &&
        Objects.equals(this.appId, pushOptions.appId) &&
        Objects.equals(this.priority, pushOptions.priority) &&
        Objects.equals(this.fcm, pushOptions.fcm) &&
        Objects.equals(this.apns, pushOptions.apns) &&
        Objects.equals(this.data, pushOptions.data);
  }
  @Override
  public int hashCode() {
    return Objects.hash(notifications, escalationMins, appId, priority, fcm, apns, data);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PushOptions {\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
    sb.append("    escalationMins: ").append(toIndentedString(escalationMins)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    fcm: ").append(toIndentedString(fcm)).append("\n");
    sb.append("    apns: ").append(toIndentedString(apns)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
       if (!PushOptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PushOptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PushOptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PushOptions.class));

       return (TypeAdapter<T>) new TypeAdapter<PushOptions>() {
           @Override
           public void write(JsonWriter out, PushOptions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PushOptions read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PushOptions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PushOptions
  * @throws IOException if the JSON string is invalid with respect to PushOptions
  */
  public static PushOptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PushOptions.class);
  }

 /**
  * Convert an instance of PushOptions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

