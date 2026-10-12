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
 * The object containing the information required to send the one time password.
 */

public class SendCodeCreateRequest {
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
  @SerializedName("workspaceId")
  private String workspaceId;

  @SerializedName("channel")
  private String channel;

  @SerializedName("to")
  private String to;

  @SerializedName("codeLength")
  private Integer codeLength;

  @SerializedName("expiresIn")
  private Integer expiresIn;

  public SendCodeCreateRequest() {
    super();
  }


   /**
   * The ID of the workspace where you will use your one time password.
   * @return workspaceId
  **/
  @javax.annotation.Nonnull
  public String getWorkspaceId() {
    return workspaceId;
  }
  public void setWorkspaceId(String workspaceId) {
    this.workspaceId = workspaceId;
  }

   /**
   * Channel where to send the one time passwords.
   * @return channel
  **/
  @javax.annotation.Nonnull
  public String getChannel() {
    return channel;
  }
  public void setChannel(String channel) {
    this.channel = channel;
  }

   /**
   * Indicates the recipient&#39;s contact information.
   * @return to
  **/
  @javax.annotation.Nonnull
  public String getTo() {
    return to;
  }
  public void setTo(String to) {
    this.to = to;
  }

   /**
   * Indicates the span of the code to be generated.
   * minimum: 6
   * maximum: 15
   * @return codeLength
  **/
  @javax.annotation.Nonnull
  public Integer getCodeLength() {
    return codeLength;
  }
  public void setCodeLength(Integer codeLength) {
    this.codeLength = codeLength;
  }

   /**
   * Indicates the expiry of the code generated in the unit of seconds
   * maximum: 86400
   * @return expiresIn
  **/
  @javax.annotation.Nonnull
  public Integer getExpiresIn() {
    return expiresIn;
  }
  public void setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendCodeCreateRequest sendCodeCreateRequest = (SendCodeCreateRequest) o;
    return Objects.equals(this.workspaceId, sendCodeCreateRequest.workspaceId) &&
        Objects.equals(this.channel, sendCodeCreateRequest.channel) &&
        Objects.equals(this.to, sendCodeCreateRequest.to) &&
        Objects.equals(this.codeLength, sendCodeCreateRequest.codeLength) &&
        Objects.equals(this.expiresIn, sendCodeCreateRequest.expiresIn);
  }
  @Override
  public int hashCode() {
    return Objects.hash(workspaceId, channel, to, codeLength, expiresIn);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendCodeCreateRequest {\n");
    sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    codeLength: ").append(toIndentedString(codeLength)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
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
       if (!SendCodeCreateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SendCodeCreateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SendCodeCreateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SendCodeCreateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SendCodeCreateRequest>() {
           @Override
           public void write(JsonWriter out, SendCodeCreateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SendCodeCreateRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SendCodeCreateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SendCodeCreateRequest
  * @throws IOException if the JSON string is invalid with respect to SendCodeCreateRequest
  */
  public static SendCodeCreateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SendCodeCreateRequest.class);
  }

 /**
  * Convert an instance of SendCodeCreateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

