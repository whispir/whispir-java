package com.whispir;

import com.whispir.Whispir;
import com.whispir.exception.WhispirException;
import com.whispir.model.Auth;
import com.whispir.model.User;
import com.whispir.model.UserCollection;

import io.github.cdimascio.dotenv.Dotenv;

public class WhispirBearerAuth 
{
    public static void main( String[] args )
    {
        Dotenv dotenv = Dotenv.load();

        Whispir.username = dotenv.get("WHISPIR_USERNAME");
        Whispir.password = dotenv.get("WHISPIR_PASSWORD");
        Whispir.apiKey = dotenv.get("WHISPIR_API_KEY");
        Whispir.host = dotenv.get("WHISPIR_HOST");

        try {
            Auth auth = Auth.create();

            Whispir.username = null;
            Whispir.password = null;
            Whispir.accessToken = auth.getToken();

            UserCollection result = User.list();
            System.out.println(result);
        } catch (WhispirException e) {
            e.printStackTrace();
        }
    }
}
