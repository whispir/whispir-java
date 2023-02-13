package com.whispir.api;

import com.whispir.client.ApiException;
import com.whispir.model.ApiError;
import java.math.BigDecimal;
import com.whispir.model.Template;
import com.whispir.model.TemplateCollection;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.net.URI;

import com.whispir.api.TemplatesApi.TemplateCreateParams;
import com.whispir.api.TemplatesApi.TemplateDeleteParams;
import com.whispir.api.TemplatesApi.TemplateListParams;
import com.whispir.api.TemplatesApi.TemplateRetrieveParams;
import com.whispir.api.TemplatesApi.TemplateUpdateParams;

/**
 * API tests for TemplatesApi
 */
@Disabled
public class TemplatesApiTest {
    private final TemplatesApi api = new TemplatesApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void TemplateCreateTest() throws ApiException {
        String workspaceId = null;
        String messageTemplateDescription = null;
        String responseTemplateId = null;
        String subject = null;
        String body = null;
        TemplateCreateParams.Email email = null;
        TemplateCreateParams.Voice voice = null;
        TemplateCreateParams.Web web = null;
        TemplateCreateParams.Social social = null;
        String type = null;
        TemplateCreateParams.Features features = null;
        TemplateCreateParams.DeliveryReceipt dlr = null;
        TemplateCreateParams params = TemplateCreateParams.builder()
                                        .setWorkspaceId(workspaceId)
                                        .setMessageTemplateDescription(messageTemplateDescription)
                                        .setResponseTemplateId(responseTemplateId)
                                        .setSubject(subject)
                                        .setBody(body)
                                        .setEmail(email)
                                        .setVoice(voice)
                                        .setWeb(web)
                                        .setSocial(social)
                                        .setType(type)
                                        .setFeatures(features)
                                        .setDlr(dlr)
                                        .build();
        Template response = api.create(params);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void TemplateDeleteTest() throws ApiException {
        String workspaceId = null;
        String templateId = null;
        TemplateDeleteParams params = TemplateDeleteParams.builder()
                                        .setWorkspaceId(workspaceId)
                                        .setTemplateId(templateId)
                                        .build();
        api.delete(params);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void TemplateListTest() throws ApiException {
        String workspaceId = null;
        BigDecimal limit = null;
        BigDecimal offset = null;
        String sortOrder = null;
        String sortFields = null;
        TemplateListParams params = TemplateListParams.builder()
                                        .setWorkspaceId(workspaceId)
                                        .setLimit(limit)
                                        .setOffset(offset)
                                        .setSortOrder(sortOrder)
                                        .setSortFields(sortFields)
                                        .build();
        TemplateCollection response = api.list(params);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void TemplateRetrieveTest() throws ApiException {
        String workspaceId = null;
        String templateId = null;
        TemplateRetrieveParams params = TemplateRetrieveParams.builder()
                                        .setWorkspaceId(workspaceId)
                                        .setTemplateId(templateId)
                                        .build();
        Template response = api.retrieve(params);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void TemplateUpdateTest() throws ApiException {
        String workspaceId = null;
        String templateId = null;
        String messageTemplateDescription = null;
        String responseTemplateId = null;
        String subject = null;
        String body = null;
        TemplateUpdateParams.Email email = null;
        TemplateUpdateParams.Voice voice = null;
        TemplateUpdateParams.Web web = null;
        TemplateUpdateParams.Social social = null;
        String type = null;
        TemplateUpdateParams.Features features = null;
        TemplateUpdateParams.DeliveryReceipt dlr = null;
        TemplateUpdateParams params = TemplateUpdateParams.builder()
                                        .setWorkspaceId(workspaceId)
                                        .setTemplateId(templateId)
                                        .setMessageTemplateDescription(messageTemplateDescription)
                                        .setResponseTemplateId(responseTemplateId)
                                        .setSubject(subject)
                                        .setBody(body)
                                        .setEmail(email)
                                        .setVoice(voice)
                                        .setWeb(web)
                                        .setSocial(social)
                                        .setType(type)
                                        .setFeatures(features)
                                        .setDlr(dlr)
                                        .build();
        api.update(params);
        // TODO: test validations
    }

}
