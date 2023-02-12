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
 * The apns object holds attributes specific to the contacts&#39; APNS-registered (Apple Push Notification Service) iOS devices
 */

public class Apns {
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
  @SerializedName("sound")
  private String sound;

  @SerializedName("action")
  private String action;

  public Apns() {
    super();
  }


   /**
   * The sound to play when the device receives the notification. The value *default* will play the system sound, otherwise this attribute must point to a sound resource in your app&#39;s main bundle or in the *Library/Sounds* folder of your app&#39;s container directory.
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
   * The action linked with a user click on the notification. Translates to the &lt;span style&#x3D;\&quot;color:red\&quot;&gt;*category*&lt;/span&gt; attribute in APNS. 
   * @return action
  **/
  @javax.annotation.Nullable
  public String getAction() {
    return action;
  }
  public void setAction(String action) {
    this.action = action;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Apns apns = (Apns) o;
    return Objects.equals(this.sound, apns.sound) &&
        Objects.equals(this.action, apns.action);
  }
  @Override
  public int hashCode() {
    return Objects.hash(sound, action);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Apns {\n");
    sb.append("    sound: ").append(toIndentedString(sound)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
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
       if (!Apns.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Apns' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Apns> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Apns.class));

       return (TypeAdapter<T>) new TypeAdapter<Apns>() {
           @Override
           public void write(JsonWriter out, Apns value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Apns read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Apns given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Apns
  * @throws IOException if the JSON string is invalid with respect to Apns
  */
  public static Apns fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Apns.class);
  }

 /**
  * Convert an instance of Apns to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

