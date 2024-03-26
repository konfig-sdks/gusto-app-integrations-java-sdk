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
import com.konfigthis.client.model.ExternalPayrollExternalPayrollItemsInnerBenefitsInner;
import com.konfigthis.client.model.ExternalPayrollExternalPayrollItemsInnerEarningsInner;
import com.konfigthis.client.model.ExternalPayrollExternalPayrollItemsInnerTaxesInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * ExternalPayrollExternalPayrollItemsInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ExternalPayrollExternalPayrollItemsInner {
  public static final String SERIALIZED_NAME_EMPLOYEE_UUID = "employee_uuid";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_UUID)
  private String employeeUuid;

  public static final String SERIALIZED_NAME_EARNINGS = "earnings";
  @SerializedName(SERIALIZED_NAME_EARNINGS)
  private List<ExternalPayrollExternalPayrollItemsInnerEarningsInner> earnings = null;

  public static final String SERIALIZED_NAME_BENEFITS = "benefits";
  @SerializedName(SERIALIZED_NAME_BENEFITS)
  private List<ExternalPayrollExternalPayrollItemsInnerBenefitsInner> benefits = null;

  public static final String SERIALIZED_NAME_TAXES = "taxes";
  @SerializedName(SERIALIZED_NAME_TAXES)
  private List<ExternalPayrollExternalPayrollItemsInnerTaxesInner> taxes = null;

  public ExternalPayrollExternalPayrollItemsInner() {
  }

  public ExternalPayrollExternalPayrollItemsInner employeeUuid(String employeeUuid) {
    
    
    
    
    this.employeeUuid = employeeUuid;
    return this;
  }

   /**
   * Get employeeUuid
   * @return employeeUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmployeeUuid() {
    return employeeUuid;
  }


  public void setEmployeeUuid(String employeeUuid) {
    
    
    
    this.employeeUuid = employeeUuid;
  }


  public ExternalPayrollExternalPayrollItemsInner earnings(List<ExternalPayrollExternalPayrollItemsInnerEarningsInner> earnings) {
    
    
    
    
    this.earnings = earnings;
    return this;
  }

  public ExternalPayrollExternalPayrollItemsInner addEarningsItem(ExternalPayrollExternalPayrollItemsInnerEarningsInner earningsItem) {
    if (this.earnings == null) {
      this.earnings = new ArrayList<>();
    }
    this.earnings.add(earningsItem);
    return this;
  }

   /**
   * Get earnings
   * @return earnings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ExternalPayrollExternalPayrollItemsInnerEarningsInner> getEarnings() {
    return earnings;
  }


  public void setEarnings(List<ExternalPayrollExternalPayrollItemsInnerEarningsInner> earnings) {
    
    
    
    this.earnings = earnings;
  }


  public ExternalPayrollExternalPayrollItemsInner benefits(List<ExternalPayrollExternalPayrollItemsInnerBenefitsInner> benefits) {
    
    
    
    
    this.benefits = benefits;
    return this;
  }

  public ExternalPayrollExternalPayrollItemsInner addBenefitsItem(ExternalPayrollExternalPayrollItemsInnerBenefitsInner benefitsItem) {
    if (this.benefits == null) {
      this.benefits = new ArrayList<>();
    }
    this.benefits.add(benefitsItem);
    return this;
  }

   /**
   * Get benefits
   * @return benefits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ExternalPayrollExternalPayrollItemsInnerBenefitsInner> getBenefits() {
    return benefits;
  }


  public void setBenefits(List<ExternalPayrollExternalPayrollItemsInnerBenefitsInner> benefits) {
    
    
    
    this.benefits = benefits;
  }


  public ExternalPayrollExternalPayrollItemsInner taxes(List<ExternalPayrollExternalPayrollItemsInnerTaxesInner> taxes) {
    
    
    
    
    this.taxes = taxes;
    return this;
  }

  public ExternalPayrollExternalPayrollItemsInner addTaxesItem(ExternalPayrollExternalPayrollItemsInnerTaxesInner taxesItem) {
    if (this.taxes == null) {
      this.taxes = new ArrayList<>();
    }
    this.taxes.add(taxesItem);
    return this;
  }

   /**
   * Get taxes
   * @return taxes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ExternalPayrollExternalPayrollItemsInnerTaxesInner> getTaxes() {
    return taxes;
  }


  public void setTaxes(List<ExternalPayrollExternalPayrollItemsInnerTaxesInner> taxes) {
    
    
    
    this.taxes = taxes;
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
   * @return the ExternalPayrollExternalPayrollItemsInner instance itself
   */
  public ExternalPayrollExternalPayrollItemsInner putAdditionalProperty(String key, Object value) {
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
    ExternalPayrollExternalPayrollItemsInner externalPayrollExternalPayrollItemsInner = (ExternalPayrollExternalPayrollItemsInner) o;
    return Objects.equals(this.employeeUuid, externalPayrollExternalPayrollItemsInner.employeeUuid) &&
        Objects.equals(this.earnings, externalPayrollExternalPayrollItemsInner.earnings) &&
        Objects.equals(this.benefits, externalPayrollExternalPayrollItemsInner.benefits) &&
        Objects.equals(this.taxes, externalPayrollExternalPayrollItemsInner.taxes)&&
        Objects.equals(this.additionalProperties, externalPayrollExternalPayrollItemsInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employeeUuid, earnings, benefits, taxes, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalPayrollExternalPayrollItemsInner {\n");
    sb.append("    employeeUuid: ").append(toIndentedString(employeeUuid)).append("\n");
    sb.append("    earnings: ").append(toIndentedString(earnings)).append("\n");
    sb.append("    benefits: ").append(toIndentedString(benefits)).append("\n");
    sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
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
    openapiFields.add("employee_uuid");
    openapiFields.add("earnings");
    openapiFields.add("benefits");
    openapiFields.add("taxes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ExternalPayrollExternalPayrollItemsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ExternalPayrollExternalPayrollItemsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExternalPayrollExternalPayrollItemsInner is not found in the empty JSON string", ExternalPayrollExternalPayrollItemsInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("employee_uuid") != null && !jsonObj.get("employee_uuid").isJsonNull()) && !jsonObj.get("employee_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employee_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employee_uuid").toString()));
      }
      if (jsonObj.get("earnings") != null && !jsonObj.get("earnings").isJsonNull()) {
        JsonArray jsonArrayearnings = jsonObj.getAsJsonArray("earnings");
        if (jsonArrayearnings != null) {
          // ensure the json data is an array
          if (!jsonObj.get("earnings").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `earnings` to be an array in the JSON string but got `%s`", jsonObj.get("earnings").toString()));
          }

          // validate the optional field `earnings` (array)
          for (int i = 0; i < jsonArrayearnings.size(); i++) {
            ExternalPayrollExternalPayrollItemsInnerEarningsInner.validateJsonObject(jsonArrayearnings.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("benefits") != null && !jsonObj.get("benefits").isJsonNull()) {
        JsonArray jsonArraybenefits = jsonObj.getAsJsonArray("benefits");
        if (jsonArraybenefits != null) {
          // ensure the json data is an array
          if (!jsonObj.get("benefits").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `benefits` to be an array in the JSON string but got `%s`", jsonObj.get("benefits").toString()));
          }

          // validate the optional field `benefits` (array)
          for (int i = 0; i < jsonArraybenefits.size(); i++) {
            ExternalPayrollExternalPayrollItemsInnerBenefitsInner.validateJsonObject(jsonArraybenefits.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("taxes") != null && !jsonObj.get("taxes").isJsonNull()) {
        JsonArray jsonArraytaxes = jsonObj.getAsJsonArray("taxes");
        if (jsonArraytaxes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("taxes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `taxes` to be an array in the JSON string but got `%s`", jsonObj.get("taxes").toString()));
          }

          // validate the optional field `taxes` (array)
          for (int i = 0; i < jsonArraytaxes.size(); i++) {
            ExternalPayrollExternalPayrollItemsInnerTaxesInner.validateJsonObject(jsonArraytaxes.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExternalPayrollExternalPayrollItemsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExternalPayrollExternalPayrollItemsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExternalPayrollExternalPayrollItemsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExternalPayrollExternalPayrollItemsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ExternalPayrollExternalPayrollItemsInner>() {
           @Override
           public void write(JsonWriter out, ExternalPayrollExternalPayrollItemsInner value) throws IOException {
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
           public ExternalPayrollExternalPayrollItemsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ExternalPayrollExternalPayrollItemsInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ExternalPayrollExternalPayrollItemsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExternalPayrollExternalPayrollItemsInner
  * @throws IOException if the JSON string is invalid with respect to ExternalPayrollExternalPayrollItemsInner
  */
  public static ExternalPayrollExternalPayrollItemsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExternalPayrollExternalPayrollItemsInner.class);
  }

 /**
  * Convert an instance of ExternalPayrollExternalPayrollItemsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

