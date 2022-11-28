package whispir_wrapped_java;
import org.openapitools.client.model.Message;

public class WrappedJava {
    public static void main(String[] args) {
        WhispirClient whispir = new WhispirClient(
            "https://api.au.whispir.com",
            "username",
            "password", 
            "workspace_id", 
            "apikey"
        );

        // Sending SMS Message
        String recipientPhoneNumber = "phone_number";
        String subject = "First Message";
        String body = "You have sent your first message from the Whispir SDK. Congrats!";


        MessageClient messages = whispir.messageClient();
        Message resp = messages.create(recipientPhoneNumber, subject, body);
        System.out.println("Send Message Response: " + resp);

    }
}
