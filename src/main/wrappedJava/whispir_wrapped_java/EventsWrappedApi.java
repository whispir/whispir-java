//import org.openapitools.client.model.Event;
//import org.whispir.api.EventsApi;
//import whispir_sdk_java.utils.AuthClient;
//import whispir_sdk_java.utils.WrapperInit;

public class EventsWrappedApi {

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
//  public static Event lisEvents(
//    String WORKSPACE_ID,
//    String EVENT_TYPE,
//    BigDecimal LIMIT,
//    BigDecimal OFFSET,
//    String SORT_ORDER,
//    String SORT_FIELDS
//  ) {
//    WrapperInit wrapper = wrapperInit();
//
//    EventsApi eventApi = new EventsApi(AuthClient.createClient());
//
//    try {
//      return eventApi.getEvents(
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
//  public static Event createEvent(String WORKSPACE_ID, Event EVENT) {
//    WrapperInit wrapper = wrapperInit();
//
//    EventsApi eventApi = new EventsApi(AuthClient.createClient());
//
//    try {
//      return eventApi.createEvent(
//        WORKSPACE_ID,
//        wrapper.getApiKey(),
//        wrapper.getContentType(),
//        wrapper.getAccept(),
//        EVENT
//      );
//    } catch (Exception e) {
//      throw new Error(e);
//    }
//  }
//
//  public static Event retrieveEvent(
//    String WORKSPACE_ID,
//    String EVENT_ID,
//    BigDecimal LIMIT,
//    BigDecimal OFFSET,
//    String SORT_ORDER,
//    String SORT_FIELDS
//  ) {
//    WrapperInit wrapper = wrapperInit();
//
//    EventsApi eventApi = new EventsApi(AuthClient.createClient());
//
//    try {
//      return eventApi.getEventById(
//        WORKSPACE_ID,
//        EVENT_ID,
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
//  public static Event updateEvent(
//    String WORKSPACE_ID,
//    String EVENT_ID,
//    Event EVENT
//  ) {
//    WrapperInit wrapper = wrapperInit();
//
//    EventsApi eventApi = new EventsApi(AuthClient.createClient());
//
//    try {
//      return eventApi.putEventById(
//        WORKSPACE_ID,
//        EVENT_ID,
//        wrapper.getApiKey(),
//        wrapper.getContentType(),
//        wrapper.getAccept(),
//        EVENT
//      );
//    } catch (Exception e) {
//      throw new Error(e);
//    }
//  }
}
