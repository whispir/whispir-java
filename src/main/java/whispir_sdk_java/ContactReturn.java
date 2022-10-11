package whispir_sdk_java;

import org.openapitools.client.model.Contact;

/**
 *
 * @author carlangeloorale
 */
public class ContactReturn {
    private String contactId;

    public String getContactId() {
        return contactId;
    }

    public void setContactId(Contact contactResponse) {
        this.contactId = contactResponse.getWorkAddress1();
    }

}
