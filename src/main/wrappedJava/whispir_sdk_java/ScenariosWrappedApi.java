import org.openapitools.client.model.Scenario;
import org.whispir.api.ScenariosApi;
import whispir_sdk_java.utils.AuthClient;
import whispir_sdk_java.utils.WrapperInit;

public class ScenariosWrappedApi {

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

  public static Scenario createScenario(
    String WORKSPACE_ID,
    Scenario SCENARIO
  ) {
    WrapperInit wrapper = wrapperInit();

    ScenariosApi scenarioApi = new ScenariosApi(AuthClient.createClient());

    try {
      return scenarioApi.postScenarios(
        WORKSPACE_ID,
        wrapper.getApiKey(),
        wrapper.getContentType(),
        wrapper.getAccept(),
        SCENARIO
      );
    } catch (Exception e) {
      throw new Error(e);
    }
  }

  public static Scenario listScenarios(
    String WORKSPACE_ID,
    BigDecimal LIMIT,
    BigDecimal OFFSET,
    String SORT_ORDER,
    String SORT_FIELDS
  ) {
    WrapperInit wrapper = wrapperInit();

    ScenariosApi scenarioApi = new ScenariosApi(AuthClient.createClient());

    try {
      return scenarioApi.getScenarios(
        WORKSPACE_ID,
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

  public static Scenario retrieveScenario(
    String WORKSPACE_ID,
    String SCENARIO_ID
  ) {
    WrapperInit wrapper = wrapperInit();

    ScenariosApi scenarioApi = new ScenariosApi(AuthClient.createClient());

    try {
      return scenarioApi.getScenariosById(
        WORKSPACE_ID,
        wrapper.getApiKey(),
        wrapper.getAccept(),
        SCENARIO_ID
      );
    } catch (Exception e) {
      throw new Error(e);
    }
  }

  public static Scenario runScenario(String WORKSPACE_ID, String SCENARIO_ID) {
    WrapperInit wrapper = wrapperInit();

    ScenariosApi scenarioApi = new ScenariosApi(AuthClient.createClient());

    try {
      return scenarioApi.postScenariosById(
        WORKSPACE_ID,
        wrapper.getApiKey(),
        wrapper.getContentType(),
        wrapper.getAccept(),
        SCENARIO_ID
      );
    } catch (Exception e) {
      throw new Error(e);
    }
  }

  public static Scenario updateScenario(
    String WORKSPACE_ID,
    String SCENARIO_ID,
    Scenario SCENARIO
  ) {
    WrapperInit wrapper = wrapperInit();

    ScenariosApi scenarioApi = new ScenariosApi(AuthClient.createClient());

    try {
      return scenarioApi.putScenariosById(
        WORKSPACE_ID,
        wrapper.getApiKey(),
        wrapper.getContentType(),
        wrapper.getAccept(),
        SCENARIO_ID,
        SCENARIO
      );
    } catch (Exception e) {
      throw new Error(e);
    }
  }

  public static Scenario deleteScenario(
    String WORKSPACE_ID,
    String SCENARIO_ID
  ) {
    WrapperInit wrapper = wrapperInit();

    ScenariosApi scenarioApi = new ScenariosApi(AuthClient.createClient());

    try {
      return scenarioApi.deleteScenariosById(
        WORKSPACE_ID,
        wrapper.getApiKey(),
        SCENARIO_ID
      );
    } catch (Exception e) {
      throw new Error(e);
    }
  }
}
