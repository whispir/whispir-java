package com.whispir.model;
import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.whispir.model.DeliveryReceipt;
import com.whispir.model.Email;
import com.whispir.model.Features;
import com.whispir.model.Link;
import com.whispir.model.Social;
import com.whispir.model.Voice;
import com.whispir.model.Web;
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
 * The template object.
 */

public class Template {
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
  @SerializedName("messageTemplateName")
  private String messageTemplateName;

  @SerializedName("link")
  private List<Link> link;

  @SerializedName("tags")
  private String tags;

  @SerializedName("id")
  private String id;

  @SerializedName("messageTemplateDescription")
  private String messageTemplateDescription;

  @SerializedName("responseTemplateId")
  private String responseTemplateId;

  @SerializedName("subject")
  private String subject;

  @SerializedName("body")
  private String body;

  @SerializedName("email")
  private Email email;

  @SerializedName("voice")
  private Voice voice;

  @SerializedName("web")
  private Web web;

  @SerializedName("social")
  private Social social;

  @SerializedName("type")
  private String type;

  @SerializedName("features")
  private Features features;

  @SerializedName("dlr")
  private DeliveryReceipt dlr;

  public Template() {
    super();
  }

  public Template(
    String messageTemplateName, 
    List<Link> link, 
    String tags, 
    String id
  ) {
    this();
    this.messageTemplateName = messageTemplateName;
    this.link = link;
    this.tags = tags;
    this.id = id;
  }
   /**
   * Specifies the name of the message template to be used within message requests.
   * @return messageTemplateName
  **/
  @javax.annotation.Nonnull
  public String getMessageTemplateName() {
    return messageTemplateName;
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
   * Information which helps to label related message templates together
   * @return tags
  **/
  @javax.annotation.Nullable
  public String getTags() {
    return tags;
  }
   /**
   * specifies the id of the message template
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

   /**
   * Specifies the description of the message template for others to understand its purpose.
   * @return messageTemplateDescription
  **/
  @javax.annotation.Nullable
  public String getMessageTemplateDescription() {
    return messageTemplateDescription;
  }
  public void setMessageTemplateDescription(String messageTemplateDescription) {
    this.messageTemplateDescription = messageTemplateDescription;
  }

   /**
   * Specifies the ID of the Response Rule that should be associated with this Message Template.
   * @return responseTemplateId
  **/
  @javax.annotation.Nullable
  public String getResponseTemplateId() {
    return responseTemplateId;
  }
  public void setResponseTemplateId(String responseTemplateId) {
    this.responseTemplateId = responseTemplateId;
  }

   /**
   * Specifies the first line of the SMS message or Voice call, and the subject of the Email message.
   * @return subject
  **/
  @javax.annotation.Nonnull
  public String getSubject() {
    return subject;
  }
  public void setSubject(String subject) {
    this.subject = subject;
  }

   /**
   * Specifies the content of the SMS message.
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

   /**
   * Allows the user to modify the message behaviour for replies and DLRs (delivery receipts)
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
   * Get features
   * @return features
  **/
  @javax.annotation.Nullable
  public Features getFeatures() {
    return features;
  }
  public void setFeatures(Features features) {
    this.features = features;
  }

   /**
   * Get dlr
   * @return dlr
  **/
  @javax.annotation.Nullable
  public DeliveryReceipt getDlr() {
    return dlr;
  }
  public void setDlr(DeliveryReceipt dlr) {
    this.dlr = dlr;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Template template = (Template) o;
    return Objects.equals(this.messageTemplateName, template.messageTemplateName) &&
        Objects.equals(this.link, template.link) &&
        Objects.equals(this.tags, template.tags) &&
        Objects.equals(this.id, template.id) &&
        Objects.equals(this.messageTemplateDescription, template.messageTemplateDescription) &&
        Objects.equals(this.responseTemplateId, template.responseTemplateId) &&
        Objects.equals(this.subject, template.subject) &&
        Objects.equals(this.body, template.body) &&
        Objects.equals(this.email, template.email) &&
        Objects.equals(this.voice, template.voice) &&
        Objects.equals(this.web, template.web) &&
        Objects.equals(this.social, template.social) &&
        Objects.equals(this.type, template.type) &&
        Objects.equals(this.features, template.features) &&
        Objects.equals(this.dlr, template.dlr);
  }
  @Override
  public int hashCode() {
    return Objects.hash(messageTemplateName, link, tags, id, messageTemplateDescription, responseTemplateId, subject, body, email, voice, web, social, type, features, dlr);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Template {\n");
    sb.append("    messageTemplateName: ").append(toIndentedString(messageTemplateName)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    messageTemplateDescription: ").append(toIndentedString(messageTemplateDescription)).append("\n");
    sb.append("    responseTemplateId: ").append(toIndentedString(responseTemplateId)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    voice: ").append(toIndentedString(voice)).append("\n");
    sb.append("    web: ").append(toIndentedString(web)).append("\n");
    sb.append("    social: ").append(toIndentedString(social)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    dlr: ").append(toIndentedString(dlr)).append("\n");
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
       if (!Template.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Template' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Template> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Template.class));

       return (TypeAdapter<T>) new TypeAdapter<Template>() {
           @Override
           public void write(JsonWriter out, Template value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Template read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Template given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Template
  * @throws IOException if the JSON string is invalid with respect to Template
  */
  public static Template fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Template.class);
  }

 /**
  * Convert an instance of Template to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

