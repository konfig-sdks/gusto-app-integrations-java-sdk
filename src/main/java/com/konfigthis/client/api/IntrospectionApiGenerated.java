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


import com.konfigthis.client.model.Authentication;
import com.konfigthis.client.model.IntrospectionAccessTokenInfoResponse;
import com.konfigthis.client.model.IntrospectionExchangeRefreshTokenRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class IntrospectionApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public IntrospectionApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public IntrospectionApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call accessTokenInfoCall(String xGustoAPIVersion, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v1/token_info";

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
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "Authorization" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call accessTokenInfoValidateBeforeCall(String xGustoAPIVersion, final ApiCallback _callback) throws ApiException {
        return accessTokenInfoCall(xGustoAPIVersion, _callback);

    }


    private ApiResponse<IntrospectionAccessTokenInfoResponse> accessTokenInfoWithHttpInfo(String xGustoAPIVersion) throws ApiException {
        okhttp3.Call localVarCall = accessTokenInfoValidateBeforeCall(xGustoAPIVersion, null);
        Type localVarReturnType = new TypeToken<IntrospectionAccessTokenInfoResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call accessTokenInfoAsync(String xGustoAPIVersion, final ApiCallback<IntrospectionAccessTokenInfoResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = accessTokenInfoValidateBeforeCall(xGustoAPIVersion, _callback);
        Type localVarReturnType = new TypeToken<IntrospectionAccessTokenInfoResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class AccessTokenInfoRequestBuilder {
        private String xGustoAPIVersion;

        private AccessTokenInfoRequestBuilder() {
        }

        /**
         * Set xGustoAPIVersion
         * @param xGustoAPIVersion Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. (optional)
         * @return AccessTokenInfoRequestBuilder
         */
        public AccessTokenInfoRequestBuilder xGustoAPIVersion(String xGustoAPIVersion) {
            this.xGustoAPIVersion = xGustoAPIVersion;
            return this;
        }
        
        /**
         * Build call for accessTokenInfo
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
            return accessTokenInfoCall(xGustoAPIVersion, _callback);
        }


        /**
         * Execute accessTokenInfo request
         * @return IntrospectionAccessTokenInfoResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
         </table>
         */
        public IntrospectionAccessTokenInfoResponse execute() throws ApiException {
            ApiResponse<IntrospectionAccessTokenInfoResponse> localVarResp = accessTokenInfoWithHttpInfo(xGustoAPIVersion);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute accessTokenInfo request with HTTP info returned
         * @return ApiResponse&lt;IntrospectionAccessTokenInfoResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<IntrospectionAccessTokenInfoResponse> executeWithHttpInfo() throws ApiException {
            return accessTokenInfoWithHttpInfo(xGustoAPIVersion);
        }

        /**
         * Execute accessTokenInfo request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<IntrospectionAccessTokenInfoResponse> _callback) throws ApiException {
            return accessTokenInfoAsync(xGustoAPIVersion, _callback);
        }
    }

    /**
     * Get info about the current access token
     * Returns scope and resource information associated with the current access token.
     * @return AccessTokenInfoRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
     </table>
     */
    public AccessTokenInfoRequestBuilder accessTokenInfo() throws IllegalArgumentException {
        return new AccessTokenInfoRequestBuilder();
    }
    private okhttp3.Call exchangeRefreshTokenCall(String xGustoAPIVersion, IntrospectionExchangeRefreshTokenRequest introspectionExchangeRefreshTokenRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = introspectionExchangeRefreshTokenRequest;

        // create path and map variables
        String localVarPath = "/oauth/token";

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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call exchangeRefreshTokenValidateBeforeCall(String xGustoAPIVersion, IntrospectionExchangeRefreshTokenRequest introspectionExchangeRefreshTokenRequest, final ApiCallback _callback) throws ApiException {
        return exchangeRefreshTokenCall(xGustoAPIVersion, introspectionExchangeRefreshTokenRequest, _callback);

    }


    private ApiResponse<Authentication> exchangeRefreshTokenWithHttpInfo(String xGustoAPIVersion, IntrospectionExchangeRefreshTokenRequest introspectionExchangeRefreshTokenRequest) throws ApiException {
        okhttp3.Call localVarCall = exchangeRefreshTokenValidateBeforeCall(xGustoAPIVersion, introspectionExchangeRefreshTokenRequest, null);
        Type localVarReturnType = new TypeToken<Authentication>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call exchangeRefreshTokenAsync(String xGustoAPIVersion, IntrospectionExchangeRefreshTokenRequest introspectionExchangeRefreshTokenRequest, final ApiCallback<Authentication> _callback) throws ApiException {

        okhttp3.Call localVarCall = exchangeRefreshTokenValidateBeforeCall(xGustoAPIVersion, introspectionExchangeRefreshTokenRequest, _callback);
        Type localVarReturnType = new TypeToken<Authentication>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ExchangeRefreshTokenRequestBuilder {
        private final String clientId;
        private final String clientSecret;
        private final String refreshToken;
        private final String grantType;
        private String redirectUri;
        private String xGustoAPIVersion;

        private ExchangeRefreshTokenRequestBuilder(String clientId, String clientSecret, String refreshToken, String grantType) {
            this.clientId = clientId;
            this.clientSecret = clientSecret;
            this.refreshToken = refreshToken;
            this.grantType = grantType;
        }

        /**
         * Set redirectUri
         * @param redirectUri The redirect URI you set up via the Developer Portal (optional)
         * @return ExchangeRefreshTokenRequestBuilder
         */
        public ExchangeRefreshTokenRequestBuilder redirectUri(String redirectUri) {
            this.redirectUri = redirectUri;
            return this;
        }
        
        /**
         * Set xGustoAPIVersion
         * @param xGustoAPIVersion Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. (optional)
         * @return ExchangeRefreshTokenRequestBuilder
         */
        public ExchangeRefreshTokenRequestBuilder xGustoAPIVersion(String xGustoAPIVersion) {
            this.xGustoAPIVersion = xGustoAPIVersion;
            return this;
        }
        
        /**
         * Build call for exchangeRefreshToken
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
            IntrospectionExchangeRefreshTokenRequest introspectionExchangeRefreshTokenRequest = buildBodyParams();
            return exchangeRefreshTokenCall(xGustoAPIVersion, introspectionExchangeRefreshTokenRequest, _callback);
        }

        private IntrospectionExchangeRefreshTokenRequest buildBodyParams() {
            IntrospectionExchangeRefreshTokenRequest introspectionExchangeRefreshTokenRequest = new IntrospectionExchangeRefreshTokenRequest();
            introspectionExchangeRefreshTokenRequest.clientId(this.clientId);
            introspectionExchangeRefreshTokenRequest.clientSecret(this.clientSecret);
            introspectionExchangeRefreshTokenRequest.redirectUri(this.redirectUri);
            introspectionExchangeRefreshTokenRequest.refreshToken(this.refreshToken);
            introspectionExchangeRefreshTokenRequest.grantType(this.grantType);
            return introspectionExchangeRefreshTokenRequest;
        }

        /**
         * Execute exchangeRefreshToken request
         * @return Authentication
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
         </table>
         */
        public Authentication execute() throws ApiException {
            IntrospectionExchangeRefreshTokenRequest introspectionExchangeRefreshTokenRequest = buildBodyParams();
            ApiResponse<Authentication> localVarResp = exchangeRefreshTokenWithHttpInfo(xGustoAPIVersion, introspectionExchangeRefreshTokenRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute exchangeRefreshToken request with HTTP info returned
         * @return ApiResponse&lt;Authentication&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Authentication> executeWithHttpInfo() throws ApiException {
            IntrospectionExchangeRefreshTokenRequest introspectionExchangeRefreshTokenRequest = buildBodyParams();
            return exchangeRefreshTokenWithHttpInfo(xGustoAPIVersion, introspectionExchangeRefreshTokenRequest);
        }

        /**
         * Execute exchangeRefreshToken request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Authentication> _callback) throws ApiException {
            IntrospectionExchangeRefreshTokenRequest introspectionExchangeRefreshTokenRequest = buildBodyParams();
            return exchangeRefreshTokenAsync(xGustoAPIVersion, introspectionExchangeRefreshTokenRequest, _callback);
        }
    }

    /**
     * Refresh access token
     * Exchange a refresh token for a new access token.  The previous &#x60;refresh_token&#x60; will be revoked on the first usage of the new &#x60;access_token&#x60;.  The &#x60;expires_in&#x60; value is provided in seconds from when the &#x60;access_token&#x60; was generated.
     * @return ExchangeRefreshTokenRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
     </table>
     */
    public ExchangeRefreshTokenRequestBuilder exchangeRefreshToken(String clientId, String clientSecret, String refreshToken, String grantType) throws IllegalArgumentException {
        if (clientId == null) throw new IllegalArgumentException("\"clientId\" is required but got null");
            

        if (clientSecret == null) throw new IllegalArgumentException("\"clientSecret\" is required but got null");
            

        if (refreshToken == null) throw new IllegalArgumentException("\"refreshToken\" is required but got null");
            

        if (grantType == null) throw new IllegalArgumentException("\"grantType\" is required but got null");
            

        return new ExchangeRefreshTokenRequestBuilder(clientId, clientSecret, refreshToken, grantType);
    }
}
