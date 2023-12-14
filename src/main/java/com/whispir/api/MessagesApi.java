package com.whispir.api;

import com.whispir.Whispir;
import com.whispir.client.ApiCallback;
import com.whispir.client.ApiClient;
import com.whispir.client.ApiException;
import com.whispir.client.ApiResponse;
import com.whispir.client.Configuration;
import com.whispir.client.Pair;
import com.whispir.client.Version;

import com.google.gson.reflect.TypeToken;
import com.whispir.model.*;

import java.math.BigDecimal;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class MessagesApi {
    private static ApiClient localVarApiClient = Configuration.getDefaultApiClient();

    private static okhttp3.Call messageCreateCall(String workspaceId, String xApiKey, String contentType, String accept, Message message, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = message;

        // create path and map variables
        String localVarPath = "/workspaces/{workspaceId}/messages"
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
            "application/vnd.whispir.message-v1+json",
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/vnd.whispir.message-v1+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth", "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private static okhttp3.Call messageCreateValidateBeforeCall(String workspaceId, String xApiKey, String contentType, String accept, Message message, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'workspaceId' is set
        if (workspaceId == null) {
            throw new ApiException("Missing the required parameter 'workspaceId' when calling messageCreate(Async)");
        }

        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling messageCreate(Async)");
        }

        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new ApiException("Missing the required parameter 'contentType' when calling messageCreate(Async)");
        }

        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling messageCreate(Async)");
        }

        // verify the required parameter 'message' is set
        if (message == null) {
            throw new ApiException("Missing the required parameter 'message' when calling messageCreate(Async)");
        }

        return messageCreateCall(workspaceId, xApiKey, contentType, accept, message, _callback);
    }

    private static ApiResponse<Message> messageCreateWithHttpInfo(String workspaceId, String xApiKey, String contentType, String accept, Message message) throws ApiException {
        okhttp3.Call localVarCall = messageCreateCall(workspaceId, xApiKey, contentType, accept, message, null);
        Type localVarReturnType = new TypeToken<Message>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private static okhttp3.Call messageCreateAsync(String workspaceId, String xApiKey, String contentType, String accept, Message message, final ApiCallback<Message> _callback) throws ApiException {
        okhttp3.Call localVarCall = messageCreateValidateBeforeCall(workspaceId, xApiKey, contentType, accept, message, _callback);
        Type localVarReturnType = new TypeToken<Message>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public static class MessageCreateParams {
        private String workspaceId;
        private Message message;
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

        private MessageCreateParams(
            String workspaceId,
            Message message,
            String to,
            String subject,
            String body,
            Email email,
            Voice voice,
            Web web,
            Social social,
            String type,
            Features features,
            Resource resource,
            String messageTemplateId,
            String messageTemplateName,
            String callbackId,
            Object callbackParameters,
            String label,
            String eventId,
            String messageType,
            String scheduleType,
            String scheduleDate,
            BigDecimal repetitionCount,
            BigDecimal repeatDays,
            BigDecimal repeatHrs,
            BigDecimal repeatMin,
            DeliveryReceipt dlr
        ){
            this.workspaceId = workspaceId;
            this.message = message;
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
            public String getWorkspaceId() {
                return workspaceId;
            }
            public Message getMessage() {
                return message;
            }
            public enum DirectionEnum {
            OUTGOING("OUTGOING");
                private String value;
                DirectionEnum(String value){
                    this.value = value;
                }

                public String getValue() {
                    return value;
                }
                
                @Override
                public String toString() {
                    return String.valueOf(value);
                }

                public static DirectionEnum fromValue(String value) {
                    for (DirectionEnum b : DirectionEnum.values()) {
                        if (b.value.equals(value)) {
                            return b;
                        }
                    }
                    throw new IllegalArgumentException("Unexpected value '" + value + "'");
                }

            }
            public String getTo() {
                return to;
            }
            public String getSubject() {
                return subject;
            }
            public String getBody() {
                return body;
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
            public enum TypeEnum {
            DEFAULT("default"),
            
            DEFAULT_NO_REPLY("defaultNoReply"),
            
            NO_DLR("noDlr");
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
            public String getType() {
                return type;
            }
            public Features getFeatures() {
                return features;
            }
            public Resource getResource() {
                return resource;
            }
            public String getMessageTemplateId() {
                return messageTemplateId;
            }
            public String getMessageTemplateName() {
                return messageTemplateName;
            }
            public String getCallbackId() {
                return callbackId;
            }
            public Object getCallbackParameters() {
                return callbackParameters;
            }
            public String getLabel() {
                return label;
            }
            public String getEventId() {
                return eventId;
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
            public String getMessageType() {
                return messageType;
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
            public String getScheduleType() {
                return scheduleType;
            }
            public String getScheduleDate() {
                return scheduleDate;
            }
            public BigDecimal getRepetitionCount() {
                return repetitionCount;
            }
            public BigDecimal getRepeatDays() {
                return repeatDays;
            }
            public BigDecimal getRepeatHrs() {
                return repeatHrs;
            }
            public BigDecimal getRepeatMin() {
                return repeatMin;
            }
            public DeliveryReceipt getDlr() {
                return dlr;
            }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private String workspaceId;
            private Message message;
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

            public MessageCreateParams build() {
                return new MessageCreateParams(
                    workspaceId,
                    message,
                    to,
                    subject,
                    body,
                    email,
                    voice,
                    web,
                    social,
                    type,
                    features,
                    resource,
                    messageTemplateId,
                    messageTemplateName,
                    callbackId,
                    callbackParameters,
                    label,
                    eventId,
                    messageType,
                    scheduleType,
                    scheduleDate,
                    repetitionCount,
                    repeatDays,
                    repeatHrs,
                    repeatMin,
                    dlr
                );
            }

            public Builder setWorkspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
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
            private com.whispir.model.Email model;

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

            public com.whispir.model.Email getModel() {
                if (model == null) {
                    model = new com.whispir.model.Email();

                    model.setBody(body);
                    model.setFooter(footer);
                    model.setType(type);

                    if (!(resources == null || resources.getAttachments().isEmpty())) {
                        model.setResources(resources.getModel());
                    }
                }

                return model;
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
            private com.whispir.model.Attachments model;

            private Attachments(List<Attachment> attachments){
            this.attachments = attachments;
            }

            public List<Attachment> getAttachments(){
                return attachments;
            }

            public com.whispir.model.Attachments getModel() {
                if (model == null) {
                    model = new com.whispir.model.Attachments();

                    List<com.whispir.model.Attachment> list = attachments.stream().map(Attachment::getModel).collect(Collectors.toList());
                    model.setAttachments(list);
                }

                return model;
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
        private com.whispir.model.Attachment model;

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

        public com.whispir.model.Attachment getModel() {
            if (model == null) {
                model = new com.whispir.model.Attachment();

                model.setAttachmentDesc(attachmentDesc);
                model.setAttachmentName(attachmentName);
                model.setDerefUri(derefUri);
            }

            return model;
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
            private com.whispir.model.Voice model;

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

            public com.whispir.model.Voice getModel() {
                if (model == null) {
                    model = new com.whispir.model.Voice();

                    model.setBody(body);
                    model.setType(type);
                    model.setHeader(header);

                    if (!(resources == null || resources.getAttachments().isEmpty())) {
                        model.setResources(resources.getModel());
                    }
                }

                return model;
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
            private com.whispir.model.Attachments model;

                private Attachments(List<Attachment> attachments){
            this.attachments = attachments;
            }

            public List<Attachment> getAttachments(){
                return attachments;
            }

            public static Builder builder() {
                return new Builder();
            }

                public com.whispir.model.Attachments getModel() {
                    if (model == null) {
                        model = new com.whispir.model.Attachments();

                        model.setAttachments(attachments.stream().map(Attachment::getModel)
                                .collect(Collectors.toList()));
                    }

                    return model;
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
        private com.whispir.model.Attachment model;

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

        public com.whispir.model.Attachment getModel() {
            if (model == null) {
                model = new com.whispir.model.Attachment();

                model.setAttachmentDesc(attachmentDesc);
                model.setAttachmentName(attachmentName);
                model.setDerefUri(derefUri);
            }

            return model;
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
            private com.whispir.model.Web model;

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

            public com.whispir.model.Web getModel() {
                if (model == null) {
                    model = new com.whispir.model.Web();

                    model.setBody(body);
                    model.setType(type);
                }

                return model;
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
            private com.whispir.model.Social model;

            public com.whispir.model.Social getModel() {
                if (model == null) {
                    model = new com.whispir.model.Social();

                    if (!(social == null || social.isEmpty())) {
                        model.setSocial(social.stream().map(Channel::getModel).collect(Collectors.toList()));
                    }
                }

                return model;
            }

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
        private com.whispir.model.Channel model;

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

        public com.whispir.model.Channel getModel() {
            if (model == null) {
                model = new com.whispir.model.Channel();

                model.setBody(body);
                model.setType(type);
            }

             return model;
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
            private com.whispir.model.Features model;

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
            public com.whispir.model.Features getModel() {
                if (model == null) {
                    model = new com.whispir.model.Features();

                    if (aliasOption != null) {
                        model.setAliasOption(aliasOption.getModel());
                    }

                    if (pushOptions != null) {
                        model.setPushOptions(pushOptions.getModel());
                    }
                }

                return model;
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
                private com.whispir.model.PushOptions model;

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

            public com.whispir.model.PushOptions getModel() {
                if (model == null) {
                    model = new com.whispir.model.PushOptions();

                    model.setNotifications(notifications);
                    model.setEscalationMins(escalationMins);
                    model.setAppId(appId);
                    model.setPriority(priority);
                    model.setData(data);

                    if (apns != null) {
                        model.setApns(apns.getModel());
                    }

                    if (fcm != null) {
                        model.setFcm(fcm.getModel());
                    }
                }

                return model;
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
                private com.whispir.model.Fcm model;

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

            public com.whispir.model.Fcm getModel() {
                if (model == null) {
                    model = new com.whispir.model.Fcm();

                    model.setAndroidChannelId(androidChannelId);
                    model.setSound(sound);
                    model.setAction(action);
                    model.setImage(image);
                }

                return model;
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
            private com.whispir.model.Apns model;

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

            public com.whispir.model.Apns getModel() {
                if (model == null) {
                    model = new com.whispir.model.Apns();

                    model.setSound(sound);
                    model.setAction(action);
                }

                return model;
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
            private com.whispir.model.AliasOption model;

            private AliasOption(String aliasName){
            this.aliasName = aliasName;
            }

            public String getAliasName(){
                return aliasName;
            }

            public static Builder builder() {
                return new Builder();
            }

            public com.whispir.model.AliasOption getModel() {
                if (model != null) {
                    model = new com.whispir.model.AliasOption();

                    model.setAliasName(aliasName);
                }
                return model;
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
            private com.whispir.model.Resource model;

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

            public com.whispir.model.Resource getModel() {
                if (model == null) {
                    model = new com.whispir.model.Resource();

                    model.setName(name);
                    model.setScope(scope);
                    model.setMimeType(mimeType);
                    model.setDerefUri(derefUri);
                }

                return model;
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

            private com.whispir.model.DeliveryReceipt model;

            private DeliveryReceipt(){
            }

            public com.whispir.model.DeliveryReceipt getModel() {
                if (model == null) {
                    // FIXME: Possibly erroneous structure compared to rest of the classes
                    model = new com.whispir.model.DeliveryReceipt();
                }

                return model;
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

    public static class MessageCreateRequest {
        private final String workspaceId;
        private final String xApiKey;
        private final String contentType;
        private final String accept;
        private final Message message;
        ApiResponse _lastResponse;

        private MessageCreateRequest(String workspaceId, String xApiKey, String contentType, String accept, Message message) {
            this.workspaceId = workspaceId;
            this.xApiKey = xApiKey;
            this.contentType = contentType;
            this.accept = accept;
            this.message = message;
        }

        /**
         * Build call for messageCreate
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return messageCreateCall(workspaceId, xApiKey, contentType, accept, message, _callback);
        }

        /**
         * Execute messageCreate request
         * @return Message
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public Message execute() throws ApiException {
            ApiResponse<Message> localVarResp = messageCreateWithHttpInfo(workspaceId, xApiKey, contentType, accept, message);
            _lastResponse = localVarResp;
            Message data = localVarResp.getData();

            
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
         * Execute messageCreate request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<Message> _callback) throws ApiException {
            return messageCreateAsync(workspaceId, xApiKey, contentType, accept, message, _callback);
        }
    }

    /**
     * Send a message
     * @param params The param instance required to create MessageCreateRequest
     * @return Message
     */

    public static Message create(Map<String, Object> params) throws ApiException {
        String workspaceId = (String) params.get("workspaceId");

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }
        String toValue = (String) params.get("to");
        if(toValue == null) {
            throw new ApiException("Missing the required property value of 'to'");
        }
        String subjectValue = (String) params.get("subject");
        if(subjectValue == null) {
            throw new ApiException("Missing the required property value of 'subject'");
        }
        String bodyValue = (String) params.get("body");
        Object emailValue = params.get("email");
        Object voiceValue = params.get("voice");
        Object webValue = params.get("web");
        Object socialValue = params.get("social");
        com.whispir.api.MessagesApi.MessageCreateParams.TypeEnum typeValue = com.whispir.api.MessagesApi.MessageCreateParams.TypeEnum.valueOf((String) params.get("type"));
        Object featuresValue = params.get("features");
        Object resourceValue = params.get("resource");
        String messageTemplateIdValue = (String) params.get("messageTemplateId");
        String messageTemplateNameValue = (String) params.get("messageTemplateName");
        String callbackIdValue = (String) params.get("callbackId");
        Object callbackParametersValue = (Object) params.get("callbackParameters");
        String labelValue = (String) params.get("label");
        String eventIdValue = (String) params.get("eventId");
        com.whispir.api.MessagesApi.MessageCreateParams.MessageTypeEnum messageTypeValue = com.whispir.api.MessagesApi.MessageCreateParams.MessageTypeEnum.valueOf((String) params.get("messageType"));
        com.whispir.api.MessagesApi.MessageCreateParams.ScheduleTypeEnum scheduleTypeValue = com.whispir.api.MessagesApi.MessageCreateParams.ScheduleTypeEnum.valueOf((String) params.get("scheduleType"));
        String scheduleDateValue = (String) params.get("scheduleDate");
        BigDecimal repetitionCountValue = (BigDecimal) params.get("repetitionCount");
        BigDecimal repeatDaysValue = (BigDecimal) params.get("repeatDays");
        BigDecimal repeatHrsValue = (BigDecimal) params.get("repeatHrs");
        BigDecimal repeatMinValue = (BigDecimal) params.get("repeatMin");
        Object dlrValue = params.get("dlr");
        MessageCreateParams tempParams = MessageCreateParams.builder()
            .setWorkspaceId(workspaceId)
            .setTo(toValue)
            .setSubject(subjectValue)
            .setBody(bodyValue)
            .setEmail((com.whispir.api.MessagesApi.MessageCreateParams.Email) emailValue)
            .setVoice((com.whispir.api.MessagesApi.MessageCreateParams.Voice) voiceValue)
            .setWeb((com.whispir.api.MessagesApi.MessageCreateParams.Web) webValue)
            .setSocial((com.whispir.api.MessagesApi.MessageCreateParams.Social) socialValue)
            .setType(typeValue)
            .setFeatures((com.whispir.api.MessagesApi.MessageCreateParams.Features) featuresValue)
            .setResource((com.whispir.api.MessagesApi.MessageCreateParams.Resource) resourceValue)
            .setMessageTemplateId(messageTemplateIdValue)
            .setMessageTemplateName(messageTemplateNameValue)
            .setCallbackId(callbackIdValue)
            .setCallbackParameters(callbackParametersValue)
            .setLabel(labelValue)
            .setEventId(eventIdValue)
            .setMessageType(messageTypeValue)
            .setScheduleType(scheduleTypeValue)
            .setScheduleDate(scheduleDateValue)
            .setRepetitionCount(repetitionCountValue)
            .setRepeatDays(repeatDaysValue)
            .setRepeatHrs(repeatHrsValue)
            .setRepeatMin(repeatMinValue)
            .setDlr((com.whispir.api.MessagesApi.MessageCreateParams.DeliveryReceipt) dlrValue).build();

        return create(tempParams);
    }

    public static Message create(MessageCreateParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }


        String workspaceId = params.getWorkspaceId();

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }

        String contentType = "application/vnd.whispir.message-v1+json";

        String accept = "application/vnd.whispir.message-v1+json";


        // Constructing 'Message' from 'MessageCreateParams' instance passed
        Message message = new Message();
        String toValue = params.getTo();
        if(toValue == null) {
            throw new ApiException("Missing the required property value of 'to'");
        }
        message.setTo(toValue);

        String subjectValue = params.getSubject();
        if(subjectValue == null) {
            throw new ApiException("Missing the required property value of 'subject'");
        }
        message.setSubject(subjectValue);

        String bodyValue = params.getBody();
        message.setBody(bodyValue);

        if (params.getEmail() != null) {
            message.setEmail(params.getEmail().getModel());
        }

        if (params.getVoice() != null) {
            message.setVoice(params.getVoice().getModel());
        }

        if (params.getWeb() != null) {
            message.setWeb(params.getWeb().getModel());
        }

        if (params.getSocial() != null) {
            message.setSocial(params.getSocial().getModel());
        }

        String typeValue = params.getType();
        message.setType(typeValue);

        if (params.getFeatures() != null) {
            message.setFeatures(params.getFeatures().getModel());
        }

        if (params.getResource() != null) {
            message.setResource(params.getResource().getModel());
        }

        String messageTemplateIdValue = params.getMessageTemplateId();
        message.setMessageTemplateId(messageTemplateIdValue);

        String messageTemplateNameValue = params.getMessageTemplateName();
        message.setMessageTemplateName(messageTemplateNameValue);

        String callbackIdValue = params.getCallbackId();
        message.setCallbackId(callbackIdValue);

        Object callbackParametersValue = params.getCallbackParameters();
        message.setCallbackParameters(callbackParametersValue);

        String labelValue = params.getLabel();
        message.setLabel(labelValue);

        String eventIdValue = params.getEventId();
        message.setEventId(eventIdValue);

        String messageTypeValue = params.getMessageType();
        message.setMessageType(messageTypeValue);

        String scheduleTypeValue = params.getScheduleType();
        message.setScheduleType(scheduleTypeValue);

        String scheduleDateValue = params.getScheduleDate();
        message.setScheduleDate(scheduleDateValue);

        BigDecimal repetitionCountValue = params.getRepetitionCount();
        message.setRepetitionCount(repetitionCountValue);

        BigDecimal repeatDaysValue = params.getRepeatDays();
        message.setRepeatDays(repeatDaysValue);

        BigDecimal repeatHrsValue = params.getRepeatHrs();
        message.setRepeatHrs(repeatHrsValue);

        BigDecimal repeatMinValue = params.getRepeatMin();
        message.setRepeatMin(repeatMinValue);
        
        if (params.getDlr() != null) {
            message.setDlr(params.getDlr().getModel());
        }

        MessageCreateRequest request = new MessageCreateRequest(workspaceId, xApiKey, contentType, accept, message);

        // Ensure to include all of the 'optionalParams' that are passed

        return request.execute();
    }
    private static okhttp3.Call messageListCall(String workspaceId, String xApiKey, String accept, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/workspaces/{workspaceId}/messages"
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
            "application/vnd.whispir.message-v1+json",
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
    private static okhttp3.Call messageListValidateBeforeCall(String workspaceId, String xApiKey, String accept, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'workspaceId' is set
        if (workspaceId == null) {
            throw new ApiException("Missing the required parameter 'workspaceId' when calling messageList(Async)");
        }

        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling messageList(Async)");
        }

        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling messageList(Async)");
        }

        return messageListCall(workspaceId, xApiKey, accept, limit, offset, sortOrder, sortFields, _callback);
    }

    private static ApiResponse<MessageCollection> messageListWithHttpInfo(String workspaceId, String xApiKey, String accept, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields) throws ApiException {
        okhttp3.Call localVarCall = messageListCall(workspaceId, xApiKey, accept, limit, offset, sortOrder, sortFields, null);
        Type localVarReturnType = new TypeToken<MessageCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private static okhttp3.Call messageListAsync(String workspaceId, String xApiKey, String accept, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields, final ApiCallback<MessageCollection> _callback) throws ApiException {
        okhttp3.Call localVarCall = messageListValidateBeforeCall(workspaceId, xApiKey, accept, limit, offset, sortOrder, sortFields, _callback);
        Type localVarReturnType = new TypeToken<MessageCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public static class MessageListParams {
        private String workspaceId;
        private BigDecimal limit;
        private BigDecimal offset;
        private String sortOrder;
        private String sortFields;

        private MessageListParams(
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

            public MessageListParams build() {
                return new MessageListParams(
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

    public static class MessageListRequest {
        private final String workspaceId;
        private final String xApiKey;
        private final String accept;
        private BigDecimal limit;
        private BigDecimal offset;
        private String sortOrder;
        private String sortFields;
        ApiResponse _lastResponse;

        private MessageListRequest(String workspaceId, String xApiKey, String accept) {
            this.workspaceId = workspaceId;
            this.xApiKey = xApiKey;
            this.accept = accept;
        }

        /**
         * Set limit
         * @param limit The number of records to be returned. (optional, default to 20)
         * @return APImessageListRequest
         */
        public MessageListRequest limit(BigDecimal limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Set offset
         * @param offset The record number to start returning from. (optional, default to 0)
         * @return APImessageListRequest
         */
        public MessageListRequest offset(BigDecimal offset) {
            this.offset = offset;
            return this;
        }

        /**
         * Set sortOrder
         * @param sortOrder The order in which you require the results to be returned. Either ‘asc’ or ‘desc’ (optional)
         * @return APImessageListRequest
         */
        public MessageListRequest sortOrder(String sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * Set sortFields
         * @param sortFields The fields that you require the ordering to be performed on. Multiple fields can be provided, separated by a comma. (optional)
         * @return APImessageListRequest
         */
        public MessageListRequest sortFields(String sortFields) {
            this.sortFields = sortFields;
            return this;
        }

        /**
         * Build call for messageList
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return messageListCall(workspaceId, xApiKey, accept, limit, offset, sortOrder, sortFields, _callback);
        }

        /**
         * Execute messageList request
         * @return MessageCollection
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public MessageCollection execute() throws ApiException {
            ApiResponse<MessageCollection> localVarResp = messageListWithHttpInfo(workspaceId, xApiKey, accept, limit, offset, sortOrder, sortFields);
            _lastResponse = localVarResp;
            MessageCollection data = localVarResp.getData();

            
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
         * Execute messageList request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<MessageCollection> _callback) throws ApiException {
            return messageListAsync(workspaceId, xApiKey, accept, limit, offset, sortOrder, sortFields, _callback);
        }
    }

    /**
     * List messages
     * @param params The param instance required to create MessageListRequest
     * @return MessageCollection
     */

    public static MessageCollection list(Map<String, Object> params) throws ApiException {
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
        MessageListParams tempParams = MessageListParams.builder()
            .setWorkspaceId(workspaceId)
            .setLimit(limit)
            .setOffset(offset)
            .setSortOrder(sortOrder)
            .setSortFields(sortFields).build();

        return list(tempParams);
    }

    public static MessageCollection list(MessageListParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }


        String workspaceId = params.getWorkspaceId();

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }

        String accept = "application/vnd.whispir.message-v1+json";

        MessageListRequest request = new MessageListRequest(workspaceId, xApiKey, accept);

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
    private static okhttp3.Call messageResponseListCall(String workspaceId, String xApiKey, String accept, String messageId, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields, String view, String filter, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/workspaces/{workspaceId}/messages/{messageId}/messageresponses"
            .replace("{" + "workspaceId" + "}", localVarApiClient.escapeString(workspaceId.toString()))
            .replace("{" + "messageId" + "}", localVarApiClient.escapeString(messageId.toString()));

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

        if (view != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("view", view));
        }

        if (filter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter", filter));
        }

        if (xApiKey != null) {
            localVarHeaderParams.put("X-Api-Key", localVarApiClient.parameterToString(xApiKey));
        }

        if (accept != null) {
            localVarHeaderParams.put("Accept", localVarApiClient.parameterToString(accept));
        }

        final String[] localVarAccepts = {
            "application/vnd.whispir.messageresponse-v1+json",
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
    private static okhttp3.Call messageResponseListValidateBeforeCall(String workspaceId, String xApiKey, String accept, String messageId, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields, String view, String filter, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'workspaceId' is set
        if (workspaceId == null) {
            throw new ApiException("Missing the required parameter 'workspaceId' when calling messageResponseList(Async)");
        }

        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling messageResponseList(Async)");
        }

        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling messageResponseList(Async)");
        }

        // verify the required parameter 'messageId' is set
        if (messageId == null) {
            throw new ApiException("Missing the required parameter 'messageId' when calling messageResponseList(Async)");
        }

        return messageResponseListCall(workspaceId, xApiKey, accept, messageId, limit, offset, sortOrder, sortFields, view, filter, _callback);
    }

    private static ApiResponse<MessageResponseCollection> messageResponseListWithHttpInfo(String workspaceId, String xApiKey, String accept, String messageId, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields, String view, String filter) throws ApiException {
        okhttp3.Call localVarCall = messageResponseListCall(workspaceId, xApiKey, accept, messageId, limit, offset, sortOrder, sortFields, view, filter, null);
        Type localVarReturnType = new TypeToken<MessageResponseCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private static okhttp3.Call messageResponseListAsync(String workspaceId, String xApiKey, String accept, String messageId, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields, String view, String filter, final ApiCallback<MessageResponseCollection> _callback) throws ApiException {
        okhttp3.Call localVarCall = messageResponseListValidateBeforeCall(workspaceId, xApiKey, accept, messageId, limit, offset, sortOrder, sortFields, view, filter, _callback);
        Type localVarReturnType = new TypeToken<MessageResponseCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public static class MessageResponseListParams {
        private String workspaceId;
        private String messageId;
        private BigDecimal limit;
        private BigDecimal offset;
        private String sortOrder;
        private String sortFields;
        private String view;
        private String filter;

        private MessageResponseListParams(
            String workspaceId,
            String messageId,
            BigDecimal limit,
            BigDecimal offset,
            String sortOrder,
            String sortFields,
            String view,
            String filter
        ){
            this.workspaceId = workspaceId;
            this.messageId = messageId;
            this.limit = limit;
            this.offset = offset;
            this.sortOrder = sortOrder;
            this.sortFields = sortFields;
            this.view = view;
            this.filter = filter;
        }
            public String getWorkspaceId() {
                return workspaceId;
            }
            public String getMessageId() {
                return messageId;
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
            public String getView() {
                return view;
            }
            public String getFilter() {
                return filter;
            }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private String workspaceId;
            private String messageId;
            private BigDecimal limit;
            private BigDecimal offset;
            private String sortOrder;
            private String sortFields;
            private String view;
            private String filter;

            public MessageResponseListParams build() {
                return new MessageResponseListParams(
                    workspaceId,
                    messageId,
                    limit,
                    offset,
                    sortOrder,
                    sortFields,
                    view,
                    filter
                );
            }

            public Builder setWorkspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }
            public Builder setMessageId(String messageId) {
                this.messageId = messageId;
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
            public Builder setView(String view) {
                this.view = view;
                return this;
            }
            public Builder setFilter(String filter) {
                this.filter = filter;
                return this;
            }
        }
        
    }

    public static class MessageResponseListRequest {
        private final String workspaceId;
        private final String xApiKey;
        private final String accept;
        private final String messageId;
        private BigDecimal limit;
        private BigDecimal offset;
        private String sortOrder;
        private String sortFields;
        private String view;
        private String filter;
        ApiResponse _lastResponse;

        private MessageResponseListRequest(String workspaceId, String xApiKey, String accept, String messageId) {
            this.workspaceId = workspaceId;
            this.xApiKey = xApiKey;
            this.accept = accept;
            this.messageId = messageId;
        }

        /**
         * Set limit
         * @param limit The number of records to be returned. (optional, default to 20)
         * @return APImessageResponseListRequest
         */
        public MessageResponseListRequest limit(BigDecimal limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Set offset
         * @param offset The record number to start returning from. (optional, default to 0)
         * @return APImessageResponseListRequest
         */
        public MessageResponseListRequest offset(BigDecimal offset) {
            this.offset = offset;
            return this;
        }

        /**
         * Set sortOrder
         * @param sortOrder The order in which you require the results to be returned. Either ‘asc’ or ‘desc’ (optional)
         * @return APImessageResponseListRequest
         */
        public MessageResponseListRequest sortOrder(String sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * Set sortFields
         * @param sortFields The fields that you require the ordering to be performed on. Multiple fields can be provided, separated by a comma. (optional)
         * @return APImessageResponseListRequest
         */
        public MessageResponseListRequest sortFields(String sortFields) {
            this.sortFields = sortFields;
            return this;
        }

        /**
         * Set view
         * @param view The view for the message response. (optional, default to summary)
         * @return APImessageResponseListRequest
         */
        public MessageResponseListRequest view(String view) {
            this.view = view;
            return this;
        }

        /**
         * Set filter
         * @param filter The filter for the message response. (optional)
         * @return APImessageResponseListRequest
         */
        public MessageResponseListRequest filter(String filter) {
            this.filter = filter;
            return this;
        }

        /**
         * Build call for messageResponseList
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return messageResponseListCall(workspaceId, xApiKey, accept, messageId, limit, offset, sortOrder, sortFields, view, filter, _callback);
        }

        /**
         * Execute messageResponseList request
         * @return MessageResponseCollection
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public MessageResponseCollection execute() throws ApiException {
            ApiResponse<MessageResponseCollection> localVarResp = messageResponseListWithHttpInfo(workspaceId, xApiKey, accept, messageId, limit, offset, sortOrder, sortFields, view, filter);
            _lastResponse = localVarResp;
            MessageResponseCollection data = localVarResp.getData();

            
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
         * Execute messageResponseList request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<MessageResponseCollection> _callback) throws ApiException {
            return messageResponseListAsync(workspaceId, xApiKey, accept, messageId, limit, offset, sortOrder, sortFields, view, filter, _callback);
        }
    }

    /**
     * List responses for a sent message
     * @param params The param instance required to create MessageResponseListRequest
     * @return MessageResponseCollection
     */

    public static MessageResponseCollection listMessageResponse(Map<String, Object> params) throws ApiException {
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
        String view = null;
        if(params.containsKey("view") && params.get("view") != null){
            view = (String) params.get("view");
        }
        String filter = null;
        if(params.containsKey("filter") && params.get("filter") != null){
            filter = (String) params.get("filter");
        }
        String workspaceId = (String) params.get("workspaceId");

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }
        String messageId = (String) params.get("messageId");

        if(messageId == null || messageId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'messageId'");
        }
        MessageResponseListParams tempParams = MessageResponseListParams.builder()
            .setWorkspaceId(workspaceId)
            .setMessageId(messageId)
            .setLimit(limit)
            .setOffset(offset)
            .setSortOrder(sortOrder)
            .setSortFields(sortFields)
            .setView(view)
            .setFilter(filter).build();

        return listMessageResponse(tempParams);
    }

    public static MessageResponseCollection listMessageResponse(MessageResponseListParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }


        String workspaceId = params.getWorkspaceId();

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }

        String accept = "application/vnd.whispir.messageresponse-v1+json";


        String messageId = params.getMessageId();

        if(messageId == null || messageId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'messageId'");
        }
        MessageResponseListRequest request = new MessageResponseListRequest(workspaceId, xApiKey, accept, messageId);

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
        if(params.view != null){
            String view = params.getView();
            request.view(view);
        }
        if(params.filter != null){
            String filter = params.getFilter();
            request.filter(filter);
        }

        return request.execute();
    }
    private static okhttp3.Call messageRetrieveCall(String workspaceId, String xApiKey, String accept, String messageId, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/workspaces/{workspaceId}/messages/{messageId}"
            .replace("{" + "workspaceId" + "}", localVarApiClient.escapeString(workspaceId.toString()))
            .replace("{" + "messageId" + "}", localVarApiClient.escapeString(messageId.toString()));

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
            "application/vnd.whispir.message-v1+json",
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
    private static okhttp3.Call messageRetrieveValidateBeforeCall(String workspaceId, String xApiKey, String accept, String messageId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'workspaceId' is set
        if (workspaceId == null) {
            throw new ApiException("Missing the required parameter 'workspaceId' when calling messageRetrieve(Async)");
        }

        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling messageRetrieve(Async)");
        }

        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling messageRetrieve(Async)");
        }

        // verify the required parameter 'messageId' is set
        if (messageId == null) {
            throw new ApiException("Missing the required parameter 'messageId' when calling messageRetrieve(Async)");
        }

        return messageRetrieveCall(workspaceId, xApiKey, accept, messageId, _callback);
    }

    private static ApiResponse<Message> messageRetrieveWithHttpInfo(String workspaceId, String xApiKey, String accept, String messageId) throws ApiException {
        okhttp3.Call localVarCall = messageRetrieveCall(workspaceId, xApiKey, accept, messageId, null);
        Type localVarReturnType = new TypeToken<Message>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private static okhttp3.Call messageRetrieveAsync(String workspaceId, String xApiKey, String accept, String messageId, final ApiCallback<Message> _callback) throws ApiException {
        okhttp3.Call localVarCall = messageRetrieveValidateBeforeCall(workspaceId, xApiKey, accept, messageId, _callback);
        Type localVarReturnType = new TypeToken<Message>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public static class MessageRetrieveParams {
        private String workspaceId;
        private String messageId;

        private MessageRetrieveParams(
            String workspaceId,
            String messageId
        ){
            this.workspaceId = workspaceId;
            this.messageId = messageId;
        }
            public String getWorkspaceId() {
                return workspaceId;
            }
            public String getMessageId() {
                return messageId;
            }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private String workspaceId;
            private String messageId;

            public MessageRetrieveParams build() {
                return new MessageRetrieveParams(
                    workspaceId,
                    messageId
                );
            }

            public Builder setWorkspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }
            public Builder setMessageId(String messageId) {
                this.messageId = messageId;
                return this;
            }
        }
        
    }

    public static class MessageRetrieveRequest {
        private final String workspaceId;
        private final String xApiKey;
        private final String accept;
        private final String messageId;
        ApiResponse _lastResponse;

        private MessageRetrieveRequest(String workspaceId, String xApiKey, String accept, String messageId) {
            this.workspaceId = workspaceId;
            this.xApiKey = xApiKey;
            this.accept = accept;
            this.messageId = messageId;
        }

        /**
         * Build call for messageRetrieve
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return messageRetrieveCall(workspaceId, xApiKey, accept, messageId, _callback);
        }

        /**
         * Execute messageRetrieve request
         * @return Message
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public Message execute() throws ApiException {
            ApiResponse<Message> localVarResp = messageRetrieveWithHttpInfo(workspaceId, xApiKey, accept, messageId);
            _lastResponse = localVarResp;
            Message data = localVarResp.getData();

            
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
         * Execute messageRetrieve request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<Message> _callback) throws ApiException {
            return messageRetrieveAsync(workspaceId, xApiKey, accept, messageId, _callback);
        }
    }

    /**
     * Retrieve a message
     * @param params The param instance required to create MessageRetrieveRequest
     * @return Message
     */

    public static Message retrieve(Map<String, Object> params) throws ApiException {
        String workspaceId = (String) params.get("workspaceId");

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }
        String messageId = (String) params.get("messageId");

        if(messageId == null || messageId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'messageId'");
        }
        MessageRetrieveParams tempParams = MessageRetrieveParams.builder()
            .setWorkspaceId(workspaceId)
            .setMessageId(messageId).build();

        return retrieve(tempParams);
    }

    public static Message retrieve(MessageRetrieveParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }


        String workspaceId = params.getWorkspaceId();

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }

        String accept = "application/vnd.whispir.message-v1+json";


        String messageId = params.getMessageId();

        if(messageId == null || messageId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'messageId'");
        }
        MessageRetrieveRequest request = new MessageRetrieveRequest(workspaceId, xApiKey, accept, messageId);

        // Ensure to include all of the 'optionalParams' that are passed

        return request.execute();
    }
    private static okhttp3.Call messageStatusListCall(String workspaceId, String xApiKey, String accept, String messageId, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields, String view, String filter, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/workspaces/{workspaceId}/messages/{messageId}/messagestatus"
            .replace("{" + "workspaceId" + "}", localVarApiClient.escapeString(workspaceId.toString()))
            .replace("{" + "messageId" + "}", localVarApiClient.escapeString(messageId.toString()));

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

        if (view != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("view", view));
        }

        if (filter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter", filter));
        }

        if (xApiKey != null) {
            localVarHeaderParams.put("X-Api-Key", localVarApiClient.parameterToString(xApiKey));
        }

        if (accept != null) {
            localVarHeaderParams.put("Accept", localVarApiClient.parameterToString(accept));
        }

        final String[] localVarAccepts = {
            "application/vnd.whispir.messagestatus-v1+json",
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
    private static okhttp3.Call messageStatusListValidateBeforeCall(String workspaceId, String xApiKey, String accept, String messageId, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields, String view, String filter, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'workspaceId' is set
        if (workspaceId == null) {
            throw new ApiException("Missing the required parameter 'workspaceId' when calling messageStatusList(Async)");
        }

        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling messageStatusList(Async)");
        }

        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling messageStatusList(Async)");
        }

        // verify the required parameter 'messageId' is set
        if (messageId == null) {
            throw new ApiException("Missing the required parameter 'messageId' when calling messageStatusList(Async)");
        }

        return messageStatusListCall(workspaceId, xApiKey, accept, messageId, limit, offset, sortOrder, sortFields, view, filter, _callback);
    }

    private static ApiResponse<MessageStatusCollection> messageStatusListWithHttpInfo(String workspaceId, String xApiKey, String accept, String messageId, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields, String view, String filter) throws ApiException {
        okhttp3.Call localVarCall = messageStatusListCall(workspaceId, xApiKey, accept, messageId, limit, offset, sortOrder, sortFields, view, filter, null);
        Type localVarReturnType = new TypeToken<MessageStatusCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private static okhttp3.Call messageStatusListAsync(String workspaceId, String xApiKey, String accept, String messageId, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields, String view, String filter, final ApiCallback<MessageStatusCollection> _callback) throws ApiException {
        okhttp3.Call localVarCall = messageStatusListValidateBeforeCall(workspaceId, xApiKey, accept, messageId, limit, offset, sortOrder, sortFields, view, filter, _callback);
        Type localVarReturnType = new TypeToken<MessageStatusCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public static class MessageStatusListParams {
        private String workspaceId;
        private String messageId;
        private BigDecimal limit;
        private BigDecimal offset;
        private String sortOrder;
        private String sortFields;
        private String view;
        private String filter;

        private MessageStatusListParams(
            String workspaceId,
            String messageId,
            BigDecimal limit,
            BigDecimal offset,
            String sortOrder,
            String sortFields,
            String view,
            String filter
        ){
            this.workspaceId = workspaceId;
            this.messageId = messageId;
            this.limit = limit;
            this.offset = offset;
            this.sortOrder = sortOrder;
            this.sortFields = sortFields;
            this.view = view;
            this.filter = filter;
        }
            public String getWorkspaceId() {
                return workspaceId;
            }
            public String getMessageId() {
                return messageId;
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
            public String getView() {
                return view;
            }
            public String getFilter() {
                return filter;
            }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private String workspaceId;
            private String messageId;
            private BigDecimal limit;
            private BigDecimal offset;
            private String sortOrder;
            private String sortFields;
            private String view;
            private String filter;

            public MessageStatusListParams build() {
                return new MessageStatusListParams(
                    workspaceId,
                    messageId,
                    limit,
                    offset,
                    sortOrder,
                    sortFields,
                    view,
                    filter
                );
            }

            public Builder setWorkspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }
            public Builder setMessageId(String messageId) {
                this.messageId = messageId;
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
            public Builder setView(String view) {
                this.view = view;
                return this;
            }
            public Builder setFilter(String filter) {
                this.filter = filter;
                return this;
            }
        }
        
    }

    public static class MessageStatusListRequest {
        private final String workspaceId;
        private final String xApiKey;
        private final String accept;
        private final String messageId;
        private BigDecimal limit;
        private BigDecimal offset;
        private String sortOrder;
        private String sortFields;
        private String view;
        private String filter;
        ApiResponse _lastResponse;

        private MessageStatusListRequest(String workspaceId, String xApiKey, String accept, String messageId) {
            this.workspaceId = workspaceId;
            this.xApiKey = xApiKey;
            this.accept = accept;
            this.messageId = messageId;
        }

        /**
         * Set limit
         * @param limit The number of records to be returned. (optional, default to 20)
         * @return APImessageStatusListRequest
         */
        public MessageStatusListRequest limit(BigDecimal limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Set offset
         * @param offset The record number to start returning from. (optional, default to 0)
         * @return APImessageStatusListRequest
         */
        public MessageStatusListRequest offset(BigDecimal offset) {
            this.offset = offset;
            return this;
        }

        /**
         * Set sortOrder
         * @param sortOrder The order in which you require the results to be returned. Either ‘asc’ or ‘desc’ (optional)
         * @return APImessageStatusListRequest
         */
        public MessageStatusListRequest sortOrder(String sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * Set sortFields
         * @param sortFields The fields that you require the ordering to be performed on. Multiple fields can be provided, separated by a comma. (optional)
         * @return APImessageStatusListRequest
         */
        public MessageStatusListRequest sortFields(String sortFields) {
            this.sortFields = sortFields;
            return this;
        }

        /**
         * Set view
         * @param view The view for the message status. (optional, default to summary)
         * @return APImessageStatusListRequest
         */
        public MessageStatusListRequest view(String view) {
            this.view = view;
            return this;
        }

        /**
         * Set filter
         * @param filter The filter for the message status. (optional, default to default)
         * @return APImessageStatusListRequest
         */
        public MessageStatusListRequest filter(String filter) {
            this.filter = filter;
            return this;
        }

        /**
         * Build call for messageStatusList
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return messageStatusListCall(workspaceId, xApiKey, accept, messageId, limit, offset, sortOrder, sortFields, view, filter, _callback);
        }

        /**
         * Execute messageStatusList request
         * @return MessageStatusCollection
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public MessageStatusCollection execute() throws ApiException {
            ApiResponse<MessageStatusCollection> localVarResp = messageStatusListWithHttpInfo(workspaceId, xApiKey, accept, messageId, limit, offset, sortOrder, sortFields, view, filter);
            _lastResponse = localVarResp;
            MessageStatusCollection data = localVarResp.getData();

            
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
         * Execute messageStatusList request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<MessageStatusCollection> _callback) throws ApiException {
            return messageStatusListAsync(workspaceId, xApiKey, accept, messageId, limit, offset, sortOrder, sortFields, view, filter, _callback);
        }
    }

    /**
     * List message status for a sent message
     * @param params The param instance required to create MessageStatusListRequest
     * @return MessageStatusCollection
     */

    public static MessageStatusCollection listMessageStatus(Map<String, Object> params) throws ApiException {
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
        String view = null;
        if(params.containsKey("view") && params.get("view") != null){
            view = (String) params.get("view");
        }
        String filter = null;
        if(params.containsKey("filter") && params.get("filter") != null){
            filter = (String) params.get("filter");
        }
        String workspaceId = (String) params.get("workspaceId");

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }
        String messageId = (String) params.get("messageId");

        if(messageId == null || messageId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'messageId'");
        }
        MessageStatusListParams tempParams = MessageStatusListParams.builder()
            .setWorkspaceId(workspaceId)
            .setMessageId(messageId)
            .setLimit(limit)
            .setOffset(offset)
            .setSortOrder(sortOrder)
            .setSortFields(sortFields)
            .setView(view)
            .setFilter(filter).build();

        return listMessageStatus(tempParams);
    }

    public static MessageStatusCollection listMessageStatus(MessageStatusListParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }


        String workspaceId = params.getWorkspaceId();

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }

        String accept = "application/vnd.whispir.messagestatus-v1+json";


        String messageId = params.getMessageId();

        if(messageId == null || messageId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'messageId'");
        }
        MessageStatusListRequest request = new MessageStatusListRequest(workspaceId, xApiKey, accept, messageId);

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
        if(params.view != null){
            String view = params.getView();
            request.view(view);
        }
        if(params.filter != null){
            String filter = params.getFilter();
            request.filter(filter);
        }

        return request.execute();
    }
}
