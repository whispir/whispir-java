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
 * This object contains the responseTemplatePattern array, which contains each of the response rule elements. More details on the configuration of this object can be found below
 */

public class TemplatePattern {
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

  @SerializedName("pattern")
  private String pattern;

  @SerializedName("textPrompt")
  private String textPrompt;

  @SerializedName("voicePrompt")
  private String voicePrompt;

  @SerializedName("spokenVoicePrompt")
  private String spokenVoicePrompt;

  @SerializedName("colour")
  private String colour;

  public TemplatePattern() {
    super();
  }


   /**
   * The name of the response category. The same key is called &#x60;matchedCategory&#x60; when placed inside the &#x60;customParameters&#x60; of Callbacks payload
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
   * Specifies the mechanism for matching the textPrompt  The following options are available: - startsWith - contains - exactmatch  NOTE: none of them is case sensitive, so in the example above replying \&quot;YES\&quot; or \&quot;yes\&quot; or \&quot;Yes\&quot; makes no difference
   * @return pattern
  **/
  @javax.annotation.Nonnull
  public String getPattern() {
    return pattern;
  }
  public void setPattern(String pattern) {
    this.pattern = pattern;
  }

   /**
   * Specifies the textual string that should be matched using the pattern (specified above) within the email, SMS or web response
   * @return textPrompt
  **/
  @javax.annotation.Nonnull
  public String getTextPrompt() {
    return textPrompt;
  }
  public void setTextPrompt(String textPrompt) {
    this.textPrompt = textPrompt;
  }

   /**
   * The character (2–9, * or #) that the recipient of the voice call should enter to select a response option  **IMPORTANT**: please do NOT use the key \&quot;1\&quot; because this is already reserved to repeat the message
   * @return voicePrompt
  **/
  @javax.annotation.Nonnull
  public String getVoicePrompt() {
    return voicePrompt;
  }
  public void setVoicePrompt(String voicePrompt) {
    this.voicePrompt = voicePrompt;
  }

   /**
   * The text-to-speech content that is dynamically read out when describing to the user what a particular response option is
   * @return spokenVoicePrompt
  **/
  @javax.annotation.Nonnull
  public String getSpokenVoicePrompt() {
    return spokenVoicePrompt;
  }
  public void setSpokenVoicePrompt(String spokenVoicePrompt) {
    this.spokenVoicePrompt = spokenVoicePrompt;
  }

   /**
   * The hexadecimal colour code that is used in the Message Response Report to differentiate the groups of responses
   * @return colour
  **/
  @javax.annotation.Nonnull
  public String getColour() {
    return colour;
  }
  public void setColour(String colour) {
    this.colour = colour;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplatePattern templatePattern = (TemplatePattern) o;
    return Objects.equals(this.name, templatePattern.name) &&
        Objects.equals(this.pattern, templatePattern.pattern) &&
        Objects.equals(this.textPrompt, templatePattern.textPrompt) &&
        Objects.equals(this.voicePrompt, templatePattern.voicePrompt) &&
        Objects.equals(this.spokenVoicePrompt, templatePattern.spokenVoicePrompt) &&
        Objects.equals(this.colour, templatePattern.colour);
  }
  @Override
  public int hashCode() {
    return Objects.hash(name, pattern, textPrompt, voicePrompt, spokenVoicePrompt, colour);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplatePattern {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    textPrompt: ").append(toIndentedString(textPrompt)).append("\n");
    sb.append("    voicePrompt: ").append(toIndentedString(voicePrompt)).append("\n");
    sb.append("    spokenVoicePrompt: ").append(toIndentedString(spokenVoicePrompt)).append("\n");
    sb.append("    colour: ").append(toIndentedString(colour)).append("\n");
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
       if (!TemplatePattern.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TemplatePattern' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TemplatePattern> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TemplatePattern.class));

       return (TypeAdapter<T>) new TypeAdapter<TemplatePattern>() {
           @Override
           public void write(JsonWriter out, TemplatePattern value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TemplatePattern read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TemplatePattern given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TemplatePattern
  * @throws IOException if the JSON string is invalid with respect to TemplatePattern
  */
  public static TemplatePattern fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TemplatePattern.class);
  }

 /**
  * Convert an instance of TemplatePattern to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

