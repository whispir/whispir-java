package com.whispir.model;
import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.whispir.model.RCSMedia;
import com.whispir.model.RCSRichCard;
import com.whispir.model.RCSSuggestion;
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
 * ### Overview  RCS (Rich Communication Services) is a modern messaging standard designed to upgrade traditional SMS and MMS on mobile phones. It enables richer features such as read receipts, typing indicators, high‑resolution media sharing, group chats, and interactive buttons. RCS messages are sent over the internet (mobile data or Wi‑Fi) but are integrated directly into a device’s default messaging app.   #### RCS Message  The RCS message can have one of the three following elements:  * Text * Media * Rich Card  followed by an optional:  * Suggestions list (for interactive buttons displayed at the bottom of the message)
 */

public class RCS {
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
  @SerializedName("text")
  private String text;

  @SerializedName("media")
  private RCSMedia media;

  @SerializedName("richCard")
  private RCSRichCard richCard;

  @SerializedName("suggestions")
  private List<RCSSuggestion> suggestions;

  public RCS() {
    super();
  }


   /**
   * Text string for simple messages. 
   * @return text
  **/
  @javax.annotation.Nullable
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

   /**
   * Get media
   * @return media
  **/
  @javax.annotation.Nullable
  public RCSMedia getMedia() {
    return media;
  }
  public void setMedia(RCSMedia media) {
    this.media = media;
  }

   /**
   * Get richCard
   * @return richCard
  **/
  @javax.annotation.Nullable
  public RCSRichCard getRichCard() {
    return richCard;
  }
  public void setRichCard(RCSRichCard richCard) {
    this.richCard = richCard;
  }

  public RCS addSuggestionsItem(RCSSuggestion suggestionsItem) {
    if (this.suggestions == null) {
      this.suggestions = new ArrayList<>();
    }
    this.suggestions.add(suggestionsItem);
    return this;
  }

   /**
   * Get suggestions
   * @return suggestions
  **/
  @javax.annotation.Nullable
  public List<RCSSuggestion> getSuggestions() {
    return suggestions;
  }
  public void setSuggestions(List<RCSSuggestion> suggestions) {
    this.suggestions = suggestions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RCS RCS = (RCS) o;
    return Objects.equals(this.text, RCS.text) &&
        Objects.equals(this.media, RCS.media) &&
        Objects.equals(this.richCard, RCS.richCard) &&
        Objects.equals(this.suggestions, RCS.suggestions);
  }
  @Override
  public int hashCode() {
    return Objects.hash(text, media, richCard, suggestions);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RCS {\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    richCard: ").append(toIndentedString(richCard)).append("\n");
    sb.append("    suggestions: ").append(toIndentedString(suggestions)).append("\n");
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
       if (!RCS.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RCS' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RCS> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RCS.class));

       return (TypeAdapter<T>) new TypeAdapter<RCS>() {
           @Override
           public void write(JsonWriter out, RCS value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RCS read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RCS given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RCS
  * @throws IOException if the JSON string is invalid with respect to RCS
  */
  public static RCS fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RCS.class);
  }

 /**
  * Convert an instance of RCS to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

