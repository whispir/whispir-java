package com.whispir.model;
import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.whispir.model.ModelObject;
import com.whispir.model.Object1;
import com.whispir.model.Object2;
import com.whispir.model.Object3;
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
 * The header of your message can include one type of media content e.g. image, video, document and location.
 */

public class WAContentHeader {
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
  @SerializedName("image")
  private ModelObject image;

  @SerializedName("video")
  private Object1 video;

  @SerializedName("document")
  private Object2 document;

  @SerializedName("location")
  private Object3 location;

  public WAContentHeader() {
    super();
  }


   /**
   * Get image
   * @return image
  **/
  @javax.annotation.Nullable
  public ModelObject getImage() {
    return image;
  }
  public void setImage(ModelObject image) {
    this.image = image;
  }

   /**
   * Get video
   * @return video
  **/
  @javax.annotation.Nullable
  public Object1 getVideo() {
    return video;
  }
  public void setVideo(Object1 video) {
    this.video = video;
  }

   /**
   * Get document
   * @return document
  **/
  @javax.annotation.Nullable
  public Object2 getDocument() {
    return document;
  }
  public void setDocument(Object2 document) {
    this.document = document;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  public Object3 getLocation() {
    return location;
  }
  public void setLocation(Object3 location) {
    this.location = location;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WAContentHeader waContentHeader = (WAContentHeader) o;
    return Objects.equals(this.image, waContentHeader.image) &&
        Objects.equals(this.video, waContentHeader.video) &&
        Objects.equals(this.document, waContentHeader.document) &&
        Objects.equals(this.location, waContentHeader.location);
  }
  @Override
  public int hashCode() {
    return Objects.hash(image, video, document, location);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WAContentHeader {\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    video: ").append(toIndentedString(video)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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
       if (!WAContentHeader.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WAContentHeader' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WAContentHeader> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WAContentHeader.class));

       return (TypeAdapter<T>) new TypeAdapter<WAContentHeader>() {
           @Override
           public void write(JsonWriter out, WAContentHeader value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WAContentHeader read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WAContentHeader given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WAContentHeader
  * @throws IOException if the JSON string is invalid with respect to WAContentHeader
  */
  public static WAContentHeader fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WAContentHeader.class);
  }

 /**
  * Convert an instance of WAContentHeader to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

