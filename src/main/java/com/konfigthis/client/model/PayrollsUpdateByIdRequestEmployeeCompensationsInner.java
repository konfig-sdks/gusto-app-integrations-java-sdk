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
import com.konfigthis.client.model.PayrollsUpdateByIdRequestEmployeeCompensationsInnerFixedCompensationsInner;
import com.konfigthis.client.model.PayrollsUpdateByIdRequestEmployeeCompensationsInnerHourlyCompensationsInner;
import com.konfigthis.client.model.PayrollsUpdateByIdRequestEmployeeCompensationsInnerPaidTimeOffInner;
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
 * 
 */
@ApiModel(description = "")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PayrollsUpdateByIdRequestEmployeeCompensationsInner {
  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_EMPLOYEE_UUID = "employee_uuid";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_UUID)
  private String employeeUuid;

  public static final String SERIALIZED_NAME_EXCLUDED = "excluded";
  @SerializedName(SERIALIZED_NAME_EXCLUDED)
  private Boolean excluded;

  /**
   * The employee&#39;s compensation payment method. Invalid values will be ignored.
   */
  @JsonAdapter(PaymentMethodEnum.Adapter.class)
 public enum PaymentMethodEnum {
    DIRECT_DEPOSIT("Direct Deposit"),
    
    CHECK("Check");

    private String value;

    PaymentMethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PaymentMethodEnum fromValue(String value) {
      for (PaymentMethodEnum b : PaymentMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PaymentMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PaymentMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PaymentMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PaymentMethodEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PAYMENT_METHOD = "payment_method";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD)
  private PaymentMethodEnum paymentMethod;

  public static final String SERIALIZED_NAME_MEMO = "memo";
  @SerializedName(SERIALIZED_NAME_MEMO)
  private String memo;

  public static final String SERIALIZED_NAME_FIXED_COMPENSATIONS = "fixed_compensations";
  @SerializedName(SERIALIZED_NAME_FIXED_COMPENSATIONS)
  private List<PayrollsUpdateByIdRequestEmployeeCompensationsInnerFixedCompensationsInner> fixedCompensations = null;

  public static final String SERIALIZED_NAME_HOURLY_COMPENSATIONS = "hourly_compensations";
  @SerializedName(SERIALIZED_NAME_HOURLY_COMPENSATIONS)
  private List<PayrollsUpdateByIdRequestEmployeeCompensationsInnerHourlyCompensationsInner> hourlyCompensations = null;

  public static final String SERIALIZED_NAME_PAID_TIME_OFF = "paid_time_off";
  @SerializedName(SERIALIZED_NAME_PAID_TIME_OFF)
  private List<PayrollsUpdateByIdRequestEmployeeCompensationsInnerPaidTimeOffInner> paidTimeOff = null;

  public PayrollsUpdateByIdRequestEmployeeCompensationsInner() {
  }

  public PayrollsUpdateByIdRequestEmployeeCompensationsInner version(String version) {
    
    
    
    
    this.version = version;
    return this;
  }

   /**
   * The current version of this employee compensation from the prepared payroll. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field.
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The current version of this employee compensation from the prepared payroll. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field.")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    
    
    
    this.version = version;
  }


  public PayrollsUpdateByIdRequestEmployeeCompensationsInner employeeUuid(String employeeUuid) {
    
    
    
    
    this.employeeUuid = employeeUuid;
    return this;
  }

   /**
   * The UUID of the employee.
   * @return employeeUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The UUID of the employee.")

  public String getEmployeeUuid() {
    return employeeUuid;
  }


  public void setEmployeeUuid(String employeeUuid) {
    
    
    
    this.employeeUuid = employeeUuid;
  }


  public PayrollsUpdateByIdRequestEmployeeCompensationsInner excluded(Boolean excluded) {
    
    
    
    
    this.excluded = excluded;
    return this;
  }

   /**
   * This employee will be excluded from payroll calculation and will not be paid for the payroll.
   * @return excluded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This employee will be excluded from payroll calculation and will not be paid for the payroll.")

  public Boolean getExcluded() {
    return excluded;
  }


  public void setExcluded(Boolean excluded) {
    
    
    
    this.excluded = excluded;
  }


  public PayrollsUpdateByIdRequestEmployeeCompensationsInner paymentMethod(PaymentMethodEnum paymentMethod) {
    
    
    
    
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * The employee&#39;s compensation payment method. Invalid values will be ignored.
   * @return paymentMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The employee's compensation payment method. Invalid values will be ignored.")

  public PaymentMethodEnum getPaymentMethod() {
    return paymentMethod;
  }


  public void setPaymentMethod(PaymentMethodEnum paymentMethod) {
    
    
    
    this.paymentMethod = paymentMethod;
  }


  public PayrollsUpdateByIdRequestEmployeeCompensationsInner memo(String memo) {
    
    
    
    
    this.memo = memo;
    return this;
  }

   /**
   * Custom text that will be printed as a personal note to the employee on a paystub.
   * @return memo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Custom text that will be printed as a personal note to the employee on a paystub.")

  public String getMemo() {
    return memo;
  }


  public void setMemo(String memo) {
    
    
    
    this.memo = memo;
  }


  public PayrollsUpdateByIdRequestEmployeeCompensationsInner fixedCompensations(List<PayrollsUpdateByIdRequestEmployeeCompensationsInnerFixedCompensationsInner> fixedCompensations) {
    
    
    
    
    this.fixedCompensations = fixedCompensations;
    return this;
  }

  public PayrollsUpdateByIdRequestEmployeeCompensationsInner addFixedCompensationsItem(PayrollsUpdateByIdRequestEmployeeCompensationsInnerFixedCompensationsInner fixedCompensationsItem) {
    if (this.fixedCompensations == null) {
      this.fixedCompensations = new ArrayList<>();
    }
    this.fixedCompensations.add(fixedCompensationsItem);
    return this;
  }

   /**
   * Get fixedCompensations
   * @return fixedCompensations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<PayrollsUpdateByIdRequestEmployeeCompensationsInnerFixedCompensationsInner> getFixedCompensations() {
    return fixedCompensations;
  }


  public void setFixedCompensations(List<PayrollsUpdateByIdRequestEmployeeCompensationsInnerFixedCompensationsInner> fixedCompensations) {
    
    
    
    this.fixedCompensations = fixedCompensations;
  }


  public PayrollsUpdateByIdRequestEmployeeCompensationsInner hourlyCompensations(List<PayrollsUpdateByIdRequestEmployeeCompensationsInnerHourlyCompensationsInner> hourlyCompensations) {
    
    
    
    
    this.hourlyCompensations = hourlyCompensations;
    return this;
  }

  public PayrollsUpdateByIdRequestEmployeeCompensationsInner addHourlyCompensationsItem(PayrollsUpdateByIdRequestEmployeeCompensationsInnerHourlyCompensationsInner hourlyCompensationsItem) {
    if (this.hourlyCompensations == null) {
      this.hourlyCompensations = new ArrayList<>();
    }
    this.hourlyCompensations.add(hourlyCompensationsItem);
    return this;
  }

   /**
   * Get hourlyCompensations
   * @return hourlyCompensations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<PayrollsUpdateByIdRequestEmployeeCompensationsInnerHourlyCompensationsInner> getHourlyCompensations() {
    return hourlyCompensations;
  }


  public void setHourlyCompensations(List<PayrollsUpdateByIdRequestEmployeeCompensationsInnerHourlyCompensationsInner> hourlyCompensations) {
    
    
    
    this.hourlyCompensations = hourlyCompensations;
  }


  public PayrollsUpdateByIdRequestEmployeeCompensationsInner paidTimeOff(List<PayrollsUpdateByIdRequestEmployeeCompensationsInnerPaidTimeOffInner> paidTimeOff) {
    
    
    
    
    this.paidTimeOff = paidTimeOff;
    return this;
  }

  public PayrollsUpdateByIdRequestEmployeeCompensationsInner addPaidTimeOffItem(PayrollsUpdateByIdRequestEmployeeCompensationsInnerPaidTimeOffInner paidTimeOffItem) {
    if (this.paidTimeOff == null) {
      this.paidTimeOff = new ArrayList<>();
    }
    this.paidTimeOff.add(paidTimeOffItem);
    return this;
  }

   /**
   * An array of all paid time off the employee is eligible for this pay period. Each paid time off object can be the name or the specific policy_uuid.
   * @return paidTimeOff
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of all paid time off the employee is eligible for this pay period. Each paid time off object can be the name or the specific policy_uuid.")

  public List<PayrollsUpdateByIdRequestEmployeeCompensationsInnerPaidTimeOffInner> getPaidTimeOff() {
    return paidTimeOff;
  }


  public void setPaidTimeOff(List<PayrollsUpdateByIdRequestEmployeeCompensationsInnerPaidTimeOffInner> paidTimeOff) {
    
    
    
    this.paidTimeOff = paidTimeOff;
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
   * @return the PayrollsUpdateByIdRequestEmployeeCompensationsInner instance itself
   */
  public PayrollsUpdateByIdRequestEmployeeCompensationsInner putAdditionalProperty(String key, Object value) {
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
    PayrollsUpdateByIdRequestEmployeeCompensationsInner payrollsUpdateByIdRequestEmployeeCompensationsInner = (PayrollsUpdateByIdRequestEmployeeCompensationsInner) o;
    return Objects.equals(this.version, payrollsUpdateByIdRequestEmployeeCompensationsInner.version) &&
        Objects.equals(this.employeeUuid, payrollsUpdateByIdRequestEmployeeCompensationsInner.employeeUuid) &&
        Objects.equals(this.excluded, payrollsUpdateByIdRequestEmployeeCompensationsInner.excluded) &&
        Objects.equals(this.paymentMethod, payrollsUpdateByIdRequestEmployeeCompensationsInner.paymentMethod) &&
        Objects.equals(this.memo, payrollsUpdateByIdRequestEmployeeCompensationsInner.memo) &&
        Objects.equals(this.fixedCompensations, payrollsUpdateByIdRequestEmployeeCompensationsInner.fixedCompensations) &&
        Objects.equals(this.hourlyCompensations, payrollsUpdateByIdRequestEmployeeCompensationsInner.hourlyCompensations) &&
        Objects.equals(this.paidTimeOff, payrollsUpdateByIdRequestEmployeeCompensationsInner.paidTimeOff)&&
        Objects.equals(this.additionalProperties, payrollsUpdateByIdRequestEmployeeCompensationsInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, employeeUuid, excluded, paymentMethod, memo, fixedCompensations, hourlyCompensations, paidTimeOff, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayrollsUpdateByIdRequestEmployeeCompensationsInner {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    employeeUuid: ").append(toIndentedString(employeeUuid)).append("\n");
    sb.append("    excluded: ").append(toIndentedString(excluded)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    fixedCompensations: ").append(toIndentedString(fixedCompensations)).append("\n");
    sb.append("    hourlyCompensations: ").append(toIndentedString(hourlyCompensations)).append("\n");
    sb.append("    paidTimeOff: ").append(toIndentedString(paidTimeOff)).append("\n");
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
    openapiFields.add("employee_uuid");
    openapiFields.add("excluded");
    openapiFields.add("payment_method");
    openapiFields.add("memo");
    openapiFields.add("fixed_compensations");
    openapiFields.add("hourly_compensations");
    openapiFields.add("paid_time_off");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PayrollsUpdateByIdRequestEmployeeCompensationsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PayrollsUpdateByIdRequestEmployeeCompensationsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PayrollsUpdateByIdRequestEmployeeCompensationsInner is not found in the empty JSON string", PayrollsUpdateByIdRequestEmployeeCompensationsInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
      if ((jsonObj.get("employee_uuid") != null && !jsonObj.get("employee_uuid").isJsonNull()) && !jsonObj.get("employee_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employee_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employee_uuid").toString()));
      }
      if ((jsonObj.get("payment_method") != null && !jsonObj.get("payment_method").isJsonNull()) && !jsonObj.get("payment_method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_method").toString()));
      }
      if ((jsonObj.get("memo") != null && !jsonObj.get("memo").isJsonNull()) && !jsonObj.get("memo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `memo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("memo").toString()));
      }
      if (jsonObj.get("fixed_compensations") != null && !jsonObj.get("fixed_compensations").isJsonNull()) {
        JsonArray jsonArrayfixedCompensations = jsonObj.getAsJsonArray("fixed_compensations");
        if (jsonArrayfixedCompensations != null) {
          // ensure the json data is an array
          if (!jsonObj.get("fixed_compensations").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `fixed_compensations` to be an array in the JSON string but got `%s`", jsonObj.get("fixed_compensations").toString()));
          }

          // validate the optional field `fixed_compensations` (array)
          for (int i = 0; i < jsonArrayfixedCompensations.size(); i++) {
            PayrollsUpdateByIdRequestEmployeeCompensationsInnerFixedCompensationsInner.validateJsonObject(jsonArrayfixedCompensations.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("hourly_compensations") != null && !jsonObj.get("hourly_compensations").isJsonNull()) {
        JsonArray jsonArrayhourlyCompensations = jsonObj.getAsJsonArray("hourly_compensations");
        if (jsonArrayhourlyCompensations != null) {
          // ensure the json data is an array
          if (!jsonObj.get("hourly_compensations").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `hourly_compensations` to be an array in the JSON string but got `%s`", jsonObj.get("hourly_compensations").toString()));
          }

          // validate the optional field `hourly_compensations` (array)
          for (int i = 0; i < jsonArrayhourlyCompensations.size(); i++) {
            PayrollsUpdateByIdRequestEmployeeCompensationsInnerHourlyCompensationsInner.validateJsonObject(jsonArrayhourlyCompensations.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("paid_time_off") != null && !jsonObj.get("paid_time_off").isJsonNull()) {
        JsonArray jsonArraypaidTimeOff = jsonObj.getAsJsonArray("paid_time_off");
        if (jsonArraypaidTimeOff != null) {
          // ensure the json data is an array
          if (!jsonObj.get("paid_time_off").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `paid_time_off` to be an array in the JSON string but got `%s`", jsonObj.get("paid_time_off").toString()));
          }

          // validate the optional field `paid_time_off` (array)
          for (int i = 0; i < jsonArraypaidTimeOff.size(); i++) {
            PayrollsUpdateByIdRequestEmployeeCompensationsInnerPaidTimeOffInner.validateJsonObject(jsonArraypaidTimeOff.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PayrollsUpdateByIdRequestEmployeeCompensationsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PayrollsUpdateByIdRequestEmployeeCompensationsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PayrollsUpdateByIdRequestEmployeeCompensationsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PayrollsUpdateByIdRequestEmployeeCompensationsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PayrollsUpdateByIdRequestEmployeeCompensationsInner>() {
           @Override
           public void write(JsonWriter out, PayrollsUpdateByIdRequestEmployeeCompensationsInner value) throws IOException {
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
           public PayrollsUpdateByIdRequestEmployeeCompensationsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PayrollsUpdateByIdRequestEmployeeCompensationsInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PayrollsUpdateByIdRequestEmployeeCompensationsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PayrollsUpdateByIdRequestEmployeeCompensationsInner
  * @throws IOException if the JSON string is invalid with respect to PayrollsUpdateByIdRequestEmployeeCompensationsInner
  */
  public static PayrollsUpdateByIdRequestEmployeeCompensationsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PayrollsUpdateByIdRequestEmployeeCompensationsInner.class);
  }

 /**
  * Convert an instance of PayrollsUpdateByIdRequestEmployeeCompensationsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

