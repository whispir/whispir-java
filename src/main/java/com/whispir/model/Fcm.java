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
 * The fcm object holds attributes specific to the contacts&#39; Firebase-registered Android devices
 */

public class Fcm {
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
  @SerializedName("androidChannelId")
  private String androidChannelId;

  @SerializedName("sound")
  private String sound;

  @SerializedName("action")
  private String action;

  @SerializedName("image")
  private String image;

  public Fcm() {
    super();
  }


   /**
   * Translates to the &lt;span style&#x3D;\&quot;color:red\&quot;&gt;*android_channel_id*&lt;/span&gt; attribute in FCM. Note: use this attribute for devices running Android versions 8 or later.
   * @return androidChannelId
  **/
  @javax.annotation.Nullable
  public String getAndroidChannelId() {
    return androidChannelId;
  }
  public void setAndroidChannelId(String androidChannelId) {
    this.androidChannelId = androidChannelId;
  }

   /**
   * The sound to play when the device receives the notification. The value *default* will play the system sound, otherwise this attribute must point to a sound resource bundled in the app, e.g. *_/res/raw/notification_sound.wav*  Note: This attribute can be used for devices running Android versions older than Android 8. For versions 8+ please use the *androidChannelId*
   * @return sound
  **/
  @javax.annotation.Nullable
  public String getSound() {
    return sound;
  }
  public void setSound(String sound) {
    this.sound = sound;
  }

   /**
   * The action linked with a user click on the notification. Translates to the &lt;span style&#x3D;\&quot;color:red\&quot;&gt;*click_action*&lt;/span&gt; attribute in FCM.
   * @return action
  **/
  @javax.annotation.Nullable
  public String getAction() {
    return action;
  }
  public void setAction(String action) {
    this.action = action;
  }

   /**
   * The URL of an image to be downloaded and displayed in the notification.  Details of the Android support for images in push notifications can be found [here](https://firebase.google.com/docs/cloud-messaging/android/send-image)
   * @return image
  **/
  @javax.annotation.Nullable
  public String getImage() {
    return image;
  }
  public void setImage(String image) {
    this.image = image;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Fcm fcm = (Fcm) o;
    return Objects.equals(this.androidChannelId, fcm.androidChannelId) &&
        Objects.equals(this.sound, fcm.sound) &&
        Objects.equals(this.action, fcm.action) &&
        Objects.equals(this.image, fcm.image);
  }
  @Override
  public int hashCode() {
    return Objects.hash(androidChannelId, sound, action, image);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Fcm {\n");
    sb.append("    androidChannelId: ").append(toIndentedString(androidChannelId)).append("\n");
    sb.append("    sound: ").append(toIndentedString(sound)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
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
       if (!Fcm.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Fcm' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Fcm> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Fcm.class));

       return (TypeAdapter<T>) new TypeAdapter<Fcm>() {
           @Override
           public void write(JsonWriter out, Fcm value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Fcm read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Fcm given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Fcm
  * @throws IOException if the JSON string is invalid with respect to Fcm
  */
  public static Fcm fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Fcm.class);
  }

 /**
  * Convert an instance of Fcm to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

