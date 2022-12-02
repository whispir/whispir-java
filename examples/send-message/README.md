# Create a Contact and Send a Message

Use this example to create your first contact, and send a message to the new contact.

### Requirements

You’ll need the following:

- [Java](https://openjdk.org/) >= 1.8
- [Maven](https://maven.apache.org)

### Setup

Clone the repository:

```bash
git clone https://github.com/whispir/whispir-java.git
```

Move into the project's directory:

```bash
cd examples/send-message
```

Copy the environment variables file:

```bash
cp .env.example .env
```

Update `.env` with your own username, password, [Whispir API keys](https://developers.whispir.com/2a21cad9e5da7-authentication#obtain-an-api-key), and host (depending on your Whispir region).

### Usage

Update [WhispirSendMessage.java](src/main/java/com/whispir/WhispirSendMessage.java) with your mobile number. Then compile with Maven:

```bash
maven compile
```

and finally, run the code:


```bash
maven exec:java
```

You'll now see the message id in the CLI, which can be used for further querying on the message status. Congrats!
