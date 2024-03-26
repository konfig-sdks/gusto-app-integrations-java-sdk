# ContractorsApi

All URIs are relative to *https://api.gusto-demo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createIndividualOrBusiness**](ContractorsApi.md#createIndividualOrBusiness) | **POST** /v1/companies/{company_id}/contractors | Create a contractor |
| [**getAll**](ContractorsApi.md#getAll) | **GET** /v1/companies/{company_id}/contractors | Get contractors of a company |
| [**getDetails**](ContractorsApi.md#getDetails) | **GET** /v1/contractors/{contractor_id} | Get a contractor |
| [**updateContractor**](ContractorsApi.md#updateContractor) | **PUT** /v1/contractors/{contractor_id} | Update a contractor |


<a name="createIndividualOrBusiness"></a>
# **createIndividualOrBusiness**
> Contractor createIndividualOrBusiness(companyId).xGustoAPIVersion(xGustoAPIVersion).contractorsCreateIndividualOrBusinessRequest(contractorsCreateIndividualOrBusinessRequest).execute();

Create a contractor

Create an individual or business contractor.  scope: &#x60;contractors:manage&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoAppIntegrations;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContractorsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.gusto-demo.com";
    
    // Configure HTTP bearer authorization: Authorization
    configuration.token = "BEARER TOKEN";
    GustoAppIntegrations client = new GustoAppIntegrations(configuration);
    String companyId = "companyId_example"; // The UUID of the company
    String type = "Individual"; // The contractor type.
    String wageType = "Fixed"; // The contractor’s wage type. 
    String startDate = "startDate_example"; // The day when the contractor will start working for the company. 
    String hourlyRate = "hourlyRate_example"; // The contractor’s hourly rate. This attribute is required if the wage_type is `Hourly`.
    Boolean selfOnboarding = false; // Whether the contractor or the payroll admin will complete onboarding in Gusto. Self-onboarding is recommended so that contractors receive Gusto accounts. If self_onboarding is true, then email is required.
    String email = "email_example"; // The contractor’s email address.
    String firstName = "firstName_example"; // The contractor’s first name. This attribute is required for `Individual` contractors and will be ignored for `Business` contractors.
    String lastName = "lastName_example"; // The contractor’s last name. This attribute is required for `Individual` contractors and will be ignored for `Business` contractors.
    String middleInitial = "middleInitial_example"; // The contractor’s middle initial. This attribute is optional for `Individual` contractors and will be ignored for `Business` contractors.
    Boolean fileNewHireReport = false; // The boolean flag indicating whether Gusto will file a new hire report for the contractor. This attribute is optional for `Individual` contractors and will be ignored for `Business` contractors.
    String workState = "workState_example"; // State where the contractor will be conducting the majority of their work for the company. This value is used when generating the new hire report. This attribute is required for `Individual` contractors if `file_new_hire_report` is true and will be ignored for `Business` contractors.
    String ssn = "ssn_example"; // This attribute is optional for `Individual` contractors and will be ignored for `Business` contractors. Social security number is needed to file the annual 1099 tax form.
    String businessName = "businessName_example"; // The name of the contractor business. This attribute is required for `Business` contractors and will be ignored for `Individual` contractors.
    String ein = "ein_example"; // The employer identification number of the contractor business. This attribute is optional for `Business` contractors and will be ignored for `Individual` contractors.
    Boolean isActive = true; // The status of the contractor.
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      Contractor result = client
              .contractors
              .createIndividualOrBusiness(companyId)
              .type(type)
              .wageType(wageType)
              .startDate(startDate)
              .hourlyRate(hourlyRate)
              .selfOnboarding(selfOnboarding)
              .email(email)
              .firstName(firstName)
              .lastName(lastName)
              .middleInitial(middleInitial)
              .fileNewHireReport(fileNewHireReport)
              .workState(workState)
              .ssn(ssn)
              .businessName(businessName)
              .ein(ein)
              .isActive(isActive)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getVersion());
      System.out.println(result.getUuid());
      System.out.println(result.getCompanyUuid());
      System.out.println(result.getWageType());
      System.out.println(result.getIsActive());
      System.out.println(result.getType());
      System.out.println(result.getFirstName());
      System.out.println(result.getLastName());
      System.out.println(result.getMiddleInitial());
      System.out.println(result.getBusinessName());
      System.out.println(result.getEin());
      System.out.println(result.getHasEin());
      System.out.println(result.getEmail());
      System.out.println(result.getStartDate());
      System.out.println(result.getAddress());
      System.out.println(result.getHourlyRate());
      System.out.println(result.getFileNewHireReport());
      System.out.println(result.getWorkState());
      System.out.println(result.getOnboarded());
      System.out.println(result.getOnboardingStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractorsApi#createIndividualOrBusiness");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Contractor> response = client
              .contractors
              .createIndividualOrBusiness(companyId)
              .type(type)
              .wageType(wageType)
              .startDate(startDate)
              .hourlyRate(hourlyRate)
              .selfOnboarding(selfOnboarding)
              .email(email)
              .firstName(firstName)
              .lastName(lastName)
              .middleInitial(middleInitial)
              .fileNewHireReport(fileNewHireReport)
              .workState(workState)
              .ssn(ssn)
              .businessName(businessName)
              .ein(ein)
              .isActive(isActive)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractorsApi#createIndividualOrBusiness");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **companyId** | **String**| The UUID of the company | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |
| **contractorsCreateIndividualOrBusinessRequest** | [**ContractorsCreateIndividualOrBusinessRequest**](ContractorsCreateIndividualOrBusinessRequest.md)| Create an individual or business contractor. | [optional] |

### Return type

[**Contractor**](Contractor.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Example response |  -  |
| **404** | Not Found     The requested resource does not exist. Make sure the provided ID/UUID is valid.  |  -  |

<a name="getAll"></a>
# **getAll**
> List&lt;Contractor&gt; getAll(companyId).page(page).per(per).xGustoAPIVersion(xGustoAPIVersion).execute();

Get contractors of a company

Get all contractors, active and inactive, individual and business, for a company.  scope: &#x60;contractors:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoAppIntegrations;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContractorsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.gusto-demo.com";
    
    // Configure HTTP bearer authorization: Authorization
    configuration.token = "BEARER TOKEN";
    GustoAppIntegrations client = new GustoAppIntegrations(configuration);
    String companyId = "companyId_example"; // The UUID of the company
    Double page = 3.4D; // The page that is requested. When unspecified, will load all objects unless endpoint forces pagination.
    Double per = 3.4D; // Number of objects per page. For majority of endpoints will default to 25
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      List<Contractor> result = client
              .contractors
              .getAll(companyId)
              .page(page)
              .per(per)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractorsApi#getAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Contractor>> response = client
              .contractors
              .getAll(companyId)
              .page(page)
              .per(per)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractorsApi#getAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **companyId** | **String**| The UUID of the company | |
| **page** | **Double**| The page that is requested. When unspecified, will load all objects unless endpoint forces pagination. | [optional] |
| **per** | **Double**| Number of objects per page. For majority of endpoints will default to 25 | [optional] |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |

### Return type

[**List&lt;Contractor&gt;**](Contractor.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Example response |  -  |
| **404** | Not Found     The requested resource does not exist. Make sure the provided ID/UUID is valid.  |  -  |

<a name="getDetails"></a>
# **getDetails**
> Contractor getDetails(contractorId).xGustoAPIVersion(xGustoAPIVersion).execute();

Get a contractor

Get a contractor.  scope: &#x60;contractors:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoAppIntegrations;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContractorsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.gusto-demo.com";
    
    // Configure HTTP bearer authorization: Authorization
    configuration.token = "BEARER TOKEN";
    GustoAppIntegrations client = new GustoAppIntegrations(configuration);
    String contractorId = "contractorId_example"; // The UUID of the contractor
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      Contractor result = client
              .contractors
              .getDetails(contractorId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getVersion());
      System.out.println(result.getUuid());
      System.out.println(result.getCompanyUuid());
      System.out.println(result.getWageType());
      System.out.println(result.getIsActive());
      System.out.println(result.getType());
      System.out.println(result.getFirstName());
      System.out.println(result.getLastName());
      System.out.println(result.getMiddleInitial());
      System.out.println(result.getBusinessName());
      System.out.println(result.getEin());
      System.out.println(result.getHasEin());
      System.out.println(result.getEmail());
      System.out.println(result.getStartDate());
      System.out.println(result.getAddress());
      System.out.println(result.getHourlyRate());
      System.out.println(result.getFileNewHireReport());
      System.out.println(result.getWorkState());
      System.out.println(result.getOnboarded());
      System.out.println(result.getOnboardingStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractorsApi#getDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Contractor> response = client
              .contractors
              .getDetails(contractorId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractorsApi#getDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **contractorId** | **String**| The UUID of the contractor | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |

### Return type

[**Contractor**](Contractor.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Example response |  -  |
| **404** | Not Found     The requested resource does not exist. Make sure the provided ID/UUID is valid.  |  -  |

<a name="updateContractor"></a>
# **updateContractor**
> Contractor updateContractor(contractorId).xGustoAPIVersion(xGustoAPIVersion).contractorsUpdateContractorRequest(contractorsUpdateContractorRequest).execute();

Update a contractor

Update a contractor.  scope: &#x60;contractors:write&#x60;  &gt; 🚧 Warning &gt; &gt; Watch out when changing a contractor&#39;s type (when the contractor is finished onboarding). Specifically, changing contractor type can be dangerous since Gusto won’t recognize and file two separate 1099s if they simply change from business to individual

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoAppIntegrations;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContractorsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.gusto-demo.com";
    
    // Configure HTTP bearer authorization: Authorization
    configuration.token = "BEARER TOKEN";
    GustoAppIntegrations client = new GustoAppIntegrations(configuration);
    String contractorId = "contractorId_example"; // The UUID of the contractor
    String version = "version_example"; // The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field.
    String type = "Individual"; // The contractor type.
    String wageType = "Fixed"; // The contractor’s wage type. 
    String startDate = "startDate_example"; // The day when the contractor will start working for the company. 
    String hourlyRate = "hourlyRate_example"; // The contractor’s hourly rate. This attribute is required if the wage_type is `Hourly`.
    Boolean selfOnboarding = false; // Whether the contractor or the payroll admin will complete onboarding in Gusto. Self-onboarding is recommended so that contractors receive Gusto accounts. If self_onboarding is true, then email is required.
    String email = "email_example"; // The contractor’s email address.
    String firstName = "firstName_example"; // The contractor’s first name. This attribute is required for `Individual` contractors and will be ignored for `Business` contractors.
    String lastName = "lastName_example"; // The contractor’s last name. This attribute is required for `Individual` contractors and will be ignored for `Business` contractors.
    String middleInitial = "middleInitial_example"; // The contractor’s middle initial. This attribute is optional for `Individual` contractors and will be ignored for `Business` contractors.
    Boolean fileNewHireReport = false; // The boolean flag indicating whether Gusto will file a new hire report for the contractor. This attribute is optional for `Individual` contractors and will be ignored for `Business` contractors.
    String workState = "workState_example"; // State where the contractor will be conducting the majority of their work for the company. This value is used when generating the new hire report. This attribute is required for `Individual` contractors if `file_new_hire_report` is true and will be ignored for `Business` contractors.
    String ssn = "ssn_example"; // This attribute is optional for `Individual` contractors and will be ignored for `Business` contractors. Social security number is needed to file the annual 1099 tax form.
    String businessName = "businessName_example"; // The name of the contractor business. This attribute is required for `Business` contractors and will be ignored for `Individual` contractors.
    String ein = "ein_example"; // The employer identification number of the contractor business. This attribute is optional for `Business` contractors and will be ignored for `Individual` contractors.
    Boolean isActive = true; // The status of the contractor.
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      Contractor result = client
              .contractors
              .updateContractor(contractorId)
              .version(version)
              .type(type)
              .wageType(wageType)
              .startDate(startDate)
              .hourlyRate(hourlyRate)
              .selfOnboarding(selfOnboarding)
              .email(email)
              .firstName(firstName)
              .lastName(lastName)
              .middleInitial(middleInitial)
              .fileNewHireReport(fileNewHireReport)
              .workState(workState)
              .ssn(ssn)
              .businessName(businessName)
              .ein(ein)
              .isActive(isActive)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getVersion());
      System.out.println(result.getUuid());
      System.out.println(result.getCompanyUuid());
      System.out.println(result.getWageType());
      System.out.println(result.getIsActive());
      System.out.println(result.getType());
      System.out.println(result.getFirstName());
      System.out.println(result.getLastName());
      System.out.println(result.getMiddleInitial());
      System.out.println(result.getBusinessName());
      System.out.println(result.getEin());
      System.out.println(result.getHasEin());
      System.out.println(result.getEmail());
      System.out.println(result.getStartDate());
      System.out.println(result.getAddress());
      System.out.println(result.getHourlyRate());
      System.out.println(result.getFileNewHireReport());
      System.out.println(result.getWorkState());
      System.out.println(result.getOnboarded());
      System.out.println(result.getOnboardingStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractorsApi#updateContractor");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Contractor> response = client
              .contractors
              .updateContractor(contractorId)
              .version(version)
              .type(type)
              .wageType(wageType)
              .startDate(startDate)
              .hourlyRate(hourlyRate)
              .selfOnboarding(selfOnboarding)
              .email(email)
              .firstName(firstName)
              .lastName(lastName)
              .middleInitial(middleInitial)
              .fileNewHireReport(fileNewHireReport)
              .workState(workState)
              .ssn(ssn)
              .businessName(businessName)
              .ein(ein)
              .isActive(isActive)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractorsApi#updateContractor");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **contractorId** | **String**| The UUID of the contractor | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |
| **contractorsUpdateContractorRequest** | [**ContractorsUpdateContractorRequest**](ContractorsUpdateContractorRequest.md)|  | [optional] |

### Return type

[**Contractor**](Contractor.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Example response |  -  |
| **404** | Not Found     The requested resource does not exist. Make sure the provided ID/UUID is valid.  |  -  |

