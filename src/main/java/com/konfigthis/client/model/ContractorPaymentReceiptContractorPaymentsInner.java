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
 * ContractorPaymentReceiptContractorPaymentsInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ContractorPaymentReceiptContractorPaymentsInner {
  public static final String SERIALIZED_NAME_CONTRACTOR_UUID = "contractor_uuid";
  @SerializedName(SERIALIZED_NAME_CONTRACTOR_UUID)
  private String contractorUuid;

  public static final String SERIALIZED_NAME_CONTRACTOR_FIRST_NAME = "contractor_first_name";
  @SerializedName(SERIALIZED_NAME_CONTRACTOR_FIRST_NAME)
  private String contractorFirstName;

  public static final String SERIALIZED_NAME_CONTRACTOR_LAST_NAME = "contractor_last_name";
  @SerializedName(SERIALIZED_NAME_CONTRACTOR_LAST_NAME)
  private String contractorLastName;

  public static final String SERIALIZED_NAME_CONTRACTOR_BUSINESS_NAME = "contractor_business_name";
  @SerializedName(SERIALIZED_NAME_CONTRACTOR_BUSINESS_NAME)
  private String contractorBusinessName;

  public static final String SERIALIZED_NAME_CONTRACTOR_TYPE = "contractor_type";
  @SerializedName(SERIALIZED_NAME_CONTRACTOR_TYPE)
  private String contractorType;

  public static final String SERIALIZED_NAME_PAYMENT_METHOD = "payment_method";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD)
  private String paymentMethod;

  public static final String SERIALIZED_NAME_WAGE = "wage";
  @SerializedName(SERIALIZED_NAME_WAGE)
  private String wage;

  public static final String SERIALIZED_NAME_BONUS = "bonus";
  @SerializedName(SERIALIZED_NAME_BONUS)
  private String bonus;

  public static final String SERIALIZED_NAME_REIMBURSEMENT = "reimbursement";
  @SerializedName(SERIALIZED_NAME_REIMBURSEMENT)
  private String reimbursement;

  public ContractorPaymentReceiptContractorPaymentsInner() {
  }

  public ContractorPaymentReceiptContractorPaymentsInner contractorUuid(String contractorUuid) {
    
    
    
    
    this.contractorUuid = contractorUuid;
    return this;
  }

   /**
   * The UUID of the contractor.
   * @return contractorUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The UUID of the contractor.")

  public String getContractorUuid() {
    return contractorUuid;
  }


  public void setContractorUuid(String contractorUuid) {
    
    
    
    this.contractorUuid = contractorUuid;
  }


  public ContractorPaymentReceiptContractorPaymentsInner contractorFirstName(String contractorFirstName) {
    
    
    
    
    this.contractorFirstName = contractorFirstName;
    return this;
  }

   /**
   * The first name of the contractor. Applies when &#x60;contractor_type&#x60; is &#x60;Individual&#x60;.
   * @return contractorFirstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The first name of the contractor. Applies when `contractor_type` is `Individual`.")

  public String getContractorFirstName() {
    return contractorFirstName;
  }


  public void setContractorFirstName(String contractorFirstName) {
    
    
    
    this.contractorFirstName = contractorFirstName;
  }


  public ContractorPaymentReceiptContractorPaymentsInner contractorLastName(String contractorLastName) {
    
    
    
    
    this.contractorLastName = contractorLastName;
    return this;
  }

   /**
   * The last name of the contractor.  Applies when &#x60;contractor_type&#x60; is &#x60;Individual&#x60;.
   * @return contractorLastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The last name of the contractor.  Applies when `contractor_type` is `Individual`.")

  public String getContractorLastName() {
    return contractorLastName;
  }


  public void setContractorLastName(String contractorLastName) {
    
    
    
    this.contractorLastName = contractorLastName;
  }


  public ContractorPaymentReceiptContractorPaymentsInner contractorBusinessName(String contractorBusinessName) {
    
    
    
    
    this.contractorBusinessName = contractorBusinessName;
    return this;
  }

   /**
   * The business name of the employee. Applies when &#x60;contractor_type&#x60; is &#x60;Business&#x60;.
   * @return contractorBusinessName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The business name of the employee. Applies when `contractor_type` is `Business`.")

  public String getContractorBusinessName() {
    return contractorBusinessName;
  }


  public void setContractorBusinessName(String contractorBusinessName) {
    
    
    
    this.contractorBusinessName = contractorBusinessName;
  }


  public ContractorPaymentReceiptContractorPaymentsInner contractorType(String contractorType) {
    
    
    
    
    this.contractorType = contractorType;
    return this;
  }

   /**
   * The type of contractor.  &#x60;Individual&#x60; &#x60;Business&#x60;
   * @return contractorType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of contractor.  `Individual` `Business`")

  public String getContractorType() {
    return contractorType;
  }


  public void setContractorType(String contractorType) {
    
    
    
    this.contractorType = contractorType;
  }


  public ContractorPaymentReceiptContractorPaymentsInner paymentMethod(String paymentMethod) {
    
    
    
    
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * The payment method.  &#x60;Direct Deposit&#x60; &#x60;Check&#x60; &#x60;Historical Payment&#x60; &#x60;Correction Payment&#x60;
   * @return paymentMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The payment method.  `Direct Deposit` `Check` `Historical Payment` `Correction Payment`")

  public String getPaymentMethod() {
    return paymentMethod;
  }


  public void setPaymentMethod(String paymentMethod) {
    
    
    
    this.paymentMethod = paymentMethod;
  }


  public ContractorPaymentReceiptContractorPaymentsInner wage(String wage) {
    
    
    
    
    this.wage = wage;
    return this;
  }

   /**
   * The fixed wage of the payment, regardless of hours worked.
   * @return wage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The fixed wage of the payment, regardless of hours worked.")

  public String getWage() {
    return wage;
  }


  public void setWage(String wage) {
    
    
    
    this.wage = wage;
  }


  public ContractorPaymentReceiptContractorPaymentsInner bonus(String bonus) {
    
    
    
    
    this.bonus = bonus;
    return this;
  }

   /**
   * The bonus amount in the payment.
   * @return bonus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The bonus amount in the payment.")

  public String getBonus() {
    return bonus;
  }


  public void setBonus(String bonus) {
    
    
    
    this.bonus = bonus;
  }


  public ContractorPaymentReceiptContractorPaymentsInner reimbursement(String reimbursement) {
    
    
    
    
    this.reimbursement = reimbursement;
    return this;
  }

   /**
   * The reimbursement amount in the payment.
   * @return reimbursement
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The reimbursement amount in the payment.")

  public String getReimbursement() {
    return reimbursement;
  }


  public void setReimbursement(String reimbursement) {
    
    
    
    this.reimbursement = reimbursement;
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
   * @return the ContractorPaymentReceiptContractorPaymentsInner instance itself
   */
  public ContractorPaymentReceiptContractorPaymentsInner putAdditionalProperty(String key, Object value) {
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
    ContractorPaymentReceiptContractorPaymentsInner contractorPaymentReceiptContractorPaymentsInner = (ContractorPaymentReceiptContractorPaymentsInner) o;
    return Objects.equals(this.contractorUuid, contractorPaymentReceiptContractorPaymentsInner.contractorUuid) &&
        Objects.equals(this.contractorFirstName, contractorPaymentReceiptContractorPaymentsInner.contractorFirstName) &&
        Objects.equals(this.contractorLastName, contractorPaymentReceiptContractorPaymentsInner.contractorLastName) &&
        Objects.equals(this.contractorBusinessName, contractorPaymentReceiptContractorPaymentsInner.contractorBusinessName) &&
        Objects.equals(this.contractorType, contractorPaymentReceiptContractorPaymentsInner.contractorType) &&
        Objects.equals(this.paymentMethod, contractorPaymentReceiptContractorPaymentsInner.paymentMethod) &&
        Objects.equals(this.wage, contractorPaymentReceiptContractorPaymentsInner.wage) &&
        Objects.equals(this.bonus, contractorPaymentReceiptContractorPaymentsInner.bonus) &&
        Objects.equals(this.reimbursement, contractorPaymentReceiptContractorPaymentsInner.reimbursement)&&
        Objects.equals(this.additionalProperties, contractorPaymentReceiptContractorPaymentsInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractorUuid, contractorFirstName, contractorLastName, contractorBusinessName, contractorType, paymentMethod, wage, bonus, reimbursement, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractorPaymentReceiptContractorPaymentsInner {\n");
    sb.append("    contractorUuid: ").append(toIndentedString(contractorUuid)).append("\n");
    sb.append("    contractorFirstName: ").append(toIndentedString(contractorFirstName)).append("\n");
    sb.append("    contractorLastName: ").append(toIndentedString(contractorLastName)).append("\n");
    sb.append("    contractorBusinessName: ").append(toIndentedString(contractorBusinessName)).append("\n");
    sb.append("    contractorType: ").append(toIndentedString(contractorType)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    wage: ").append(toIndentedString(wage)).append("\n");
    sb.append("    bonus: ").append(toIndentedString(bonus)).append("\n");
    sb.append("    reimbursement: ").append(toIndentedString(reimbursement)).append("\n");
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
    openapiFields.add("contractor_uuid");
    openapiFields.add("contractor_first_name");
    openapiFields.add("contractor_last_name");
    openapiFields.add("contractor_business_name");
    openapiFields.add("contractor_type");
    openapiFields.add("payment_method");
    openapiFields.add("wage");
    openapiFields.add("bonus");
    openapiFields.add("reimbursement");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ContractorPaymentReceiptContractorPaymentsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ContractorPaymentReceiptContractorPaymentsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContractorPaymentReceiptContractorPaymentsInner is not found in the empty JSON string", ContractorPaymentReceiptContractorPaymentsInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("contractor_uuid") != null && !jsonObj.get("contractor_uuid").isJsonNull()) && !jsonObj.get("contractor_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contractor_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contractor_uuid").toString()));
      }
      if ((jsonObj.get("contractor_first_name") != null && !jsonObj.get("contractor_first_name").isJsonNull()) && !jsonObj.get("contractor_first_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contractor_first_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contractor_first_name").toString()));
      }
      if ((jsonObj.get("contractor_last_name") != null && !jsonObj.get("contractor_last_name").isJsonNull()) && !jsonObj.get("contractor_last_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contractor_last_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contractor_last_name").toString()));
      }
      if ((jsonObj.get("contractor_business_name") != null && !jsonObj.get("contractor_business_name").isJsonNull()) && !jsonObj.get("contractor_business_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contractor_business_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contractor_business_name").toString()));
      }
      if ((jsonObj.get("contractor_type") != null && !jsonObj.get("contractor_type").isJsonNull()) && !jsonObj.get("contractor_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contractor_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contractor_type").toString()));
      }
      if ((jsonObj.get("payment_method") != null && !jsonObj.get("payment_method").isJsonNull()) && !jsonObj.get("payment_method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_method").toString()));
      }
      if ((jsonObj.get("wage") != null && !jsonObj.get("wage").isJsonNull()) && !jsonObj.get("wage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `wage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("wage").toString()));
      }
      if ((jsonObj.get("bonus") != null && !jsonObj.get("bonus").isJsonNull()) && !jsonObj.get("bonus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bonus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bonus").toString()));
      }
      if ((jsonObj.get("reimbursement") != null && !jsonObj.get("reimbursement").isJsonNull()) && !jsonObj.get("reimbursement").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reimbursement` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reimbursement").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContractorPaymentReceiptContractorPaymentsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContractorPaymentReceiptContractorPaymentsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContractorPaymentReceiptContractorPaymentsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContractorPaymentReceiptContractorPaymentsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ContractorPaymentReceiptContractorPaymentsInner>() {
           @Override
           public void write(JsonWriter out, ContractorPaymentReceiptContractorPaymentsInner value) throws IOException {
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
           public ContractorPaymentReceiptContractorPaymentsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ContractorPaymentReceiptContractorPaymentsInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ContractorPaymentReceiptContractorPaymentsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ContractorPaymentReceiptContractorPaymentsInner
  * @throws IOException if the JSON string is invalid with respect to ContractorPaymentReceiptContractorPaymentsInner
  */
  public static ContractorPaymentReceiptContractorPaymentsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContractorPaymentReceiptContractorPaymentsInner.class);
  }

 /**
  * Convert an instance of ContractorPaymentReceiptContractorPaymentsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

