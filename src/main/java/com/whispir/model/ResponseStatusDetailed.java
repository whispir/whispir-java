package com.whispir.model;
import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.whispir.model.Responder;
import com.whispir.model.Response;
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
 * ResponseStatusDetailed
 */

public class ResponseStatusDetailed {
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
  @SerializedName("responseCategory")
  private String responseCategory;

  @SerializedName("from")
  private Responder from;

  @SerializedName("responseMessage")
  private Response responseMessage;

  public ResponseStatusDetailed() {
    super();
  }

  public ResponseStatusDetailed(
    String responseCategory
  ) {
    this();
    this.responseCategory = responseCategory;
  }
   /**
   * The message response category.  * &#x60;noresponse&#x60; - the message was sent but was not replied to * &#x60;notmatched&#x60; - the message was replied to and the answer didn&#39;t match any search criteria
   * @return responseCategory
  **/
  @javax.annotation.Nonnull
  public String getResponseCategory() {
    return responseCategory;
  }

   /**
   * Get from
   * @return from
  **/
  @javax.annotation.Nonnull
  public Responder getFrom() {
    return from;
  }
  public void setFrom(Responder from) {
    this.from = from;
  }

   /**
   * Get responseMessage
   * @return responseMessage
  **/
  @javax.annotation.Nonnull
  public Response getResponseMessage() {
    return responseMessage;
  }
  public void setResponseMessage(Response responseMessage) {
    this.responseMessage = responseMessage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseStatusDetailed responseStatusDetailed = (ResponseStatusDetailed) o;
    return Objects.equals(this.responseCategory, responseStatusDetailed.responseCategory) &&
        Objects.equals(this.from, responseStatusDetailed.from) &&
        Objects.equals(this.responseMessage, responseStatusDetailed.responseMessage);
  }
  @Override
  public int hashCode() {
    return Objects.hash(responseCategory, from, responseMessage);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseStatusDetailed {\n");
    sb.append("    responseCategory: ").append(toIndentedString(responseCategory)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    responseMessage: ").append(toIndentedString(responseMessage)).append("\n");
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
       if (!ResponseStatusDetailed.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResponseStatusDetailed' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResponseStatusDetailed> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResponseStatusDetailed.class));

       return (TypeAdapter<T>) new TypeAdapter<ResponseStatusDetailed>() {
           @Override
           public void write(JsonWriter out, ResponseStatusDetailed value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResponseStatusDetailed read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ResponseStatusDetailed given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ResponseStatusDetailed
  * @throws IOException if the JSON string is invalid with respect to ResponseStatusDetailed
  */
  public static ResponseStatusDetailed fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResponseStatusDetailed.class);
  }

 /**
  * Convert an instance of ResponseStatusDetailed to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

