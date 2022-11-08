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
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.openapitools.client.model.GetCallbacks200ResponseCallbacksInner;
import org.openapitools.client.model.LinkInner;

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
 * The callback object.
 */
@ApiModel(description = "The callback object.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-08T00:42:12.980940Z[Etc/UTC]")
public class GetCallbacks200Response {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_CALLBACKS = "callbacks";
  @SerializedName(SERIALIZED_NAME_CALLBACKS)
  private Set<GetCallbacks200ResponseCallbacksInner> callbacks = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private List<LinkInner> link = new ArrayList<>();

  public GetCallbacks200Response() { 
  }

  
  public GetCallbacks200Response(
     String status, 
     Set<GetCallbacks200ResponseCallbacksInner> callbacks, 
     List<LinkInner> link
  ) {
    this();
    this.status = status;
    this.callbacks = callbacks;
    this.link = link;
  }

   /**
   * Provides the total number of records fetched. This attribute may return \&quot;No records found\&quot; when there are no callbacks available.
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1 to 1 of 1", required = true, value = "Provides the total number of records fetched. This attribute may return \"No records found\" when there are no callbacks available.")

  public String getStatus() {
    return status;
  }




   /**
   * A list of callbacks
   * @return callbacks
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A list of callbacks")

  public Set<GetCallbacks200ResponseCallbacksInner> getCallbacks() {
    return callbacks;
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
    GetCallbacks200Response getCallbacks200Response = (GetCallbacks200Response) o;
    return Objects.equals(this.status, getCallbacks200Response.status) &&
        Objects.equals(this.callbacks, getCallbacks200Response.callbacks) &&
        Objects.equals(this.link, getCallbacks200Response.link);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, callbacks, link);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCallbacks200Response {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    callbacks: ").append(toIndentedString(callbacks)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("callbacks");
    openapiFields.add("link");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("callbacks");
    openapiRequiredFields.add("link");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetCallbacks200Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetCallbacks200Response.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetCallbacks200Response is not found in the empty JSON string", GetCallbacks200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetCallbacks200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetCallbacks200Response` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetCallbacks200Response.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      JsonArray jsonArraycallbacks = jsonObj.getAsJsonArray("callbacks");
      if (jsonArraycallbacks != null) {
        // ensure the json data is an array
        if (!jsonObj.get("callbacks").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `callbacks` to be an array in the JSON string but got `%s`", jsonObj.get("callbacks").toString()));
        }

        // validate the optional field `callbacks` (array)
        for (int i = 0; i < jsonArraycallbacks.size(); i++) {
          GetCallbacks200ResponseCallbacksInner.validateJsonObject(jsonArraycallbacks.get(i).getAsJsonObject());
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
       if (!GetCallbacks200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetCallbacks200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetCallbacks200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetCallbacks200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetCallbacks200Response>() {
           @Override
           public void write(JsonWriter out, GetCallbacks200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetCallbacks200Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetCallbacks200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetCallbacks200Response
  * @throws IOException if the JSON string is invalid with respect to GetCallbacks200Response
  */
  public static GetCallbacks200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetCallbacks200Response.class);
  }

 /**
  * Convert an instance of GetCallbacks200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

