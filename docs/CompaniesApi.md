# CompaniesApi

All URIs are relative to *https://api.gusto-demo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCompany**](CompaniesApi.md#createCompany) | **POST** /v1/provision | Create a company |
| [**getCompanyInfo**](CompaniesApi.md#getCompanyInfo) | **GET** /v1/companies/{company_id} | Get a company |
| [**getCustomFields**](CompaniesApi.md#getCustomFields) | **GET** /v1/companies/{company_id}/custom_fields | Get the custom fields of a company |


<a name="createCompany"></a>
# **createCompany**
> CompaniesCreateCompanyResponse createCompany().xGustoAPIVersion(xGustoAPIVersion).companiesCreateCompanyRequest(companiesCreateCompanyRequest).execute();

Create a company

### Overview The company provisioning API provides a way to create a Gusto company as part of your integration. When you successfully call the API, the API does the following: * Creates a new company in Gusto. * Creates a new user in Gusto. * Makes the new user the primary payroll administrator of the new company. * Sends a welcome email to the new user. In the response, you will receive an account claim URL. Redirect the user to this URL to complete their account setup inside of Gusto  &gt; 📘 Token Authentication &gt; &gt; This endpoint uses the [organization level api token and the Token scheme with HTTP Authorization header](https://docs.gusto.com/embedded-payroll/docs/authentication#api-token-authentication).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoAppIntegrations;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompaniesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.gusto-demo.com";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    GustoAppIntegrations client = new GustoAppIntegrations(configuration);
    CompaniesCreateCompanyRequestUser user = new CompaniesCreateCompanyRequestUser();
    CompaniesCreateCompanyRequestCompany company = new CompaniesCreateCompanyRequestCompany();
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      CompaniesCreateCompanyResponse result = client
              .companies
              .createCompany(user, company)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccountClaimUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompaniesApi#createCompany");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CompaniesCreateCompanyResponse> response = client
              .companies
              .createCompany(user, company)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompaniesApi#createCompany");
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
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |
| **companiesCreateCompanyRequest** | [**CompaniesCreateCompanyRequest**](CompaniesCreateCompanyRequest.md)|  | [optional] |

### Return type

[**CompaniesCreateCompanyResponse**](CompaniesCreateCompanyResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | OK |  -  |
| **401** | Authorization information is missing or invalid. |  -  |

<a name="getCompanyInfo"></a>
# **getCompanyInfo**
> Company getCompanyInfo(companyId).xGustoAPIVersion(xGustoAPIVersion).execute();

Get a company

Get a company.          The employees:read scope is required to return home_address and non-work locations.          The company_admin:read scope is required to return primary_payroll_admin.          The signatories:read scope is required to return primary_signatory.           scope: &#x60;companies:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoAppIntegrations;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompaniesApi;
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
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      Company result = client
              .companies
              .getCompanyInfo(companyId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getEin());
      System.out.println(result.getEntityType());
      System.out.println(result.getTier());
      System.out.println(result.getIsSuspended());
      System.out.println(result.getCompanyStatus());
      System.out.println(result.getUuid());
      System.out.println(result.getName());
      System.out.println(result.getTradeName());
      System.out.println(result.getIsPartnerManaged());
      System.out.println(result.getPayScheduleType());
      System.out.println(result.getJoinDate());
      System.out.println(result.getFundingType());
      System.out.println(result.getLocations());
      System.out.println(result.getCompensations());
      System.out.println(result.getPrimarySignatory());
      System.out.println(result.getPrimaryPayrollAdmin());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompaniesApi#getCompanyInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Company> response = client
              .companies
              .getCompanyInfo(companyId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompaniesApi#getCompanyInfo");
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

### Return type

[**Company**](Company.md)

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

<a name="getCustomFields"></a>
# **getCustomFields**
> CompaniesGetCustomFieldsResponse getCustomFields(companyId).page(page).per(per).xGustoAPIVersion(xGustoAPIVersion).execute();

Get the custom fields of a company

Returns a list of the custom fields of the company. Useful when you need to know the schema of custom fields for an entire company  scope: &#x60;companies:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoAppIntegrations;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompaniesApi;
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
      CompaniesGetCustomFieldsResponse result = client
              .companies
              .getCustomFields(companyId)
              .page(page)
              .per(per)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getCustomFields());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompaniesApi#getCustomFields");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CompaniesGetCustomFieldsResponse> response = client
              .companies
              .getCustomFields(companyId)
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
      System.err.println("Exception when calling CompaniesApi#getCustomFields");
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

[**CompaniesGetCustomFieldsResponse**](CompaniesGetCustomFieldsResponse.md)

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

