/*
 * Gusto API
 * Welcome to Gusto's Embedded Payroll API documentation!
 *
 * The version of the OpenAPI document: 2024-03-01
 * Contact: developer@gusto.com
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.TaxRequirement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

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
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * 
 */
@ApiModel(description = "")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TaxRequirementSet {
  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_EFFECTIVE_FROM = "effective_from";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_FROM)
  private String effectiveFrom;

  public static final String SERIALIZED_NAME_REQUIREMENTS = "requirements";
  @SerializedName(SERIALIZED_NAME_REQUIREMENTS)
  private List<TaxRequirement> requirements = null;

  public TaxRequirementSet() {
  }

  public TaxRequirementSet state(String state) {
    
    
    
    
    this.state = state;
    return this;
  }

   /**
   * One of the two-letter state abbreviations for the fifty United States and the District of Columbia (DC)
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "GA", value = "One of the two-letter state abbreviations for the fifty United States and the District of Columbia (DC)")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    
    
    
    this.state = state;
  }


  public TaxRequirementSet key(String key) {
    
    
    
    
    this.key = key;
    return this;
  }

   /**
   * An identifier for a set of requirements. A list of requirement sets can contain multiple sets with the same &#x60;key&#x60; and different &#x60;effective_from&#x60; values.
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "registrations", value = "An identifier for a set of requirements. A list of requirement sets can contain multiple sets with the same `key` and different `effective_from` values.")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    
    
    
    this.key = key;
  }


  public TaxRequirementSet label(String label) {
    
    
    
    
    this.label = label;
    return this;
  }

   /**
   * Customer facing label for the requirement set, e.g. \&quot;Registrations\&quot;
   * @return label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Registrations", value = "Customer facing label for the requirement set, e.g. \"Registrations\"")

  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    
    
    
    this.label = label;
  }


  public TaxRequirementSet effectiveFrom(String effectiveFrom) {
    
    
    
    
    this.effectiveFrom = effectiveFrom;
    return this;
  }

   /**
   * An ISO 8601 formatted date representing the date values became effective. Some requirement sets are effective dated, while others are not. Multiple requirement sets for the same state/key can/will exist with unique effective dates. If a requirement set is has an &#x60;effective_from&#x60; value, all requirement sets with the same key will also have an &#x60;effective_from&#x60; value.
   * @return effectiveFrom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An ISO 8601 formatted date representing the date values became effective. Some requirement sets are effective dated, while others are not. Multiple requirement sets for the same state/key can/will exist with unique effective dates. If a requirement set is has an `effective_from` value, all requirement sets with the same key will also have an `effective_from` value.")

  public String getEffectiveFrom() {
    return effectiveFrom;
  }


  public void setEffectiveFrom(String effectiveFrom) {
    
    
    
    this.effectiveFrom = effectiveFrom;
  }


  public TaxRequirementSet requirements(List<TaxRequirement> requirements) {
    
    
    
    
    this.requirements = requirements;
    return this;
  }

  public TaxRequirementSet addRequirementsItem(TaxRequirement requirementsItem) {
    if (this.requirements == null) {
      this.requirements = new ArrayList<>();
    }
    this.requirements.add(requirementsItem);
    return this;
  }

   /**
   * Get requirements
   * @return requirements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TaxRequirement> getRequirements() {
    return requirements;
  }


  public void setRequirements(List<TaxRequirement> requirements) {
    
    
    
    this.requirements = requirements;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the TaxRequirementSet instance itself
   */
  public TaxRequirementSet putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxRequirementSet taxRequirementSet = (TaxRequirementSet) o;
    return Objects.equals(this.state, taxRequirementSet.state) &&
        Objects.equals(this.key, taxRequirementSet.key) &&
        Objects.equals(this.label, taxRequirementSet.label) &&
        Objects.equals(this.effectiveFrom, taxRequirementSet.effectiveFrom) &&
        Objects.equals(this.requirements, taxRequirementSet.requirements)&&
        Objects.equals(this.additionalProperties, taxRequirementSet.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, key, label, effectiveFrom, requirements, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxRequirementSet {\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    effectiveFrom: ").append(toIndentedString(effectiveFrom)).append("\n");
    sb.append("    requirements: ").append(toIndentedString(requirements)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("state");
    openapiFields.add("key");
    openapiFields.add("label");
    openapiFields.add("effective_from");
    openapiFields.add("requirements");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TaxRequirementSet
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TaxRequirementSet.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TaxRequirementSet is not found in the empty JSON string", TaxRequirementSet.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if ((jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull()) && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if ((jsonObj.get("label") != null && !jsonObj.get("label").isJsonNull()) && !jsonObj.get("label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label").toString()));
      }
      if (!jsonObj.get("effective_from").isJsonNull() && (jsonObj.get("effective_from") != null && !jsonObj.get("effective_from").isJsonNull()) && !jsonObj.get("effective_from").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `effective_from` to be a primitive type in the JSON string but got `%s`", jsonObj.get("effective_from").toString()));
      }
      if (jsonObj.get("requirements") != null && !jsonObj.get("requirements").isJsonNull()) {
        JsonArray jsonArrayrequirements = jsonObj.getAsJsonArray("requirements");
        if (jsonArrayrequirements != null) {
          // ensure the json data is an array
          if (!jsonObj.get("requirements").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `requirements` to be an array in the JSON string but got `%s`", jsonObj.get("requirements").toString()));
          }

          // validate the optional field `requirements` (array)
          for (int i = 0; i < jsonArrayrequirements.size(); i++) {
            TaxRequirement.validateJsonObject(jsonArrayrequirements.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TaxRequirementSet.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TaxRequirementSet' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TaxRequirementSet> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TaxRequirementSet.class));

       return (TypeAdapter<T>) new TypeAdapter<TaxRequirementSet>() {
           @Override
           public void write(JsonWriter out, TaxRequirementSet value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public TaxRequirementSet read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TaxRequirementSet instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TaxRequirementSet given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TaxRequirementSet
  * @throws IOException if the JSON string is invalid with respect to TaxRequirementSet
  */
  public static TaxRequirementSet fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TaxRequirementSet.class);
  }

 /**
  * Convert an instance of TaxRequirementSet to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

