package com.whispir.api;

import com.whispir.Whispir;
import com.whispir.client.ApiCallback;
import com.whispir.client.ApiClient;
import com.whispir.client.ApiException;
import com.whispir.client.ApiResponse;
import com.whispir.client.Configuration;
import com.whispir.client.Pair;
import com.whispir.client.ProgressRequestBody;
import com.whispir.client.ProgressResponseBody;
import com.whispir.client.auth.ApiKeyAuth;
import com.whispir.client.Version;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import com.whispir.model.ApiError;
import java.math.BigDecimal;
import com.whispir.model.Event;
import com.whispir.model.EventCollection;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;
import javax.ws.rs.core.GenericType;
import java.net.URI;
import java.util.stream.Collectors;

public class EventsApi {
    private static ApiClient localVarApiClient = Configuration.getDefaultApiClient();

    private static okhttp3.Call eventCreateCall(String workspaceId, String xApiKey, String contentType, String accept, Event event, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = event;

        // create path and map variables
        String localVarPath = "/workspaces/{workspaceId}/events"
            .replace("{" + "workspaceId" + "}", localVarApiClient.escapeString(workspaceId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarHeaderParams.put("Authorization", String.format("Basic %s", authHeader));
        localVarHeaderParams.put("User-Agent", String.format("whispir-java-%s", Version.VERSION));

        if (xApiKey != null) {
            localVarHeaderParams.put("X-Api-Key", localVarApiClient.parameterToString(xApiKey));
        }

        if (contentType != null) {
            localVarHeaderParams.put("Content-Type", localVarApiClient.parameterToString(contentType));
        }

        if (accept != null) {
            localVarHeaderParams.put("Accept", localVarApiClient.parameterToString(accept));
        }

        final String[] localVarAccepts = {
            "application/vnd.whispir.event-v1+json",
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/vnd.whispir.event-v1+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth", "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private static okhttp3.Call eventCreateValidateBeforeCall(String workspaceId, String xApiKey, String contentType, String accept, Event event, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'workspaceId' is set
        if (workspaceId == null) {
            throw new ApiException("Missing the required parameter 'workspaceId' when calling eventCreate(Async)");
        }

        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling eventCreate(Async)");
        }

        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new ApiException("Missing the required parameter 'contentType' when calling eventCreate(Async)");
        }

        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling eventCreate(Async)");
        }

        return eventCreateCall(workspaceId, xApiKey, contentType, accept, event, _callback);
    }

    private static ApiResponse<Event> eventCreateWithHttpInfo(String workspaceId, String xApiKey, String contentType, String accept, Event event) throws ApiException {
        okhttp3.Call localVarCall = eventCreateCall(workspaceId, xApiKey, contentType, accept, event, null);
        Type localVarReturnType = new TypeToken<Event>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private static okhttp3.Call eventCreateAsync(String workspaceId, String xApiKey, String contentType, String accept, Event event, final ApiCallback<Event> _callback) throws ApiException {
        okhttp3.Call localVarCall = eventCreateValidateBeforeCall(workspaceId, xApiKey, contentType, accept, event, _callback);
        Type localVarReturnType = new TypeToken<Event>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public static class EventCreateParams {
        private String workspaceId;
        private Event event;

        private EventCreateParams(
            String workspaceId,
            Event event
        ){
            this.workspaceId = workspaceId;
            this.event = event;
        }
            public String getWorkspaceId() {
                return workspaceId;
            }
            public Event getEvent() {
                return event;
            }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private String workspaceId;
            private Event event;

            public EventCreateParams build() {
                return new EventCreateParams(
                    workspaceId,
                    event
                );
            }

            public Builder setWorkspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }
            public Builder setEvent(Event event) {
                this.event = event;
                return this;
            }
        }
        
    }

    public static class EventCreateRequest {
        private final String workspaceId;
        private final String xApiKey;
        private final String contentType;
        private final String accept;
        private Event event;
        ApiResponse _lastResponse;

        private EventCreateRequest(String workspaceId, String xApiKey, String contentType, String accept) {
            this.workspaceId = workspaceId;
            this.xApiKey = xApiKey;
            this.contentType = contentType;
            this.accept = accept;
        }

        /**
         * Set event
         * @param event The Event object to create (optional)
         * @return APIeventCreateRequest
         */
        public EventCreateRequest event(Event event) {
            this.event = event;
            return this;
        }

        /**
         * Build call for eventCreate
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return eventCreateCall(workspaceId, xApiKey, contentType, accept, event, _callback);
        }

        /**
         * Execute eventCreate request
         * @return Event
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public Event execute() throws ApiException {
            ApiResponse<Event> localVarResp = eventCreateWithHttpInfo(workspaceId, xApiKey, contentType, accept, event);
            _lastResponse = localVarResp;
            Event data = localVarResp.getData();

            
            // Special case to extract the resource identifier from the `Location` header.
            // TODO: remove this when ID is returned in response body
            String locationHeader = localVarResp.getHeaders().get("Location").get(0);
            Pattern pattern = Pattern.compile("/([^/]+)/?$", Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(locationHeader);
            if (matcher.find()) {
                data.setDocId(matcher.group(1));
            }
            
            data.lastResponse = localVarResp;
            return data;
        }
        /**
         * Return the last executed API response
         * @return ApiResponse
         */
        public ApiResponse getLastResponse()  {
            return _lastResponse;
        }


        /**
         * Execute eventCreate request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<Event> _callback) throws ApiException {
            return eventCreateAsync(workspaceId, xApiKey, contentType, accept, event, _callback);
        }
    }

    /**
     * Create an event
     * @param params The param instance required to create EventCreateRequest
     * @return Event
     */

    public static Event create(Map<String, Object> params) throws ApiException {
        Event event = null;
        if(params.containsKey("event") && params.get("event") != null){
            event = (Event) params.get("event");
        }
        String workspaceId = (String) params.get("workspaceId");

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }
        EventCreateParams tempParams = EventCreateParams.builder()
            .setWorkspaceId(workspaceId)
            .setEvent(event).build();

        return create(tempParams);
    }

    public static Event create(EventCreateParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }


        String workspaceId = params.getWorkspaceId();

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }

