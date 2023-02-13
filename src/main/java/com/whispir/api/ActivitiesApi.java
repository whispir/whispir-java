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
import com.whispir.model.Activity;
import com.whispir.model.ActivityCollection;
import com.whispir.model.ApiError;
import java.math.BigDecimal;

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

public class ActivitiesApi {
    private static ApiClient localVarApiClient = Configuration.getDefaultApiClient();

    private static okhttp3.Call activityCreateCall(String xApiKey, String contentType, String accept, Activity activity, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = activity;

        // create path and map variables
        String localVarPath = "/activities";

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
            "application/vnd.whispir.activity-v1+json",
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/vnd.whispir.activity-v1+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth", "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private static okhttp3.Call activityCreateValidateBeforeCall(String xApiKey, String contentType, String accept, Activity activity, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling activityCreate(Async)");
        }

        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new ApiException("Missing the required parameter 'contentType' when calling activityCreate(Async)");
        }

        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling activityCreate(Async)");
        }

        // verify the required parameter 'activity' is set
        if (activity == null) {
            throw new ApiException("Missing the required parameter 'activity' when calling activityCreate(Async)");
        }

        return activityCreateCall(xApiKey, contentType, accept, activity, _callback);
    }

    private static ApiResponse<Activity> activityCreateWithHttpInfo(String xApiKey, String contentType, String accept, Activity activity) throws ApiException {
        okhttp3.Call localVarCall = activityCreateCall(xApiKey, contentType, accept, activity, null);
        Type localVarReturnType = new TypeToken<Activity>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private static okhttp3.Call activityCreateAsync(String xApiKey, String contentType, String accept, Activity activity, final ApiCallback<Activity> _callback) throws ApiException {
        okhttp3.Call localVarCall = activityCreateValidateBeforeCall(xApiKey, contentType, accept, activity, _callback);
        Type localVarReturnType = new TypeToken<Activity>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public static class ActivityCreateParams {
        private Activity activity;
        private String user;
        private String time;
        private String action;
        private String description;
        private String status;
        private String module;
        private String workspaceName;
        private String fullname;

        private ActivityCreateParams(
            Activity activity,
            String user,
            String time,
            String action,
            String description,
            String status,
            String module,
            String workspaceName,
            String fullname
        ){
            this.activity = activity;
            this.user = user;
            this.time = time;
            this.action = action;
            this.description = description;
            this.status = status;
            this.module = module;
            this.workspaceName = workspaceName;
            this.fullname = fullname;
        }
            public Activity getActivity() {
                return activity;
            }
            public String getUser() {
                return user;
            }
            public String getTime() {
                return time;
            }
            public enum ActionEnum {
            CREATE("Create"),
            
            UPDATE("Update"),
            
            MOVE("Move"),
            
            COPY("Copy"),
            
            DRAFT("Draft"),
            
            SEND("Send"),
            
            MODIFIED("Modified"),
            
            DELETE("Delete"),
            
            CONTACT_IMPORT_FILE("Contact Import File"),
            
            LOGIN("Login"),
            
            APPROVE("Approve"),
            
            REJECT("Reject"),
            
            DISPATCH("Dispatch"),
            
            REGISTER("Register"),
            
            ACCEPT("Accept"),
            
            CLOSED("Closed"),
            
            MAP("Map"),
            
            UN_MAP("Un-map"),
            
            LOGOUT("Logout");
                private String value;
                ActionEnum(String value){
                    this.value = value;
                }

                public String getValue() {
                    return value;
                }
                
                @Override
                public String toString() {
                    return String.valueOf(value);
                }

                public static ActionEnum fromValue(String value) {
                    for (ActionEnum b : ActionEnum.values()) {
                        if (b.value.equals(value)) {
                            return b;
                        }
                    }
                    throw new IllegalArgumentException("Unexpected value '" + value + "'");
                }

            }
            public String getAction() {
                return action;
            }
            public String getDescription() {
                return description;
            }
            public String getStatus() {
                return status;
            }
            public enum ModuleEnum {
            SYSTEM("System"),
            
            MESSAGE("Message"),
            
            SCHEDULED_MESSAGE("Scheduled Message"),
            
            USER("User"),
            
            CONTACT("Contact"),
            
            DISTRIBUTION_LIST("Distribution List"),
            
            TEMPLATE("Template"),
            
            WORKSPACE("Workspace"),
            
            EVENT("Event"),
            
            WEB_SERVICE("WebService"),
            
            SETTINGS("Settings"),
            
            CONVERSATION("Conversation"),
            
            GATEWAY("Gateway"),
            
            WORKSPACE_MAPPING("Workspace Mapping"),
            
            FOLDERS("Folders"),
            
            TEAM("Team"),
            
            RSS("RSS"),
            
            API_MAPPING("API Mapping"),
            
            ASSET("Asset"),
            
            INSTRUCTION("Instruction");
                private String value;
                ModuleEnum(String value){
                    this.value = value;
                }

                public String getValue() {
                    return value;
                }
                
                @Override
                public String toString() {
                    return String.valueOf(value);
                }

                public static ModuleEnum fromValue(String value) {
                    for (ModuleEnum b : ModuleEnum.values()) {
                        if (b.value.equals(value)) {
                            return b;
                        }
                    }
                    throw new IllegalArgumentException("Unexpected value '" + value + "'");
                }

            }
            public String getModule() {
                return module;
            }
            public String getWorkspaceName() {
                return workspaceName;
            }
            public String getFullname() {
                return fullname;
            }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private Activity activity;
            private String user;
            private String time;
            private String action;
            private String description;
            private String status;
            private String module;
            private String workspaceName;
            private String fullname;

            public ActivityCreateParams build() {
                return new ActivityCreateParams(
                    activity,
                    user,
                    time,
                    action,
                    description,
                    status,
                    module,
                    workspaceName,
                    fullname
                );
            }

            public Builder setActivity(Activity activity) {
                this.activity = activity;
                return this;
            }
            public Builder setUser(String user) {
                this.user = user;
                return this;
            }
            public Builder setTime(String time) {
                this.time = time;
                return this;
            }
            public Builder setAction(ActionEnum action) {
                this.action = action.getValue();
                return this;
            }
            public Builder setDescription(String description) {
                this.description = description;
                return this;
            }
            public Builder setStatus(String status) {
                this.status = status;
                return this;
            }
            public Builder setModule(ModuleEnum module) {
                this.module = module.getValue();
                return this;
            }
            public Builder setWorkspaceName(String workspaceName) {
                this.workspaceName = workspaceName;
                return this;
            }
            public Builder setFullname(String fullname) {
                this.fullname = fullname;
                return this;
            }
        }
        

    }

    public static class ActivityCreateRequest {
        private final String xApiKey;
        private final String contentType;
        private final String accept;
        private final Activity activity;
        ApiResponse _lastResponse;

        private ActivityCreateRequest(String xApiKey, String contentType, String accept, Activity activity) {
            this.xApiKey = xApiKey;
            this.contentType = contentType;
            this.accept = accept;
            this.activity = activity;
        }

        /**
         * Build call for activityCreate
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return activityCreateCall(xApiKey, contentType, accept, activity, _callback);
        }

        /**
         * Execute activityCreate request
         * @return Activity
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public Activity execute() throws ApiException {
            ApiResponse<Activity> localVarResp = activityCreateWithHttpInfo(xApiKey, contentType, accept, activity);
            _lastResponse = localVarResp;
            Activity data = localVarResp.getData();

            
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
         * Execute activityCreate request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<Activity> _callback) throws ApiException {
            return activityCreateAsync(xApiKey, contentType, accept, activity, _callback);
        }
    }

    /**
     * Create an activity
     * @param params The param instance required to create ActivityCreateRequest
     * @return Activity
     */

    public static Activity create(Map<String, Object> params) throws ApiException {
        String userValue = (String) params.get("user");
        String timeValue = (String) params.get("time");
        com.whispir.api.ActivitiesApi.ActivityCreateParams.ActionEnum actionValue = com.whispir.api.ActivitiesApi.ActivityCreateParams.ActionEnum.valueOf((String) params.get("action"));
        String descriptionValue = (String) params.get("description");
        String statusValue = (String) params.get("status");
        com.whispir.api.ActivitiesApi.ActivityCreateParams.ModuleEnum moduleValue = com.whispir.api.ActivitiesApi.ActivityCreateParams.ModuleEnum.valueOf((String) params.get("module"));
        String workspaceNameValue = (String) params.get("workspaceName");
        String fullnameValue = (String) params.get("fullname");
        ActivityCreateParams tempParams = ActivityCreateParams.builder()
            .setUser(userValue)
            .setTime(timeValue)
            .setAction(actionValue)
            .setDescription(descriptionValue)
            .setStatus(statusValue)
            .setModule(moduleValue)
            .setWorkspaceName(workspaceNameValue)
            .setFullname(fullnameValue).build();

        return create(tempParams);
    }

    public static Activity create(ActivityCreateParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }


        String contentType = "application/vnd.whispir.activity-v1+json";

        String accept = "application/vnd.whispir.activity-v1+json";


        // Constructing 'Activity' from 'ActivityCreateParams' instance passed
        Activity activity = new Activity();
        String userValue = params.getUser();
        activity.setUser(userValue);

        String timeValue = params.getTime();
        activity.setTime(timeValue);

        String actionValue = params.getAction();
        activity.setAction(actionValue);

        String descriptionValue = params.getDescription();
        activity.setDescription(descriptionValue);

        String statusValue = params.getStatus();
        activity.setStatus(statusValue);

        String moduleValue = params.getModule();
        activity.setModule(moduleValue);

        String workspaceNameValue = params.getWorkspaceName();
        activity.setWorkspaceName(workspaceNameValue);

        String fullnameValue = params.getFullname();
        activity.setFullname(fullnameValue);

        ActivityCreateRequest request = new ActivityCreateRequest(xApiKey, contentType, accept, activity);

        // Ensure to include all of the 'optionalParams' that are passed

        return request.execute();
    }
    private static okhttp3.Call activityListCall(String xApiKey, String accept, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields, String action, String module, String user, String workspace, String status, String description, String startTime, String endTime, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/activities";

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

        if (action != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("action", action));
        }

        if (module != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("module", module));
        }

        if (user != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("user", user));
        }

        if (workspace != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("workspace", workspace));
        }

        if (status != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("status", status));
        }

        if (description != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("description", description));
        }

        if (startTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("Start time", startTime));
        }

        if (endTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("End time", endTime));
        }

        if (xApiKey != null) {
            localVarHeaderParams.put("X-Api-Key", localVarApiClient.parameterToString(xApiKey));
        }

        if (accept != null) {
            localVarHeaderParams.put("Accept", localVarApiClient.parameterToString(accept));
        }

        final String[] localVarAccepts = {
            "examples",
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
    private static okhttp3.Call activityListValidateBeforeCall(String xApiKey, String accept, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields, String action, String module, String user, String workspace, String status, String description, String startTime, String endTime, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling activityList(Async)");
        }

        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling activityList(Async)");
        }

        return activityListCall(xApiKey, accept, limit, offset, sortOrder, sortFields, action, module, user, workspace, status, description, startTime, endTime, _callback);
    }

    private static ApiResponse<ActivityCollection> activityListWithHttpInfo(String xApiKey, String accept, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields, String action, String module, String user, String workspace, String status, String description, String startTime, String endTime) throws ApiException {
        okhttp3.Call localVarCall = activityListCall(xApiKey, accept, limit, offset, sortOrder, sortFields, action, module, user, workspace, status, description, startTime, endTime, null);
        Type localVarReturnType = new TypeToken<ActivityCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private static okhttp3.Call activityListAsync(String xApiKey, String accept, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields, String action, String module, String user, String workspace, String status, String description, String startTime, String endTime, final ApiCallback<ActivityCollection> _callback) throws ApiException {
        okhttp3.Call localVarCall = activityListValidateBeforeCall(xApiKey, accept, limit, offset, sortOrder, sortFields, action, module, user, workspace, status, description, startTime, endTime, _callback);
        Type localVarReturnType = new TypeToken<ActivityCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public static class ActivityListParams {
        private BigDecimal limit;
        private BigDecimal offset;
        private String sortOrder;
        private String sortFields;
        private String action;
        private String module;
        private String user;
        private String workspace;
        private String status;
        private String description;
        private String startTime;
        private String endTime;

        private ActivityListParams(
            BigDecimal limit,
            BigDecimal offset,
            String sortOrder,
            String sortFields,
            String action,
            String module,
            String user,
            String workspace,
            String status,
            String description,
            String startTime,
            String endTime
        ){
            this.limit = limit;
            this.offset = offset;
            this.sortOrder = sortOrder;
            this.sortFields = sortFields;
            this.action = action;
            this.module = module;
            this.user = user;
            this.workspace = workspace;
            this.status = status;
            this.description = description;
            this.startTime = startTime;
            this.endTime = endTime;
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
            public String getAction() {
                return action;
            }
            public String getModule() {
                return module;
            }
            public String getUser() {
                return user;
            }
            public String getWorkspace() {
                return workspace;
            }
            public String getStatus() {
                return status;
            }
            public String getDescription() {
                return description;
            }
            public String getStartTime() {
                return startTime;
            }
            public String getEndTime() {
                return endTime;
            }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private BigDecimal limit;
            private BigDecimal offset;
            private String sortOrder;
            private String sortFields;
            private String action;
            private String module;
            private String user;
            private String workspace;
            private String status;
            private String description;
            private String startTime;
            private String endTime;

            public ActivityListParams build() {
                return new ActivityListParams(
                    limit,
                    offset,
                    sortOrder,
                    sortFields,
                    action,
                    module,
                    user,
                    workspace,
                    status,
                    description,
                    startTime,
                    endTime
                );
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
            public Builder setAction(String action) {
                this.action = action;
                return this;
            }
            public Builder setModule(String module) {
                this.module = module;
                return this;
            }
            public Builder setUser(String user) {
                this.user = user;
                return this;
            }
            public Builder setWorkspace(String workspace) {
                this.workspace = workspace;
                return this;
            }
            public Builder setStatus(String status) {
                this.status = status;
                return this;
            }
            public Builder setDescription(String description) {
                this.description = description;
                return this;
            }
            public Builder setStartTime(String startTime) {
                this.startTime = startTime;
                return this;
            }
            public Builder setEndTime(String endTime) {
                this.endTime = endTime;
                return this;
            }
        }
        
    }

    public static class ActivityListRequest {
        private final String xApiKey;
        private final String accept;
        private BigDecimal limit;
        private BigDecimal offset;
        private String sortOrder;
        private String sortFields;
        private String action;
        private String module;
        private String user;
        private String workspace;
        private String status;
        private String description;
        private String startTime;
        private String endTime;
        ApiResponse _lastResponse;

        private ActivityListRequest(String xApiKey, String accept) {
            this.xApiKey = xApiKey;
            this.accept = accept;
        }

        /**
         * Set limit
         * @param limit The number of records to be returned. (optional, default to 20)
         * @return APIactivityListRequest
         */
        public ActivityListRequest limit(BigDecimal limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Set offset
         * @param offset The record number to start returning from. (optional, default to 0)
         * @return APIactivityListRequest
         */
        public ActivityListRequest offset(BigDecimal offset) {
            this.offset = offset;
            return this;
        }

        /**
         * Set sortOrder
         * @param sortOrder The order in which you require the results to be returned. Either ‘asc’ or ‘desc’ (optional)
         * @return APIactivityListRequest
         */
        public ActivityListRequest sortOrder(String sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * Set sortFields
         * @param sortFields The fields that you require the ordering to be performed on. Multiple fields can be provided, separated by a comma. (optional)
         * @return APIactivityListRequest
         */
        public ActivityListRequest sortFields(String sortFields) {
            this.sortFields = sortFields;
            return this;
        }

        /**
         * Set action
         * @param action /activities?action&#x3D;Map (optional)
         * @return APIactivityListRequest
         */
        public ActivityListRequest action(String action) {
            this.action = action;
            return this;
        }

        /**
         * Set module
         * @param module /activities?module&#x3D;Message (optional)
         * @return APIactivityListRequest
         */
        public ActivityListRequest module(String module) {
            this.module = module;
            return this;
        }

        /**
         * Set user
         * @param user /activities?user&#x3D;james (optional)
         * @return APIactivityListRequest
         */
        public ActivityListRequest user(String user) {
            this.user = user;
            return this;
        }

        /**
         * Set workspace
         * @param workspace /activities?workspace&#x3D;Whispir. (optional)
         * @return APIactivityListRequest
         */
        public ActivityListRequest workspace(String workspace) {
            this.workspace = workspace;
            return this;
        }

        /**
         * Set status
         * @param status /activities?status&#x3D;Successful (optional)
         * @return APIactivityListRequest
         */
        public ActivityListRequest status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Set description
         * @param description /activities?description&#x3D;Imported (optional)
         * @return APIactivityListRequest
         */
        public ActivityListRequest description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Set startTime
         * @param startTime The date and time to start searching from in the format:dd/mm/yyyy hh:mm. This will search on the &#x60;time&#x60; field &lt;p&gt;/activities?startTime&#x3D;01/01/2015%2000:00&lt;/p&gt; (optional)
         * @return APIactivityListRequest
         */
        public ActivityListRequest startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * Set endTime
         * @param endTime The date and time to start searching from in the format:dd/mm/yyyy hh:mm &lt;p&gt;/activities?endTime&#x3D;01/01/2015%2000:00&lt;/p&gt; (optional)
         * @return APIactivityListRequest
         */
        public ActivityListRequest endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * Build call for activityList
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return activityListCall(xApiKey, accept, limit, offset, sortOrder, sortFields, action, module, user, workspace, status, description, startTime, endTime, _callback);
        }

        /**
         * Execute activityList request
         * @return ActivityCollection
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public ActivityCollection execute() throws ApiException {
            ApiResponse<ActivityCollection> localVarResp = activityListWithHttpInfo(xApiKey, accept, limit, offset, sortOrder, sortFields, action, module, user, workspace, status, description, startTime, endTime);
            _lastResponse = localVarResp;
            ActivityCollection data = localVarResp.getData();

            
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
         * Execute activityList request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<ActivityCollection> _callback) throws ApiException {
            return activityListAsync(xApiKey, accept, limit, offset, sortOrder, sortFields, action, module, user, workspace, status, description, startTime, endTime, _callback);
        }
    }

    /**
     * List activities
     * @param params The param instance required to create ActivityListRequest
     * @return ActivityCollection
     */

    public static ActivityCollection list(Map<String, Object> params) throws ApiException {
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
        String action = null;
        if(params.containsKey("action") && params.get("action") != null){
            action = (String) params.get("action");
        }
        String module = null;
        if(params.containsKey("module") && params.get("module") != null){
            module = (String) params.get("module");
        }
        String user = null;
        if(params.containsKey("user") && params.get("user") != null){
            user = (String) params.get("user");
        }
        String workspace = null;
        if(params.containsKey("workspace") && params.get("workspace") != null){
            workspace = (String) params.get("workspace");
        }
        String status = null;
        if(params.containsKey("status") && params.get("status") != null){
            status = (String) params.get("status");
        }
        String description = null;
        if(params.containsKey("description") && params.get("description") != null){
            description = (String) params.get("description");
        }
        String startTime = null;
        if(params.containsKey("startTime") && params.get("startTime") != null){
            startTime = (String) params.get("startTime");
        }
        String endTime = null;
        if(params.containsKey("endTime") && params.get("endTime") != null){
            endTime = (String) params.get("endTime");
        }
        ActivityListParams tempParams = ActivityListParams.builder()
            .setLimit(limit)
            .setOffset(offset)
            .setSortOrder(sortOrder)
            .setSortFields(sortFields)
            .setAction(action)
            .setModule(module)
            .setUser(user)
            .setWorkspace(workspace)
            .setStatus(status)
            .setDescription(description)
            .setStartTime(startTime)
            .setEndTime(endTime).build();

        return list(tempParams);
    }

    public static ActivityCollection list(ActivityListParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }


        String accept = "application/vnd.whispir.activity-v1+json";

        ActivityListRequest request = new ActivityListRequest(xApiKey, accept);

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
        if(params.action != null){
            String action = params.getAction();
            request.action(action);
        }
        if(params.module != null){
            String module = params.getModule();
            request.module(module);
        }
        if(params.user != null){
            String user = params.getUser();
            request.user(user);
        }
        if(params.workspace != null){
            String workspace = params.getWorkspace();
            request.workspace(workspace);
        }
        if(params.status != null){
            String status = params.getStatus();
            request.status(status);
        }
        if(params.description != null){
            String description = params.getDescription();
            request.description(description);
        }
        if(params.startTime != null){
            String startTime = params.getStartTime();
            request.startTime(startTime);
        }
        if(params.endTime != null){
            String endTime = params.getEndTime();
            request.endTime(endTime);
        }

        return request.execute();
    }
    private static okhttp3.Call activityWorkspaceListCall(String workspaceId, String xApiKey, String accept, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/workspaces/{workspaceId}/activities"
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

        final String[] localVarAccepts = {
            "application/vnd.whispir.activity-v1+json",
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
    private static okhttp3.Call activityWorkspaceListValidateBeforeCall(String workspaceId, String xApiKey, String accept, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'workspaceId' is set
        if (workspaceId == null) {
            throw new ApiException("Missing the required parameter 'workspaceId' when calling activityWorkspaceList(Async)");
        }

        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling activityWorkspaceList(Async)");
        }

        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling activityWorkspaceList(Async)");
        }

        return activityWorkspaceListCall(workspaceId, xApiKey, accept, limit, offset, sortOrder, sortFields, _callback);
    }

    private static ApiResponse<ActivityCollection> activityWorkspaceListWithHttpInfo(String workspaceId, String xApiKey, String accept, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields) throws ApiException {
        okhttp3.Call localVarCall = activityWorkspaceListCall(workspaceId, xApiKey, accept, limit, offset, sortOrder, sortFields, null);
        Type localVarReturnType = new TypeToken<ActivityCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private static okhttp3.Call activityWorkspaceListAsync(String workspaceId, String xApiKey, String accept, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields, final ApiCallback<ActivityCollection> _callback) throws ApiException {
        okhttp3.Call localVarCall = activityWorkspaceListValidateBeforeCall(workspaceId, xApiKey, accept, limit, offset, sortOrder, sortFields, _callback);
        Type localVarReturnType = new TypeToken<ActivityCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public static class ActivityWorkspaceListParams {
        private String workspaceId;
        private BigDecimal limit;
        private BigDecimal offset;
        private String sortOrder;
        private String sortFields;

        private ActivityWorkspaceListParams(
            String workspaceId,
            BigDecimal limit,
            BigDecimal offset,
            String sortOrder,
            String sortFields
        ){
            this.workspaceId = workspaceId;
            this.limit = limit;
            this.offset = offset;
            this.sortOrder = sortOrder;
            this.sortFields = sortFields;
        }
            public String getWorkspaceId() {
                return workspaceId;
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
            private BigDecimal limit;
            private BigDecimal offset;
            private String sortOrder;
            private String sortFields;

            public ActivityWorkspaceListParams build() {
                return new ActivityWorkspaceListParams(
                    workspaceId,
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

    public static class ActivityWorkspaceListRequest {
        private final String workspaceId;
        private final String xApiKey;
        private final String accept;
        private BigDecimal limit;
        private BigDecimal offset;
        private String sortOrder;
        private String sortFields;
        ApiResponse _lastResponse;

        private ActivityWorkspaceListRequest(String workspaceId, String xApiKey, String accept) {
            this.workspaceId = workspaceId;
            this.xApiKey = xApiKey;
            this.accept = accept;
        }

        /**
         * Set limit
         * @param limit The number of records to be returned. (optional, default to 20)
         * @return APIactivityWorkspaceListRequest
         */
        public ActivityWorkspaceListRequest limit(BigDecimal limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Set offset
         * @param offset The record number to start returning from. (optional, default to 0)
         * @return APIactivityWorkspaceListRequest
         */
        public ActivityWorkspaceListRequest offset(BigDecimal offset) {
            this.offset = offset;
            return this;
        }

        /**
         * Set sortOrder
         * @param sortOrder The order in which you require the results to be returned. Either ‘asc’ or ‘desc’ (optional)
         * @return APIactivityWorkspaceListRequest
         */
        public ActivityWorkspaceListRequest sortOrder(String sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * Set sortFields
         * @param sortFields The fields that you require the ordering to be performed on. Multiple fields can be provided, separated by a comma. (optional)
         * @return APIactivityWorkspaceListRequest
         */
        public ActivityWorkspaceListRequest sortFields(String sortFields) {
            this.sortFields = sortFields;
            return this;
        }

        /**
         * Build call for activityWorkspaceList
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return activityWorkspaceListCall(workspaceId, xApiKey, accept, limit, offset, sortOrder, sortFields, _callback);
        }

        /**
         * Execute activityWorkspaceList request
         * @return ActivityCollection
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public ActivityCollection execute() throws ApiException {
            ApiResponse<ActivityCollection> localVarResp = activityWorkspaceListWithHttpInfo(workspaceId, xApiKey, accept, limit, offset, sortOrder, sortFields);
            _lastResponse = localVarResp;
            ActivityCollection data = localVarResp.getData();

            
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
         * Execute activityWorkspaceList request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<ActivityCollection> _callback) throws ApiException {
            return activityWorkspaceListAsync(workspaceId, xApiKey, accept, limit, offset, sortOrder, sortFields, _callback);
        }
    }

    /**
     * List workspace activities
     * @param params The param instance required to create ActivityWorkspaceListRequest
     * @return ActivityCollection
     */

    public static ActivityCollection listByWorkspace(Map<String, Object> params) throws ApiException {
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
        ActivityWorkspaceListParams tempParams = ActivityWorkspaceListParams.builder()
            .setWorkspaceId(workspaceId)
            .setLimit(limit)
            .setOffset(offset)
            .setSortOrder(sortOrder)
            .setSortFields(sortFields).build();

        return listByWorkspace(tempParams);
    }

    public static ActivityCollection listByWorkspace(ActivityWorkspaceListParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }


        String workspaceId = params.getWorkspaceId();

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }

        String accept = "application/vnd.whispir.activity-v1+json";

        ActivityWorkspaceListRequest request = new ActivityWorkspaceListRequest(workspaceId, xApiKey, accept);

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
}
