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
 * The fallback feature allows the sender to configure a  fallback channel in case the original channel fails to deliver the message.  Note that currently this feature is *only*  supported for RCS message and the only allowed fallback channel is SMS.
 */

public class FeaturesFallback {
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
  @SerializedName("channel")
  private String channel;

  @SerializedName("templateName")
  private String templateName;

  public FeaturesFallback() {
    super();
  }


   /**
   * Get channel
   * @return channel
  **/
  @javax.annotation.Nonnull
  public String getChannel() {
    return channel;
  }
  public void setChannel(String channel) {
    this.channel = channel;
  }

   /**
   * The name of the Rich Message Template to use when  delivering the message via the fallback  channel.
   * @return templateName
  **/
  @javax.annotation.Nonnull
  public String getTemplateName() {
    return templateName;
  }
  public void setTemplateName(String templateName) {
    this.templateName = templateName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeaturesFallback featuresFallback = (FeaturesFallback) o;
    return Objects.equals(this.channel, featuresFallback.channel) &&
        Objects.equals(this.templateName, featuresFallback.templateName);
  }
  @Override
  public int hashCode() {
    return Objects.hash(channel, templateName);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeaturesFallback {\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
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
       if (!FeaturesFallback.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FeaturesFallback' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FeaturesFallback> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FeaturesFallback.class));

       return (TypeAdapter<T>) new TypeAdapter<FeaturesFallback>() {
           @Override
           public void write(JsonWriter out, FeaturesFallback value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FeaturesFallback read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FeaturesFallback given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FeaturesFallback
  * @throws IOException if the JSON string is invalid with respect to FeaturesFallback
  */
  public static FeaturesFallback fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FeaturesFallback.class);
  }

 /**
  * Convert an instance of FeaturesFallback to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

