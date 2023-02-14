package com.example;

import com.whispir.Whispir;
import com.whispir.model.Contact;
import com.whispir.model.Message;
import com.whispir.model.WorkspaceCollection;
import com.whispir.api.ContactsApi;
import com.whispir.api.MessagesApi;
import com.whispir.api.MessagesApi.MessageCreateParams;
import com.whispir.api.WorkspacesApi;
import com.whispir.api.ContactsApi.ContactCreateParams;
import com.whispir.api.WorkspacesApi.WorkspaceListParams;
import com.whispir.client.ApiException;

import io.github.cdimascio.dotenv.Dotenv;

public class WhispirSendMessage {
    public static void main(String[] args) {
        Dotenv dotenv = Dotenv.load();

        Whispir.username = dotenv.get("WHISPIR_USERNAME");
        Whispir.password = dotenv.get("WHISPIR_PASSWORD");
        Whispir.apiKey = dotenv.get("WHISPIR_API_KEY");
        Whispir.host = dotenv.get("WHISPIR_HOST");

        try {
            WorkspaceCollection response = WorkspacesApi.list(new WorkspaceListParams.Builder().build());
            String defaultWorkspaceId = response.getWorkspaces().get(0).getId();

            ContactCreateParams contactParams = ContactCreateParams
                    .builder()
                    .setWorkspaceId(defaultWorkspaceId)
                    .setFirstName("Joe")
                    .setLastName("Bloggs")
                    .setWorkMobilePhone1("61400400400")
                    .setWorkEmailAddress1("joe@bloggs.com")
                    .setWorkCountry("Australia")
                    .setTimezone("Australia/Melbourne")
                    .build();

            Contact contact = ContactsApi.create(contactParams);

            MessageCreateParams messageParams = MessageCreateParams
                    .builder()
                    .setWorkspaceId(defaultWorkspaceId)
                    .setTo(contact.getWorkMobilePhone1())
                    .setSubject("Welcome!")
                    .setBody(String.format("Hello %s, I hear you're from %s!", contact.getFirstName(),
                            contact.getWorkCountry()))
                    .build();

            Message message = MessagesApi.create(messageParams);

            System.out.println(message.getDocId());
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }
}
