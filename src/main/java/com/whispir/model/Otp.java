package com.whispir.model;
import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.whispir.model.OtpLinks;
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
 * The OTP object returned when generating and verifying whispir verify codes
 */

public class Otp {
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

  @SerializedName("channel")
  private String channel;

  @SerializedName("codeLength")
  private Integer codeLength;

  @SerializedName("to")
  private String to;

  @SerializedName("expiresAt")
  private String expiresAt;

  @SerializedName("status")
  private String status;

  @SerializedName("links")
  private OtpLinks links;

  public Otp() {
    super();
  }


   /**
   * The ID of the OTP transaction that has been created.
   * @return id
  **/
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
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
   * Indicates the span of the code to be generated.
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
   * Indicates the phone number of the recipient.
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
   * Timestamp when the code will expire in UTC format.
   * @return expiresAt
  **/
  @javax.annotation.Nonnull
  public String getExpiresAt() {
    return expiresAt;
  }
  public void setExpiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
  }

   /**
   * Current status of the otp transaction.
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
   * Get links
   * @return links
  **/
  @javax.annotation.Nonnull
  public OtpLinks getLinks() {
    return links;
  }
  public void setLinks(OtpLinks links) {
    this.links = links;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Otp otp = (Otp) o;
    return Objects.equals(this.id, otp.id) &&
        Objects.equals(this.channel, otp.channel) &&
        Objects.equals(this.codeLength, otp.codeLength) &&
        Objects.equals(this.to, otp.to) &&
        Objects.equals(this.expiresAt, otp.expiresAt) &&
        Objects.equals(this.status, otp.status) &&
        Objects.equals(this.links, otp.links);
  }
  @Override
  public int hashCode() {
    return Objects.hash(id, channel, codeLength, to, expiresAt, status, links);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Otp {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    codeLength: ").append(toIndentedString(codeLength)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
       if (!Otp.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Otp' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Otp> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Otp.class));

       return (TypeAdapter<T>) new TypeAdapter<Otp>() {
           @Override
           public void write(JsonWriter out, Otp value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Otp read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Otp given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Otp
  * @throws IOException if the JSON string is invalid with respect to Otp
  */
  public static Otp fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Otp.class);
  }

 /**
  * Convert an instance of Otp to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

