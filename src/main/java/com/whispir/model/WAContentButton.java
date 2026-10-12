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
 * The contents of your dynamic button.  If the button subtype is “url” you will need the following parameters: “Index”, “sub_type”, “text”  If the button subtype is a “quick_reply”, you will need the following parameters: “Index”, “sub_type”, “payload
 */

public class WAContentButton {
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
  @SerializedName("index")
  private String index;

  @SerializedName("sub_type")
  private String subType;

  @SerializedName("text")
  private String text;

  @SerializedName("payload")
  private String payload;

  public WAContentButton() {
    super();
  }


   /**
   * The index value of the button this object represents
   * @return index
  **/
  @javax.annotation.Nonnull
  public String getIndex() {
    return index;
  }
  public void setIndex(String index) {
    this.index = index;
  }

   /**
   * The type of dynamic button i.e. \&quot;quick_reply\&quot; or \&quot;url\&quot;
   * @return subType
  **/
  @javax.annotation.Nonnull
  public String getSubType() {
    return subType;
  }
  public void setSubType(String subType) {
    this.subType = subType;
  }

   /**
   * the url destination when the button is clicked &gt; required when &#x60;sub_type&#x60; value is &#x60;url&#x60;
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
   * Name of the quick reply buttons configured within your WhatsApp Business Manager account. &gt; required when &#x60;sub_type&#x60; value is &#x60;quick_reply&#x60;
   * @return payload
  **/
  @javax.annotation.Nullable
  public String getPayload() {
    return payload;
  }
  public void setPayload(String payload) {
    this.payload = payload;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WAContentButton waContentButton = (WAContentButton) o;
    return Objects.equals(this.index, waContentButton.index) &&
        Objects.equals(this.subType, waContentButton.subType) &&
        Objects.equals(this.text, waContentButton.text) &&
        Objects.equals(this.payload, waContentButton.payload);
  }
  @Override
  public int hashCode() {
    return Objects.hash(index, subType, text, payload);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WAContentButton {\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    subType: ").append(toIndentedString(subType)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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
       if (!WAContentButton.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WAContentButton' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WAContentButton> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WAContentButton.class));

       return (TypeAdapter<T>) new TypeAdapter<WAContentButton>() {
           @Override
           public void write(JsonWriter out, WAContentButton value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WAContentButton read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WAContentButton given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WAContentButton
  * @throws IOException if the JSON string is invalid with respect to WAContentButton
  */
  public static WAContentButton fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WAContentButton.class);
  }

 /**
  * Convert an instance of WAContentButton to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

