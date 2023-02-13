package com.whispir;

import com.whispir.Whispir;
import com.whispir.model.Message;
import com.whispir.model.WorkspaceCollection;
import com.whispir.api.MessagesApi;
import com.whispir.api.MessagesApi.MessageCreateParams;
import com.whispir.api.MessagesApi.MessageRetrieveParams;
import com.whispir.api.WorkspacesApi;
import com.whispir.api.WorkspacesApi.WorkspaceListParams;
import com.whispir.client.ApiException;

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
            WorkspaceCollection response = WorkspacesApi.list(new WorkspaceListParams.Builder().build());
            String defaultWorkspaceId = response.getWorkspaces().get(0).getId();

            MessageCreateParams createParams = MessageCreateParams
                .builder()
                .setWorkspaceId(defaultWorkspaceId)
                .setTo("61400400400")
                .setSubject("Hello & Welcome!")
                .setBody("Your first message from the Whispir Java SDK. Congrats!")
                .build();

            Message message = MessagesApi.create(createParams);

            MessageRetrieveParams retrieveParams = MessageRetrieveParams
                .builder()
                .setWorkspaceId(defaultWorkspaceId)
                .setMessageId(message.getDocId())
                .build();

            Message retrievedMessage = MessagesApi.retrieve(retrieveParams);

            System.out.println(retrievedMessage);
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }
}
