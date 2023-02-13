package com.whispir;

import com.whispir.model.Contact;
import com.whispir.model.Message;
import com.whispir.model.WorkspaceCollection;

import java.util.HashMap;
import java.util.Map;

import com.whispir.api.ContactsApi;
import com.whispir.api.MessagesApi;
import com.whispir.api.WorkspacesApi;
import com.whispir.api.ContactsApi.ContactCreateParams;
import com.whispir.api.MessagesApi.MessageCreateParams;
import com.whispir.api.WorkspacesApi.WorkspaceListParams;
import com.whispir.client.ApiException;

public class WhispirTest {
    public static void main(String args[]) {
        Whispir.host = "https://api.au.whispir.com";
        Whispir.username = "rfontein.au";
        Whispir.password = "JOu7wdLOW@O53&uK";
        Whispir.apiKey = "rln7ZWzWOt1s6uZieJuCs5pn5hieufH02mkVX7kI";

        // Map<String, Object> params = new HashMap<>();
        // params.put(
        // "body",
        // "Test Message");
        // params.put(
        // "subject",
        // "Test Message");
        // params.put(
        // "to",
        // "64221011663");
        // params.put(
        // "workspaceId",
        // "9A4C5521FFC7B15B");

        // MessageCreateParams params = new MessageCreateParams.Builder()
        // .setBody("Test Message")
        // .setSubject("testSubject")
        // .setWorkspaceId("9A4C5521FFC7B15B")
        // .setTo("64221011663")
        // .build();
        // try {
        // Message message = MessagesApi.create(params);
        // System.out.println(message);
        // } catch (ApiException e) {
        // System.out.println("Got here.");
        // System.out.println(e.getMessage());
        // // TODO: handle exception
        // }

        try {
            WorkspaceCollection response = WorkspacesApi.list(WorkspaceListParams.builder().build());
            String defaultWorkspaceId = response.getWorkspaces().get(0).getId();
            System.out.println(defaultWorkspaceId);

            ContactCreateParams contactParams = ContactCreateParams
                    .builder()
                    .setWorkspaceId(defaultWorkspaceId)
                    .setFirstName("Joe")
                    .setLastName("Bloggs")
                    .setWorkMobilePhone1("64221011663")
                    .setWorkEmailAddress1("joe@bloggs.com")
                    .setWorkCountry("New Zealand")
                    .setTimezone("Pacific/Auckland")
                    .build();

            Contact contact = ContactsApi.create(contactParams);

            System.out.println(contact.getMri());

            MessageCreateParams messageParams = MessageCreateParams
                    .builder()
                    .setWorkspaceId(defaultWorkspaceId)
                    .setTo(contact.getWorkMobilePhone1())
                    .setSubject("Welcome!")
                    .setBody(String.format("Hello %s, I hear you're from %s!", contact.getFirstName(),
                            contact.getWorkCountry()))
                    .build();

            Message message = MessagesApi.create(messageParams);

            System.out.println(message.lastResponse);
            System.out.println(message);
            // System.out.println(message.getDocId());
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }
}
