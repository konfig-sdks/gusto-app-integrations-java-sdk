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
import com.konfigthis.client.model.DepartmentsAddPeopleToDepartmentRequestEmployeesInner;
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
 * DepartmentsAddPeopleToDepartmentRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class DepartmentsAddPeopleToDepartmentRequest {
  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_EMPLOYEES = "employees";
  @SerializedName(SERIALIZED_NAME_EMPLOYEES)
  private List<DepartmentsAddPeopleToDepartmentRequestEmployeesInner> employees = null;

  public static final String SERIALIZED_NAME_CONTRACTORS = "contractors";
  @SerializedName(SERIALIZED_NAME_CONTRACTORS)
  private List<DepartmentsAddPeopleToDepartmentRequestEmployeesInner> contractors = null;

  public DepartmentsAddPeopleToDepartmentRequest() {
  }

  public DepartmentsAddPeopleToDepartmentRequest version(String version) {
    
    
    
    
    this.version = version;
    return this;
  }

   /**
   * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/versioning#object-layer) for information on how to use this field.
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/versioning#object-layer) for information on how to use this field.")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    
    
    
    this.version = version;
  }


  public DepartmentsAddPeopleToDepartmentRequest employees(List<DepartmentsAddPeopleToDepartmentRequestEmployeesInner> employees) {
    
    
    
    
    this.employees = employees;
    return this;
  }

  public DepartmentsAddPeopleToDepartmentRequest addEmployeesItem(DepartmentsAddPeopleToDepartmentRequestEmployeesInner employeesItem) {
    if (this.employees == null) {
      this.employees = new ArrayList<>();
    }
    this.employees.add(employeesItem);
    return this;
  }

   /**
   * Array of employees to add to the department
   * @return employees
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of employees to add to the department")

  public List<DepartmentsAddPeopleToDepartmentRequestEmployeesInner> getEmployees() {
    return employees;
  }


  public void setEmployees(List<DepartmentsAddPeopleToDepartmentRequestEmployeesInner> employees) {
    
    
    
    this.employees = employees;
  }


  public DepartmentsAddPeopleToDepartmentRequest contractors(List<DepartmentsAddPeopleToDepartmentRequestEmployeesInner> contractors) {
    
    
    
    
    this.contractors = contractors;
    return this;
  }

  public DepartmentsAddPeopleToDepartmentRequest addContractorsItem(DepartmentsAddPeopleToDepartmentRequestEmployeesInner contractorsItem) {
    if (this.contractors == null) {
      this.contractors = new ArrayList<>();
    }
    this.contractors.add(contractorsItem);
    return this;
  }

   /**
   * Array of contractors to add to the department
   * @return contractors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of contractors to add to the department")

  public List<DepartmentsAddPeopleToDepartmentRequestEmployeesInner> getContractors() {
    return contractors;
  }


  public void setContractors(List<DepartmentsAddPeopleToDepartmentRequestEmployeesInner> contractors) {
    
    
    
    this.contractors = contractors;
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
   * @return the DepartmentsAddPeopleToDepartmentRequest instance itself
   */
  public DepartmentsAddPeopleToDepartmentRequest putAdditionalProperty(String key, Object value) {
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
    DepartmentsAddPeopleToDepartmentRequest departmentsAddPeopleToDepartmentRequest = (DepartmentsAddPeopleToDepartmentRequest) o;
    return Objects.equals(this.version, departmentsAddPeopleToDepartmentRequest.version) &&
        Objects.equals(this.employees, departmentsAddPeopleToDepartmentRequest.employees) &&
        Objects.equals(this.contractors, departmentsAddPeopleToDepartmentRequest.contractors)&&
        Objects.equals(this.additionalProperties, departmentsAddPeopleToDepartmentRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, employees, contractors, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepartmentsAddPeopleToDepartmentRequest {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    employees: ").append(toIndentedString(employees)).append("\n");
    sb.append("    contractors: ").append(toIndentedString(contractors)).append("\n");
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
    openapiFields.add("employees");
    openapiFields.add("contractors");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DepartmentsAddPeopleToDepartmentRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DepartmentsAddPeopleToDepartmentRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DepartmentsAddPeopleToDepartmentRequest is not found in the empty JSON string", DepartmentsAddPeopleToDepartmentRequest.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
      if (jsonObj.get("employees") != null && !jsonObj.get("employees").isJsonNull()) {
        JsonArray jsonArrayemployees = jsonObj.getAsJsonArray("employees");
        if (jsonArrayemployees != null) {
          // ensure the json data is an array
          if (!jsonObj.get("employees").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `employees` to be an array in the JSON string but got `%s`", jsonObj.get("employees").toString()));
          }

          // validate the optional field `employees` (array)
          for (int i = 0; i < jsonArrayemployees.size(); i++) {
            DepartmentsAddPeopleToDepartmentRequestEmployeesInner.validateJsonObject(jsonArrayemployees.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("contractors") != null && !jsonObj.get("contractors").isJsonNull()) {
        JsonArray jsonArraycontractors = jsonObj.getAsJsonArray("contractors");
        if (jsonArraycontractors != null) {
          // ensure the json data is an array
          if (!jsonObj.get("contractors").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `contractors` to be an array in the JSON string but got `%s`", jsonObj.get("contractors").toString()));
          }

          // validate the optional field `contractors` (array)
          for (int i = 0; i < jsonArraycontractors.size(); i++) {
            DepartmentsAddPeopleToDepartmentRequestEmployeesInner.validateJsonObject(jsonArraycontractors.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DepartmentsAddPeopleToDepartmentRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DepartmentsAddPeopleToDepartmentRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DepartmentsAddPeopleToDepartmentRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DepartmentsAddPeopleToDepartmentRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<DepartmentsAddPeopleToDepartmentRequest>() {
           @Override
           public void write(JsonWriter out, DepartmentsAddPeopleToDepartmentRequest value) throws IOException {
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
           public DepartmentsAddPeopleToDepartmentRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             DepartmentsAddPeopleToDepartmentRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of DepartmentsAddPeopleToDepartmentRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DepartmentsAddPeopleToDepartmentRequest
  * @throws IOException if the JSON string is invalid with respect to DepartmentsAddPeopleToDepartmentRequest
  */
  public static DepartmentsAddPeopleToDepartmentRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DepartmentsAddPeopleToDepartmentRequest.class);
  }

 /**
  * Convert an instance of DepartmentsAddPeopleToDepartmentRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

