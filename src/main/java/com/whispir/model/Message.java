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
import com.whispir.model.Resource;
import com.whispir.model.Social;
import com.whispir.model.Voice;
import com.whispir.model.Web;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
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
 * Whispir has a maximum API request payload size of 10MB. Whispir will reject the request if the payload is any bigger. This payload size limit should be adhered to when creatin the message payload. 
 */

public class Message {
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
  @SerializedName("from")
  private String from;

  @SerializedName("direction")
  private String direction;

  @SerializedName("responseCount")
  private String responseCount;

  @SerializedName("createdTime")
  private BigDecimal createdTime;

  @SerializedName("whatsappValidMessage")
  private Boolean whatsappValidMessage;

  @SerializedName("validBody")
  private Boolean validBody;

  @SerializedName("validSubject")
  private Boolean validSubject;

  @SerializedName("link")
  private List<Link> link;

  @SerializedName("to")
  private String to;

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

  @SerializedName("resource")
  private Resource resource;

  @SerializedName("messageTemplateId")
  private String messageTemplateId;

  @SerializedName("messageTemplateName")
  private String messageTemplateName;

  @SerializedName("callbackId")
  private String callbackId;

  @SerializedName("callbackParameters")
  private Object callbackParameters;

  @SerializedName("label")
  private String label;

  @SerializedName("eventId")
  private String eventId;

  @SerializedName("messageType")
  private String messageType;

  @SerializedName("scheduleType")
  private String scheduleType;

  @SerializedName("scheduleDate")
  private String scheduleDate;

  @SerializedName("repetitionCount")
  private BigDecimal repetitionCount;

  @SerializedName("repeatDays")
  private BigDecimal repeatDays;

  @SerializedName("repeatHrs")
  private BigDecimal repeatHrs;

  @SerializedName("repeatMin")
  private BigDecimal repeatMin;

  @SerializedName("dlr")
  private DeliveryReceipt dlr;

  public Message() {
    super();
  }

