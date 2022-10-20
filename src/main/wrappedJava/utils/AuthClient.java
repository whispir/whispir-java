import io.github.cdimascio.dotenv.Dotenv;
import whispir_sdk_java.ApiClient;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carlangeloorale
 */
public class AuthClient {

    public static ApiClient createClient() {
        ApiClient client;
        client = new ApiClient();
        Dotenv dotenv = Dotenv.load();

        String API_URL = dotenv.get("API_URL");

        client.setBasePath(API_URL);
        client.setUsername(dotenv.get("WHISPIR_USERNAME"));
        client.setPassword(dotenv.get("WHISPIR_PASSWORD"));
        return client;
    }
}
