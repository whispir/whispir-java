package com.whispir.model;
import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.whispir.model.RCSSuggestionDialAction;
import com.whispir.model.RCSSuggestionUrlAction;
import com.whispir.model.RCSSuggestionViewLocationAction;
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
 * A suggestion is an interactive button displayed on the recipient&#39;s message.   If the suggestion consists of only the *text* and *postbackData* fields, it is referred to as a \&quot;normal action\&quot; and when the user clicks that button it results in the postback data being sent back to you.   A suggestion can also be any one of urlAction, dialAction, shareLocationAction and viewLocationAction - depending on which one is included in the payload.  If the user clicks on one of these buttons, they will also return the provided postback data but also have special behaviours described in the schema.  Note that only *one* of the special actions can be included in a single suggestion. 
 */

public class RCSSuggestion {
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

  @SerializedName("postbackData")
  private String postbackData;

  @SerializedName("urlAction")
  private RCSSuggestionUrlAction urlAction;

  @SerializedName("dialAction")
  private RCSSuggestionDialAction dialAction;

  @SerializedName("shareLocationAction")
  private Object shareLocationAction;

  @SerializedName("viewLocationAction")
  private RCSSuggestionViewLocationAction viewLocationAction;

  public RCSSuggestion() {
    super();
  }


   /**
   * Get text
   * @return text
  **/
  @javax.annotation.Nonnull
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

   /**
   * Get postbackData
   * @return postbackData
  **/
  @javax.annotation.Nonnull
  public String getPostbackData() {
    return postbackData;
  }
  public void setPostbackData(String postbackData) {
    this.postbackData = postbackData;
  }

   /**
   * Get urlAction
   * @return urlAction
  **/
  @javax.annotation.Nullable
  public RCSSuggestionUrlAction getUrlAction() {
    return urlAction;
  }
  public void setUrlAction(RCSSuggestionUrlAction urlAction) {
    this.urlAction = urlAction;
  }

   /**
   * Get dialAction
   * @return dialAction
  **/
  @javax.annotation.Nullable
  public RCSSuggestionDialAction getDialAction() {
    return dialAction;
  }
  public void setDialAction(RCSSuggestionDialAction dialAction) {
    this.dialAction = dialAction;
  }

   /**
   * Allows the recipient to share their location  back to Soprano.  The Share Location suggestion/action does  not have any fields, the presence of the  object itself triggers the action on the phone. 
   * @return shareLocationAction
  **/
  @javax.annotation.Nullable
  public Object getShareLocationAction() {
    return shareLocationAction;
  }
  public void setShareLocationAction(Object shareLocationAction) {
    this.shareLocationAction = shareLocationAction;
  }

   /**
   * Get viewLocationAction
   * @return viewLocationAction
  **/
  @javax.annotation.Nullable
  public RCSSuggestionViewLocationAction getViewLocationAction() {
    return viewLocationAction;
  }
  public void setViewLocationAction(RCSSuggestionViewLocationAction viewLocationAction) {
    this.viewLocationAction = viewLocationAction;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RCSSuggestion rcSSuggestion = (RCSSuggestion) o;
    return Objects.equals(this.text, rcSSuggestion.text) &&
        Objects.equals(this.postbackData, rcSSuggestion.postbackData) &&
        Objects.equals(this.urlAction, rcSSuggestion.urlAction) &&
        Objects.equals(this.dialAction, rcSSuggestion.dialAction) &&
        Objects.equals(this.shareLocationAction, rcSSuggestion.shareLocationAction) &&
        Objects.equals(this.viewLocationAction, rcSSuggestion.viewLocationAction);
  }
  @Override
  public int hashCode() {
    return Objects.hash(text, postbackData, urlAction, dialAction, shareLocationAction, viewLocationAction);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RCSSuggestion {\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    postbackData: ").append(toIndentedString(postbackData)).append("\n");
    sb.append("    urlAction: ").append(toIndentedString(urlAction)).append("\n");
    sb.append("    dialAction: ").append(toIndentedString(dialAction)).append("\n");
    sb.append("    shareLocationAction: ").append(toIndentedString(shareLocationAction)).append("\n");
    sb.append("    viewLocationAction: ").append(toIndentedString(viewLocationAction)).append("\n");
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
       if (!RCSSuggestion.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RCSSuggestion' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RCSSuggestion> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RCSSuggestion.class));

       return (TypeAdapter<T>) new TypeAdapter<RCSSuggestion>() {
           @Override
           public void write(JsonWriter out, RCSSuggestion value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RCSSuggestion read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RCSSuggestion given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RCSSuggestion
  * @throws IOException if the JSON string is invalid with respect to RCSSuggestion
  */
  public static RCSSuggestion fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RCSSuggestion.class);
  }

 /**
  * Convert an instance of RCSSuggestion to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

