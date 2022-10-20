//import org.openapitools.client.model.Distributionlist;
//import org.openapitools.client.model.GetDistributionLists200ResponseDistributionLists;
//import org.whispir.api.DistributionListsApi;
//import whispir_sdk_java.utils.AuthClient;
//import whispir_sdk_java.utils.WrapperInit;

public class DistributionListsWrappedApi {

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
//  public static Distributionlist createDistributionlist(
//    String WORKSPACE_ID,
//    GetDistributionLists200ResponseDistributionLists GET_DISTRIBUTION_LISTS_200_RESPONSE_DISTRIBUTION_LISTS
//  ) {
//    WrapperInit wrapper = wrapperInit();
//
//    DistributionListsApi distributionListApi = new DistributionListsApi(
//      AuthClient.createClient()
//    );
//
//    try {
//      return distributionListApi.postDistributionLists(
//        WORKSPACE_ID,
//        wrapper.getApiKey(),
//        wrapper.getContentType(),
//        wrapper.getAccept(),
//        GET_DISTRIBUTION_LISTS_200_RESPONSE_DISTRIBUTION_LISTS
//      );
//    } catch (Exception e) {
//      throw new Error(e);
//    }
//  }
//
//  public static Distributionlist listDistributionlists(
//    String WORKSPACE_ID,
//    BigDecimal LIMIT,
//    BigDecimal OFFSET,
//    String SORT_ORDER,
//    String SORT_FIELDS,
//    String NAME,
//    String DESCRIPTION
//  ) {
//    WrapperInit wrapper = wrapperInit();
//
//    DistributionListsApi distributionListApi = new DistributionListsApi(
//      AuthClient.createClient()
//    );
//
//    try {
//      return distributionListApi.getDistributionLists(
//        WORKSPACE_ID,
//        wrapper.getApiKey(),
//        wrapper.getAccept(),
//        LIMIT,
//        OFFSET,
//        SORT_ORDER,
//        SORT_FIELDS,
//        NAME,
//        DESCRIPTION
//      );
//    } catch (Exception e) {
//      throw new Error(e);
//    }
//  }
//
//  public static Distributionlist retrieveDistributionlist(
//    String WORKSPACE_ID,
//    String DISTRIBUTION_LIST_ID
//  ) {
//    WrapperInit wrapper = wrapperInit();
//
//    DistributionListsApi distributionListApi = new DistributionListsApi(
//      AuthClient.createClient()
//    );
//
//    try {
//      return distributionListApi.getDistributionListsById(
//        WORKSPACE_ID,
//        wrapper.getApiKey(),
//        wrapper.getAccept(),
//        DISTRIBUTION_LIST_ID
//      );
//    } catch (Exception e) {
//      throw new Error(e);
//    }
//  }
//
//  public static Distributionlist updateDistributionlist(
//    String WORKSPACE_ID,
//    String DISTRIBUTION_LIST_ID,
//    GetDistributionLists200ResponseDistributionLists GET_DISTRIBUTION_LISTS_200_RESPONSE_DISTRIBUTION_LISTS
//  ) {
//    WrapperInit wrapper = wrapperInit();
//
//    DistributionListsApi distributionListApi = new DistributionListsApi(
//      AuthClient.createClient()
//    );
//
//    try {
//      return distributionListApi.putDistributionListsById(
//        WORKSPACE_ID,
//        wrapper.getApiKey(),
//        wrapper.getContentType(),
//        wrapper.getAccept(),
//        DISTRIBUTION_LIST_ID,
//        GET_DISTRIBUTION_LISTS_200_RESPONSE_DISTRIBUTION_LISTS
//      );
//    } catch (Exception e) {
//      throw new Error(e);
//    }
//  }
//
//  public static Distributionlist deleteDistributionlist(
//    String WORKSPACE_ID,
//    String DISTRIBUTION_LIST_ID
//  ) {
//    WrapperInit wrapper = wrapperInit();
//
//    DistributionListsApi distributionListApi = new DistributionListsApi(
//      AuthClient.createClient()
//    );
//
//    try {
//      return distributionListApi.deleteDistributionListsById(
//        WORKSPACE_ID,
//        wrapper.getApiKey(),
//        DISTRIBUTION_LIST_ID
//      );
//    } catch (Exception e) {
//      throw new Error(e);
//    }
//  }
}
