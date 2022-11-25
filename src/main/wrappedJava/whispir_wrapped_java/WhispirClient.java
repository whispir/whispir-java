/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whispir_wrapped_java;

import java.util.Map;

import whispir_sdk_java.ApiClient;
import whispir_sdk_java.auth.ApiKeyAuth;

/**
 *
 * @author carlangeloorale
 */
public class WhispirClient {

    private static ApiClient initClient;
    private static String workspaceId;
    private static String apiKey;

    public static MessageClient ClientMessage;

    public WhispirClient(String API_URL, String USERNAME, String PASSWORD, String WORKSPACE_ID, String API_KEY) {
        ApiClient client;
        
        client = new ApiClient();

        client.setBasePath(API_URL);
        client.setUsername(USERNAME);
        client.setPassword(PASSWORD);
        client.setApiKey(API_KEY);

        System.out.println(client);
        
        ApiKeyAuth auth = (ApiKeyAuth) client.getAuthentication("ApiKeyAuth");

        initClient = client;
        workspaceId = WORKSPACE_ID;
        apiKey = auth.getApiKey();
    }

    public MessageClient messageClient() {
        return new MessageClient(initClient, workspaceId, apiKey);
    }

    public ContactClient contactClient() {
        return new ContactClient(initClient, workspaceId);
    }



}
