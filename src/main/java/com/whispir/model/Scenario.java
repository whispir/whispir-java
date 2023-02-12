package com.whispir.model;
import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.whispir.model.Email;
import com.whispir.model.Message;
import com.whispir.model.Social;
import com.whispir.model.Voice;
import com.whispir.model.Web;
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
 * Scenarios allows you to simplify the message delivery process through automated, one-click communications.
 */

public class Scenario {
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
  @SerializedName("name")
  private String name;

  @SerializedName("description")
  private String description;

  @SerializedName("allowedUsers")
  private String allowedUsers;

  @SerializedName("allowedUserIds")
  private String allowedUserIds;

  @SerializedName("message")
  private Message message;

  @SerializedName("to")
  private String to;

  @SerializedName("subject")
  private String subject;

  @SerializedName("label")
  private String label;

  @SerializedName("email")
  private Email email;

  @SerializedName("voice")
  private Voice voice;

  @SerializedName("web")
  private Web web;

  @SerializedName("social")
  private Social social;

  public Scenario() {
    super();
  }


   /**
   * Specifies the name of the scenario
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
   * Specifies the description of the scenario
   * @return description
  **/
  @javax.annotation.Nonnull
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

   /**
   * Specifies the usage permission - 1)EVERYONE 2)SELECTEDUSERS When SELECTEDUSERS is provided, then &#x60;allowedUserIds&#x60; shall contain the userID of the allowed users.
   * @return allowedUsers
  **/
  @javax.annotation.Nullable
  public String getAllowedUsers() {
    return allowedUsers;
  }
  public void setAllowedUsers(String allowedUsers) {
    this.allowedUsers = allowedUsers;
  }

   /**
   * Specifies the comma separated list of users who can run this scenario.Only contains value when the allowedUsers is set to &#x60;SELECTEDUSERS&#x60;
   * @return allowedUserIds
  **/
  @javax.annotation.Nullable
  public String getAllowedUserIds() {
    return allowedUserIds;
  }
  public void setAllowedUserIds(String allowedUserIds) {
    this.allowedUserIds = allowedUserIds;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nonnull
  public Message getMessage() {
    return message;
  }
  public void setMessage(Message message) {
    this.message = message;
  }

   /**
   * Specifies the phone number or MRI or distribution list to which the message has to be sent
   * @return to
  **/
  @javax.annotation.Nullable
  public String getTo() {
    return to;
  }
  public void setTo(String to) {
    this.to = to;
  }

   /**
   * Specifies the subject of the message
   * @return subject
  **/
  @javax.annotation.Nullable
  public String getSubject() {
    return subject;
  }
  public void setSubject(String subject) {
    this.subject = subject;
  }

   /**
   * Specifies the label for the message (to view during reporting)
   * @return label
  **/
  @javax.annotation.Nullable
  public String getLabel() {
    return label;
  }
  public void setLabel(String label) {
    this.label = label;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  public Email getEmail() {
    return email;
  }
  public void setEmail(Email email) {
    this.email = email;
  }

   /**
   * Get voice
   * @return voice
  **/
  @javax.annotation.Nullable
  public Voice getVoice() {
    return voice;
  }
  public void setVoice(Voice voice) {
    this.voice = voice;
  }

   /**
   * Get web
   * @return web
  **/
  @javax.annotation.Nullable
  public Web getWeb() {
    return web;
  }
  public void setWeb(Web web) {
    this.web = web;
  }

   /**
   * Get social
   * @return social
  **/
  @javax.annotation.Nullable
  public Social getSocial() {
    return social;
  }
  public void setSocial(Social social) {
    this.social = social;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Scenario scenario = (Scenario) o;
    return Objects.equals(this.name, scenario.name) &&
        Objects.equals(this.description, scenario.description) &&
        Objects.equals(this.allowedUsers, scenario.allowedUsers) &&
        Objects.equals(this.allowedUserIds, scenario.allowedUserIds) &&
        Objects.equals(this.message, scenario.message) &&
        Objects.equals(this.to, scenario.to) &&
        Objects.equals(this.subject, scenario.subject) &&
        Objects.equals(this.label, scenario.label) &&
        Objects.equals(this.email, scenario.email) &&
        Objects.equals(this.voice, scenario.voice) &&
        Objects.equals(this.web, scenario.web) &&
        Objects.equals(this.social, scenario.social);
  }
  @Override
  public int hashCode() {
    return Objects.hash(name, description, allowedUsers, allowedUserIds, message, to, subject, label, email, voice, web, social);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Scenario {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    allowedUsers: ").append(toIndentedString(allowedUsers)).append("\n");
    sb.append("    allowedUserIds: ").append(toIndentedString(allowedUserIds)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    voice: ").append(toIndentedString(voice)).append("\n");
    sb.append("    web: ").append(toIndentedString(web)).append("\n");
    sb.append("    social: ").append(toIndentedString(social)).append("\n");
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
       if (!Scenario.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Scenario' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Scenario> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Scenario.class));

       return (TypeAdapter<T>) new TypeAdapter<Scenario>() {
           @Override
           public void write(JsonWriter out, Scenario value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Scenario read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Scenario given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Scenario
  * @throws IOException if the JSON string is invalid with respect to Scenario
  */
  public static Scenario fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Scenario.class);
  }

 /**
  * Convert an instance of Scenario to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

