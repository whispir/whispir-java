/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whispir_wrapped_java;

import whispir_sdk_java.ApiClient;
import whispir_wrapped_java.MessageClient;
import org.openapitools.client.model.Message;

/**
 *
 * @author carlangeloorale
 */
public class Client {
    private static ApiClient initClient;
    private static String workspaceId;
    
    public static MessageClient ClientMessage;

    public Client (String API_URL, String USERNAME, String PASSWORD, String WORKSPACE_ID) {
        ApiClient client;
        client = new ApiClient();

        client.setBasePath(API_URL);
        client.setUsername(USERNAME);
        client.setPassword(PASSWORD);
        
        this.initClient = client;
        this.workspaceId =  WORKSPACE_ID;
    }
    
    public MessageClient MessageClient() {
        return new MessageClient(initClient, workspaceId);
    }
    
    
}
