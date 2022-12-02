# Using Bearer Authentication

Use this example to test your bearer authentication integration with the Whispir API. Bearer authentication can be useful for multi-tenanted use of the Whispir API.

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
cd examples/bearer-auth
```

Copy the environment variables file:

```bash
cp .env.example .env
```

Update `.env` with your own username, password, [Whispir API keys](https://developers.whispir.com/2a21cad9e5da7-authentication#obtain-an-api-key), and host (depending on your Whispir region).

### Install and run

Compile with Maven:

```bash
maven compile
```

and finally, run the code:


```bash
maven exec:java
```

You'll now see a list of your workspaces in the CLI. Congrats!
