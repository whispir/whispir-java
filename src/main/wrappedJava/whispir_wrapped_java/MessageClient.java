/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whispir_wrapped_java;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.openapitools.client.model.GetMessageResponsesById200Response;
import org.openapitools.client.model.GetMessages200Response;
import org.openapitools.client.model.Message;
import org.openapitools.client.model.MessageStatus;
import org.whispir.api.MessagesApi;

import whispir_sdk_java.ApiResponse;
import whispir_sdk_java.ApiClient;
import whispir_sdk_java.ApiException;

/**
 *
 * @author carlangeloorale
 */
public class MessageClient {

  private static String WORKSPACE_ID;
  private static String API_KEY;
  private static final String CONTENT_TYPE = "application/vnd.whispir.message-v1+json";
  private static final String ACCEPT = "application/vnd.whispir.message-v1+json";
  private static ApiClient apiClientInit;

  public MessageClient(ApiClient client, String workspaceId, String apiKey) {
    apiClientInit = client;
    WORKSPACE_ID = workspaceId;
    API_KEY = apiKey;
  }

  public Message create(String to, String subject, String body) {
    MessagesApi messageApi = new MessagesApi(apiClientInit);
    Message payload = new Message();

    payload.to(to);
    payload.subject(subject);
    payload.body(body);

    try {
      Message response = messageApi.postMessages(
          WORKSPACE_ID,
          API_KEY,
          CONTENT_TYPE,
          ACCEPT,
          payload
      );

      return response;
    } catch (ApiException e) {
      System.err.println("Exception when calling Send SMS Message API");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
      throw new Error(e);
    }
  }

  public GetMessages200Response listMessages(
      BigDecimal LIMIT,
      BigDecimal OFFSET,
      String SORT_ORDER,
      String SORT_FIELDS) {
    MessagesApi message = new MessagesApi(apiClientInit);

    try {
      return message.getMessages(
          WORKSPACE_ID,
          API_KEY,
          ACCEPT,
          LIMIT,
          OFFSET,
          SORT_ORDER,
          SORT_FIELDS);
    } catch (ApiException e) {
      throw new Error(e);
    }
  }

  public static Message retrieveMessage(String MESSAGE_ID) {
    MessagesApi message = new MessagesApi(apiClientInit);
    try {
      return message.getMessageById(WORKSPACE_ID, API_KEY, ACCEPT, MESSAGE_ID);
    } catch (ApiException e) {
      throw new Error(e);
    }
  }

  public static MessageStatus retrieveMessageStatus(
      String MESSAGE_ID,
      BigDecimal LIMIT,
      BigDecimal OFFSET,
      String SORT_ORDER,
      String SORT_FIELDS,
      String VIEW,
      String FILTER) {
    MessagesApi message = new MessagesApi(apiClientInit);

    try {
      return message.getMessageStatus(
          WORKSPACE_ID,
          API_KEY,
          ACCEPT,
          MESSAGE_ID,
          LIMIT,
          OFFSET,
          SORT_ORDER,
          SORT_FIELDS,
          VIEW,
          FILTER);
    } catch (ApiException e) {
      throw new Error(e);
    }
  }

  public static GetMessageResponsesById200Response retrieveMessageResponse(
      String MESSAGE_ID,
      BigDecimal LIMIT,
      BigDecimal OFFSET,
      String SORT_ORDER,
      String SORT_FIELDS,
      String VIEW,
      String FILTER) {
    MessagesApi message = new MessagesApi(apiClientInit);

    try {
      return message.getMessageResponsesById(
          WORKSPACE_ID,
          API_KEY,
          ACCEPT,
          MESSAGE_ID,
          LIMIT,
          OFFSET,
          SORT_ORDER,
          SORT_FIELDS,
          VIEW,
          FILTER);
    } catch (ApiException e) {
      throw new Error(e);
    }
  }
}
