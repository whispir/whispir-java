package com.whispir.model;
import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.whispir.model.CallbackAuth;
import com.whispir.model.CallbackOptions;
import com.whispir.model.Link;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;
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
 * The callback object, used to configure the callback (also known as webhook).
 */

public class Callback {
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

  @SerializedName("link")
  private List<Link> link;

  @SerializedName("name")
  private String name;

  @SerializedName("url")
  private URI url;

  @SerializedName("auth")
  private CallbackAuth auth;

  @SerializedName("contentType")
  private String contentType;

  @SerializedName("removeHTML")
  private String removeHTML;

  @SerializedName("retriesEnabled")
  private Boolean retriesEnabled;

  @SerializedName("email")
  private String email;

  @SerializedName("callbacks")
  private CallbackOptions callbacks;

  public Callback() {
    super();
  }

  public Callback(
    String id, 
    List<Link> link
  ) {
    this();
    this.id = id;
    this.link = link;
  }
   /**
   * The id of the callback.   This is the value that should be passed when referring to the callback using the API endpoints
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
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
   * The name of the callback.   This is the value that should be passed in the message payload for triggering the callbacks
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

   /**
   * Specifies the service URL that API Callbacks should be forwarded to.
   * @return url
  **/
  @javax.annotation.Nonnull
  public URI getUrl() {
    return url;
  }
  public void setUrl(URI url) {
    this.url = url;
  }

   /**
   * Get auth
   * @return auth
  **/
  @javax.annotation.Nonnull
  public CallbackAuth getAuth() {
    return auth;
  }
  public void setAuth(CallbackAuth auth) {
    this.auth = auth;
  }

   /**
   * Specifies the content type that should be sent to this endpoint.
   * @return contentType
  **/
  @javax.annotation.Nonnull
  public String getContentType() {
    return contentType;
  }
  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

   /**
   * Specifies whether HTML should be stripped from responses.
   * @return removeHTML
  **/
  @javax.annotation.Nonnull
  public String getRemoveHTML() {
    return removeHTML;
  }
  public void setRemoveHTML(String removeHTML) {
    this.removeHTML = removeHTML;
  }

   /**
   * Specifies whether Whispir should perform retries in the event there is a failure accessing the callback service.
   * @return retriesEnabled
  **/
  @javax.annotation.Nonnull
  public Boolean getRetriesEnabled() {
    return retriesEnabled;
  }
  public void setRetriesEnabled(Boolean retriesEnabled) {
    this.retriesEnabled = retriesEnabled;
  }

   /**
   * Whispir notify this email address that a callback has failed (only when retries are disabled).   The email will contain the details of the callback content.
   * @return email
  **/
  @javax.annotation.Nonnull
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

   /**
   * Get callbacks
   * @return callbacks
  **/
  @javax.annotation.Nonnull
  public CallbackOptions getCallbacks() {
    return callbacks;
  }
  public void setCallbacks(CallbackOptions callbacks) {
    this.callbacks = callbacks;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Callback callback = (Callback) o;
    return Objects.equals(this.id, callback.id) &&
        Objects.equals(this.link, callback.link) &&
        Objects.equals(this.name, callback.name) &&
        Objects.equals(this.url, callback.url) &&
        Objects.equals(this.auth, callback.auth) &&
        Objects.equals(this.contentType, callback.contentType) &&
        Objects.equals(this.removeHTML, callback.removeHTML) &&
        Objects.equals(this.retriesEnabled, callback.retriesEnabled) &&
        Objects.equals(this.email, callback.email) &&
        Objects.equals(this.callbacks, callback.callbacks);
  }
  @Override
  public int hashCode() {
    return Objects.hash(id, link, name, url, auth, contentType, removeHTML, retriesEnabled, email, callbacks);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Callback {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    removeHTML: ").append(toIndentedString(removeHTML)).append("\n");
    sb.append("    retriesEnabled: ").append(toIndentedString(retriesEnabled)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    callbacks: ").append(toIndentedString(callbacks)).append("\n");
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
       if (!Callback.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Callback' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Callback> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Callback.class));

       return (TypeAdapter<T>) new TypeAdapter<Callback>() {
           @Override
           public void write(JsonWriter out, Callback value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Callback read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Callback given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Callback
  * @throws IOException if the JSON string is invalid with respect to Callback
  */
  public static Callback fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Callback.class);
  }

 /**
  * Convert an instance of Callback to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

