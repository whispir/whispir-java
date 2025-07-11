# Whispir Java Library

<!-- x-release-please-start-version -->
[![Maven Central](https://img.shields.io/static/v1?label=maven-central&message=v1.1.4&color=blue)](https://mvnrepository.com/artifact/com.whispir/whispir-java)<!-- x-release-please-end -->
[![Build Status](https://github.com/whispir/whispir-java/actions/workflows/ci.yml/badge.svg)](https://github.com/whispir/whispir-java/actions?query=branch%3Amaster)

The Whispir Java library provides convenient access to the Whispir API from applications written in Java.

## Documentation
You can find the complete documentation of the Whispir API at [developers.whispir.com](https://developers.whispir.com/).

## Installation

### Requirements

- Java 1.8 or later

### Gradle users

Add this dependency to your project's build file:

<!-- x-release-please-start-version -->
```groovy
implementation "com.whispir:whispir-java:1.1.4"
```
<!-- x-release-please-end -->

### Maven users

Add this dependency to your project's POM:

<!-- x-release-please-start-version -->
```xml
<dependency>
  <groupId>com.whispir</groupId>
  <artifactId>whispir-java</artifactId>
  <version>1.1.4</version>
</dependency>
```
<!-- x-release-please-end -->

### Others

You'll need to manually install the following JARs:

<!-- x-release-please-start-version -->
- [The Whispir JAR](https://search.maven.org/remotecontent?filepath=com/whispir/whispir-java/1.1.4/whispir-java-1.1.4.jar)<!-- x-release-please-end -->
- [Google Gson](https://github.com/google/gson) from <https://repo1.maven.org/maven2/com/google/code/gson/gson/2.9.0/gson-2.9.0.jar>.

## Usage

The package needs to be configured with your account's username/password combination and API Key, which can be obtained by following the [Obtain an API Key](https://developers.whispir.com/2a21cad9e5da7-authentication#obtain-an-api-key) instructions.

WhispirExample.java

```java
import java.util.HashMap;
import java.util.Map;

import com.whispir.Whispir;
import com.whispir.exception.WhispirException;
import com.whispir.model.Message;
import com.whispir.api.RequestOptions;
import com.whispir.param.MessageCreateParams;

public class WhispirExample {

    public static void main(String[] args) {
        Whispir.username = "username...";
        Whispir.password = "password...";
        Whispir.apiKey = "apiKey...";

        MessageCreateParams params =
            MessageCreateParams
                .builder()
                .setTo("61400400400")
                .setSubject("My first message")
                .setBody("Hello from Whispir Java SDK!")
                .build();

        try {
            Message message = Message.create(params);
            System.out.println(message);
        } catch (WhispirException e) {
            e.printStackTrace();
        }
    }
}
```

## Examples

Visit the [examples](https://github.com/whispir/whispir-java/tree/main/examples) folder for a curated list of examples to help you get started quickly with Whispir.
