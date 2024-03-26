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


package com.konfigthis.client.api;

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.AccruingTimeOffHour;
import com.konfigthis.client.model.TimeOffPoliciesCalculateAccruingTimeOffHoursRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class TimeOffPoliciesApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public TimeOffPoliciesApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public TimeOffPoliciesApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call calculateAccruingTimeOffHoursCall(String payrollId, String employeeId, String xGustoAPIVersion, TimeOffPoliciesCalculateAccruingTimeOffHoursRequest timeOffPoliciesCalculateAccruingTimeOffHoursRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = timeOffPoliciesCalculateAccruingTimeOffHoursRequest;

        // create path and map variables
        String localVarPath = "/v1/payrolls/{payroll_id}/employees/{employee_id}/calculate_accruing_time_off_hours"
            .replace("{" + "payroll_id" + "}", localVarApiClient.escapeString(payrollId.toString()))
            .replace("{" + "employee_id" + "}", localVarApiClient.escapeString(employeeId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (xGustoAPIVersion != null) {
            localVarHeaderParams.put("X-Gusto-API-Version", localVarApiClient.parameterToString(xGustoAPIVersion));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "Authorization" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call calculateAccruingTimeOffHoursValidateBeforeCall(String payrollId, String employeeId, String xGustoAPIVersion, TimeOffPoliciesCalculateAccruingTimeOffHoursRequest timeOffPoliciesCalculateAccruingTimeOffHoursRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'payrollId' is set
        if (payrollId == null) {
            throw new ApiException("Missing the required parameter 'payrollId' when calling calculateAccruingTimeOffHours(Async)");
        }

        // verify the required parameter 'employeeId' is set
        if (employeeId == null) {
            throw new ApiException("Missing the required parameter 'employeeId' when calling calculateAccruingTimeOffHours(Async)");
        }

        return calculateAccruingTimeOffHoursCall(payrollId, employeeId, xGustoAPIVersion, timeOffPoliciesCalculateAccruingTimeOffHoursRequest, _callback);

    }


    private ApiResponse<List<AccruingTimeOffHour>> calculateAccruingTimeOffHoursWithHttpInfo(String payrollId, String employeeId, String xGustoAPIVersion, TimeOffPoliciesCalculateAccruingTimeOffHoursRequest timeOffPoliciesCalculateAccruingTimeOffHoursRequest) throws ApiException {
        okhttp3.Call localVarCall = calculateAccruingTimeOffHoursValidateBeforeCall(payrollId, employeeId, xGustoAPIVersion, timeOffPoliciesCalculateAccruingTimeOffHoursRequest, null);
        Type localVarReturnType = new TypeToken<List<AccruingTimeOffHour>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call calculateAccruingTimeOffHoursAsync(String payrollId, String employeeId, String xGustoAPIVersion, TimeOffPoliciesCalculateAccruingTimeOffHoursRequest timeOffPoliciesCalculateAccruingTimeOffHoursRequest, final ApiCallback<List<AccruingTimeOffHour>> _callback) throws ApiException {

        okhttp3.Call localVarCall = calculateAccruingTimeOffHoursValidateBeforeCall(payrollId, employeeId, xGustoAPIVersion, timeOffPoliciesCalculateAccruingTimeOffHoursRequest, _callback);
        Type localVarReturnType = new TypeToken<List<AccruingTimeOffHour>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class CalculateAccruingTimeOffHoursRequestBuilder {
        private final String payrollId;
        private final String employeeId;
        private Double regularHoursWorked;
        private Double overtimeHoursWorked;
        private Double doubleOvertimeHoursWorked;
        private Double ptoHoursUsed;
        private Double sickHoursUsed;
        private String xGustoAPIVersion;

        private CalculateAccruingTimeOffHoursRequestBuilder(String payrollId, String employeeId) {
            this.payrollId = payrollId;
            this.employeeId = employeeId;
        }

        /**
         * Set regularHoursWorked
         * @param regularHoursWorked regular hours worked in this pay period (optional)
         * @return CalculateAccruingTimeOffHoursRequestBuilder
         */
        public CalculateAccruingTimeOffHoursRequestBuilder regularHoursWorked(Double regularHoursWorked) {
            this.regularHoursWorked = regularHoursWorked;
            return this;
        }
        
        /**
         * Set overtimeHoursWorked
         * @param overtimeHoursWorked overtime hours worked in this pay period (optional)
         * @return CalculateAccruingTimeOffHoursRequestBuilder
         */
        public CalculateAccruingTimeOffHoursRequestBuilder overtimeHoursWorked(Double overtimeHoursWorked) {
            this.overtimeHoursWorked = overtimeHoursWorked;
            return this;
        }
        
        /**
         * Set doubleOvertimeHoursWorked
         * @param doubleOvertimeHoursWorked double overtime hours worked in this pay period (optional)
         * @return CalculateAccruingTimeOffHoursRequestBuilder
         */
        public CalculateAccruingTimeOffHoursRequestBuilder doubleOvertimeHoursWorked(Double doubleOvertimeHoursWorked) {
            this.doubleOvertimeHoursWorked = doubleOvertimeHoursWorked;
            return this;
        }
        
        /**
         * Set ptoHoursUsed
         * @param ptoHoursUsed paid time off hours used in this pay period (optional)
         * @return CalculateAccruingTimeOffHoursRequestBuilder
         */
        public CalculateAccruingTimeOffHoursRequestBuilder ptoHoursUsed(Double ptoHoursUsed) {
            this.ptoHoursUsed = ptoHoursUsed;
            return this;
        }
        
        /**
         * Set sickHoursUsed
         * @param sickHoursUsed sick hours used in this pay period (optional)
         * @return CalculateAccruingTimeOffHoursRequestBuilder
         */
        public CalculateAccruingTimeOffHoursRequestBuilder sickHoursUsed(Double sickHoursUsed) {
            this.sickHoursUsed = sickHoursUsed;
            return this;
        }
        
        /**
         * Set xGustoAPIVersion
         * @param xGustoAPIVersion Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. (optional)
         * @return CalculateAccruingTimeOffHoursRequestBuilder
         */
        public CalculateAccruingTimeOffHoursRequestBuilder xGustoAPIVersion(String xGustoAPIVersion) {
            this.xGustoAPIVersion = xGustoAPIVersion;
            return this;
        }
        
        /**
         * Build call for calculateAccruingTimeOffHours
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            TimeOffPoliciesCalculateAccruingTimeOffHoursRequest timeOffPoliciesCalculateAccruingTimeOffHoursRequest = buildBodyParams();
            return calculateAccruingTimeOffHoursCall(payrollId, employeeId, xGustoAPIVersion, timeOffPoliciesCalculateAccruingTimeOffHoursRequest, _callback);
        }

        private TimeOffPoliciesCalculateAccruingTimeOffHoursRequest buildBodyParams() {
            TimeOffPoliciesCalculateAccruingTimeOffHoursRequest timeOffPoliciesCalculateAccruingTimeOffHoursRequest = new TimeOffPoliciesCalculateAccruingTimeOffHoursRequest();
            timeOffPoliciesCalculateAccruingTimeOffHoursRequest.regularHoursWorked(this.regularHoursWorked);
            timeOffPoliciesCalculateAccruingTimeOffHoursRequest.overtimeHoursWorked(this.overtimeHoursWorked);
            timeOffPoliciesCalculateAccruingTimeOffHoursRequest.doubleOvertimeHoursWorked(this.doubleOvertimeHoursWorked);
            timeOffPoliciesCalculateAccruingTimeOffHoursRequest.ptoHoursUsed(this.ptoHoursUsed);
            timeOffPoliciesCalculateAccruingTimeOffHoursRequest.sickHoursUsed(this.sickHoursUsed);
            return timeOffPoliciesCalculateAccruingTimeOffHoursRequest;
        }

        /**
         * Execute calculateAccruingTimeOffHours request
         * @return List&lt;AccruingTimeOffHour&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
         </table>
         */
        public List<AccruingTimeOffHour> execute() throws ApiException {
            TimeOffPoliciesCalculateAccruingTimeOffHoursRequest timeOffPoliciesCalculateAccruingTimeOffHoursRequest = buildBodyParams();
            ApiResponse<List<AccruingTimeOffHour>> localVarResp = calculateAccruingTimeOffHoursWithHttpInfo(payrollId, employeeId, xGustoAPIVersion, timeOffPoliciesCalculateAccruingTimeOffHoursRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute calculateAccruingTimeOffHours request with HTTP info returned
         * @return ApiResponse&lt;List&lt;AccruingTimeOffHour&gt;&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<List<AccruingTimeOffHour>> executeWithHttpInfo() throws ApiException {
            TimeOffPoliciesCalculateAccruingTimeOffHoursRequest timeOffPoliciesCalculateAccruingTimeOffHoursRequest = buildBodyParams();
            return calculateAccruingTimeOffHoursWithHttpInfo(payrollId, employeeId, xGustoAPIVersion, timeOffPoliciesCalculateAccruingTimeOffHoursRequest);
        }

        /**
         * Execute calculateAccruingTimeOffHours request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<List<AccruingTimeOffHour>> _callback) throws ApiException {
            TimeOffPoliciesCalculateAccruingTimeOffHoursRequest timeOffPoliciesCalculateAccruingTimeOffHoursRequest = buildBodyParams();
            return calculateAccruingTimeOffHoursAsync(payrollId, employeeId, xGustoAPIVersion, timeOffPoliciesCalculateAccruingTimeOffHoursRequest, _callback);
        }
    }

    /**
     * Calculate accruing time off hours
     * Returns a list of accruing time off for each time off policy associated with the employee.  Factors affecting the accrued hours:   * the time off policy accrual method (whether they get pay per hour worked, per hour paid, with / without overtime, accumulate time off based on pay period / calendar year / anniversary)   * how many hours of work during this pay period   * how many hours of PTO / sick hours taken during this pay period (for per hour paid policies only)   * company pay schedule frequency (for per pay period)  If none of the parameters is passed in, the accrued time off hour will be 0.  scope: &#x60;payrolls:read&#x60;
     * @param payrollId The UUID of the payroll (required)
     * @param employeeId The UUID of the employee (required)
     * @return CalculateAccruingTimeOffHoursRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
     </table>
     */
    public CalculateAccruingTimeOffHoursRequestBuilder calculateAccruingTimeOffHours(String payrollId, String employeeId) throws IllegalArgumentException {
        if (payrollId == null) throw new IllegalArgumentException("\"payrollId\" is required but got null");
            

        if (employeeId == null) throw new IllegalArgumentException("\"employeeId\" is required but got null");
            

        return new CalculateAccruingTimeOffHoursRequestBuilder(payrollId, employeeId);
    }
}
