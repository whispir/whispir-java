package com.whispir;

import com.whispir.Whispir;
import com.whispir.exception.WhispirException;
import com.whispir.model.Workspace;
import com.whispir.model.WorkspaceCollection;
import com.whispir.model.Messages;
import com.whispir.param.MessageCreateParams;
import com.whispir.param.MessageRetrieveParams;

import io.github.cdimascio.dotenv.Dotenv;

public class WhispirGetMessage 
{
    public static void main( String[] args )
    {
        Dotenv dotenv = Dotenv.load();

        Whispir.username = dotenv.get("WHISPIR_USERNAME");
        Whispir.password = dotenv.get("WHISPIR_PASSWORD");
        Whispir.apiKey = dotenv.get("WHISPIR_API_KEY");
        Whispir.host = dotenv.get("WHISPIR_HOST");

        try {
            WorkspaceCollection response = Workspace.list();
            Integer defaultWorkspaceId = response.getWorkspaces().get(0).getId();

            MessageCreateParams createParams = MessageCreateParams
                .builder()
                .setWorkspaceId(defaultWorkspaceId)
                .setTo("61400400400")
                .setSubject("Hello & Welcome!")
                .setBody("Your first message from the Whispir Java SDK. Congrats!")
                .build();

            Message message = Message.create(createParams);

            MessageRetrieveParams retrieveParams = MessageRetrieveParams
                .builder()
                .setId(message.getId())
                .build();

            Message retrievedMessage = Message.retrieve(retrieveParams);

            System.out.println(retrievedMessage);
        } catch (WhispirException e) {
            e.printStackTrace();
        }
    }
}
