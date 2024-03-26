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
public class WebhooksCreateSubscriptionRequest {
  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  /**
   * Gets or Sets subscriptionTypes
   */
  @JsonAdapter(SubscriptionTypesEnum.Adapter.class)
 public enum SubscriptionTypesEnum {
    BANKACCOUNT("BankAccount"),
    
    COMPANY("Company"),
    
    COMPANYBENEFIT("CompanyBenefit"),
    
    CONTRACTOR("Contractor"),
    
    CONTRACTORPAYMENT("ContractorPayment"),
    
    EMPLOYEE("Employee"),
    
    EMPLOYEEBENEFIT("EmployeeBenefit"),
    
    EMPLOYEEJOBCOMPENSATION("EmployeeJobCompensation"),
    
    EXTERNALPAYROLL("ExternalPayroll"),
    
    FORM("Form"),
    
    LOCATION("Location"),
    
    NOTIFICATION("Notification"),
    
    PAYROLL("Payroll"),
    
    PAYSCHEDULE("PaySchedule"),
    
    SIGNATORY("Signatory");

    private String value;

    SubscriptionTypesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SubscriptionTypesEnum fromValue(String value) {
      for (SubscriptionTypesEnum b : SubscriptionTypesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SubscriptionTypesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SubscriptionTypesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SubscriptionTypesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SubscriptionTypesEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SUBSCRIPTION_TYPES = "subscription_types";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_TYPES)
  private List<SubscriptionTypesEnum> subscriptionTypes = new ArrayList<>();

  public WebhooksCreateSubscriptionRequest() {
  }

  public WebhooksCreateSubscriptionRequest url(String url) {
    
    
    
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    
    
    
    this.url = url;
  }


  public WebhooksCreateSubscriptionRequest subscriptionTypes(List<SubscriptionTypesEnum> subscriptionTypes) {
    
    
    
    
    this.subscriptionTypes = subscriptionTypes;
    return this;
  }

  public WebhooksCreateSubscriptionRequest addSubscriptionTypesItem(SubscriptionTypesEnum subscriptionTypesItem) {
    this.subscriptionTypes.add(subscriptionTypesItem);
    return this;
  }

   /**
   * Get subscriptionTypes
   * @return subscriptionTypes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<SubscriptionTypesEnum> getSubscriptionTypes() {
    return subscriptionTypes;
  }


  public void setSubscriptionTypes(List<SubscriptionTypesEnum> subscriptionTypes) {
    
    
    
    this.subscriptionTypes = subscriptionTypes;
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
   * @return the WebhooksCreateSubscriptionRequest instance itself
   */
  public WebhooksCreateSubscriptionRequest putAdditionalProperty(String key, Object value) {
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
    WebhooksCreateSubscriptionRequest webhooksCreateSubscriptionRequest = (WebhooksCreateSubscriptionRequest) o;
    return Objects.equals(this.url, webhooksCreateSubscriptionRequest.url) &&
        Objects.equals(this.subscriptionTypes, webhooksCreateSubscriptionRequest.subscriptionTypes)&&
        Objects.equals(this.additionalProperties, webhooksCreateSubscriptionRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, subscriptionTypes, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhooksCreateSubscriptionRequest {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    subscriptionTypes: ").append(toIndentedString(subscriptionTypes)).append("\n");
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
    openapiFields.add("url");
    openapiFields.add("subscription_types");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("url");
    openapiRequiredFields.add("subscription_types");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebhooksCreateSubscriptionRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebhooksCreateSubscriptionRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhooksCreateSubscriptionRequest is not found in the empty JSON string", WebhooksCreateSubscriptionRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WebhooksCreateSubscriptionRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("subscription_types") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("subscription_types").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscription_types` to be an array in the JSON string but got `%s`", jsonObj.get("subscription_types").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhooksCreateSubscriptionRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhooksCreateSubscriptionRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhooksCreateSubscriptionRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhooksCreateSubscriptionRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhooksCreateSubscriptionRequest>() {
           @Override
           public void write(JsonWriter out, WebhooksCreateSubscriptionRequest value) throws IOException {
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
           public WebhooksCreateSubscriptionRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WebhooksCreateSubscriptionRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WebhooksCreateSubscriptionRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebhooksCreateSubscriptionRequest
  * @throws IOException if the JSON string is invalid with respect to WebhooksCreateSubscriptionRequest
  */
  public static WebhooksCreateSubscriptionRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhooksCreateSubscriptionRequest.class);
  }

 /**
  * Convert an instance of WebhooksCreateSubscriptionRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

