import org.openapitools.client.model.Workspace;
import org.whispir.api.WorkspacesApi;
import whispir_sdk_java.utils.AuthClient;
import whispir_sdk_java.utils.WrapperInit;

public class WorkspacesWrappedApi {

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

  public static Workspace createWorkspace(Workspace WORKSPACE) {
    WrapperInit wrapper = wrapperInit();

    WorkspacesApi workspaceApi = new WorkspacesApi(AuthClient.createClient());

    try {
      return workspaceApi.postWorkspaces(
        wrapper.getApiKey(),
        wrapper.getContentType(),
        wrapper.getAccept(),
        WORKSPACE
      );
    } catch (Exception e) {
      throw new Error(e);
    }
  }

  public static Workspace listWorkspaces(
    BigDecimal LIMIT,
    BigDecimal OFFSET,
    String SORT_ORDER,
    String SORT_FIELDS
  ) {
    WrapperInit wrapper = wrapperInit();

    WorkspacesApi workspaceApi = new WorkspacesApi(AuthClient.createClient());

    try {
      return workspaceApi.getWorkspaces(
        wrapper.getApiKey(),
        wrapper.getAccept(),
        LIMIT,
        OFFSET,
        SORT_ORDER,
        SORT_FIELDS
      );
    } catch (Exception e) {
      throw new Error(e);
    }
  }

  public static Workspace retrieveWorkspace(String WORKSPACE_ID) {
    WrapperInit wrapper = wrapperInit();

    WorkspacesApi workspaceApi = new WorkspacesApi(AuthClient.createClient());

    try {
      return workspaceApi.getWorkspacesById(
        WORKSPACE_ID,
        wrapper.getApiKey(),
        wrapper.getAccept()
      );
    } catch (Exception e) {
      throw new Error(e);
    }
  }

  public static Workspace updateWorkspace(
    String WORKSPACE_ID,
    Workspace WORKSPACE
  ) {
    WrapperInit wrapper = wrapperInit();

    WorkspacesApi workspaceApi = new WorkspacesApi(AuthClient.createClient());

    try {
      return workspaceApi.putWorkspaceById(
        WORKSPACE_ID,
        wrapper.getApiKey(),
        wrapper.getContentType(),
        wrapper.getAccept(),
        WORKSPACE
      );
    } catch (Exception e) {
      throw new Error(e);
    }
  }
}
