package com.example;

import com.whispir.Whispir;
import com.whispir.api.MessagesApi;
import com.whispir.api.MessagesApi.MessageCreateParams;
import com.whispir.api.MessagesApi.MessageCreateParams.Features;
import com.whispir.api.MessagesApi.MessageCreateParams.Features.AliasOption;
import com.whispir.api.WorkspacesApi;
import com.whispir.api.WorkspacesApi.WorkspaceListParams;
import com.whispir.client.ApiException;
import com.whispir.model.Message;
import com.whispir.model.WorkspaceCollection;

import io.github.cdimascio.dotenv.Dotenv;

public class WhispirSendMessageWithAlias {
  public static void main(String[] args) {
    Dotenv dotenv = Dotenv.load();

    Whispir.username = dotenv.get("WHISPIR_USERNAME");
    Whispir.password = dotenv.get("WHISPIR_PASSWORD");
    Whispir.apiKey = dotenv.get("WHISPIR_API_KEY");
    Whispir.host = dotenv.get("WHISPIR_HOST");

    try {
      WorkspaceCollection collection = WorkspacesApi.list(new WorkspaceListParams.Builder().build());
      String defaultWorkspaceId = collection.getWorkspaces().get(0).getId();

      AliasOption alias = AliasOption
          .builder()
          .setAliasName("Newsletter")
          .build();

      Features features = Features.builder()
          .setAliasOption(alias)
          .build();

      MessageCreateParams messageParams = MessageCreateParams
          .builder()
          .setWorkspaceId(defaultWorkspaceId)
          .setFeatures(features)
          .setTo("61400400400")
          .setSubject("Hello there!")
          .setBody(String.format("Hello there! This was sent with the alias '%s', great stuff!",
              alias.getAliasName()))
          .build();

      Message message = MessagesApi.create(messageParams);

      System.out.println(message.getDocId());
    } catch (ApiException e) {
      e.printStackTrace();
    }
  }
}
