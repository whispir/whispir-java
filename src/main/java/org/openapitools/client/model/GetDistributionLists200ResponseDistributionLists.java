/*
 * Whispir Platform API
 * Whispir Platform API for cross channel and multi channel communications. Documentation on each endpoint is available at https://developers.whispir.com.
 *
 * The version of the OpenAPI document: 1.1.0
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
import java.util.List;
import org.openapitools.client.model.Distributionlist;
import org.openapitools.client.model.DistributionlistDistlistdetailsInner;
import org.openapitools.client.model.Dynamicdistributionlist;
import org.openapitools.client.model.LinkInner;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-21T01:55:16.197234Z[Etc/UTC]")
public class GetDistributionLists200ResponseDistributionLists extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(GetDistributionLists200ResponseDistributionLists.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!GetDistributionLists200ResponseDistributionLists.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'GetDistributionLists200ResponseDistributionLists' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<Distributionlist> adapterDistributionlist = gson.getDelegateAdapter(this, TypeToken.get(Distributionlist.class));
            final TypeAdapter<Dynamicdistributionlist> adapterDynamicdistributionlist = gson.getDelegateAdapter(this, TypeToken.get(Dynamicdistributionlist.class));

            return (TypeAdapter<T>) new TypeAdapter<GetDistributionLists200ResponseDistributionLists>() {
                @Override
                public void write(JsonWriter out, GetDistributionLists200ResponseDistributionLists value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `Distributionlist`
                    if (value.getActualInstance() instanceof Distributionlist) {
                        JsonObject obj = adapterDistributionlist.toJsonTree((Distributionlist)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `Dynamicdistributionlist`
                    if (value.getActualInstance() instanceof Dynamicdistributionlist) {
                        JsonObject obj = adapterDynamicdistributionlist.toJsonTree((Dynamicdistributionlist)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: Distributionlist, Dynamicdistributionlist");
                }

                @Override
                public GetDistributionLists200ResponseDistributionLists read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize Distributionlist
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Distributionlist.validateJsonObject(jsonObject);
                        actualAdapter = adapterDistributionlist;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'Distributionlist'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Distributionlist failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Distributionlist'", e);
                    }

                    // deserialize Dynamicdistributionlist
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Dynamicdistributionlist.validateJsonObject(jsonObject);
                        actualAdapter = adapterDynamicdistributionlist;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'Dynamicdistributionlist'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Dynamicdistributionlist failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Dynamicdistributionlist'", e);
                    }

                    if (match == 1) {
                        GetDistributionLists200ResponseDistributionLists ret = new GetDistributionLists200ResponseDistributionLists();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for GetDistributionLists200ResponseDistributionLists: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public GetDistributionLists200ResponseDistributionLists() {
        super("oneOf", Boolean.FALSE);
    }

    public GetDistributionLists200ResponseDistributionLists(Distributionlist o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public GetDistributionLists200ResponseDistributionLists(Dynamicdistributionlist o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("Distributionlist", new GenericType<Distributionlist>() {
        });
        schemas.put("Dynamicdistributionlist", new GenericType<Dynamicdistributionlist>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return GetDistributionLists200ResponseDistributionLists.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * Distributionlist, Dynamicdistributionlist
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof Distributionlist) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof Dynamicdistributionlist) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be Distributionlist, Dynamicdistributionlist");
    }

    /**
     * Get the actual instance, which can be the following:
     * Distributionlist, Dynamicdistributionlist
     *
     * @return The actual instance (Distributionlist, Dynamicdistributionlist)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `Distributionlist`. If the actual instance is not `Distributionlist`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Distributionlist`
     * @throws ClassCastException if the instance is not `Distributionlist`
     */
    public Distributionlist getDistributionlist() throws ClassCastException {
        return (Distributionlist)super.getActualInstance();
    }

    /**
     * Get the actual instance of `Dynamicdistributionlist`. If the actual instance is not `Dynamicdistributionlist`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Dynamicdistributionlist`
     * @throws ClassCastException if the instance is not `Dynamicdistributionlist`
     */
    public Dynamicdistributionlist getDynamicdistributionlist() throws ClassCastException {
        return (Dynamicdistributionlist)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetDistributionLists200ResponseDistributionLists
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with Distributionlist
    try {
      Distributionlist.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for Distributionlist failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with Dynamicdistributionlist
    try {
      Dynamicdistributionlist.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for Dynamicdistributionlist failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for GetDistributionLists200ResponseDistributionLists with oneOf schemas: Distributionlist, Dynamicdistributionlist. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of GetDistributionLists200ResponseDistributionLists given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetDistributionLists200ResponseDistributionLists
  * @throws IOException if the JSON string is invalid with respect to GetDistributionLists200ResponseDistributionLists
  */
  public static GetDistributionLists200ResponseDistributionLists fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetDistributionLists200ResponseDistributionLists.class);
  }

 /**
  * Convert an instance of GetDistributionLists200ResponseDistributionLists to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

