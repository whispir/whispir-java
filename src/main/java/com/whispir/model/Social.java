package com.whispir.model;
import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.whispir.model.Channel;
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
 * Whispir can publish content to your Twitter and Facebook walls. Other socials can be made available upon request.
 */

public class Social {
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
  @SerializedName("social")
  private List<Channel> social;

  public Social() {
    super();
  }


  public Social addSocialItem(Channel socialItem) {
    if (this.social == null) {
      this.social = new ArrayList<>();
    }
    this.social.add(socialItem);
    return this;
  }

   /**
   * The list of social channel content.
   * @return social
  **/
  @javax.annotation.Nullable
  public List<Channel> getSocial() {
    return social;
  }
  public void setSocial(List<Channel> social) {
    this.social = social;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Social social = (Social) o;
    return Objects.equals(this.social, social.social);
  }
  @Override
  public int hashCode() {
    return Objects.hash(social);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Social {\n");
    sb.append("    social: ").append(toIndentedString(social)).append("\n");
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
       if (!Social.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Social' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Social> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Social.class));

       return (TypeAdapter<T>) new TypeAdapter<Social>() {
           @Override
           public void write(JsonWriter out, Social value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Social read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Social given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Social
  * @throws IOException if the JSON string is invalid with respect to Social
  */
  public static Social fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Social.class);
  }

 /**
  * Convert an instance of Social to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

