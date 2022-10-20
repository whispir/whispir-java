//import org.openapitools.client.model.User;
//import org.whispir.api.UsersApi;
//import whispir_sdk_java.utils.AuthClient;
//import whispir_sdk_java.utils.WrapperInit;

public class UsersWrappedApi {

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
//  public static User createUser(User USER) {
//    WrapperInit wrapper = wrapperInit();
//
//    UsersApi userApi = new UsersApi(AuthClient.createClient());
//
//    try {
//      return userApi.postUsers(
//        wrapper.getApiKey(),
//        wrapper.getContentType(),
//        wrapper.getAccept(),
//        USER
//      );
//    } catch (Exception e) {
//      throw new Error(e);
//    }
//  }
//
//  public static User listUsers(
//    String FIELD_NAME,
//    String SORT_ORDER,
//    String SORT_FIELDS,
//    BigDecimal LIMIT,
//    BigDecimal OFFSET
//  ) {
//    WrapperInit wrapper = wrapperInit();
//
//    UsersApi userApi = new UsersApi(AuthClient.createClient());
//
//    try {
//      return userApi.getUsers(
//        wrapper.getApiKey(),
//        wrapper.getAccept(),
//        FIELD_NAME,
//        SORT_ORDER,
//        SORT_FIELDS,
//        LIMIT,
//        OFFSET
//      );
//    } catch (Exception e) {
//      throw new Error(e);
//    }
//  }
//
//  public static User deleteAllUsers() {
//    WrapperInit wrapper = wrapperInit();
//
//    UsersApi userApi = new UsersApi(AuthClient.createClient());
//
//    try {
//      return userApi.deleteUsers(
//        wrapper.getApiKey(),
//        wrapper.getContentType(),
//        wrapper.getAccept()
//      );
//    } catch (Exception e) {
//      throw new Error(e);
//    }
//  }
//
//  public static User retrieveUser(String USER_ID) {
//    WrapperInit wrapper = wrapperInit();
//
//    UsersApi userApi = new UsersApi(AuthClient.createClient());
//
//    try {
//      return userApi.getUsersById(
//        wrapper.getApiKey(),
//        USER_ID,
//        wrapper.getAccept()
//      );
//    } catch (Exception e) {
//      throw new Error(e);
//    }
//  }
//
//  public static User updateUser(String USER_ID, User USER) {
//    WrapperInit wrapper = wrapperInit();
//
//    UsersApi userApi = new UsersApi(AuthClient.createClient());
//
//    try {
//      return userApi.putUsersById(
//        wrapper.getApiKey(),
//        USER_ID,
//        wrapper.getContentType(),
//        wrapper.getAccept(),
//        USER
//      );
//    } catch (Exception e) {
//      throw new Error(e);
//    }
//  }
//
//  public static User deleteUser(String USER_ID) {
//    WrapperInit wrapper = wrapperInit();
//
//    UsersApi userApi = new UsersApi(AuthClient.createClient());
//
//    try {
//      return userApi.deleteUsersById(
//        wrapper.getApiKey(),
//        USER_ID,
//        wrapper.getContentType(),
//        wrapper.getAccept()
//      );
//    } catch (Exception e) {
//      throw new Error(e);
//    }
//  }
//
//  public static User listWorkspaceUsers(
//    String WORKSPACE_ID,
//    String SORT_ORDER,
//    String SORT_FIELDS,
//    BigDecimal LIMIT,
//    BigDecimal OFFSET
//  ) {
//    WrapperInit wrapper = wrapperInit();
//
//    UsersApi userApi = new UsersApi(AuthClient.createClient());
//
//    try {
//      return userApi.getWorkspaceUsers(
//        WORKSPACE_ID,
//        wrapper.getApiKey(),
//        wrapper.getAccept(),
//        SORT_ORDER,
//        SORT_FIELDS,
//        LIMIT,
//        OFFSET
//      );
//    } catch (Exception e) {
//      throw new Error(e);
//    }
//  }
}
