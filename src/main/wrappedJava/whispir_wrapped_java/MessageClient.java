/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whispir_wrapped_java;

import org.openapitools.client.model.Message;
import org.whispir.api.MessagesApi;
import whispir_sdk_java.ApiClient;
import whispir_sdk_java.ApiException;

/**
 *
 * @author carlangeloorale
 */
public class MessageClient {

  static String USERNAME;
  private static String PASSWORD, API_URL, WORKSPACE_ID;
  private static final String CONTENT_TYPE =
    "application/vnd.whispir.message-v1+json";
  private static final String ACCEPT =
    "application/vnd.whispir.message-v1+json";

  public MessageClient(
    String username,
    String password,
    String apiUrl,
    String workspaceId
  ) {
    MessageClient.USERNAME = username;
    MessageClient.PASSWORD = password;
    MessageClient.API_URL = apiUrl;
    MessageClient.WORKSPACE_ID = workspaceId;
  }

  public static ApiClient createClient() {
    ApiClient client;
    client = new ApiClient();

    client.setBasePath(API_URL);
    client.setUsername(USERNAME);
    client.setPassword(PASSWORD);
    return client;
  }

  public static Message postMessage(Message MESSAGE, String API_KEY) {
    MessagesApi message = new MessagesApi(createClient());
    try {
      return message.postMessages(
        WORKSPACE_ID,
        API_KEY,
        CONTENT_TYPE,
        ACCEPT,
        MESSAGE
      );
    } catch (ApiException e) {
      throw new Error(e);
    }
  }
}
