# TimeOffPoliciesApi

All URIs are relative to *https://api.gusto-demo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**calculateAccruingTimeOffHours**](TimeOffPoliciesApi.md#calculateAccruingTimeOffHours) | **POST** /v1/payrolls/{payroll_id}/employees/{employee_id}/calculate_accruing_time_off_hours | Calculate accruing time off hours |


<a name="calculateAccruingTimeOffHours"></a>
# **calculateAccruingTimeOffHours**
> List&lt;AccruingTimeOffHour&gt; calculateAccruingTimeOffHours(payrollId, employeeId).xGustoAPIVersion(xGustoAPIVersion).timeOffPoliciesCalculateAccruingTimeOffHoursRequest(timeOffPoliciesCalculateAccruingTimeOffHoursRequest).execute();

Calculate accruing time off hours

Returns a list of accruing time off for each time off policy associated with the employee.  Factors affecting the accrued hours:   * the time off policy accrual method (whether they get pay per hour worked, per hour paid, with / without overtime, accumulate time off based on pay period / calendar year / anniversary)   * how many hours of work during this pay period   * how many hours of PTO / sick hours taken during this pay period (for per hour paid policies only)   * company pay schedule frequency (for per pay period)  If none of the parameters is passed in, the accrued time off hour will be 0.  scope: &#x60;payrolls:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoAppIntegrations;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeOffPoliciesApi;
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
    String payrollId = "payrollId_example"; // The UUID of the payroll
    String employeeId = "employeeId_example"; // The UUID of the employee
    Double regularHoursWorked = 3.4D; // regular hours worked in this pay period
    Double overtimeHoursWorked = 3.4D; // overtime hours worked in this pay period
    Double doubleOvertimeHoursWorked = 3.4D; // double overtime hours worked in this pay period
    Double ptoHoursUsed = 3.4D; // paid time off hours used in this pay period
    Double sickHoursUsed = 3.4D; // sick hours used in this pay period
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      List<AccruingTimeOffHour> result = client
              .timeOffPolicies
              .calculateAccruingTimeOffHours(payrollId, employeeId)
              .regularHoursWorked(regularHoursWorked)
              .overtimeHoursWorked(overtimeHoursWorked)
              .doubleOvertimeHoursWorked(doubleOvertimeHoursWorked)
              .ptoHoursUsed(ptoHoursUsed)
              .sickHoursUsed(sickHoursUsed)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffPoliciesApi#calculateAccruingTimeOffHours");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<AccruingTimeOffHour>> response = client
              .timeOffPolicies
              .calculateAccruingTimeOffHours(payrollId, employeeId)
              .regularHoursWorked(regularHoursWorked)
              .overtimeHoursWorked(overtimeHoursWorked)
              .doubleOvertimeHoursWorked(doubleOvertimeHoursWorked)
              .ptoHoursUsed(ptoHoursUsed)
              .sickHoursUsed(sickHoursUsed)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffPoliciesApi#calculateAccruingTimeOffHours");
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
| **payrollId** | **String**| The UUID of the payroll | |
| **employeeId** | **String**| The UUID of the employee | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |
| **timeOffPoliciesCalculateAccruingTimeOffHoursRequest** | [**TimeOffPoliciesCalculateAccruingTimeOffHoursRequest**](TimeOffPoliciesCalculateAccruingTimeOffHoursRequest.md)|  | [optional] |

### Return type

[**List&lt;AccruingTimeOffHour&gt;**](AccruingTimeOffHour.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Example response |  -  |

