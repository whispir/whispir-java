/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whispir_wrapped_java;

import whispir_sdk_java.ApiClient;

/**
 *
 * @author carlangeloorale
 */
public class Client {

    private static ApiClient initClient;
    private static String workspaceId;

    public static MessageClient ClientMessage;

    public Client(String API_URL, String USERNAME, String PASSWORD, String WORKSPACE_ID) {
        ApiClient client;
        client = new ApiClient();

        client.setBasePath(API_URL);
        client.setUsername(USERNAME);
        client.setPassword(PASSWORD);

        initClient = client;
        workspaceId = WORKSPACE_ID;
    }

    public MessageClient messageClient() {
        return new MessageClient(initClient, workspaceId);
    }

    public ContactClient contactClient() {
        return new ContactClient(initClient, workspaceId);
    }

}
