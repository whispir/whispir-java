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
import com.whispir.model.Scenario;
import com.whispir.model.ScenarioCollection;

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

public class ScenariosApi {
    private static ApiClient localVarApiClient = Configuration.getDefaultApiClient();

    private static okhttp3.Call scenarioCreateCall(String workspaceId, String xApiKey, String contentType, String accept, Scenario scenario, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = scenario;

        // create path and map variables
        String localVarPath = "/workspaces/{workspaceId}/scenarios"
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
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/vnd.whispir.scenario-v1+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth", "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private static okhttp3.Call scenarioCreateValidateBeforeCall(String workspaceId, String xApiKey, String contentType, String accept, Scenario scenario, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'workspaceId' is set
        if (workspaceId == null) {
            throw new ApiException("Missing the required parameter 'workspaceId' when calling scenarioCreate(Async)");
        }

        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling scenarioCreate(Async)");
        }

        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new ApiException("Missing the required parameter 'contentType' when calling scenarioCreate(Async)");
        }

        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling scenarioCreate(Async)");
        }

        // verify the required parameter 'scenario' is set
        if (scenario == null) {
            throw new ApiException("Missing the required parameter 'scenario' when calling scenarioCreate(Async)");
        }

        return scenarioCreateCall(workspaceId, xApiKey, contentType, accept, scenario, _callback);
    }

    private static ApiResponse<Void> scenarioCreateWithHttpInfo(String workspaceId, String xApiKey, String contentType, String accept, Scenario scenario) throws ApiException {
        okhttp3.Call localVarCall = scenarioCreateCall(workspaceId, xApiKey, contentType, accept, scenario, null);
        return localVarApiClient.execute(localVarCall);
    }

    private static okhttp3.Call scenarioCreateAsync(String workspaceId, String xApiKey, String contentType, String accept, Scenario scenario, final ApiCallback<Void> _callback) throws ApiException {
        okhttp3.Call localVarCall = scenarioCreateValidateBeforeCall(workspaceId, xApiKey, contentType, accept, scenario, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public static class ScenarioCreateParams {
        private String workspaceId;
        private Scenario scenario;
        private String name;
        private String description;
        private String allowedUsers;
        private String allowedUserIds;
        private Message message;
        private String to;
        private String subject;
        private String label;
        private Email email;
        private Voice voice;
        private Web web;
        private Social social;

        private ScenarioCreateParams(
            String workspaceId,
            Scenario scenario,
            String name,
            String description,
            String allowedUsers,
            String allowedUserIds,
            Message message,
            String to,
            String subject,
            String label,
            Email email,
            Voice voice,
            Web web,
            Social social
        ){
            this.workspaceId = workspaceId;
            this.scenario = scenario;
            this.name = name;
            this.description = description;
            this.allowedUsers = allowedUsers;
            this.allowedUserIds = allowedUserIds;
            this.message = message;
            this.to = to;
            this.subject = subject;
            this.label = label;
            this.email = email;
            this.voice = voice;
            this.web = web;
            this.social = social;
        }
            public String getWorkspaceId() {
                return workspaceId;
            }
            public Scenario getScenario() {
                return scenario;
            }
            public String getName() {
                return name;
            }
            public String getDescription() {
                return description;
            }
            public enum AllowedUsersEnum {
            EVERYONE("EVERYONE"),
            
            SELECTEDUSERS("SELECTEDUSERS");
                private String value;
                AllowedUsersEnum(String value){
                    this.value = value;
                }

                public String getValue() {
                    return value;
                }
                
                @Override
                public String toString() {
                    return String.valueOf(value);
                }

                public static AllowedUsersEnum fromValue(String value) {
                    for (AllowedUsersEnum b : AllowedUsersEnum.values()) {
                        if (b.value.equals(value)) {
                            return b;
                        }
                    }
                    throw new IllegalArgumentException("Unexpected value '" + value + "'");
                }

            }
            public String getAllowedUsers() {
                return allowedUsers;
            }
            public String getAllowedUserIds() {
                return allowedUserIds;
            }
            public Message getMessage() {
                return message;
            }
            public String getTo() {
                return to;
            }
            public String getSubject() {
                return subject;
            }
            public String getLabel() {
                return label;
            }
            public Email getEmail() {
                return email;
            }
            public Voice getVoice() {
                return voice;
            }
            public Web getWeb() {
                return web;
            }
            public Social getSocial() {
                return social;
            }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private String workspaceId;
            private Scenario scenario;
            private String name;
            private String description;
            private String allowedUsers;
            private String allowedUserIds;
            private Message message;
            private String to;
            private String subject;
            private String label;
            private Email email;
            private Voice voice;
            private Web web;
            private Social social;

            public ScenarioCreateParams build() {
                return new ScenarioCreateParams(
                    workspaceId,
                    scenario,
                    name,
                    description,
                    allowedUsers,
                    allowedUserIds,
                    message,
                    to,
                    subject,
                    label,
                    email,
                    voice,
                    web,
                    social
                );
            }

            public Builder setWorkspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }
            public Builder setScenario(Scenario scenario) {
                this.scenario = scenario;
                return this;
            }
            public Builder setName(String name) {
                this.name = name;
                return this;
            }
            public Builder setDescription(String description) {
                this.description = description;
                return this;
            }
            public Builder setAllowedUsers(AllowedUsersEnum allowedUsers) {
                this.allowedUsers = allowedUsers.getValue();
                return this;
            }
            public Builder setAllowedUserIds(String allowedUserIds) {
                this.allowedUserIds = allowedUserIds;
                return this;
            }
            public Builder setMessage(Message message) {
                this.message = message;
                return this;
            }
            public Builder setTo(String to) {
                this.to = to;
                return this;
            }
            public Builder setSubject(String subject) {
                this.subject = subject;
                return this;
            }
            public Builder setLabel(String label) {
                this.label = label;
                return this;
            }
            public Builder setEmail(Email email) {
                this.email = email;
                return this;
            }
            public Builder setVoice(Voice voice) {
                this.voice = voice;
                return this;
            }
            public Builder setWeb(Web web) {
                this.web = web;
                return this;
            }
            public Builder setSocial(Social social) {
                this.social = social;
                return this;
            }
        }
        
        public static class Message {
            private String to;
            private String subject;
            private String body;
            private Email email;
            private Voice voice;
            private Web web;
            private Social social;
            private String type;
            private Features features;
            private Resource resource;
            private String messageTemplateId;
            private String messageTemplateName;
            private String callbackId;
            private Object callbackParameters;
            private String label;
            private String eventId;
            private String messageType;
            private String scheduleType;
            private String scheduleDate;
            private BigDecimal repetitionCount;
            private BigDecimal repeatDays;
            private BigDecimal repeatHrs;
            private BigDecimal repeatMin;
            private DeliveryReceipt dlr;

            private Message(String to, String subject, String body, Email email, Voice voice, Web web, Social social, String type, Features features, Resource resource, String messageTemplateId, String messageTemplateName, String callbackId, Object callbackParameters, String label, String eventId, String messageType, String scheduleType, String scheduleDate, BigDecimal repetitionCount, BigDecimal repeatDays, BigDecimal repeatHrs, BigDecimal repeatMin, DeliveryReceipt dlr){
            this.to = to;
            this.subject = subject;
            this.body = body;
            this.email = email;
            this.voice = voice;
            this.web = web;
            this.social = social;
            this.type = type;
            this.features = features;
            this.resource = resource;
            this.messageTemplateId = messageTemplateId;
            this.messageTemplateName = messageTemplateName;
            this.callbackId = callbackId;
            this.callbackParameters = callbackParameters;
            this.label = label;
            this.eventId = eventId;
            this.messageType = messageType;
            this.scheduleType = scheduleType;
            this.scheduleDate = scheduleDate;
            this.repetitionCount = repetitionCount;
            this.repeatDays = repeatDays;
            this.repeatHrs = repeatHrs;
            this.repeatMin = repeatMin;
            this.dlr = dlr;
            }

            public String getTo(){
                return to;
            }
            public String getSubject(){
                return subject;
            }
            public String getBody(){
                return body;
            }
            public Email getEmail(){
                return email;
            }
            public Voice getVoice(){
                return voice;
            }
            public Web getWeb(){
                return web;
            }
            public Social getSocial(){
                return social;
            }
            public String getType(){
                return type;
            }
            public enum TypeEnum {
                DEFAULT("default"),
                DEFAULTNOREPLY("defaultNoReply"),
                NODLR("noDlr");
                private String value;
                TypeEnum(String value){
                    this.value = value;
                }

                public String getValue() {
                    return value;
                }
                
                @Override
                public String toString() {
                    return String.valueOf(value);
                }

                public static TypeEnum fromValue(String value) {
                    for (TypeEnum b : TypeEnum.values()) {
                        if (b.value.equals(value)) {
                            return b;
                        }
                    }
                    throw new IllegalArgumentException("Unexpected value '" + value + "'");
                }

            }
            public Features getFeatures(){
                return features;
            }
            public Resource getResource(){
                return resource;
            }
            public String getMessageTemplateId(){
                return messageTemplateId;
            }
            public String getMessageTemplateName(){
                return messageTemplateName;
            }
            public String getCallbackId(){
                return callbackId;
            }
            public Object getCallbackParameters(){
                return callbackParameters;
            }
            public String getLabel(){
                return label;
            }
            public String getEventId(){
                return eventId;
            }
            public String getMessageType(){
                return messageType;
            }
            public enum MessageTypeEnum {
                SCHEDULED("SCHEDULED");
                private String value;
                MessageTypeEnum(String value){
                    this.value = value;
                }

                public String getValue() {
                    return value;
                }
                
                @Override
                public String toString() {
                    return String.valueOf(value);
                }

                public static MessageTypeEnum fromValue(String value) {
                    for (MessageTypeEnum b : MessageTypeEnum.values()) {
                        if (b.value.equals(value)) {
                            return b;
                        }
                    }
                    throw new IllegalArgumentException("Unexpected value '" + value + "'");
                }

            }
            public String getScheduleType(){
                return scheduleType;
            }
            public enum ScheduleTypeEnum {
                ONCE("ONCE"),
                REPEAT("REPEAT");
                private String value;
                ScheduleTypeEnum(String value){
                    this.value = value;
                }

                public String getValue() {
                    return value;
                }
                
                @Override
                public String toString() {
                    return String.valueOf(value);
                }

                public static ScheduleTypeEnum fromValue(String value) {
                    for (ScheduleTypeEnum b : ScheduleTypeEnum.values()) {
                        if (b.value.equals(value)) {
                            return b;
                        }
                    }
                    throw new IllegalArgumentException("Unexpected value '" + value + "'");
                }

            }
            public String getScheduleDate(){
                return scheduleDate;
            }
            public BigDecimal getRepetitionCount(){
                return repetitionCount;
            }
            public BigDecimal getRepeatDays(){
                return repeatDays;
            }
            public BigDecimal getRepeatHrs(){
                return repeatHrs;
            }
            public BigDecimal getRepeatMin(){
                return repeatMin;
            }
            public DeliveryReceipt getDlr(){
                return dlr;
            }

            public static Builder builder() {
                return new Builder();
            }   

            public static class Builder {
                private String to;
                private String subject;
                private String body;
                private Email email;
                private Voice voice;
                private Web web;
                private Social social;
                private String type;
                private Features features;
                private Resource resource;
                private String messageTemplateId;
                private String messageTemplateName;
                private String callbackId;
                private Object callbackParameters;
                private String label;
                private String eventId;
                private String messageType;
                private String scheduleType;
                private String scheduleDate;
                private BigDecimal repetitionCount;
                private BigDecimal repeatDays;
                private BigDecimal repeatHrs;
                private BigDecimal repeatMin;
                private DeliveryReceipt dlr;

                public Message build() {
                    return new Message(
                        this.to,
                        this.subject,
                        this.body,
                        this.email,
                        this.voice,
                        this.web,
                        this.social,
                        this.type,
                        this.features,
                        this.resource,
                        this.messageTemplateId,
                        this.messageTemplateName,
                        this.callbackId,
                        this.callbackParameters,
                        this.label,
                        this.eventId,
                        this.messageType,
                        this.scheduleType,
                        this.scheduleDate,
                        this.repetitionCount,
                        this.repeatDays,
                        this.repeatHrs,
                        this.repeatMin,
                        this.dlr
                    );
                }
                public Builder setTo(String to) {
                    this.to = to;
                    return this;
                }
                public Builder setSubject(String subject) {
                    this.subject = subject;
                    return this;
                }
                public Builder setBody(String body) {
                    this.body = body;
                    return this;
                }
                public Builder setEmail(Email email) {
                    this.email = email;
                    return this;
                }
                public Builder setVoice(Voice voice) {
                    this.voice = voice;
                    return this;
                }
                public Builder setWeb(Web web) {
                    this.web = web;
                    return this;
                }
                public Builder setSocial(Social social) {
                    this.social = social;
                    return this;
                }
                public Builder setType(TypeEnum type) {
                    this.type = type.getValue();
                    return this;
                }
                public Builder setFeatures(Features features) {
                    this.features = features;
                    return this;
                }
                public Builder setResource(Resource resource) {
                    this.resource = resource;
                    return this;
                }
                public Builder setMessageTemplateId(String messageTemplateId) {
                    this.messageTemplateId = messageTemplateId;
                    return this;
                }
                public Builder setMessageTemplateName(String messageTemplateName) {
                    this.messageTemplateName = messageTemplateName;
                    return this;
                }
                public Builder setCallbackId(String callbackId) {
                    this.callbackId = callbackId;
                    return this;
                }
                public Builder setCallbackParameters(Object callbackParameters) {
                    this.callbackParameters = callbackParameters;
                    return this;
                }
                public Builder setLabel(String label) {
                    this.label = label;
                    return this;
                }
                public Builder setEventId(String eventId) {
                    this.eventId = eventId;
                    return this;
                }
                public Builder setMessageType(MessageTypeEnum messageType) {
                    this.messageType = messageType.getValue();
                    return this;
                }
                public Builder setScheduleType(ScheduleTypeEnum scheduleType) {
                    this.scheduleType = scheduleType.getValue();
                    return this;
                }
                public Builder setScheduleDate(String scheduleDate) {
                    this.scheduleDate = scheduleDate;
                    return this;
                }
                public Builder setRepetitionCount(BigDecimal repetitionCount) {
                    this.repetitionCount = repetitionCount;
                    return this;
                }
                public Builder setRepeatDays(BigDecimal repeatDays) {
                    this.repeatDays = repeatDays;
                    return this;
                }
                public Builder setRepeatHrs(BigDecimal repeatHrs) {
                    this.repeatHrs = repeatHrs;
                    return this;
                }
                public Builder setRepeatMin(BigDecimal repeatMin) {
                    this.repeatMin = repeatMin;
                    return this;
                }
                public Builder setDlr(DeliveryReceipt dlr) {
                    this.dlr = dlr;
                    return this;
                }
            }

            public static class Email {
            private String body;
            private String footer;
            private String type;
            private Attachments resources;

            private Email(String body, String footer, String type, Attachments resources){
            this.body = body;
            this.footer = footer;
            this.type = type;
            this.resources = resources;
            }

            public String getBody(){
                return body;
            }
            public String getFooter(){
                return footer;
            }
            public String getType(){
                return type;
            }
            public enum TypeEnum {
                PLAIN("text/plain"),
                HTML("text/html");
                private String value;
                TypeEnum(String value){
                    this.value = value;
                }

                public String getValue() {
                    return value;
                }
                
                @Override
                public String toString() {
                    return String.valueOf(value);
                }

                public static TypeEnum fromValue(String value) {
                    for (TypeEnum b : TypeEnum.values()) {
                        if (b.value.equals(value)) {
                            return b;
                        }
                    }
                    throw new IllegalArgumentException("Unexpected value '" + value + "'");
                }

            }
            public Attachments getResources(){
                return resources;
            }

            public static Builder builder() {
                return new Builder();
            }   

            public static class Builder {
                private String body;
                private String footer;
                private String type;
                private Attachments resources;

                public Email build() {
                    return new Email(
                        this.body,
                        this.footer,
                        this.type,
                        this.resources
                    );
                }
                public Builder setBody(String body) {
                    this.body = body;
                    return this;
                }
                public Builder setFooter(String footer) {
                    this.footer = footer;
                    return this;
                }
                public Builder setType(TypeEnum type) {
                    this.type = type.getValue();
                    return this;
                }
                public Builder setResources(Attachments resources) {
                    this.resources = resources;
                    return this;
                }
            }

            public static class Attachments {
            private List<Attachment> attachments;

            private Attachments(List<Attachment> attachments){
            this.attachments = attachments;
            }

            public List<Attachment> getAttachments(){
                return attachments;
            }

            public static Builder builder() {
                return new Builder();
            }   

            public static class Builder {
                private List<Attachment> attachments;

                public Attachments build() {
                    return new Attachments(
                        this.attachments
                    );
                }
                public Builder addAttachment(Attachment element) {
                    if (this.attachments == null) {
                            this.attachments = new ArrayList<>();
                    }
                    this.attachments.add(element);
                    return this;
                }

                public Builder addAllAttachment(List<Attachment> elements) {
                    if (this.attachments == null) {
                            this.attachments = new ArrayList<>();
                    }
                    this.attachments.addAll(elements);
                    return this;
                }
            }

        public static class Attachment {
        private String attachmentName;
        private String derefUri;
        private String attachmentDesc;

        private Attachment(String attachmentName,String derefUri,String attachmentDesc){
            this.attachmentName = attachmentName;
            this.derefUri = derefUri;
            this.attachmentDesc = attachmentDesc;
        }

        public String getAttachmentName(){
            return attachmentName;
        }
        public String getDerefUri(){
            return derefUri;
        }
        public String getAttachmentDesc(){
            return attachmentDesc;
        }

        public static Builder builder() {
            return new Builder();
        }   

        public static class Builder {
            private String attachmentName;
            private String derefUri;
            private String attachmentDesc;

            public Attachment build() {
                return new Attachment(
                   this.attachmentName,
                   this.derefUri,
                   this.attachmentDesc
                );
            }
            public Builder setAttachmentName(String attachmentName) {
                this.attachmentName = attachmentName;
                return this;
            }
            public Builder setDerefUri(String derefUri) {
                this.derefUri = derefUri;
                return this;
            }
            public Builder setAttachmentDesc(String attachmentDesc) {
                this.attachmentDesc = attachmentDesc;
                return this;
            }
        }

    
    }

        }

        }
        public static class Voice {
            private String header;
            private String body;
            private String type;
            private Attachments resources;

            private Voice(String header, String body, String type, Attachments resources){
            this.header = header;
            this.body = body;
            this.type = type;
            this.resources = resources;
            }

            public String getHeader(){
                return header;
            }
            public String getBody(){
                return body;
            }
            public String getType(){
                return type;
            }
            public Attachments getResources(){
                return resources;
            }

            public static Builder builder() {
                return new Builder();
            }   

            public static class Builder {
                private String header;
                private String body;
                private String type;
                private Attachments resources;

                public Voice build() {
                    return new Voice(
                        this.header,
                        this.body,
                        this.type,
                        this.resources
                    );
                }
                public Builder setHeader(String header) {
                    this.header = header;
                    return this;
                }
                public Builder setBody(String body) {
                    this.body = body;
                    return this;
                }
                public Builder setType(String type) {
                    this.type = type;
                    return this;
                }
                public Builder setResources(Attachments resources) {
                    this.resources = resources;
                    return this;
                }
            }

            public static class Attachments {
            private List<Attachment> attachments;

            private Attachments(List<Attachment> attachments){
            this.attachments = attachments;
            }

            public List<Attachment> getAttachments(){
                return attachments;
            }

            public static Builder builder() {
                return new Builder();
            }   

            public static class Builder {
                private List<Attachment> attachments;

                public Attachments build() {
                    return new Attachments(
                        this.attachments
                    );
                }
                public Builder addAttachment(Attachment element) {
                    if (this.attachments == null) {
                            this.attachments = new ArrayList<>();
                    }
                    this.attachments.add(element);
                    return this;
                }

                public Builder addAllAttachment(List<Attachment> elements) {
                    if (this.attachments == null) {
                            this.attachments = new ArrayList<>();
                    }
                    this.attachments.addAll(elements);
                    return this;
                }
            }

        public static class Attachment {
        private String attachmentName;
        private String derefUri;
        private String attachmentDesc;

        private Attachment(String attachmentName,String derefUri,String attachmentDesc){
            this.attachmentName = attachmentName;
            this.derefUri = derefUri;
            this.attachmentDesc = attachmentDesc;
        }

        public String getAttachmentName(){
            return attachmentName;
        }
        public String getDerefUri(){
            return derefUri;
        }
        public String getAttachmentDesc(){
            return attachmentDesc;
        }

        public static Builder builder() {
            return new Builder();
        }   

        public static class Builder {
            private String attachmentName;
            private String derefUri;
            private String attachmentDesc;

            public Attachment build() {
                return new Attachment(
                   this.attachmentName,
                   this.derefUri,
                   this.attachmentDesc
                );
            }
            public Builder setAttachmentName(String attachmentName) {
                this.attachmentName = attachmentName;
                return this;
            }
            public Builder setDerefUri(String derefUri) {
                this.derefUri = derefUri;
                return this;
            }
            public Builder setAttachmentDesc(String attachmentDesc) {
                this.attachmentDesc = attachmentDesc;
                return this;
            }
        }

    
    }

        }

        }
        public static class Web {
            private String body;
            private String type;

            private Web(String body, String type){
            this.body = body;
            this.type = type;
            }

            public String getBody(){
                return body;
            }
            public String getType(){
                return type;
            }
            public enum TypeEnum {
                PLAIN("text/plain"),
                HTML("text/html");
                private String value;
                TypeEnum(String value){
                    this.value = value;
                }

                public String getValue() {
                    return value;
                }
                
                @Override
                public String toString() {
                    return String.valueOf(value);
                }

                public static TypeEnum fromValue(String value) {
                    for (TypeEnum b : TypeEnum.values()) {
                        if (b.value.equals(value)) {
                            return b;
                        }
                    }
                    throw new IllegalArgumentException("Unexpected value '" + value + "'");
                }

            }

            public static Builder builder() {
                return new Builder();
            }   

            public static class Builder {
                private String body;
                private String type;

                public Web build() {
                    return new Web(
                        this.body,
                        this.type
                    );
                }
                public Builder setBody(String body) {
                    this.body = body;
                    return this;
                }
                public Builder setType(TypeEnum type) {
                    this.type = type.getValue();
                    return this;
                }
            }

    
        }
        public static class Social {
            private List<Channel> social;

            private Social(List<Channel> social){
            this.social = social;
            }

            public List<Channel> getSocial(){
                return social;
            }

            public static Builder builder() {
                return new Builder();
            }   

            public static class Builder {
                private List<Channel> social;

                public Social build() {
                    return new Social(
                        this.social
                    );
                }
                public Builder addChannel(Channel element) {
                    if (this.social == null) {
                            this.social = new ArrayList<>();
                    }
                    this.social.add(element);
                    return this;
                }

                public Builder addAllChannel(List<Channel> elements) {
                    if (this.social == null) {
                            this.social = new ArrayList<>();
                    }
                    this.social.addAll(elements);
                    return this;
                }
            }

        public static class Channel {
        private String id;
        private String body;
        private String type;

        private Channel(String id,String body,String type){
            this.id = id;
            this.body = body;
            this.type = type;
        }

        public String getId(){
            return id;
        }
            public enum IdEnum {
                SOCIAL("social"),
                SOCIAL_LONG("social_long");
                IdEnum(String value){
                    this.value = value;
                }

                private String value;
                public String getValue() {
                    return value;
                }
                
                @Override
                public String toString() {
                    return String.valueOf(value);
                }

                public static IdEnum fromValue(String value) {
                    for (IdEnum b : IdEnum.values()) {
                        if (b.value.equals(value)) {
                            return b;
                        }
                    }
                    throw new IllegalArgumentException("Unexpected value '" + value + "'");
                }

            }
        public String getBody(){
            return body;
        }
        public String getType(){
            return type;
        }
            public enum TypeEnum {
                PLAIN("text/plain"),
                HTML("text/html");
                TypeEnum(String value){
                    this.value = value;
                }

                private String value;
                public String getValue() {
                    return value;
                }
                
                @Override
                public String toString() {
                    return String.valueOf(value);
                }

                public static TypeEnum fromValue(String value) {
                    for (TypeEnum b : TypeEnum.values()) {
                        if (b.value.equals(value)) {
                            return b;
                        }
                    }
                    throw new IllegalArgumentException("Unexpected value '" + value + "'");
                }

            }

        public static Builder builder() {
            return new Builder();
        }   

        public static class Builder {
            private String id;
            private String body;
            private String type;

            public Channel build() {
                return new Channel(
                   this.id,
                   this.body,
                   this.type
                );
            }
            public Builder setId(IdEnum id) {
                this.id = id.getValue();
                return this;
            }
            public Builder setBody(String body) {
                this.body = body;
                return this;
            }
            public Builder setType(TypeEnum type) {
                this.type = type.getValue();
                return this;
            }
        }

    
    }

        }
        public static class Features {
            private PushOptions pushOptions;
            private AliasOption aliasOption;

            private Features(PushOptions pushOptions, AliasOption aliasOption){
            this.pushOptions = pushOptions;
            this.aliasOption = aliasOption;
            }

            public PushOptions getPushOptions(){
                return pushOptions;
            }
            public AliasOption getAliasOption(){
                return aliasOption;
            }

            public static Builder builder() {
                return new Builder();
            }   

            public static class Builder {
                private PushOptions pushOptions;
                private AliasOption aliasOption;

                public Features build() {
                    return new Features(
                        this.pushOptions,
                        this.aliasOption
                    );
                }
                public Builder setPushOptions(PushOptions pushOptions) {
                    this.pushOptions = pushOptions;
                    return this;
                }
                public Builder setAliasOption(AliasOption aliasOption) {
                    this.aliasOption = aliasOption;
                    return this;
                }
            }

            public static class PushOptions {
            private String notifications;
            private String escalationMins;
            private String appId;
            private String priority;
            private Fcm fcm;
            private Apns apns;
            private Object data;

            private PushOptions(String notifications, String escalationMins, String appId, String priority, Fcm fcm, Apns apns, Object data){
            this.notifications = notifications;
            this.escalationMins = escalationMins;
            this.appId = appId;
            this.priority = priority;
            this.fcm = fcm;
            this.apns = apns;
            this.data = data;
            }

            public String getNotifications(){
                return notifications;
            }
            public enum NotificationsEnum {
                ENABLED("enabled"),
                DISABLED("disabled");
                private String value;
                NotificationsEnum(String value){
                    this.value = value;
                }

                public String getValue() {
                    return value;
                }
                
                @Override
                public String toString() {
                    return String.valueOf(value);
                }

                public static NotificationsEnum fromValue(String value) {
                    for (NotificationsEnum b : NotificationsEnum.values()) {
                        if (b.value.equals(value)) {
                            return b;
                        }
                    }
                    throw new IllegalArgumentException("Unexpected value '" + value + "'");
                }

            }
            public String getEscalationMins(){
                return escalationMins;
            }
            public String getAppId(){
                return appId;
            }
            public String getPriority(){
                return priority;
            }
            public enum PriorityEnum {
                NORMAL("NORMAL"),
                HIGH("HIGH");
                private String value;
                PriorityEnum(String value){
                    this.value = value;
                }

                public String getValue() {
                    return value;
                }
                
                @Override
                public String toString() {
                    return String.valueOf(value);
                }

                public static PriorityEnum fromValue(String value) {
                    for (PriorityEnum b : PriorityEnum.values()) {
                        if (b.value.equals(value)) {
                            return b;
                        }
                    }
                    throw new IllegalArgumentException("Unexpected value '" + value + "'");
                }

            }
            public Fcm getFcm(){
                return fcm;
            }
            public Apns getApns(){
                return apns;
            }
            public Object getData(){
                return data;
            }

            public static Builder builder() {
                return new Builder();
            }   

            public static class Builder {
                private String notifications;
                private String escalationMins;
                private String appId;
                private String priority;
                private Fcm fcm;
                private Apns apns;
                private Object data;

                public PushOptions build() {
                    return new PushOptions(
                        this.notifications,
                        this.escalationMins,
                        this.appId,
                        this.priority,
                        this.fcm,
                        this.apns,
                        this.data
                    );
                }
                public Builder setNotifications(NotificationsEnum notifications) {
                    this.notifications = notifications.getValue();
                    return this;
                }
                public Builder setEscalationMins(String escalationMins) {
                    this.escalationMins = escalationMins;
                    return this;
                }
                public Builder setAppId(String appId) {
                    this.appId = appId;
                    return this;
                }
                public Builder setPriority(PriorityEnum priority) {
                    this.priority = priority.getValue();
                    return this;
                }
                public Builder setFcm(Fcm fcm) {
                    this.fcm = fcm;
                    return this;
                }
                public Builder setApns(Apns apns) {
                    this.apns = apns;
                    return this;
                }
                public Builder setData(Object data) {
                    this.data = data;
                    return this;
                }
            }

            public static class Fcm {
            private String androidChannelId;
            private String sound;
            private String action;
            private String image;

            private Fcm(String androidChannelId, String sound, String action, String image){
            this.androidChannelId = androidChannelId;
            this.sound = sound;
            this.action = action;
            this.image = image;
            }

            public String getAndroidChannelId(){
                return androidChannelId;
            }
            public String getSound(){
                return sound;
            }
            public String getAction(){
                return action;
            }
            public String getImage(){
                return image;
            }

            public static Builder builder() {
                return new Builder();
            }   

            public static class Builder {
                private String androidChannelId;
                private String sound;
                private String action;
                private String image;

                public Fcm build() {
                    return new Fcm(
                        this.androidChannelId,
                        this.sound,
                        this.action,
                        this.image
                    );
                }
                public Builder setAndroidChannelId(String androidChannelId) {
                    this.androidChannelId = androidChannelId;
                    return this;
                }
                public Builder setSound(String sound) {
                    this.sound = sound;
                    return this;
                }
                public Builder setAction(String action) {
                    this.action = action;
                    return this;
                }
                public Builder setImage(String image) {
                    this.image = image;
                    return this;
                }
            }

    
        }
        public static class Apns {
            private String sound;
            private String action;

            private Apns(String sound, String action){
            this.sound = sound;
            this.action = action;
            }

            public String getSound(){
                return sound;
            }
            public String getAction(){
                return action;
            }

            public static Builder builder() {
                return new Builder();
            }   

            public static class Builder {
                private String sound;
                private String action;

                public Apns build() {
                    return new Apns(
                        this.sound,
                        this.action
                    );
                }
                public Builder setSound(String sound) {
                    this.sound = sound;
                    return this;
                }
                public Builder setAction(String action) {
                    this.action = action;
                    return this;
                }
            }

    
        }

        }
        public static class AliasOption {
            private String aliasName;

            private AliasOption(String aliasName){
            this.aliasName = aliasName;
            }

            public String getAliasName(){
                return aliasName;
            }

            public static Builder builder() {
                return new Builder();
            }   

            public static class Builder {
                private String aliasName;

                public AliasOption build() {
                    return new AliasOption(
                        this.aliasName
                    );
                }
                public Builder setAliasName(String aliasName) {
                    this.aliasName = aliasName;
                    return this;
                }
            }

    
        }

        }
        public static class Resource {
            private String name;
            private String scope;
            private String mimeType;
            private String derefUri;

            private Resource(String name, String scope, String mimeType, String derefUri){
            this.name = name;
            this.scope = scope;
            this.mimeType = mimeType;
            this.derefUri = derefUri;
            }

            public String getName(){
                return name;
            }
            public String getScope(){
                return scope;
            }
            public enum ScopeEnum {
                PRIVATE("private"),
                PUBLIC("public");
                private String value;
                ScopeEnum(String value){
                    this.value = value;
                }

                public String getValue() {
                    return value;
                }
                
                @Override
                public String toString() {
                    return String.valueOf(value);
                }

                public static ScopeEnum fromValue(String value) {
                    for (ScopeEnum b : ScopeEnum.values()) {
                        if (b.value.equals(value)) {
                            return b;
                        }
                    }
                    throw new IllegalArgumentException("Unexpected value '" + value + "'");
                }

            }
            public String getMimeType(){
                return mimeType;
            }
            public String getDerefUri(){
                return derefUri;
            }

            public static Builder builder() {
                return new Builder();
            }   

            public static class Builder {
                private String name;
                private String scope;
                private String mimeType;
                private String derefUri;

                public Resource build() {
                    return new Resource(
                        this.name,
                        this.scope,
                        this.mimeType,
                        this.derefUri
                    );
                }
                public Builder setName(String name) {
                    this.name = name;
                    return this;
                }
                public Builder setScope(ScopeEnum scope) {
                    this.scope = scope.getValue();
                    return this;
                }
                public Builder setMimeType(String mimeType) {
                    this.mimeType = mimeType;
                    return this;
                }
                public Builder setDerefUri(String derefUri) {
                    this.derefUri = derefUri;
                    return this;
                }
            }

    
        }
        public static class DeliveryReceipt {

            private DeliveryReceipt(){
            }


            public static Builder builder() {
                return new Builder();
            }   

            public static class Builder {

                public DeliveryReceipt build() {
                    return new DeliveryReceipt(
                    );
                }
            }

    
        }

        }
        public static class Email {
            private String body;
            private String footer;
            private String type;
            private Attachments resources;

            private Email(String body, String footer, String type, Attachments resources){
            this.body = body;
            this.footer = footer;
            this.type = type;
            this.resources = resources;
            }

            public String getBody(){
                return body;
            }
            public String getFooter(){
                return footer;
            }
            public String getType(){
                return type;
            }
            public enum TypeEnum {
                PLAIN("text/plain"),
                HTML("text/html");
                private String value;
                TypeEnum(String value){
                    this.value = value;
                }

                public String getValue() {
                    return value;
                }
                
                @Override
                public String toString() {
                    return String.valueOf(value);
                }

                public static TypeEnum fromValue(String value) {
                    for (TypeEnum b : TypeEnum.values()) {
                        if (b.value.equals(value)) {
                            return b;
                        }
                    }
                    throw new IllegalArgumentException("Unexpected value '" + value + "'");
                }

            }
            public Attachments getResources(){
                return resources;
            }

            public static Builder builder() {
                return new Builder();
            }   

            public static class Builder {
                private String body;
                private String footer;
                private String type;
                private Attachments resources;

                public Email build() {
                    return new Email(
                        this.body,
                        this.footer,
                        this.type,
                        this.resources
                    );
                }
                public Builder setBody(String body) {
                    this.body = body;
                    return this;
                }
                public Builder setFooter(String footer) {
                    this.footer = footer;
                    return this;
                }
                public Builder setType(TypeEnum type) {
                    this.type = type.getValue();
                    return this;
                }
                public Builder setResources(Attachments resources) {
                    this.resources = resources;
                    return this;
                }
            }

            public static class Attachments {
            private List<Attachment> attachments;

            private Attachments(List<Attachment> attachments){
            this.attachments = attachments;
            }

            public List<Attachment> getAttachments(){
                return attachments;
            }

            public static Builder builder() {
                return new Builder();
            }   

            public static class Builder {
                private List<Attachment> attachments;

                public Attachments build() {
                    return new Attachments(
                        this.attachments
                    );
                }
                public Builder addAttachment(Attachment element) {
                    if (this.attachments == null) {
                            this.attachments = new ArrayList<>();
                    }
                    this.attachments.add(element);
                    return this;
                }

                public Builder addAllAttachment(List<Attachment> elements) {
                    if (this.attachments == null) {
                            this.attachments = new ArrayList<>();
                    }
                    this.attachments.addAll(elements);
                    return this;
                }
            }

        public static class Attachment {
        private String attachmentName;
        private String derefUri;
        private String attachmentDesc;

        private Attachment(String attachmentName,String derefUri,String attachmentDesc){
            this.attachmentName = attachmentName;
            this.derefUri = derefUri;
            this.attachmentDesc = attachmentDesc;
        }

        public String getAttachmentName(){
            return attachmentName;
        }
        public String getDerefUri(){
            return derefUri;
        }
        public String getAttachmentDesc(){
            return attachmentDesc;
        }

        public static Builder builder() {
            return new Builder();
        }   

        public static class Builder {
            private String attachmentName;
            private String derefUri;
            private String attachmentDesc;

            public Attachment build() {
                return new Attachment(
                   this.attachmentName,
                   this.derefUri,
                   this.attachmentDesc
                );
            }
            public Builder setAttachmentName(String attachmentName) {
                this.attachmentName = attachmentName;
                return this;
            }
            public Builder setDerefUri(String derefUri) {
                this.derefUri = derefUri;
                return this;
            }
            public Builder setAttachmentDesc(String attachmentDesc) {
                this.attachmentDesc = attachmentDesc;
                return this;
            }
        }

    
    }

        }

        }
        public static class Voice {
            private String header;
            private String body;
            private String type;
            private Attachments resources;

            private Voice(String header, String body, String type, Attachments resources){
            this.header = header;
            this.body = body;
            this.type = type;
            this.resources = resources;
            }

            public String getHeader(){
                return header;
            }
            public String getBody(){
                return body;
            }
            public String getType(){
                return type;
            }
            public Attachments getResources(){
                return resources;
            }

            public static Builder builder() {
                return new Builder();
            }   

            public static class Builder {
                private String header;
                private String body;
                private String type;
                private Attachments resources;

                public Voice build() {
                    return new Voice(
                        this.header,
                        this.body,
                        this.type,
                        this.resources
                    );
                }
                public Builder setHeader(String header) {
                    this.header = header;
                    return this;
                }
                public Builder setBody(String body) {
                    this.body = body;
                    return this;
                }
                public Builder setType(String type) {
                    this.type = type;
                    return this;
                }
                public Builder setResources(Attachments resources) {
                    this.resources = resources;
                    return this;
                }
            }

            public static class Attachments {
            private List<Attachment> attachments;

            private Attachments(List<Attachment> attachments){
            this.attachments = attachments;
            }

            public List<Attachment> getAttachments(){
                return attachments;
            }

            public static Builder builder() {
                return new Builder();
            }   

            public static class Builder {
                private List<Attachment> attachments;

                public Attachments build() {
                    return new Attachments(
                        this.attachments
                    );
                }
                public Builder addAttachment(Attachment element) {
                    if (this.attachments == null) {
                            this.attachments = new ArrayList<>();
                    }
                    this.attachments.add(element);
                    return this;
                }

                public Builder addAllAttachment(List<Attachment> elements) {
                    if (this.attachments == null) {
                            this.attachments = new ArrayList<>();
                    }
                    this.attachments.addAll(elements);
                    return this;
                }
            }

        public static class Attachment {
        private String attachmentName;
        private String derefUri;
        private String attachmentDesc;

        private Attachment(String attachmentName,String derefUri,String attachmentDesc){
            this.attachmentName = attachmentName;
            this.derefUri = derefUri;
            this.attachmentDesc = attachmentDesc;
        }

        public String getAttachmentName(){
            return attachmentName;
        }
        public String getDerefUri(){
            return derefUri;
        }
        public String getAttachmentDesc(){
            return attachmentDesc;
        }

        public static Builder builder() {
            return new Builder();
        }   

        public static class Builder {
            private String attachmentName;
            private String derefUri;
            private String attachmentDesc;

            public Attachment build() {
                return new Attachment(
                   this.attachmentName,
                   this.derefUri,
                   this.attachmentDesc
                );
            }
            public Builder setAttachmentName(String attachmentName) {
                this.attachmentName = attachmentName;
                return this;
            }
            public Builder setDerefUri(String derefUri) {
                this.derefUri = derefUri;
                return this;
            }
            public Builder setAttachmentDesc(String attachmentDesc) {
                this.attachmentDesc = attachmentDesc;
                return this;
            }
        }

    
    }

        }

        }
        public static class Web {
            private String body;
            private String type;

            private Web(String body, String type){
            this.body = body;
            this.type = type;
            }

            public String getBody(){
                return body;
            }
            public String getType(){
                return type;
            }
            public enum TypeEnum {
                PLAIN("text/plain"),
                HTML("text/html");
                private String value;
                TypeEnum(String value){
                    this.value = value;
                }

                public String getValue() {
                    return value;
                }
                
                @Override
                public String toString() {
                    return String.valueOf(value);
                }

                public static TypeEnum fromValue(String value) {
                    for (TypeEnum b : TypeEnum.values()) {
                        if (b.value.equals(value)) {
                            return b;
                        }
                    }
                    throw new IllegalArgumentException("Unexpected value '" + value + "'");
                }

            }

            public static Builder builder() {
                return new Builder();
            }   

            public static class Builder {
                private String body;
                private String type;

                public Web build() {
                    return new Web(
                        this.body,
                        this.type
                    );
                }
                public Builder setBody(String body) {
                    this.body = body;
                    return this;
                }
                public Builder setType(TypeEnum type) {
                    this.type = type.getValue();
                    return this;
                }
            }

    
        }
        public static class Social {
            private List<Channel> social;

            private Social(List<Channel> social){
            this.social = social;
            }

            public List<Channel> getSocial(){
                return social;
            }

            public static Builder builder() {
                return new Builder();
            }   

            public static class Builder {
                private List<Channel> social;

                public Social build() {
                    return new Social(
                        this.social
                    );
                }
                public Builder addChannel(Channel element) {
                    if (this.social == null) {
                            this.social = new ArrayList<>();
                    }
                    this.social.add(element);
                    return this;
                }

                public Builder addAllChannel(List<Channel> elements) {
                    if (this.social == null) {
                            this.social = new ArrayList<>();
                    }
                    this.social.addAll(elements);
                    return this;
                }
            }

        public static class Channel {
        private String id;
        private String body;
        private String type;

        private Channel(String id,String body,String type){
            this.id = id;
            this.body = body;
            this.type = type;
        }

        public String getId(){
            return id;
        }
            public enum IdEnum {
                SOCIAL("social"),
                SOCIAL_LONG("social_long");
                IdEnum(String value){
                    this.value = value;
                }

                private String value;
                public String getValue() {
                    return value;
                }
                
                @Override
                public String toString() {
                    return String.valueOf(value);
                }

                public static IdEnum fromValue(String value) {
                    for (IdEnum b : IdEnum.values()) {
                        if (b.value.equals(value)) {
                            return b;
                        }
                    }
                    throw new IllegalArgumentException("Unexpected value '" + value + "'");
                }

            }
        public String getBody(){
            return body;
        }
        public String getType(){
            return type;
        }
            public enum TypeEnum {
                PLAIN("text/plain"),
                HTML("text/html");
                TypeEnum(String value){
                    this.value = value;
                }

                private String value;
                public String getValue() {
                    return value;
                }
                
                @Override
                public String toString() {
                    return String.valueOf(value);
                }

                public static TypeEnum fromValue(String value) {
                    for (TypeEnum b : TypeEnum.values()) {
                        if (b.value.equals(value)) {
                            return b;
                        }
                    }
                    throw new IllegalArgumentException("Unexpected value '" + value + "'");
                }

            }

        public static Builder builder() {
            return new Builder();
        }   

        public static class Builder {
            private String id;
            private String body;
            private String type;

            public Channel build() {
                return new Channel(
                   this.id,
                   this.body,
                   this.type
                );
            }
            public Builder setId(IdEnum id) {
                this.id = id.getValue();
                return this;
            }
            public Builder setBody(String body) {
                this.body = body;
                return this;
            }
            public Builder setType(TypeEnum type) {
                this.type = type.getValue();
                return this;
            }
        }

    
    }

        }

    }

    public static class ScenarioCreateRequest {
        private final String workspaceId;
        private final String xApiKey;
        private final String contentType;
        private final String accept;
        private final Scenario scenario;
        ApiResponse _lastResponse;

        private ScenarioCreateRequest(String workspaceId, String xApiKey, String contentType, String accept, Scenario scenario) {
            this.workspaceId = workspaceId;
            this.xApiKey = xApiKey;
            this.contentType = contentType;
            this.accept = accept;
            this.scenario = scenario;
        }

        /**
         * Build call for scenarioCreate
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return scenarioCreateCall(workspaceId, xApiKey, contentType, accept, scenario, _callback);
        }

        /**
         * Execute scenarioCreate request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public void execute() throws ApiException {
            scenarioCreateWithHttpInfo(workspaceId, xApiKey, contentType, accept, scenario);
        }
        /**
         * Return the last executed API response
         * @return ApiResponse
         */
        public ApiResponse getLastResponse()  {
            return _lastResponse;
        }


        /**
         * Execute scenarioCreate request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return scenarioCreateAsync(workspaceId, xApiKey, contentType, accept, scenario, _callback);
        }
    }

    /**
     * Create a scenario
     * @param params The param instance required to create ScenarioCreateRequest
     * @return void
     */

    public static void create(Map<String, Object> params) throws ApiException {
        String workspaceId = (String) params.get("workspaceId");

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }
        String nameValue = (String) params.get("name");
        if(nameValue == null) {
            throw new ApiException("Missing the required property value of 'name'");
        }
        String descriptionValue = (String) params.get("description");
        if(descriptionValue == null) {
            throw new ApiException("Missing the required property value of 'description'");
        }
        com.whispir.api.ScenariosApi.ScenarioCreateParams.AllowedUsersEnum allowedUsersValue = com.whispir.api.ScenariosApi.ScenarioCreateParams.AllowedUsersEnum.valueOf((String) params.get("allowedUsers"));
        String allowedUserIdsValue = (String) params.get("allowedUserIds");
        Object messageValue = params.get("message");
        if(messageValue == null) {
            throw new ApiException("Missing the required property value of 'message'");
        }
        String toValue = (String) params.get("to");
        String subjectValue = (String) params.get("subject");
        String labelValue = (String) params.get("label");
        Object emailValue = params.get("email");
        Object voiceValue = params.get("voice");
        Object webValue = params.get("web");
        Object socialValue = params.get("social");
        ScenarioCreateParams tempParams = ScenarioCreateParams.builder()
            .setWorkspaceId(workspaceId)
            .setName(nameValue)
            .setDescription(descriptionValue)
            .setAllowedUsers(allowedUsersValue)
            .setAllowedUserIds(allowedUserIdsValue)
            .setMessage((com.whispir.api.ScenariosApi.ScenarioCreateParams.Message) messageValue)
            .setTo(toValue)
            .setSubject(subjectValue)
            .setLabel(labelValue)
            .setEmail((com.whispir.api.ScenariosApi.ScenarioCreateParams.Email) emailValue)
            .setVoice((com.whispir.api.ScenariosApi.ScenarioCreateParams.Voice) voiceValue)
            .setWeb((com.whispir.api.ScenariosApi.ScenarioCreateParams.Web) webValue)
            .setSocial((com.whispir.api.ScenariosApi.ScenarioCreateParams.Social) socialValue).build();

        create(tempParams);
    }

    public static void create(ScenarioCreateParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }


        String workspaceId = params.getWorkspaceId();

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }

        String contentType = "application/vnd.whispir.scenario-v1+json";

        String accept = "application/vnd.whispir.scenario-v1+json";


        // Constructing 'Scenario' from 'ScenarioCreateParams' instance passed
        Scenario scenario = new Scenario();
        String nameValue = params.getName();
        if(nameValue == null) {
            throw new ApiException("Missing the required property value of 'name'");
        }
        scenario.setName(nameValue);

        String descriptionValue = params.getDescription();
        if(descriptionValue == null) {
            throw new ApiException("Missing the required property value of 'description'");
        }
        scenario.setDescription(descriptionValue);

        String allowedUsersValue = params.getAllowedUsers();
        scenario.setAllowedUsers(allowedUsersValue);

        String allowedUserIdsValue = params.getAllowedUserIds();
        scenario.setAllowedUserIds(allowedUserIdsValue);

        Object messageValue = params.getMessage();
        if(messageValue == null) {
            throw new ApiException("Missing the required property value of 'message'");
        }
        scenario.setMessage((com.whispir.model.Message) messageValue);

        String toValue = params.getTo();
        scenario.setTo(toValue);

        String subjectValue = params.getSubject();
        scenario.setSubject(subjectValue);

        String labelValue = params.getLabel();
        scenario.setLabel(labelValue);

        Object emailValue = params.getEmail();
        scenario.setEmail((com.whispir.model.Email) emailValue);

        Object voiceValue = params.getVoice();
        scenario.setVoice((com.whispir.model.Voice) voiceValue);

        Object webValue = params.getWeb();
        scenario.setWeb((com.whispir.model.Web) webValue);

        Object socialValue = params.getSocial();
        scenario.setSocial((com.whispir.model.Social) socialValue);

        ScenarioCreateRequest request = new ScenarioCreateRequest(workspaceId, xApiKey, contentType, accept, scenario);

        // Ensure to include all of the 'optionalParams' that are passed

        request.execute();
    }
    private static okhttp3.Call scenarioDeleteCall(String workspaceId, String xApiKey, String scenarioId, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/workspaces/{workspaceId}/scenarios/{scenarioId}"
            .replace("{" + "workspaceId" + "}", localVarApiClient.escapeString(workspaceId.toString()))
            .replace("{" + "scenarioId" + "}", localVarApiClient.escapeString(scenarioId.toString()));

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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth", "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private static okhttp3.Call scenarioDeleteValidateBeforeCall(String workspaceId, String xApiKey, String scenarioId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'workspaceId' is set
        if (workspaceId == null) {
            throw new ApiException("Missing the required parameter 'workspaceId' when calling scenarioDelete(Async)");
        }

        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling scenarioDelete(Async)");
        }

        // verify the required parameter 'scenarioId' is set
        if (scenarioId == null) {
            throw new ApiException("Missing the required parameter 'scenarioId' when calling scenarioDelete(Async)");
        }

        return scenarioDeleteCall(workspaceId, xApiKey, scenarioId, _callback);
    }

    private static ApiResponse<Void> scenarioDeleteWithHttpInfo(String workspaceId, String xApiKey, String scenarioId) throws ApiException {
        okhttp3.Call localVarCall = scenarioDeleteCall(workspaceId, xApiKey, scenarioId, null);
        return localVarApiClient.execute(localVarCall);
    }

    private static okhttp3.Call scenarioDeleteAsync(String workspaceId, String xApiKey, String scenarioId, final ApiCallback<Void> _callback) throws ApiException {
        okhttp3.Call localVarCall = scenarioDeleteValidateBeforeCall(workspaceId, xApiKey, scenarioId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public static class ScenarioDeleteParams {
        private String workspaceId;
        private String scenarioId;

        private ScenarioDeleteParams(
            String workspaceId,
            String scenarioId
        ){
            this.workspaceId = workspaceId;
            this.scenarioId = scenarioId;
        }
            public String getWorkspaceId() {
                return workspaceId;
            }
            public String getScenarioId() {
                return scenarioId;
            }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private String workspaceId;
            private String scenarioId;

            public ScenarioDeleteParams build() {
                return new ScenarioDeleteParams(
                    workspaceId,
                    scenarioId
                );
            }

            public Builder setWorkspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }
            public Builder setScenarioId(String scenarioId) {
                this.scenarioId = scenarioId;
                return this;
            }
        }
        
    }

    public static class ScenarioDeleteRequest {
        private final String workspaceId;
        private final String xApiKey;
        private final String scenarioId;
        ApiResponse _lastResponse;

        private ScenarioDeleteRequest(String workspaceId, String xApiKey, String scenarioId) {
            this.workspaceId = workspaceId;
            this.xApiKey = xApiKey;
            this.scenarioId = scenarioId;
        }

        /**
         * Build call for scenarioDelete
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return scenarioDeleteCall(workspaceId, xApiKey, scenarioId, _callback);
        }

        /**
         * Execute scenarioDelete request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public void execute() throws ApiException {
            scenarioDeleteWithHttpInfo(workspaceId, xApiKey, scenarioId);
        }
        /**
         * Return the last executed API response
         * @return ApiResponse
         */
        public ApiResponse getLastResponse()  {
            return _lastResponse;
        }


        /**
         * Execute scenarioDelete request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return scenarioDeleteAsync(workspaceId, xApiKey, scenarioId, _callback);
        }
    }

    /**
     * Delete a scenario
     * @param params The param instance required to create ScenarioDeleteRequest
     * @return void
     */

    public static void delete(Map<String, Object> params) throws ApiException {
        String workspaceId = (String) params.get("workspaceId");

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }
        String scenarioId = (String) params.get("scenarioId");

        if(scenarioId == null || scenarioId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'scenarioId'");
        }
        ScenarioDeleteParams tempParams = ScenarioDeleteParams.builder()
            .setWorkspaceId(workspaceId)
            .setScenarioId(scenarioId).build();

        delete(tempParams);
    }

    public static void delete(ScenarioDeleteParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }


        String workspaceId = params.getWorkspaceId();

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }


        String scenarioId = params.getScenarioId();

        if(scenarioId == null || scenarioId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'scenarioId'");
        }
        ScenarioDeleteRequest request = new ScenarioDeleteRequest(workspaceId, xApiKey, scenarioId);

        // Ensure to include all of the 'optionalParams' that are passed

        request.execute();
    }
    private static okhttp3.Call scenarioListCall(String workspaceId, String xApiKey, String accept, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/workspaces/{workspaceId}/scenarios"
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
            "application/vnd.whispir.scenario-v1+json",
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
    private static okhttp3.Call scenarioListValidateBeforeCall(String workspaceId, String xApiKey, String accept, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'workspaceId' is set
        if (workspaceId == null) {
            throw new ApiException("Missing the required parameter 'workspaceId' when calling scenarioList(Async)");
        }

        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling scenarioList(Async)");
        }

        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling scenarioList(Async)");
        }

        return scenarioListCall(workspaceId, xApiKey, accept, limit, offset, sortOrder, sortFields, _callback);
    }

    private static ApiResponse<ScenarioCollection> scenarioListWithHttpInfo(String workspaceId, String xApiKey, String accept, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields) throws ApiException {
        okhttp3.Call localVarCall = scenarioListCall(workspaceId, xApiKey, accept, limit, offset, sortOrder, sortFields, null);
        Type localVarReturnType = new TypeToken<ScenarioCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private static okhttp3.Call scenarioListAsync(String workspaceId, String xApiKey, String accept, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields, final ApiCallback<ScenarioCollection> _callback) throws ApiException {
        okhttp3.Call localVarCall = scenarioListValidateBeforeCall(workspaceId, xApiKey, accept, limit, offset, sortOrder, sortFields, _callback);
        Type localVarReturnType = new TypeToken<ScenarioCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public static class ScenarioListParams {
        private String workspaceId;
        private BigDecimal limit;
        private BigDecimal offset;
        private String sortOrder;
        private String sortFields;

        private ScenarioListParams(
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

            public ScenarioListParams build() {
                return new ScenarioListParams(
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

    public static class ScenarioListRequest {
        private final String workspaceId;
        private final String xApiKey;
        private final String accept;
        private BigDecimal limit;
        private BigDecimal offset;
        private String sortOrder;
        private String sortFields;
        ApiResponse _lastResponse;

        private ScenarioListRequest(String workspaceId, String xApiKey, String accept) {
            this.workspaceId = workspaceId;
            this.xApiKey = xApiKey;
            this.accept = accept;
        }

        /**
         * Set limit
         * @param limit The number of records to be returned. (optional, default to 20)
         * @return APIscenarioListRequest
         */
        public ScenarioListRequest limit(BigDecimal limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Set offset
         * @param offset The record number to start returning from. (optional, default to 0)
         * @return APIscenarioListRequest
         */
        public ScenarioListRequest offset(BigDecimal offset) {
            this.offset = offset;
            return this;
        }

        /**
         * Set sortOrder
         * @param sortOrder The order in which you require the results to be returned. Either ‘asc’ or ‘desc’ (optional)
         * @return APIscenarioListRequest
         */
        public ScenarioListRequest sortOrder(String sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * Set sortFields
         * @param sortFields The fields that you require the ordering to be performed on. Multiple fields can be provided, separated by a comma. (optional)
         * @return APIscenarioListRequest
         */
        public ScenarioListRequest sortFields(String sortFields) {
            this.sortFields = sortFields;
            return this;
        }

        /**
         * Build call for scenarioList
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return scenarioListCall(workspaceId, xApiKey, accept, limit, offset, sortOrder, sortFields, _callback);
        }

        /**
         * Execute scenarioList request
         * @return ScenarioCollection
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public ScenarioCollection execute() throws ApiException {
            ApiResponse<ScenarioCollection> localVarResp = scenarioListWithHttpInfo(workspaceId, xApiKey, accept, limit, offset, sortOrder, sortFields);
            _lastResponse = localVarResp;
            ScenarioCollection data = localVarResp.getData();

            
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
         * Execute scenarioList request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<ScenarioCollection> _callback) throws ApiException {
            return scenarioListAsync(workspaceId, xApiKey, accept, limit, offset, sortOrder, sortFields, _callback);
        }
    }

    /**
     * List scenarios
     * @param params The param instance required to create ScenarioListRequest
     * @return ScenarioCollection
     */

    public static ScenarioCollection list(Map<String, Object> params) throws ApiException {
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
        ScenarioListParams tempParams = ScenarioListParams.builder()
            .setWorkspaceId(workspaceId)
            .setLimit(limit)
            .setOffset(offset)
            .setSortOrder(sortOrder)
            .setSortFields(sortFields).build();

        return list(tempParams);
    }

    public static ScenarioCollection list(ScenarioListParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }


        String workspaceId = params.getWorkspaceId();

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }

        String accept = "application/vnd.whispir.scenario-v1+json";

        ScenarioListRequest request = new ScenarioListRequest(workspaceId, xApiKey, accept);

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
    private static okhttp3.Call scenarioRetrieveCall(String workspaceId, String xApiKey, String accept, String scenarioId, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/workspaces/{workspaceId}/scenarios/{scenarioId}"
            .replace("{" + "workspaceId" + "}", localVarApiClient.escapeString(workspaceId.toString()))
            .replace("{" + "scenarioId" + "}", localVarApiClient.escapeString(scenarioId.toString()));

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

        if (accept != null) {
            localVarHeaderParams.put("Accept", localVarApiClient.parameterToString(accept));
        }

        final String[] localVarAccepts = {
            "application/vnd.whispir.scenario-v1+json",
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
    private static okhttp3.Call scenarioRetrieveValidateBeforeCall(String workspaceId, String xApiKey, String accept, String scenarioId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'workspaceId' is set
        if (workspaceId == null) {
            throw new ApiException("Missing the required parameter 'workspaceId' when calling scenarioRetrieve(Async)");
        }

        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling scenarioRetrieve(Async)");
        }

        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling scenarioRetrieve(Async)");
        }

        // verify the required parameter 'scenarioId' is set
        if (scenarioId == null) {
            throw new ApiException("Missing the required parameter 'scenarioId' when calling scenarioRetrieve(Async)");
        }

        return scenarioRetrieveCall(workspaceId, xApiKey, accept, scenarioId, _callback);
    }

    private static ApiResponse<Scenario> scenarioRetrieveWithHttpInfo(String workspaceId, String xApiKey, String accept, String scenarioId) throws ApiException {
        okhttp3.Call localVarCall = scenarioRetrieveCall(workspaceId, xApiKey, accept, scenarioId, null);
        Type localVarReturnType = new TypeToken<Scenario>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private static okhttp3.Call scenarioRetrieveAsync(String workspaceId, String xApiKey, String accept, String scenarioId, final ApiCallback<Scenario> _callback) throws ApiException {
        okhttp3.Call localVarCall = scenarioRetrieveValidateBeforeCall(workspaceId, xApiKey, accept, scenarioId, _callback);
        Type localVarReturnType = new TypeToken<Scenario>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public static class ScenarioRetrieveParams {
        private String workspaceId;
        private String scenarioId;

        private ScenarioRetrieveParams(
            String workspaceId,
            String scenarioId
        ){
            this.workspaceId = workspaceId;
            this.scenarioId = scenarioId;
        }
            public String getWorkspaceId() {
                return workspaceId;
            }
            public String getScenarioId() {
                return scenarioId;
            }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private String workspaceId;
            private String scenarioId;

            public ScenarioRetrieveParams build() {
                return new ScenarioRetrieveParams(
                    workspaceId,
                    scenarioId
                );
            }

            public Builder setWorkspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }
            public Builder setScenarioId(String scenarioId) {
                this.scenarioId = scenarioId;
                return this;
            }
        }
        
    }

    public static class ScenarioRetrieveRequest {
        private final String workspaceId;
        private final String xApiKey;
        private final String accept;
        private final String scenarioId;
        ApiResponse _lastResponse;

        private ScenarioRetrieveRequest(String workspaceId, String xApiKey, String accept, String scenarioId) {
            this.workspaceId = workspaceId;
            this.xApiKey = xApiKey;
            this.accept = accept;
            this.scenarioId = scenarioId;
        }

        /**
         * Build call for scenarioRetrieve
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return scenarioRetrieveCall(workspaceId, xApiKey, accept, scenarioId, _callback);
        }

        /**
         * Execute scenarioRetrieve request
         * @return Scenario
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public Scenario execute() throws ApiException {
            ApiResponse<Scenario> localVarResp = scenarioRetrieveWithHttpInfo(workspaceId, xApiKey, accept, scenarioId);
            _lastResponse = localVarResp;
            Scenario data = localVarResp.getData();

            
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
         * Execute scenarioRetrieve request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<Scenario> _callback) throws ApiException {
            return scenarioRetrieveAsync(workspaceId, xApiKey, accept, scenarioId, _callback);
        }
    }

    /**
     * Retrieve a scenario
     * @param params The param instance required to create ScenarioRetrieveRequest
     * @return Scenario
     */

    public static Scenario retrieve(Map<String, Object> params) throws ApiException {
        String workspaceId = (String) params.get("workspaceId");

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }
        String scenarioId = (String) params.get("scenarioId");

        if(scenarioId == null || scenarioId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'scenarioId'");
        }
        ScenarioRetrieveParams tempParams = ScenarioRetrieveParams.builder()
            .setWorkspaceId(workspaceId)
            .setScenarioId(scenarioId).build();

        return retrieve(tempParams);
    }

    public static Scenario retrieve(ScenarioRetrieveParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }


        String workspaceId = params.getWorkspaceId();

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }

        String accept = "application/vnd.whispir.scenario-v1+json";


        String scenarioId = params.getScenarioId();

        if(scenarioId == null || scenarioId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'scenarioId'");
        }
        ScenarioRetrieveRequest request = new ScenarioRetrieveRequest(workspaceId, xApiKey, accept, scenarioId);

        // Ensure to include all of the 'optionalParams' that are passed

        return request.execute();
    }
    private static okhttp3.Call scenarioRunCreateCall(String workspaceId, String xApiKey, String contentType, String accept, String scenarioId, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/workspaces/{workspaceId}/scenarios/{scenarioId}"
            .replace("{" + "workspaceId" + "}", localVarApiClient.escapeString(workspaceId.toString()))
            .replace("{" + "scenarioId" + "}", localVarApiClient.escapeString(scenarioId.toString()));

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
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth", "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private static okhttp3.Call scenarioRunCreateValidateBeforeCall(String workspaceId, String xApiKey, String contentType, String accept, String scenarioId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'workspaceId' is set
        if (workspaceId == null) {
            throw new ApiException("Missing the required parameter 'workspaceId' when calling scenarioRunCreate(Async)");
        }

        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling scenarioRunCreate(Async)");
        }

        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new ApiException("Missing the required parameter 'contentType' when calling scenarioRunCreate(Async)");
        }

        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling scenarioRunCreate(Async)");
        }

        // verify the required parameter 'scenarioId' is set
        if (scenarioId == null) {
            throw new ApiException("Missing the required parameter 'scenarioId' when calling scenarioRunCreate(Async)");
        }

        return scenarioRunCreateCall(workspaceId, xApiKey, contentType, accept, scenarioId, _callback);
    }

    private static ApiResponse<Void> scenarioRunCreateWithHttpInfo(String workspaceId, String xApiKey, String contentType, String accept, String scenarioId) throws ApiException {
        okhttp3.Call localVarCall = scenarioRunCreateCall(workspaceId, xApiKey, contentType, accept, scenarioId, null);
        return localVarApiClient.execute(localVarCall);
    }

    private static okhttp3.Call scenarioRunCreateAsync(String workspaceId, String xApiKey, String contentType, String accept, String scenarioId, final ApiCallback<Void> _callback) throws ApiException {
        okhttp3.Call localVarCall = scenarioRunCreateValidateBeforeCall(workspaceId, xApiKey, contentType, accept, scenarioId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public static class ScenarioRunCreateParams {
        private String workspaceId;
        private String scenarioId;

        private ScenarioRunCreateParams(
            String workspaceId,
            String scenarioId
        ){
            this.workspaceId = workspaceId;
            this.scenarioId = scenarioId;
        }
            public String getWorkspaceId() {
                return workspaceId;
            }
            public String getScenarioId() {
                return scenarioId;
            }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private String workspaceId;
            private String scenarioId;

            public ScenarioRunCreateParams build() {
                return new ScenarioRunCreateParams(
                    workspaceId,
                    scenarioId
                );
            }

            public Builder setWorkspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }
            public Builder setScenarioId(String scenarioId) {
                this.scenarioId = scenarioId;
                return this;
            }
        }
        
    }

    public static class ScenarioRunCreateRequest {
        private final String workspaceId;
        private final String xApiKey;
        private final String contentType;
        private final String accept;
        private final String scenarioId;
        ApiResponse _lastResponse;

        private ScenarioRunCreateRequest(String workspaceId, String xApiKey, String contentType, String accept, String scenarioId) {
            this.workspaceId = workspaceId;
            this.xApiKey = xApiKey;
            this.contentType = contentType;
            this.accept = accept;
            this.scenarioId = scenarioId;
        }

        /**
         * Build call for scenarioRunCreate
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return scenarioRunCreateCall(workspaceId, xApiKey, contentType, accept, scenarioId, _callback);
        }

        /**
         * Execute scenarioRunCreate request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public void execute() throws ApiException {
            scenarioRunCreateWithHttpInfo(workspaceId, xApiKey, contentType, accept, scenarioId);
        }
        /**
         * Return the last executed API response
         * @return ApiResponse
         */
        public ApiResponse getLastResponse()  {
            return _lastResponse;
        }


        /**
         * Execute scenarioRunCreate request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return scenarioRunCreateAsync(workspaceId, xApiKey, contentType, accept, scenarioId, _callback);
        }
    }

    /**
     * Run a scenario
     * @param params The param instance required to create ScenarioRunCreateRequest
     * @return void
     */

    public static void createRun(Map<String, Object> params) throws ApiException {
        String workspaceId = (String) params.get("workspaceId");

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }
        String scenarioId = (String) params.get("scenarioId");

        if(scenarioId == null || scenarioId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'scenarioId'");
        }
        ScenarioRunCreateParams tempParams = ScenarioRunCreateParams.builder()
            .setWorkspaceId(workspaceId)
            .setScenarioId(scenarioId).build();

        createRun(tempParams);
    }

    public static void createRun(ScenarioRunCreateParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }


        String workspaceId = params.getWorkspaceId();

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }

        String contentType = "application/vnd.whispir.scenario-v1+json";

        String accept = "application/vnd.whispir.scenario-v1+json";


        String scenarioId = params.getScenarioId();

        if(scenarioId == null || scenarioId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'scenarioId'");
        }
        ScenarioRunCreateRequest request = new ScenarioRunCreateRequest(workspaceId, xApiKey, contentType, accept, scenarioId);

        // Ensure to include all of the 'optionalParams' that are passed

        request.execute();
    }
    private static okhttp3.Call scenarioUpdateCall(String workspaceId, String xApiKey, String contentType, String accept, String scenarioId, Scenario scenario, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = scenario;

        // create path and map variables
        String localVarPath = "/workspaces/{workspaceId}/scenarios/{scenarioId}"
            .replace("{" + "workspaceId" + "}", localVarApiClient.escapeString(workspaceId.toString()))
            .replace("{" + "scenarioId" + "}", localVarApiClient.escapeString(scenarioId.toString()));

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
            "application/vnd.whispir.scenario-v1+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth", "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private static okhttp3.Call scenarioUpdateValidateBeforeCall(String workspaceId, String xApiKey, String contentType, String accept, String scenarioId, Scenario scenario, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'workspaceId' is set
        if (workspaceId == null) {
            throw new ApiException("Missing the required parameter 'workspaceId' when calling scenarioUpdate(Async)");
        }

        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling scenarioUpdate(Async)");
        }

        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new ApiException("Missing the required parameter 'contentType' when calling scenarioUpdate(Async)");
        }

        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling scenarioUpdate(Async)");
        }

        // verify the required parameter 'scenarioId' is set
        if (scenarioId == null) {
            throw new ApiException("Missing the required parameter 'scenarioId' when calling scenarioUpdate(Async)");
        }

        // verify the required parameter 'scenario' is set
        if (scenario == null) {
            throw new ApiException("Missing the required parameter 'scenario' when calling scenarioUpdate(Async)");
        }

        return scenarioUpdateCall(workspaceId, xApiKey, contentType, accept, scenarioId, scenario, _callback);
    }

    private static ApiResponse<Void> scenarioUpdateWithHttpInfo(String workspaceId, String xApiKey, String contentType, String accept, String scenarioId, Scenario scenario) throws ApiException {
        okhttp3.Call localVarCall = scenarioUpdateCall(workspaceId, xApiKey, contentType, accept, scenarioId, scenario, null);
        return localVarApiClient.execute(localVarCall);
    }

    private static okhttp3.Call scenarioUpdateAsync(String workspaceId, String xApiKey, String contentType, String accept, String scenarioId, Scenario scenario, final ApiCallback<Void> _callback) throws ApiException {
        okhttp3.Call localVarCall = scenarioUpdateValidateBeforeCall(workspaceId, xApiKey, contentType, accept, scenarioId, scenario, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public static class ScenarioUpdateParams {
        private String workspaceId;
        private String scenarioId;
        private Scenario scenario;
        private String name;
        private String description;
        private String allowedUsers;
        private String allowedUserIds;
        private Message message;
        private String to;
        private String subject;
        private String label;
        private Email email;
        private Voice voice;
        private Web web;
        private Social social;

        private ScenarioUpdateParams(
            String workspaceId,
            String scenarioId,
            Scenario scenario,
            String name,
            String description,
            String allowedUsers,
            String allowedUserIds,
            Message message,
            String to,
            String subject,
            String label,
            Email email,
            Voice voice,
            Web web,
            Social social
        ){
            this.workspaceId = workspaceId;
            this.scenarioId = scenarioId;
            this.scenario = scenario;
            this.name = name;
            this.description = description;
            this.allowedUsers = allowedUsers;
            this.allowedUserIds = allowedUserIds;
            this.message = message;
            this.to = to;
            this.subject = subject;
            this.label = label;
            this.email = email;
            this.voice = voice;
            this.web = web;
            this.social = social;
        }
            public String getWorkspaceId() {
                return workspaceId;
            }
            public String getScenarioId() {
                return scenarioId;
            }
            public Scenario getScenario() {
                return scenario;
            }
            public String getName() {
                return name;
            }
            public String getDescription() {
                return description;
            }
            public enum AllowedUsersEnum {
            EVERYONE("EVERYONE"),
            
            SELECTEDUSERS("SELECTEDUSERS");
                private String value;
                AllowedUsersEnum(String value){
                    this.value = value;
                }

                public String getValue() {
                    return value;
                }
                
                @Override
                public String toString() {
                    return String.valueOf(value);
                }

                public static AllowedUsersEnum fromValue(String value) {
                    for (AllowedUsersEnum b : AllowedUsersEnum.values()) {
                        if (b.value.equals(value)) {
                            return b;
                        }
                    }
                    throw new IllegalArgumentException("Unexpected value '" + value + "'");
                }

            }
            public String getAllowedUsers() {
                return allowedUsers;
            }
            public String getAllowedUserIds() {
                return allowedUserIds;
            }
            public Message getMessage() {
                return message;
            }
            public String getTo() {
                return to;
            }
            public String getSubject() {
                return subject;
            }
            public String getLabel() {
                return label;
            }
            public Email getEmail() {
                return email;
            }
            public Voice getVoice() {
                return voice;
            }
            public Web getWeb() {
                return web;
            }
            public Social getSocial() {
                return social;
            }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private String workspaceId;
            private String scenarioId;
            private Scenario scenario;
            private String name;
            private String description;
            private String allowedUsers;
            private String allowedUserIds;
            private Message message;
            private String to;
            private String subject;
            private String label;
            private Email email;
            private Voice voice;
            private Web web;
            private Social social;

            public ScenarioUpdateParams build() {
                return new ScenarioUpdateParams(
                    workspaceId,
                    scenarioId,
                    scenario,
                    name,
                    description,
                    allowedUsers,
                    allowedUserIds,
                    message,
                    to,
                    subject,
                    label,
                    email,
                    voice,
                    web,
                    social
                );
            }

            public Builder setWorkspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }
            public Builder setScenarioId(String scenarioId) {
                this.scenarioId = scenarioId;
                return this;
            }
            public Builder setScenario(Scenario scenario) {
                this.scenario = scenario;
                return this;
            }
            public Builder setName(String name) {
                this.name = name;
                return this;
            }
            public Builder setDescription(String description) {
                this.description = description;
                return this;
            }
            public Builder setAllowedUsers(AllowedUsersEnum allowedUsers) {
                this.allowedUsers = allowedUsers.getValue();
                return this;
            }
            public Builder setAllowedUserIds(String allowedUserIds) {
                this.allowedUserIds = allowedUserIds;
                return this;
            }
            public Builder setMessage(Message message) {
                this.message = message;
                return this;
            }
            public Builder setTo(String to) {
                this.to = to;
                return this;
            }
            public Builder setSubject(String subject) {
                this.subject = subject;
                return this;
            }
            public Builder setLabel(String label) {
                this.label = label;
                return this;
            }
            public Builder setEmail(Email email) {
                this.email = email;
                return this;
            }
            public Builder setVoice(Voice voice) {
                this.voice = voice;
                return this;
            }
            public Builder setWeb(Web web) {
                this.web = web;
                return this;
            }
            public Builder setSocial(Social social) {
                this.social = social;
                return this;
            }
        }
        
        public static class Message {
            private String to;
            private String subject;
            private String body;
            private Email email;
            private Voice voice;
            private Web web;
            private Social social;
            private String type;
            private Features features;
            private Resource resource;
            private String messageTemplateId;
            private String messageTemplateName;
            private String callbackId;
            private Object callbackParameters;
            private String label;
            private String eventId;
            private String messageType;
            private String scheduleType;
            private String scheduleDate;
            private BigDecimal repetitionCount;
            private BigDecimal repeatDays;
            private BigDecimal repeatHrs;
            private BigDecimal repeatMin;
            private DeliveryReceipt dlr;

            private Message(String to, String subject, String body, Email email, Voice voice, Web web, Social social, String type, Features features, Resource resource, String messageTemplateId, String messageTemplateName, String callbackId, Object callbackParameters, String label, String eventId, String messageType, String scheduleType, String scheduleDate, BigDecimal repetitionCount, BigDecimal repeatDays, BigDecimal repeatHrs, BigDecimal repeatMin, DeliveryReceipt dlr){
            this.to = to;
            this.subject = subject;
            this.body = body;
            this.email = email;
            this.voice = voice;
            this.web = web;
            this.social = social;
            this.type = type;
            this.features = features;
            this.resource = resource;
            this.messageTemplateId = messageTemplateId;
            this.messageTemplateName = messageTemplateName;
            this.callbackId = callbackId;
            this.callbackParameters = callbackParameters;
            this.label = label;
            this.eventId = eventId;
            this.messageType = messageType;
            this.scheduleType = scheduleType;
            this.scheduleDate = scheduleDate;
            this.repetitionCount = repetitionCount;
            this.repeatDays = repeatDays;
            this.repeatHrs = repeatHrs;
            this.repeatMin = repeatMin;
            this.dlr = dlr;
            }

            public String getTo(){
                return to;
            }
            public String getSubject(){
                return subject;
            }
            public String getBody(){
                return body;
            }
            public Email getEmail(){
                return email;
            }
            public Voice getVoice(){
                return voice;
            }
            public Web getWeb(){
                return web;
            }
            public Social getSocial(){
                return social;
            }
            public String getType(){
                return type;
            }
            public enum TypeEnum {
                DEFAULT("default"),
                DEFAULTNOREPLY("defaultNoReply"),
                NODLR("noDlr");
                private String value;
                TypeEnum(String value){
                    this.value = value;
                }

                public String getValue() {
                    return value;
                }
                
                @Override
                public String toString() {
                    return String.valueOf(value);
                }

                public static TypeEnum fromValue(String value) {
                    for (TypeEnum b : TypeEnum.values()) {
                        if (b.value.equals(value)) {
                            return b;
                        }
                    }
                    throw new IllegalArgumentException("Unexpected value '" + value + "'");
                }

            }
            public Features getFeatures(){
                return features;
            }
            public Resource getResource(){
                return resource;
            }
            public String getMessageTemplateId(){
                return messageTemplateId;
            }
            public String getMessageTemplateName(){
                return messageTemplateName;
            }
            public String getCallbackId(){
                return callbackId;
            }
            public Object getCallbackParameters(){
                return callbackParameters;
            }
            public String getLabel(){
                return label;
            }
            public String getEventId(){
                return eventId;
            }
            public String getMessageType(){
                return messageType;
            }
            public enum MessageTypeEnum {
                SCHEDULED("SCHEDULED");
                private String value;
                MessageTypeEnum(String value){
                    this.value = value;
                }

                public String getValue() {
                    return value;
                }
                
                @Override
                public String toString() {
                    return String.valueOf(value);
                }

                public static MessageTypeEnum fromValue(String value) {
                    for (MessageTypeEnum b : MessageTypeEnum.values()) {
                        if (b.value.equals(value)) {
                            return b;
                        }
                    }
                    throw new IllegalArgumentException("Unexpected value '" + value + "'");
                }

            }
            public String getScheduleType(){
                return scheduleType;
            }
            public enum ScheduleTypeEnum {
                ONCE("ONCE"),
                REPEAT("REPEAT");
                private String value;
                ScheduleTypeEnum(String value){
                    this.value = value;
                }

                public String getValue() {
                    return value;
                }
                
                @Override
                public String toString() {
                    return String.valueOf(value);
                }

                public static ScheduleTypeEnum fromValue(String value) {
                    for (ScheduleTypeEnum b : ScheduleTypeEnum.values()) {
                        if (b.value.equals(value)) {
                            return b;
                        }
                    }
                    throw new IllegalArgumentException("Unexpected value '" + value + "'");
                }

            }
            public String getScheduleDate(){
                return scheduleDate;
            }
            public BigDecimal getRepetitionCount(){
                return repetitionCount;
            }
            public BigDecimal getRepeatDays(){
                return repeatDays;
            }
            public BigDecimal getRepeatHrs(){
                return repeatHrs;
            }
            public BigDecimal getRepeatMin(){
                return repeatMin;
            }
            public DeliveryReceipt getDlr(){
                return dlr;
            }

            public static Builder builder() {
                return new Builder();
            }   

            public static class Builder {
                private String to;
                private String subject;
                private String body;
                private Email email;
                private Voice voice;
                private Web web;
                private Social social;
                private String type;
                private Features features;
                private Resource resource;
                private String messageTemplateId;
                private String messageTemplateName;
                private String callbackId;
                private Object callbackParameters;
                private String label;
                private String eventId;
                private String messageType;
                private String scheduleType;
                private String scheduleDate;
                private BigDecimal repetitionCount;
                private BigDecimal repeatDays;
                private BigDecimal repeatHrs;
                private BigDecimal repeatMin;
                private DeliveryReceipt dlr;

                public Message build() {
                    return new Message(
                        this.to,
                        this.subject,
                        this.body,
                        this.email,
                        this.voice,
                        this.web,
                        this.social,
                        this.type,
                        this.features,
                        this.resource,
                        this.messageTemplateId,
                        this.messageTemplateName,
                        this.callbackId,
                        this.callbackParameters,
                        this.label,
                        this.eventId,
                        this.messageType,
                        this.scheduleType,
                        this.scheduleDate,
                        this.repetitionCount,
                        this.repeatDays,
                        this.repeatHrs,
                        this.repeatMin,
                        this.dlr
                    );
                }
                public Builder setTo(String to) {
                    this.to = to;
                    return this;
                }
                public Builder setSubject(String subject) {
                    this.subject = subject;
                    return this;
                }
                public Builder setBody(String body) {
                    this.body = body;
                    return this;
                }
                public Builder setEmail(Email email) {
                    this.email = email;
                    return this;
                }
                public Builder setVoice(Voice voice) {
                    this.voice = voice;
                    return this;
                }
                public Builder setWeb(Web web) {
                    this.web = web;
                    return this;
                }
                public Builder setSocial(Social social) {
                    this.social = social;
                    return this;
                }
                public Builder setType(TypeEnum type) {
                    this.type = type.getValue();
                    return this;
                }
                public Builder setFeatures(Features features) {
                    this.features = features;
                    return this;
                }
                public Builder setResource(Resource resource) {
                    this.resource = resource;
                    return this;
                }
                public Builder setMessageTemplateId(String messageTemplateId) {
                    this.messageTemplateId = messageTemplateId;
                    return this;
                }
                public Builder setMessageTemplateName(String messageTemplateName) {
                    this.messageTemplateName = messageTemplateName;
                    return this;
                }
                public Builder setCallbackId(String callbackId) {
                    this.callbackId = callbackId;
                    return this;
                }
                public Builder setCallbackParameters(Object callbackParameters) {
                    this.callbackParameters = callbackParameters;
                    return this;
                }
                public Builder setLabel(String label) {
                    this.label = label;
                    return this;
                }
                public Builder setEventId(String eventId) {
                    this.eventId = eventId;
                    return this;
                }
                public Builder setMessageType(MessageTypeEnum messageType) {
                    this.messageType = messageType.getValue();
                    return this;
                }
                public Builder setScheduleType(ScheduleTypeEnum scheduleType) {
                    this.scheduleType = scheduleType.getValue();
                    return this;
                }
                public Builder setScheduleDate(String scheduleDate) {
                    this.scheduleDate = scheduleDate;
                    return this;
                }
                public Builder setRepetitionCount(BigDecimal repetitionCount) {
                    this.repetitionCount = repetitionCount;
                    return this;
                }
                public Builder setRepeatDays(BigDecimal repeatDays) {
                    this.repeatDays = repeatDays;
                    return this;
                }
                public Builder setRepeatHrs(BigDecimal repeatHrs) {
                    this.repeatHrs = repeatHrs;
                    return this;
                }
                public Builder setRepeatMin(BigDecimal repeatMin) {
                    this.repeatMin = repeatMin;
                    return this;
                }
                public Builder setDlr(DeliveryReceipt dlr) {
                    this.dlr = dlr;
                    return this;
                }
            }

            public static class Email {
            private String body;
            private String footer;
            private String type;
            private Attachments resources;

            private Email(String body, String footer, String type, Attachments resources){
            this.body = body;
            this.footer = footer;
            this.type = type;
            this.resources = resources;
            }

            public String getBody(){
                return body;
            }
            public String getFooter(){
                return footer;
            }
            public String getType(){
                return type;
            }
            public enum TypeEnum {
                PLAIN("text/plain"),
                HTML("text/html");
                private String value;
                TypeEnum(String value){
                    this.value = value;
                }

                public String getValue() {
                    return value;
                }
                
                @Override
                public String toString() {
                    return String.valueOf(value);
                }

                public static TypeEnum fromValue(String value) {
                    for (TypeEnum b : TypeEnum.values()) {
                        if (b.value.equals(value)) {
                            return b;
                        }
                    }
                    throw new IllegalArgumentException("Unexpected value '" + value + "'");
                }

            }
            public Attachments getResources(){
                return resources;
            }

            public static Builder builder() {
                return new Builder();
            }   

            public static class Builder {
                private String body;
                private String footer;
                private String type;
                private Attachments resources;

                public Email build() {
                    return new Email(
                        this.body,
                        this.footer,
                        this.type,
                        this.resources
                    );
                }
                public Builder setBody(String body) {
                    this.body = body;
                    return this;
                }
                public Builder setFooter(String footer) {
                    this.footer = footer;
                    return this;
                }
                public Builder setType(TypeEnum type) {
                    this.type = type.getValue();
                    return this;
                }
                public Builder setResources(Attachments resources) {
                    this.resources = resources;
                    return this;
                }
            }

            public static class Attachments {
            private List<Attachment> attachments;

            private Attachments(List<Attachment> attachments){
            this.attachments = attachments;
            }

            public List<Attachment> getAttachments(){
                return attachments;
            }

            public static Builder builder() {
                return new Builder();
            }   

            public static class Builder {
                private List<Attachment> attachments;

                public Attachments build() {
                    return new Attachments(
                        this.attachments
                    );
                }
                public Builder addAttachment(Attachment element) {
                    if (this.attachments == null) {
                            this.attachments = new ArrayList<>();
                    }
                    this.attachments.add(element);
                    return this;
                }

                public Builder addAllAttachment(List<Attachment> elements) {
                    if (this.attachments == null) {
                            this.attachments = new ArrayList<>();
                    }
                    this.attachments.addAll(elements);
                    return this;
                }
            }

        public static class Attachment {
        private String attachmentName;
        private String derefUri;
        private String attachmentDesc;

        private Attachment(String attachmentName,String derefUri,String attachmentDesc){
            this.attachmentName = attachmentName;
            this.derefUri = derefUri;
            this.attachmentDesc = attachmentDesc;
        }

        public String getAttachmentName(){
            return attachmentName;
        }
        public String getDerefUri(){
            return derefUri;
        }
        public String getAttachmentDesc(){
            return attachmentDesc;
        }

        public static Builder builder() {
            return new Builder();
        }   

        public static class Builder {
            private String attachmentName;
            private String derefUri;
            private String attachmentDesc;

            public Attachment build() {
                return new Attachment(
                   this.attachmentName,
                   this.derefUri,
                   this.attachmentDesc
                );
            }
            public Builder setAttachmentName(String attachmentName) {
                this.attachmentName = attachmentName;
                return this;
            }
            public Builder setDerefUri(String derefUri) {
                this.derefUri = derefUri;
                return this;
            }
            public Builder setAttachmentDesc(String attachmentDesc) {
                this.attachmentDesc = attachmentDesc;
                return this;
            }
        }

    
    }

        }

        }
        public static class Voice {
            private String header;
            private String body;
            private String type;
            private Attachments resources;

            private Voice(String header, String body, String type, Attachments resources){
            this.header = header;
            this.body = body;
            this.type = type;
            this.resources = resources;
            }

            public String getHeader(){
                return header;
            }
            public String getBody(){
                return body;
            }
            public String getType(){
                return type;
            }
            public Attachments getResources(){
                return resources;
            }

            public static Builder builder() {
                return new Builder();
            }   

            public static class Builder {
                private String header;
                private String body;
                private String type;
                private Attachments resources;

                public Voice build() {
                    return new Voice(
                        this.header,
                        this.body,
                        this.type,
                        this.resources
                    );
                }
                public Builder setHeader(String header) {
                    this.header = header;
                    return this;
                }
                public Builder setBody(String body) {
                    this.body = body;
                    return this;
                }
                public Builder setType(String type) {
                    this.type = type;
                    return this;
                }
                public Builder setResources(Attachments resources) {
                    this.resources = resources;
                    return this;
                }
            }

            public static class Attachments {
            private List<Attachment> attachments;

            private Attachments(List<Attachment> attachments){
            this.attachments = attachments;
            }

            public List<Attachment> getAttachments(){
                return attachments;
            }

            public static Builder builder() {
                return new Builder();
            }   

            public static class Builder {
                private List<Attachment> attachments;

                public Attachments build() {
                    return new Attachments(
                        this.attachments
                    );
                }
                public Builder addAttachment(Attachment element) {
                    if (this.attachments == null) {
                            this.attachments = new ArrayList<>();
                    }
                    this.attachments.add(element);
                    return this;
                }

                public Builder addAllAttachment(List<Attachment> elements) {
                    if (this.attachments == null) {
                            this.attachments = new ArrayList<>();
                    }
                    this.attachments.addAll(elements);
                    return this;
                }
            }

        public static class Attachment {
        private String attachmentName;
        private String derefUri;
        private String attachmentDesc;

        private Attachment(String attachmentName,String derefUri,String attachmentDesc){
            this.attachmentName = attachmentName;
            this.derefUri = derefUri;
            this.attachmentDesc = attachmentDesc;
        }

        public String getAttachmentName(){
            return attachmentName;
        }
        public String getDerefUri(){
            return derefUri;
        }
        public String getAttachmentDesc(){
            return attachmentDesc;
        }

        public static Builder builder() {
            return new Builder();
        }   

        public static class Builder {
            private String attachmentName;
            private String derefUri;
            private String attachmentDesc;

            public Attachment build() {
                return new Attachment(
                   this.attachmentName,
                   this.derefUri,
                   this.attachmentDesc
                );
            }
            public Builder setAttachmentName(String attachmentName) {
                this.attachmentName = attachmentName;
                return this;
            }
            public Builder setDerefUri(String derefUri) {
                this.derefUri = derefUri;
                return this;
            }
            public Builder setAttachmentDesc(String attachmentDesc) {
                this.attachmentDesc = attachmentDesc;
                return this;
            }
        }

    
    }

        }

        }
        public static class Web {
            private String body;
            private String type;

            private Web(String body, String type){
            this.body = body;
            this.type = type;
            }

            public String getBody(){
                return body;
            }
            public String getType(){
                return type;
            }
            public enum TypeEnum {
                PLAIN("text/plain"),
                HTML("text/html");
                private String value;
                TypeEnum(String value){
                    this.value = value;
                }

                public String getValue() {
                    return value;
                }
                
                @Override
                public String toString() {
                    return String.valueOf(value);
                }

                public static TypeEnum fromValue(String value) {
                    for (TypeEnum b : TypeEnum.values()) {
                        if (b.value.equals(value)) {
                            return b;
                        }
                    }
                    throw new IllegalArgumentException("Unexpected value '" + value + "'");
                }

            }

            public static Builder builder() {
                return new Builder();
            }   

            public static class Builder {
                private String body;
                private String type;

                public Web build() {
                    return new Web(
                        this.body,
                        this.type
                    );
                }
                public Builder setBody(String body) {
                    this.body = body;
                    return this;
                }
                public Builder setType(TypeEnum type) {
                    this.type = type.getValue();
                    return this;
                }
            }

    
        }
        public static class Social {
            private List<Channel> social;

            private Social(List<Channel> social){
            this.social = social;
            }

            public List<Channel> getSocial(){
                return social;
            }

            public static Builder builder() {
                return new Builder();
            }   

            public static class Builder {
                private List<Channel> social;

                public Social build() {
                    return new Social(
                        this.social
                    );
                }
                public Builder addChannel(Channel element) {
                    if (this.social == null) {
                            this.social = new ArrayList<>();
                    }
                    this.social.add(element);
                    return this;
                }

                public Builder addAllChannel(List<Channel> elements) {
                    if (this.social == null) {
                            this.social = new ArrayList<>();
                    }
                    this.social.addAll(elements);
                    return this;
                }
            }

        public static class Channel {
        private String id;
        private String body;
        private String type;

        private Channel(String id,String body,String type){
            this.id = id;
            this.body = body;
            this.type = type;
        }

        public String getId(){
            return id;
        }
            public enum IdEnum {
                SOCIAL("social"),
                SOCIAL_LONG("social_long");
                IdEnum(String value){
                    this.value = value;
                }

                private String value;
                public String getValue() {
                    return value;
                }
                
                @Override
                public String toString() {
                    return String.valueOf(value);
                }

                public static IdEnum fromValue(String value) {
                    for (IdEnum b : IdEnum.values()) {
                        if (b.value.equals(value)) {
                            return b;
                        }
                    }
                    throw new IllegalArgumentException("Unexpected value '" + value + "'");
                }

            }
        public String getBody(){
            return body;
        }
        public String getType(){
            return type;
        }
            public enum TypeEnum {
                PLAIN("text/plain"),
                HTML("text/html");
                TypeEnum(String value){
                    this.value = value;
                }

                private String value;
                public String getValue() {
                    return value;
                }
                
                @Override
                public String toString() {
                    return String.valueOf(value);
                }

                public static TypeEnum fromValue(String value) {
                    for (TypeEnum b : TypeEnum.values()) {
                        if (b.value.equals(value)) {
                            return b;
                        }
                    }
                    throw new IllegalArgumentException("Unexpected value '" + value + "'");
                }

            }

        public static Builder builder() {
            return new Builder();
        }   

        public static class Builder {
            private String id;
            private String body;
            private String type;

            public Channel build() {
                return new Channel(
                   this.id,
                   this.body,
                   this.type
                );
            }
            public Builder setId(IdEnum id) {
                this.id = id.getValue();
                return this;
            }
            public Builder setBody(String body) {
                this.body = body;
                return this;
            }
            public Builder setType(TypeEnum type) {
                this.type = type.getValue();
                return this;
            }
        }

    
    }

        }
        public static class Features {
            private PushOptions pushOptions;
            private AliasOption aliasOption;

            private Features(PushOptions pushOptions, AliasOption aliasOption){
            this.pushOptions = pushOptions;
            this.aliasOption = aliasOption;
            }

            public PushOptions getPushOptions(){
                return pushOptions;
            }
            public AliasOption getAliasOption(){
                return aliasOption;
            }

            public static Builder builder() {
                return new Builder();
            }   

            public static class Builder {
                private PushOptions pushOptions;
                private AliasOption aliasOption;

                public Features build() {
                    return new Features(
                        this.pushOptions,
                        this.aliasOption
                    );
                }
                public Builder setPushOptions(PushOptions pushOptions) {
                    this.pushOptions = pushOptions;
                    return this;
                }
                public Builder setAliasOption(AliasOption aliasOption) {
                    this.aliasOption = aliasOption;
                    return this;
                }
            }

            public static class PushOptions {
            private String notifications;
            private String escalationMins;
            private String appId;
            private String priority;
            private Fcm fcm;
            private Apns apns;
            private Object data;

            private PushOptions(String notifications, String escalationMins, String appId, String priority, Fcm fcm, Apns apns, Object data){
            this.notifications = notifications;
            this.escalationMins = escalationMins;
            this.appId = appId;
            this.priority = priority;
            this.fcm = fcm;
            this.apns = apns;
            this.data = data;
            }

            public String getNotifications(){
                return notifications;
            }
            public enum NotificationsEnum {
                ENABLED("enabled"),
                DISABLED("disabled");
                private String value;
                NotificationsEnum(String value){
                    this.value = value;
                }

                public String getValue() {
                    return value;
                }
                
                @Override
                public String toString() {
                    return String.valueOf(value);
                }

                public static NotificationsEnum fromValue(String value) {
                    for (NotificationsEnum b : NotificationsEnum.values()) {
                        if (b.value.equals(value)) {
                            return b;
                        }
                    }
                    throw new IllegalArgumentException("Unexpected value '" + value + "'");
                }

            }
            public String getEscalationMins(){
                return escalationMins;
            }
            public String getAppId(){
                return appId;
            }
            public String getPriority(){
                return priority;
            }
            public enum PriorityEnum {
                NORMAL("NORMAL"),
                HIGH("HIGH");
                private String value;
                PriorityEnum(String value){
                    this.value = value;
                }

                public String getValue() {
                    return value;
                }
                
                @Override
                public String toString() {
                    return String.valueOf(value);
                }

                public static PriorityEnum fromValue(String value) {
                    for (PriorityEnum b : PriorityEnum.values()) {
                        if (b.value.equals(value)) {
                            return b;
                        }
                    }
                    throw new IllegalArgumentException("Unexpected value '" + value + "'");
                }

            }
            public Fcm getFcm(){
                return fcm;
            }
            public Apns getApns(){
                return apns;
            }
            public Object getData(){
                return data;
            }

            public static Builder builder() {
                return new Builder();
            }   

            public static class Builder {
                private String notifications;
                private String escalationMins;
                private String appId;
                private String priority;
                private Fcm fcm;
                private Apns apns;
                private Object data;

                public PushOptions build() {
                    return new PushOptions(
                        this.notifications,
                        this.escalationMins,
                        this.appId,
                        this.priority,
                        this.fcm,
                        this.apns,
                        this.data
                    );
                }
                public Builder setNotifications(NotificationsEnum notifications) {
                    this.notifications = notifications.getValue();
                    return this;
                }
                public Builder setEscalationMins(String escalationMins) {
                    this.escalationMins = escalationMins;
                    return this;
                }
                public Builder setAppId(String appId) {
                    this.appId = appId;
                    return this;
                }
                public Builder setPriority(PriorityEnum priority) {
                    this.priority = priority.getValue();
                    return this;
                }
                public Builder setFcm(Fcm fcm) {
                    this.fcm = fcm;
                    return this;
                }
                public Builder setApns(Apns apns) {
                    this.apns = apns;
                    return this;
                }
                public Builder setData(Object data) {
                    this.data = data;
                    return this;
                }
            }

            public static class Fcm {
            private String androidChannelId;
            private String sound;
            private String action;
            private String image;

            private Fcm(String androidChannelId, String sound, String action, String image){
            this.androidChannelId = androidChannelId;
            this.sound = sound;
            this.action = action;
            this.image = image;
            }

            public String getAndroidChannelId(){
                return androidChannelId;
            }
            public String getSound(){
                return sound;
            }
            public String getAction(){
                return action;
            }
            public String getImage(){
                return image;
            }

            public static Builder builder() {
                return new Builder();
            }   

            public static class Builder {
                private String androidChannelId;
                private String sound;
                private String action;
                private String image;

                public Fcm build() {
                    return new Fcm(
                        this.androidChannelId,
                        this.sound,
                        this.action,
                        this.image
                    );
                }
                public Builder setAndroidChannelId(String androidChannelId) {
                    this.androidChannelId = androidChannelId;
                    return this;
                }
                public Builder setSound(String sound) {
                    this.sound = sound;
                    return this;
                }
                public Builder setAction(String action) {
                    this.action = action;
                    return this;
                }
                public Builder setImage(String image) {
                    this.image = image;
                    return this;
                }
            }

    
        }
        public static class Apns {
            private String sound;
            private String action;

            private Apns(String sound, String action){
            this.sound = sound;
            this.action = action;
            }

            public String getSound(){
                return sound;
            }
            public String getAction(){
                return action;
            }

            public static Builder builder() {
                return new Builder();
            }   

            public static class Builder {
                private String sound;
                private String action;

                public Apns build() {
                    return new Apns(
                        this.sound,
                        this.action
                    );
                }
                public Builder setSound(String sound) {
                    this.sound = sound;
                    return this;
                }
                public Builder setAction(String action) {
                    this.action = action;
                    return this;
                }
            }

    
        }

        }
        public static class AliasOption {
            private String aliasName;

            private AliasOption(String aliasName){
            this.aliasName = aliasName;
            }

            public String getAliasName(){
                return aliasName;
            }

            public static Builder builder() {
                return new Builder();
            }   

            public static class Builder {
                private String aliasName;

                public AliasOption build() {
                    return new AliasOption(
                        this.aliasName
                    );
                }
                public Builder setAliasName(String aliasName) {
                    this.aliasName = aliasName;
                    return this;
                }
            }

    
        }

        }
        public static class Resource {
            private String name;
            private String scope;
            private String mimeType;
            private String derefUri;

            private Resource(String name, String scope, String mimeType, String derefUri){
            this.name = name;
            this.scope = scope;
            this.mimeType = mimeType;
            this.derefUri = derefUri;
            }

            public String getName(){
                return name;
            }
            public String getScope(){
                return scope;
            }
            public enum ScopeEnum {
                PRIVATE("private"),
                PUBLIC("public");
                private String value;
                ScopeEnum(String value){
                    this.value = value;
                }

                public String getValue() {
                    return value;
                }
                
                @Override
                public String toString() {
                    return String.valueOf(value);
                }

                public static ScopeEnum fromValue(String value) {
                    for (ScopeEnum b : ScopeEnum.values()) {
                        if (b.value.equals(value)) {
                            return b;
                        }
                    }
                    throw new IllegalArgumentException("Unexpected value '" + value + "'");
                }

            }
            public String getMimeType(){
                return mimeType;
            }
            public String getDerefUri(){
                return derefUri;
            }

            public static Builder builder() {
                return new Builder();
            }   

            public static class Builder {
                private String name;
                private String scope;
                private String mimeType;
                private String derefUri;

                public Resource build() {
                    return new Resource(
                        this.name,
                        this.scope,
                        this.mimeType,
                        this.derefUri
                    );
                }
                public Builder setName(String name) {
                    this.name = name;
                    return this;
                }
                public Builder setScope(ScopeEnum scope) {
                    this.scope = scope.getValue();
                    return this;
                }
                public Builder setMimeType(String mimeType) {
                    this.mimeType = mimeType;
                    return this;
                }
                public Builder setDerefUri(String derefUri) {
                    this.derefUri = derefUri;
                    return this;
                }
            }

    
        }
        public static class DeliveryReceipt {

            private DeliveryReceipt(){
            }


            public static Builder builder() {
                return new Builder();
            }   

            public static class Builder {

                public DeliveryReceipt build() {
                    return new DeliveryReceipt(
                    );
                }
            }

    
        }

        }
        public static class Email {
            private String body;
            private String footer;
            private String type;
            private Attachments resources;

            private Email(String body, String footer, String type, Attachments resources){
            this.body = body;
            this.footer = footer;
            this.type = type;
            this.resources = resources;
            }

            public String getBody(){
                return body;
            }
            public String getFooter(){
                return footer;
            }
            public String getType(){
                return type;
            }
            public enum TypeEnum {
                PLAIN("text/plain"),
                HTML("text/html");
                private String value;
                TypeEnum(String value){
                    this.value = value;
                }

                public String getValue() {
                    return value;
                }
                
                @Override
                public String toString() {
                    return String.valueOf(value);
                }

                public static TypeEnum fromValue(String value) {
                    for (TypeEnum b : TypeEnum.values()) {
                        if (b.value.equals(value)) {
                            return b;
                        }
                    }
                    throw new IllegalArgumentException("Unexpected value '" + value + "'");
                }

            }
            public Attachments getResources(){
                return resources;
            }

            public static Builder builder() {
                return new Builder();
            }   

            public static class Builder {
                private String body;
                private String footer;
                private String type;
                private Attachments resources;

                public Email build() {
                    return new Email(
                        this.body,
                        this.footer,
                        this.type,
                        this.resources
                    );
                }
                public Builder setBody(String body) {
                    this.body = body;
                    return this;
                }
                public Builder setFooter(String footer) {
                    this.footer = footer;
                    return this;
                }
                public Builder setType(TypeEnum type) {
                    this.type = type.getValue();
                    return this;
                }
                public Builder setResources(Attachments resources) {
                    this.resources = resources;
                    return this;
                }
            }

            public static class Attachments {
            private List<Attachment> attachments;

            private Attachments(List<Attachment> attachments){
            this.attachments = attachments;
            }

            public List<Attachment> getAttachments(){
                return attachments;
            }

            public static Builder builder() {
                return new Builder();
            }   

            public static class Builder {
                private List<Attachment> attachments;

                public Attachments build() {
                    return new Attachments(
                        this.attachments
                    );
                }
                public Builder addAttachment(Attachment element) {
                    if (this.attachments == null) {
                            this.attachments = new ArrayList<>();
                    }
                    this.attachments.add(element);
                    return this;
                }

                public Builder addAllAttachment(List<Attachment> elements) {
                    if (this.attachments == null) {
                            this.attachments = new ArrayList<>();
                    }
                    this.attachments.addAll(elements);
                    return this;
                }
            }

        public static class Attachment {
        private String attachmentName;
        private String derefUri;
        private String attachmentDesc;

        private Attachment(String attachmentName,String derefUri,String attachmentDesc){
            this.attachmentName = attachmentName;
            this.derefUri = derefUri;
            this.attachmentDesc = attachmentDesc;
        }

        public String getAttachmentName(){
            return attachmentName;
        }
        public String getDerefUri(){
            return derefUri;
        }
        public String getAttachmentDesc(){
            return attachmentDesc;
        }

        public static Builder builder() {
            return new Builder();
        }   

        public static class Builder {
            private String attachmentName;
            private String derefUri;
            private String attachmentDesc;

            public Attachment build() {
                return new Attachment(
                   this.attachmentName,
                   this.derefUri,
                   this.attachmentDesc
                );
            }
            public Builder setAttachmentName(String attachmentName) {
                this.attachmentName = attachmentName;
                return this;
            }
            public Builder setDerefUri(String derefUri) {
                this.derefUri = derefUri;
                return this;
            }
            public Builder setAttachmentDesc(String attachmentDesc) {
                this.attachmentDesc = attachmentDesc;
                return this;
            }
        }

    
    }

        }

        }
        public static class Voice {
            private String header;
            private String body;
            private String type;
            private Attachments resources;

            private Voice(String header, String body, String type, Attachments resources){
            this.header = header;
            this.body = body;
            this.type = type;
            this.resources = resources;
            }

            public String getHeader(){
                return header;
            }
            public String getBody(){
                return body;
            }
            public String getType(){
                return type;
            }
            public Attachments getResources(){
                return resources;
            }

            public static Builder builder() {
                return new Builder();
            }   

            public static class Builder {
                private String header;
                private String body;
                private String type;
                private Attachments resources;

                public Voice build() {
                    return new Voice(
                        this.header,
                        this.body,
                        this.type,
                        this.resources
                    );
                }
                public Builder setHeader(String header) {
                    this.header = header;
                    return this;
                }
                public Builder setBody(String body) {
                    this.body = body;
                    return this;
                }
                public Builder setType(String type) {
                    this.type = type;
                    return this;
                }
                public Builder setResources(Attachments resources) {
                    this.resources = resources;
                    return this;
                }
            }

            public static class Attachments {
            private List<Attachment> attachments;

            private Attachments(List<Attachment> attachments){
            this.attachments = attachments;
            }

            public List<Attachment> getAttachments(){
                return attachments;
            }

            public static Builder builder() {
                return new Builder();
            }   

            public static class Builder {
                private List<Attachment> attachments;

                public Attachments build() {
                    return new Attachments(
                        this.attachments
                    );
                }
                public Builder addAttachment(Attachment element) {
                    if (this.attachments == null) {
                            this.attachments = new ArrayList<>();
                    }
                    this.attachments.add(element);
                    return this;
                }

                public Builder addAllAttachment(List<Attachment> elements) {
                    if (this.attachments == null) {
                            this.attachments = new ArrayList<>();
                    }
                    this.attachments.addAll(elements);
                    return this;
                }
            }

        public static class Attachment {
        private String attachmentName;
        private String derefUri;
        private String attachmentDesc;

        private Attachment(String attachmentName,String derefUri,String attachmentDesc){
            this.attachmentName = attachmentName;
            this.derefUri = derefUri;
            this.attachmentDesc = attachmentDesc;
        }

        public String getAttachmentName(){
            return attachmentName;
        }
        public String getDerefUri(){
            return derefUri;
        }
        public String getAttachmentDesc(){
            return attachmentDesc;
        }

        public static Builder builder() {
            return new Builder();
        }   

        public static class Builder {
            private String attachmentName;
            private String derefUri;
            private String attachmentDesc;

            public Attachment build() {
                return new Attachment(
                   this.attachmentName,
                   this.derefUri,
                   this.attachmentDesc
                );
            }
            public Builder setAttachmentName(String attachmentName) {
                this.attachmentName = attachmentName;
                return this;
            }
            public Builder setDerefUri(String derefUri) {
                this.derefUri = derefUri;
                return this;
            }
            public Builder setAttachmentDesc(String attachmentDesc) {
                this.attachmentDesc = attachmentDesc;
                return this;
            }
        }

    
    }

        }

        }
        public static class Web {
            private String body;
            private String type;

            private Web(String body, String type){
            this.body = body;
            this.type = type;
            }

            public String getBody(){
                return body;
            }
            public String getType(){
                return type;
            }
            public enum TypeEnum {
                PLAIN("text/plain"),
                HTML("text/html");
                private String value;
                TypeEnum(String value){
                    this.value = value;
                }

                public String getValue() {
                    return value;
                }
                
                @Override
                public String toString() {
                    return String.valueOf(value);
                }

                public static TypeEnum fromValue(String value) {
                    for (TypeEnum b : TypeEnum.values()) {
                        if (b.value.equals(value)) {
                            return b;
                        }
                    }
                    throw new IllegalArgumentException("Unexpected value '" + value + "'");
                }

            }

            public static Builder builder() {
                return new Builder();
            }   

            public static class Builder {
                private String body;
                private String type;

                public Web build() {
                    return new Web(
                        this.body,
                        this.type
                    );
                }
                public Builder setBody(String body) {
                    this.body = body;
                    return this;
                }
                public Builder setType(TypeEnum type) {
                    this.type = type.getValue();
                    return this;
                }
            }

    
        }
        public static class Social {
            private List<Channel> social;

            private Social(List<Channel> social){
            this.social = social;
            }

            public List<Channel> getSocial(){
                return social;
            }

            public static Builder builder() {
                return new Builder();
            }   

            public static class Builder {
                private List<Channel> social;

                public Social build() {
                    return new Social(
                        this.social
                    );
                }
                public Builder addChannel(Channel element) {
                    if (this.social == null) {
                            this.social = new ArrayList<>();
                    }
                    this.social.add(element);
                    return this;
                }

                public Builder addAllChannel(List<Channel> elements) {
                    if (this.social == null) {
                            this.social = new ArrayList<>();
                    }
                    this.social.addAll(elements);
                    return this;
                }
            }

        public static class Channel {
        private String id;
        private String body;
        private String type;

        private Channel(String id,String body,String type){
            this.id = id;
            this.body = body;
            this.type = type;
        }

        public String getId(){
            return id;
        }
            public enum IdEnum {
                SOCIAL("social"),
                SOCIAL_LONG("social_long");
                IdEnum(String value){
                    this.value = value;
                }

                private String value;
                public String getValue() {
                    return value;
                }
                
                @Override
                public String toString() {
                    return String.valueOf(value);
                }

                public static IdEnum fromValue(String value) {
                    for (IdEnum b : IdEnum.values()) {
                        if (b.value.equals(value)) {
                            return b;
                        }
                    }
                    throw new IllegalArgumentException("Unexpected value '" + value + "'");
                }

            }
        public String getBody(){
            return body;
        }
        public String getType(){
            return type;
        }
            public enum TypeEnum {
                PLAIN("text/plain"),
                HTML("text/html");
                TypeEnum(String value){
                    this.value = value;
                }

                private String value;
                public String getValue() {
                    return value;
                }
                
                @Override
                public String toString() {
                    return String.valueOf(value);
                }

                public static TypeEnum fromValue(String value) {
                    for (TypeEnum b : TypeEnum.values()) {
                        if (b.value.equals(value)) {
                            return b;
                        }
                    }
                    throw new IllegalArgumentException("Unexpected value '" + value + "'");
                }

            }

        public static Builder builder() {
            return new Builder();
        }   

        public static class Builder {
            private String id;
            private String body;
            private String type;

            public Channel build() {
                return new Channel(
                   this.id,
                   this.body,
                   this.type
                );
            }
            public Builder setId(IdEnum id) {
                this.id = id.getValue();
                return this;
            }
            public Builder setBody(String body) {
                this.body = body;
                return this;
            }
            public Builder setType(TypeEnum type) {
                this.type = type.getValue();
                return this;
            }
        }

    
    }

        }

    }

    public static class ScenarioUpdateRequest {
        private final String workspaceId;
        private final String xApiKey;
        private final String contentType;
        private final String accept;
        private final String scenarioId;
        private final Scenario scenario;
        ApiResponse _lastResponse;

        private ScenarioUpdateRequest(String workspaceId, String xApiKey, String contentType, String accept, String scenarioId, Scenario scenario) {
            this.workspaceId = workspaceId;
            this.xApiKey = xApiKey;
            this.contentType = contentType;
            this.accept = accept;
            this.scenarioId = scenarioId;
            this.scenario = scenario;
        }

        /**
         * Build call for scenarioUpdate
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return scenarioUpdateCall(workspaceId, xApiKey, contentType, accept, scenarioId, scenario, _callback);
        }

        /**
         * Execute scenarioUpdate request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public void execute() throws ApiException {
            scenarioUpdateWithHttpInfo(workspaceId, xApiKey, contentType, accept, scenarioId, scenario);
        }
        /**
         * Return the last executed API response
         * @return ApiResponse
         */
        public ApiResponse getLastResponse()  {
            return _lastResponse;
        }


        /**
         * Execute scenarioUpdate request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return scenarioUpdateAsync(workspaceId, xApiKey, contentType, accept, scenarioId, scenario, _callback);
        }
    }

    /**
     * Update a scenario
     * @param params The param instance required to create ScenarioUpdateRequest
     * @return void
     */

    public static void update(Map<String, Object> params) throws ApiException {
        String workspaceId = (String) params.get("workspaceId");

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }
        String scenarioId = (String) params.get("scenarioId");

        if(scenarioId == null || scenarioId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'scenarioId'");
        }
        String nameValue = (String) params.get("name");
        if(nameValue == null) {
            throw new ApiException("Missing the required property value of 'name'");
        }
        String descriptionValue = (String) params.get("description");
        if(descriptionValue == null) {
            throw new ApiException("Missing the required property value of 'description'");
        }
        com.whispir.api.ScenariosApi.ScenarioUpdateParams.AllowedUsersEnum allowedUsersValue = com.whispir.api.ScenariosApi.ScenarioUpdateParams.AllowedUsersEnum.valueOf((String) params.get("allowedUsers"));
        String allowedUserIdsValue = (String) params.get("allowedUserIds");
        Object messageValue = params.get("message");
        if(messageValue == null) {
            throw new ApiException("Missing the required property value of 'message'");
        }
        String toValue = (String) params.get("to");
        String subjectValue = (String) params.get("subject");
        String labelValue = (String) params.get("label");
        Object emailValue = params.get("email");
        Object voiceValue = params.get("voice");
        Object webValue = params.get("web");
        Object socialValue = params.get("social");
        ScenarioUpdateParams tempParams = ScenarioUpdateParams.builder()
            .setWorkspaceId(workspaceId)
            .setScenarioId(scenarioId)
            .setName(nameValue)
            .setDescription(descriptionValue)
            .setAllowedUsers(allowedUsersValue)
            .setAllowedUserIds(allowedUserIdsValue)
            .setMessage((com.whispir.api.ScenariosApi.ScenarioUpdateParams.Message) messageValue)
            .setTo(toValue)
            .setSubject(subjectValue)
            .setLabel(labelValue)
            .setEmail((com.whispir.api.ScenariosApi.ScenarioUpdateParams.Email) emailValue)
            .setVoice((com.whispir.api.ScenariosApi.ScenarioUpdateParams.Voice) voiceValue)
            .setWeb((com.whispir.api.ScenariosApi.ScenarioUpdateParams.Web) webValue)
            .setSocial((com.whispir.api.ScenariosApi.ScenarioUpdateParams.Social) socialValue).build();

        update(tempParams);
    }

    public static void update(ScenarioUpdateParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }


        String workspaceId = params.getWorkspaceId();

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }

        String contentType = "application/vnd.whispir.scenario-v1+json";

        String accept = "application/vnd.whispir.scenario-v1+json";


        String scenarioId = params.getScenarioId();

        if(scenarioId == null || scenarioId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'scenarioId'");
        }

        // Constructing 'Scenario' from 'ScenarioUpdateParams' instance passed
        Scenario scenario = new Scenario();
        String nameValue = params.getName();
        if(nameValue == null) {
            throw new ApiException("Missing the required property value of 'name'");
        }
        scenario.setName(nameValue);

        String descriptionValue = params.getDescription();
        if(descriptionValue == null) {
            throw new ApiException("Missing the required property value of 'description'");
        }
        scenario.setDescription(descriptionValue);

        String allowedUsersValue = params.getAllowedUsers();
        scenario.setAllowedUsers(allowedUsersValue);

        String allowedUserIdsValue = params.getAllowedUserIds();
        scenario.setAllowedUserIds(allowedUserIdsValue);

        Object messageValue = params.getMessage();
        if(messageValue == null) {
            throw new ApiException("Missing the required property value of 'message'");
        }
        scenario.setMessage((com.whispir.model.Message) messageValue);

        String toValue = params.getTo();
        scenario.setTo(toValue);

        String subjectValue = params.getSubject();
        scenario.setSubject(subjectValue);

        String labelValue = params.getLabel();
        scenario.setLabel(labelValue);

        Object emailValue = params.getEmail();
        scenario.setEmail((com.whispir.model.Email) emailValue);

        Object voiceValue = params.getVoice();
        scenario.setVoice((com.whispir.model.Voice) voiceValue);

        Object webValue = params.getWeb();
        scenario.setWeb((com.whispir.model.Web) webValue);

        Object socialValue = params.getSocial();
        scenario.setSocial((com.whispir.model.Social) socialValue);

        ScenarioUpdateRequest request = new ScenarioUpdateRequest(workspaceId, xApiKey, contentType, accept, scenarioId, scenario);

        // Ensure to include all of the 'optionalParams' that are passed

        request.execute();
    }
}
