//import io.github.cdimascio.dotenv.Dotenv;
//import java.math.BigDecimal;
//import org.openapitools.client.model.Message;
//import org.whispir.api.MessagesApi;
//import whispir_sdk_java.utils.AuthClient;
//import whispir_sdk_java.utils.WrapperInit;

public class MessagesWrappedApi {

//  public static WrapperInit wrapperInit() {
//    WrapperInit wrapper = new WrapperInit();
//    Dotenv dotenv = Dotenv.load();
//    wrapper.setInitValues(
//      dotenv.get("API_KEY"),
//      "application/vnd.whispir.auth-v1+json",
//      "application/vnd.whispir.auth-v1+json"
//    );
//
//    return wrapper;
//  }
//
//  public static Message sendMessage(String WORKSPACE_ID, Message MESSAGE) {
//    WrapperInit wrapper = wrapperInit();
//
//    MessagesApi messageApi = new MessagesApi(AuthClient.createClient());
//
//    try {
//      return messageApi.postMessages(
//        WORKSPACE_ID,
//        wrapper.getApiKey(),
//        wrapper.getContentType(),
//        wrapper.getAccept(),
//        MESSAGE
//      );
//    } catch (Exception e) {
//      throw new Error(e);
//    }
//  }
//
//  public static Message listMessages(
//    String WORKSPACE_ID,
//    BigDecimal LIMIT,
//    BigDecimal OFFSET,
//    String SORT_ORDER,
//    String SORT_FIELDS
//  ) {
//    WrapperInit wrapper = wrapperInit();
//
//    MessagesApi messageApi = new MessagesApi(AuthClient.createClient());
//
//    try {
//      return messageApi.getMessages(
//        WORKSPACE_ID,
//        wrapper.getApiKey(),
//        wrapper.getAccept(),
//        LIMIT,
//        OFFSET,
//        SORT_ORDER,
//        SORT_FIELDS
//      );
//    } catch (Exception e) {
//      throw new Error(e);
//    }
//  }
//
//  public static Message retrieveMessage(
//    String WORKSPACE_ID,
//    String MESSAGE_ID
//  ) {
//    WrapperInit wrapper = wrapperInit();
//
//    MessagesApi messageApi = new MessagesApi(AuthClient.createClient());
//
//    try {
//      return messageApi.getMessageById(
//        WORKSPACE_ID,
//        wrapper.getApiKey(),
//        wrapper.getAccept(),
//        MESSAGE_ID
//      );
//    } catch (Exception e) {
//      throw new Error(e);
//    }
//  }
//
//  public static Message retrieveMessageStatus(
//    String WORKSPACE_ID,
//    String MESSAGE_ID,
//    BigDecimal LIMIT,
//    BigDecimal OFFSET,
//    String SORT_ORDER,
//    String SORT_FIELDS,
//    String VIEW,
//    String FILTER
//  ) {
//    WrapperInit wrapper = wrapperInit();
//
//    MessagesApi messageApi = new MessagesApi(AuthClient.createClient());
//
//    try {
//      return messageApi.getMessageStatus(
//        WORKSPACE_ID,
//        wrapper.getApiKey(),
//        wrapper.getAccept(),
//        MESSAGE_ID,
//        LIMIT,
//        OFFSET,
//        SORT_ORDER,
//        SORT_FIELDS,
//        VIEW,
//        FILTER
//      );
//    } catch (Exception e) {
//      throw new Error(e);
//    }
//  }
//
//  public static Message retrieveMessageResponse(
//    String WORKSPACE_ID,
//    String MESSAGE_ID,
//    BigDecimal LIMIT,
//    BigDecimal OFFSET,
//    String SORT_ORDER,
//    String SORT_FIELDS,
//    String VIEW,
//    String FILTER
//  ) {
//    WrapperInit wrapper = wrapperInit();
//
//    MessagesApi messageApi = new MessagesApi(AuthClient.createClient());
//
//    try {
//      return messageApi.getMessageResponsesById(
//        WORKSPACE_ID,
//        wrapper.getApiKey(),
//        wrapper.getAccept(),
//        MESSAGE_ID,
//        LIMIT,
//        OFFSET,
//        SORT_ORDER,
//        SORT_FIELDS,
//        VIEW,
//        FILTER
//      );
//    } catch (Exception e) {
//      throw new Error(e);
//    }
//  }
}
