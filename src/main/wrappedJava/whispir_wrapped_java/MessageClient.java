/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whispir_wrapped_java;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.openapitools.client.model.Message;
import org.whispir.api.MessagesApi;
import whispir_sdk_java.ApiClient;
import whispir_sdk_java.ApiException;

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
     this.apiClientInit = client;
     this.WORKSPACE_ID = workspaceId;
  }

  public static Message postMessage(Message MESSAGE, String API_KEY) {
    MessagesApi message = new MessagesApi(apiClientInit);
    Calendar calendar = Calendar.getInstance();
    SimpleDateFormat dateFor = new SimpleDateFormat("dd/MM/YYYY HH:mm");
    calendar.add(Calendar.DAY_OF_WEEK, 1);

      if(MESSAGE.getMessageType() == null || MESSAGE.getScheduleType() == null || MESSAGE.getScheduleDate() == null) {
        MESSAGE.messageType(Message.MessageTypeEnum.SCHEDULED);
        MESSAGE.scheduleType(Message.ScheduleTypeEnum.ONCE);
        MESSAGE.scheduleDate(dateFor.format(calendar.getTime()));
      }
      
    try {
      return message.postMessages(WORKSPACE_ID, API_KEY, CONTENT_TYPE, ACCEPT, MESSAGE);
    } catch (ApiException e) {
      throw new Error(e);
    }
  }

}
