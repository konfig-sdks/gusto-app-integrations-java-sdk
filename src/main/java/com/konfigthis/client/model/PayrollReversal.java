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
 * PayrollReversal
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PayrollReversal {
  public static final String SERIALIZED_NAME_REVERSED_PAYROLL_UUID = "reversed_payroll_uuid";
  @SerializedName(SERIALIZED_NAME_REVERSED_PAYROLL_UUID)
  private String reversedPayrollUuid;

  public static final String SERIALIZED_NAME_REVERSAL_PAYROLL_UUID = "reversal_payroll_uuid";
  @SerializedName(SERIALIZED_NAME_REVERSAL_PAYROLL_UUID)
  private String reversalPayrollUuid;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public static final String SERIALIZED_NAME_APPROVED_AT = "approved_at";
  @SerializedName(SERIALIZED_NAME_APPROVED_AT)
  private String approvedAt;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private List<Integer> category = null;

  public static final String SERIALIZED_NAME_REVERSED_EMPLOYEE_UUIDS = "reversed_employee_uuids";
  @SerializedName(SERIALIZED_NAME_REVERSED_EMPLOYEE_UUIDS)
  private List<String> reversedEmployeeUuids = null;

  public PayrollReversal() {
  }

  public PayrollReversal reversedPayrollUuid(String reversedPayrollUuid) {
    
    
    
    
    this.reversedPayrollUuid = reversedPayrollUuid;
    return this;
  }

   /**
   * The UUID for the payroll run being reversed.
   * @return reversedPayrollUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The UUID for the payroll run being reversed.")

  public String getReversedPayrollUuid() {
    return reversedPayrollUuid;
  }


  public void setReversedPayrollUuid(String reversedPayrollUuid) {
    
    
    
    this.reversedPayrollUuid = reversedPayrollUuid;
  }


  public PayrollReversal reversalPayrollUuid(String reversalPayrollUuid) {
    
    
    
    
    this.reversalPayrollUuid = reversalPayrollUuid;
    return this;
  }

   /**
   * The UUID of the payroll where the reversal was applied.
   * @return reversalPayrollUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The UUID of the payroll where the reversal was applied.")

  public String getReversalPayrollUuid() {
    return reversalPayrollUuid;
  }


  public void setReversalPayrollUuid(String reversalPayrollUuid) {
    
    
    
    this.reversalPayrollUuid = reversalPayrollUuid;
  }


  public PayrollReversal reason(String reason) {
    
    
    
    
    this.reason = reason;
    return this;
  }

   /**
   * A reason provided by the admin who created the reversal.
   * @return reason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A reason provided by the admin who created the reversal.")

  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    
    
    
    this.reason = reason;
  }


  public PayrollReversal approvedAt(String approvedAt) {
    
    
    
    
    this.approvedAt = approvedAt;
    return this;
  }

   /**
   * Timestamp of when the reversal was approved.
   * @return approvedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp of when the reversal was approved.")

  public String getApprovedAt() {
    return approvedAt;
  }


  public void setApprovedAt(String approvedAt) {
    
    
    
    this.approvedAt = approvedAt;
  }


  public PayrollReversal category(List<Integer> category) {
    
    
    
    
    this.category = category;
    return this;
  }

  public PayrollReversal addCategoryItem(Integer categoryItem) {
    if (this.category == null) {
      this.category = new ArrayList<>();
    }
    this.category.add(categoryItem);
    return this;
  }

   /**
   * Category chosen by the admin who requested the reversal.
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Category chosen by the admin who requested the reversal.")

  public List<Integer> getCategory() {
    return category;
  }


  public void setCategory(List<Integer> category) {
    
    
    
    this.category = category;
  }


  public PayrollReversal reversedEmployeeUuids(List<String> reversedEmployeeUuids) {
    
    
    
    
    this.reversedEmployeeUuids = reversedEmployeeUuids;
    return this;
  }

  public PayrollReversal addReversedEmployeeUuidsItem(String reversedEmployeeUuidsItem) {
    if (this.reversedEmployeeUuids == null) {
      this.reversedEmployeeUuids = new ArrayList<>();
    }
    this.reversedEmployeeUuids.add(reversedEmployeeUuidsItem);
    return this;
  }

   /**
   * Array of affected employee UUIDs.
   * @return reversedEmployeeUuids
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of affected employee UUIDs.")

  public List<String> getReversedEmployeeUuids() {
    return reversedEmployeeUuids;
  }


  public void setReversedEmployeeUuids(List<String> reversedEmployeeUuids) {
    
    
    
    this.reversedEmployeeUuids = reversedEmployeeUuids;
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
   * @return the PayrollReversal instance itself
   */
  public PayrollReversal putAdditionalProperty(String key, Object value) {
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
    PayrollReversal payrollReversal = (PayrollReversal) o;
    return Objects.equals(this.reversedPayrollUuid, payrollReversal.reversedPayrollUuid) &&
        Objects.equals(this.reversalPayrollUuid, payrollReversal.reversalPayrollUuid) &&
        Objects.equals(this.reason, payrollReversal.reason) &&
        Objects.equals(this.approvedAt, payrollReversal.approvedAt) &&
        Objects.equals(this.category, payrollReversal.category) &&
        Objects.equals(this.reversedEmployeeUuids, payrollReversal.reversedEmployeeUuids)&&
        Objects.equals(this.additionalProperties, payrollReversal.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(reversedPayrollUuid, reversalPayrollUuid, reason, approvedAt, category, reversedEmployeeUuids, additionalProperties);
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
    sb.append("class PayrollReversal {\n");
    sb.append("    reversedPayrollUuid: ").append(toIndentedString(reversedPayrollUuid)).append("\n");
    sb.append("    reversalPayrollUuid: ").append(toIndentedString(reversalPayrollUuid)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    approvedAt: ").append(toIndentedString(approvedAt)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    reversedEmployeeUuids: ").append(toIndentedString(reversedEmployeeUuids)).append("\n");
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
    openapiFields.add("reversed_payroll_uuid");
    openapiFields.add("reversal_payroll_uuid");
    openapiFields.add("reason");
    openapiFields.add("approved_at");
    openapiFields.add("category");
    openapiFields.add("reversed_employee_uuids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PayrollReversal
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PayrollReversal.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PayrollReversal is not found in the empty JSON string", PayrollReversal.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("reversed_payroll_uuid") != null && !jsonObj.get("reversed_payroll_uuid").isJsonNull()) && !jsonObj.get("reversed_payroll_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reversed_payroll_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reversed_payroll_uuid").toString()));
      }
      if ((jsonObj.get("reversal_payroll_uuid") != null && !jsonObj.get("reversal_payroll_uuid").isJsonNull()) && !jsonObj.get("reversal_payroll_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reversal_payroll_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reversal_payroll_uuid").toString()));
      }
      if ((jsonObj.get("reason") != null && !jsonObj.get("reason").isJsonNull()) && !jsonObj.get("reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason").toString()));
      }
      if (!jsonObj.get("approved_at").isJsonNull() && (jsonObj.get("approved_at") != null && !jsonObj.get("approved_at").isJsonNull()) && !jsonObj.get("approved_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `approved_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("approved_at").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("category") != null && !jsonObj.get("category").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `category` to be an array in the JSON string but got `%s`", jsonObj.get("category").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("reversed_employee_uuids") != null && !jsonObj.get("reversed_employee_uuids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `reversed_employee_uuids` to be an array in the JSON string but got `%s`", jsonObj.get("reversed_employee_uuids").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PayrollReversal.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PayrollReversal' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PayrollReversal> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PayrollReversal.class));

       return (TypeAdapter<T>) new TypeAdapter<PayrollReversal>() {
           @Override
           public void write(JsonWriter out, PayrollReversal value) throws IOException {
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
           public PayrollReversal read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PayrollReversal instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PayrollReversal given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PayrollReversal
  * @throws IOException if the JSON string is invalid with respect to PayrollReversal
  */
  public static PayrollReversal fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PayrollReversal.class);
  }

 /**
  * Convert an instance of PayrollReversal to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

