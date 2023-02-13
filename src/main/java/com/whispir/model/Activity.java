package com.whispir.model;
import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.whispir.model.Link;
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
 * Activities are all the individual changes, tasks, calls, messages and so on performed in a given company workspace.
 */

public class Activity {
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
  @SerializedName("link")
  private List<Link> link;

  @SerializedName("user")
  private String user;

  @SerializedName("time")
  private String time;

  @SerializedName("action")
  private String action;

  @SerializedName("description")
  private String description;

  @SerializedName("status")
  private String status;

  @SerializedName("module")
  private String module;

  @SerializedName("workspaceName")
  private String workspaceName;

  @SerializedName("fullname")
  private String fullname;

  public Activity() {
    super();
  }

  public Activity(
    List<Link> link
  ) {
    this();
    this.link = link;
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
   *  The username of the person who performed this activity. This will usually be the API user invoking the creation.
   * @return user
  **/
  @javax.annotation.Nullable
  public String getUser() {
    return user;
  }
  public void setUser(String user) {
    this.user = user;
  }

   /**
   * The date and time of the activity in the format:dd/mm/yy hh:mm. This will be defaulted to the time at which this activity is created.
   * @return time
  **/
  @javax.annotation.Nullable
  public String getTime() {
    return time;
  }
  public void setTime(String time) {
    this.time = time;
  }

   /**
   * Specifies the action performed during this activity.
   * @return action
  **/
  @javax.annotation.Nullable
  public String getAction() {
    return action;
  }
  public void setAction(String action) {
    this.action = action;
  }

   /**
   * The description of the activity. This is a free text that details about the activity.
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
   * Specifies the status of the activity.
   * @return status
  **/
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

   /**
   * Specifies the module to which this activity belongs to.
   * @return module
  **/
  @javax.annotation.Nullable
  public String getModule() {
    return module;
  }
  public void setModule(String module) {
    this.module = module;
  }

   /**
   * The workspace in which this activity is performed. This will usually be the API user’s default workspace
   * @return workspaceName
  **/
  @javax.annotation.Nullable
  public String getWorkspaceName() {
    return workspaceName;
  }
  public void setWorkspaceName(String workspaceName) {
    this.workspaceName = workspaceName;
  }

   /**
   * Fullname of the user
   * @return fullname
  **/
  @javax.annotation.Nullable
  public String getFullname() {
    return fullname;
  }
  public void setFullname(String fullname) {
    this.fullname = fullname;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Activity activity = (Activity) o;
    return Objects.equals(this.link, activity.link) &&
        Objects.equals(this.user, activity.user) &&
        Objects.equals(this.time, activity.time) &&
        Objects.equals(this.action, activity.action) &&
        Objects.equals(this.description, activity.description) &&
        Objects.equals(this.status, activity.status) &&
        Objects.equals(this.module, activity.module) &&
        Objects.equals(this.workspaceName, activity.workspaceName) &&
        Objects.equals(this.fullname, activity.fullname);
  }
  @Override
  public int hashCode() {
    return Objects.hash(link, user, time, action, description, status, module, workspaceName, fullname);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Activity {\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    module: ").append(toIndentedString(module)).append("\n");
    sb.append("    workspaceName: ").append(toIndentedString(workspaceName)).append("\n");
    sb.append("    fullname: ").append(toIndentedString(fullname)).append("\n");
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
       if (!Activity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Activity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Activity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Activity.class));

       return (TypeAdapter<T>) new TypeAdapter<Activity>() {
           @Override
           public void write(JsonWriter out, Activity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Activity read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Activity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Activity
  * @throws IOException if the JSON string is invalid with respect to Activity
  */
  public static Activity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Activity.class);
  }

 /**
  * Convert an instance of Activity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

