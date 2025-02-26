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

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.Event;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EventsApi
 */
@Disabled
public class EventsApiTest {

    private static EventsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new EventsApi(apiClient);
    }

    /**
     * Get all events
     *
     * Fetch all events, going back up to 30 days, that your partner application has the required scopes for. Note that a partner does NOT have to have verified webhook subscriptions in order to utilize this endpoint.  &gt; 📘 Token Authentication &gt; &gt; This endpoint uses the [organization level api token and the Token scheme with HTTP Authorization header](https://docs.gusto.com/embedded-payroll/docs/authentication#api-token-authentication).  scope: &#x60;events:read&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllTest() throws ApiException {
        String startingAfterUuid = null;
        String resourceUuid = null;
        String limit = null;
        String eventType = null;
        String xGustoAPIVersion = null;
        List<Event> response = api.getAll()
                .startingAfterUuid(startingAfterUuid)
                .resourceUuid(resourceUuid)
                .limit(limit)
                .eventType(eventType)
                .xGustoAPIVersion(xGustoAPIVersion)
                .execute();
        // TODO: test validations
    }

}
