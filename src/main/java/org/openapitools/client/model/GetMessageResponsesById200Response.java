/*
 * Whispir Platform API
 * Whispir Platform API for cross channel and multi channel communications. Documentation on each endpoint is available at https://developers.whispir.com.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@whispir.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

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
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.openapitools.client.model.LinkInner;
import org.openapitools.client.model.MessageResponseDetailed;
import org.openapitools.client.model.MessageResponseSummary;
import org.openapitools.client.model.MessageResponseSummaryMessageresponsesInner;

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

import whispir_sdk_java.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-14T10:37:13.711751+10:00[Australia/Melbourne]")
public class GetMessageResponsesById200Response extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(GetMessageResponsesById200Response.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!GetMessageResponsesById200Response.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'GetMessageResponsesById200Response' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<MessageResponseDetailed> adapterMessageResponseDetailed = gson.getDelegateAdapter(this, TypeToken.get(MessageResponseDetailed.class));
            final TypeAdapter<MessageResponseSummary> adapterMessageResponseSummary = gson.getDelegateAdapter(this, TypeToken.get(MessageResponseSummary.class));

            return (TypeAdapter<T>) new TypeAdapter<GetMessageResponsesById200Response>() {
                @Override
                public void write(JsonWriter out, GetMessageResponsesById200Response value) throws IOException {
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
                public GetMessageResponsesById200Response read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize MessageResponseDetailed
                    try {
                        // validate the JSON object to see if any exception is thrown
                        MessageResponseDetailed.validateJsonObject(jsonObject);
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
                        MessageResponseSummary.validateJsonObject(jsonObject);
                        actualAdapter = adapterMessageResponseSummary;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'MessageResponseSummary'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for MessageResponseSummary failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'MessageResponseSummary'", e);
                    }

                    if (match == 1) {
                        GetMessageResponsesById200Response ret = new GetMessageResponsesById200Response();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for GetMessageResponsesById200Response: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public GetMessageResponsesById200Response() {
        super("oneOf", Boolean.FALSE);
    }

    public GetMessageResponsesById200Response(MessageResponseDetailed o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public GetMessageResponsesById200Response(MessageResponseSummary o) {
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
        return GetMessageResponsesById200Response.schemas;
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
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetMessageResponsesById200Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with MessageResponseDetailed
    try {
      MessageResponseDetailed.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for MessageResponseDetailed failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with MessageResponseSummary
    try {
      MessageResponseSummary.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for MessageResponseSummary failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for GetMessageResponsesById200Response with oneOf schemas: MessageResponseDetailed, MessageResponseSummary. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of GetMessageResponsesById200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetMessageResponsesById200Response
  * @throws IOException if the JSON string is invalid with respect to GetMessageResponsesById200Response
  */
  public static GetMessageResponsesById200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetMessageResponsesById200Response.class);
  }

 /**
  * Convert an instance of GetMessageResponsesById200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

