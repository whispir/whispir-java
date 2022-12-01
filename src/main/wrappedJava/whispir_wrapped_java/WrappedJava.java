package whispir_wrapped_java;
import org.openapitools.client.model.Message;
import io.github.cdimascio.dotenv.Dotenv;
import whispir_sdk_java.ApiClient;
import whispir_sdk_java.ApiException;

import org.whispir.api.MessagesApi;
import whispir_sdk_java.param.MessageCreateParams;

public class WrappedJava {
    public static void main(String[] args) {
        String workspaceId = "74C38E61A371730D"; // A Space Odessey
        Dotenv dotenv = Dotenv.load();

        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(dotenv.get("API_URL"));
        apiClient.setApiKey(dotenv.get("API_KEY"));
        apiClient.setUsername(dotenv.get("WHISPIR_USERNAME"));
        apiClient.setPassword(dotenv.get("WHISPIR_PASSWORD"));


        MessageCreateParams params = new MessageCreateParams.Builder()
                                    .workspaceId(workspaceId)
                                    .to("123")
                                    .subject("subject")
                                    .body("message bod").build();

        Message payload = new Message();
        payload.to("61478107505");
        payload.subject("First Message");
        payload.body("You have sent your first message from the Whispir SDK. Congrats!");


        MessagesApi messages = new MessagesApi(apiClient);
        try {
            Message response = messages.create(params);
            // System.out.println(response.getHeaders().get("Location"));
        } catch (ApiException e) {
            System.err.println("Exception when calling Send SMS Message API");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
