/*
 * Whispir Platform API
 * Whispir Platform API for cross channel and multi channel communications. Documentation on each endpoint is available at https://developers.whispir.com.
 *
 * The version of the OpenAPI document: 1.0.0
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
import org.openapitools.client.model.FeaturesPushOptionsApns;
import org.openapitools.client.model.FeaturesPushOptionsFcm;

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
 * The object defining options for push messages.
 */
@ApiModel(description = "The object defining options for push messages.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-14T10:37:13.711751+10:00[Australia/Melbourne]")
public class FeaturesPushOptions {
  /**
   * A flag indicating whether notifications should be enabled for message replies.
   */
  @JsonAdapter(NotificationsEnum.Adapter.class)
  public enum NotificationsEnum {
    ENABLED("enabled"),
    
    DISABLED("disabled");

    private String value;

    NotificationsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NotificationsEnum fromValue(String value) {
      for (NotificationsEnum b : NotificationsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<NotificationsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NotificationsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NotificationsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return NotificationsEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_NOTIFICATIONS = "notifications";
  @SerializedName(SERIALIZED_NAME_NOTIFICATIONS)
  private NotificationsEnum notifications;

  public static final String SERIALIZED_NAME_ESCALATION_MINS = "escalationMins";
  @SerializedName(SERIALIZED_NAME_ESCALATION_MINS)
  private String escalationMins;

  public static final String SERIALIZED_NAME_APP_ID = "appId";
  @SerializedName(SERIALIZED_NAME_APP_ID)
  private String appId;

  /**
   * The priority of the notification.   NORMAL (the default value) will indicate to FCM/APNS to take into consideration the target device&#39;s battery consumption at the expense of delivering the message with a delay.   The value NORMAL maps to priority *NORMAL* in FCM and priority *5* in APNS.   The value HIGH maps to priority *HIGH* in FCM and *10* in APNS.
   */
  @JsonAdapter(PriorityEnum.Adapter.class)
  public enum PriorityEnum {
    NORMAL("NORMAL"),
    
    HIGH("HIGH");

    private String value;

    PriorityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PriorityEnum fromValue(String value) {
      for (PriorityEnum b : PriorityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PriorityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PriorityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PriorityEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PriorityEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private PriorityEnum priority = PriorityEnum.NORMAL;

  public static final String SERIALIZED_NAME_FCM = "fcm";
  @SerializedName(SERIALIZED_NAME_FCM)
  private FeaturesPushOptionsFcm fcm;

  public static final String SERIALIZED_NAME_APNS = "apns";
  @SerializedName(SERIALIZED_NAME_APNS)
  private FeaturesPushOptionsApns apns;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private Object data;

  public FeaturesPushOptions() { 
  }

  public FeaturesPushOptions notifications(NotificationsEnum notifications) {
    
    this.notifications = notifications;
    return this;
  }

   /**
   * A flag indicating whether notifications should be enabled for message replies.
   * @return notifications
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A flag indicating whether notifications should be enabled for message replies.")

  public NotificationsEnum getNotifications() {
    return notifications;
  }


  public void setNotifications(NotificationsEnum notifications) {
    this.notifications = notifications;
  }


  public FeaturesPushOptions escalationMins(String escalationMins) {
    
    this.escalationMins = escalationMins;
    return this;
  }

   /**
   * The number of minutes to wait for a reply until escalating to the next contact.
   * @return escalationMins
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", value = "The number of minutes to wait for a reply until escalating to the next contact.")

  public String getEscalationMins() {
    return escalationMins;
  }


  public void setEscalationMins(String escalationMins) {
    this.escalationMins = escalationMins;
  }


  public FeaturesPushOptions appId(String appId) {
    
    this.appId = appId;
    return this;
  }

   /**
   * The identifier for the registered application.
   * @return appId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "app342983", required = true, value = "The identifier for the registered application.")

  public String getAppId() {
    return appId;
  }


  public void setAppId(String appId) {
    this.appId = appId;
  }


  public FeaturesPushOptions priority(PriorityEnum priority) {
    
    this.priority = priority;
    return this;
  }

   /**
   * The priority of the notification.   NORMAL (the default value) will indicate to FCM/APNS to take into consideration the target device&#39;s battery consumption at the expense of delivering the message with a delay.   The value NORMAL maps to priority *NORMAL* in FCM and priority *5* in APNS.   The value HIGH maps to priority *HIGH* in FCM and *10* in APNS.
   * @return priority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NORMAL", value = "The priority of the notification.   NORMAL (the default value) will indicate to FCM/APNS to take into consideration the target device's battery consumption at the expense of delivering the message with a delay.   The value NORMAL maps to priority *NORMAL* in FCM and priority *5* in APNS.   The value HIGH maps to priority *HIGH* in FCM and *10* in APNS.")

  public PriorityEnum getPriority() {
    return priority;
  }


  public void setPriority(PriorityEnum priority) {
    this.priority = priority;
  }


  public FeaturesPushOptions fcm(FeaturesPushOptionsFcm fcm) {
    
    this.fcm = fcm;
    return this;
  }

   /**
   * Get fcm
   * @return fcm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FeaturesPushOptionsFcm getFcm() {
    return fcm;
  }


  public void setFcm(FeaturesPushOptionsFcm fcm) {
    this.fcm = fcm;
  }


  public FeaturesPushOptions apns(FeaturesPushOptionsApns apns) {
    
    this.apns = apns;
    return this;
  }

   /**
   * Get apns
   * @return apns
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FeaturesPushOptionsApns getApns() {
    return apns;
  }


  public void setApns(FeaturesPushOptionsApns apns) {
    this.apns = apns;
  }


  public FeaturesPushOptions data(Object data) {
    
    this.data = data;
    return this;
  }

   /**
   * Custom key-value pairs of the notification&#39;s payload. These values can be used by the target app for enhanced functionality provided that it has been designed to handle them (images, videos, links etc).  These attributes translate to &lt;span style&#x3D;\&quot;color:red\&quot;&gt;*data*&lt;/span&gt;  in the FCM payload.  For APNS, the custom attributes of *data* are inserted as custom properties outside of the &lt;span style&#x3D;\&quot;color:red\&quot;&gt;*aps*&lt;/span&gt; payload.
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Custom key-value pairs of the notification's payload. These values can be used by the target app for enhanced functionality provided that it has been designed to handle them (images, videos, links etc).  These attributes translate to <span style=\"color:red\">*data*</span>  in the FCM payload.  For APNS, the custom attributes of *data* are inserted as custom properties outside of the <span style=\"color:red\">*aps*</span> payload.")

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
    FeaturesPushOptions featuresPushOptions = (FeaturesPushOptions) o;
    return Objects.equals(this.notifications, featuresPushOptions.notifications) &&
        Objects.equals(this.escalationMins, featuresPushOptions.escalationMins) &&
        Objects.equals(this.appId, featuresPushOptions.appId) &&
        Objects.equals(this.priority, featuresPushOptions.priority) &&
        Objects.equals(this.fcm, featuresPushOptions.fcm) &&
        Objects.equals(this.apns, featuresPushOptions.apns) &&
        Objects.equals(this.data, featuresPushOptions.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notifications, escalationMins, appId, priority, fcm, apns, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeaturesPushOptions {\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("notifications");
    openapiFields.add("escalationMins");
    openapiFields.add("appId");
    openapiFields.add("priority");
    openapiFields.add("fcm");
    openapiFields.add("apns");
    openapiFields.add("data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("appId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FeaturesPushOptions
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (FeaturesPushOptions.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in FeaturesPushOptions is not found in the empty JSON string", FeaturesPushOptions.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FeaturesPushOptions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FeaturesPushOptions` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FeaturesPushOptions.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("notifications") != null && !jsonObj.get("notifications").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notifications` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notifications").toString()));
      }
      if (jsonObj.get("escalationMins") != null && !jsonObj.get("escalationMins").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `escalationMins` to be a primitive type in the JSON string but got `%s`", jsonObj.get("escalationMins").toString()));
      }
      if (jsonObj.get("appId") != null && !jsonObj.get("appId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `appId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("appId").toString()));
      }
      if (jsonObj.get("priority") != null && !jsonObj.get("priority").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `priority` to be a primitive type in the JSON string but got `%s`", jsonObj.get("priority").toString()));
      }
      // validate the optional field `fcm`
      if (jsonObj.getAsJsonObject("fcm") != null) {
        FeaturesPushOptionsFcm.validateJsonObject(jsonObj.getAsJsonObject("fcm"));
      }
      // validate the optional field `apns`
      if (jsonObj.getAsJsonObject("apns") != null) {
        FeaturesPushOptionsApns.validateJsonObject(jsonObj.getAsJsonObject("apns"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FeaturesPushOptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FeaturesPushOptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FeaturesPushOptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FeaturesPushOptions.class));

       return (TypeAdapter<T>) new TypeAdapter<FeaturesPushOptions>() {
           @Override
           public void write(JsonWriter out, FeaturesPushOptions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FeaturesPushOptions read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FeaturesPushOptions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FeaturesPushOptions
  * @throws IOException if the JSON string is invalid with respect to FeaturesPushOptions
  */
  public static FeaturesPushOptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FeaturesPushOptions.class);
  }

 /**
  * Convert an instance of FeaturesPushOptions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

