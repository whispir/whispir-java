# Send & Retrieve a Message

Use this example to send a message with Whispir, using the [alias feature](https://developers.whispir.com/a86a51f617542-features#message-aliasing).

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
cd examples/send-message-with-alias
```

Copy the environment variables file:

```bash
cp .env.example .env
```

Update `.env` with your own username, password, [Whispir API key](https://developers.whispir.com/2a21cad9e5da7-authentication#obtain-an-api-key), and host (depending on your Whispir region).

### Usage

Update [WhispirSendMessageWithAlias.java](src/main/java/com/whispir/WhispirSendMessageWithAlias.java) with your mobile number. Then compile with Maven:

```bash
mvn compile
```

and finally, run the code:

```bash
mvn exec:java
```

You'll now see the message id in the CLI, which can be used for further querying on the message status. Congrats!
