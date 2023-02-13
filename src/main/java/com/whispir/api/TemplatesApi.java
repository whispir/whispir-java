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
import com.whispir.model.Template;
import com.whispir.model.TemplateCollection;

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

public class TemplatesApi {
    private static ApiClient localVarApiClient = Configuration.getDefaultApiClient();

    private static okhttp3.Call templateCreateCall(String workspaceId, String xApiKey, String contentType, String accept, Template template, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = template;

        // create path and map variables
        String localVarPath = "/workspaces/{workspaceId}/templates"
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
            "application/vnd.whispir.template-v1+json",
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/vnd.whispir.template-v1+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth", "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private static okhttp3.Call templateCreateValidateBeforeCall(String workspaceId, String xApiKey, String contentType, String accept, Template template, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'workspaceId' is set
        if (workspaceId == null) {
            throw new ApiException("Missing the required parameter 'workspaceId' when calling templateCreate(Async)");
        }

        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling templateCreate(Async)");
        }

        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new ApiException("Missing the required parameter 'contentType' when calling templateCreate(Async)");
        }

        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling templateCreate(Async)");
        }

        // verify the required parameter 'template' is set
        if (template == null) {
            throw new ApiException("Missing the required parameter 'template' when calling templateCreate(Async)");
        }

        return templateCreateCall(workspaceId, xApiKey, contentType, accept, template, _callback);
    }

    private static ApiResponse<Template> templateCreateWithHttpInfo(String workspaceId, String xApiKey, String contentType, String accept, Template template) throws ApiException {
        okhttp3.Call localVarCall = templateCreateCall(workspaceId, xApiKey, contentType, accept, template, null);
        Type localVarReturnType = new TypeToken<Template>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private static okhttp3.Call templateCreateAsync(String workspaceId, String xApiKey, String contentType, String accept, Template template, final ApiCallback<Template> _callback) throws ApiException {
        okhttp3.Call localVarCall = templateCreateValidateBeforeCall(workspaceId, xApiKey, contentType, accept, template, _callback);
        Type localVarReturnType = new TypeToken<Template>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public static class TemplateCreateParams {
        private String workspaceId;
        private Template template;
        private String messageTemplateDescription;
        private String responseTemplateId;
        private String subject;
        private String body;
        private Email email;
        private Voice voice;
        private Web web;
        private Social social;
        private String type;
        private Features features;
        private DeliveryReceipt dlr;

        private TemplateCreateParams(
            String workspaceId,
            Template template,
            String messageTemplateDescription,
            String responseTemplateId,
            String subject,
            String body,
            Email email,
            Voice voice,
            Web web,
            Social social,
            String type,
            Features features,
            DeliveryReceipt dlr
        ){
            this.workspaceId = workspaceId;
            this.template = template;
            this.messageTemplateDescription = messageTemplateDescription;
            this.responseTemplateId = responseTemplateId;
            this.subject = subject;
            this.body = body;
            this.email = email;
            this.voice = voice;
            this.web = web;
            this.social = social;
            this.type = type;
            this.features = features;
            this.dlr = dlr;
        }
            public String getWorkspaceId() {
                return workspaceId;
            }
            public Template getTemplate() {
                return template;
            }
            public String getMessageTemplateDescription() {
                return messageTemplateDescription;
            }
            public String getResponseTemplateId() {
                return responseTemplateId;
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
            public String getType() {
                return type;
            }
            public Features getFeatures() {
                return features;
            }
            public DeliveryReceipt getDlr() {
                return dlr;
            }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private String workspaceId;
            private Template template;
            private String messageTemplateDescription;
            private String responseTemplateId;
            private String subject;
            private String body;
            private Email email;
            private Voice voice;
            private Web web;
            private Social social;
            private String type;
            private Features features;
            private DeliveryReceipt dlr;

            public TemplateCreateParams build() {
                return new TemplateCreateParams(
                    workspaceId,
                    template,
                    messageTemplateDescription,
                    responseTemplateId,
                    subject,
                    body,
                    email,
                    voice,
                    web,
                    social,
                    type,
                    features,
                    dlr
                );
            }

            public Builder setWorkspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }
            public Builder setTemplate(Template template) {
                this.template = template;
                return this;
            }
            public Builder setMessageTemplateDescription(String messageTemplateDescription) {
                this.messageTemplateDescription = messageTemplateDescription;
                return this;
            }
            public Builder setResponseTemplateId(String responseTemplateId) {
                this.responseTemplateId = responseTemplateId;
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
            public Builder setType(String type) {
                this.type = type;
                return this;
            }
            public Builder setFeatures(Features features) {
                this.features = features;
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

    public static class TemplateCreateRequest {
        private final String workspaceId;
        private final String xApiKey;
        private final String contentType;
        private final String accept;
        private final Template template;
        ApiResponse _lastResponse;

        private TemplateCreateRequest(String workspaceId, String xApiKey, String contentType, String accept, Template template) {
            this.workspaceId = workspaceId;
            this.xApiKey = xApiKey;
            this.contentType = contentType;
            this.accept = accept;
            this.template = template;
        }

        /**
         * Build call for templateCreate
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return templateCreateCall(workspaceId, xApiKey, contentType, accept, template, _callback);
        }

        /**
         * Execute templateCreate request
         * @return Template
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public Template execute() throws ApiException {
            ApiResponse<Template> localVarResp = templateCreateWithHttpInfo(workspaceId, xApiKey, contentType, accept, template);
            _lastResponse = localVarResp;
            Template data = localVarResp.getData();

            
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
         * Execute templateCreate request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<Template> _callback) throws ApiException {
            return templateCreateAsync(workspaceId, xApiKey, contentType, accept, template, _callback);
        }
    }

    /**
     * Create a template
     * @param params The param instance required to create TemplateCreateRequest
     * @return Template
     */

    public static Template create(Map<String, Object> params) throws ApiException {
        String workspaceId = (String) params.get("workspaceId");

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }
        String messageTemplateDescriptionValue = (String) params.get("messageTemplateDescription");
        String responseTemplateIdValue = (String) params.get("responseTemplateId");
        String subjectValue = (String) params.get("subject");
        if(subjectValue == null) {
            throw new ApiException("Missing the required property value of 'subject'");
        }
        String bodyValue = (String) params.get("body");
        if(bodyValue == null) {
            throw new ApiException("Missing the required property value of 'body'");
        }
        Object emailValue = params.get("email");
        Object voiceValue = params.get("voice");
        Object webValue = params.get("web");
        Object socialValue = params.get("social");
        String typeValue = (String) params.get("type");
        Object featuresValue = params.get("features");
        Object dlrValue = params.get("dlr");
        TemplateCreateParams tempParams = TemplateCreateParams.builder()
            .setWorkspaceId(workspaceId)
            .setMessageTemplateDescription(messageTemplateDescriptionValue)
            .setResponseTemplateId(responseTemplateIdValue)
            .setSubject(subjectValue)
            .setBody(bodyValue)
            .setEmail((com.whispir.api.TemplatesApi.TemplateCreateParams.Email) emailValue)
            .setVoice((com.whispir.api.TemplatesApi.TemplateCreateParams.Voice) voiceValue)
            .setWeb((com.whispir.api.TemplatesApi.TemplateCreateParams.Web) webValue)
            .setSocial((com.whispir.api.TemplatesApi.TemplateCreateParams.Social) socialValue)
            .setType(typeValue)
            .setFeatures((com.whispir.api.TemplatesApi.TemplateCreateParams.Features) featuresValue)
            .setDlr((com.whispir.api.TemplatesApi.TemplateCreateParams.DeliveryReceipt) dlrValue).build();

        return create(tempParams);
    }

    public static Template create(TemplateCreateParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }


        String workspaceId = params.getWorkspaceId();

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }

        String contentType = "application/vnd.whispir.template-v1+json";

        String accept = "application/vnd.whispir.template-v1+json";


        // Constructing 'Template' from 'TemplateCreateParams' instance passed
        Template template = new Template();
        String messageTemplateDescriptionValue = params.getMessageTemplateDescription();
        template.setMessageTemplateDescription(messageTemplateDescriptionValue);

        String responseTemplateIdValue = params.getResponseTemplateId();
        template.setResponseTemplateId(responseTemplateIdValue);

        String subjectValue = params.getSubject();
        if(subjectValue == null) {
            throw new ApiException("Missing the required property value of 'subject'");
        }
        template.setSubject(subjectValue);

        String bodyValue = params.getBody();
        if(bodyValue == null) {
            throw new ApiException("Missing the required property value of 'body'");
        }
        template.setBody(bodyValue);

        Object emailValue = params.getEmail();
        template.setEmail((com.whispir.model.Email) emailValue);

        Object voiceValue = params.getVoice();
        template.setVoice((com.whispir.model.Voice) voiceValue);

        Object webValue = params.getWeb();
        template.setWeb((com.whispir.model.Web) webValue);

        Object socialValue = params.getSocial();
        template.setSocial((com.whispir.model.Social) socialValue);

        String typeValue = params.getType();
        template.setType(typeValue);

        Object featuresValue = params.getFeatures();
        template.setFeatures((com.whispir.model.Features) featuresValue);

        Object dlrValue = params.getDlr();
        template.setDlr((com.whispir.model.DeliveryReceipt) dlrValue);

        TemplateCreateRequest request = new TemplateCreateRequest(workspaceId, xApiKey, contentType, accept, template);

        // Ensure to include all of the 'optionalParams' that are passed

        return request.execute();
    }
    private static okhttp3.Call templateDeleteCall(String workspaceId, String xApiKey, String contentType, String accept, String templateId, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/workspaces/{workspaceId}/templates/{templateId}"
            .replace("{" + "workspaceId" + "}", localVarApiClient.escapeString(workspaceId.toString()))
            .replace("{" + "templateId" + "}", localVarApiClient.escapeString(templateId.toString()));

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
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private static okhttp3.Call templateDeleteValidateBeforeCall(String workspaceId, String xApiKey, String contentType, String accept, String templateId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'workspaceId' is set
        if (workspaceId == null) {
            throw new ApiException("Missing the required parameter 'workspaceId' when calling templateDelete(Async)");
        }

        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling templateDelete(Async)");
        }

        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new ApiException("Missing the required parameter 'contentType' when calling templateDelete(Async)");
        }

        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling templateDelete(Async)");
        }

        // verify the required parameter 'templateId' is set
        if (templateId == null) {
            throw new ApiException("Missing the required parameter 'templateId' when calling templateDelete(Async)");
        }

        return templateDeleteCall(workspaceId, xApiKey, contentType, accept, templateId, _callback);
    }

    private static ApiResponse<Void> templateDeleteWithHttpInfo(String workspaceId, String xApiKey, String contentType, String accept, String templateId) throws ApiException {
        okhttp3.Call localVarCall = templateDeleteCall(workspaceId, xApiKey, contentType, accept, templateId, null);
        return localVarApiClient.execute(localVarCall);
    }

    private static okhttp3.Call templateDeleteAsync(String workspaceId, String xApiKey, String contentType, String accept, String templateId, final ApiCallback<Void> _callback) throws ApiException {
        okhttp3.Call localVarCall = templateDeleteValidateBeforeCall(workspaceId, xApiKey, contentType, accept, templateId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public static class TemplateDeleteParams {
        private String workspaceId;
        private String templateId;

        private TemplateDeleteParams(
            String workspaceId,
            String templateId
        ){
            this.workspaceId = workspaceId;
            this.templateId = templateId;
        }
            public String getWorkspaceId() {
                return workspaceId;
            }
            public String getTemplateId() {
                return templateId;
            }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private String workspaceId;
            private String templateId;

            public TemplateDeleteParams build() {
                return new TemplateDeleteParams(
                    workspaceId,
                    templateId
                );
            }

            public Builder setWorkspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }
            public Builder setTemplateId(String templateId) {
                this.templateId = templateId;
                return this;
            }
        }
        
    }

    public static class TemplateDeleteRequest {
        private final String workspaceId;
        private final String xApiKey;
        private final String contentType;
        private final String accept;
        private final String templateId;
        ApiResponse _lastResponse;

        private TemplateDeleteRequest(String workspaceId, String xApiKey, String contentType, String accept, String templateId) {
            this.workspaceId = workspaceId;
            this.xApiKey = xApiKey;
            this.contentType = contentType;
            this.accept = accept;
            this.templateId = templateId;
        }

        /**
         * Build call for templateDelete
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return templateDeleteCall(workspaceId, xApiKey, contentType, accept, templateId, _callback);
        }

        /**
         * Execute templateDelete request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public void execute() throws ApiException {
            templateDeleteWithHttpInfo(workspaceId, xApiKey, contentType, accept, templateId);
        }
        /**
         * Return the last executed API response
         * @return ApiResponse
         */
        public ApiResponse getLastResponse()  {
            return _lastResponse;
        }


        /**
         * Execute templateDelete request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return templateDeleteAsync(workspaceId, xApiKey, contentType, accept, templateId, _callback);
        }
    }

    /**
     * Delete a template
     * @param params The param instance required to create TemplateDeleteRequest
     * @return void
     */

    public static void delete(Map<String, Object> params) throws ApiException {
        String workspaceId = (String) params.get("workspaceId");

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }
        String templateId = (String) params.get("templateId");

        if(templateId == null || templateId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'templateId'");
        }
        TemplateDeleteParams tempParams = TemplateDeleteParams.builder()
            .setWorkspaceId(workspaceId)
            .setTemplateId(templateId).build();

        delete(tempParams);
    }

    public static void delete(TemplateDeleteParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }


        String workspaceId = params.getWorkspaceId();

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }

        String contentType = "application/vnd.whispir.template-v1+json";

        String accept = "application/vnd.whispir.template-v1+json";


        String templateId = params.getTemplateId();

        if(templateId == null || templateId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'templateId'");
        }
        TemplateDeleteRequest request = new TemplateDeleteRequest(workspaceId, xApiKey, contentType, accept, templateId);

        // Ensure to include all of the 'optionalParams' that are passed

        request.execute();
    }
    private static okhttp3.Call templateListCall(String workspaceId, String xApiKey, String accept, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/workspaces/{workspaceId}/templates"
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
    private static okhttp3.Call templateListValidateBeforeCall(String workspaceId, String xApiKey, String accept, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'workspaceId' is set
        if (workspaceId == null) {
            throw new ApiException("Missing the required parameter 'workspaceId' when calling templateList(Async)");
        }

        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling templateList(Async)");
        }

        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling templateList(Async)");
        }

        return templateListCall(workspaceId, xApiKey, accept, limit, offset, sortOrder, sortFields, _callback);
    }

    private static ApiResponse<TemplateCollection> templateListWithHttpInfo(String workspaceId, String xApiKey, String accept, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields) throws ApiException {
        okhttp3.Call localVarCall = templateListCall(workspaceId, xApiKey, accept, limit, offset, sortOrder, sortFields, null);
        Type localVarReturnType = new TypeToken<TemplateCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private static okhttp3.Call templateListAsync(String workspaceId, String xApiKey, String accept, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields, final ApiCallback<TemplateCollection> _callback) throws ApiException {
        okhttp3.Call localVarCall = templateListValidateBeforeCall(workspaceId, xApiKey, accept, limit, offset, sortOrder, sortFields, _callback);
        Type localVarReturnType = new TypeToken<TemplateCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public static class TemplateListParams {
        private String workspaceId;
        private BigDecimal limit;
        private BigDecimal offset;
        private String sortOrder;
        private String sortFields;

        private TemplateListParams(
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

            public TemplateListParams build() {
                return new TemplateListParams(
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

    public static class TemplateListRequest {
        private final String workspaceId;
        private final String xApiKey;
        private final String accept;
        private BigDecimal limit;
        private BigDecimal offset;
        private String sortOrder;
        private String sortFields;
        ApiResponse _lastResponse;

        private TemplateListRequest(String workspaceId, String xApiKey, String accept) {
            this.workspaceId = workspaceId;
            this.xApiKey = xApiKey;
            this.accept = accept;
        }

        /**
         * Set limit
         * @param limit The number of records to be returned. (optional, default to 20)
         * @return APItemplateListRequest
         */
        public TemplateListRequest limit(BigDecimal limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Set offset
         * @param offset The record number to start returning from. (optional, default to 0)
         * @return APItemplateListRequest
         */
        public TemplateListRequest offset(BigDecimal offset) {
            this.offset = offset;
            return this;
        }

        /**
         * Set sortOrder
         * @param sortOrder The order in which you require the results to be returned. Either ‘asc’ or ‘desc’ (optional)
         * @return APItemplateListRequest
         */
        public TemplateListRequest sortOrder(String sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * Set sortFields
         * @param sortFields The fields that you require the ordering to be performed on. Multiple fields can be provided, separated by a comma. (optional)
         * @return APItemplateListRequest
         */
        public TemplateListRequest sortFields(String sortFields) {
            this.sortFields = sortFields;
            return this;
        }

        /**
         * Build call for templateList
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return templateListCall(workspaceId, xApiKey, accept, limit, offset, sortOrder, sortFields, _callback);
        }

        /**
         * Execute templateList request
         * @return TemplateCollection
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public TemplateCollection execute() throws ApiException {
            ApiResponse<TemplateCollection> localVarResp = templateListWithHttpInfo(workspaceId, xApiKey, accept, limit, offset, sortOrder, sortFields);
            _lastResponse = localVarResp;
            TemplateCollection data = localVarResp.getData();

            
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
         * Execute templateList request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<TemplateCollection> _callback) throws ApiException {
            return templateListAsync(workspaceId, xApiKey, accept, limit, offset, sortOrder, sortFields, _callback);
        }
    }

    /**
     * List templates
     * @param params The param instance required to create TemplateListRequest
     * @return TemplateCollection
     */

    public static TemplateCollection list(Map<String, Object> params) throws ApiException {
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
        TemplateListParams tempParams = TemplateListParams.builder()
            .setWorkspaceId(workspaceId)
            .setLimit(limit)
            .setOffset(offset)
            .setSortOrder(sortOrder)
            .setSortFields(sortFields).build();

        return list(tempParams);
    }

    public static TemplateCollection list(TemplateListParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }


        String workspaceId = params.getWorkspaceId();

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }

        String accept = "application/vnd.whispir.template-v1+json";

        TemplateListRequest request = new TemplateListRequest(workspaceId, xApiKey, accept);

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
    private static okhttp3.Call templateRetrieveCall(String workspaceId, String xApiKey, String accept, String templateId, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/workspaces/{workspaceId}/templates/{templateId}"
            .replace("{" + "workspaceId" + "}", localVarApiClient.escapeString(workspaceId.toString()))
            .replace("{" + "templateId" + "}", localVarApiClient.escapeString(templateId.toString()));

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
            "application/vnd.whispir.template-v1+json",
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
    private static okhttp3.Call templateRetrieveValidateBeforeCall(String workspaceId, String xApiKey, String accept, String templateId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'workspaceId' is set
        if (workspaceId == null) {
            throw new ApiException("Missing the required parameter 'workspaceId' when calling templateRetrieve(Async)");
        }

        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling templateRetrieve(Async)");
        }

        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling templateRetrieve(Async)");
        }

        // verify the required parameter 'templateId' is set
        if (templateId == null) {
            throw new ApiException("Missing the required parameter 'templateId' when calling templateRetrieve(Async)");
        }

        return templateRetrieveCall(workspaceId, xApiKey, accept, templateId, _callback);
    }

    private static ApiResponse<Template> templateRetrieveWithHttpInfo(String workspaceId, String xApiKey, String accept, String templateId) throws ApiException {
        okhttp3.Call localVarCall = templateRetrieveCall(workspaceId, xApiKey, accept, templateId, null);
        Type localVarReturnType = new TypeToken<Template>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private static okhttp3.Call templateRetrieveAsync(String workspaceId, String xApiKey, String accept, String templateId, final ApiCallback<Template> _callback) throws ApiException {
        okhttp3.Call localVarCall = templateRetrieveValidateBeforeCall(workspaceId, xApiKey, accept, templateId, _callback);
        Type localVarReturnType = new TypeToken<Template>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public static class TemplateRetrieveParams {
        private String workspaceId;
        private String templateId;

        private TemplateRetrieveParams(
            String workspaceId,
            String templateId
        ){
            this.workspaceId = workspaceId;
            this.templateId = templateId;
        }
            public String getWorkspaceId() {
                return workspaceId;
            }
            public String getTemplateId() {
                return templateId;
            }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private String workspaceId;
            private String templateId;

            public TemplateRetrieveParams build() {
                return new TemplateRetrieveParams(
                    workspaceId,
                    templateId
                );
            }

            public Builder setWorkspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }
            public Builder setTemplateId(String templateId) {
                this.templateId = templateId;
                return this;
            }
        }
        
    }

    public static class TemplateRetrieveRequest {
        private final String workspaceId;
        private final String xApiKey;
        private final String accept;
        private final String templateId;
        ApiResponse _lastResponse;

        private TemplateRetrieveRequest(String workspaceId, String xApiKey, String accept, String templateId) {
            this.workspaceId = workspaceId;
            this.xApiKey = xApiKey;
            this.accept = accept;
            this.templateId = templateId;
        }

        /**
         * Build call for templateRetrieve
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return templateRetrieveCall(workspaceId, xApiKey, accept, templateId, _callback);
        }

        /**
         * Execute templateRetrieve request
         * @return Template
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public Template execute() throws ApiException {
            ApiResponse<Template> localVarResp = templateRetrieveWithHttpInfo(workspaceId, xApiKey, accept, templateId);
            _lastResponse = localVarResp;
            Template data = localVarResp.getData();

            
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
         * Execute templateRetrieve request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<Template> _callback) throws ApiException {
            return templateRetrieveAsync(workspaceId, xApiKey, accept, templateId, _callback);
        }
    }

    /**
     * Retrieve a template
     * @param params The param instance required to create TemplateRetrieveRequest
     * @return Template
     */

    public static Template retrieve(Map<String, Object> params) throws ApiException {
        String workspaceId = (String) params.get("workspaceId");

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }
        String templateId = (String) params.get("templateId");

        if(templateId == null || templateId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'templateId'");
        }
        TemplateRetrieveParams tempParams = TemplateRetrieveParams.builder()
            .setWorkspaceId(workspaceId)
            .setTemplateId(templateId).build();

        return retrieve(tempParams);
    }

    public static Template retrieve(TemplateRetrieveParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }


        String workspaceId = params.getWorkspaceId();

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }

        String accept = "application/vnd.whispir.template-v1+json";


        String templateId = params.getTemplateId();

        if(templateId == null || templateId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'templateId'");
        }
        TemplateRetrieveRequest request = new TemplateRetrieveRequest(workspaceId, xApiKey, accept, templateId);

        // Ensure to include all of the 'optionalParams' that are passed

        return request.execute();
    }
    private static okhttp3.Call templateUpdateCall(String workspaceId, String xApiKey, String contentType, String accept, String templateId, Template template, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = template;

        // create path and map variables
        String localVarPath = "/workspaces/{workspaceId}/templates/{templateId}"
            .replace("{" + "workspaceId" + "}", localVarApiClient.escapeString(workspaceId.toString()))
            .replace("{" + "templateId" + "}", localVarApiClient.escapeString(templateId.toString()));

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
            "application/vnd.whispir.template-v1+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth", "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private static okhttp3.Call templateUpdateValidateBeforeCall(String workspaceId, String xApiKey, String contentType, String accept, String templateId, Template template, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'workspaceId' is set
        if (workspaceId == null) {
            throw new ApiException("Missing the required parameter 'workspaceId' when calling templateUpdate(Async)");
        }

        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling templateUpdate(Async)");
        }

        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new ApiException("Missing the required parameter 'contentType' when calling templateUpdate(Async)");
        }

        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling templateUpdate(Async)");
        }

        // verify the required parameter 'templateId' is set
        if (templateId == null) {
            throw new ApiException("Missing the required parameter 'templateId' when calling templateUpdate(Async)");
        }

        // verify the required parameter 'template' is set
        if (template == null) {
            throw new ApiException("Missing the required parameter 'template' when calling templateUpdate(Async)");
        }

        return templateUpdateCall(workspaceId, xApiKey, contentType, accept, templateId, template, _callback);
    }

    private static ApiResponse<Void> templateUpdateWithHttpInfo(String workspaceId, String xApiKey, String contentType, String accept, String templateId, Template template) throws ApiException {
        okhttp3.Call localVarCall = templateUpdateCall(workspaceId, xApiKey, contentType, accept, templateId, template, null);
        return localVarApiClient.execute(localVarCall);
    }

    private static okhttp3.Call templateUpdateAsync(String workspaceId, String xApiKey, String contentType, String accept, String templateId, Template template, final ApiCallback<Void> _callback) throws ApiException {
        okhttp3.Call localVarCall = templateUpdateValidateBeforeCall(workspaceId, xApiKey, contentType, accept, templateId, template, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public static class TemplateUpdateParams {
        private String workspaceId;
        private String templateId;
        private Template template;
        private String messageTemplateDescription;
        private String responseTemplateId;
        private String subject;
        private String body;
        private Email email;
        private Voice voice;
        private Web web;
        private Social social;
        private String type;
        private Features features;
        private DeliveryReceipt dlr;

        private TemplateUpdateParams(
            String workspaceId,
            String templateId,
            Template template,
            String messageTemplateDescription,
            String responseTemplateId,
            String subject,
            String body,
            Email email,
            Voice voice,
            Web web,
            Social social,
            String type,
            Features features,
            DeliveryReceipt dlr
        ){
            this.workspaceId = workspaceId;
            this.templateId = templateId;
            this.template = template;
            this.messageTemplateDescription = messageTemplateDescription;
            this.responseTemplateId = responseTemplateId;
            this.subject = subject;
            this.body = body;
            this.email = email;
            this.voice = voice;
            this.web = web;
            this.social = social;
            this.type = type;
            this.features = features;
            this.dlr = dlr;
        }
            public String getWorkspaceId() {
                return workspaceId;
            }
            public String getTemplateId() {
                return templateId;
            }
            public Template getTemplate() {
                return template;
            }
            public String getMessageTemplateDescription() {
                return messageTemplateDescription;
            }
            public String getResponseTemplateId() {
                return responseTemplateId;
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
            public String getType() {
                return type;
            }
            public Features getFeatures() {
                return features;
            }
            public DeliveryReceipt getDlr() {
                return dlr;
            }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private String workspaceId;
            private String templateId;
            private Template template;
            private String messageTemplateDescription;
            private String responseTemplateId;
            private String subject;
            private String body;
            private Email email;
            private Voice voice;
            private Web web;
            private Social social;
            private String type;
            private Features features;
            private DeliveryReceipt dlr;

            public TemplateUpdateParams build() {
                return new TemplateUpdateParams(
                    workspaceId,
                    templateId,
                    template,
                    messageTemplateDescription,
                    responseTemplateId,
                    subject,
                    body,
                    email,
                    voice,
                    web,
                    social,
                    type,
                    features,
                    dlr
                );
            }

            public Builder setWorkspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }
            public Builder setTemplateId(String templateId) {
                this.templateId = templateId;
                return this;
            }
            public Builder setTemplate(Template template) {
                this.template = template;
                return this;
            }
            public Builder setMessageTemplateDescription(String messageTemplateDescription) {
                this.messageTemplateDescription = messageTemplateDescription;
                return this;
            }
            public Builder setResponseTemplateId(String responseTemplateId) {
                this.responseTemplateId = responseTemplateId;
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
            public Builder setType(String type) {
                this.type = type;
                return this;
            }
            public Builder setFeatures(Features features) {
                this.features = features;
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

    public static class TemplateUpdateRequest {
        private final String workspaceId;
        private final String xApiKey;
        private final String contentType;
        private final String accept;
        private final String templateId;
        private final Template template;
        ApiResponse _lastResponse;

        private TemplateUpdateRequest(String workspaceId, String xApiKey, String contentType, String accept, String templateId, Template template) {
            this.workspaceId = workspaceId;
            this.xApiKey = xApiKey;
            this.contentType = contentType;
            this.accept = accept;
            this.templateId = templateId;
            this.template = template;
        }

        /**
         * Build call for templateUpdate
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return templateUpdateCall(workspaceId, xApiKey, contentType, accept, templateId, template, _callback);
        }

        /**
         * Execute templateUpdate request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public void execute() throws ApiException {
            templateUpdateWithHttpInfo(workspaceId, xApiKey, contentType, accept, templateId, template);
        }
        /**
         * Return the last executed API response
         * @return ApiResponse
         */
        public ApiResponse getLastResponse()  {
            return _lastResponse;
        }


        /**
         * Execute templateUpdate request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return templateUpdateAsync(workspaceId, xApiKey, contentType, accept, templateId, template, _callback);
        }
    }

    /**
     * Update a template
     * @param params The param instance required to create TemplateUpdateRequest
     * @return void
     */

    public static void update(Map<String, Object> params) throws ApiException {
        String workspaceId = (String) params.get("workspaceId");

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }
        String templateId = (String) params.get("templateId");

        if(templateId == null || templateId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'templateId'");
        }
        String messageTemplateDescriptionValue = (String) params.get("messageTemplateDescription");
        String responseTemplateIdValue = (String) params.get("responseTemplateId");
        String subjectValue = (String) params.get("subject");
        if(subjectValue == null) {
            throw new ApiException("Missing the required property value of 'subject'");
        }
        String bodyValue = (String) params.get("body");
        if(bodyValue == null) {
            throw new ApiException("Missing the required property value of 'body'");
        }
        Object emailValue = params.get("email");
        Object voiceValue = params.get("voice");
        Object webValue = params.get("web");
        Object socialValue = params.get("social");
        String typeValue = (String) params.get("type");
        Object featuresValue = params.get("features");
        Object dlrValue = params.get("dlr");
        TemplateUpdateParams tempParams = TemplateUpdateParams.builder()
            .setWorkspaceId(workspaceId)
            .setTemplateId(templateId)
            .setMessageTemplateDescription(messageTemplateDescriptionValue)
            .setResponseTemplateId(responseTemplateIdValue)
            .setSubject(subjectValue)
            .setBody(bodyValue)
            .setEmail((com.whispir.api.TemplatesApi.TemplateUpdateParams.Email) emailValue)
            .setVoice((com.whispir.api.TemplatesApi.TemplateUpdateParams.Voice) voiceValue)
            .setWeb((com.whispir.api.TemplatesApi.TemplateUpdateParams.Web) webValue)
            .setSocial((com.whispir.api.TemplatesApi.TemplateUpdateParams.Social) socialValue)
            .setType(typeValue)
            .setFeatures((com.whispir.api.TemplatesApi.TemplateUpdateParams.Features) featuresValue)
            .setDlr((com.whispir.api.TemplatesApi.TemplateUpdateParams.DeliveryReceipt) dlrValue).build();

        update(tempParams);
    }

    public static void update(TemplateUpdateParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }


        String workspaceId = params.getWorkspaceId();

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }

        String contentType = "application/vnd.whispir.template-v1+json";

        String accept = "application/vnd.whispir.template-v1+json";


        String templateId = params.getTemplateId();

        if(templateId == null || templateId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'templateId'");
        }

        // Constructing 'Template' from 'TemplateUpdateParams' instance passed
        Template template = new Template();
        String messageTemplateDescriptionValue = params.getMessageTemplateDescription();
        template.setMessageTemplateDescription(messageTemplateDescriptionValue);

        String responseTemplateIdValue = params.getResponseTemplateId();
        template.setResponseTemplateId(responseTemplateIdValue);

        String subjectValue = params.getSubject();
        if(subjectValue == null) {
            throw new ApiException("Missing the required property value of 'subject'");
        }
        template.setSubject(subjectValue);

        String bodyValue = params.getBody();
        if(bodyValue == null) {
            throw new ApiException("Missing the required property value of 'body'");
        }
        template.setBody(bodyValue);

        Object emailValue = params.getEmail();
        template.setEmail((com.whispir.model.Email) emailValue);

        Object voiceValue = params.getVoice();
        template.setVoice((com.whispir.model.Voice) voiceValue);

        Object webValue = params.getWeb();
        template.setWeb((com.whispir.model.Web) webValue);

        Object socialValue = params.getSocial();
        template.setSocial((com.whispir.model.Social) socialValue);

        String typeValue = params.getType();
        template.setType(typeValue);

        Object featuresValue = params.getFeatures();
        template.setFeatures((com.whispir.model.Features) featuresValue);

        Object dlrValue = params.getDlr();
        template.setDlr((com.whispir.model.DeliveryReceipt) dlrValue);

        TemplateUpdateRequest request = new TemplateUpdateRequest(workspaceId, xApiKey, contentType, accept, templateId, template);

        // Ensure to include all of the 'optionalParams' that are passed

        request.execute();
    }
}
