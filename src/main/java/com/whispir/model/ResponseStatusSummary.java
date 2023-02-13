package com.whispir.model;
import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.whispir.model.Link;
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
 * First object if &#x60;view&#x60; is &#x60;summary&#x60;, second object if &#x60;view&#x60; is &#x60;detailed&#x60;.
 */

public class ResponseStatusSummary {
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
  @SerializedName("percentageTotal")
  private String percentageTotal;

  @SerializedName("responseCount")
  private String responseCount;

  @SerializedName("link")
  private List<Link> link;

  @SerializedName("type")
  private String type;

  public ResponseStatusSummary() {
    super();
  }

  public ResponseStatusSummary(
    String percentageTotal, 
    String responseCount, 
    List<Link> link, 
    String type
  ) {
    this();
    this.percentageTotal = percentageTotal;
    this.responseCount = responseCount;
    this.link = link;
    this.type = type;
  }
   /**
   * Details the percentage of responses received for the sent message across all channels.
   * @return percentageTotal
  **/
  @javax.annotation.Nonnull
  public String getPercentageTotal() {
    return percentageTotal;
  }
   /**
   * Details the number of responses received for the sent message across all channels.
   * @return responseCount
  **/
  @javax.annotation.Nonnull
  public String getResponseCount() {
    return responseCount;
  }
   /**
   * A [HATEOAS](https://en.wikipedia.org/wiki/HATEOAS) link array, describing all discoverable resources in relation to the original request.
   * @return link
  **/
  @javax.annotation.Nonnull
  public List<Link> getLink() {
    return link;
  }
   /**
   * The message response category.  * &#x60;noresponse&#x60; - the message was sent but was not replied to * &#x60;notmatched&#x60; - the message was replied to and the answer didn&#39;t match any search criteria
   * @return type
  **/
  @javax.annotation.Nonnull
  public String getType() {
    return type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseStatusSummary responseStatusSummary = (ResponseStatusSummary) o;
    return Objects.equals(this.percentageTotal, responseStatusSummary.percentageTotal) &&
        Objects.equals(this.responseCount, responseStatusSummary.responseCount) &&
        Objects.equals(this.link, responseStatusSummary.link) &&
        Objects.equals(this.type, responseStatusSummary.type);
  }
  @Override
  public int hashCode() {
    return Objects.hash(percentageTotal, responseCount, link, type);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseStatusSummary {\n");
    sb.append("    percentageTotal: ").append(toIndentedString(percentageTotal)).append("\n");
    sb.append("    responseCount: ").append(toIndentedString(responseCount)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
       if (!ResponseStatusSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResponseStatusSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResponseStatusSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResponseStatusSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<ResponseStatusSummary>() {
           @Override
           public void write(JsonWriter out, ResponseStatusSummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResponseStatusSummary read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ResponseStatusSummary given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ResponseStatusSummary
  * @throws IOException if the JSON string is invalid with respect to ResponseStatusSummary
  */
  public static ResponseStatusSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResponseStatusSummary.class);
  }

 /**
  * Convert an instance of ResponseStatusSummary to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

