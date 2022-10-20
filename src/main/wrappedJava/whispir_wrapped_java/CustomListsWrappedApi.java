//import org.openapitools.client.model.CustomList;
//import org.whispir.api.CustomListsApi;
//import whispir_sdk_java.utils.AuthClient;
//import whispir_sdk_java.utils.WrapperInit;

public class CustomListsWrappedApi {

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
//  public static CustomList listCustomLists(
//    String WORKSPACE_ID,
//    BigDecimal LIMIT,
//    BigDecimal OFFSET,
//    String SORT_ORDER,
//    String SORT_FIELDS,
//    String NAME,
//    String TYPE
//  ) {
//    WrapperInit wrapper = wrapperInit();
//
//    CustomListsApi customListApi = new CustomListsApi(
//      AuthClient.createClient()
//    );
//
//    try {
//      return customListApi.getCustomLists(
//        wrapper.getApiKey(),
//        wrapper.getAccept(),
//        LIMIT,
//        OFFSET,
//        SORT_ORDER,
//        SORT_FIELDS,
//        NAME,
//        TYPE
//      );
//    } catch (Exception e) {
//      throw new Error(e);
//    }
//  }
//
//  public static CustomList retrieveCustomList(String CUSTOM_LIST_ID) {
//    WrapperInit wrapper = wrapperInit();
//
//    CustomListsApi customListApi = new CustomListsApi(
//      AuthClient.createClient()
//    );
//
//    try {
//      return customListApi.getCustomListsById(
//        wrapper.getApiKey(),
//        wrapper.getAccept(),
//        CUSTOM_LIST_ID
//      );
//    } catch (Exception e) {
//      throw new Error(e);
//    }
//  }
}
