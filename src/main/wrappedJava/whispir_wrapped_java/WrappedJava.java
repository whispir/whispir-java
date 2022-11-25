package whispir_wrapped_java;

import org.openapitools.client.model.Message;

public class WrappedJava {
    public static void main(String[] args) {
        WhispirClient whispir = new WhispirClient(
            "https://us.whispir.com/api",
            "harry-utomo",
            "Whispir2018", 
            "BF50852D786D1F03", 
            "FrBGWsVK9Y3OmUBHyPDXc3fB0i830jgp5r0FOEV0"
        );

        Message message = new Message();
        message.to("61478107505");
        message.body("Congrats, this message was sent from whispir-java-sdk");
        message.subject("Sent from whispir java SDK");
        whispir.messageClient();
        Message response = MessageClient.postMessage(message);
        System.out.println(response);
    }
}
