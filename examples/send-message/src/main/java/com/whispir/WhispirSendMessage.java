package com.whispir;

import com.whispir.Whispir;
import com.whispir.model.Workspace;
import com.whispir.model.WorkspaceCollection;
import com.whispir.model.Contact;
import com.whispir.param.ContactCreateParams;
import com.whispir.model.Message;
import com.whispir.param.MessageCreateParams;
import com.whispir.param.MessageRetrieveParams;

import io.github.cdimascio.dotenv.Dotenv;

public class WhispirSendMessage
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

            Contact contact = Contact.create(contactParams);

            MessageCreateParams messageParams = MessageCreateParams
                .builder()
                .setWorkspaceId(defaultWorkspaceId)
                .setTo(contact.getMri())
                .setSubject("Welcome!")
                .setBody(String.format("Hello %s, I hear you're from %s!", contact.getFirstName(), contact.getWorkCountry()))
                .build();

            Message message = Message.create(messageParams);

            System.out.println(message.getId());
        } catch (WhispirException e) {
            e.printStackTrace();
        }
    }
}
