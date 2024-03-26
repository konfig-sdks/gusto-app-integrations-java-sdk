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
 * 
 */
@ApiModel(description = "")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SupportedBenefit {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_BENEFIT_TYPE = "benefit_type";
  @SerializedName(SERIALIZED_NAME_BENEFIT_TYPE)
  private Double benefitType;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PRETAX = "pretax";
  @SerializedName(SERIALIZED_NAME_PRETAX)
  private Boolean pretax;

  public static final String SERIALIZED_NAME_POSTTAX = "posttax";
  @SerializedName(SERIALIZED_NAME_POSTTAX)
  private Boolean posttax;

  public static final String SERIALIZED_NAME_IMPUTED = "imputed";
  @SerializedName(SERIALIZED_NAME_IMPUTED)
  private Boolean imputed;

  public static final String SERIALIZED_NAME_HEALTHCARE = "healthcare";
  @SerializedName(SERIALIZED_NAME_HEALTHCARE)
  private Boolean healthcare;

  public static final String SERIALIZED_NAME_RETIREMENT = "retirement";
  @SerializedName(SERIALIZED_NAME_RETIREMENT)
  private Boolean retirement;

  public static final String SERIALIZED_NAME_YEARLY_LIMIT = "yearly_limit";
  @SerializedName(SERIALIZED_NAME_YEARLY_LIMIT)
  private Boolean yearlyLimit;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public SupportedBenefit() {
  }

  
  public SupportedBenefit(
     String description, 
     Double benefitType, 
     String name, 
     Boolean pretax, 
     Boolean posttax, 
     Boolean imputed, 
     Boolean healthcare, 
     Boolean retirement, 
     Boolean yearlyLimit, 
     String category
  ) {
    this();
    this.description = description;
    this.benefitType = benefitType;
    this.name = name;
    this.pretax = pretax;
    this.posttax = posttax;
    this.imputed = imputed;
    this.healthcare = healthcare;
    this.retirement = retirement;
    this.yearlyLimit = yearlyLimit;
    this.category = category;
  }

   /**
   * The description of the benefit.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Deductions and contributions for Medical Insurance", value = "The description of the benefit.")

  public String getDescription() {
    return description;
  }




   /**
   * The benefit type in Gusto.
   * @return benefitType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "The benefit type in Gusto.")

  public Double getBenefitType() {
    return benefitType;
  }




   /**
   * The name of the benefit.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Medical Insurance", value = "The name of the benefit.")

  public String getName() {
    return name;
  }




   /**
   * Whether the benefit is deducted before tax calculations, thus reducing one’s taxable income
   * @return pretax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether the benefit is deducted before tax calculations, thus reducing one’s taxable income")

  public Boolean getPretax() {
    return pretax;
  }




   /**
   * Whether the benefit is deducted after tax calculations.
   * @return posttax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Whether the benefit is deducted after tax calculations.")

  public Boolean getPosttax() {
    return posttax;
  }




   /**
   * Whether the benefit is considered imputed income.
   * @return imputed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Whether the benefit is considered imputed income.")

  public Boolean getImputed() {
    return imputed;
  }




   /**
   * Whether the benefit is healthcare related.
   * @return healthcare
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether the benefit is healthcare related.")

  public Boolean getHealthcare() {
    return healthcare;
  }




   /**
   * Whether the benefit is associated with retirement planning.
   * @return retirement
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Whether the benefit is associated with retirement planning.")

  public Boolean getRetirement() {
    return retirement;
  }




   /**
   * Whether the benefit has a government mandated yearly limit.
   * @return yearlyLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Whether the benefit has a government mandated yearly limit.")

  public Boolean getYearlyLimit() {
    return yearlyLimit;
  }




   /**
   * Category where the benefit belongs to.
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Health", value = "Category where the benefit belongs to.")

  public String getCategory() {
    return category;
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
   * @return the SupportedBenefit instance itself
   */
  public SupportedBenefit putAdditionalProperty(String key, Object value) {
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
    SupportedBenefit supportedBenefit = (SupportedBenefit) o;
    return Objects.equals(this.description, supportedBenefit.description) &&
        Objects.equals(this.benefitType, supportedBenefit.benefitType) &&
        Objects.equals(this.name, supportedBenefit.name) &&
        Objects.equals(this.pretax, supportedBenefit.pretax) &&
        Objects.equals(this.posttax, supportedBenefit.posttax) &&
        Objects.equals(this.imputed, supportedBenefit.imputed) &&
        Objects.equals(this.healthcare, supportedBenefit.healthcare) &&
        Objects.equals(this.retirement, supportedBenefit.retirement) &&
        Objects.equals(this.yearlyLimit, supportedBenefit.yearlyLimit) &&
        Objects.equals(this.category, supportedBenefit.category)&&
        Objects.equals(this.additionalProperties, supportedBenefit.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, benefitType, name, pretax, posttax, imputed, healthcare, retirement, yearlyLimit, category, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupportedBenefit {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    benefitType: ").append(toIndentedString(benefitType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pretax: ").append(toIndentedString(pretax)).append("\n");
    sb.append("    posttax: ").append(toIndentedString(posttax)).append("\n");
    sb.append("    imputed: ").append(toIndentedString(imputed)).append("\n");
    sb.append("    healthcare: ").append(toIndentedString(healthcare)).append("\n");
    sb.append("    retirement: ").append(toIndentedString(retirement)).append("\n");
    sb.append("    yearlyLimit: ").append(toIndentedString(yearlyLimit)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("benefit_type");
    openapiFields.add("name");
    openapiFields.add("pretax");
    openapiFields.add("posttax");
    openapiFields.add("imputed");
    openapiFields.add("healthcare");
    openapiFields.add("retirement");
    openapiFields.add("yearly_limit");
    openapiFields.add("category");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SupportedBenefit
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SupportedBenefit.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SupportedBenefit is not found in the empty JSON string", SupportedBenefit.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("category") != null && !jsonObj.get("category").isJsonNull()) && !jsonObj.get("category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SupportedBenefit.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SupportedBenefit' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SupportedBenefit> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SupportedBenefit.class));

       return (TypeAdapter<T>) new TypeAdapter<SupportedBenefit>() {
           @Override
           public void write(JsonWriter out, SupportedBenefit value) throws IOException {
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
           public SupportedBenefit read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SupportedBenefit instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SupportedBenefit given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SupportedBenefit
  * @throws IOException if the JSON string is invalid with respect to SupportedBenefit
  */
  public static SupportedBenefit fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SupportedBenefit.class);
  }

 /**
  * Convert an instance of SupportedBenefit to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

