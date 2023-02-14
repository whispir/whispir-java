# Send & Retrieve a Message

Use this example to send your first message with Whispir and retrieve details of the message.

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
cd examples/get-message
```

Copy the environment variables file:

```bash
cp .env.example .env
```

Update `.env` with your own username, password, [Whispir API key](https://developers.whispir.com/2a21cad9e5da7-authentication#obtain-an-api-key), and host (depending on your Whispir region).

### Usage

Update [WhispirGetMessage.java](src/main/java/com/whispir/WhispirGetMessage.java) with your mobile number. Then compile with Maven:

```bash
mvn compile
```

and finally, run the code:


```bash
mvn exec:java
```

You'll now see a summary of your sent message in the CLI. Congrats!