        String contentType = "application/vnd.whispir.event-v1+json";

        String accept = "application/vnd.whispir.event-v1+json";

        EventCreateRequest request = new EventCreateRequest(workspaceId, xApiKey, contentType, accept);

        // Ensure to include all of the 'optionalParams' that are passed
        if(params.event != null){
            Event event = params.getEvent();
            request.event(event);
        }

        return request.execute();
    }
    private static okhttp3.Call eventListCall(String workspaceId, String xApiKey, String accept, String eventType, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/workspaces/{workspaceId}/events"
            .replace("{" + "workspaceId" + "}", localVarApiClient.escapeString(workspaceId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarHeaderParams.put("Authorization", String.format("Basic %s", authHeader));
        localVarHeaderParams.put("User-Agent", String.format("whispir-java-%s", Version.VERSION));

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (offset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offset", offset));
        }

        if (sortOrder != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sortOrder", sortOrder));
        }

        if (sortFields != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sortFields", sortFields));
        }

        if (xApiKey != null) {
            localVarHeaderParams.put("X-Api-Key", localVarApiClient.parameterToString(xApiKey));
        }

        if (accept != null) {
            localVarHeaderParams.put("Accept", localVarApiClient.parameterToString(accept));
        }

        if (eventType != null) {
            localVarHeaderParams.put("eventType", localVarApiClient.parameterToString(eventType));
        }

        final String[] localVarAccepts = {
            "application/vnd.whispir.event-v1+json",
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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth", "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private static okhttp3.Call eventListValidateBeforeCall(String workspaceId, String xApiKey, String accept, String eventType, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'workspaceId' is set
        if (workspaceId == null) {
            throw new ApiException("Missing the required parameter 'workspaceId' when calling eventList(Async)");
        }

        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling eventList(Async)");
        }

        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling eventList(Async)");
        }

        // verify the required parameter 'eventType' is set
        if (eventType == null) {
            throw new ApiException("Missing the required parameter 'eventType' when calling eventList(Async)");
        }

        return eventListCall(workspaceId, xApiKey, accept, eventType, limit, offset, sortOrder, sortFields, _callback);
    }

    private static ApiResponse<EventCollection> eventListWithHttpInfo(String workspaceId, String xApiKey, String accept, String eventType, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields) throws ApiException {
        okhttp3.Call localVarCall = eventListCall(workspaceId, xApiKey, accept, eventType, limit, offset, sortOrder, sortFields, null);
        Type localVarReturnType = new TypeToken<EventCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private static okhttp3.Call eventListAsync(String workspaceId, String xApiKey, String accept, String eventType, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields, final ApiCallback<EventCollection> _callback) throws ApiException {
        okhttp3.Call localVarCall = eventListValidateBeforeCall(workspaceId, xApiKey, accept, eventType, limit, offset, sortOrder, sortFields, _callback);
        Type localVarReturnType = new TypeToken<EventCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public static class EventListParams {
        private String workspaceId;
        private String eventType;
        private BigDecimal limit;
        private BigDecimal offset;
        private String sortOrder;
        private String sortFields;

        private EventListParams(
            String workspaceId,
            String eventType,
            BigDecimal limit,
            BigDecimal offset,
            String sortOrder,
            String sortFields
        ){
            this.workspaceId = workspaceId;
            this.eventType = eventType;
            this.limit = limit;
            this.offset = offset;
            this.sortOrder = sortOrder;
            this.sortFields = sortFields;
        }
            public String getWorkspaceId() {
                return workspaceId;
            }
            public String getEventType() {
                return eventType;
            }
            public BigDecimal getLimit() {
                return limit;
            }
            public BigDecimal getOffset() {
                return offset;
            }
            public String getSortOrder() {
                return sortOrder;
            }
            public String getSortFields() {
                return sortFields;
            }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private String workspaceId;
            private String eventType;
            private BigDecimal limit;
            private BigDecimal offset;
            private String sortOrder;
            private String sortFields;

            public EventListParams build() {
                return new EventListParams(
                    workspaceId,
                    eventType,
                    limit,
                    offset,
                    sortOrder,
                    sortFields
                );
            }

            public Builder setWorkspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }
            public Builder setEventType(String eventType) {
                this.eventType = eventType;
                return this;
            }
            public Builder setLimit(BigDecimal limit) {
                this.limit = limit;
                return this;
            }
            public Builder setOffset(BigDecimal offset) {
                this.offset = offset;
                return this;
            }
            public Builder setSortOrder(String sortOrder) {
                this.sortOrder = sortOrder;
                return this;
            }
            public Builder setSortFields(String sortFields) {
                this.sortFields = sortFields;
                return this;
            }
        }
        
    }

    public static class EventListRequest {
        private final String workspaceId;
        private final String xApiKey;
        private final String accept;
        private final String eventType;
        private BigDecimal limit;
        private BigDecimal offset;
        private String sortOrder;
        private String sortFields;
        ApiResponse _lastResponse;

        private EventListRequest(String workspaceId, String xApiKey, String accept, String eventType) {
            this.workspaceId = workspaceId;
            this.xApiKey = xApiKey;
            this.accept = accept;
            this.eventType = eventType;
        }

        /**
         * Set limit
         * @param limit The number of records to be returned. (optional, default to 20)
         * @return APIeventListRequest
         */
        public EventListRequest limit(BigDecimal limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Set offset
         * @param offset The record number to start returning from. (optional, default to 0)
         * @return APIeventListRequest
         */
        public EventListRequest offset(BigDecimal offset) {
            this.offset = offset;
            return this;
        }

        /**
         * Set sortOrder
         * @param sortOrder The order in which you require the results to be returned. Either ‘asc’ or ‘desc’ (optional)
         * @return APIeventListRequest
         */
        public EventListRequest sortOrder(String sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * Set sortFields
         * @param sortFields The fields that you require the ordering to be performed on. Multiple fields can be provided, separated by a comma. (optional)
         * @return APIeventListRequest
         */
        public EventListRequest sortFields(String sortFields) {
            this.sortFields = sortFields;
            return this;
        }

        /**
         * Build call for eventList
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return eventListCall(workspaceId, xApiKey, accept, eventType, limit, offset, sortOrder, sortFields, _callback);
        }

        /**
         * Execute eventList request
         * @return EventCollection
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public EventCollection execute() throws ApiException {
            ApiResponse<EventCollection> localVarResp = eventListWithHttpInfo(workspaceId, xApiKey, accept, eventType, limit, offset, sortOrder, sortFields);
            _lastResponse = localVarResp;
            EventCollection data = localVarResp.getData();

            
            data.lastResponse = localVarResp;
            return data;
        }
        /**
         * Return the last executed API response
         * @return ApiResponse
         */
        public ApiResponse getLastResponse()  {
            return _lastResponse;
        }


        /**
         * Execute eventList request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<EventCollection> _callback) throws ApiException {
            return eventListAsync(workspaceId, xApiKey, accept, eventType, limit, offset, sortOrder, sortFields, _callback);
        }
    }

    /**
     * List events
     * @param params The param instance required to create EventListRequest
     * @return EventCollection
     */

    public static EventCollection list(Map<String, Object> params) throws ApiException {
        BigDecimal limit = null;
        if(params.containsKey("limit") && params.get("limit") != null){
            limit = (BigDecimal) params.get("limit");
        }
        BigDecimal offset = null;
        if(params.containsKey("offset") && params.get("offset") != null){
            offset = (BigDecimal) params.get("offset");
        }
        String sortOrder = null;
        if(params.containsKey("sortOrder") && params.get("sortOrder") != null){
            sortOrder = (String) params.get("sortOrder");
        }
        String sortFields = null;
        if(params.containsKey("sortFields") && params.get("sortFields") != null){
            sortFields = (String) params.get("sortFields");
        }
        String workspaceId = (String) params.get("workspaceId");

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }
        String eventType = (String) params.get("eventType");

        if(eventType == null || eventType.isEmpty()) {
            throw new ApiException("Missing the required parameter 'eventType'");
        }
        EventListParams tempParams = EventListParams.builder()
            .setWorkspaceId(workspaceId)
            .setEventType(eventType)
            .setLimit(limit)
            .setOffset(offset)
            .setSortOrder(sortOrder)
            .setSortFields(sortFields).build();

        return list(tempParams);
    }

    public static EventCollection list(EventListParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }


        String workspaceId = params.getWorkspaceId();

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }

        String accept = "application/vnd.whispir.event-v1+json";


        String eventType = params.getEventType();

        if(eventType == null || eventType.isEmpty()) {
            throw new ApiException("Missing the required parameter 'eventType'");
        }
        EventListRequest request = new EventListRequest(workspaceId, xApiKey, accept, eventType);

        // Ensure to include all of the 'optionalParams' that are passed
        if(params.limit != null){
            BigDecimal limit = params.getLimit();
            request.limit(limit);
        }
        if(params.offset != null){
            BigDecimal offset = params.getOffset();
            request.offset(offset);
        }
        if(params.sortOrder != null){
            String sortOrder = params.getSortOrder();
            request.sortOrder(sortOrder);
        }
        if(params.sortFields != null){
            String sortFields = params.getSortFields();
            request.sortFields(sortFields);
        }

        return request.execute();
    }
    private static okhttp3.Call eventRetrieveCall(String workspaceId, String eventId, String xApiKey, String accept, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/workspaces/{workspaceId}/events/{eventId}"
            .replace("{" + "workspaceId" + "}", localVarApiClient.escapeString(workspaceId.toString()))
            .replace("{" + "eventId" + "}", localVarApiClient.escapeString(eventId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarHeaderParams.put("Authorization", String.format("Basic %s", authHeader));
        localVarHeaderParams.put("User-Agent", String.format("whispir-java-%s", Version.VERSION));

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (offset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offset", offset));
        }

        if (sortOrder != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sortOrder", sortOrder));
        }

        if (sortFields != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sortFields", sortFields));
        }

        if (xApiKey != null) {
            localVarHeaderParams.put("X-Api-Key", localVarApiClient.parameterToString(xApiKey));
        }

        if (accept != null) {
            localVarHeaderParams.put("Accept", localVarApiClient.parameterToString(accept));
        }

        final String[] localVarAccepts = {
            "application/vnd.whispir.event-v1+json",
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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth", "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private static okhttp3.Call eventRetrieveValidateBeforeCall(String workspaceId, String eventId, String xApiKey, String accept, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'workspaceId' is set
        if (workspaceId == null) {
            throw new ApiException("Missing the required parameter 'workspaceId' when calling eventRetrieve(Async)");
        }

        // verify the required parameter 'eventId' is set
        if (eventId == null) {
            throw new ApiException("Missing the required parameter 'eventId' when calling eventRetrieve(Async)");
        }

        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling eventRetrieve(Async)");
        }

        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling eventRetrieve(Async)");
        }

        return eventRetrieveCall(workspaceId, eventId, xApiKey, accept, limit, offset, sortOrder, sortFields, _callback);
    }

    private static ApiResponse<Event> eventRetrieveWithHttpInfo(String workspaceId, String eventId, String xApiKey, String accept, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields) throws ApiException {
        okhttp3.Call localVarCall = eventRetrieveCall(workspaceId, eventId, xApiKey, accept, limit, offset, sortOrder, sortFields, null);
        Type localVarReturnType = new TypeToken<Event>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private static okhttp3.Call eventRetrieveAsync(String workspaceId, String eventId, String xApiKey, String accept, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields, final ApiCallback<Event> _callback) throws ApiException {
        okhttp3.Call localVarCall = eventRetrieveValidateBeforeCall(workspaceId, eventId, xApiKey, accept, limit, offset, sortOrder, sortFields, _callback);
        Type localVarReturnType = new TypeToken<Event>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public static class EventRetrieveParams {
        private String workspaceId;
        private String eventId;
        private BigDecimal limit;
        private BigDecimal offset;
        private String sortOrder;
        private String sortFields;

        private EventRetrieveParams(
            String workspaceId,
            String eventId,
            BigDecimal limit,
            BigDecimal offset,
            String sortOrder,
            String sortFields
        ){
            this.workspaceId = workspaceId;
            this.eventId = eventId;
            this.limit = limit;
            this.offset = offset;
            this.sortOrder = sortOrder;
            this.sortFields = sortFields;
        }
            public String getWorkspaceId() {
                return workspaceId;
            }
            public String getEventId() {
                return eventId;
            }
            public BigDecimal getLimit() {
                return limit;
            }
            public BigDecimal getOffset() {
                return offset;
            }
            public String getSortOrder() {
                return sortOrder;
            }
            public String getSortFields() {
                return sortFields;
            }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private String workspaceId;
            private String eventId;
            private BigDecimal limit;
            private BigDecimal offset;
            private String sortOrder;
            private String sortFields;

            public EventRetrieveParams build() {
                return new EventRetrieveParams(
                    workspaceId,
                    eventId,
                    limit,
                    offset,
                    sortOrder,
                    sortFields
                );
            }

            public Builder setWorkspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }
            public Builder setEventId(String eventId) {
                this.eventId = eventId;
                return this;
            }
            public Builder setLimit(BigDecimal limit) {
                this.limit = limit;
                return this;
            }
            public Builder setOffset(BigDecimal offset) {
                this.offset = offset;
                return this;
            }
            public Builder setSortOrder(String sortOrder) {
                this.sortOrder = sortOrder;
                return this;
            }
            public Builder setSortFields(String sortFields) {
                this.sortFields = sortFields;
                return this;
            }
        }
        
    }

    public static class EventRetrieveRequest {
        private final String workspaceId;
        private final String eventId;
        private final String xApiKey;
        private final String accept;
        private BigDecimal limit;
        private BigDecimal offset;
        private String sortOrder;
        private String sortFields;
        ApiResponse _lastResponse;

        private EventRetrieveRequest(String workspaceId, String eventId, String xApiKey, String accept) {
            this.workspaceId = workspaceId;
            this.eventId = eventId;
            this.xApiKey = xApiKey;
            this.accept = accept;
        }

        /**
         * Set limit
         * @param limit The number of records to be returned. (optional, default to 20)
         * @return APIeventRetrieveRequest
         */
        public EventRetrieveRequest limit(BigDecimal limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Set offset
         * @param offset The record number to start returning from. (optional, default to 0)
         * @return APIeventRetrieveRequest
         */
        public EventRetrieveRequest offset(BigDecimal offset) {
            this.offset = offset;
            return this;
        }

        /**
         * Set sortOrder
         * @param sortOrder The order in which you require the results to be returned. Either ‘asc’ or ‘desc’ (optional)
         * @return APIeventRetrieveRequest
         */
        public EventRetrieveRequest sortOrder(String sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * Set sortFields
         * @param sortFields The fields that you require the ordering to be performed on. Multiple fields can be provided, separated by a comma. (optional)
         * @return APIeventRetrieveRequest
         */
        public EventRetrieveRequest sortFields(String sortFields) {
            this.sortFields = sortFields;
            return this;
        }

        /**
         * Build call for eventRetrieve
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return eventRetrieveCall(workspaceId, eventId, xApiKey, accept, limit, offset, sortOrder, sortFields, _callback);
        }

        /**
         * Execute eventRetrieve request
         * @return Event
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public Event execute() throws ApiException {
            ApiResponse<Event> localVarResp = eventRetrieveWithHttpInfo(workspaceId, eventId, xApiKey, accept, limit, offset, sortOrder, sortFields);
            _lastResponse = localVarResp;
            Event data = localVarResp.getData();

            
            data.lastResponse = localVarResp;
            return data;
        }
        /**
         * Return the last executed API response
         * @return ApiResponse
         */
        public ApiResponse getLastResponse()  {
            return _lastResponse;
        }


        /**
         * Execute eventRetrieve request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<Event> _callback) throws ApiException {
            return eventRetrieveAsync(workspaceId, eventId, xApiKey, accept, limit, offset, sortOrder, sortFields, _callback);
        }
    }

    /**
     * Retrieve an event
     * @param params The param instance required to create EventRetrieveRequest
     * @return Event
     */

    public static Event retrieve(Map<String, Object> params) throws ApiException {
        BigDecimal limit = null;
        if(params.containsKey("limit") && params.get("limit") != null){
            limit = (BigDecimal) params.get("limit");
        }
        BigDecimal offset = null;
        if(params.containsKey("offset") && params.get("offset") != null){
            offset = (BigDecimal) params.get("offset");
        }
        String sortOrder = null;
        if(params.containsKey("sortOrder") && params.get("sortOrder") != null){
            sortOrder = (String) params.get("sortOrder");
        }
        String sortFields = null;
        if(params.containsKey("sortFields") && params.get("sortFields") != null){
            sortFields = (String) params.get("sortFields");
        }
        String workspaceId = (String) params.get("workspaceId");

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }
        String eventId = (String) params.get("eventId");

        if(eventId == null || eventId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'eventId'");
        }
        EventRetrieveParams tempParams = EventRetrieveParams.builder()
            .setWorkspaceId(workspaceId)
            .setEventId(eventId)
            .setLimit(limit)
            .setOffset(offset)
            .setSortOrder(sortOrder)
            .setSortFields(sortFields).build();

        return retrieve(tempParams);
    }

    public static Event retrieve(EventRetrieveParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }


        String workspaceId = params.getWorkspaceId();

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }

        String eventId = params.getEventId();

        if(eventId == null || eventId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'eventId'");
        }

        String accept = "application/vnd.whispir.event-v1+json";

        EventRetrieveRequest request = new EventRetrieveRequest(workspaceId, eventId, xApiKey, accept);

        // Ensure to include all of the 'optionalParams' that are passed
        if(params.limit != null){
            BigDecimal limit = params.getLimit();
            request.limit(limit);
        }
        if(params.offset != null){
            BigDecimal offset = params.getOffset();
            request.offset(offset);
        }
        if(params.sortOrder != null){
            String sortOrder = params.getSortOrder();
            request.sortOrder(sortOrder);
        }
        if(params.sortFields != null){
            String sortFields = params.getSortFields();
            request.sortFields(sortFields);
        }

        return request.execute();
    }
    private static okhttp3.Call eventUpdateCall(String workspaceId, String eventId, String xApiKey, String contentType, String accept, Event event, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = event;

        // create path and map variables
        String localVarPath = "/workspaces/{workspaceId}/events/{eventId}"
            .replace("{" + "workspaceId" + "}", localVarApiClient.escapeString(workspaceId.toString()))
            .replace("{" + "eventId" + "}", localVarApiClient.escapeString(eventId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarHeaderParams.put("Authorization", String.format("Basic %s", authHeader));
        localVarHeaderParams.put("User-Agent", String.format("whispir-java-%s", Version.VERSION));

        if (xApiKey != null) {
            localVarHeaderParams.put("X-Api-Key", localVarApiClient.parameterToString(xApiKey));
        }

        if (contentType != null) {
            localVarHeaderParams.put("Content-Type", localVarApiClient.parameterToString(contentType));
        }

        if (accept != null) {
            localVarHeaderParams.put("Accept", localVarApiClient.parameterToString(accept));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/vnd.whispir.event-v1+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth", "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private static okhttp3.Call eventUpdateValidateBeforeCall(String workspaceId, String eventId, String xApiKey, String contentType, String accept, Event event, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'workspaceId' is set
        if (workspaceId == null) {
            throw new ApiException("Missing the required parameter 'workspaceId' when calling eventUpdate(Async)");
        }

        // verify the required parameter 'eventId' is set
        if (eventId == null) {
            throw new ApiException("Missing the required parameter 'eventId' when calling eventUpdate(Async)");
        }

        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling eventUpdate(Async)");
        }

        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new ApiException("Missing the required parameter 'contentType' when calling eventUpdate(Async)");
        }

        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling eventUpdate(Async)");
        }

        return eventUpdateCall(workspaceId, eventId, xApiKey, contentType, accept, event, _callback);
    }

    private static ApiResponse<Void> eventUpdateWithHttpInfo(String workspaceId, String eventId, String xApiKey, String contentType, String accept, Event event) throws ApiException {
        okhttp3.Call localVarCall = eventUpdateCall(workspaceId, eventId, xApiKey, contentType, accept, event, null);
        return localVarApiClient.execute(localVarCall);
    }

    private static okhttp3.Call eventUpdateAsync(String workspaceId, String eventId, String xApiKey, String contentType, String accept, Event event, final ApiCallback<Void> _callback) throws ApiException {
        okhttp3.Call localVarCall = eventUpdateValidateBeforeCall(workspaceId, eventId, xApiKey, contentType, accept, event, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public static class EventUpdateParams {
        private String workspaceId;
        private String eventId;
        private Event event;

        private EventUpdateParams(
            String workspaceId,
            String eventId,
            Event event
        ){
            this.workspaceId = workspaceId;
            this.eventId = eventId;
            this.event = event;
        }
            public String getWorkspaceId() {
                return workspaceId;
            }
            public String getEventId() {
                return eventId;
            }
            public Event getEvent() {
                return event;
            }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private String workspaceId;
            private String eventId;
            private Event event;

            public EventUpdateParams build() {
                return new EventUpdateParams(
                    workspaceId,
                    eventId,
                    event
                );
            }

            public Builder setWorkspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }
            public Builder setEventId(String eventId) {
                this.eventId = eventId;
                return this;
            }
            public Builder setEvent(Event event) {
                this.event = event;
                return this;
            }
        }
        
    }

    public static class EventUpdateRequest {
        private final String workspaceId;
        private final String eventId;
        private final String xApiKey;
        private final String contentType;
        private final String accept;
        private Event event;
        ApiResponse _lastResponse;

        private EventUpdateRequest(String workspaceId, String eventId, String xApiKey, String contentType, String accept) {
            this.workspaceId = workspaceId;
            this.eventId = eventId;
            this.xApiKey = xApiKey;
            this.contentType = contentType;
            this.accept = accept;
        }

        /**
         * Set event
         * @param event The Event object to update (optional)
         * @return APIeventUpdateRequest
         */
        public EventUpdateRequest event(Event event) {
            this.event = event;
            return this;
        }

        /**
         * Build call for eventUpdate
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return eventUpdateCall(workspaceId, eventId, xApiKey, contentType, accept, event, _callback);
        }

        /**
         * Execute eventUpdate request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public void execute() throws ApiException {
            eventUpdateWithHttpInfo(workspaceId, eventId, xApiKey, contentType, accept, event);
        }
        /**
         * Return the last executed API response
         * @return ApiResponse
         */
        public ApiResponse getLastResponse()  {
            return _lastResponse;
        }


        /**
         * Execute eventUpdate request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return eventUpdateAsync(workspaceId, eventId, xApiKey, contentType, accept, event, _callback);
        }
    }

    /**
     * Update an event
     * @param params The param instance required to create EventUpdateRequest
     * @return void
     */

    public static void update(Map<String, Object> params) throws ApiException {
        Event event = null;
        if(params.containsKey("event") && params.get("event") != null){
            event = (Event) params.get("event");
        }
        String workspaceId = (String) params.get("workspaceId");

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }
        String eventId = (String) params.get("eventId");

        if(eventId == null || eventId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'eventId'");
        }
        EventUpdateParams tempParams = EventUpdateParams.builder()
            .setWorkspaceId(workspaceId)
            .setEventId(eventId)
            .setEvent(event).build();

        update(tempParams);
    }

    public static void update(EventUpdateParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }


        String workspaceId = params.getWorkspaceId();

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }

        String eventId = params.getEventId();

        if(eventId == null || eventId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'eventId'");
        }

        String contentType = "application/vnd.whispir.event-v1+json";

        String accept = "application/vnd.whispir.event-v1+json";

        EventUpdateRequest request = new EventUpdateRequest(workspaceId, eventId, xApiKey, contentType, accept);

        // Ensure to include all of the 'optionalParams' that are passed
        if(params.event != null){
            Event event = params.getEvent();
            request.event(event);
        }

        request.execute();
    }
}
