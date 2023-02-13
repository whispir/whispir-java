package com.whispir.api;

import com.whispir.client.ApiException;
import com.whispir.model.ApiError;
import java.math.BigDecimal;
import com.whispir.model.Message;
import com.whispir.model.MessageCollection;
import com.whispir.model.MessageResponseCollection;
import com.whispir.model.MessageStatusCollection;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.net.URI;

import com.whispir.api.MessagesApi.MessageCreateParams;
import com.whispir.api.MessagesApi.MessageListParams;
import com.whispir.api.MessagesApi.MessageResponseListParams;
import com.whispir.api.MessagesApi.MessageRetrieveParams;
import com.whispir.api.MessagesApi.MessageStatusListParams;

/**
 * API tests for MessagesApi
 */
@Disabled
public class MessagesApiTest {
    private final MessagesApi api = new MessagesApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void MessageCreateTest() throws ApiException {
        String workspaceId = null;
        String to = null;
        String subject = null;
        String body = null;
        MessageCreateParams.Email email = null;
        MessageCreateParams.Voice voice = null;
        MessageCreateParams.Web web = null;
        MessageCreateParams.Social social = null;
        MessageCreateParams.TypeEnum type = null;
        MessageCreateParams.Features features = null;
        MessageCreateParams.Resource resource = null;
        String messageTemplateId = null;
        String messageTemplateName = null;
        String callbackId = null;
        Object callbackParameters = null;
        String label = null;
        String eventId = null;
        MessageCreateParams.MessageTypeEnum messageType = null;
        MessageCreateParams.ScheduleTypeEnum scheduleType = null;
        String scheduleDate = null;
         BigDecimal repetitionCount = null;
         BigDecimal repeatDays = null;
         BigDecimal repeatHrs = null;
         BigDecimal repeatMin = null;
        MessageCreateParams.DeliveryReceipt dlr = null;
        MessageCreateParams params = MessageCreateParams.builder()
                                        .setWorkspaceId(workspaceId)
                                        .setTo(to)
                                        .setSubject(subject)
                                        .setBody(body)
                                        .setEmail(email)
                                        .setVoice(voice)
                                        .setWeb(web)
                                        .setSocial(social)
                                        .setType(type)
                                        .setFeatures(features)
                                        .setResource(resource)
                                        .setMessageTemplateId(messageTemplateId)
                                        .setMessageTemplateName(messageTemplateName)
                                        .setCallbackId(callbackId)
                                        .setCallbackParameters(callbackParameters)
                                        .setLabel(label)
                                        .setEventId(eventId)
                                        .setMessageType(messageType)
                                        .setScheduleType(scheduleType)
                                        .setScheduleDate(scheduleDate)
                                        .setRepetitionCount(repetitionCount)
                                        .setRepeatDays(repeatDays)
                                        .setRepeatHrs(repeatHrs)
                                        .setRepeatMin(repeatMin)
                                        .setDlr(dlr)
                                        .build();
        Message response = api.create(params);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void MessageListTest() throws ApiException {
        String workspaceId = null;
        BigDecimal limit = null;
        BigDecimal offset = null;
        String sortOrder = null;
        String sortFields = null;
        MessageListParams params = MessageListParams.builder()
                                        .setWorkspaceId(workspaceId)
                                        .setLimit(limit)
                                        .setOffset(offset)
                                        .setSortOrder(sortOrder)
                                        .setSortFields(sortFields)
                                        .build();
        MessageCollection response = api.list(params);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void MessageResponseListTest() throws ApiException {
        String workspaceId = null;
        String messageId = null;
        BigDecimal limit = null;
        BigDecimal offset = null;
        String sortOrder = null;
        String sortFields = null;
        String view = null;
        String filter = null;
        MessageResponseListParams params = MessageResponseListParams.builder()
                                        .setWorkspaceId(workspaceId)
                                        .setMessageId(messageId)
                                        .setLimit(limit)
                                        .setOffset(offset)
                                        .setSortOrder(sortOrder)
                                        .setSortFields(sortFields)
                                        .setView(view)
                                        .setFilter(filter)
                                        .build();
        MessageResponseCollection response = api.listMessageResponse(params);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void MessageRetrieveTest() throws ApiException {
        String workspaceId = null;
        String messageId = null;
        MessageRetrieveParams params = MessageRetrieveParams.builder()
                                        .setWorkspaceId(workspaceId)
                                        .setMessageId(messageId)
                                        .build();
        Message response = api.retrieve(params);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void MessageStatusListTest() throws ApiException {
        String workspaceId = null;
        String messageId = null;
        BigDecimal limit = null;
        BigDecimal offset = null;
        String sortOrder = null;
        String sortFields = null;
        String view = null;
        String filter = null;
        MessageStatusListParams params = MessageStatusListParams.builder()
                                        .setWorkspaceId(workspaceId)
                                        .setMessageId(messageId)
                                        .setLimit(limit)
                                        .setOffset(offset)
                                        .setSortOrder(sortOrder)
                                        .setSortFields(sortFields)
                                        .setView(view)
                                        .setFilter(filter)
                                        .build();
        MessageStatusCollection response = api.listMessageStatus(params);
        // TODO: test validations
    }

}
