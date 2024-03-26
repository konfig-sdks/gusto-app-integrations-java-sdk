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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
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
public class EmployeeAddressesUpdateHomeAddressRequest {
  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_STREET1 = "street_1";
  @SerializedName(SERIALIZED_NAME_STREET1)
  private String street1;

  public static final String SERIALIZED_NAME_STREET2 = "street_2";
  @SerializedName(SERIALIZED_NAME_STREET2)
  private String street2;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_ZIP = "zip";
  @SerializedName(SERIALIZED_NAME_ZIP)
  private String zip;

  public static final String SERIALIZED_NAME_EFFECTIVE_DATE = "effective_date";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_DATE)
  private LocalDate effectiveDate;

  public static final String SERIALIZED_NAME_COURTESY_WITHHOLDING = "courtesy_withholding";
  @SerializedName(SERIALIZED_NAME_COURTESY_WITHHOLDING)
  private Boolean courtesyWithholding;

  public EmployeeAddressesUpdateHomeAddressRequest() {
  }

  public EmployeeAddressesUpdateHomeAddressRequest version(String version) {
    
    
    
    
    this.version = version;
    return this;
  }

   /**
   * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/versioning#object-layer) for information on how to use this field.
   * @return version
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/versioning#object-layer) for information on how to use this field.")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    
    
    
    this.version = version;
  }


  public EmployeeAddressesUpdateHomeAddressRequest street1(String street1) {
    
    
    
    
    this.street1 = street1;
    return this;
  }

   /**
   * Get street1
   * @return street1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStreet1() {
    return street1;
  }


  public void setStreet1(String street1) {
    
    
    
    this.street1 = street1;
  }


  public EmployeeAddressesUpdateHomeAddressRequest street2(String street2) {
    
    
    
    
    this.street2 = street2;
    return this;
  }

   /**
   * Get street2
   * @return street2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStreet2() {
    return street2;
  }


  public void setStreet2(String street2) {
    
    
    
    this.street2 = street2;
  }


  public EmployeeAddressesUpdateHomeAddressRequest city(String city) {
    
    
    
    
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    
    
    
    this.city = city;
  }


  public EmployeeAddressesUpdateHomeAddressRequest state(String state) {
    
    
    
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    
    
    
    this.state = state;
  }


  public EmployeeAddressesUpdateHomeAddressRequest zip(String zip) {
    
    
    
    
    this.zip = zip;
    return this;
  }

   /**
   * Get zip
   * @return zip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getZip() {
    return zip;
  }


  public void setZip(String zip) {
    
    
    
    this.zip = zip;
  }


  public EmployeeAddressesUpdateHomeAddressRequest effectiveDate(LocalDate effectiveDate) {
    
    
    
    
    this.effectiveDate = effectiveDate;
    return this;
  }

   /**
   * Get effectiveDate
   * @return effectiveDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocalDate getEffectiveDate() {
    return effectiveDate;
  }


  public void setEffectiveDate(LocalDate effectiveDate) {
    
    
    
    this.effectiveDate = effectiveDate;
  }


  public EmployeeAddressesUpdateHomeAddressRequest courtesyWithholding(Boolean courtesyWithholding) {
    
    
    
    
    this.courtesyWithholding = courtesyWithholding;
    return this;
  }

   /**
   * Get courtesyWithholding
   * @return courtesyWithholding
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCourtesyWithholding() {
    return courtesyWithholding;
  }


  public void setCourtesyWithholding(Boolean courtesyWithholding) {
    
    
    
    this.courtesyWithholding = courtesyWithholding;
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
   * @return the EmployeeAddressesUpdateHomeAddressRequest instance itself
   */
  public EmployeeAddressesUpdateHomeAddressRequest putAdditionalProperty(String key, Object value) {
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
    EmployeeAddressesUpdateHomeAddressRequest employeeAddressesUpdateHomeAddressRequest = (EmployeeAddressesUpdateHomeAddressRequest) o;
    return Objects.equals(this.version, employeeAddressesUpdateHomeAddressRequest.version) &&
        Objects.equals(this.street1, employeeAddressesUpdateHomeAddressRequest.street1) &&
        Objects.equals(this.street2, employeeAddressesUpdateHomeAddressRequest.street2) &&
        Objects.equals(this.city, employeeAddressesUpdateHomeAddressRequest.city) &&
        Objects.equals(this.state, employeeAddressesUpdateHomeAddressRequest.state) &&
        Objects.equals(this.zip, employeeAddressesUpdateHomeAddressRequest.zip) &&
        Objects.equals(this.effectiveDate, employeeAddressesUpdateHomeAddressRequest.effectiveDate) &&
        Objects.equals(this.courtesyWithholding, employeeAddressesUpdateHomeAddressRequest.courtesyWithholding)&&
        Objects.equals(this.additionalProperties, employeeAddressesUpdateHomeAddressRequest.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, street1, street2, city, state, zip, effectiveDate, courtesyWithholding, additionalProperties);
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
    sb.append("class EmployeeAddressesUpdateHomeAddressRequest {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    street1: ").append(toIndentedString(street1)).append("\n");
    sb.append("    street2: ").append(toIndentedString(street2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    courtesyWithholding: ").append(toIndentedString(courtesyWithholding)).append("\n");
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
    openapiFields.add("version");
    openapiFields.add("street_1");
    openapiFields.add("street_2");
    openapiFields.add("city");
    openapiFields.add("state");
    openapiFields.add("zip");
    openapiFields.add("effective_date");
    openapiFields.add("courtesy_withholding");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("version");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EmployeeAddressesUpdateHomeAddressRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EmployeeAddressesUpdateHomeAddressRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmployeeAddressesUpdateHomeAddressRequest is not found in the empty JSON string", EmployeeAddressesUpdateHomeAddressRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EmployeeAddressesUpdateHomeAddressRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
      if ((jsonObj.get("street_1") != null && !jsonObj.get("street_1").isJsonNull()) && !jsonObj.get("street_1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `street_1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("street_1").toString()));
      }
      if (!jsonObj.get("street_2").isJsonNull() && (jsonObj.get("street_2") != null && !jsonObj.get("street_2").isJsonNull()) && !jsonObj.get("street_2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `street_2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("street_2").toString()));
      }
      if ((jsonObj.get("city") != null && !jsonObj.get("city").isJsonNull()) && !jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if ((jsonObj.get("zip") != null && !jsonObj.get("zip").isJsonNull()) && !jsonObj.get("zip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zip").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmployeeAddressesUpdateHomeAddressRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmployeeAddressesUpdateHomeAddressRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmployeeAddressesUpdateHomeAddressRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmployeeAddressesUpdateHomeAddressRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<EmployeeAddressesUpdateHomeAddressRequest>() {
           @Override
           public void write(JsonWriter out, EmployeeAddressesUpdateHomeAddressRequest value) throws IOException {
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
           public EmployeeAddressesUpdateHomeAddressRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EmployeeAddressesUpdateHomeAddressRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EmployeeAddressesUpdateHomeAddressRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EmployeeAddressesUpdateHomeAddressRequest
  * @throws IOException if the JSON string is invalid with respect to EmployeeAddressesUpdateHomeAddressRequest
  */
  public static EmployeeAddressesUpdateHomeAddressRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmployeeAddressesUpdateHomeAddressRequest.class);
  }

 /**
  * Convert an instance of EmployeeAddressesUpdateHomeAddressRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

