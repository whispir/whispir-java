package com.whispir.model;
import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.whispir.model.RCSCard;
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
 * Describes a list of cards that will be displayed in the message.  There can be 1 or more cards. If the Rich Card contains more than one card, it is often referred to as a *carousel*. 
 */

public class RCSRichCard {
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
  @SerializedName("cardOrientation")
  private String cardOrientation;

  @SerializedName("cardWidth")
  private String cardWidth;

  @SerializedName("cards")
  private List<RCSCard> cards;

  public RCSRichCard() {
    super();
  }


   /**
   * Get cardOrientation
   * @return cardOrientation
  **/
  @javax.annotation.Nullable
  public String getCardOrientation() {
    return cardOrientation;
  }
  public void setCardOrientation(String cardOrientation) {
    this.cardOrientation = cardOrientation;
  }

   /**
   * Get cardWidth
   * @return cardWidth
  **/
  @javax.annotation.Nullable
  public String getCardWidth() {
    return cardWidth;
  }
  public void setCardWidth(String cardWidth) {
    this.cardWidth = cardWidth;
  }

  public RCSRichCard addCardsItem(RCSCard cardsItem) {
    this.cards.add(cardsItem);
    return this;
  }

   /**
   * Get cards
   * @return cards
  **/
  @javax.annotation.Nonnull
  public List<RCSCard> getCards() {
    return cards;
  }
  public void setCards(List<RCSCard> cards) {
    this.cards = cards;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RCSRichCard rcSRichCard = (RCSRichCard) o;
    return Objects.equals(this.cardOrientation, rcSRichCard.cardOrientation) &&
        Objects.equals(this.cardWidth, rcSRichCard.cardWidth) &&
        Objects.equals(this.cards, rcSRichCard.cards);
  }
  @Override
  public int hashCode() {
    return Objects.hash(cardOrientation, cardWidth, cards);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RCSRichCard {\n");
    sb.append("    cardOrientation: ").append(toIndentedString(cardOrientation)).append("\n");
    sb.append("    cardWidth: ").append(toIndentedString(cardWidth)).append("\n");
    sb.append("    cards: ").append(toIndentedString(cards)).append("\n");
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
       if (!RCSRichCard.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RCSRichCard' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RCSRichCard> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RCSRichCard.class));

       return (TypeAdapter<T>) new TypeAdapter<RCSRichCard>() {
           @Override
           public void write(JsonWriter out, RCSRichCard value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RCSRichCard read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RCSRichCard given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RCSRichCard
  * @throws IOException if the JSON string is invalid with respect to RCSRichCard
  */
  public static RCSRichCard fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RCSRichCard.class);
  }

 /**
  * Convert an instance of RCSRichCard to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

