package com.whispir;

import com.whispir.Whispir;
import com.whispir.model.UserCollection;
import com.whispir.api.UsersApi;
import com.whispir.api.UsersApi.UserListParams;
import com.whispir.client.ApiException;

import io.github.cdimascio.dotenv.Dotenv;

public class WhispirBasicAuth 
{
    public static void main( String[] args )
    {
        Dotenv dotenv = Dotenv.load();

        Whispir.username = dotenv.get("WHISPIR_USERNAME");
        Whispir.password = dotenv.get("WHISPIR_PASSWORD");
        Whispir.apiKey = dotenv.get("WHISPIR_API_KEY");
        Whispir.host = dotenv.get("WHISPIR_HOST");

        try {
            UserCollection result = UsersApi.list(new UserListParams.Builder().build());
            System.out.println(result);
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }
}
