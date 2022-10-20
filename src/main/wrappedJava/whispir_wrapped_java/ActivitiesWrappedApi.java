//import org.openapitools.client.model.Activity;
//import org.whispir.api.ActivitiesApi;
//import whispir_sdk_java.utils.AuthClient;
//import whispir_sdk_java.utils.WrapperInit;

public class ActivitiesWrappedApi {

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
//  public static Activity createActivity(Activity ACTIVITY) {
//    WrapperInit wrapper = wrapperInit();
//
//    ActivitiesApi activityApi = new ActivitiesApi(AuthClient.createClient());
//
//    try {
//      return activityApi.postActivities(
//        wrapper.getApiKey(),
//        wrapper.getContentType(),
//        wrapper.getAccept(),
//        ACTIVITY
//      );
//    } catch (Exception e) {
//      throw new Error(e);
//    }
//  }
//
//  public static Activity listActivities(
//    BigDecimal LIMIT,
//    BigDecimal OFFSET,
//    String SORT_ORDER,
//    String SORT_FIELDS,
//    String ACTION,
//    String MODULE,
//    String USER,
//    String WORKSPACE,
//    String STATUS,
//    String DESCRIPTION,
//    String START_TIME,
//    String END_TIME
//  ) {
//    WrapperInit wrapper = wrapperInit();
//
//    ActivitiesApi activityApi = new ActivitiesApi(AuthClient.createClient());
//
//    try {
//      return activityApi.getActivities(
//        wrapper.getApiKey(),
//        wrapper.getAccept(),
//        LIMIT,
//        OFFSET,
//        SORT_ORDER,
//        SORT_FIELDS,
//        ACTION,
//        MODULE,
//        USER,
//        WORKSPACE,
//        STATUS,
//        DESCRIPTION,
//        START_TIME,
//        END_TIME
//      );
//    } catch (Exception e) {
//      throw new Error(e);
//    }
//  }
//
//  public static Activity listWorkspaceActivities(
//    String WORKSPACE_ID,
//    BigDecimal LIMIT,
//    BigDecimal OFFSET,
//    String SORT_ORDER,
//    String SORT_FIELDS
//  ) {
//    WrapperInit wrapper = wrapperInit();
//
//    ActivitiesApi activityApi = new ActivitiesApi(AuthClient.createClient());
//
//    try {
//      return activityApi.getWorkspaceActivities(
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
}
