package com.whispir.client;

import org.junit.jupiter.api.Disabled;

import com.whispir.client.ApiException;
// import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import com.whispir.Whispir;
import com.whispir.api.WorkspacesApi;
import com.whispir.api.WorkspacesApi.WorkspaceRetrieveParams;
import com.whispir.api.ContactsApi;
import com.whispir.api.MessagesApi;
import com.whispir.api.ContactsApi.ContactCreateParams;
import com.whispir.api.ContactsApi.ContactCreateParams.MessagingOption.ChannelEnum;
import com.whispir.api.MessagesApi.MessageCreateParams;
import com.whispir.api.WorkspacesApi.WorkspaceListParams;
// import com.whispir_java
import com.whispir.client.ApiClient;
import com.whispir.client.ApiException;
// import whispir_java.Client;
import com.whispir.client.Configuration;
import com.whispir.client.auth.*;
// import whispir_java.models.*;
// import com.whispir.api.*;
// import com.whispir.api.MessagesApi;
// import com.whispir.api.WorkspacesApi;
// import com.whispir.api.ContactsApi;
// import com.whispir.api.*;
// import com.whispir.client.models.*;
import com.whispir.model.*;
// @Disabled
public class ApiClientTest {

    @Test
    public void RunTest() throws ApiException {
        String workspaceId = "26E4E27F0360A8C9";
        Whispir.apiKey = "apiKeyMock";
        Whispir.username = "whispir_user";
        Whispir.password = "whispir_password";
        Whispir.host = "http://127.0.0.1:4010";
        try {
            WorkspaceListParams params = new WorkspaceListParams.Builder().build();
            WorkspaceCollection workspaces = WorkspacesApi.list(params);
            WorkspaceRetrieveParams getparams = new WorkspaceRetrieveParams.Builder()
            .setWorkspaceId("9EE1EBE2FBA5660B")
            .build();
            Workspace WORKSPACE = WorkspacesApi.retrieve(getparams);
            System.out.println(">>>>" + WORKSPACE);
            // Message response = MessagesApi.create(params2);
            // Contact response = ContactsApi.create(params);
            // System.out.println(response.lastResponse.getHeaders());
        } catch (ApiException e) {
            System.out.println("Exception when calling MessagesApi#getMessageById");
            // System.out.println("Status code: " + e.getCode());
            // System.out.println("Reason: " + e.getResponseBody());
            // System.out.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}