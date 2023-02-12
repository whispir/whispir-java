package com.whispir.model;
import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.whispir.model.Attachments;
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
 * The email channel payload, used when sending an email Message.  Not required when a template is provided.
 */

public class Email {
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
  @SerializedName("body")
  private String body;

  @SerializedName("footer")
  private String footer;

  @SerializedName("type")
  private String type;

  @SerializedName("resources")
  private Attachments resources;

  public Email() {
    super();
  }


   /**
   * The email message body.
   * @return body
  **/
  @javax.annotation.Nonnull
  public String getBody() {
    return body;
  }
  public void setBody(String body) {
    this.body = body;
  }

   /**
   * Plain text or html displayed at the bottom of your email message.
   * @return footer
  **/
  @javax.annotation.Nullable
  public String getFooter() {
    return footer;
  }
  public void setFooter(String footer) {
    this.footer = footer;
  }

   /**
   * The email Message content type.
   * @return type
  **/
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

   /**
   * Get resources
   * @return resources
  **/
  @javax.annotation.Nullable
  public Attachments getResources() {
    return resources;
  }
  public void setResources(Attachments resources) {
    this.resources = resources;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Email email = (Email) o;
    return Objects.equals(this.body, email.body) &&
        Objects.equals(this.footer, email.footer) &&
        Objects.equals(this.type, email.type) &&
        Objects.equals(this.resources, email.resources);
  }
  @Override
  public int hashCode() {
    return Objects.hash(body, footer, type, resources);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Email {\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    footer: ").append(toIndentedString(footer)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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
       if (!Email.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Email' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Email> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Email.class));

       return (TypeAdapter<T>) new TypeAdapter<Email>() {
           @Override
           public void write(JsonWriter out, Email value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Email read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Email given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Email
  * @throws IOException if the JSON string is invalid with respect to Email
  */
  public static Email fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Email.class);
  }

 /**
  * Convert an instance of Email to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

