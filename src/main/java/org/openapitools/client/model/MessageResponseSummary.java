/*
 * Whispir Platform API
 * Whispir Platform API for cross channel and multi channel communications. Documentation on each endpoint is available at https://developers.whispir.com.
 *
 * The version of the OpenAPI document: 1.1.0
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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.openapitools.client.model.LinkInner;
import org.openapitools.client.model.MessageResponseSummaryMessageresponsesInner;

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
 * The summary message response object.
 */
@ApiModel(description = "The summary message response object.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-21T01:55:16.197234Z[Etc/UTC]")
public class MessageResponseSummary {
  public static final String SERIALIZED_NAME_MESSAGERESPONSES = "messageresponses";
  @SerializedName(SERIALIZED_NAME_MESSAGERESPONSES)
  private Set<MessageResponseSummaryMessageresponsesInner> messageresponses = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private List<LinkInner> link = new ArrayList<>();

  public MessageResponseSummary() { 
  }

  
  public MessageResponseSummary(
     List<LinkInner> link
  ) {
    this();
    this.link = link;
  }

  public MessageResponseSummary messageresponses(Set<MessageResponseSummaryMessageresponsesInner> messageresponses) {
    
    this.messageresponses = messageresponses;
    return this;
  }

  public MessageResponseSummary addMessageresponsesItem(MessageResponseSummaryMessageresponsesInner messageresponsesItem) {
    this.messageresponses.add(messageresponsesItem);
    return this;
  }

   /**
   * The message response statuses.
   * @return messageresponses
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The message response statuses.")

  public Set<MessageResponseSummaryMessageresponsesInner> getMessageresponses() {
    return messageresponses;
  }


  public void setMessageresponses(Set<MessageResponseSummaryMessageresponsesInner> messageresponses) {
    this.messageresponses = messageresponses;
  }


   /**
   * A [HATEOAS](https://en.wikipedia.org/wiki/HATEOAS) link object, describing all discoverable resources in relation to the original request.
   * @return link
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A [HATEOAS](https://en.wikipedia.org/wiki/HATEOAS) link object, describing all discoverable resources in relation to the original request.")

  public List<LinkInner> getLink() {
    return link;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageResponseSummary messageResponseSummary = (MessageResponseSummary) o;
    return Objects.equals(this.messageresponses, messageResponseSummary.messageresponses) &&
        Objects.equals(this.link, messageResponseSummary.link);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageresponses, link);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageResponseSummary {\n");
    sb.append("    messageresponses: ").append(toIndentedString(messageresponses)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
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
    openapiFields.add("messageresponses");
    openapiFields.add("link");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("messageresponses");
    openapiRequiredFields.add("link");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MessageResponseSummary
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (MessageResponseSummary.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in MessageResponseSummary is not found in the empty JSON string", MessageResponseSummary.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MessageResponseSummary.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MessageResponseSummary` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MessageResponseSummary.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      JsonArray jsonArraymessageresponses = jsonObj.getAsJsonArray("messageresponses");
      if (jsonArraymessageresponses != null) {
        // ensure the json data is an array
        if (!jsonObj.get("messageresponses").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `messageresponses` to be an array in the JSON string but got `%s`", jsonObj.get("messageresponses").toString()));
        }

        // validate the optional field `messageresponses` (array)
        for (int i = 0; i < jsonArraymessageresponses.size(); i++) {
          MessageResponseSummaryMessageresponsesInner.validateJsonObject(jsonArraymessageresponses.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArraylink = jsonObj.getAsJsonArray("link");
      if (jsonArraylink != null) {
        // ensure the json data is an array
        if (!jsonObj.get("link").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `link` to be an array in the JSON string but got `%s`", jsonObj.get("link").toString()));
        }

        // validate the optional field `link` (array)
        for (int i = 0; i < jsonArraylink.size(); i++) {
          LinkInner.validateJsonObject(jsonArraylink.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MessageResponseSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MessageResponseSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MessageResponseSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MessageResponseSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<MessageResponseSummary>() {
           @Override
           public void write(JsonWriter out, MessageResponseSummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MessageResponseSummary read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MessageResponseSummary given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MessageResponseSummary
  * @throws IOException if the JSON string is invalid with respect to MessageResponseSummary
  */
  public static MessageResponseSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MessageResponseSummary.class);
  }

 /**
  * Convert an instance of MessageResponseSummary to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

