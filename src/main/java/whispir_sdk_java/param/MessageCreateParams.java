package whispir_sdk_java.param;

import java.util.Map;

import whispir_sdk_java.ApiRequestParams;

/**
 * The remaining questions:
 *  - how do we deal with nested objects? 
 *      1. Email, Web, as examples
 *  - how do we incorporate other params that might be required as part of constructing the request? 
 *      1. header params (e.g. contentType, accept, x-api-key)
 *      2. query params (e.g workspaceId, limit, sortOrder, offset, sortFields)
 *      it seems like they have a different way of handling it by creating a new instance called "RequestOptions"
 *  - how do we deal with empty params?
 *  - we need to have an abstract class that has a convert() method to convert to a primitive Map<String, Object>
 */

public class MessageCreateParams extends ApiRequestParams {
    String workspaceId;
    String to;
    String subject;
    String body;

    private MessageCreateParams(Builder builder) {
        this.workspaceId = builder.workspaceId;
        this.to = builder.to;
        this.subject = builder.subject;
        this.body = builder.body;
    }

    public static class Builder {
        private String workspaceId;
        private String to;
        private String subject;
        private String body;

        public Builder(){
        }

        public Builder workspaceId(String workspaceId){
            this.workspaceId = workspaceId;
            return this;
        }

        public Builder to(String to){
            this.to = to;
            return this;
        }

        public Builder subject(String subject){
            this.subject = subject;
            return this;
        }

        public Builder body(String body){
            this.body = body;
            return this;
        }

        public MessageCreateParams build() {
            return new MessageCreateParams(this);
        }
    }
}

/*
 * 1. we have a builder which returns ApiParams type
 * 2. we need to convert it into Map<String, Object>
 * 3. we need to construct the Message object based from the params that were passed in
 *      - how do we map the param key so that we can construct the Message object accordingly?
 * as an example, ["body", "message-bod"] -> message.body("message-bod");
 */