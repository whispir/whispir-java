package com.whispir.model;
import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.whispir.model.RCSMedia;
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
 * Describes all the attributes needed to display a single RCS Card.
 */

public class RCSCard {
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
  @SerializedName("title")
  private String title;

  @SerializedName("description")
  private String description;

  @SerializedName("media")
  private RCSMedia media;

  @SerializedName("suggestions")
  private List<RCSSuggestion> suggestions;

  public RCSCard() {
    super();
  }


   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

   /**
   * Get description
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

  public RCSCard addSuggestionsItem(RCSSuggestion suggestionsItem) {
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
    RCSCard rcSCard = (RCSCard) o;
    return Objects.equals(this.title, rcSCard.title) &&
        Objects.equals(this.description, rcSCard.description) &&
        Objects.equals(this.media, rcSCard.media) &&
        Objects.equals(this.suggestions, rcSCard.suggestions);
  }
  @Override
  public int hashCode() {
    return Objects.hash(title, description, media, suggestions);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RCSCard {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
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
       if (!RCSCard.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RCSCard' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RCSCard> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RCSCard.class));

       return (TypeAdapter<T>) new TypeAdapter<RCSCard>() {
           @Override
           public void write(JsonWriter out, RCSCard value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RCSCard read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RCSCard given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RCSCard
  * @throws IOException if the JSON string is invalid with respect to RCSCard
  */
  public static RCSCard fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RCSCard.class);
  }

 /**
  * Convert an instance of RCSCard to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

