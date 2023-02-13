package com.whispir.model;
import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.whispir.model.Link;
import com.whispir.model.User;
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
 * List users object
 */

public class UserCollection {
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
  @SerializedName("users")
  private List<User> users;

  @SerializedName("status")
  private String status;

  @SerializedName("link")
  private List<Link> link;

  public UserCollection() {
    super();
  }

  public UserCollection(
    List<User> users, 
    String status, 
    List<Link> link
  ) {
    this();
    this.users = users;
    this.status = status;
    this.link = link;
  }
   /**
   * List of retrieved users
   * @return users
  **/
  @javax.annotation.Nullable
  public List<User> getUsers() {
    return users;
  }
   /**
   * Provides the total number of records fetched. This attribute may return \&quot;No records found\&quot; when there are no users available.
   * @return status
  **/
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }
   /**
   * A [HATEOAS](https://en.wikipedia.org/wiki/HATEOAS) link array, describing all discoverable resources in relation to the original request.
   * @return link
  **/
  @javax.annotation.Nullable
  public List<Link> getLink() {
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
    UserCollection userCollection = (UserCollection) o;
    return Objects.equals(this.users, userCollection.users) &&
        Objects.equals(this.status, userCollection.status) &&
        Objects.equals(this.link, userCollection.link);
  }
  @Override
  public int hashCode() {
    return Objects.hash(users, status, link);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserCollection {\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserCollection.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserCollection' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserCollection> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserCollection.class));

       return (TypeAdapter<T>) new TypeAdapter<UserCollection>() {
           @Override
           public void write(JsonWriter out, UserCollection value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UserCollection read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UserCollection given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UserCollection
  * @throws IOException if the JSON string is invalid with respect to UserCollection
  */
  public static UserCollection fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserCollection.class);
  }

 /**
  * Convert an instance of UserCollection to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

