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
 * The message responder object.
 */
@ApiModel(description = "The message responder object.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-08T00:42:12.980940Z[Etc/UTC]")
public class MessageResponseDetailedMessageresponsesInnerFrom {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_MRI = "mri";
  @SerializedName(SERIALIZED_NAME_MRI)
  private String mri;

  public static final String SERIALIZED_NAME_MOBILE = "mobile";
  @SerializedName(SERIALIZED_NAME_MOBILE)
  private String mobile;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_VOICE = "voice";
  @SerializedName(SERIALIZED_NAME_VOICE)
  private String voice;

  public MessageResponseDetailedMessageresponsesInnerFrom() { 
  }

  public MessageResponseDetailedMessageresponsesInnerFrom name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The message responder&#39;s name.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Test User", required = true, value = "The message responder's name.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public MessageResponseDetailedMessageresponsesInnerFrom mri(String mri) {
    
    this.mri = mri;
    return this;
  }

   /**
   * The message responder&#39;s MRI.
   * @return mri
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "testUser.au@User.whispir.com", required = true, value = "The message responder's MRI.")

  public String getMri() {
    return mri;
  }


  public void setMri(String mri) {
    this.mri = mri;
  }


  public MessageResponseDetailedMessageresponsesInnerFrom mobile(String mobile) {
    
    this.mobile = mobile;
    return this;
  }

   /**
   * The message responder&#39;s mobile number.
   * @return mobile
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "61400400400", required = true, value = "The message responder's mobile number.")

  public String getMobile() {
    return mobile;
  }


  public void setMobile(String mobile) {
    this.mobile = mobile;
  }


  public MessageResponseDetailedMessageresponsesInnerFrom email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * The message responder&#39;s email address.
   * @return email
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "tuser@whispir.com", required = true, value = "The message responder's email address.")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public MessageResponseDetailedMessageresponsesInnerFrom voice(String voice) {
    
    this.voice = voice;
    return this;
  }

   /**
   * The message responder&#39;s voice number.
   * @return voice
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "61400400400", required = true, value = "The message responder's voice number.")

  public String getVoice() {
    return voice;
  }


  public void setVoice(String voice) {
    this.voice = voice;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageResponseDetailedMessageresponsesInnerFrom messageResponseDetailedMessageresponsesInnerFrom = (MessageResponseDetailedMessageresponsesInnerFrom) o;
    return Objects.equals(this.name, messageResponseDetailedMessageresponsesInnerFrom.name) &&
        Objects.equals(this.mri, messageResponseDetailedMessageresponsesInnerFrom.mri) &&
        Objects.equals(this.mobile, messageResponseDetailedMessageresponsesInnerFrom.mobile) &&
        Objects.equals(this.email, messageResponseDetailedMessageresponsesInnerFrom.email) &&
        Objects.equals(this.voice, messageResponseDetailedMessageresponsesInnerFrom.voice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, mri, mobile, email, voice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageResponseDetailedMessageresponsesInnerFrom {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    mri: ").append(toIndentedString(mri)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    voice: ").append(toIndentedString(voice)).append("\n");
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
    openapiFields.add("email");
    openapiFields.add("voice");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("mri");
    openapiRequiredFields.add("mobile");
    openapiRequiredFields.add("email");
    openapiRequiredFields.add("voice");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MessageResponseDetailedMessageresponsesInnerFrom
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (MessageResponseDetailedMessageresponsesInnerFrom.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in MessageResponseDetailedMessageresponsesInnerFrom is not found in the empty JSON string", MessageResponseDetailedMessageresponsesInnerFrom.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MessageResponseDetailedMessageresponsesInnerFrom.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MessageResponseDetailedMessageresponsesInnerFrom` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MessageResponseDetailedMessageresponsesInnerFrom.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
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
      if (jsonObj.get("email") != null && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if (jsonObj.get("voice") != null && !jsonObj.get("voice").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voice` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voice").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MessageResponseDetailedMessageresponsesInnerFrom.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MessageResponseDetailedMessageresponsesInnerFrom' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MessageResponseDetailedMessageresponsesInnerFrom> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MessageResponseDetailedMessageresponsesInnerFrom.class));

       return (TypeAdapter<T>) new TypeAdapter<MessageResponseDetailedMessageresponsesInnerFrom>() {
           @Override
           public void write(JsonWriter out, MessageResponseDetailedMessageresponsesInnerFrom value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MessageResponseDetailedMessageresponsesInnerFrom read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MessageResponseDetailedMessageresponsesInnerFrom given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MessageResponseDetailedMessageresponsesInnerFrom
  * @throws IOException if the JSON string is invalid with respect to MessageResponseDetailedMessageresponsesInnerFrom
  */
  public static MessageResponseDetailedMessageresponsesInnerFrom fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MessageResponseDetailedMessageresponsesInnerFrom.class);
  }

 /**
  * Convert an instance of MessageResponseDetailedMessageresponsesInnerFrom to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

