//import org.openapitools.client.model.Callback;
//import org.openapitools.client.model.PutCallbackInstanceStatusRequest;
//import org.whispir.api.CallbacksApi;
//import whispir_sdk_java.utils.AuthClient;
//import whispir_sdk_java.utils.WrapperInit;

public class CallbacksWrappedApi {

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
//  public static Callback createCallback(Callback CALLBACK) {
//    WrapperInit wrapper = wrapperInit();
//
//    CallbacksApi callbackApi = new CallbacksApi(AuthClient.createClient());
//
//    try {
//      return callbackApi.postCallbacks(
//        wrapper.getApiKey(),
//        wrapper.getContentType(),
//        wrapper.getAccept(),
//        CALLBACK
//      );
//    } catch (Exception e) {
//      throw new Error(e);
//    }
//  }
//
//  public static Callback listCallbacks(
//    BigDecimal LIMIT,
//    BigDecimal OFFSET,
//    String SORT_ORDER,
//    String SORT_FIELDS
//  ) {
//    WrapperInit wrapper = wrapperInit();
//
//    CallbacksApi callbackApi = new CallbacksApi(AuthClient.createClient());
//
//    try {
//      return callbackApi.getCallbacks(
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
//  public static Callback getCallback(String CALLBACK_ID) {
//    WrapperInit wrapper = wrapperInit();
//
//    CallbacksApi callbackApi = new CallbacksApi(AuthClient.createClient());
//
//    try {
//      return callbackApi.getCallbackById(
//        wrapper.getApiKey(),
//        CALLBACK_ID,
//        wrapper.getAccept()
//      );
//    } catch (Exception e) {
//      throw new Error(e);
//    }
//  }
//
//  public static Callback updateCallback(String CALLBACK_ID, Callback CALLBACK) {
//    WrapperInit wrapper = wrapperInit();
//
//    CallbacksApi callbackApi = new CallbacksApi(AuthClient.createClient());
//
//    try {
//      return callbackApi.putCallbackById(
//        wrapper.getApiKey(),
//        CALLBACK_ID,
//        wrapper.getContentType(),
//        wrapper.getAccept(),
//        CALLBACK
//      );
//    } catch (Exception e) {
//      throw new Error(e);
//    }
//  }
//
//  public static Callback deleteCallback(String CALLBACK_ID) {
//    WrapperInit wrapper = wrapperInit();
//
//    CallbacksApi callbackApi = new CallbacksApi(AuthClient.createClient());
//
//    try {
//      return callbackApi.deleteCallbackById(
//        wrapper.getApiKey(),
//        CALLBACK_ID,
//        wrapper.getContentType(),
//        wrapper.getAccept()
//      );
//    } catch (Exception e) {
//      throw new Error(e);
//    }
//  }
//
//  public static Callback listCallbackInstances(
//    String CALLBACK_ID,
//    BigDecimal LIMIT,
//    BigDecimal OFFSET,
//    String SORT_ORDER,
//    String SORT_FIELDS,
//    String STATUS
//  ) {
//    WrapperInit wrapper = wrapperInit();
//
//    CallbacksApi callbackApi = new CallbacksApi(AuthClient.createClient());
//
//    try {
//      return callbackApi.getCallbackInstances(
//        wrapper.getApiKey(),
//        CALLBACK_ID,
//        wrapper.getAccept(),
//        LIMIT,
//        OFFSET,
//        SORT_ORDER,
//        SORT_FIELDS,
//        STATUS
//      );
//    } catch (Exception e) {
//      throw new Error(e);
//    }
//  }
//
//  public static Callback updateCallbackInstanceStatus(
//    String CALLBACK_ID,
//    String ID,
//    PutCallbackInstanceStatusRequest PUT_CALLBACK_INSTANCE_STATUS_REQUEST
//  ) {
//    WrapperInit wrapper = wrapperInit();
//
//    CallbacksApi callbackApi = new CallbacksApi(AuthClient.createClient());
//
//    try {
//      return callbackApi.putCallbackInstanceStatus(
//        wrapper.getApiKey(),
//        CALLBACK_ID,
//        wrapper.getContentType(),
//        wrapper.getAccept(),
//        ID,
//        PUT_CALLBACK_INSTANCE_STATUS_REQUEST
//      );
//    } catch (Exception e) {
//      throw new Error(e);
//    }
//  }
}
