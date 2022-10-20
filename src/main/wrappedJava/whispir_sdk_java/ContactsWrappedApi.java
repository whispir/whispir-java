import org.openapitools.client.model.Contact;
import org.whispir.api.ContactsApi;
import whispir_sdk_java.utils.AuthClient;
import whispir_sdk_java.utils.WrapperInit;

public class ContactsWrappedApi {

  public static WrapperInit wrapperInit() {
    WrapperInit wrapper = new WrapperInit();
    Dotenv dotenv = Dotenv.load();
    wrapper.setInitValues(
      dotenv.get("API_KEY"),
      "application/vnd.whispir.auth-v1+json",
      "application/vnd.whispir.auth-v1+json"
    );

    return wrapper;
  }

  public static Contact createContact(String WORKSPACE_ID, Contact CONTACT) {
    WrapperInit wrapper = wrapperInit();

    ContactsApi contactsApi = new ContactsApi(AuthClient.createClient());

    try {
      return contactsApi.postContacts(
        WORKSPACE_ID,
        wrapper.getApiKey(),
        wrapper.getAccept(),
        wrapper.getContentType(),
        CONTACT
      );
    } catch (Exception e) {
      throw new Error(e);
    }
  }

  public static Contact listContacts(
    String WORKSPACE_ID,
    BigDecimal LIMIT,
    BigDecimal OFFSET,
    String SORT_ORDER,
    String SORT_FIELDS,
    String FIELD_NAME,
    Boolean CUSTOM_FIELDS
  ) {
    WrapperInit wrapper = wrapperInit();

    ContactsApi contactsApi = new ContactsApi(AuthClient.createClient());

    try {
      return contactsApi.getContacts(
        WORKSPACE_ID,
        wrapper.getApiKey(),
        wrapper.getAccept(),
        LIMIT,
        OFFSET,
        SORT_ORDER,
        SORT_FIELDS,
        FIELD_NAME,
        CUSTOM_FIELDS
      );
    } catch (Exception e) {
      throw new Error(e);
    }
  }

  public static Contact retrieveContact(
    String WORKSPACE_ID,
    String CONTACT_ID,
    String FIELDS,
    String SORT_ORDER,
    String SORT_FIELDS
  ) {
    WrapperInit wrapper = wrapperInit();

    ContactsApi contactsApi = new ContactsApi(AuthClient.createClient());

    try {
      return contactsApi.getContactsById(
        WORKSPACE_ID,
        wrapper.getApiKey(),
        CONTACT_ID,
        wrapper.getAccept(),
        FIELDS,
        SORT_ORDER,
        SORT_FIELDS
      );
    } catch (Exception e) {
      throw new Error(e);
    }
  }

  public static Contact updateContact(
    String WORKSPACE_ID,
    String CONTACT_ID,
    Contact CONTACT
  ) {
    WrapperInit wrapper = wrapperInit();

    ContactsApi contactsApi = new ContactsApi(AuthClient.createClient());

    try {
      return contactsApi.putContactsById(
        WORKSPACE_ID,
        wrapper.getApiKey(),
        CONTACT_ID,
        wrapper.getAccept(),
        wrapper.getContentType(),
        CONTACT
      );
    } catch (Exception e) {
      throw new Error(e);
    }
  }

  public static Contact deleteContact(
    String WORKSPACE_ID,
    String CONTACT_ID,
    String ACTION
  ) {
    WrapperInit wrapper = wrapperInit();

    ContactsApi contactsApi = new ContactsApi(AuthClient.createClient());

    try {
      return contactsApi.deleteContactsById(
        WORKSPACE_ID,
        wrapper.getApiKey(),
        CONTACT_ID,
        ACTION
      );
    } catch (Exception e) {
      throw new Error(e);
    }
  }
}
