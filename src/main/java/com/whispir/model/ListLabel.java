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
 * Contains the individual items that make up this list  The ‘name’ is the text that is shown to the user The ‘value’ is the internally passed in value
 */

public class ListLabel {
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

  @SerializedName("value")
  private String value;

  public ListLabel() {
    super();
  }

  public ListLabel(
    String name, 
    String value
  ) {
    this();
    this.name = name;
    this.value = value;
  }
   /**
   * Specifies the text that is show to the user
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }
   /**
   * Specifies the value that is passed internally
   * @return value
  **/
  @javax.annotation.Nullable
  public String getValue() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListLabel listLabel = (ListLabel) o;
    return Objects.equals(this.name, listLabel.name) &&
        Objects.equals(this.value, listLabel.value);
  }
  @Override
  public int hashCode() {
    return Objects.hash(name, value);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListLabel {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
       if (!ListLabel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListLabel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListLabel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListLabel.class));

       return (TypeAdapter<T>) new TypeAdapter<ListLabel>() {
           @Override
           public void write(JsonWriter out, ListLabel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListLabel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListLabel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListLabel
  * @throws IOException if the JSON string is invalid with respect to ListLabel
  */
  public static ListLabel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListLabel.class);
  }

 /**
  * Convert an instance of ListLabel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

