package whispir_sdk_java;

import org.whispir.api.AuthApi;
import org.whispir.api.MessagesApi;
import org.whispir.api.ContactsApi;
import org.openapitools.client.model.PostAuth200Response;
import org.openapitools.client.model.Message;
import org.openapitools.client.model.Contact;

import io.github.cdimascio.dotenv.Dotenv;

/**
 *
 * @author carlangeloorale
 */
public class CreateContactAndSaveMessage {

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

    public static void createContact(String firstName, String lastName, String workPhoneNumber, String workEmail,
           String country, String timezone, String contentType, String accept) {
        ApiClient client = createClient();
        // initialize createContact API
        ContactsApi contactsApi = new ContactsApi(client);
        Contact contact = new Contact();
        Dotenv dotenv = Dotenv.load();
        ContactReturn contReturn = new ContactReturn();

        contact.firstName(firstName);
        contact.lastName(lastName);
        contact.workMobilePhone1(workPhoneNumber);
        contact.workEmailAddress1(workEmail);
        contact.workCountry(country);
        contact.timezone(timezone);

        try {

            Contact response = contactsApi.postContacts(
                    dotenv.get("WORKSPACE_ID"),
                    dotenv.get("API_KEY"),
                     contentType,
                    accept,
                    contact);

            System.out.println(response);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void sendMessage(String subject, String body, String contentType, String accept) {
        ApiClient client = createClient();

        MessagesApi messageApi = new MessagesApi(client);
        Message message = new Message();
        ContactReturn contact = new ContactReturn();
        Dotenv dotenv = Dotenv.load();

        message.to(contact.getContactId());
        message.subject(subject);
        message.body(body);

        try {

            Message response = messageApi.postMessages(
                    dotenv.get("WORKSPACE_ID"),
                    dotenv.get("API_KEY"),
                    contentType,
                    accept,
                    message);

            System.out.println(response);
        } catch (Exception e) {

            System.out.println(e);
        }

    }

}
