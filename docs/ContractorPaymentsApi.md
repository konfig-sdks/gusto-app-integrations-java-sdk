# ContractorPaymentsApi

All URIs are relative to *https://api.gusto-demo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSingle**](ContractorPaymentsApi.md#getSingle) | **GET** /v1/companies/{company_id}/contractor_payments/{contractor_payment_id} | Get a single contractor payment |
| [**listForCompany**](ContractorPaymentsApi.md#listForCompany) | **GET** /v1/companies/{company_id}/contractor_payments | Get contractor payments for a company |


<a name="getSingle"></a>
# **getSingle**
> ContractorPayment getSingle(companyId, contractorPaymentId).xGustoAPIVersion(xGustoAPIVersion).execute();

Get a single contractor payment

Returns a single contractor payments  scope: &#x60;payrolls:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoAppIntegrations;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContractorPaymentsApi;
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
    String contractorPaymentId = "contractorPaymentId_example"; // The UUID of the contractor payment
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      ContractorPayment result = client
              .contractorPayments
              .getSingle(companyId, contractorPaymentId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getUuid());
      System.out.println(result.getContractorUuid());
      System.out.println(result.getBonus());
      System.out.println(result.getDate());
      System.out.println(result.getHours());
      System.out.println(result.getPaymentMethod());
      System.out.println(result.getReimbursement());
      System.out.println(result.getStatus());
      System.out.println(result.getHourlyRate());
      System.out.println(result.getMayCancel());
      System.out.println(result.getWage());
      System.out.println(result.getWageType());
      System.out.println(result.getWageTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractorPaymentsApi#getSingle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ContractorPayment> response = client
              .contractorPayments
              .getSingle(companyId, contractorPaymentId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractorPaymentsApi#getSingle");
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
| **contractorPaymentId** | **String**| The UUID of the contractor payment | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |

### Return type

[**ContractorPayment**](ContractorPayment.md)

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

<a name="listForCompany"></a>
# **listForCompany**
> Object listForCompany(companyId, startDate, endDate).contractorUuid(contractorUuid).groupByDate(groupByDate).page(page).per(per).xGustoAPIVersion(xGustoAPIVersion).execute();

Get contractor payments for a company

Returns an object containing individual contractor payments, within a given time period, including totals.  scope: &#x60;payrolls:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoAppIntegrations;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContractorPaymentsApi;
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
    String startDate = "2020-01-01"; // The time period for which to retrieve contractor payments
    String endDate = "2020-12-31"; // The time period for which to retrieve contractor payments
    String contractorUuid = "contractorUuid_example"; // The UUID of the contractor. When specified, will load all payments for that contractor.
    Boolean groupByDate = true; // Display contractor payments results group by check date if set to true.
    Double page = 3.4D; // The page that is requested. When unspecified, will load all objects unless endpoint forces pagination.
    Double per = 3.4D; // Number of objects per page. For majority of endpoints will default to 25
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      Object result = client
              .contractorPayments
              .listForCompany(companyId, startDate, endDate)
              .contractorUuid(contractorUuid)
              .groupByDate(groupByDate)
              .page(page)
              .per(per)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractorPaymentsApi#listForCompany");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .contractorPayments
              .listForCompany(companyId, startDate, endDate)
              .contractorUuid(contractorUuid)
              .groupByDate(groupByDate)
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
      System.err.println("Exception when calling ContractorPaymentsApi#listForCompany");
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
| **startDate** | **String**| The time period for which to retrieve contractor payments | |
| **endDate** | **String**| The time period for which to retrieve contractor payments | |
| **contractorUuid** | **String**| The UUID of the contractor. When specified, will load all payments for that contractor. | [optional] |
| **groupByDate** | **Boolean**| Display contractor payments results group by check date if set to true. | [optional] |
| **page** | **Double**| The page that is requested. When unspecified, will load all objects unless endpoint forces pagination. | [optional] |
| **per** | **Double**| Number of objects per page. For majority of endpoints will default to 25 | [optional] |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |

### Return type

**Object**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A JSON object containing contractor payments information |  -  |
| **404** | Not Found     The requested resource does not exist. Make sure the provided ID/UUID is valid.  |  -  |

