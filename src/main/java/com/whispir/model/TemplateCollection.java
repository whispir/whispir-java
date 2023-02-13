package com.whispir.model;
import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.whispir.model.Link;
import com.whispir.model.Template;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
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
 * Returns a list of templates
 */

public class TemplateCollection {
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
  @SerializedName("status")
  private String status;

  @SerializedName("messagetemplates")
  private Set<Template> messagetemplates;

  @SerializedName("link")
  private List<Link> link;

  public TemplateCollection() {
    super();
  }

  public TemplateCollection(
    String status, 
    Set<Template> messagetemplates, 
    List<Link> link
  ) {
    this();
    this.status = status;
    this.messagetemplates = messagetemplates;
    this.link = link;
  }
   /**
   * Provides the total number of records fetched. This attribute may return \&quot;No records found\&quot; when there are no message templates available.
   * @return status
  **/
  @javax.annotation.Nonnull
  public String getStatus() {
    return status;
  }
   /**
   * Specifies the name of the message template
   * @return messagetemplates
  **/
  @javax.annotation.Nonnull
  public Set<Template> getMessagetemplates() {
    return messagetemplates;
  }
   /**
   * A [HATEOAS](https://en.wikipedia.org/wiki/HATEOAS) link array, describing all discoverable resources in relation to the original request.
   * @return link
  **/
  @javax.annotation.Nullable
  public List<Link> getLink() {
    return link;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateCollection templateCollection = (TemplateCollection) o;
    return Objects.equals(this.status, templateCollection.status) &&
        Objects.equals(this.messagetemplates, templateCollection.messagetemplates) &&
        Objects.equals(this.link, templateCollection.link);
  }
  @Override
  public int hashCode() {
    return Objects.hash(status, messagetemplates, link);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateCollection {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    messagetemplates: ").append(toIndentedString(messagetemplates)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
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
       if (!TemplateCollection.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TemplateCollection' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TemplateCollection> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TemplateCollection.class));

       return (TypeAdapter<T>) new TypeAdapter<TemplateCollection>() {
           @Override
           public void write(JsonWriter out, TemplateCollection value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TemplateCollection read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TemplateCollection given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TemplateCollection
  * @throws IOException if the JSON string is invalid with respect to TemplateCollection
  */
  public static TemplateCollection fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TemplateCollection.class);
  }

 /**
  * Convert an instance of TemplateCollection to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

