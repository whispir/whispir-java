/*
 * Whispir Platform API
 * Whispir Platform API for cross channel and multi channel communications. Documentation on each endpoint is available at https://developers.whispir.com.
 *
 * The version of the OpenAPI document: 1.1.1
 * Contact: support@whispir.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

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
import org.openapitools.client.model.Email;
import org.openapitools.client.model.Message;
import org.openapitools.client.model.Social;
import org.openapitools.client.model.Voice;
import org.openapitools.client.model.Web;

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
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import whispir_sdk_java.JSON;

/**
 * Scenarios allows you to simplify the message delivery process through automated, one-click communications.
 */
@ApiModel(description = "Scenarios allows you to simplify the message delivery process through automated, one-click communications.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-22T09:15:03.121580Z[Etc/UTC]")
public class Scenario {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  /**
   * Specifies the usage permission - 1)EVERYONE 2)SELECTEDUSERS When SELECTEDUSERS is provided, then &#x60;allowedUserIds&#x60; shall contain the userID of the allowed users.
   */
  @JsonAdapter(AllowedUsersEnum.Adapter.class)
  public enum AllowedUsersEnum {
    EVERYONE("EVERYONE"),
    
    SELECTEDUSERS("SELECTEDUSERS");

    private String value;

    AllowedUsersEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AllowedUsersEnum fromValue(String value) {
      for (AllowedUsersEnum b : AllowedUsersEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AllowedUsersEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AllowedUsersEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AllowedUsersEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AllowedUsersEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ALLOWED_USERS = "allowedUsers";
  @SerializedName(SERIALIZED_NAME_ALLOWED_USERS)
  private AllowedUsersEnum allowedUsers;

  public static final String SERIALIZED_NAME_ALLOWED_USER_IDS = "allowedUserIds";
  @SerializedName(SERIALIZED_NAME_ALLOWED_USER_IDS)
  private String allowedUserIds;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private Message message;

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private String to;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private Email email;

  public static final String SERIALIZED_NAME_VOICE = "voice";
  @SerializedName(SERIALIZED_NAME_VOICE)
  private Voice voice;

  public static final String SERIALIZED_NAME_WEB = "web";
  @SerializedName(SERIALIZED_NAME_WEB)
  private Web web;

  public static final String SERIALIZED_NAME_SOCIAL = "social";
  @SerializedName(SERIALIZED_NAME_SOCIAL)
  private Social social;

  public Scenario() { 
  }

  public Scenario name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Specifies the name of the scenario
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Fire Evacuation Block A", required = true, value = "Specifies the name of the scenario")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Scenario description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Specifies the description of the scenario
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Fire evacuation notification for A block residents", required = true, value = "Specifies the description of the scenario")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Scenario allowedUsers(AllowedUsersEnum allowedUsers) {
    
    this.allowedUsers = allowedUsers;
    return this;
  }

   /**
   * Specifies the usage permission - 1)EVERYONE 2)SELECTEDUSERS When SELECTEDUSERS is provided, then &#x60;allowedUserIds&#x60; shall contain the userID of the allowed users.
   * @return allowedUsers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SELECTEDUSERS", value = "Specifies the usage permission - 1)EVERYONE 2)SELECTEDUSERS When SELECTEDUSERS is provided, then `allowedUserIds` shall contain the userID of the allowed users.")

  public AllowedUsersEnum getAllowedUsers() {
    return allowedUsers;
  }


  public void setAllowedUsers(AllowedUsersEnum allowedUsers) {
    this.allowedUsers = allowedUsers;
  }


  public Scenario allowedUserIds(String allowedUserIds) {
    
    this.allowedUserIds = allowedUserIds;
    return this;
  }

   /**
   * Specifies the comma separated list of users who can run this scenario.Only contains value when the allowedUsers is set to &#x60;SELECTEDUSERS&#x60;
   * @return allowedUserIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4DC922649AFE370C", value = "Specifies the comma separated list of users who can run this scenario.Only contains value when the allowedUsers is set to `SELECTEDUSERS`")

  public String getAllowedUserIds() {
    return allowedUserIds;
  }


  public void setAllowedUserIds(String allowedUserIds) {
    this.allowedUserIds = allowedUserIds;
  }


  public Scenario message(Message message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Message getMessage() {
    return message;
  }


  public void setMessage(Message message) {
    this.message = message;
  }


  public Scenario to(String to) {
    
    this.to = to;
    return this;
  }

   /**
   * Specifies the phone number or MRI or distribution list to which the message has to be sent
   * @return to
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "61400400400", value = "Specifies the phone number or MRI or distribution list to which the message has to be sent")

  public String getTo() {
    return to;
  }


  public void setTo(String to) {
    this.to = to;
  }


  public Scenario subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * Specifies the subject of the message
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Fire Evacuation", value = "Specifies the subject of the message")

  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    this.subject = subject;
  }


  public Scenario label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * Specifies the label for the message (to view during reporting)
   * @return label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "fire-evacuation", value = "Specifies the label for the message (to view during reporting)")

  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    this.label = label;
  }


  public Scenario email(Email email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Email getEmail() {
    return email;
  }


  public void setEmail(Email email) {
    this.email = email;
  }


  public Scenario voice(Voice voice) {
    
    this.voice = voice;
    return this;
  }

   /**
   * Get voice
   * @return voice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Voice getVoice() {
    return voice;
  }


  public void setVoice(Voice voice) {
    this.voice = voice;
  }


  public Scenario web(Web web) {
    
    this.web = web;
    return this;
  }

   /**
   * Get web
   * @return web
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Web getWeb() {
    return web;
  }


  public void setWeb(Web web) {
    this.web = web;
  }


  public Scenario social(Social social) {
    
    this.social = social;
    return this;
  }

   /**
   * Get social
   * @return social
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("allowedUsers");
    openapiFields.add("allowedUserIds");
    openapiFields.add("message");
    openapiFields.add("to");
    openapiFields.add("subject");
    openapiFields.add("label");
    openapiFields.add("email");
    openapiFields.add("voice");
    openapiFields.add("web");
    openapiFields.add("social");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("message");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Scenario
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Scenario.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Scenario is not found in the empty JSON string", Scenario.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Scenario.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Scenario` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Scenario.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (jsonObj.get("allowedUsers") != null && !jsonObj.get("allowedUsers").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `allowedUsers` to be a primitive type in the JSON string but got `%s`", jsonObj.get("allowedUsers").toString()));
      }
      if (jsonObj.get("allowedUserIds") != null && !jsonObj.get("allowedUserIds").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `allowedUserIds` to be a primitive type in the JSON string but got `%s`", jsonObj.get("allowedUserIds").toString()));
      }
      // validate the optional field `message`
      if (jsonObj.getAsJsonObject("message") != null) {
        Message.validateJsonObject(jsonObj.getAsJsonObject("message"));
      }
      if (jsonObj.get("to") != null && !jsonObj.get("to").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `to` to be a primitive type in the JSON string but got `%s`", jsonObj.get("to").toString()));
      }
      if (jsonObj.get("subject") != null && !jsonObj.get("subject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subject").toString()));
      }
      if (jsonObj.get("label") != null && !jsonObj.get("label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label").toString()));
      }
      // validate the optional field `email`
      if (jsonObj.getAsJsonObject("email") != null) {
        Email.validateJsonObject(jsonObj.getAsJsonObject("email"));
      }
      // validate the optional field `voice`
      if (jsonObj.getAsJsonObject("voice") != null) {
        Voice.validateJsonObject(jsonObj.getAsJsonObject("voice"));
      }
      // validate the optional field `web`
      if (jsonObj.getAsJsonObject("web") != null) {
        Web.validateJsonObject(jsonObj.getAsJsonObject("web"));
      }
      // validate the optional field `social`
      if (jsonObj.getAsJsonObject("social") != null) {
        Social.validateJsonObject(jsonObj.getAsJsonObject("social"));
      }
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
             validateJsonObject(jsonObj);
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

