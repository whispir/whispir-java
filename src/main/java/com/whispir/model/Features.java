package com.whispir.model;
import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.whispir.model.AliasOption;
import com.whispir.model.PushOptions;
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
 * ### Push Messaging  Whispir allows you to send push notifications to any iOS and Android-based apps  Setting up the platform to handle push notifications involves some one-time steps and some periodically repeated steps (updating push tokens). See Apps to get a clear understanding of the related steps and endpoints. Whispir doesn&#39;t support sending push notifications to device tokens directly. Read more in Contact devices about how to register the device tokens under contacts.  ### Message Aliasing  The Whispir UI allows you to configure a sender alias from which messages are sent. Instructions for alias creation can be found in [Configure message aliases](https://au.whispir.com/onlinehelp/Content/Topics-whispir-ua/administration/alias-manager/config-message-aliases.htm) within Whispir documentation.  The message alias can be attached to a message to template, to configure the the sender for the following channels: * SMS - a custom mobile number, e.g. +61 123 456 789 * Email - a custom email address, e.g. marketing@example.com * Voice - a custom mobile number, e.g. +61 123 456 789
 */

public class Features {
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
  @SerializedName("pushOptions")
  private PushOptions pushOptions;

  @SerializedName("aliasOption")
  private AliasOption aliasOption;

  public Features() {
    super();
  }


   /**
   * Get pushOptions
   * @return pushOptions
  **/
  @javax.annotation.Nullable
  public PushOptions getPushOptions() {
    return pushOptions;
  }
  public void setPushOptions(PushOptions pushOptions) {
    this.pushOptions = pushOptions;
  }

   /**
   * Get aliasOption
   * @return aliasOption
  **/
  @javax.annotation.Nullable
  public AliasOption getAliasOption() {
    return aliasOption;
  }
  public void setAliasOption(AliasOption aliasOption) {
    this.aliasOption = aliasOption;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Features features = (Features) o;
    return Objects.equals(this.pushOptions, features.pushOptions) &&
        Objects.equals(this.aliasOption, features.aliasOption);
  }
  @Override
  public int hashCode() {
    return Objects.hash(pushOptions, aliasOption);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Features {\n");
    sb.append("    pushOptions: ").append(toIndentedString(pushOptions)).append("\n");
    sb.append("    aliasOption: ").append(toIndentedString(aliasOption)).append("\n");
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
       if (!Features.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Features' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Features> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Features.class));

       return (TypeAdapter<T>) new TypeAdapter<Features>() {
           @Override
           public void write(JsonWriter out, Features value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Features read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Features given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Features
  * @throws IOException if the JSON string is invalid with respect to Features
  */
  public static Features fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Features.class);
  }

 /**
  * Convert an instance of Features to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

