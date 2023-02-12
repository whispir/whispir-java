package com.whispir.model;
import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.whispir.model.CallbackInvocation;
import com.whispir.model.Link;
import com.whispir.model.Responder;
import com.whispir.model.Response;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
 * A callback call object
 */

public class CallbackCall {
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
  @SerializedName("id")
  private String id;

  @SerializedName("messageId")
  private String messageId;

  @SerializedName("messageLocation")
  private String messageLocation;

  @SerializedName("link")
  private List<Link> link;

  @SerializedName("status")
  private String status;

  @SerializedName("from")
  private Responder from;

  @SerializedName("responseMessage")
  private Response responseMessage;

  @SerializedName("callback")
  private CallbackInvocation callback;

  public CallbackCall() {
    super();
  }

  public CallbackCall(
    String id, 
    String messageId, 
    String messageLocation, 
    List<Link> link
  ) {
    this();
    this.id = id;
    this.messageId = messageId;
    this.messageLocation = messageLocation;
    this.link = link;
  }
   /**
   * The unique ID of the specific call within Whispir
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }
   /**
   * The unique ID of the message within Whispir
   * @return messageId
  **/
  @javax.annotation.Nullable
  public String getMessageId() {
    return messageId;
  }
   /**
   * The fully qualified URL to the original message within Whispir
   * @return messageLocation
  **/
  @javax.annotation.Nullable
  public String getMessageLocation() {
    return messageLocation;
  }
   /**
   * A [HATEOAS](https://en.wikipedia.org/wiki/HATEOAS) link array, describing all discoverable resources in relation to the original request.
   * @return link
  **/
  @javax.annotation.Nullable
  public List<Link> getLink() {
    return link;
  }

   /**
   * The status of this particular callback attempt.
   * @return status
  **/
  @javax.annotation.Nonnull
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

   /**
   * Get from
   * @return from
  **/
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
  public Response getResponseMessage() {
    return responseMessage;
  }
  public void setResponseMessage(Response responseMessage) {
    this.responseMessage = responseMessage;
  }

   /**
   * Get callback
   * @return callback
  **/
  @javax.annotation.Nullable
  public CallbackInvocation getCallback() {
    return callback;
  }
  public void setCallback(CallbackInvocation callback) {
    this.callback = callback;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallbackCall callbackCall = (CallbackCall) o;
    return Objects.equals(this.id, callbackCall.id) &&
        Objects.equals(this.messageId, callbackCall.messageId) &&
        Objects.equals(this.messageLocation, callbackCall.messageLocation) &&
        Objects.equals(this.link, callbackCall.link) &&
        Objects.equals(this.status, callbackCall.status) &&
        Objects.equals(this.from, callbackCall.from) &&
        Objects.equals(this.responseMessage, callbackCall.responseMessage) &&
        Objects.equals(this.callback, callbackCall.callback);
  }
  @Override
  public int hashCode() {
    return Objects.hash(id, messageId, messageLocation, link, status, from, responseMessage, callback);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallbackCall {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    messageLocation: ").append(toIndentedString(messageLocation)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    responseMessage: ").append(toIndentedString(responseMessage)).append("\n");
    sb.append("    callback: ").append(toIndentedString(callback)).append("\n");
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
       if (!CallbackCall.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CallbackCall' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CallbackCall> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CallbackCall.class));

       return (TypeAdapter<T>) new TypeAdapter<CallbackCall>() {
           @Override
           public void write(JsonWriter out, CallbackCall value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CallbackCall read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CallbackCall given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CallbackCall
  * @throws IOException if the JSON string is invalid with respect to CallbackCall
  */
  public static CallbackCall fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CallbackCall.class);
  }

 /**
  * Convert an instance of CallbackCall to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

