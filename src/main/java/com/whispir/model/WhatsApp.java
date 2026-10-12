package com.whispir.model;
import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.whispir.model.WAContent;
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
 * ### Overview  Customers can send templated WhatsApp messages via Whispir&#39;s API.   Templates must first be submitted for approval by WhatsApp in your WhatsApp Business Manager account before any template messages can be sent from Whispir.   Please reach out to your Whispir account manager to help you get started.   #### WhatsApp Messages via Rich Message Templates (v2) Note that from **October 2025** WhatsApp messages can also be configured in Whispir Rich Message Templates. These templates can then be used to send WhatsApp messages via the Whispir API.    Please contact your Whispir account manager to see how you can have this feature enabled.   ##### Examples Sending via Rich Message Templates is shown in the following examples: * _WhatsApp Message via WhatsApp Enabled Rich Message Template_ * _WhatsApp Bulk Message via Rich Message Template_ * _WhatsApp Message via Rich Message Template with Field Overrides_  Customers who have this feature enabled will also have access to using the new _parameters_ object, shown in the following examples: * _WhatsApp Message with Throttling, Alias, Web Link and Body Positional Parameters_ * _WhatsApp Bulk Message with Web Link and Body Positional Parameters_  **Overriding fields from Rich Message Templates (RMT)**  Customers have the ability to configure the body positional parameters, alias etc. as part of a Rich Message Template (RMT).     By default, when sending via our API with a given RMT, all values will be collected from the provided RMT. (See _WhatsApp Message via WhatsApp Enabled Rich Message Template_ example)  However, the platform allows you to include both the Rich Message Template reference **and** a WhatsApp object in the API payload.   Please note that in this case the platform will give priority to the message configuration in the **WhatsApp object** over the Rich Message Template. (see _WhatsApp Message via Rich Message Template with Field Overrides_ example).  For clarity and simplicity,  it is recommended to choose to send your WhatsApp message via one of: * a WhatsApp enabled Rich Message Template previously defined in our portal  * or providing a WhatsApp object in the payload with all the required details  **v2 compatibility**  Please note that our WhatsApp v2 version only supports the use of positional body parameters (via the new _parameters_ object). The _content_ object is not supported.   
 */

public class WhatsApp {
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
  @SerializedName("type")
  private String type;

  @SerializedName("name")
  private String name;

  @SerializedName("language")
  private String language;

  @SerializedName("parameters")
  private List<String> parameters;

  @SerializedName("content")
  private WAContent content;

  public WhatsApp() {
    super();
  }


   /**
   * The type of WhatsApp message to be sent, e.g. \&quot;template\&quot;.  Whispir currently only supports type \&quot;template\&quot;. 
   * @return type
  **/
  @javax.annotation.Nonnull
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

   /**
   * The name of the template to be sent  &gt; Must be the same as how it appears in your WhatsApp Business Manager 
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

   /**
   * The language to use for your WhatsApp Template e.g. \&quot;en\&quot;, \&quot;en_AU\&quot;, \&quot;en_SG\&quot; etc. &gt; Must be the same as how it appears in your WhatsApp Business Manager  &gt; Supported in v2 **only**
   * @return language
  **/
  @javax.annotation.Nullable
  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }

  public WhatsApp addParametersItem(String parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * Array of positional parameters that are used to personalise the body of the WhatsApp message.   For example,  \&quot;Hello {{1}}!\&quot;  would become  \&quot;Hello John!\&quot;  if \&quot;John\&quot; is the first positional parameter  &gt; Supported in v2 **only**
   * @return parameters
  **/
  @javax.annotation.Nullable
  public List<String> getParameters() {
    return parameters;
  }
  public void setParameters(List<String> parameters) {
    this.parameters = parameters;
  }

   /**
   * Get content
   * @return content
  **/
  @javax.annotation.Nullable
  public WAContent getContent() {
    return content;
  }
  public void setContent(WAContent content) {
    this.content = content;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WhatsApp whatsApp = (WhatsApp) o;
    return Objects.equals(this.type, whatsApp.type) &&
        Objects.equals(this.name, whatsApp.name) &&
        Objects.equals(this.language, whatsApp.language) &&
        Objects.equals(this.parameters, whatsApp.parameters) &&
        Objects.equals(this.content, whatsApp.content);
  }
  @Override
  public int hashCode() {
    return Objects.hash(type, name, language, parameters, content);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsApp {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
       if (!WhatsApp.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WhatsApp' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WhatsApp> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WhatsApp.class));

       return (TypeAdapter<T>) new TypeAdapter<WhatsApp>() {
           @Override
           public void write(JsonWriter out, WhatsApp value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WhatsApp read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WhatsApp given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WhatsApp
  * @throws IOException if the JSON string is invalid with respect to WhatsApp
  */
  public static WhatsApp fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WhatsApp.class);
  }

 /**
  * Convert an instance of WhatsApp to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