  public Message(
    String from, 
    String direction, 
    String responseCount, 
    BigDecimal createdTime, 
    Boolean whatsappValidMessage, 
    Boolean validBody, 
    Boolean validSubject, 
    List<Link> link
  ) {
    this();
    this.from = from;
    this.direction = direction;
    this.responseCount = responseCount;
    this.createdTime = createdTime;
    this.whatsappValidMessage = whatsappValidMessage;
    this.validBody = validBody;
    this.validSubject = validSubject;
    this.link = link;
  }
   /**
   * The message sender&#39;s Whispir User MRI.
   * @return from
  **/
  @javax.annotation.Nullable
  public String getFrom() {
    return from;
  }
   /**
   * The direction of the sent message.
   * @return direction
  **/
  @javax.annotation.Nullable
  public String getDirection() {
    return direction;
  }
   /**
   * Details the responses received for the sent message across all channels. Refer to &#x60;/messageresponses&#x60; to get the detailed response data.
   * @return responseCount
  **/
  @javax.annotation.Nullable
  public String getResponseCount() {
    return responseCount;
  }
   /**
   * Epoch time (refers to Unix TimeStamp format starting Jan 1, 1970) denoting the time the message was sent. For bulk messages and messages with multiple recipients this value is tied to the timestamp when the message was received and processed by Whispir.
   * @return createdTime
  **/
  @javax.annotation.Nullable
  public BigDecimal getCreatedTime() {
    return createdTime;
  }
   /**
   * The validity of the WhatsApp channel message.
   * @return whatsappValidMessage
  **/
  @javax.annotation.Nullable
  public Boolean getWhatsappValidMessage() {
    return whatsappValidMessage;
  }
   /**
   * The validity of the message body.
   * @return validBody
  **/
  @javax.annotation.Nullable
  public Boolean getValidBody() {
    return validBody;
  }
   /**
   * The validity of the message subject.
   * @return validSubject
  **/
  @javax.annotation.Nullable
  public Boolean getValidSubject() {
    return validSubject;
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
   * Allows a combination of phone numbers, email address, Whispir Contact MRIs, User MRI, Distribution List MRI, separated by &#x60;,&#x60;.  Whispir will pick the relevant recipients based on the channels provided in the request payload  (including template information).  The maximum payload size rule applies.  When used for bulk messages, this field is optional, as bulk messages has another model to specify the &#x60;to&#x60; field recipients. 
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
   * The message subject. This is common for both SMS and Email channels.  Read &#x60;body&#x60; notes on limits.  The maximum payload size rule applies.  When used for templates, this field is optional.
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
   * The SMS body.  The maximum payload size rule applies.  IMPORTANT: The total SMS length is 1570 characters for english text and 800 when UTF-8 characters are used (primarily non-english)  The 1570 length is a combination of subject and body.
   * @return body
  **/
  @javax.annotation.Nullable
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
   * Allows the user to modify the message behaviour for replies and DLRs (delivery receipts).  - &#x60;defaultNoReply&#x60;: Used to reject any replies to this message. - &#x60;noDlr&#x60;: Used to specify that DLRs should not be enabled for this message.
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
   * Get resource
   * @return resource
  **/
  @javax.annotation.Nullable
  public Resource getResource() {
    return resource;
  }
  public void setResource(Resource resource) {
    this.resource = resource;
  }

   /**
   * The identifier for the Message Template. Specification of this attribute is preferred over the &#x60;messageTemplateName&#x60;, to provide an absolute and non-changing reference to the Message Template.
   * @return messageTemplateId
  **/
  @javax.annotation.Nullable
  public String getMessageTemplateId() {
    return messageTemplateId;
  }
  public void setMessageTemplateId(String messageTemplateId) {
    this.messageTemplateId = messageTemplateId;
  }

   /**
   * A human-readable name for the Message Template.
   * @return messageTemplateName
  **/
  @javax.annotation.Nullable
  public String getMessageTemplateName() {
    return messageTemplateName;
  }
  public void setMessageTemplateName(String messageTemplateName) {
    this.messageTemplateName = messageTemplateName;
  }

   /**
   * The identifier for the Callback to be invoked on Message delivery events.
   * @return callbackId
  **/
  @javax.annotation.Nullable
  public String getCallbackId() {
    return callbackId;
  }
  public void setCallbackId(String callbackId) {
    this.callbackId = callbackId;
  }

   /**
   * Set of key-value pairs that you can attach to a callback. This can be useful for returning additional information about the object in a structured format.
   * @return callbackParameters
  **/
  @javax.annotation.Nullable
  public Object getCallbackParameters() {
    return callbackParameters;
  }
  public void setCallbackParameters(Object callbackParameters) {
    this.callbackParameters = callbackParameters;
  }

   /**
   * A label to tag the message, useful for grouped viewing and filtering in the UI and via API &#x60;GET /messages?label&#x3D;example&#x60;.  **IMPORTANT**: When this label is used, Whispir Reporting ignores the “Category” labels tied to the messages. Please ensure you are using this as per your business needs and such usage does not affect the reports generated via the \&quot;Category\&quot; grouping.
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
   * The identifier for the Event to trigger.
   * @return eventId
  **/
  @javax.annotation.Nullable
  public String getEventId() {
    return eventId;
  }
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

   /**
   * The type of message, used to enable message scheduling.
   * @return messageType
  **/
  @javax.annotation.Nullable
  public String getMessageType() {
    return messageType;
  }
  public void setMessageType(String messageType) {
    this.messageType = messageType;
  }

   /**
   * The schedule type, used to enable single or repeated message scheduling.
   * @return scheduleType
  **/
  @javax.annotation.Nullable
  public String getScheduleType() {
    return scheduleType;
  }
  public void setScheduleType(String scheduleType) {
    this.scheduleType = scheduleType;
  }

   /**
   * For &#x60;ONCE&#x60; scheduled messages, specifies the date to trigger the single delivery. For &#x60;REPEATED&#x60; scheduled messages, the time at which the first of them will be sent.
   * @return scheduleDate
  **/
  @javax.annotation.Nullable
  public String getScheduleDate() {
    return scheduleDate;
  }
  public void setScheduleDate(String scheduleDate) {
    this.scheduleDate = scheduleDate;
  }

   /**
   * Specifies how many times the scheduled message will be sent to the recipient.
   * @return repetitionCount
  **/
  @javax.annotation.Nullable
  public BigDecimal getRepetitionCount() {
    return repetitionCount;
  }
  public void setRepetitionCount(BigDecimal repetitionCount) {
    this.repetitionCount = repetitionCount;
  }

   /**
   * The interval in days between each scheduled message repetition.
   * @return repeatDays
  **/
  @javax.annotation.Nullable
  public BigDecimal getRepeatDays() {
    return repeatDays;
  }
  public void setRepeatDays(BigDecimal repeatDays) {
    this.repeatDays = repeatDays;
  }

   /**
   * The interval in hours between each scheduled message repetition.
   * @return repeatHrs
  **/
  @javax.annotation.Nullable
  public BigDecimal getRepeatHrs() {
    return repeatHrs;
  }
  public void setRepeatHrs(BigDecimal repeatHrs) {
    this.repeatHrs = repeatHrs;
  }

   /**
   * The interval in minutes between each scheduled message repetition.
   * @return repeatMin
  **/
  @javax.annotation.Nullable
  public BigDecimal getRepeatMin() {
    return repeatMin;
  }
  public void setRepeatMin(BigDecimal repeatMin) {
    this.repeatMin = repeatMin;
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
    Message message = (Message) o;
    return Objects.equals(this.from, message.from) &&
        Objects.equals(this.direction, message.direction) &&
        Objects.equals(this.responseCount, message.responseCount) &&
        Objects.equals(this.createdTime, message.createdTime) &&
        Objects.equals(this.whatsappValidMessage, message.whatsappValidMessage) &&
        Objects.equals(this.validBody, message.validBody) &&
        Objects.equals(this.validSubject, message.validSubject) &&
        Objects.equals(this.link, message.link) &&
        Objects.equals(this.to, message.to) &&
        Objects.equals(this.subject, message.subject) &&
        Objects.equals(this.body, message.body) &&
        Objects.equals(this.email, message.email) &&
        Objects.equals(this.voice, message.voice) &&
        Objects.equals(this.web, message.web) &&
        Objects.equals(this.social, message.social) &&
        Objects.equals(this.type, message.type) &&
        Objects.equals(this.features, message.features) &&
        Objects.equals(this.resource, message.resource) &&
        Objects.equals(this.messageTemplateId, message.messageTemplateId) &&
        Objects.equals(this.messageTemplateName, message.messageTemplateName) &&
        Objects.equals(this.callbackId, message.callbackId) &&
        Objects.equals(this.callbackParameters, message.callbackParameters) &&
        Objects.equals(this.label, message.label) &&
        Objects.equals(this.eventId, message.eventId) &&
        Objects.equals(this.messageType, message.messageType) &&
        Objects.equals(this.scheduleType, message.scheduleType) &&
        Objects.equals(this.scheduleDate, message.scheduleDate) &&
        Objects.equals(this.repetitionCount, message.repetitionCount) &&
        Objects.equals(this.repeatDays, message.repeatDays) &&
        Objects.equals(this.repeatHrs, message.repeatHrs) &&
        Objects.equals(this.repeatMin, message.repeatMin) &&
        Objects.equals(this.dlr, message.dlr);
  }
  @Override
  public int hashCode() {
    return Objects.hash(from, direction, responseCount, createdTime, whatsappValidMessage, validBody, validSubject, link, to, subject, body, email, voice, web, social, type, features, resource, messageTemplateId, messageTemplateName, callbackId, callbackParameters, label, eventId, messageType, scheduleType, scheduleDate, repetitionCount, repeatDays, repeatHrs, repeatMin, dlr);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Message {\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    responseCount: ").append(toIndentedString(responseCount)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    whatsappValidMessage: ").append(toIndentedString(whatsappValidMessage)).append("\n");
    sb.append("    validBody: ").append(toIndentedString(validBody)).append("\n");
    sb.append("    validSubject: ").append(toIndentedString(validSubject)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    voice: ").append(toIndentedString(voice)).append("\n");
    sb.append("    web: ").append(toIndentedString(web)).append("\n");
    sb.append("    social: ").append(toIndentedString(social)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    messageTemplateId: ").append(toIndentedString(messageTemplateId)).append("\n");
    sb.append("    messageTemplateName: ").append(toIndentedString(messageTemplateName)).append("\n");
    sb.append("    callbackId: ").append(toIndentedString(callbackId)).append("\n");
    sb.append("    callbackParameters: ").append(toIndentedString(callbackParameters)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
    sb.append("    scheduleType: ").append(toIndentedString(scheduleType)).append("\n");
    sb.append("    scheduleDate: ").append(toIndentedString(scheduleDate)).append("\n");
    sb.append("    repetitionCount: ").append(toIndentedString(repetitionCount)).append("\n");
    sb.append("    repeatDays: ").append(toIndentedString(repeatDays)).append("\n");
    sb.append("    repeatHrs: ").append(toIndentedString(repeatHrs)).append("\n");
    sb.append("    repeatMin: ").append(toIndentedString(repeatMin)).append("\n");
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
       if (!Message.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Message' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Message> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Message.class));

       return (TypeAdapter<T>) new TypeAdapter<Message>() {
           @Override
           public void write(JsonWriter out, Message value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Message read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Message given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Message
  * @throws IOException if the JSON string is invalid with respect to Message
  */
  public static Message fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Message.class);
  }

 /**
  * Convert an instance of Message to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

