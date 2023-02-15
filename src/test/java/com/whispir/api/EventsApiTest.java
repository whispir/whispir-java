package com.whispir.api;

import com.whispir.client.ApiException;
import com.whispir.model.ApiError;
import java.math.BigDecimal;
import com.whispir.model.Event;
import com.whispir.model.EventCollection;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.net.URI;

import com.whispir.api.EventsApi.EventCreateParams;
import com.whispir.api.EventsApi.EventListParams;
import com.whispir.api.EventsApi.EventRetrieveParams;
import com.whispir.api.EventsApi.EventUpdateParams;

/**
 * API tests for EventsApi
 */
@Disabled
public class EventsApiTest {
    private final EventsApi api = new EventsApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void EventCreateTest() throws ApiException {
        String workspaceId = null;
        Event event = null;
        EventCreateParams params = EventCreateParams.builder()
                                        .setWorkspaceId(workspaceId)
                                        .setEvent(event)
                                        .build();
        Event response = api.create(params);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void EventListTest() throws ApiException {
        String workspaceId = null;
        BigDecimal limit = null;
        BigDecimal offset = null;
        String sortOrder = null;
        String sortFields = null;
        EventListParams params = EventListParams.builder()
                                        .setWorkspaceId(workspaceId)
                                        .setLimit(limit)
                                        .setOffset(offset)
                                        .setSortOrder(sortOrder)
                                        .setSortFields(sortFields)
                                        .build();
        EventCollection response = api.list(params);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void EventRetrieveTest() throws ApiException {
        String workspaceId = null;
        String eventId = null;
        BigDecimal limit = null;
        BigDecimal offset = null;
        String sortOrder = null;
        String sortFields = null;
        EventRetrieveParams params = EventRetrieveParams.builder()
                                        .setWorkspaceId(workspaceId)
                                        .setEventId(eventId)
                                        .setLimit(limit)
                                        .setOffset(offset)
                                        .setSortOrder(sortOrder)
                                        .setSortFields(sortFields)
                                        .build();
        Event response = api.retrieve(params);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void EventUpdateTest() throws ApiException {
        String workspaceId = null;
        String eventId = null;
        Event event = null;
        EventUpdateParams params = EventUpdateParams.builder()
                                        .setWorkspaceId(workspaceId)
                                        .setEventId(eventId)
                                        .setEvent(event)
                                        .build();
        api.update(params);
        // TODO: test validations
    }

}
