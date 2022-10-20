
import io.github.cdimascio.dotenv.Dotenv;
import org.whispir.api.MessagesApi;
import org.openapitools.client.model.Message;
import whispir_sdk_java.utils.AuthClient;
import whispir_sdk_java.utils.WrapperInit;

public class MessagesWrappedApi {

    public static WrapperInit wrapperInit() {
        WrapperInit wrapper = new WrapperInit();
        Dotenv dotenv = Dotenv.load();
        wrapper.setInitValues(dotenv.get("API_KEY"),
                "application/vnd.whispir.auth-v1+json",
                "application/vnd.whispir.auth-v1+json");

        return wrapper;
    }

    public static Message sendMessage(String WORKSPACE_ID, Message MESSAGE) {
        WrapperInit wrapper = wrapperInit();

        MessagesApi messageApi = new MessagesApi(AuthClient.createClient());

        try {
            return messageApi.postMessages(WORKSPACE_ID, 
                wrapper.getApiKey(), 
                wrapper.getContentType(), 
                wrapper.getAccept(), 
                MESSAGE);
        } catch (Exception e) {
            throw new Error(e);
        }
    }
}
