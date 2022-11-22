/*
 * Whispir Platform API
 * Whispir Platform API for cross channel and multi channel communications. Documentation on each endpoint is available at https://developers.whispir.com.
 *
 * The version of the OpenAPI document: 1.1.1
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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.SocialSocialInner;

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
 * Whispir can publish content to your Twitter and Facebook walls. Other socials can be made available upon request.
 */
@ApiModel(description = "Whispir can publish content to your Twitter and Facebook walls. Other socials can be made available upon request.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-22T09:15:03.121580Z[Etc/UTC]")
public class Social {
  public static final String SERIALIZED_NAME_SOCIAL = "social";
  @SerializedName(SERIALIZED_NAME_SOCIAL)
  private List<SocialSocialInner> social = null;

  public Social() { 
  }

  public Social social(List<SocialSocialInner> social) {
    
    this.social = social;
    return this;
  }

  public Social addSocialItem(SocialSocialInner socialItem) {
    if (this.social == null) {
      this.social = new ArrayList<>();
    }
    this.social.add(socialItem);
    return this;
  }

   /**
   * The list of social channel content.
   * @return social
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of social channel content.")

  public List<SocialSocialInner> getSocial() {
    return social;
  }


  public void setSocial(List<SocialSocialInner> social) {
    this.social = social;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Social social = (Social) o;
    return Objects.equals(this.social, social.social);
  }

  @Override
  public int hashCode() {
    return Objects.hash(social);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Social {\n");
    sb.append("    social: ").append(toIndentedString(social)).append("\n");
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
    openapiFields.add("social");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Social
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Social.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Social is not found in the empty JSON string", Social.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Social.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Social` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraysocial = jsonObj.getAsJsonArray("social");
      if (jsonArraysocial != null) {
        // ensure the json data is an array
        if (!jsonObj.get("social").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `social` to be an array in the JSON string but got `%s`", jsonObj.get("social").toString()));
        }

        // validate the optional field `social` (array)
        for (int i = 0; i < jsonArraysocial.size(); i++) {
          SocialSocialInner.validateJsonObject(jsonArraysocial.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Social.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Social' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Social> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Social.class));

       return (TypeAdapter<T>) new TypeAdapter<Social>() {
           @Override
           public void write(JsonWriter out, Social value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Social read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Social given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Social
  * @throws IOException if the JSON string is invalid with respect to Social
  */
  public static Social fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Social.class);
  }

 /**
  * Convert an instance of Social to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

