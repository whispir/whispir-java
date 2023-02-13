package com.whispir.model;
import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.whispir.model.Link;
import com.whispir.model.MessageResponseDetailed;
import com.whispir.model.MessageResponseSummary;
import com.whispir.model.ResponseStatusSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.net.URI;

import javax.ws.rs.core.GenericType;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import com.whispir.client.ApiResponse;
import com.whispir.client.JSON;

@javax.annotation.Generated(value = "com.whispir.codegen.JavaCustomClientCodegen", date = "2023-02-13T11:33:29.412612+13:00[Pacific/Auckland]")
public class MessageResponseCollection extends AbstractOpenApiSchema {
    public ApiResponse lastResponse;
    private static final Logger log = Logger.getLogger(MessageResponseCollection.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!MessageResponseCollection.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'MessageResponseCollection' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<MessageResponseDetailed> adapterMessageResponseDetailed = gson.getDelegateAdapter(this, TypeToken.get(MessageResponseDetailed.class));
            final TypeAdapter<MessageResponseSummary> adapterMessageResponseSummary = gson.getDelegateAdapter(this, TypeToken.get(MessageResponseSummary.class));

            return (TypeAdapter<T>) new TypeAdapter<MessageResponseCollection>() {
                @Override
                public void write(JsonWriter out, MessageResponseCollection value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `MessageResponseDetailed`
                    if (value.getActualInstance() instanceof MessageResponseDetailed) {
                        JsonObject obj = adapterMessageResponseDetailed.toJsonTree((MessageResponseDetailed)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `MessageResponseSummary`
                    if (value.getActualInstance() instanceof MessageResponseSummary) {
                        JsonObject obj = adapterMessageResponseSummary.toJsonTree((MessageResponseSummary)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: MessageResponseDetailed, MessageResponseSummary");
                }

                @Override
                public MessageResponseCollection read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize MessageResponseDetailed
                    try {
                        // validate the JSON object to see if any exception is thrown
                        actualAdapter = adapterMessageResponseDetailed;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'MessageResponseDetailed'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for MessageResponseDetailed failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'MessageResponseDetailed'", e);
                    }

                    // deserialize MessageResponseSummary
                    try {
                        // validate the JSON object to see if any exception is thrown
                        actualAdapter = adapterMessageResponseSummary;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'MessageResponseSummary'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for MessageResponseSummary failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'MessageResponseSummary'", e);
                    }

                    if (match == 1) {
                        MessageResponseCollection ret = new MessageResponseCollection();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for MessageResponseCollection: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public MessageResponseCollection() {
        super("oneOf", Boolean.FALSE);
    }

    public MessageResponseCollection(MessageResponseDetailed o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public MessageResponseCollection(MessageResponseSummary o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("MessageResponseDetailed", new GenericType<MessageResponseDetailed>() {
        });
        schemas.put("MessageResponseSummary", new GenericType<MessageResponseSummary>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return MessageResponseCollection.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * MessageResponseDetailed, MessageResponseSummary
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof MessageResponseDetailed) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof MessageResponseSummary) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be MessageResponseDetailed, MessageResponseSummary");
    }

    /**
     * Get the actual instance, which can be the following:
     * MessageResponseDetailed, MessageResponseSummary
     *
     * @return The actual instance (MessageResponseDetailed, MessageResponseSummary)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `MessageResponseDetailed`. If the actual instance is not `MessageResponseDetailed`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `MessageResponseDetailed`
     * @throws ClassCastException if the instance is not `MessageResponseDetailed`
     */
    public MessageResponseDetailed getMessageResponseDetailed() throws ClassCastException {
        return (MessageResponseDetailed)super.getActualInstance();
    }

    /**
     * Get the actual instance of `MessageResponseSummary`. If the actual instance is not `MessageResponseSummary`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `MessageResponseSummary`
     * @throws ClassCastException if the instance is not `MessageResponseSummary`
     */
    public MessageResponseSummary getMessageResponseSummary() throws ClassCastException {
        return (MessageResponseSummary)super.getActualInstance();
    }


 /**
  * Create an instance of MessageResponseCollection given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MessageResponseCollection
  * @throws IOException if the JSON string is invalid with respect to MessageResponseCollection
  */
  public static MessageResponseCollection fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MessageResponseCollection.class);
  }

 /**
  * Convert an instance of MessageResponseCollection to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
