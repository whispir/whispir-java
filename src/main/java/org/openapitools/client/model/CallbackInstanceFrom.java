/*
 * Whispir Platform API
 * Whispir Platform API for cross channel and multi channel communications. Documentation on each endpoint is available at https://developers.whispir.com.
 *
 * The version of the OpenAPI document: 1.0.4
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
 * The details about this particular message sender/responder
 */
@ApiModel(description = "The details about this particular message sender/responder")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-08T00:42:12.980940Z[Etc/UTC]")
public class CallbackInstanceFrom {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_MRI = "mri";
  @SerializedName(SERIALIZED_NAME_MRI)
  private String mri;

  public static final String SERIALIZED_NAME_MOBILE = "mobile";
  @SerializedName(SERIALIZED_NAME_MOBILE)
  private String mobile;

  public static final String SERIALIZED_NAME_VOICE = "voice";
  @SerializedName(SERIALIZED_NAME_VOICE)
  private String voice;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public CallbackInstanceFrom() { 
  }

  public CallbackInstanceFrom name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the sender of this message
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "John Wick", value = "The name of the sender of this message")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CallbackInstanceFrom mri(String mri) {
    
    this.mri = mri;
    return this;
  }

   /**
   * The unique identifier for this contact within Whispir
   * @return mri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "support@whispir.com", value = "The unique identifier for this contact within Whispir")

  public String getMri() {
    return mri;
  }


  public void setMri(String mri) {
    this.mri = mri;
  }


  public CallbackInstanceFrom mobile(String mobile) {
    
    this.mobile = mobile;
    return this;
  }

   /**
   * The mobile phone number associated with this sender
   * @return mobile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "61400400400", value = "The mobile phone number associated with this sender")

  public String getMobile() {
    return mobile;
  }


  public void setMobile(String mobile) {
    this.mobile = mobile;
  }


  public CallbackInstanceFrom voice(String voice) {
    
    this.voice = voice;
    return this;
  }

   /**
   * The phone number associated with the voice channel for this sender
   * @return voice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "61400400400", value = "The phone number associated with the voice channel for this sender")

  public String getVoice() {
    return voice;
  }


  public void setVoice(String voice) {
    this.voice = voice;
  }


  public CallbackInstanceFrom email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * The email address associated with the email channel for this sender
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "support@whispir.com", value = "The email address associated with the email channel for this sender")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallbackInstanceFrom callbackInstanceFrom = (CallbackInstanceFrom) o;
    return Objects.equals(this.name, callbackInstanceFrom.name) &&
        Objects.equals(this.mri, callbackInstanceFrom.mri) &&
        Objects.equals(this.mobile, callbackInstanceFrom.mobile) &&
        Objects.equals(this.voice, callbackInstanceFrom.voice) &&
        Objects.equals(this.email, callbackInstanceFrom.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, mri, mobile, voice, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallbackInstanceFrom {\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("name");
    openapiFields.add("mri");
    openapiFields.add("mobile");
    openapiFields.add("voice");
    openapiFields.add("email");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CallbackInstanceFrom
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CallbackInstanceFrom.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CallbackInstanceFrom is not found in the empty JSON string", CallbackInstanceFrom.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CallbackInstanceFrom.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CallbackInstanceFrom` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("mri") != null && !jsonObj.get("mri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mri").toString()));
      }
      if (jsonObj.get("mobile") != null && !jsonObj.get("mobile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mobile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mobile").toString()));
      }
      if (jsonObj.get("voice") != null && !jsonObj.get("voice").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voice` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voice").toString()));
      }
      if (jsonObj.get("email") != null && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CallbackInstanceFrom.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CallbackInstanceFrom' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CallbackInstanceFrom> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CallbackInstanceFrom.class));

       return (TypeAdapter<T>) new TypeAdapter<CallbackInstanceFrom>() {
           @Override
           public void write(JsonWriter out, CallbackInstanceFrom value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CallbackInstanceFrom read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CallbackInstanceFrom given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CallbackInstanceFrom
  * @throws IOException if the JSON string is invalid with respect to CallbackInstanceFrom
  */
  public static CallbackInstanceFrom fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CallbackInstanceFrom.class);
  }

 /**
  * Convert an instance of CallbackInstanceFrom to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

