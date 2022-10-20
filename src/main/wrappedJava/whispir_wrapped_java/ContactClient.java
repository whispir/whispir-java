/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whispir_wrapped_java;

import org.openapitools.client.model.Contact;
import org.whispir.api.ContactsApi;
import whispir_sdk_java.ApiClient;
import whispir_sdk_java.ApiException;

/**
 *
 * @author carlangeloorale
 */
public class ContactClient {
     private static String USERNAME, PASSWORD, API_URL, WORKSPACE_ID;
    private static final String CONTENT_TYPE = "application/vnd.whispir.contact-v1+json";
    private static final String ACCEPT = "application/vnd.whispir.contact-v1+json";
    
    public ContactClient (String username, String password, String apiUrl, String workspaceId) {
        ContactClient.USERNAME = username;
        ContactClient.PASSWORD = password;
        ContactClient.API_URL = apiUrl;
        ContactClient.WORKSPACE_ID = workspaceId;
    }
    
     public static ApiClient createClient() {
        ApiClient client;
        client = new ApiClient();


        client.setBasePath(API_URL);
        client.setUsername(USERNAME);
        client.setPassword(PASSWORD);
        return client;
    }
    
    public static Contact postContact(Contact Contact, String API_KEY) {
        ContactsApi contact = new ContactsApi(createClient());
        try {
           return contact.postContacts(WORKSPACE_ID, API_KEY, ACCEPT, CONTENT_TYPE, Contact);
        } catch (ApiException e) {
            throw new Error(e);
        }
    }
}
