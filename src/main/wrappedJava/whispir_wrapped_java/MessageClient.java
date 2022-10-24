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
import whispir_sdk_java.ApiClient;
import whispir_sdk_java.ApiException;
import whispir_wrapped_java.Client;

/**
 *
 * @author carlangeloorale
 */
public class MessageClient {

  private static String WORKSPACE_ID;
  private static final String CONTENT_TYPE = "application/vnd.whispir.message-v1+json";
  private static final String ACCEPT = "application/vnd.whispir.message-v1+json";
  private static ApiClient apiClientInit;

  public MessageClient(ApiClient client, String workspaceId) {
    apiClientInit = client;
    WORKSPACE_ID = workspaceId;
  }

  public static Message postMessage(Message MESSAGE, String API_KEY) {
    MessagesApi message = new MessagesApi(apiClientInit);
    Calendar calendar = Calendar.getInstance();
    SimpleDateFormat dateFor = new SimpleDateFormat("dd/MM/YYYY HH:mm");
    calendar.add(Calendar.DAY_OF_WEEK, 1);

    if (MESSAGE.getMessageType() == null || MESSAGE.getScheduleType() == null || MESSAGE.getScheduleDate() == null) {

      MESSAGE.messageType(Message.MessageTypeEnum.SCHEDULED);
      MESSAGE.scheduleType(Message.ScheduleTypeEnum.ONCE);
      MESSAGE.scheduleDate(dateFor.format(calendar.getTime()));
    }

    try {
      return message.postMessages(
          WORKSPACE_ID,
          API_KEY,
          CONTENT_TYPE,
          ACCEPT,
          MESSAGE);
    } catch (ApiException e) {
      throw new Error(e);
    }
  }

  public static GetMessages200Response listMessages(
      String API_KEY,
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

  public static Message retrieveMessage(String API_KEY, String MESSAGE_ID) {
    MessagesApi message = new MessagesApi(apiClientInit);
    try {
      return message.getMessageById(WORKSPACE_ID, API_KEY, ACCEPT, MESSAGE_ID);
    } catch (ApiException e) {
      throw new Error(e);
    }
  }

  public static MessageStatus retrieveMessageStatus(
      String API_KEY,
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
      String API_KEY,
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
