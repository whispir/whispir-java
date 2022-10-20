//import org.openapitools.client.model.Template;
//import org.whispir.api.TemplatesApi;
//import whispir_sdk_java.utils.AuthClient;
//import whispir_sdk_java.utils.WrapperInit;

public class TemplatesWrappedApi {

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
//  public static Template createTemplate(
//    String WORKSPACE_ID,
//    Template TEMPLATE
//  ) {
//    WrapperInit wrapper = wrapperInit();
//
//    TemplatesApi templatesApi = new TemplatesApi(AuthClient.createClient());
//
//    try {
//      return templatesApi.postTemplates(
//        WORKSPACE_ID,
//        wrapper.getApiKey(),
//        wrapper.getContentType(),
//        wrapper.getAccept(),
//        TEMPLATE
//      );
//    } catch (Exception e) {
//      throw new Error(e);
//    }
//  }
//
//  public static Template listTemplates(
//    String WORKSPACE_ID,
//    BigDecimal LIMIT,
//    BigDecimal OFFSET,
//    String SORT_ORDER,
//    String SORT_FIELDS
//  ) {
//    WrapperInit wrapper = wrapperInit();
//
//    TemplatesApi templatesApi = new TemplatesApi(AuthClient.createClient());
//
//    try {
//      return templatesApi.getTemplates(
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
//  public static Template retrieveTemplate(
//    String WORKSPACE_ID,
//    String TEMPLATE_ID
//  ) {
//    WrapperInit wrapper = wrapperInit();
//
//    TemplatesApi templatesApi = new TemplatesApi(AuthClient.createClient());
//
//    try {
//      return templatesApi.getTemplatesById(
//        WORKSPACE_ID,
//        wrapper.getApiKey(),
//        TEMPLATE_ID,
//        wrapper.getAccept()
//      );
//    } catch (Exception e) {
//      throw new Error(e);
//    }
//  }
//
//  public static Template updateTemplate(
//    String WORKSPACE_ID,
//    Template TEMPLATE_ID
//  ) {
//    WrapperInit wrapper = wrapperInit();
//
//    TemplatesApi templatesApi = new TemplatesApi(AuthClient.createClient());
//
//    try {
//      return templatesApi.putTemplatesById(
//        WORKSPACE_ID,
//        wrapper.getApiKey(),
//        TEMPLATE_ID,
//        wrapper.getContentType(),
//        wrapper.getAccept(),
//        TEMPLATE
//      );
//    } catch (Exception e) {
//      throw new Error(e);
//    }
//  }
//
//  public static Template deleteTemplate(
//    String WORKSPACE_ID,
//    String TEMPLATE_ID
//  ) {
//    WrapperInit wrapper = wrapperInit();
//
//    TemplatesApi templatesApi = new TemplatesApi(AuthClient.createClient());
//
//    try {
//      return templatesApi.deleteTemplatesById(
//        WORKSPACE_ID,
//        wrapper.getApiKey(),
//        TEMPLATE_ID,
//        wrapper.getContentType(),
//        wrapper.getAccept()
//      );
//    } catch (Exception e) {
//      throw new Error(e);
//    }
//  }
}
