/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whispir_wrapped_java;

import java.math.BigDecimal;
import org.openapitools.client.model.Contact;
import org.openapitools.client.model.GetContacts200Response;
import org.whispir.api.ContactsApi;
import whispir_sdk_java.ApiClient;
import whispir_sdk_java.ApiException;

/**
 *
 * @author carlangeloorale
 */
public class ContactClient {

  private static String USERNAME, PASSWORD, API_URL, WORKSPACE_ID;
  private static final String CONTENT_TYPE =
    "application/vnd.whispir.contact-v1+json";
  private static final String ACCEPT =
    "application/vnd.whispir.contact-v1+json";

  public ContactClient(
    String username,
    String password,
    String apiUrl,
    String workspaceId
  ) {
    ContactClient.USERNAME = username;
    ContactClient.PASSWORD = password;
    ContactClient.API_URL = apiUrl;
    ContactClient.WORKSPACE_ID = workspaceId;
  }

  public static ApiClient createClient() {
    ApiClient client;
    client = new ApiClient();

    client.setBasePath(API_URL);
    client.setUsername(USERNAME);
    client.setPassword(PASSWORD);
    return client;
  }

  public static Contact createContact(Contact CONTACT, String API_KEY) {
    ContactsApi contact = new ContactsApi(createClient());
    try {
      return contact.postContacts(
        WORKSPACE_ID,
        API_KEY,
        ACCEPT,
        CONTENT_TYPE,
        CONTACT
      );
    } catch (ApiException e) {
      throw new Error(e);
    }
  }

  public static GetContacts200Response listContacts(
    String API_KEY,
    BigDecimal LIMIT,
    BigDecimal OFFSET,
    String SORT_ORDER,
    String SORT_FIELDS,
    String FIELD_NAME,
    Boolean CUSTOM_FIELDS
  ) {
    ContactsApi contact = new ContactsApi(createClient());
    try {
      return contact.getContacts(
        WORKSPACE_ID,
        API_KEY,
        ACCEPT,
        LIMIT,
        OFFSET,
        SORT_ORDER,
        SORT_FIELDS,
        FIELD_NAME,
        CUSTOM_FIELDS
      );
    } catch (ApiException e) {
      throw new Error(e);
    }
  }

  public static void retrieveContact(
    String API_KEY,
    String CONTACT_ID,
    String FIELDS,
    String SORT_ORDER,
    String SORT_FIELDS
  ) {
    ContactsApi contact = new ContactsApi(createClient());
    try {
      contact.getContactsById(
        WORKSPACE_ID,
        API_KEY,
        CONTACT_ID,
        ACCEPT,
        FIELDS,
        SORT_ORDER,
        SORT_FIELDS
      );
    } catch (ApiException e) {
      throw new Error(e);
    }
  }

  public static void updateContact(
    String API_KEY,
    String CONTACT_ID,
    Contact CONTACT
  ) {
    ContactsApi contact = new ContactsApi(createClient());
    try {
      contact.putContactsById(
        WORKSPACE_ID,
        API_KEY,
        CONTACT_ID,
        ACCEPT,
        CONTENT_TYPE,
        CONTACT
      );
    } catch (ApiException e) {
      throw new Error(e);
    }
  }

  public static void deleteContact(
    String API_KEY,
    String CONTACT_ID,
    String ACTION
  ) {
    ContactsApi contact = new ContactsApi(createClient());
    try {
      contact.deleteContactsById(WORKSPACE_ID, API_KEY, CONTACT_ID, ACTION);
    } catch (ApiException e) {
      throw new Error(e);
    }
  }
}
