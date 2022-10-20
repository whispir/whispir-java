//import org.openapitools.client.model.ModelImport;
//import org.whispir.api.ImportsApi;
//import whispir_sdk_java.utils.AuthClient;
//import whispir_sdk_java.utils.WrapperInit;

public class ImportsWrappedApi {

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
//  public static ModelImport createImport(
//    String WORKSPACE_ID,
//    ModelImport MODEL_IMPORT
//  ) {
//    WrapperInit wrapper = wrapperInit();
//
//    ImportsApi importApi = new ImportsApi(AuthClient.createClient());
//
//    try {
//      return importApi.postImports(
//        WORKSPACE_ID,
//        wrapper.getApiKey(),
//        wrapper.getContentType(),
//        wrapper.getAccept(),
//        MODEL_IMPORT
//      );
//    } catch (Exception e) {
//      throw new Error(e);
//    }
//  }
}
