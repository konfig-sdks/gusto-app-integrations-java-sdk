# PayrollsApi

All URIs are relative to *https://api.gusto-demo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllForCompany**](PayrollsApi.md#getAllForCompany) | **GET** /v1/companies/{company_id}/payrolls | Get all payrolls for a company |
| [**getSinglePayroll**](PayrollsApi.md#getSinglePayroll) | **GET** /v1/companies/{company_id}/payrolls/{payroll_id} | Get a single payroll |
| [**prepareForUpdate**](PayrollsApi.md#prepareForUpdate) | **PUT** /v1/companies/{company_id}/payrolls/{payroll_id}/prepare | Prepare a payroll for update |
| [**updateById**](PayrollsApi.md#updateById) | **PUT** /v1/companies/{company_id}/payrolls/{payroll_id} | Update a payroll by ID |


<a name="getAllForCompany"></a>
# **getAllForCompany**
> List&lt;PayrollMinimal&gt; getAllForCompany(companyId).processingStatuses(processingStatuses).payrollTypes(payrollTypes).include(include).startDate(startDate).endDate(endDate).xGustoAPIVersion(xGustoAPIVersion).execute();

Get all payrolls for a company

Returns a list of payrolls for a company. You can change the payrolls returned by updating the processing_status, payroll_types, start_date, &amp; end_date params.  By default, will return processed, regular payrolls for the past 6 months.  Notes: * Dollar amounts are returned as string representations of numeric decimals, are represented to the cent. * end_date can be at most 3 months in the future and start_date and end_date can&#39;t be more than 1 year apart.  scope: &#x60;payrolls:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoAppIntegrations;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayrollsApi;
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
    String processingStatuses = "unprocessed"; // Whether to include processed and/or unprocessed payrolls in the response, defaults to processed, for multiple attributes comma separate the values, i.e. `?processing_statuses=processed,unprocessed`
    String payrollTypes = "regular"; // Whether to include regular and/or off_cycle payrolls in the response, defaults to regular, for multiple attributes comma separate the values, i.e. `?payroll_types=regular,off_cycle`
    String include = "totals"; // Include the requested attribute in the response. In v2023-04-01 totals are no longer included by default. For multiple attributes comma separate the values, i.e. `?include=totals,payroll_status_meta`
    String startDate = "startDate_example"; // Return payrolls whose pay period is after the start date
    String endDate = "endDate_example"; // Return payrolls whose pay period is before the end date
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      List<PayrollMinimal> result = client
              .payrolls
              .getAllForCompany(companyId)
              .processingStatuses(processingStatuses)
              .payrollTypes(payrollTypes)
              .include(include)
              .startDate(startDate)
              .endDate(endDate)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollsApi#getAllForCompany");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<PayrollMinimal>> response = client
              .payrolls
              .getAllForCompany(companyId)
              .processingStatuses(processingStatuses)
              .payrollTypes(payrollTypes)
              .include(include)
              .startDate(startDate)
              .endDate(endDate)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollsApi#getAllForCompany");
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
| **processingStatuses** | **String**| Whether to include processed and/or unprocessed payrolls in the response, defaults to processed, for multiple attributes comma separate the values, i.e. &#x60;?processing_statuses&#x3D;processed,unprocessed&#x60; | [optional] [enum: unprocessed, processed] |
| **payrollTypes** | **String**| Whether to include regular and/or off_cycle payrolls in the response, defaults to regular, for multiple attributes comma separate the values, i.e. &#x60;?payroll_types&#x3D;regular,off_cycle&#x60; | [optional] [enum: regular, off_cycle, external] |
| **include** | **String**| Include the requested attribute in the response. In v2023-04-01 totals are no longer included by default. For multiple attributes comma separate the values, i.e. &#x60;?include&#x3D;totals,payroll_status_meta&#x60; | [optional] [enum: totals, payroll_status_meta] |
| **startDate** | **String**| Return payrolls whose pay period is after the start date | [optional] |
| **endDate** | **String**| Return payrolls whose pay period is before the end date | [optional] |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |

### Return type

[**List&lt;PayrollMinimal&gt;**](PayrollMinimal.md)

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

<a name="getSinglePayroll"></a>
# **getSinglePayroll**
> Payroll getSinglePayroll(companyId, payrollId).include(include).xGustoAPIVersion(xGustoAPIVersion).execute();

Get a single payroll

Returns a payroll. If payroll is calculated or processed, will return employee_compensations and totals.  Notes: * Hour and dollar amounts are returned as string representations of numeric decimals. * Hours are represented to the thousands place; dollar amounts are represented to the cent. * Every eligible compensation is returned for each employee. If no data has yet be inserted for a given field, it defaults to “0.00” (for fixed amounts) or “0.000” (for hours ). * When include parameter with benefits value is passed, employee_benefits:read scope is required to return benefits   * Benefits containing PHI are only visible with the &#x60;employee_benefits:read:phi&#x60; scope  scope: &#x60;payrolls:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoAppIntegrations;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayrollsApi;
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
    String payrollId = "payrollId_example"; // The UUID of the payroll
    String include = "benefits"; // Include the requested attribute in the response, for multiple attributes comma separate the values, i.e. `?include=benefits,deductions,taxes`
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      Payroll result = client
              .payrolls
              .getSinglePayroll(companyId, payrollId)
              .include(include)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getPayrollDeadline());
      System.out.println(result.getCheckDate());
      System.out.println(result.getProcessed());
      System.out.println(result.getProcessedDate());
      System.out.println(result.getCalculatedAt());
      System.out.println(result.getPayrollUuid());
      System.out.println(result.getCompanyUuid());
      System.out.println(result.getOffCycle());
      System.out.println(result.getOffCycleReason());
      System.out.println(result.getExternal());
      System.out.println(result.getFinalTerminationPayroll());
      System.out.println(result.getWithholdingPayPeriod());
      System.out.println(result.getSkipRegularDeductions());
      System.out.println(result.getFixedWithholdingRate());
      System.out.println(result.getPayPeriod());
      System.out.println(result.getPayrollStatusMeta());
      System.out.println(result.getTotals());
      System.out.println(result.getEmployeeCompensations());
      System.out.println(result.getCompanyTaxes());
      System.out.println(result.getPaymentSpeedChanged());
      System.out.println(result.getCreatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollsApi#getSinglePayroll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Payroll> response = client
              .payrolls
              .getSinglePayroll(companyId, payrollId)
              .include(include)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollsApi#getSinglePayroll");
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
| **payrollId** | **String**| The UUID of the payroll | |
| **include** | **String**| Include the requested attribute in the response, for multiple attributes comma separate the values, i.e. &#x60;?include&#x3D;benefits,deductions,taxes&#x60; | [optional] [enum: benefits, deductions, taxes, payroll_status_meta] |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |

### Return type

[**Payroll**](Payroll.md)

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

<a name="prepareForUpdate"></a>
# **prepareForUpdate**
> PayrollPrepared prepareForUpdate(companyId, payrollId).xGustoAPIVersion(xGustoAPIVersion).execute();

Prepare a payroll for update

This endpoint will build the payroll and get it ready for making updates. This includes adding/removing eligible employees from the Payroll and updating the check_date, payroll_deadline, and payroll_status_meta dates &amp; times.  Notes:  * Will null out calculated_at &amp; totals if a payroll has already been calculated.  * Will return the version param used for updating the payroll  scope: &#x60;payrolls:write&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoAppIntegrations;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayrollsApi;
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
    String payrollId = "payrollId_example"; // The UUID of the payroll
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      PayrollPrepared result = client
              .payrolls
              .prepareForUpdate(companyId, payrollId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getPayrollDeadline());
      System.out.println(result.getCheckDate());
      System.out.println(result.getProcessed());
      System.out.println(result.getProcessedDate());
      System.out.println(result.getCalculatedAt());
      System.out.println(result.getPayrollUuid());
      System.out.println(result.getCompanyUuid());
      System.out.println(result.getOffCycle());
      System.out.println(result.getOffCycleReason());
      System.out.println(result.getExternal());
      System.out.println(result.getFinalTerminationPayroll());
      System.out.println(result.getWithholdingPayPeriod());
      System.out.println(result.getSkipRegularDeductions());
      System.out.println(result.getFixedWithholdingRate());
      System.out.println(result.getPayPeriod());
      System.out.println(result.getPayrollStatusMeta());
      System.out.println(result.getEmployeeCompensations());
      System.out.println(result.getPaymentSpeedChanged());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getFixedCompensationTypes());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollsApi#prepareForUpdate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayrollPrepared> response = client
              .payrolls
              .prepareForUpdate(companyId, payrollId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollsApi#prepareForUpdate");
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
| **payrollId** | **String**| The UUID of the payroll | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |

### Return type

[**PayrollPrepared**](PayrollPrepared.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A prepared payroll |  -  |
| **404** | Not Found     The requested resource does not exist. Make sure the provided ID/UUID is valid.  |  -  |

<a name="updateById"></a>
# **updateById**
> PayrollPrepared updateById(companyId, payrollId).xGustoAPIVersion(xGustoAPIVersion).payrollsUpdateByIdRequest(payrollsUpdateByIdRequest).execute();

Update a payroll by ID

This endpoint allows you to update information for one or more employees for a specific **unprocessed** payroll.  You can think of the **unprocessed** payroll object as a template of fields that you can update.  You cannot modify the structure of the payroll object through this endpoint, only values of the fields included in the payroll.  If you do not include specific employee compensations or fixed/hourly compensations in your request body, they will not be removed from the payroll.  scope: &#x60;payrolls:write&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoAppIntegrations;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayrollsApi;
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
    List<PayrollsUpdateByIdRequestEmployeeCompensationsInner> employeeCompensations = Arrays.asList();
    String companyId = "companyId_example"; // The UUID of the company
    String payrollId = "payrollId_example"; // The UUID of the payroll
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      PayrollPrepared result = client
              .payrolls
              .updateById(employeeCompensations, companyId, payrollId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getPayrollDeadline());
      System.out.println(result.getCheckDate());
      System.out.println(result.getProcessed());
      System.out.println(result.getProcessedDate());
      System.out.println(result.getCalculatedAt());
      System.out.println(result.getPayrollUuid());
      System.out.println(result.getCompanyUuid());
      System.out.println(result.getOffCycle());
      System.out.println(result.getOffCycleReason());
      System.out.println(result.getExternal());
      System.out.println(result.getFinalTerminationPayroll());
      System.out.println(result.getWithholdingPayPeriod());
      System.out.println(result.getSkipRegularDeductions());
      System.out.println(result.getFixedWithholdingRate());
      System.out.println(result.getPayPeriod());
      System.out.println(result.getPayrollStatusMeta());
      System.out.println(result.getEmployeeCompensations());
      System.out.println(result.getPaymentSpeedChanged());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getFixedCompensationTypes());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollsApi#updateById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayrollPrepared> response = client
              .payrolls
              .updateById(employeeCompensations, companyId, payrollId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollsApi#updateById");
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
| **payrollId** | **String**| The UUID of the payroll | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |
| **payrollsUpdateByIdRequest** | [**PayrollsUpdateByIdRequest**](PayrollsUpdateByIdRequest.md)|  | [optional] |

### Return type

[**PayrollPrepared**](PayrollPrepared.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A prepared payroll |  -  |
| **404** | Not Found     The requested resource does not exist. Make sure the provided ID/UUID is valid.  |  -  |

