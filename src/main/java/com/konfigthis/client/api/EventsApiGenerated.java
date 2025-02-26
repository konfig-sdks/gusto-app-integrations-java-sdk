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


import com.konfigthis.client.model.Event;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class EventsApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public EventsApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public EventsApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call getAllCall(String startingAfterUuid, String resourceUuid, String limit, String eventType, String xGustoAPIVersion, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/events";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (startingAfterUuid != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("starting_after_uuid", startingAfterUuid));
        }

        if (resourceUuid != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("resource_uuid", resourceUuid));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (eventType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("event_type", eventType));
        }

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
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAllValidateBeforeCall(String startingAfterUuid, String resourceUuid, String limit, String eventType, String xGustoAPIVersion, final ApiCallback _callback) throws ApiException {
        return getAllCall(startingAfterUuid, resourceUuid, limit, eventType, xGustoAPIVersion, _callback);

    }


    private ApiResponse<List<Event>> getAllWithHttpInfo(String startingAfterUuid, String resourceUuid, String limit, String eventType, String xGustoAPIVersion) throws ApiException {
        okhttp3.Call localVarCall = getAllValidateBeforeCall(startingAfterUuid, resourceUuid, limit, eventType, xGustoAPIVersion, null);
        Type localVarReturnType = new TypeToken<List<Event>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getAllAsync(String startingAfterUuid, String resourceUuid, String limit, String eventType, String xGustoAPIVersion, final ApiCallback<List<Event>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAllValidateBeforeCall(startingAfterUuid, resourceUuid, limit, eventType, xGustoAPIVersion, _callback);
        Type localVarReturnType = new TypeToken<List<Event>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetAllRequestBuilder {
        private String startingAfterUuid;
        private String resourceUuid;
        private String limit;
        private String eventType;
        private String xGustoAPIVersion;

        private GetAllRequestBuilder() {
        }

        /**
         * Set startingAfterUuid
         * @param startingAfterUuid A cursor for pagination. Returns all events occuring after the specified UUID (exclusive) (optional)
         * @return GetAllRequestBuilder
         */
        public GetAllRequestBuilder startingAfterUuid(String startingAfterUuid) {
            this.startingAfterUuid = startingAfterUuid;
            return this;
        }
        
        /**
         * Set resourceUuid
         * @param resourceUuid The UUID of the company. If not specified, will return all events for all companies. (optional)
         * @return GetAllRequestBuilder
         */
        public GetAllRequestBuilder resourceUuid(String resourceUuid) {
            this.resourceUuid = resourceUuid;
            return this;
        }
        
        /**
         * Set limit
         * @param limit Limits the number of objects returned in a single response, between 1 and 100. The default is 25 (optional)
         * @return GetAllRequestBuilder
         */
        public GetAllRequestBuilder limit(String limit) {
            this.limit = limit;
            return this;
        }
        
        /**
         * Set eventType
         * @param eventType A string containing the exact event name (e.g. &#x60;employee.created&#x60;), or use a wildcard match to filter for a group of events (e.g. &#x60;employee.*&#x60;, &#x60;*.created&#x60;, &#x60;notification.*.created&#x60; etc.) (optional)
         * @return GetAllRequestBuilder
         */
        public GetAllRequestBuilder eventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        
        /**
         * Set xGustoAPIVersion
         * @param xGustoAPIVersion Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. (optional)
         * @return GetAllRequestBuilder
         */
        public GetAllRequestBuilder xGustoAPIVersion(String xGustoAPIVersion) {
            this.xGustoAPIVersion = xGustoAPIVersion;
            return this;
        }
        
        /**
         * Build call for getAll
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
            return getAllCall(startingAfterUuid, resourceUuid, limit, eventType, xGustoAPIVersion, _callback);
        }


        /**
         * Execute getAll request
         * @return List&lt;Event&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
         </table>
         */
        public List<Event> execute() throws ApiException {
            ApiResponse<List<Event>> localVarResp = getAllWithHttpInfo(startingAfterUuid, resourceUuid, limit, eventType, xGustoAPIVersion);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getAll request with HTTP info returned
         * @return ApiResponse&lt;List&lt;Event&gt;&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<List<Event>> executeWithHttpInfo() throws ApiException {
            return getAllWithHttpInfo(startingAfterUuid, resourceUuid, limit, eventType, xGustoAPIVersion);
        }

        /**
         * Execute getAll request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<List<Event>> _callback) throws ApiException {
            return getAllAsync(startingAfterUuid, resourceUuid, limit, eventType, xGustoAPIVersion, _callback);
        }
    }

    /**
     * Get all events
     * Fetch all events, going back up to 30 days, that your partner application has the required scopes for. Note that a partner does NOT have to have verified webhook subscriptions in order to utilize this endpoint.  &gt; 📘 Token Authentication &gt; &gt; This endpoint uses the [organization level api token and the Token scheme with HTTP Authorization header](https://docs.gusto.com/embedded-payroll/docs/authentication#api-token-authentication).  scope: &#x60;events:read&#x60;
     * @return GetAllRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
     </table>
     */
    public GetAllRequestBuilder getAll() throws IllegalArgumentException {
        return new GetAllRequestBuilder();
    }
}
