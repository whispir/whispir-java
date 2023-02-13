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
import java.math.BigDecimal;
import java.net.URI;
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
 * The HATEOAS link object.
 */

public class Link {
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
  @SerializedName("uri")
  private URI uri;

  @SerializedName("rel")
  private String rel;

  @SerializedName("method")
  private String method;

  @SerializedName("host")
  private String host;

  @SerializedName("port")
  private BigDecimal port;

  public Link() {
    super();
  }

  public Link(
    URI uri, 
    String rel, 
    String method, 
    String host, 
    BigDecimal port
  ) {
    this();
    this.uri = uri;
    this.rel = rel;
    this.method = method;
    this.host = host;
    this.port = port;
  }
   /**
   * The Universal Resource Identifier for the related resource.
   * @return uri
  **/
  @javax.annotation.Nullable
  public URI getUri() {
    return uri;
  }
   /**
   * The description of the related resource.
   * @return rel
  **/
  @javax.annotation.Nullable
  public String getRel() {
    return rel;
  }
   /**
   * The [REST](https://en.wikipedia.org/wiki/Representational_state_transfer) method required to request the related resource.
   * @return method
  **/
  @javax.annotation.Nullable
  public String getMethod() {
    return method;
  }
   /**
   * The host of the related resource.
   * @return host
  **/
  @javax.annotation.Nullable
  public String getHost() {
    return host;
  }
   /**
   * The port of the related resource.
   * @return port
  **/
  @javax.annotation.Nullable
  public BigDecimal getPort() {
    return port;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Link link = (Link) o;
    return Objects.equals(this.uri, link.uri) &&
        Objects.equals(this.rel, link.rel) &&
        Objects.equals(this.method, link.method) &&
        Objects.equals(this.host, link.host) &&
        Objects.equals(this.port, link.port);
  }
  @Override
  public int hashCode() {
    return Objects.hash(uri, rel, method, host, port);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Link {\n");
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

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Link.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Link' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Link> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Link.class));

       return (TypeAdapter<T>) new TypeAdapter<Link>() {
           @Override
           public void write(JsonWriter out, Link value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Link read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Link given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Link
  * @throws IOException if the JSON string is invalid with respect to Link
  */
  public static Link fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Link.class);
  }

 /**
  * Convert an instance of Link to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

