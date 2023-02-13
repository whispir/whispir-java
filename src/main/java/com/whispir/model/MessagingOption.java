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
 * The object to configure message channel options.
 */

public class MessagingOption {
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

  @SerializedName("enabled")
  private Boolean enabled;

  @SerializedName("primary")
  private String primary;

  @SerializedName("secondary")
  private String secondary;

  @SerializedName("tertiary")
  private String tertiary;

  public MessagingOption() {
    super();
  }


   /**
   * The message channel.
   * @return channel
  **/
  @javax.annotation.Nullable
  public String getChannel() {
    return channel;
  }
  public void setChannel(String channel) {
    this.channel = channel;
  }

   /**
   * A boolean flag indicating whether messaging is enabled for the &#x60;channel&#x60;.
   * @return enabled
  **/
  @javax.annotation.Nullable
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

   /**
   * The primary contact address for the &#x60;channel&#x60;.
   * @return primary
  **/
  @javax.annotation.Nullable
  public String getPrimary() {
    return primary;
  }
  public void setPrimary(String primary) {
    this.primary = primary;
  }

   /**
   * The secondary contact address for the &#x60;channel&#x60;.
   * @return secondary
  **/
  @javax.annotation.Nullable
  public String getSecondary() {
    return secondary;
  }
  public void setSecondary(String secondary) {
    this.secondary = secondary;
  }

   /**
   * The tertiary contact address for the &#x60;channel&#x60;.
   * @return tertiary
  **/
  @javax.annotation.Nullable
  public String getTertiary() {
    return tertiary;
  }
  public void setTertiary(String tertiary) {
    this.tertiary = tertiary;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessagingOption messagingOption = (MessagingOption) o;
    return Objects.equals(this.channel, messagingOption.channel) &&
        Objects.equals(this.enabled, messagingOption.enabled) &&
        Objects.equals(this.primary, messagingOption.primary) &&
        Objects.equals(this.secondary, messagingOption.secondary) &&
        Objects.equals(this.tertiary, messagingOption.tertiary);
  }
  @Override
  public int hashCode() {
    return Objects.hash(channel, enabled, primary, secondary, tertiary);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessagingOption {\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
    sb.append("    secondary: ").append(toIndentedString(secondary)).append("\n");
    sb.append("    tertiary: ").append(toIndentedString(tertiary)).append("\n");
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
       if (!MessagingOption.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MessagingOption' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MessagingOption> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MessagingOption.class));

       return (TypeAdapter<T>) new TypeAdapter<MessagingOption>() {
           @Override
           public void write(JsonWriter out, MessagingOption value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MessagingOption read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MessagingOption given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MessagingOption
  * @throws IOException if the JSON string is invalid with respect to MessagingOption
  */
  public static MessagingOption fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MessagingOption.class);
  }

 /**
  * Convert an instance of MessagingOption to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

