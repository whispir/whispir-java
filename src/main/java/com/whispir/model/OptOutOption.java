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
 * The opt-out option payload is optional in line with the Email Distribution List standardization making it a requirement for recipients to opt out of email lists easily, which will add up to a sender&#39;s reputation and deliverability.  The &#x60;rmsUnsubscribeUrl&#x60; is a URL link to the web channel unsubscribe content for &#x60;GET&#x60; requests, and for one-click unsubscribe functionality via &#x60;POST&#x60; requests. This is in line with the [RFC-2369](https://www.ietf.org/rfc/rfc2369.txt) (*The Use of URLs as Meta-Syntax for Core Mail List Commands and their Transport through Message Header Fields*). This will append the &#x60;List-Unsubscribe&#x60; header in the email message for distribution lists with the URL &#x60;rmsUnsubscribeUrl&#x60; info as its value.  The &#x60;oneClickApiMapping&#x60; property requires you to have an existing API Mapping and have access to its details. This API Mapping is triggered for one-click unsubscribe functionality. This is in line with the [RFC-8058](https://www.ietf.org/rfc/rfc8058.txt) (*Signaling One-Click Functionality for List Email Headers*). This will append the &#x60;List-Unsubscribe-Post&#x60; header in the email message for distribution lists with the &#x60;List-Unsubscribe&#x3D;One-Click&#x60; header as its &#x60;POST&#x60; endpoint for one-click.  Both the &#x60;rmsUnsubscribeUrl&#x60; and &#x60;oneClickApiMapping&#x60; properties are optional, but &#x60;rmsUnsubscribeUrl&#x60; is required to enable unsubscribe, &#x60;oneClickApiMapping&#x60; is required to enable one-click unsubscribe.
 */

public class OptOutOption {
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
  @SerializedName("rmsUnsubscribeUrl")
  private String rmsUnsubscribeUrl;

  @SerializedName("oneClickApiMapping")
  private String oneClickApiMapping;

  public OptOutOption() {
    super();
  }


   /**
   * This is a URL link to the web channel unsubscribe content for &#x60;GET&#x60; requests, and for one-click unsubscribe functionality via &#x60;POST&#x60; requests.
   * @return rmsUnsubscribeUrl
  **/
  @javax.annotation.Nullable
  public String getRmsUnsubscribeUrl() {
    return rmsUnsubscribeUrl;
  }
  public void setRmsUnsubscribeUrl(String rmsUnsubscribeUrl) {
    this.rmsUnsubscribeUrl = rmsUnsubscribeUrl;
  }

   /**
   * This is the API mapping code or ID triggered for one-click unsubscribe functionality. This code can be retrieved from the API Mapping page.
   * @return oneClickApiMapping
  **/
  @javax.annotation.Nullable
  public String getOneClickApiMapping() {
    return oneClickApiMapping;
  }
  public void setOneClickApiMapping(String oneClickApiMapping) {
    this.oneClickApiMapping = oneClickApiMapping;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptOutOption optOutOption = (OptOutOption) o;
    return Objects.equals(this.rmsUnsubscribeUrl, optOutOption.rmsUnsubscribeUrl) &&
        Objects.equals(this.oneClickApiMapping, optOutOption.oneClickApiMapping);
  }
  @Override
  public int hashCode() {
    return Objects.hash(rmsUnsubscribeUrl, oneClickApiMapping);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptOutOption {\n");
    sb.append("    rmsUnsubscribeUrl: ").append(toIndentedString(rmsUnsubscribeUrl)).append("\n");
    sb.append("    oneClickApiMapping: ").append(toIndentedString(oneClickApiMapping)).append("\n");
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
       if (!OptOutOption.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OptOutOption' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OptOutOption> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OptOutOption.class));

       return (TypeAdapter<T>) new TypeAdapter<OptOutOption>() {
           @Override
           public void write(JsonWriter out, OptOutOption value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OptOutOption read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OptOutOption given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OptOutOption
  * @throws IOException if the JSON string is invalid with respect to OptOutOption
  */
  public static OptOutOption fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OptOutOption.class);
  }

 /**
  * Convert an instance of OptOutOption to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

