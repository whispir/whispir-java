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
import java.time.OffsetDateTime;
import java.util.UUID;
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
 * The key object.
 */

public class Key {
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
  private UUID id;

  @SerializedName("type")
  private String type;

  @SerializedName("createdTime")
  private OffsetDateTime createdTime;

  @SerializedName("lastModifiedTime")
  private String lastModifiedTime;

  @SerializedName("description")
  private String description;

  @SerializedName("secret")
  private String secret;

  public Key() {
    super();
  }

  public Key(
    UUID id, 
    String type, 
    OffsetDateTime createdTime, 
    String lastModifiedTime
  ) {
    this();
    this.id = id;
    this.type = type;
    this.createdTime = createdTime;
    this.lastModifiedTime = lastModifiedTime;
  }
   /**
   * The identifier for this key
   * @return id
  **/
  @javax.annotation.Nullable
  public UUID getId() {
    return id;
  }
   /**
   * The authentication type that this Key is used for
   * @return type
  **/
  @javax.annotation.Nonnull
  public String getType() {
    return type;
  }
   /**
   * Timestamp on when the Key has been created
   * @return createdTime
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedTime() {
    return createdTime;
  }
   /**
   * Last Modified data and time
   * @return lastModifiedTime
  **/
  @javax.annotation.Nullable
  public String getLastModifiedTime() {
    return lastModifiedTime;
  }

   /**
   * User provided description usually used for identifying usage
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

   /**
   * The authentication secret
   * @return secret
  **/
  @javax.annotation.Nullable
  public String getSecret() {
    return secret;
  }
  public void setSecret(String secret) {
    this.secret = secret;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Key key = (Key) o;
    return Objects.equals(this.id, key.id) &&
        Objects.equals(this.type, key.type) &&
        Objects.equals(this.createdTime, key.createdTime) &&
        Objects.equals(this.lastModifiedTime, key.lastModifiedTime) &&
        Objects.equals(this.description, key.description) &&
        Objects.equals(this.secret, key.secret);
  }
  @Override
  public int hashCode() {
    return Objects.hash(id, type, createdTime, lastModifiedTime, description, secret);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Key {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    lastModifiedTime: ").append(toIndentedString(lastModifiedTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
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
       if (!Key.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Key' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Key> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Key.class));

       return (TypeAdapter<T>) new TypeAdapter<Key>() {
           @Override
           public void write(JsonWriter out, Key value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Key read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Key given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Key
  * @throws IOException if the JSON string is invalid with respect to Key
  */
  public static Key fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Key.class);
  }

 /**
  * Convert an instance of Key to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

