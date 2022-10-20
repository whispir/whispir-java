//import org.openapitools.client.model.ResponseRule;
//import org.whispir.api.ResponseRulesApi;
//import whispir_sdk_java.utils.AuthClient;
//import whispir_sdk_java.utils.WrapperInit;

public class ResponseRulesWrappedApi {

//  public static WrapperInit wrapperInit() {
//    WrapperInit wrapper = new WrapperInit();
//    Dotenv dotenv = Dotenv.load();
//    wrapper.setInitValues(
//      dotenv.get("API_KEY"),
//      "application/vnd.whispir.auth-v1+json",
//      "application/vnd.whispir.auth-v1+json"
//    );
//
//    return wrapper;
//  }
//
//  public static ResponseRule createResponseRule(
//    String WORKSPACE_ID,
//    ResponseRule RESPONSE_RULE
//  ) {
//    WrapperInit wrapper = wrapperInit();
//
//    ResponseRulesApi responseRulesApi = new ResponseRulesApi(
//      AuthClient.createClient()
//    );
//
//    try {
//      return responseRulesApi.postResponseRules(
//        WORKSPACE_ID,
//        wrapper.getApiKey(),
//        wrapper.getContentType(),
//        wrapper.getAccept(),
//        RESPONSE_RULE
//      );
//    } catch (Exception e) {
//      throw new Error(e);
//    }
//  }
//
//  public static ResponseRule listResponseRules(
//    String WORKSPACE_ID,
//    BigDecimal LIMIT,
//    BigDecimal OFFSET,
//    String SORT_ORDER,
//    String SORT_FIELDS
//  ) {
//    WrapperInit wrapper = wrapperInit();
//
//    ResponseRulesApi responseRulesApi = new ResponseRulesApi(
//      AuthClient.createClient()
//    );
//
//    try {
//      return responseRulesApi.getResponseRules(
//        WORKSPACE_ID,
//        wrapper.getApiKey(),
//        wrapper.getAccept(),
//        LIMIT,
//        OFFSET,
//        SORT_ORDER,
//        SORT_FIELDS
//      );
//    } catch (Exception e) {
//      throw new Error(e);
//    }
//  }
//
//  public static ResponseRule retrieveResponseRule(
//    String WORKSPACE_ID,
//    String RESPONSE_RULE_ID
//  ) {
//    WrapperInit wrapper = wrapperInit();
//
//    ResponseRulesApi responseRulesApi = new ResponseRulesApi(
//      AuthClient.createClient()
//    );
//
//    try {
//      return responseRulesApi.getResponseRulesById(
//        WORKSPACE_ID,
//        wrapper.getApiKey(),
//        wrapper.getAccept(),
//        RESPONSE_RULE_ID
//      );
//    } catch (Exception e) {
//      throw new Error(e);
//    }
//  }
//
//  public static ResponseRule updateResponseRule(
//    String WORKSPACE_ID,
//    String RESPONSE_RULE_ID,
//    ResponseRule RESPONSE_RULE
//  ) {
//    WrapperInit wrapper = wrapperInit();
//
//    ResponseRulesApi responseRulesApi = new ResponseRulesApi(
//      AuthClient.createClient()
//    );
//
//    try {
//      return responseRulesApi.putResponseRulesById(
//        WORKSPACE_ID,
//        wrapper.getApiKey(),
//        wrapper.getContentType(),
//        wrapper.getAccept(),
//        RESPONSE_RULE_ID,
//        RESPONSE_RULE
//      );
//    } catch (Exception e) {
//      throw new Error(e);
//    }
//  }
//
//  public static ResponseRule deleteResponseRule(
//    String WORKSPACE_ID,
//    String RESPONSE_RULE_ID
//  ) {
//    WrapperInit wrapper = wrapperInit();
//
//    ResponseRulesApi responseRulesApi = new ResponseRulesApi(
//      AuthClient.createClient()
//    );
//
//    try {
//      return responseRulesApi.deleteResponseRulesById(
//        WORKSPACE_ID,
//        wrapper.getApiKey(),
//        RESPONSE_RULE_ID
//      );
//    } catch (Exception e) {
//      throw new Error(e);
//    }
//  }
}
