package com.whispir.api;

import com.whispir.client.ApiException;
import com.whispir.model.ApiError;
import java.math.BigDecimal;
import com.whispir.model.Contact;
import com.whispir.model.ContactCollection;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.net.URI;

import com.whispir.api.ContactsApi.ContactCreateParams;
import com.whispir.api.ContactsApi.ContactDeleteParams;
import com.whispir.api.ContactsApi.ContactListParams;
import com.whispir.api.ContactsApi.ContactRetrieveParams;
import com.whispir.api.ContactsApi.ContactUpdateParams;

/**
 * API tests for ContactsApi
 */
@Disabled
public class ContactsApiTest {
    private final ContactsApi api = new ContactsApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ContactCreateTest() throws ApiException {
        String workspaceId = null;
        String firstName = null;
        String lastName = null;
        String workMobilePhone1 = null;
        String workEmailAddress1 = null;
        String workCountry = null;
        String timezone = null;
        String title = null;
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
        ContactCreateParams.StatusEnum status = null;
        String companyName = null;
        String jobTitle = null;
        String division = null;
        String businessUnit = null;
        String department = null;
        String teamName1 = null;
        String teamName2 = null;
        String role1 = null;
        String role2 = null;
        List<ContactCreateParams.Location> locations = null; 
        List<ContactCreateParams.MessagingOption> messagingoptions = null; 
        ContactCreateParams params = ContactCreateParams.builder()
                                        .setWorkspaceId(workspaceId)
                                        .setFirstName(firstName)
                                        .setLastName(lastName)
                                        .setWorkMobilePhone1(workMobilePhone1)
                                        .setWorkEmailAddress1(workEmailAddress1)
                                        .setWorkCountry(workCountry)
                                        .setTimezone(timezone)
                                        .setTitle(title)
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
                                        .setStatus(status)
                                        .setCompanyName(companyName)
                                        .setJobTitle(jobTitle)
                                        .setDivision(division)
                                        .setBusinessUnit(businessUnit)
                                        .setDepartment(department)
                                        .setTeamName1(teamName1)
                                        .setTeamName2(teamName2)
                                        .setRole1(role1)
                                        .setRole2(role2)
                                        .setLocations(locations)
                                        .setMessagingoptions(messagingoptions)
                                        .build();
        Contact response = api.create(params);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ContactDeleteTest() throws ApiException {
        String workspaceId = null;
        String contactId = null;
        String action = null;
        ContactDeleteParams params = ContactDeleteParams.builder()
                                        .setWorkspaceId(workspaceId)
                                        .setContactId(contactId)
                                        .setAction(action)
                                        .build();
        api.delete(params);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ContactListTest() throws ApiException {
        String workspaceId = null;
        BigDecimal limit = null;
        BigDecimal offset = null;
        String sortOrder = null;
        String sortFields = null;
        String fieldname = null;
        Boolean customFields = null;
        ContactListParams params = ContactListParams.builder()
                                        .setWorkspaceId(workspaceId)
                                        .setLimit(limit)
                                        .setOffset(offset)
                                        .setSortOrder(sortOrder)
                                        .setSortFields(sortFields)
                                        .setFieldname(fieldname)
                                        .setCustomFields(customFields)
                                        .build();
        ContactCollection response = api.list(params);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ContactRetrieveTest() throws ApiException {
        String workspaceId = null;
        String contactId = null;
        String fields = null;
        String sortOrder = null;
        String sortFields = null;
        ContactRetrieveParams params = ContactRetrieveParams.builder()
                                        .setWorkspaceId(workspaceId)
                                        .setContactId(contactId)
                                        .setFields(fields)
                                        .setSortOrder(sortOrder)
                                        .setSortFields(sortFields)
                                        .build();
        Contact response = api.retrieve(params);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ContactUpdateTest() throws ApiException {
        String workspaceId = null;
        String contactId = null;
        String firstName = null;
        String lastName = null;
        String workMobilePhone1 = null;
        String workEmailAddress1 = null;
        String workCountry = null;
        String timezone = null;
        String title = null;
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
        ContactUpdateParams.StatusEnum status = null;
        String companyName = null;
        String jobTitle = null;
        String division = null;
        String businessUnit = null;
        String department = null;
        String teamName1 = null;
        String teamName2 = null;
        String role1 = null;
        String role2 = null;
        List<ContactUpdateParams.Location> locations = null; 
        List<ContactUpdateParams.MessagingOption> messagingoptions = null; 
        ContactUpdateParams params = ContactUpdateParams.builder()
                                        .setWorkspaceId(workspaceId)
                                        .setContactId(contactId)
                                        .setFirstName(firstName)
                                        .setLastName(lastName)
                                        .setWorkMobilePhone1(workMobilePhone1)
                                        .setWorkEmailAddress1(workEmailAddress1)
                                        .setWorkCountry(workCountry)
                                        .setTimezone(timezone)
                                        .setTitle(title)
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
                                        .setStatus(status)
                                        .setCompanyName(companyName)
                                        .setJobTitle(jobTitle)
                                        .setDivision(division)
                                        .setBusinessUnit(businessUnit)
                                        .setDepartment(department)
                                        .setTeamName1(teamName1)
                                        .setTeamName2(teamName2)
                                        .setRole1(role1)
                                        .setRole2(role2)
                                        .setLocations(locations)
                                        .setMessagingoptions(messagingoptions)
                                        .build();
        api.update(params);
        // TODO: test validations
    }

}
