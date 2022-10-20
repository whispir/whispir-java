import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openapitools.client.model.Message;
import whispir_sdk_java.ApiException;

class MessagesWrappedApiTest {

  private final MessagesWrappedApi messagesWrappedApi = new MessagesWrappedApi();

  @Test
  void sendMessageTest() throws ApiException {
    String workspaceId = null;
    String xApiKey = null;
    String contentType = null;
    String accept = null;
    Message message = null;

    Message response = messagesWrappedApi.sendMessage(
      workspaceId,
      xApiKey,
      contentType,
      accept,
      message
    );
  }
}
