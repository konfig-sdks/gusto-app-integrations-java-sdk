# EmployeesApi

All URIs are relative to *https://api.gusto-demo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createEmployee**](EmployeesApi.md#createEmployee) | **POST** /v1/companies/{company_id}/employees | Create an employee |
| [**deleteOnboardingEmployee**](EmployeesApi.md#deleteOnboardingEmployee) | **DELETE** /v1/employees/{employee_id} | Delete an onboarding employee |
| [**getCompanyEmployees**](EmployeesApi.md#getCompanyEmployees) | **GET** /v1/companies/{company_id}/employees | Get employees of a company |
| [**getCustomFields**](EmployeesApi.md#getCustomFields) | **GET** /v1/employees/{employee_id}/custom_fields | Get an employee&#39;s custom fields |
| [**getDetails**](EmployeesApi.md#getDetails) | **GET** /v1/employees/{employee_id} | Get an employee |
| [**getTimeOffActivities**](EmployeesApi.md#getTimeOffActivities) | **GET** /v1/employees/{employee_uuid}/time_off_activities | Get employee time off activities |
| [**updateEmployee**](EmployeesApi.md#updateEmployee) | **PUT** /v1/employees/{employee_id} | Update an employee |


<a name="createEmployee"></a>
# **createEmployee**
> Employee createEmployee(companyId).xGustoAPIVersion(xGustoAPIVersion).employeesCreateEmployeeRequest(employeesCreateEmployeeRequest).execute();

Create an employee

Create an employee.  scope: &#x60;employees:manage&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoAppIntegrations;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeesApi;
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
    String firstName = "firstName_example";
    String lastName = "lastName_example";
    String companyId = "companyId_example"; // The UUID of the company
    String middleInitial = "middleInitial_example";
    String dateOfBirth = "dateOfBirth_example";
    String email = "email_example";
    String ssn = "ssn_example";
    Boolean selfOnboarding = true; // If true, employee is expected to self-onboard. If false, payroll admin is expected to enter in the employee's onboarding information
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      Employee result = client
              .employees
              .createEmployee(firstName, lastName, companyId)
              .middleInitial(middleInitial)
              .dateOfBirth(dateOfBirth)
              .email(email)
              .ssn(ssn)
              .selfOnboarding(selfOnboarding)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getVersion());
      System.out.println(result.getUuid());
      System.out.println(result.getFirstName());
      System.out.println(result.getMiddleInitial());
      System.out.println(result.getLastName());
      System.out.println(result.getEmail());
      System.out.println(result.getCompanyUuid());
      System.out.println(result.getManagerUuid());
      System.out.println(result.getDepartment());
      System.out.println(result.getTerminated());
      System.out.println(result.getTwoPercentShareholder());
      System.out.println(result.getOnboarded());
      System.out.println(result.getOnboardingStatus());
      System.out.println(result.getJobs());
      System.out.println(result.getEligiblePaidTimeOff());
      System.out.println(result.getTerminations());
      System.out.println(result.getGarnishments());
      System.out.println(result.getCustomFields());
      System.out.println(result.getDateOfBirth());
      System.out.println(result.getHasSsn());
      System.out.println(result.getSsn());
      System.out.println(result.getPhone());
      System.out.println(result.getPreferredFirstName());
      System.out.println(result.getPaymentMethod());
      System.out.println(result.getWorkEmail());
      System.out.println(result.getCurrentEmploymentStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#createEmployee");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Employee> response = client
              .employees
              .createEmployee(firstName, lastName, companyId)
              .middleInitial(middleInitial)
              .dateOfBirth(dateOfBirth)
              .email(email)
              .ssn(ssn)
              .selfOnboarding(selfOnboarding)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#createEmployee");
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
| **employeesCreateEmployeeRequest** | [**EmployeesCreateEmployeeRequest**](EmployeesCreateEmployeeRequest.md)| Create an employee. | [optional] |

### Return type

[**Employee**](Employee.md)

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

<a name="deleteOnboardingEmployee"></a>
# **deleteOnboardingEmployee**
> deleteOnboardingEmployee(employeeId).xGustoAPIVersion(xGustoAPIVersion).execute();

Delete an onboarding employee

Use this endpoint to delete an employee who is in onboarding. Deleting an onboarded employee is not allowed. Please check out the Terminations api if you need to terminate an onboarded employee.  scope: &#x60;employees:manage&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoAppIntegrations;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeesApi;
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
    String employeeId = "employeeId_example"; // The UUID of the employee
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      client
              .employees
              .deleteOnboardingEmployee(employeeId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#deleteOnboardingEmployee");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .employees
              .deleteOnboardingEmployee(employeeId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#deleteOnboardingEmployee");
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
| **employeeId** | **String**| The UUID of the employee | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **404** | Not Found     The requested resource does not exist. Make sure the provided ID/UUID is valid.  |  -  |

<a name="getCompanyEmployees"></a>
# **getCompanyEmployees**
> List&lt;Employee&gt; getCompanyEmployees(companyId).terminated(terminated).include(include).page(page).per(per).xGustoAPIVersion(xGustoAPIVersion).body(body).execute();

Get employees of a company

Get all of the employees, onboarding, active and terminated, for a given company.  scope: &#x60;employees:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoAppIntegrations;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeesApi;
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
    Boolean terminated = true; // Filters employees by the provided boolean
    String include = "all_compensations"; // Include the requested attribute(s) in each employee response, multiple options are comma separated. Available options: - all_compensations: Include all effective dated compensations for each job instead of only the current compensation - custom_fields: Include employees' custom fields
    Double page = 3.4D; // The page that is requested. When unspecified, will load all objects unless endpoint forces pagination.
    Double per = 3.4D; // Number of objects per page. For majority of endpoints will default to 25
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      List<Employee> result = client
              .employees
              .getCompanyEmployees(companyId)
              .terminated(terminated)
              .include(include)
              .page(page)
              .per(per)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#getCompanyEmployees");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Employee>> response = client
              .employees
              .getCompanyEmployees(companyId)
              .terminated(terminated)
              .include(include)
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
      System.err.println("Exception when calling EmployeesApi#getCompanyEmployees");
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
| **terminated** | **Boolean**| Filters employees by the provided boolean | [optional] |
| **include** | **String**| Include the requested attribute(s) in each employee response, multiple options are comma separated. Available options: - all_compensations: Include all effective dated compensations for each job instead of only the current compensation - custom_fields: Include employees&#39; custom fields | [optional] [enum: all_compensations, custom_fields] |
| **page** | **Double**| The page that is requested. When unspecified, will load all objects unless endpoint forces pagination. | [optional] |
| **per** | **Double**| Number of objects per page. For majority of endpoints will default to 25 | [optional] |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |
| **body** | **Object**|  | [optional] |

### Return type

[**List&lt;Employee&gt;**](Employee.md)

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

<a name="getCustomFields"></a>
# **getCustomFields**
> EmployeesGetCustomFieldsResponse getCustomFields(employeeId).page(page).per(per).xGustoAPIVersion(xGustoAPIVersion).execute();

Get an employee&#39;s custom fields

Returns a list of the employee&#39;s custom fields.  scope: &#x60;employees:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoAppIntegrations;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeesApi;
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
    String employeeId = "employeeId_example"; // The UUID of the employee
    Double page = 3.4D; // The page that is requested. When unspecified, will load all objects unless endpoint forces pagination.
    Double per = 3.4D; // Number of objects per page. For majority of endpoints will default to 25
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      EmployeesGetCustomFieldsResponse result = client
              .employees
              .getCustomFields(employeeId)
              .page(page)
              .per(per)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getCustomFields());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#getCustomFields");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeesGetCustomFieldsResponse> response = client
              .employees
              .getCustomFields(employeeId)
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
      System.err.println("Exception when calling EmployeesApi#getCustomFields");
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
| **employeeId** | **String**| The UUID of the employee | |
| **page** | **Double**| The page that is requested. When unspecified, will load all objects unless endpoint forces pagination. | [optional] |
| **per** | **Double**| Number of objects per page. For majority of endpoints will default to 25 | [optional] |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |

### Return type

[**EmployeesGetCustomFieldsResponse**](EmployeesGetCustomFieldsResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found     The requested resource does not exist. Make sure the provided ID/UUID is valid.  |  -  |

<a name="getDetails"></a>
# **getDetails**
> Employee getDetails(employeeId).include(include).xGustoAPIVersion(xGustoAPIVersion).execute();

Get an employee

Get an employee.  scope: &#x60;employees:read&#x60; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoAppIntegrations;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeesApi;
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
    String employeeId = "employeeId_example"; // The UUID of the employee
    String include = "all_compensations"; // Include the requested attribute(s) in each employee response, multiple options are comma separated. Available options: - all_compensations: Include all effective dated compensations for each job instead of only the current compensation - custom_fields: Include employees' custom fields
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      Employee result = client
              .employees
              .getDetails(employeeId)
              .include(include)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getVersion());
      System.out.println(result.getUuid());
      System.out.println(result.getFirstName());
      System.out.println(result.getMiddleInitial());
      System.out.println(result.getLastName());
      System.out.println(result.getEmail());
      System.out.println(result.getCompanyUuid());
      System.out.println(result.getManagerUuid());
      System.out.println(result.getDepartment());
      System.out.println(result.getTerminated());
      System.out.println(result.getTwoPercentShareholder());
      System.out.println(result.getOnboarded());
      System.out.println(result.getOnboardingStatus());
      System.out.println(result.getJobs());
      System.out.println(result.getEligiblePaidTimeOff());
      System.out.println(result.getTerminations());
      System.out.println(result.getGarnishments());
      System.out.println(result.getCustomFields());
      System.out.println(result.getDateOfBirth());
      System.out.println(result.getHasSsn());
      System.out.println(result.getSsn());
      System.out.println(result.getPhone());
      System.out.println(result.getPreferredFirstName());
      System.out.println(result.getPaymentMethod());
      System.out.println(result.getWorkEmail());
      System.out.println(result.getCurrentEmploymentStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#getDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Employee> response = client
              .employees
              .getDetails(employeeId)
              .include(include)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#getDetails");
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
| **employeeId** | **String**| The UUID of the employee | |
| **include** | **String**| Include the requested attribute(s) in each employee response, multiple options are comma separated. Available options: - all_compensations: Include all effective dated compensations for each job instead of only the current compensation - custom_fields: Include employees&#39; custom fields | [optional] [enum: all_compensations, custom_fields] |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |

### Return type

[**Employee**](Employee.md)

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

<a name="getTimeOffActivities"></a>
# **getTimeOffActivities**
> TimeOffActivity getTimeOffActivities(employeeUuid, timeOffType).xGustoAPIVersion(xGustoAPIVersion).execute();

Get employee time off activities

Get employee time off activities.  scope: &#x60;employee_time_off_activities:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoAppIntegrations;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeesApi;
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
    String employeeUuid = "employeeUuid_example"; // The UUID of the employee
    String timeOffType = "timeOffType_example"; // The time off type name you want to query data for. ex: 'sick' or 'vacation'
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      TimeOffActivity result = client
              .employees
              .getTimeOffActivities(employeeUuid, timeOffType)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getPolicyUuid());
      System.out.println(result.getTimeOffType());
      System.out.println(result.getPolicyName());
      System.out.println(result.getEventType());
      System.out.println(result.getEventDescription());
      System.out.println(result.getEffectiveTime());
      System.out.println(result.getBalance());
      System.out.println(result.getBalanceChange());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#getTimeOffActivities");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimeOffActivity> response = client
              .employees
              .getTimeOffActivities(employeeUuid, timeOffType)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#getTimeOffActivities");
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
| **employeeUuid** | **String**| The UUID of the employee | |
| **timeOffType** | **String**| The time off type name you want to query data for. ex: &#39;sick&#39; or &#39;vacation&#39; | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |

### Return type

[**TimeOffActivity**](TimeOffActivity.md)

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

<a name="updateEmployee"></a>
# **updateEmployee**
> Employee updateEmployee(employeeId).xGustoAPIVersion(xGustoAPIVersion).employeesUpdateEmployeeRequest(employeesUpdateEmployeeRequest).execute();

Update an employee

Update an employee.  scope: &#x60;employees:write&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoAppIntegrations;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeesApi;
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
    String version = "version_example"; // The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/versioning#object-layer) for information on how to use this field.
    String employeeId = "employeeId_example"; // The UUID of the employee
    String firstName = "firstName_example";
    String middleInitial = "middleInitial_example";
    String lastName = "lastName_example";
    String dateOfBirth = "dateOfBirth_example";
    String email = "email_example";
    String ssn = "ssn_example";
    Boolean twoPercentShareholder = true; // Whether the employee is a two percent shareholder of the company. This field only applies to companies with an S-Corp entity type.
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      Employee result = client
              .employees
              .updateEmployee(version, employeeId)
              .firstName(firstName)
              .middleInitial(middleInitial)
              .lastName(lastName)
              .dateOfBirth(dateOfBirth)
              .email(email)
              .ssn(ssn)
              .twoPercentShareholder(twoPercentShareholder)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getVersion());
      System.out.println(result.getUuid());
      System.out.println(result.getFirstName());
      System.out.println(result.getMiddleInitial());
      System.out.println(result.getLastName());
      System.out.println(result.getEmail());
      System.out.println(result.getCompanyUuid());
      System.out.println(result.getManagerUuid());
      System.out.println(result.getDepartment());
      System.out.println(result.getTerminated());
      System.out.println(result.getTwoPercentShareholder());
      System.out.println(result.getOnboarded());
      System.out.println(result.getOnboardingStatus());
      System.out.println(result.getJobs());
      System.out.println(result.getEligiblePaidTimeOff());
      System.out.println(result.getTerminations());
      System.out.println(result.getGarnishments());
      System.out.println(result.getCustomFields());
      System.out.println(result.getDateOfBirth());
      System.out.println(result.getHasSsn());
      System.out.println(result.getSsn());
      System.out.println(result.getPhone());
      System.out.println(result.getPreferredFirstName());
      System.out.println(result.getPaymentMethod());
      System.out.println(result.getWorkEmail());
      System.out.println(result.getCurrentEmploymentStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#updateEmployee");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Employee> response = client
              .employees
              .updateEmployee(version, employeeId)
              .firstName(firstName)
              .middleInitial(middleInitial)
              .lastName(lastName)
              .dateOfBirth(dateOfBirth)
              .email(email)
              .ssn(ssn)
              .twoPercentShareholder(twoPercentShareholder)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#updateEmployee");
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
| **employeeId** | **String**| The UUID of the employee | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |
| **employeesUpdateEmployeeRequest** | [**EmployeesUpdateEmployeeRequest**](EmployeesUpdateEmployeeRequest.md)| Update an employee. | [optional] |

### Return type

[**Employee**](Employee.md)

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

