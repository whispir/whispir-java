# **CreateContactAndSendMessage**
Create Contact function

```java
CreateContactAndSaveMessage createContactAndSendMessage = new CreateContactAndSaveMessage()

createContactAndSendMessage.createContact(
    firstName, 
    lastName, 
    workPhoneNumber, 
    workEmail, 
    country, 
    timezone
    );
```
Send Message To Created Contact

```java
CreateContactAndSaveMessage createContactAndSendMessage = new CreateContactAndSaveMessage()

createContactAndSendMessage.sendMessage(subject, body);
```

### Example
```java
// Import classes:
import org.whispir.api.CreateContactAndSaveMessage;

public class Example {
  public static void main(String[] args) {
    CreateContactAndSaveMessage createContactAndSendMessage = new CreateContactAndSaveMessage()

    // Creates new Contact
    createContactAndSendMessage.createContact(
    firstName, 
    lastName, 
    workPhoneNumber, 
    workEmail, 
    country, 
    timezone
    );

    // Composes and Sends Message to a Contact
    createContactAndSendMessage.sendMessage(subject, body);
  }
}
```

## Parameters
### Create Contact

| Name | Type | Description  | 
|------------- | ------------- | ------------- | 
| **firstName** | **String**| The First Name of Contact. | 
| **lastName** | **String**|  The Last Name of Contact. | 
| **workPhoneNumber** | **String**| Phone Number of Contact. | 
| **workEmail** | **String**| Email Address of Contact. | 
| **country** | **String**| Country Where Contact Resides. |
| **timezone** | **String**| Timezone of Contact. | 

### Send Message

| Name | Type | Description  | 
|------------- | ------------- | ------------- | 
| **subject** | **String**| Subject of Message. | 
| **body** | **String**|  Body of Message. | 