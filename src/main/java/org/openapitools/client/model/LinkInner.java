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
import java.math.BigDecimal;
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
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import whispir_sdk_java.JSON;

/**
 * The HATEOAS link object.
 */
@ApiModel(description = "The HATEOAS link object.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-21T01:55:16.197234Z[Etc/UTC]")
public class LinkInner {
  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private URI uri;

  public static final String SERIALIZED_NAME_REL = "rel";
  @SerializedName(SERIALIZED_NAME_REL)
  private String rel;

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private String method;

  public static final String SERIALIZED_NAME_HOST = "host";
  @SerializedName(SERIALIZED_NAME_HOST)
  private String host;

  /**
   * The port of the related resource.
   */
  @JsonAdapter(PortEnum.Adapter.class)
  public enum PortEnum {
    NUMBER_MINUS_1(new BigDecimal("-1"));

    private BigDecimal value;

    PortEnum(BigDecimal value) {
      this.value = value;
    }

    public BigDecimal getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PortEnum fromValue(BigDecimal value) {
      for (PortEnum b : PortEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PortEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PortEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PortEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PortEnum.fromValue(new BigDecimal(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private PortEnum port;

  public LinkInner() { 
  }

  public LinkInner uri(URI uri) {
    
    this.uri = uri;
    return this;
  }

   /**
   * The Universal Resource Identifier for the related resource.
   * @return uri
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "https://api.au.whispir.com/workspaces/9A4C5521FFC7B15B/messages/747AB7E716C1802B6476784AEB5C9BB8/messageresponses", required = true, value = "The Universal Resource Identifier for the related resource.")

  public URI getUri() {
    return uri;
  }


  public void setUri(URI uri) {
    this.uri = uri;
  }


  public LinkInner rel(String rel) {
    
    this.rel = rel;
    return this;
  }

   /**
   * The description of the related resource.
   * @return rel
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "self", required = true, value = "The description of the related resource.")

  public String getRel() {
    return rel;
  }


  public void setRel(String rel) {
    this.rel = rel;
  }


  public LinkInner method(String method) {
    
    this.method = method;
    return this;
  }

   /**
   * The [REST](https://en.wikipedia.org/wiki/Representational_state_transfer) method required to request the related resource.
   * @return method
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "GET", required = true, value = "The [REST](https://en.wikipedia.org/wiki/Representational_state_transfer) method required to request the related resource.")

  public String getMethod() {
    return method;
  }


  public void setMethod(String method) {
    this.method = method;
  }


  public LinkInner host(String host) {
    
    this.host = host;
    return this;
  }

   /**
   * The host of the related resource.
   * @return host
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "api.au.whispir.com", required = true, value = "The host of the related resource.")

  public String getHost() {
    return host;
  }


  public void setHost(String host) {
    this.host = host;
  }


  public LinkInner port(PortEnum port) {
    
    this.port = port;
    return this;
  }

   /**
   * The port of the related resource.
   * @return port
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The port of the related resource.")

  public PortEnum getPort() {
    return port;
  }


  public void setPort(PortEnum port) {
    this.port = port;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkInner linkInner = (LinkInner) o;
    return Objects.equals(this.uri, linkInner.uri) &&
        Objects.equals(this.rel, linkInner.rel) &&
        Objects.equals(this.method, linkInner.method) &&
        Objects.equals(this.host, linkInner.host) &&
        Objects.equals(this.port, linkInner.port);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uri, rel, method, host, port);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkInner {\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    rel: ").append(toIndentedString(rel)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
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
    openapiFields.add("uri");
    openapiFields.add("rel");
    openapiFields.add("method");
    openapiFields.add("host");
    openapiFields.add("port");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("uri");
    openapiRequiredFields.add("rel");
    openapiRequiredFields.add("method");
    openapiRequiredFields.add("host");
    openapiRequiredFields.add("port");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LinkInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (LinkInner.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in LinkInner is not found in the empty JSON string", LinkInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!LinkInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LinkInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LinkInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("uri") != null && !jsonObj.get("uri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uri").toString()));
      }
      if (jsonObj.get("rel") != null && !jsonObj.get("rel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rel").toString()));
      }
      if (jsonObj.get("method") != null && !jsonObj.get("method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("method").toString()));
      }
      if (jsonObj.get("host") != null && !jsonObj.get("host").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `host` to be a primitive type in the JSON string but got `%s`", jsonObj.get("host").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LinkInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LinkInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LinkInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LinkInner.class));

       return (TypeAdapter<T>) new TypeAdapter<LinkInner>() {
           @Override
           public void write(JsonWriter out, LinkInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LinkInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LinkInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LinkInner
  * @throws IOException if the JSON string is invalid with respect to LinkInner
  */
  public static LinkInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LinkInner.class);
  }

 /**
  * Convert an instance of LinkInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

