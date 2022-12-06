/*
 * Whispir Platform API
 * Whispir Platform API for cross channel and multi channel communications. Documentation on each endpoint is available at https://developers.whispir.com.
 *
 * The version of the OpenAPI document: 1.1.3
 * Contact: support@whispir.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.whispir.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.whispir.model.DistributionListDetails;
import com.whispir.model.DistributionListDynamic;
import com.whispir.model.DistributionListStatic;
import com.whispir.model.Link;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

import com.whispir.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-06T03:10:46.360132Z[Etc/UTC]")
public class DistributionList extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(DistributionList.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!DistributionList.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'DistributionList' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<DistributionListDynamic> adapterDistributionListDynamic = gson.getDelegateAdapter(this, TypeToken.get(DistributionListDynamic.class));
            final TypeAdapter<DistributionListStatic> adapterDistributionListStatic = gson.getDelegateAdapter(this, TypeToken.get(DistributionListStatic.class));

            return (TypeAdapter<T>) new TypeAdapter<DistributionList>() {
                @Override
                public void write(JsonWriter out, DistributionList value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `DistributionListDynamic`
                    if (value.getActualInstance() instanceof DistributionListDynamic) {
                        JsonObject obj = adapterDistributionListDynamic.toJsonTree((DistributionListDynamic)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `DistributionListStatic`
                    if (value.getActualInstance() instanceof DistributionListStatic) {
                        JsonObject obj = adapterDistributionListStatic.toJsonTree((DistributionListStatic)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: DistributionListDynamic, DistributionListStatic");
                }

                @Override
                public DistributionList read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize DistributionListDynamic
                    try {
                        // validate the JSON object to see if any exception is thrown
                        DistributionListDynamic.validateJsonObject(jsonObject);
                        actualAdapter = adapterDistributionListDynamic;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'DistributionListDynamic'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for DistributionListDynamic failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'DistributionListDynamic'", e);
                    }

                    // deserialize DistributionListStatic
                    try {
                        // validate the JSON object to see if any exception is thrown
                        DistributionListStatic.validateJsonObject(jsonObject);
                        actualAdapter = adapterDistributionListStatic;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'DistributionListStatic'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for DistributionListStatic failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'DistributionListStatic'", e);
                    }

                    if (match == 1) {
                        DistributionList ret = new DistributionList();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for DistributionList: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public DistributionList() {
        super("oneOf", Boolean.FALSE);
    }

    public DistributionList(DistributionListDynamic o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public DistributionList(DistributionListStatic o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("DistributionListDynamic", new GenericType<DistributionListDynamic>() {
        });
        schemas.put("DistributionListStatic", new GenericType<DistributionListStatic>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return DistributionList.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * DistributionListDynamic, DistributionListStatic
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof DistributionListDynamic) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof DistributionListStatic) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be DistributionListDynamic, DistributionListStatic");
    }

    /**
     * Get the actual instance, which can be the following:
     * DistributionListDynamic, DistributionListStatic
     *
     * @return The actual instance (DistributionListDynamic, DistributionListStatic)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `DistributionListDynamic`. If the actual instance is not `DistributionListDynamic`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `DistributionListDynamic`
     * @throws ClassCastException if the instance is not `DistributionListDynamic`
     */
    public DistributionListDynamic getDistributionListDynamic() throws ClassCastException {
        return (DistributionListDynamic)super.getActualInstance();
    }

    /**
     * Get the actual instance of `DistributionListStatic`. If the actual instance is not `DistributionListStatic`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `DistributionListStatic`
     * @throws ClassCastException if the instance is not `DistributionListStatic`
     */
    public DistributionListStatic getDistributionListStatic() throws ClassCastException {
        return (DistributionListStatic)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DistributionList
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with DistributionListDynamic
    try {
      DistributionListDynamic.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for DistributionListDynamic failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with DistributionListStatic
    try {
      DistributionListStatic.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for DistributionListStatic failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for DistributionList with oneOf schemas: DistributionListDynamic, DistributionListStatic. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of DistributionList given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DistributionList
  * @throws IOException if the JSON string is invalid with respect to DistributionList
  */
  public static DistributionList fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DistributionList.class);
  }

 /**
  * Convert an instance of DistributionList to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

