package com.whispir.model;
import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.whispir.model.WAContentButton;
import com.whispir.model.WAContentHeader;
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
 * The content of your message which may contain any text and media that will be sent to the recipient. The contents can include a header, a body, and buttons.
 */

public class WAContent {
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
  @SerializedName("header")
  private WAContentHeader header;

  @SerializedName("body")
  private List<Object> body;

  @SerializedName("button")
  private List<WAContentButton> button;

  public WAContent() {
    super();
  }


   /**
   * Get header
   * @return header
  **/
  @javax.annotation.Nullable
  public WAContentHeader getHeader() {
    return header;
  }
  public void setHeader(WAContentHeader header) {
    this.header = header;
  }

  public WAContent addBodyItem(Object bodyItem) {
    this.body.add(bodyItem);
    return this;
  }

   /**
   * The contents of your WhatsApp message
   * @return body
  **/
  @javax.annotation.Nonnull
  public List<Object> getBody() {
    return body;
  }
  public void setBody(List<Object> body) {
    this.body = body;
  }

  public WAContent addButtonItem(WAContentButton buttonItem) {
    if (this.button == null) {
      this.button = new ArrayList<>();
    }
    this.button.add(buttonItem);
    return this;
  }

   /**
   * The contents of your dynamic button.  If the button subtype is “url” you will need the following parameters: “Index”, “sub_type”, “text”  If the button subtype is a “quick_reply”, you will need the following parameters: “Index”, “sub_type”, “payload\&quot;
   * @return button
  **/
  @javax.annotation.Nullable
  public List<WAContentButton> getButton() {
    return button;
  }
  public void setButton(List<WAContentButton> button) {
    this.button = button;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WAContent waContent = (WAContent) o;
    return Objects.equals(this.header, waContent.header) &&
        Objects.equals(this.body, waContent.body) &&
        Objects.equals(this.button, waContent.button);
  }
  @Override
  public int hashCode() {
    return Objects.hash(header, body, button);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WAContent {\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    button: ").append(toIndentedString(button)).append("\n");
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
       if (!WAContent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WAContent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WAContent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WAContent.class));

       return (TypeAdapter<T>) new TypeAdapter<WAContent>() {
           @Override
           public void write(JsonWriter out, WAContent value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WAContent read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WAContent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WAContent
  * @throws IOException if the JSON string is invalid with respect to WAContent
  */
  public static WAContent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WAContent.class);
  }

 /**
  * Convert an instance of WAContent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

