package com.whispir.client;

import com.google.gson.reflect.TypeToken;
import com.whispir.model.Message;
import com.whispir.model.Workspace;
import com.whispir.model.WorkspaceCollection;
import okhttp3.*;
import org.junit.jupiter.api.Test;
import com.whispir.Whispir;
import com.whispir.api.WorkspacesApi;
import com.whispir.api.WorkspacesApi.WorkspaceRetrieveParams;
import com.whispir.api.WorkspacesApi.WorkspaceListParams;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
            System.out.println("Workspace found:" + WORKSPACE);

        } catch (ApiException e) {
            System.out.println("Exception when calling WorkspacesApi#retrieve");
            e.printStackTrace();
        }
    }

    @Test
    public void testDeserialize_shouldNotLogErrorForNonJsonResponse() throws ApiException {
        ApiClient apiClient = new ApiClient();

        Response response = createMockResponse("http://localhost:4010/api/v1/workspaces", 200,
                "some text non json response", Objects.requireNonNull(MediaType.parse("application/vnd.whispir.message-v1+json")));

        Message deserialized = apiClient.deserialize(response,  new TypeToken<Message>(){}.getType());
        assertEquals("some text non json response", deserialized.getRawOutput());
    }


    private Response createMockResponse(String url, int code, String bodyContent, MediaType mediaType) {
        return new Response.Builder()
                .request(new Request.Builder().url(url).build())
                .addHeader("Content-Type", mediaType.toString())
                .protocol(Protocol.HTTP_1_1)
                .code(code)
                .message("OK")
                .body(ResponseBody.create(
                        bodyContent,
                        mediaType
                ))
                .build();
    }

}