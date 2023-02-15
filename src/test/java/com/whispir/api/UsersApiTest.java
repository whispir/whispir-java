package com.whispir.api;

import com.whispir.client.ApiException;
import com.whispir.model.ApiError;
import java.math.BigDecimal;
import com.whispir.model.User;
import com.whispir.model.UserCollection;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.net.URI;

import com.whispir.api.UsersApi.UserCreateParams;
import com.whispir.api.UsersApi.UserDeleteParams;
import com.whispir.api.UsersApi.UserListParams;
import com.whispir.api.UsersApi.UserRetrieveParams;
import com.whispir.api.UsersApi.UserUpdateParams;
import com.whispir.api.UsersApi.UserWorkspaceListParams;
import com.whispir.api.UsersApi.UsersDeleteParams;

/**
 * API tests for UsersApi
 */
@Disabled
public class UsersApiTest {
    private final UsersApi api = new UsersApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void UserCreateTest() throws ApiException {
        String userName = null;
        String password = null;
        String firstName = null;
        String middleName = null;
        String lastName = null;
        String title = null;
        String nickname = null;
        UserCreateParams.StatusEnum status = null;
        String workMobilePhone1 = null;
        String workEmailAddress1 = null;
        String workCountry = null;
        String timezone = null;
        String workMobilePhone2 = null;
        String workEmailAddress2 = null;
        String workPhoneAreaCode1 = null;
        String workPhone1 = null;
        String workPhoneAreaCode2 = null;
        String workPhone2 = null;
        String workFaxAreaCode1 = null;
        String workFax1 = null;
        String workSatellitePhone = null;
        String workOtherPhone = null;
        String workAddress1 = null;
        String workAddress2 = null;
        String workSuburb = null;
        String workState = null;
        String workPostCode = null;
        String workPostalAddress1 = null;
        String workPostalAddress2 = null;
        String workPostalSuburb = null;
        String workPostalState = null;
        String workPostalPostCode = null;
        String personalEmailAddress1 = null;
        String personalEmailAddress2 = null;
        String personalAddress1 = null;
        String personalAddress2 = null;
        String personalSuburb = null;
        String personalState = null;
        String personalPostCode = null;
        String personalCountry = null;
        String personalPhoneAreaCode1 = null;
        String personalPhone1 = null;
        String personalPhoneAreaCode2 = null;
        String personalPhone2 = null;
        String personalFaxAreaCode1 = null;
        String personalFax1 = null;
        String otherPhoneAreaCode1 = null;
        String otherPhone1 = null;
        String otherMobile = null;
        String otherFirstName = null;
        String otherLastName = null;
        String otherTitle = null;
        String companyName = null;
        String jobTitle = null;
        String division = null;
        String businessUnit = null;
        String department = null;
        String teamName1 = null;
        String teamName2 = null;
        String role1 = null;
        String role2 = null;
        UserCreateParams params = UserCreateParams.builder()
                                        .setUserName(userName)
                                        .setPassword(password)
                                        .setFirstName(firstName)
                                        .setMiddleName(middleName)
                                        .setLastName(lastName)
                                        .setTitle(title)
                                        .setNickname(nickname)
                                        .setStatus(status)
                                        .setWorkMobilePhone1(workMobilePhone1)
                                        .setWorkEmailAddress1(workEmailAddress1)
                                        .setWorkCountry(workCountry)
                                        .setTimezone(timezone)
                                        .setWorkMobilePhone2(workMobilePhone2)
                                        .setWorkEmailAddress2(workEmailAddress2)
                                        .setWorkPhoneAreaCode1(workPhoneAreaCode1)
                                        .setWorkPhone1(workPhone1)
                                        .setWorkPhoneAreaCode2(workPhoneAreaCode2)
                                        .setWorkPhone2(workPhone2)
                                        .setWorkFaxAreaCode1(workFaxAreaCode1)
                                        .setWorkFax1(workFax1)
                                        .setWorkSatellitePhone(workSatellitePhone)
                                        .setWorkOtherPhone(workOtherPhone)
                                        .setWorkAddress1(workAddress1)
                                        .setWorkAddress2(workAddress2)
                                        .setWorkSuburb(workSuburb)
                                        .setWorkState(workState)
                                        .setWorkPostCode(workPostCode)
                                        .setWorkPostalAddress1(workPostalAddress1)
                                        .setWorkPostalAddress2(workPostalAddress2)
                                        .setWorkPostalSuburb(workPostalSuburb)
                                        .setWorkPostalState(workPostalState)
                                        .setWorkPostalPostCode(workPostalPostCode)
                                        .setPersonalEmailAddress1(personalEmailAddress1)
                                        .setPersonalEmailAddress2(personalEmailAddress2)
                                        .setPersonalAddress1(personalAddress1)
                                        .setPersonalAddress2(personalAddress2)
                                        .setPersonalSuburb(personalSuburb)
                                        .setPersonalState(personalState)
                                        .setPersonalPostCode(personalPostCode)
                                        .setPersonalCountry(personalCountry)
                                        .setPersonalPhoneAreaCode1(personalPhoneAreaCode1)
                                        .setPersonalPhone1(personalPhone1)
                                        .setPersonalPhoneAreaCode2(personalPhoneAreaCode2)
                                        .setPersonalPhone2(personalPhone2)
                                        .setPersonalFaxAreaCode1(personalFaxAreaCode1)
                                        .setPersonalFax1(personalFax1)
                                        .setOtherPhoneAreaCode1(otherPhoneAreaCode1)
                                        .setOtherPhone1(otherPhone1)
                                        .setOtherMobile(otherMobile)
                                        .setOtherFirstName(otherFirstName)
                                        .setOtherLastName(otherLastName)
                                        .setOtherTitle(otherTitle)
                                        .setCompanyName(companyName)
                                        .setJobTitle(jobTitle)
                                        .setDivision(division)
                                        .setBusinessUnit(businessUnit)
                                        .setDepartment(department)
                                        .setTeamName1(teamName1)
                                        .setTeamName2(teamName2)
                                        .setRole1(role1)
                                        .setRole2(role2)
                                        .build();
        User response = api.create(params);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void UserDeleteTest() throws ApiException {
        String userId = null;
        UserDeleteParams params = UserDeleteParams.builder()
                                        .setUserId(userId)
                                        .build();
        api.delete(params);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void UserListTest() throws ApiException {
        String fieldname = null;
        String sortOrder = null;
        String sortFields = null;
        BigDecimal limit = null;
        BigDecimal offset = null;
        UserListParams params = UserListParams.builder()
                                        .setFieldname(fieldname)
                                        .setSortOrder(sortOrder)
                                        .setSortFields(sortFields)
                                        .setLimit(limit)
                                        .setOffset(offset)
                                        .build();
        UserCollection response = api.list(params);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void UserRetrieveTest() throws ApiException {
        String userId = null;
        UserRetrieveParams params = UserRetrieveParams.builder()
                                        .setUserId(userId)
                                        .build();
        User response = api.retrieve(params);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void UserUpdateTest() throws ApiException {
        String userId = null;
        String userName = null;
        String password = null;
        String firstName = null;
        String middleName = null;
        String lastName = null;
        String title = null;
        String nickname = null;
        UserUpdateParams.StatusEnum status = null;
        String workMobilePhone1 = null;
        String workEmailAddress1 = null;
        String workCountry = null;
        String timezone = null;
        String workMobilePhone2 = null;
        String workEmailAddress2 = null;
        String workPhoneAreaCode1 = null;
        String workPhone1 = null;
        String workPhoneAreaCode2 = null;
        String workPhone2 = null;
        String workFaxAreaCode1 = null;
        String workFax1 = null;
        String workSatellitePhone = null;
        String workOtherPhone = null;
        String workAddress1 = null;
        String workAddress2 = null;
        String workSuburb = null;
        String workState = null;
        String workPostCode = null;
        String workPostalAddress1 = null;
        String workPostalAddress2 = null;
        String workPostalSuburb = null;
        String workPostalState = null;
        String workPostalPostCode = null;
        String personalEmailAddress1 = null;
        String personalEmailAddress2 = null;
        String personalAddress1 = null;
        String personalAddress2 = null;
        String personalSuburb = null;
        String personalState = null;
        String personalPostCode = null;
        String personalCountry = null;
        String personalPhoneAreaCode1 = null;
        String personalPhone1 = null;
        String personalPhoneAreaCode2 = null;
        String personalPhone2 = null;
        String personalFaxAreaCode1 = null;
        String personalFax1 = null;
        String otherPhoneAreaCode1 = null;
        String otherPhone1 = null;
        String otherMobile = null;
        String otherFirstName = null;
        String otherLastName = null;
        String otherTitle = null;
        String companyName = null;
        String jobTitle = null;
        String division = null;
        String businessUnit = null;
        String department = null;
        String teamName1 = null;
        String teamName2 = null;
        String role1 = null;
        String role2 = null;
        UserUpdateParams params = UserUpdateParams.builder()
                                        .setUserId(userId)
                                        .setUserName(userName)
                                        .setPassword(password)
                                        .setFirstName(firstName)
                                        .setMiddleName(middleName)
                                        .setLastName(lastName)
                                        .setTitle(title)
                                        .setNickname(nickname)
                                        .setStatus(status)
                                        .setWorkMobilePhone1(workMobilePhone1)
                                        .setWorkEmailAddress1(workEmailAddress1)
                                        .setWorkCountry(workCountry)
                                        .setTimezone(timezone)
                                        .setWorkMobilePhone2(workMobilePhone2)
                                        .setWorkEmailAddress2(workEmailAddress2)
                                        .setWorkPhoneAreaCode1(workPhoneAreaCode1)
                                        .setWorkPhone1(workPhone1)
                                        .setWorkPhoneAreaCode2(workPhoneAreaCode2)
                                        .setWorkPhone2(workPhone2)
                                        .setWorkFaxAreaCode1(workFaxAreaCode1)
                                        .setWorkFax1(workFax1)
                                        .setWorkSatellitePhone(workSatellitePhone)
                                        .setWorkOtherPhone(workOtherPhone)
                                        .setWorkAddress1(workAddress1)
                                        .setWorkAddress2(workAddress2)
                                        .setWorkSuburb(workSuburb)
                                        .setWorkState(workState)
                                        .setWorkPostCode(workPostCode)
                                        .setWorkPostalAddress1(workPostalAddress1)
                                        .setWorkPostalAddress2(workPostalAddress2)
                                        .setWorkPostalSuburb(workPostalSuburb)
                                        .setWorkPostalState(workPostalState)
                                        .setWorkPostalPostCode(workPostalPostCode)
                                        .setPersonalEmailAddress1(personalEmailAddress1)
                                        .setPersonalEmailAddress2(personalEmailAddress2)
                                        .setPersonalAddress1(personalAddress1)
                                        .setPersonalAddress2(personalAddress2)
                                        .setPersonalSuburb(personalSuburb)
                                        .setPersonalState(personalState)
                                        .setPersonalPostCode(personalPostCode)
                                        .setPersonalCountry(personalCountry)
                                        .setPersonalPhoneAreaCode1(personalPhoneAreaCode1)
                                        .setPersonalPhone1(personalPhone1)
                                        .setPersonalPhoneAreaCode2(personalPhoneAreaCode2)
                                        .setPersonalPhone2(personalPhone2)
                                        .setPersonalFaxAreaCode1(personalFaxAreaCode1)
                                        .setPersonalFax1(personalFax1)
                                        .setOtherPhoneAreaCode1(otherPhoneAreaCode1)
                                        .setOtherPhone1(otherPhone1)
                                        .setOtherMobile(otherMobile)
                                        .setOtherFirstName(otherFirstName)
                                        .setOtherLastName(otherLastName)
                                        .setOtherTitle(otherTitle)
                                        .setCompanyName(companyName)
                                        .setJobTitle(jobTitle)
                                        .setDivision(division)
                                        .setBusinessUnit(businessUnit)
                                        .setDepartment(department)
                                        .setTeamName1(teamName1)
                                        .setTeamName2(teamName2)
                                        .setRole1(role1)
                                        .setRole2(role2)
                                        .build();
        api.update(params);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void UserWorkspaceListTest() throws ApiException {
        String workspaceId = null;
        String sortOrder = null;
        String sortFields = null;
        BigDecimal limit = null;
        BigDecimal offset = null;
        UserWorkspaceListParams params = UserWorkspaceListParams.builder()
                                        .setWorkspaceId(workspaceId)
                                        .setSortOrder(sortOrder)
                                        .setSortFields(sortFields)
                                        .setLimit(limit)
                                        .setOffset(offset)
                                        .build();
        UserCollection response = api.listByWorkspace(params);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void UsersDeleteTest() throws ApiException {
        UsersDeleteParams params = UsersDeleteParams.builder()
                                        .build();
        api.deleteAll(params);
        // TODO: test validations
    }

}
