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
 * The message responder object.
 */

public class Responder {
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

  @SerializedName("mri")
  private String mri;

  @SerializedName("mobile")
  private String mobile;

  @SerializedName("voice")
  private String voice;

  @SerializedName("email")
  private String email;

  public Responder() {
    super();
  }

  public Responder(
    String name, 
    String mri, 
    String mobile, 
    String voice, 
    String email
  ) {
    this();
    this.name = name;
    this.mri = mri;
    this.mobile = mobile;
    this.voice = voice;
    this.email = email;
  }
   /**
   * The name of the sender of this message
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }
   /**
   * The unique identifier for this contact within Whispir
   * @return mri
  **/
  @javax.annotation.Nonnull
  public String getMri() {
    return mri;
  }
   /**
   * The mobile phone number associated with this sender
   * @return mobile
  **/
  @javax.annotation.Nonnull
  public String getMobile() {
    return mobile;
  }
   /**
   * The phone number associated with the voice channel for this sender
   * @return voice
  **/
  @javax.annotation.Nonnull
  public String getVoice() {
    return voice;
  }
   /**
   * The email address associated with the email channel for this sender
   * @return email
  **/
  @javax.annotation.Nonnull
  public String getEmail() {
    return email;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Responder responder = (Responder) o;
    return Objects.equals(this.name, responder.name) &&
        Objects.equals(this.mri, responder.mri) &&
        Objects.equals(this.mobile, responder.mobile) &&
        Objects.equals(this.voice, responder.voice) &&
        Objects.equals(this.email, responder.email);
  }
  @Override
  public int hashCode() {
    return Objects.hash(name, mri, mobile, voice, email);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Responder {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    mri: ").append(toIndentedString(mri)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    voice: ").append(toIndentedString(voice)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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
       if (!Responder.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Responder' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Responder> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Responder.class));

       return (TypeAdapter<T>) new TypeAdapter<Responder>() {
           @Override
           public void write(JsonWriter out, Responder value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Responder read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Responder given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Responder
  * @throws IOException if the JSON string is invalid with respect to Responder
  */
  public static Responder fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Responder.class);
  }

 /**
  * Convert an instance of Responder to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

