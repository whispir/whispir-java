import org.openapitools.client.model.Resource;
import org.whispir.api.ResourcesApi;
import whispir_sdk_java.utils.AuthClient;
import whispir_sdk_java.utils.WrapperInit;

public class ResourcesWrappedApi {

  public static WrapperInit wrapperInit() {
    WrapperInit wrapper = new WrapperInit();
    Dotenv dotenv = Dotenv.load();
    wrapper.setInitValues(
      dotenv.get("API_KEY"),
      "application/vnd.whispir.auth-v1+json",
      "application/vnd.whispir.auth-v1+json"
    );

    return wrapper;
  }

  public static Resource createResource(
    String WORKSPACE_ID,
    Resource RESOURCE
  ) {
    WrapperInit wrapper = wrapperInit();

    ResourcesApi resourceApi = new ResourcesApi(AuthClient.createClient());

    try {
      return resourceApi.postResources(
        WORKSPACE_ID,
        wrapper.getApiKey(),
        wrapper.getContentType(),
        wrapper.getAccept(),
        RESOURCE
      );
    } catch (Exception e) {
      throw new Error(e);
    }
  }

  public static Resource listResources(
    String WORKSPACE_ID,
    BigDecimal LIMIT,
    BigDecimal OFFSET,
    String SORT_ORDER,
    String SORT_FIELDS,
    String SCOPE,
    String NAME
  ) {
    WrapperInit wrapper = wrapperInit();

    ResourcesApi resourceApi = new ResourcesApi(AuthClient.createClient());

    try {
      return resourceApi.getResources(
        WORKSPACE_ID,
        wrapper.getApiKey(),
        wrapper.getAccept(),
        LIMIT,
        OFFSET,
        SORT_ORDER,
        SORT_FIELDS,
        SCOPE,
        NAME
      );
    } catch (Exception e) {
      throw new Error(e);
    }
  }

  public static Resource retrieveResource(
    String WORKSPACE_ID,
    String RESOURCE_ID
  ) {
    WrapperInit wrapper = wrapperInit();

    ResourcesApi resourceApi = new ResourcesApi(AuthClient.createClient());

    try {
      return resourceApi.getResourcesById(
        WORKSPACE_ID,
        wrapper.getApiKey(),
        wrapper.getAccept(),
        RESOURCE_ID
      );
    } catch (Exception e) {
      throw new Error(e);
    }
  }

  public static Resource updateResource(
    String WORKSPACE_ID,
    String RESOURCE_ID,
    Resource RESOURCE
  ) {
    WrapperInit wrapper = wrapperInit();

    ResourcesApi resourceApi = new ResourcesApi(AuthClient.createClient());

    try {
      return resourceApi.putResourcesById(
        WORKSPACE_ID,
        wrapper.getApiKey(),
        wrapper.getContentType(),
        wrapper.getAccept(),
        RESOURCE_ID,
        RESOURCE
      );
    } catch (Exception e) {
      throw new Error(e);
    }
  }

  public static Resource deleteResource(
    String WORKSPACE_ID,
    String RESOURCE_ID
  ) {
    WrapperInit wrapper = wrapperInit();

    ResourcesApi resourceApi = new ResourcesApi(AuthClient.createClient());

    try {
      return resourceApi.deleteResourcesById(
        WORKSPACE_ID,
        wrapper.getApiKey(),
        RESOURCE_ID
      );
    } catch (Exception e) {
      throw new Error(e);
    }
  }
}
