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
import com.konfigthis.client.model.OnboardingStep;
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
 * The representation of an employee&#39;s onboarding status.
 */
@ApiModel(description = "The representation of an employee's onboarding status.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class EmployeeOnboardingStatus {
  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid;

  public static final String SERIALIZED_NAME_ONBOARDING_STATUS = "onboarding_status";
  @SerializedName(SERIALIZED_NAME_ONBOARDING_STATUS)
  private String onboardingStatus;

  public static final String SERIALIZED_NAME_ONBOARDING_STEPS = "onboarding_steps";
  @SerializedName(SERIALIZED_NAME_ONBOARDING_STEPS)
  private List<OnboardingStep> onboardingSteps = null;

  public EmployeeOnboardingStatus() {
  }

  public EmployeeOnboardingStatus uuid(String uuid) {
    
    
    
    
    this.uuid = uuid;
    return this;
  }

   /**
   * Unique identifier for this employee.
   * @return uuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "c44d66dc-c41b-4a60-9e25-5e93ff8583f2", value = "Unique identifier for this employee.")

  public String getUuid() {
    return uuid;
  }


  public void setUuid(String uuid) {
    
    
    
    this.uuid = uuid;
  }


  public EmployeeOnboardingStatus onboardingStatus(String onboardingStatus) {
    
    
    
    
    this.onboardingStatus = onboardingStatus;
    return this;
  }

   /**
   * One of the \&quot;onboarding_status\&quot; enum values.
   * @return onboardingStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "admin_onboarding_incomplete", value = "One of the \"onboarding_status\" enum values.")

  public String getOnboardingStatus() {
    return onboardingStatus;
  }


  public void setOnboardingStatus(String onboardingStatus) {
    
    
    
    this.onboardingStatus = onboardingStatus;
  }


  public EmployeeOnboardingStatus onboardingSteps(List<OnboardingStep> onboardingSteps) {
    
    
    
    
    this.onboardingSteps = onboardingSteps;
    return this;
  }

  public EmployeeOnboardingStatus addOnboardingStepsItem(OnboardingStep onboardingStepsItem) {
    if (this.onboardingSteps == null) {
      this.onboardingSteps = new ArrayList<>();
    }
    this.onboardingSteps.add(onboardingStepsItem);
    return this;
  }

   /**
   * List of steps required to onboard an employee.
   * @return onboardingSteps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of steps required to onboard an employee.")

  public List<OnboardingStep> getOnboardingSteps() {
    return onboardingSteps;
  }


  public void setOnboardingSteps(List<OnboardingStep> onboardingSteps) {
    
    
    
    this.onboardingSteps = onboardingSteps;
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
   * @return the EmployeeOnboardingStatus instance itself
   */
  public EmployeeOnboardingStatus putAdditionalProperty(String key, Object value) {
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
    EmployeeOnboardingStatus employeeOnboardingStatus = (EmployeeOnboardingStatus) o;
    return Objects.equals(this.uuid, employeeOnboardingStatus.uuid) &&
        Objects.equals(this.onboardingStatus, employeeOnboardingStatus.onboardingStatus) &&
        Objects.equals(this.onboardingSteps, employeeOnboardingStatus.onboardingSteps)&&
        Objects.equals(this.additionalProperties, employeeOnboardingStatus.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, onboardingStatus, onboardingSteps, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeOnboardingStatus {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    onboardingStatus: ").append(toIndentedString(onboardingStatus)).append("\n");
    sb.append("    onboardingSteps: ").append(toIndentedString(onboardingSteps)).append("\n");
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
    openapiFields.add("uuid");
    openapiFields.add("onboarding_status");
    openapiFields.add("onboarding_steps");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EmployeeOnboardingStatus
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EmployeeOnboardingStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmployeeOnboardingStatus is not found in the empty JSON string", EmployeeOnboardingStatus.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonNull()) && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      if ((jsonObj.get("onboarding_status") != null && !jsonObj.get("onboarding_status").isJsonNull()) && !jsonObj.get("onboarding_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `onboarding_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("onboarding_status").toString()));
      }
      if (jsonObj.get("onboarding_steps") != null && !jsonObj.get("onboarding_steps").isJsonNull()) {
        JsonArray jsonArrayonboardingSteps = jsonObj.getAsJsonArray("onboarding_steps");
        if (jsonArrayonboardingSteps != null) {
          // ensure the json data is an array
          if (!jsonObj.get("onboarding_steps").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `onboarding_steps` to be an array in the JSON string but got `%s`", jsonObj.get("onboarding_steps").toString()));
          }

          // validate the optional field `onboarding_steps` (array)
          for (int i = 0; i < jsonArrayonboardingSteps.size(); i++) {
            OnboardingStep.validateJsonObject(jsonArrayonboardingSteps.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmployeeOnboardingStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmployeeOnboardingStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmployeeOnboardingStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmployeeOnboardingStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<EmployeeOnboardingStatus>() {
           @Override
           public void write(JsonWriter out, EmployeeOnboardingStatus value) throws IOException {
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
           public EmployeeOnboardingStatus read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EmployeeOnboardingStatus instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EmployeeOnboardingStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EmployeeOnboardingStatus
  * @throws IOException if the JSON string is invalid with respect to EmployeeOnboardingStatus
  */
  public static EmployeeOnboardingStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmployeeOnboardingStatus.class);
  }

 /**
  * Convert an instance of EmployeeOnboardingStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

