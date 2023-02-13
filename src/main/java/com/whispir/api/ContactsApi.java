package com.whispir.api;

import com.whispir.Whispir;
import com.whispir.client.ApiCallback;
import com.whispir.client.ApiClient;
import com.whispir.client.ApiException;
import com.whispir.client.ApiResponse;
import com.whispir.client.Configuration;
import com.whispir.client.Pair;
import com.whispir.client.ProgressRequestBody;
import com.whispir.client.ProgressResponseBody;
import com.whispir.client.auth.ApiKeyAuth;
import com.whispir.client.Version;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import com.whispir.model.ApiError;
import java.math.BigDecimal;
import com.whispir.model.Contact;
import com.whispir.model.ContactCollection;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;
import javax.ws.rs.core.GenericType;
import java.net.URI;
import java.util.stream.Collectors;

public class ContactsApi {
    private static ApiClient localVarApiClient = Configuration.getDefaultApiClient();

    private static okhttp3.Call contactCreateCall(String workspaceId, String xApiKey, String accept, String contentType, Contact contact, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = contact;

        // create path and map variables
        String localVarPath = "/workspaces/{workspaceId}/contacts"
            .replace("{" + "workspaceId" + "}", localVarApiClient.escapeString(workspaceId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarHeaderParams.put("Authorization", String.format("Basic %s", authHeader));
        localVarHeaderParams.put("User-Agent", String.format("whispir-java-%s", Version.VERSION));

        if (xApiKey != null) {
            localVarHeaderParams.put("X-Api-Key", localVarApiClient.parameterToString(xApiKey));
        }

        if (accept != null) {
            localVarHeaderParams.put("Accept", localVarApiClient.parameterToString(accept));
        }

        if (contentType != null) {
            localVarHeaderParams.put("Content-Type", localVarApiClient.parameterToString(contentType));
        }

        final String[] localVarAccepts = {
            "application/vnd.whispir.contact-v1+json",
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/vnd.whispir.contact-v1+json",
            "application/vnd.whispir.contact-v1+xml"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth", "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private static okhttp3.Call contactCreateValidateBeforeCall(String workspaceId, String xApiKey, String accept, String contentType, Contact contact, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'workspaceId' is set
        if (workspaceId == null) {
            throw new ApiException("Missing the required parameter 'workspaceId' when calling contactCreate(Async)");
        }

        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling contactCreate(Async)");
        }

        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling contactCreate(Async)");
        }

        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new ApiException("Missing the required parameter 'contentType' when calling contactCreate(Async)");
        }

        // verify the required parameter 'contact' is set
        if (contact == null) {
            throw new ApiException("Missing the required parameter 'contact' when calling contactCreate(Async)");
        }

        return contactCreateCall(workspaceId, xApiKey, accept, contentType, contact, _callback);
    }

    private static ApiResponse<Contact> contactCreateWithHttpInfo(String workspaceId, String xApiKey, String accept, String contentType, Contact contact) throws ApiException {
        okhttp3.Call localVarCall = contactCreateCall(workspaceId, xApiKey, accept, contentType, contact, null);
        Type localVarReturnType = new TypeToken<Contact>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private static okhttp3.Call contactCreateAsync(String workspaceId, String xApiKey, String accept, String contentType, Contact contact, final ApiCallback<Contact> _callback) throws ApiException {
        okhttp3.Call localVarCall = contactCreateValidateBeforeCall(workspaceId, xApiKey, accept, contentType, contact, _callback);
        Type localVarReturnType = new TypeToken<Contact>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public static class ContactCreateParams {
        private String workspaceId;
        private Contact contact;
        private String firstName;
        private String lastName;
        private String workMobilePhone1;
        private String workEmailAddress1;
        private String workCountry;
        private String timezone;
        private String title;
        private String workMobilePhone2;
        private String workEmailAddress2;
        private String workPhoneAreaCode1;
        private String workPhone1;
        private String workPhoneAreaCode2;
        private String workPhone2;
        private String workFaxAreaCode1;
        private String workFax1;
        private String workSatellitePhone;
        private String workOtherPhone;
        private String workAddress1;
        private String workAddress2;
        private String workSuburb;
        private String workState;
        private String workPostCode;
        private String workPostalAddress1;
        private String workPostalAddress2;
        private String workPostalSuburb;
        private String workPostalState;
        private String workPostalPostCode;
        private String personalEmailAddress1;
        private String personalEmailAddress2;
        private String personalAddress1;
        private String personalAddress2;
        private String personalSuburb;
        private String personalState;
        private String personalPostCode;
        private String personalCountry;
        private String personalPhoneAreaCode1;
        private String personalPhone1;
        private String personalPhoneAreaCode2;
        private String personalPhone2;
        private String personalFaxAreaCode1;
        private String personalFax1;
        private String otherPhoneAreaCode1;
        private String otherPhone1;
        private String otherMobile;
        private String otherFirstName;
        private String otherLastName;
        private String otherTitle;
        private String status;
        private String companyName;
        private String jobTitle;
        private String division;
        private String businessUnit;
        private String department;
        private String teamName1;
        private String teamName2;
        private String role1;
        private String role2;
        private List<Location> locations;
        private List<MessagingOption> messagingoptions;

        private ContactCreateParams(
            String workspaceId,
            Contact contact,
            String firstName,
            String lastName,
            String workMobilePhone1,
            String workEmailAddress1,
            String workCountry,
            String timezone,
            String title,
            String workMobilePhone2,
            String workEmailAddress2,
            String workPhoneAreaCode1,
            String workPhone1,
            String workPhoneAreaCode2,
            String workPhone2,
            String workFaxAreaCode1,
            String workFax1,
            String workSatellitePhone,
            String workOtherPhone,
            String workAddress1,
            String workAddress2,
            String workSuburb,
            String workState,
            String workPostCode,
            String workPostalAddress1,
            String workPostalAddress2,
            String workPostalSuburb,
            String workPostalState,
            String workPostalPostCode,
            String personalEmailAddress1,
            String personalEmailAddress2,
            String personalAddress1,
            String personalAddress2,
            String personalSuburb,
            String personalState,
            String personalPostCode,
            String personalCountry,
            String personalPhoneAreaCode1,
            String personalPhone1,
            String personalPhoneAreaCode2,
            String personalPhone2,
            String personalFaxAreaCode1,
            String personalFax1,
            String otherPhoneAreaCode1,
            String otherPhone1,
            String otherMobile,
            String otherFirstName,
            String otherLastName,
            String otherTitle,
            String status,
            String companyName,
            String jobTitle,
            String division,
            String businessUnit,
            String department,
            String teamName1,
            String teamName2,
            String role1,
            String role2,
            List<Location> locations,
            List<MessagingOption> messagingoptions
        ){
            this.workspaceId = workspaceId;
            this.contact = contact;
            this.firstName = firstName;
            this.lastName = lastName;
            this.workMobilePhone1 = workMobilePhone1;
            this.workEmailAddress1 = workEmailAddress1;
            this.workCountry = workCountry;
            this.timezone = timezone;
            this.title = title;
            this.workMobilePhone2 = workMobilePhone2;
            this.workEmailAddress2 = workEmailAddress2;
            this.workPhoneAreaCode1 = workPhoneAreaCode1;
            this.workPhone1 = workPhone1;
            this.workPhoneAreaCode2 = workPhoneAreaCode2;
            this.workPhone2 = workPhone2;
            this.workFaxAreaCode1 = workFaxAreaCode1;
            this.workFax1 = workFax1;
            this.workSatellitePhone = workSatellitePhone;
            this.workOtherPhone = workOtherPhone;
            this.workAddress1 = workAddress1;
            this.workAddress2 = workAddress2;
            this.workSuburb = workSuburb;
            this.workState = workState;
            this.workPostCode = workPostCode;
            this.workPostalAddress1 = workPostalAddress1;
            this.workPostalAddress2 = workPostalAddress2;
            this.workPostalSuburb = workPostalSuburb;
            this.workPostalState = workPostalState;
            this.workPostalPostCode = workPostalPostCode;
            this.personalEmailAddress1 = personalEmailAddress1;
            this.personalEmailAddress2 = personalEmailAddress2;
            this.personalAddress1 = personalAddress1;
            this.personalAddress2 = personalAddress2;
            this.personalSuburb = personalSuburb;
            this.personalState = personalState;
            this.personalPostCode = personalPostCode;
            this.personalCountry = personalCountry;
            this.personalPhoneAreaCode1 = personalPhoneAreaCode1;
            this.personalPhone1 = personalPhone1;
            this.personalPhoneAreaCode2 = personalPhoneAreaCode2;
            this.personalPhone2 = personalPhone2;
            this.personalFaxAreaCode1 = personalFaxAreaCode1;
            this.personalFax1 = personalFax1;
            this.otherPhoneAreaCode1 = otherPhoneAreaCode1;
            this.otherPhone1 = otherPhone1;
            this.otherMobile = otherMobile;
            this.otherFirstName = otherFirstName;
            this.otherLastName = otherLastName;
            this.otherTitle = otherTitle;
            this.status = status;
            this.companyName = companyName;
            this.jobTitle = jobTitle;
            this.division = division;
            this.businessUnit = businessUnit;
            this.department = department;
            this.teamName1 = teamName1;
            this.teamName2 = teamName2;
            this.role1 = role1;
            this.role2 = role2;
            this.locations = locations;
            this.messagingoptions = messagingoptions;
        }
            public String getWorkspaceId() {
                return workspaceId;
            }
            public Contact getContact() {
                return contact;
            }
            public enum TypeEnum {
            PROJECT("PROJECT"),
            
            COMPANY("COMPANY");
                private String value;
                TypeEnum(String value){
                    this.value = value;
                }

                public String getValue() {
                    return value;
                }
                
                @Override
                public String toString() {
                    return String.valueOf(value);
                }

                public static TypeEnum fromValue(String value) {
                    for (TypeEnum b : TypeEnum.values()) {
                        if (b.value.equals(value)) {
                            return b;
                        }
                    }
                    throw new IllegalArgumentException("Unexpected value '" + value + "'");
                }

            }
            public String getFirstName() {
                return firstName;
            }
            public String getLastName() {
                return lastName;
            }
            public String getWorkMobilePhone1() {
                return workMobilePhone1;
            }
            public String getWorkEmailAddress1() {
                return workEmailAddress1;
            }
            public String getWorkCountry() {
                return workCountry;
            }
            public String getTimezone() {
                return timezone;
            }
            public String getTitle() {
                return title;
            }
            public String getWorkMobilePhone2() {
                return workMobilePhone2;
            }
            public String getWorkEmailAddress2() {
                return workEmailAddress2;
            }
            public String getWorkPhoneAreaCode1() {
                return workPhoneAreaCode1;
            }
            public String getWorkPhone1() {
                return workPhone1;
            }
            public String getWorkPhoneAreaCode2() {
                return workPhoneAreaCode2;
            }
            public String getWorkPhone2() {
                return workPhone2;
            }
            public String getWorkFaxAreaCode1() {
                return workFaxAreaCode1;
            }
            public String getWorkFax1() {
                return workFax1;
            }
            public String getWorkSatellitePhone() {
                return workSatellitePhone;
            }
            public String getWorkOtherPhone() {
                return workOtherPhone;
            }
            public String getWorkAddress1() {
                return workAddress1;
            }
            public String getWorkAddress2() {
                return workAddress2;
            }
            public String getWorkSuburb() {
                return workSuburb;
            }
            public String getWorkState() {
                return workState;
            }
            public String getWorkPostCode() {
                return workPostCode;
            }
            public String getWorkPostalAddress1() {
                return workPostalAddress1;
            }
            public String getWorkPostalAddress2() {
                return workPostalAddress2;
            }
            public String getWorkPostalSuburb() {
                return workPostalSuburb;
            }
            public String getWorkPostalState() {
                return workPostalState;
            }
            public String getWorkPostalPostCode() {
                return workPostalPostCode;
            }
            public String getPersonalEmailAddress1() {
                return personalEmailAddress1;
            }
            public String getPersonalEmailAddress2() {
                return personalEmailAddress2;
            }
            public String getPersonalAddress1() {
                return personalAddress1;
            }
            public String getPersonalAddress2() {
                return personalAddress2;
            }
            public String getPersonalSuburb() {
                return personalSuburb;
            }
            public String getPersonalState() {
                return personalState;
            }
            public String getPersonalPostCode() {
                return personalPostCode;
            }
            public String getPersonalCountry() {
                return personalCountry;
            }
            public String getPersonalPhoneAreaCode1() {
                return personalPhoneAreaCode1;
            }
            public String getPersonalPhone1() {
                return personalPhone1;
            }
            public String getPersonalPhoneAreaCode2() {
                return personalPhoneAreaCode2;
            }
            public String getPersonalPhone2() {
                return personalPhone2;
            }
            public String getPersonalFaxAreaCode1() {
                return personalFaxAreaCode1;
            }
            public String getPersonalFax1() {
                return personalFax1;
            }
            public String getOtherPhoneAreaCode1() {
                return otherPhoneAreaCode1;
            }
            public String getOtherPhone1() {
                return otherPhone1;
            }
            public String getOtherMobile() {
                return otherMobile;
            }
            public String getOtherFirstName() {
                return otherFirstName;
            }
            public String getOtherLastName() {
                return otherLastName;
            }
            public String getOtherTitle() {
                return otherTitle;
            }
            public enum StatusEnum {
            A("A"),
            
            D("D");
                private String value;
                StatusEnum(String value){
                    this.value = value;
                }

                public String getValue() {
                    return value;
                }
                
                @Override
                public String toString() {
                    return String.valueOf(value);
                }

                public static StatusEnum fromValue(String value) {
                    for (StatusEnum b : StatusEnum.values()) {
                        if (b.value.equals(value)) {
                            return b;
                        }
                    }
                    throw new IllegalArgumentException("Unexpected value '" + value + "'");
                }

            }
            public String getStatus() {
                return status;
            }
            public String getCompanyName() {
                return companyName;
            }
            public String getJobTitle() {
                return jobTitle;
            }
            public String getDivision() {
                return division;
            }
            public String getBusinessUnit() {
                return businessUnit;
            }
            public String getDepartment() {
                return department;
            }
            public String getTeamName1() {
                return teamName1;
            }
            public String getTeamName2() {
                return teamName2;
            }
            public String getRole1() {
                return role1;
            }
            public String getRole2() {
                return role2;
            }
            public List<Location> getLocations() {
                return locations;
            }
            public List<MessagingOption> getMessagingoptions() {
                return messagingoptions;
            }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private String workspaceId;
            private Contact contact;
            private String firstName;
            private String lastName;
            private String workMobilePhone1;
            private String workEmailAddress1;
            private String workCountry;
            private String timezone;
            private String title;
            private String workMobilePhone2;
            private String workEmailAddress2;
            private String workPhoneAreaCode1;
            private String workPhone1;
            private String workPhoneAreaCode2;
            private String workPhone2;
            private String workFaxAreaCode1;
            private String workFax1;
            private String workSatellitePhone;
            private String workOtherPhone;
            private String workAddress1;
            private String workAddress2;
            private String workSuburb;
            private String workState;
            private String workPostCode;
            private String workPostalAddress1;
            private String workPostalAddress2;
            private String workPostalSuburb;
            private String workPostalState;
            private String workPostalPostCode;
            private String personalEmailAddress1;
            private String personalEmailAddress2;
            private String personalAddress1;
            private String personalAddress2;
            private String personalSuburb;
            private String personalState;
            private String personalPostCode;
            private String personalCountry;
            private String personalPhoneAreaCode1;
            private String personalPhone1;
            private String personalPhoneAreaCode2;
            private String personalPhone2;
            private String personalFaxAreaCode1;
            private String personalFax1;
            private String otherPhoneAreaCode1;
            private String otherPhone1;
            private String otherMobile;
            private String otherFirstName;
            private String otherLastName;
            private String otherTitle;
            private String status;
            private String companyName;
            private String jobTitle;
            private String division;
            private String businessUnit;
            private String department;
            private String teamName1;
            private String teamName2;
            private String role1;
            private String role2;
            private List<Location> locations;
            private List<MessagingOption> messagingoptions;

            public ContactCreateParams build() {
                return new ContactCreateParams(
                    workspaceId,
                    contact,
                    firstName,
                    lastName,
                    workMobilePhone1,
                    workEmailAddress1,
                    workCountry,
                    timezone,
                    title,
                    workMobilePhone2,
                    workEmailAddress2,
                    workPhoneAreaCode1,
                    workPhone1,
                    workPhoneAreaCode2,
                    workPhone2,
                    workFaxAreaCode1,
                    workFax1,
                    workSatellitePhone,
                    workOtherPhone,
                    workAddress1,
                    workAddress2,
                    workSuburb,
                    workState,
                    workPostCode,
                    workPostalAddress1,
                    workPostalAddress2,
                    workPostalSuburb,
                    workPostalState,
                    workPostalPostCode,
                    personalEmailAddress1,
                    personalEmailAddress2,
                    personalAddress1,
                    personalAddress2,
                    personalSuburb,
                    personalState,
                    personalPostCode,
                    personalCountry,
                    personalPhoneAreaCode1,
                    personalPhone1,
                    personalPhoneAreaCode2,
                    personalPhone2,
                    personalFaxAreaCode1,
                    personalFax1,
                    otherPhoneAreaCode1,
                    otherPhone1,
                    otherMobile,
                    otherFirstName,
                    otherLastName,
                    otherTitle,
                    status,
                    companyName,
                    jobTitle,
                    division,
                    businessUnit,
                    department,
                    teamName1,
                    teamName2,
                    role1,
                    role2,
                    locations,
                    messagingoptions
                );
            }

            public Builder setWorkspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }
            public Builder setContact(Contact contact) {
                this.contact = contact;
                return this;
            }
            public Builder setFirstName(String firstName) {
                this.firstName = firstName;
                return this;
            }
            public Builder setLastName(String lastName) {
                this.lastName = lastName;
                return this;
            }
            public Builder setWorkMobilePhone1(String workMobilePhone1) {
                this.workMobilePhone1 = workMobilePhone1;
                return this;
            }
            public Builder setWorkEmailAddress1(String workEmailAddress1) {
                this.workEmailAddress1 = workEmailAddress1;
                return this;
            }
            public Builder setWorkCountry(String workCountry) {
                this.workCountry = workCountry;
                return this;
            }
            public Builder setTimezone(String timezone) {
                this.timezone = timezone;
                return this;
            }
            public Builder setTitle(String title) {
                this.title = title;
                return this;
            }
            public Builder setWorkMobilePhone2(String workMobilePhone2) {
                this.workMobilePhone2 = workMobilePhone2;
                return this;
            }
            public Builder setWorkEmailAddress2(String workEmailAddress2) {
                this.workEmailAddress2 = workEmailAddress2;
                return this;
            }
            public Builder setWorkPhoneAreaCode1(String workPhoneAreaCode1) {
                this.workPhoneAreaCode1 = workPhoneAreaCode1;
                return this;
            }
            public Builder setWorkPhone1(String workPhone1) {
                this.workPhone1 = workPhone1;
                return this;
            }
            public Builder setWorkPhoneAreaCode2(String workPhoneAreaCode2) {
                this.workPhoneAreaCode2 = workPhoneAreaCode2;
                return this;
            }
            public Builder setWorkPhone2(String workPhone2) {
                this.workPhone2 = workPhone2;
                return this;
            }
            public Builder setWorkFaxAreaCode1(String workFaxAreaCode1) {
                this.workFaxAreaCode1 = workFaxAreaCode1;
                return this;
            }
            public Builder setWorkFax1(String workFax1) {
                this.workFax1 = workFax1;
                return this;
            }
            public Builder setWorkSatellitePhone(String workSatellitePhone) {
                this.workSatellitePhone = workSatellitePhone;
                return this;
            }
            public Builder setWorkOtherPhone(String workOtherPhone) {
                this.workOtherPhone = workOtherPhone;
                return this;
            }
            public Builder setWorkAddress1(String workAddress1) {
                this.workAddress1 = workAddress1;
                return this;
            }
            public Builder setWorkAddress2(String workAddress2) {
                this.workAddress2 = workAddress2;
                return this;
            }
            public Builder setWorkSuburb(String workSuburb) {
                this.workSuburb = workSuburb;
                return this;
            }
            public Builder setWorkState(String workState) {
                this.workState = workState;
                return this;
            }
            public Builder setWorkPostCode(String workPostCode) {
                this.workPostCode = workPostCode;
                return this;
            }
            public Builder setWorkPostalAddress1(String workPostalAddress1) {
                this.workPostalAddress1 = workPostalAddress1;
                return this;
            }
            public Builder setWorkPostalAddress2(String workPostalAddress2) {
                this.workPostalAddress2 = workPostalAddress2;
                return this;
            }
            public Builder setWorkPostalSuburb(String workPostalSuburb) {
                this.workPostalSuburb = workPostalSuburb;
                return this;
            }
            public Builder setWorkPostalState(String workPostalState) {
                this.workPostalState = workPostalState;
                return this;
            }
            public Builder setWorkPostalPostCode(String workPostalPostCode) {
                this.workPostalPostCode = workPostalPostCode;
                return this;
            }
            public Builder setPersonalEmailAddress1(String personalEmailAddress1) {
                this.personalEmailAddress1 = personalEmailAddress1;
                return this;
            }
            public Builder setPersonalEmailAddress2(String personalEmailAddress2) {
                this.personalEmailAddress2 = personalEmailAddress2;
                return this;
            }
            public Builder setPersonalAddress1(String personalAddress1) {
                this.personalAddress1 = personalAddress1;
                return this;
            }
            public Builder setPersonalAddress2(String personalAddress2) {
                this.personalAddress2 = personalAddress2;
                return this;
            }
            public Builder setPersonalSuburb(String personalSuburb) {
                this.personalSuburb = personalSuburb;
                return this;
            }
            public Builder setPersonalState(String personalState) {
                this.personalState = personalState;
                return this;
            }
            public Builder setPersonalPostCode(String personalPostCode) {
                this.personalPostCode = personalPostCode;
                return this;
            }
            public Builder setPersonalCountry(String personalCountry) {
                this.personalCountry = personalCountry;
                return this;
            }
            public Builder setPersonalPhoneAreaCode1(String personalPhoneAreaCode1) {
                this.personalPhoneAreaCode1 = personalPhoneAreaCode1;
                return this;
            }
            public Builder setPersonalPhone1(String personalPhone1) {
                this.personalPhone1 = personalPhone1;
                return this;
            }
            public Builder setPersonalPhoneAreaCode2(String personalPhoneAreaCode2) {
                this.personalPhoneAreaCode2 = personalPhoneAreaCode2;
                return this;
            }
            public Builder setPersonalPhone2(String personalPhone2) {
                this.personalPhone2 = personalPhone2;
                return this;
            }
            public Builder setPersonalFaxAreaCode1(String personalFaxAreaCode1) {
                this.personalFaxAreaCode1 = personalFaxAreaCode1;
                return this;
            }
            public Builder setPersonalFax1(String personalFax1) {
                this.personalFax1 = personalFax1;
                return this;
            }
            public Builder setOtherPhoneAreaCode1(String otherPhoneAreaCode1) {
                this.otherPhoneAreaCode1 = otherPhoneAreaCode1;
                return this;
            }
            public Builder setOtherPhone1(String otherPhone1) {
                this.otherPhone1 = otherPhone1;
                return this;
            }
            public Builder setOtherMobile(String otherMobile) {
                this.otherMobile = otherMobile;
                return this;
            }
            public Builder setOtherFirstName(String otherFirstName) {
                this.otherFirstName = otherFirstName;
                return this;
            }
            public Builder setOtherLastName(String otherLastName) {
                this.otherLastName = otherLastName;
                return this;
            }
            public Builder setOtherTitle(String otherTitle) {
                this.otherTitle = otherTitle;
                return this;
            }
            public Builder setStatus(StatusEnum status) {
                this.status = status.getValue();
                return this;
            }
            public Builder setCompanyName(String companyName) {
                this.companyName = companyName;
                return this;
            }
            public Builder setJobTitle(String jobTitle) {
                this.jobTitle = jobTitle;
                return this;
            }
            public Builder setDivision(String division) {
                this.division = division;
                return this;
            }
            public Builder setBusinessUnit(String businessUnit) {
                this.businessUnit = businessUnit;
                return this;
            }
            public Builder setDepartment(String department) {
                this.department = department;
                return this;
            }
            public Builder setTeamName1(String teamName1) {
                this.teamName1 = teamName1;
                return this;
            }
            public Builder setTeamName2(String teamName2) {
                this.teamName2 = teamName2;
                return this;
            }
            public Builder setRole1(String role1) {
                this.role1 = role1;
                return this;
            }
            public Builder setRole2(String role2) {
                this.role2 = role2;
                return this;
            }
            public Builder setLocations(List<Location> locations) {
                this.locations = locations;
                return this;
            }
            public Builder setMessagingoptions(List<MessagingOption> messagingoptions) {
                this.messagingoptions = messagingoptions;
                return this;
            }
        }
        
    public static class Location {
        private BigDecimal latitude;
        private BigDecimal longitude;
        private String type;

        private Location(BigDecimal latitude,BigDecimal longitude,String type){
            this.latitude = latitude;
            this.longitude = longitude;
            this.type = type;
        }

        public BigDecimal getLatitude(){
            return latitude;
        }
        public BigDecimal getLongitude(){
            return longitude;
        }
        public String getType(){
            return type;
        }

        public static Builder builder() {
            return new Builder();
        }   

        public static class Builder {
            private BigDecimal latitude;
            private BigDecimal longitude;
            private String type;

            public Location build() {
                return new Location(
                   this.latitude,
                   this.longitude,
                   this.type
                );
            }
            public Builder setLatitude(BigDecimal latitude) {
                this.latitude = latitude;
                return this;
            }
            public Builder setLongitude(BigDecimal longitude) {
                this.longitude = longitude;
                return this;
            }
            public Builder setType(String type) {
                this.type = type;
                return this;
            }
        }

    
    }
    public static class MessagingOption {
        private String channel;
        private Boolean enabled;
        private String primary;
        private String secondary;
        private String tertiary;

        private MessagingOption(String channel,Boolean enabled,String primary,String secondary,String tertiary){
            this.channel = channel;
            this.enabled = enabled;
            this.primary = primary;
            this.secondary = secondary;
            this.tertiary = tertiary;
        }

        public String getChannel(){
            return channel;
        }
            public enum ChannelEnum {
                SMS("sms"),
                EMAIL("email"),
                VOICE("voice");
                ChannelEnum(String value){
                    this.value = value;
                }

                private String value;
                public String getValue() {
                    return value;
                }
                
                @Override
                public String toString() {
                    return String.valueOf(value);
                }

                public static ChannelEnum fromValue(String value) {
                    for (ChannelEnum b : ChannelEnum.values()) {
                        if (b.value.equals(value)) {
                            return b;
                        }
                    }
                    throw new IllegalArgumentException("Unexpected value '" + value + "'");
                }

            }
        public Boolean getEnabled(){
            return enabled;
        }
        public String getPrimary(){
            return primary;
        }
            public enum PrimaryEnum {
                WORKMOBILEPHONE1("WorkMobilePhone1"),
                WORKMOBILEPHONE2("WorkMobilePhone2"),
                WORKEMAILADDRESS1("WorkEmailAddress1"),
                WORKEMAILADDRESS2("WorkEmailAddress2"),
                PERSONALMOBILEPHONE1("PersonalMobilePhone1"),
                PERSONALEMAILADDRESS1("PersonalEmailAddress1");
                PrimaryEnum(String value){
                    this.value = value;
                }

                private String value;
                public String getValue() {
                    return value;
                }
                
                @Override
                public String toString() {
                    return String.valueOf(value);
                }

                public static PrimaryEnum fromValue(String value) {
                    for (PrimaryEnum b : PrimaryEnum.values()) {
                        if (b.value.equals(value)) {
                            return b;
                        }
                    }
                    throw new IllegalArgumentException("Unexpected value '" + value + "'");
                }

            }
        public String getSecondary(){
            return secondary;
        }
            public enum SecondaryEnum {
                WORKMOBILEPHONE1("WorkMobilePhone1"),
                WORKMOBILEPHONE2("WorkMobilePhone2"),
                WORKEMAILADDRESS1("WorkEmailAddress1"),
                WORKEMAILADDRESS2("WorkEmailAddress2"),
                PERSONALMOBILEPHONE1("PersonalMobilePhone1"),
                PERSONALEMAILADDRESS1("PersonalEmailAddress1");
                SecondaryEnum(String value){
                    this.value = value;
                }

                private String value;
                public String getValue() {
                    return value;
                }
                
                @Override
                public String toString() {
                    return String.valueOf(value);
                }

                public static SecondaryEnum fromValue(String value) {
                    for (SecondaryEnum b : SecondaryEnum.values()) {
                        if (b.value.equals(value)) {
                            return b;
                        }
                    }
                    throw new IllegalArgumentException("Unexpected value '" + value + "'");
                }

            }
        public String getTertiary(){
            return tertiary;
        }
            public enum TertiaryEnum {
                WORKMOBILEPHONE1("WorkMobilePhone1"),
                WORKMOBILEPHONE2("WorkMobilePhone2"),
                WORKEMAILADDRESS1("WorkEmailAddress1"),
                WORKEMAILADDRESS2("WorkEmailAddress2"),
                PERSONALMOBILEPHONE1("PersonalMobilePhone1"),
                PERSONALEMAILADDRESS1("PersonalEmailAddress1");
                TertiaryEnum(String value){
                    this.value = value;
                }

                private String value;
                public String getValue() {
                    return value;
                }
                
                @Override
                public String toString() {
                    return String.valueOf(value);
                }

                public static TertiaryEnum fromValue(String value) {
                    for (TertiaryEnum b : TertiaryEnum.values()) {
                        if (b.value.equals(value)) {
                            return b;
                        }
                    }
                    throw new IllegalArgumentException("Unexpected value '" + value + "'");
                }

            }

        public static Builder builder() {
            return new Builder();
        }   

        public static class Builder {
            private String channel;
            private Boolean enabled;
            private String primary;
            private String secondary;
            private String tertiary;

            public MessagingOption build() {
                return new MessagingOption(
                   this.channel,
                   this.enabled,
                   this.primary,
                   this.secondary,
                   this.tertiary
                );
            }
            public Builder setChannel(ChannelEnum channel) {
                this.channel = channel.getValue();
                return this;
            }
            public Builder setEnabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }
            public Builder setPrimary(PrimaryEnum primary) {
                this.primary = primary.getValue();
                return this;
            }
            public Builder setSecondary(SecondaryEnum secondary) {
                this.secondary = secondary.getValue();
                return this;
            }
            public Builder setTertiary(TertiaryEnum tertiary) {
                this.tertiary = tertiary.getValue();
                return this;
            }
        }

    
    }

    }

    public static class ContactCreateRequest {
        private final String workspaceId;
        private final String xApiKey;
        private final String accept;
        private final String contentType;
        private final Contact contact;
        ApiResponse _lastResponse;

        private ContactCreateRequest(String workspaceId, String xApiKey, String accept, String contentType, Contact contact) {
            this.workspaceId = workspaceId;
            this.xApiKey = xApiKey;
            this.accept = accept;
            this.contentType = contentType;
            this.contact = contact;
        }

        /**
         * Build call for contactCreate
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return contactCreateCall(workspaceId, xApiKey, accept, contentType, contact, _callback);
        }

        /**
         * Execute contactCreate request
         * @return Contact
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public Contact execute() throws ApiException {
            ApiResponse<Contact> localVarResp = contactCreateWithHttpInfo(workspaceId, xApiKey, accept, contentType, contact);
            _lastResponse = localVarResp;
            Contact data = localVarResp.getData();

            
            // Special case to extract the resource identifier from the `Location` header.
            // TODO: remove this when ID is returned in response body
            String locationHeader = localVarResp.getHeaders().get("Location").get(0);
            Pattern pattern = Pattern.compile("/([^/]+)/?$", Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(locationHeader);
            if (matcher.find()) {
                data.setDocId(matcher.group(1));
            }
            
            data.lastResponse = localVarResp;
            return data;
        }
        /**
         * Return the last executed API response
         * @return ApiResponse
         */
        public ApiResponse getLastResponse()  {
            return _lastResponse;
        }


        /**
         * Execute contactCreate request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<Contact> _callback) throws ApiException {
            return contactCreateAsync(workspaceId, xApiKey, accept, contentType, contact, _callback);
        }
    }

    /**
     * Create a contact
     * @param params The param instance required to create ContactCreateRequest
     * @return Contact
     */

    public static Contact create(Map<String, Object> params) throws ApiException {
        String workspaceId = (String) params.get("workspaceId");

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }
        String firstNameValue = (String) params.get("firstName");
        if(firstNameValue == null) {
            throw new ApiException("Missing the required property value of 'firstName'");
        }
        String lastNameValue = (String) params.get("lastName");
        if(lastNameValue == null) {
            throw new ApiException("Missing the required property value of 'lastName'");
        }
        String workMobilePhone1Value = (String) params.get("workMobilePhone1");
        if(workMobilePhone1Value == null) {
            throw new ApiException("Missing the required property value of 'workMobilePhone1'");
        }
        String workEmailAddress1Value = (String) params.get("workEmailAddress1");
        if(workEmailAddress1Value == null) {
            throw new ApiException("Missing the required property value of 'workEmailAddress1'");
        }
        String workCountryValue = (String) params.get("workCountry");
        if(workCountryValue == null) {
            throw new ApiException("Missing the required property value of 'workCountry'");
        }
        String timezoneValue = (String) params.get("timezone");
        if(timezoneValue == null) {
            throw new ApiException("Missing the required property value of 'timezone'");
        }
        String titleValue = (String) params.get("title");
        String workMobilePhone2Value = (String) params.get("workMobilePhone2");
        String workEmailAddress2Value = (String) params.get("workEmailAddress2");
        String workPhoneAreaCode1Value = (String) params.get("workPhoneAreaCode1");
        String workPhone1Value = (String) params.get("workPhone1");
        String workPhoneAreaCode2Value = (String) params.get("workPhoneAreaCode2");
        String workPhone2Value = (String) params.get("workPhone2");
        String workFaxAreaCode1Value = (String) params.get("workFaxAreaCode1");
        String workFax1Value = (String) params.get("workFax1");
        String workSatellitePhoneValue = (String) params.get("workSatellitePhone");
        String workOtherPhoneValue = (String) params.get("workOtherPhone");
        String workAddress1Value = (String) params.get("workAddress1");
        String workAddress2Value = (String) params.get("workAddress2");
        String workSuburbValue = (String) params.get("workSuburb");
        String workStateValue = (String) params.get("workState");
        String workPostCodeValue = (String) params.get("workPostCode");
        String workPostalAddress1Value = (String) params.get("workPostalAddress1");
        String workPostalAddress2Value = (String) params.get("workPostalAddress2");
        String workPostalSuburbValue = (String) params.get("workPostalSuburb");
        String workPostalStateValue = (String) params.get("workPostalState");
        String workPostalPostCodeValue = (String) params.get("workPostalPostCode");
        String personalEmailAddress1Value = (String) params.get("personalEmailAddress1");
        String personalEmailAddress2Value = (String) params.get("personalEmailAddress2");
        String personalAddress1Value = (String) params.get("personalAddress1");
        String personalAddress2Value = (String) params.get("personalAddress2");
        String personalSuburbValue = (String) params.get("personalSuburb");
        String personalStateValue = (String) params.get("personalState");
        String personalPostCodeValue = (String) params.get("personalPostCode");
        String personalCountryValue = (String) params.get("personalCountry");
        String personalPhoneAreaCode1Value = (String) params.get("personalPhoneAreaCode1");
        String personalPhone1Value = (String) params.get("personalPhone1");
        String personalPhoneAreaCode2Value = (String) params.get("personalPhoneAreaCode2");
        String personalPhone2Value = (String) params.get("personalPhone2");
        String personalFaxAreaCode1Value = (String) params.get("personalFaxAreaCode1");
        String personalFax1Value = (String) params.get("personalFax1");
        String otherPhoneAreaCode1Value = (String) params.get("otherPhoneAreaCode1");
        String otherPhone1Value = (String) params.get("otherPhone1");
        String otherMobileValue = (String) params.get("otherMobile");
        String otherFirstNameValue = (String) params.get("otherFirstName");
        String otherLastNameValue = (String) params.get("otherLastName");
        String otherTitleValue = (String) params.get("otherTitle");
        com.whispir.api.ContactsApi.ContactCreateParams.StatusEnum statusValue = com.whispir.api.ContactsApi.ContactCreateParams.StatusEnum.valueOf((String) params.get("status"));
        String companyNameValue = (String) params.get("companyName");
        String jobTitleValue = (String) params.get("jobTitle");
        String divisionValue = (String) params.get("division");
        String businessUnitValue = (String) params.get("businessUnit");
        String departmentValue = (String) params.get("department");
        String teamName1Value = (String) params.get("teamName1");
        String teamName2Value = (String) params.get("teamName2");
        String role1Value = (String) params.get("role1");
        String role2Value = (String) params.get("role2");
        List<Object> locations = Arrays.asList(params.get("locations"));
        List<com.whispir.api.ContactsApi.ContactCreateParams.Location> locationsValue = null;
        if(locations != null) {
            locationsValue = locations.stream()
                .map(e -> (com.whispir.api.ContactsApi.ContactCreateParams.Location) e).collect(Collectors.toList());
        }
        List<Object> messagingoptions = Arrays.asList(params.get("messagingoptions"));
        List<com.whispir.api.ContactsApi.ContactCreateParams.MessagingOption> messagingoptionsValue = null;
        if(messagingoptions != null) {
            messagingoptionsValue = messagingoptions.stream()
                .map(e -> (com.whispir.api.ContactsApi.ContactCreateParams.MessagingOption) e).collect(Collectors.toList());
        }
        ContactCreateParams tempParams = ContactCreateParams.builder()
            .setWorkspaceId(workspaceId)
            .setFirstName(firstNameValue)
            .setLastName(lastNameValue)
            .setWorkMobilePhone1(workMobilePhone1Value)
            .setWorkEmailAddress1(workEmailAddress1Value)
            .setWorkCountry(workCountryValue)
            .setTimezone(timezoneValue)
            .setTitle(titleValue)
            .setWorkMobilePhone2(workMobilePhone2Value)
            .setWorkEmailAddress2(workEmailAddress2Value)
            .setWorkPhoneAreaCode1(workPhoneAreaCode1Value)
            .setWorkPhone1(workPhone1Value)
            .setWorkPhoneAreaCode2(workPhoneAreaCode2Value)
            .setWorkPhone2(workPhone2Value)
            .setWorkFaxAreaCode1(workFaxAreaCode1Value)
            .setWorkFax1(workFax1Value)
            .setWorkSatellitePhone(workSatellitePhoneValue)
            .setWorkOtherPhone(workOtherPhoneValue)
            .setWorkAddress1(workAddress1Value)
            .setWorkAddress2(workAddress2Value)
            .setWorkSuburb(workSuburbValue)
            .setWorkState(workStateValue)
            .setWorkPostCode(workPostCodeValue)
            .setWorkPostalAddress1(workPostalAddress1Value)
            .setWorkPostalAddress2(workPostalAddress2Value)
            .setWorkPostalSuburb(workPostalSuburbValue)
            .setWorkPostalState(workPostalStateValue)
            .setWorkPostalPostCode(workPostalPostCodeValue)
            .setPersonalEmailAddress1(personalEmailAddress1Value)
            .setPersonalEmailAddress2(personalEmailAddress2Value)
            .setPersonalAddress1(personalAddress1Value)
            .setPersonalAddress2(personalAddress2Value)
            .setPersonalSuburb(personalSuburbValue)
            .setPersonalState(personalStateValue)
            .setPersonalPostCode(personalPostCodeValue)
            .setPersonalCountry(personalCountryValue)
            .setPersonalPhoneAreaCode1(personalPhoneAreaCode1Value)
            .setPersonalPhone1(personalPhone1Value)
            .setPersonalPhoneAreaCode2(personalPhoneAreaCode2Value)
            .setPersonalPhone2(personalPhone2Value)
            .setPersonalFaxAreaCode1(personalFaxAreaCode1Value)
            .setPersonalFax1(personalFax1Value)
            .setOtherPhoneAreaCode1(otherPhoneAreaCode1Value)
            .setOtherPhone1(otherPhone1Value)
            .setOtherMobile(otherMobileValue)
            .setOtherFirstName(otherFirstNameValue)
            .setOtherLastName(otherLastNameValue)
            .setOtherTitle(otherTitleValue)
            .setStatus(statusValue)
            .setCompanyName(companyNameValue)
            .setJobTitle(jobTitleValue)
            .setDivision(divisionValue)
            .setBusinessUnit(businessUnitValue)
            .setDepartment(departmentValue)
            .setTeamName1(teamName1Value)
            .setTeamName2(teamName2Value)
            .setRole1(role1Value)
            .setRole2(role2Value)
            .setLocations(locationsValue)
            .setMessagingoptions(messagingoptionsValue).build();

        return create(tempParams);
    }

    public static Contact create(ContactCreateParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }


        String workspaceId = params.getWorkspaceId();

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }

        String accept = "application/vnd.whispir.contact-v1+json";

        String contentType = "application/vnd.whispir.contact-v1+json";


        // Constructing 'Contact' from 'ContactCreateParams' instance passed
        Contact contact = new Contact();
        String firstNameValue = params.getFirstName();
        if(firstNameValue == null) {
            throw new ApiException("Missing the required property value of 'firstName'");
        }
        contact.setFirstName(firstNameValue);

        String lastNameValue = params.getLastName();
        if(lastNameValue == null) {
            throw new ApiException("Missing the required property value of 'lastName'");
        }
        contact.setLastName(lastNameValue);

        String workMobilePhone1Value = params.getWorkMobilePhone1();
        if(workMobilePhone1Value == null) {
            throw new ApiException("Missing the required property value of 'workMobilePhone1'");
        }
        contact.setWorkMobilePhone1(workMobilePhone1Value);

        String workEmailAddress1Value = params.getWorkEmailAddress1();
        if(workEmailAddress1Value == null) {
            throw new ApiException("Missing the required property value of 'workEmailAddress1'");
        }
        contact.setWorkEmailAddress1(workEmailAddress1Value);

        String workCountryValue = params.getWorkCountry();
        if(workCountryValue == null) {
            throw new ApiException("Missing the required property value of 'workCountry'");
        }
        contact.setWorkCountry(workCountryValue);

        String timezoneValue = params.getTimezone();
        if(timezoneValue == null) {
            throw new ApiException("Missing the required property value of 'timezone'");
        }
        contact.setTimezone(timezoneValue);

        String titleValue = params.getTitle();
        contact.setTitle(titleValue);

        String workMobilePhone2Value = params.getWorkMobilePhone2();
        contact.setWorkMobilePhone2(workMobilePhone2Value);

        String workEmailAddress2Value = params.getWorkEmailAddress2();
        contact.setWorkEmailAddress2(workEmailAddress2Value);

        String workPhoneAreaCode1Value = params.getWorkPhoneAreaCode1();
        contact.setWorkPhoneAreaCode1(workPhoneAreaCode1Value);

        String workPhone1Value = params.getWorkPhone1();
        contact.setWorkPhone1(workPhone1Value);

        String workPhoneAreaCode2Value = params.getWorkPhoneAreaCode2();
        contact.setWorkPhoneAreaCode2(workPhoneAreaCode2Value);

        String workPhone2Value = params.getWorkPhone2();
        contact.setWorkPhone2(workPhone2Value);

        String workFaxAreaCode1Value = params.getWorkFaxAreaCode1();
        contact.setWorkFaxAreaCode1(workFaxAreaCode1Value);

        String workFax1Value = params.getWorkFax1();
        contact.setWorkFax1(workFax1Value);

        String workSatellitePhoneValue = params.getWorkSatellitePhone();
        contact.setWorkSatellitePhone(workSatellitePhoneValue);

        String workOtherPhoneValue = params.getWorkOtherPhone();
        contact.setWorkOtherPhone(workOtherPhoneValue);

        String workAddress1Value = params.getWorkAddress1();
        contact.setWorkAddress1(workAddress1Value);

        String workAddress2Value = params.getWorkAddress2();
        contact.setWorkAddress2(workAddress2Value);

        String workSuburbValue = params.getWorkSuburb();
        contact.setWorkSuburb(workSuburbValue);

        String workStateValue = params.getWorkState();
        contact.setWorkState(workStateValue);

        String workPostCodeValue = params.getWorkPostCode();
        contact.setWorkPostCode(workPostCodeValue);

        String workPostalAddress1Value = params.getWorkPostalAddress1();
        contact.setWorkPostalAddress1(workPostalAddress1Value);

        String workPostalAddress2Value = params.getWorkPostalAddress2();
        contact.setWorkPostalAddress2(workPostalAddress2Value);

        String workPostalSuburbValue = params.getWorkPostalSuburb();
        contact.setWorkPostalSuburb(workPostalSuburbValue);

        String workPostalStateValue = params.getWorkPostalState();
        contact.setWorkPostalState(workPostalStateValue);

        String workPostalPostCodeValue = params.getWorkPostalPostCode();
        contact.setWorkPostalPostCode(workPostalPostCodeValue);

        String personalEmailAddress1Value = params.getPersonalEmailAddress1();
        contact.setPersonalEmailAddress1(personalEmailAddress1Value);

        String personalEmailAddress2Value = params.getPersonalEmailAddress2();
        contact.setPersonalEmailAddress2(personalEmailAddress2Value);

        String personalAddress1Value = params.getPersonalAddress1();
        contact.setPersonalAddress1(personalAddress1Value);

        String personalAddress2Value = params.getPersonalAddress2();
        contact.setPersonalAddress2(personalAddress2Value);

        String personalSuburbValue = params.getPersonalSuburb();
        contact.setPersonalSuburb(personalSuburbValue);

        String personalStateValue = params.getPersonalState();
        contact.setPersonalState(personalStateValue);

        String personalPostCodeValue = params.getPersonalPostCode();
        contact.setPersonalPostCode(personalPostCodeValue);

        String personalCountryValue = params.getPersonalCountry();
        contact.setPersonalCountry(personalCountryValue);

        String personalPhoneAreaCode1Value = params.getPersonalPhoneAreaCode1();
        contact.setPersonalPhoneAreaCode1(personalPhoneAreaCode1Value);

        String personalPhone1Value = params.getPersonalPhone1();
        contact.setPersonalPhone1(personalPhone1Value);

        String personalPhoneAreaCode2Value = params.getPersonalPhoneAreaCode2();
        contact.setPersonalPhoneAreaCode2(personalPhoneAreaCode2Value);

        String personalPhone2Value = params.getPersonalPhone2();
        contact.setPersonalPhone2(personalPhone2Value);

        String personalFaxAreaCode1Value = params.getPersonalFaxAreaCode1();
        contact.setPersonalFaxAreaCode1(personalFaxAreaCode1Value);

        String personalFax1Value = params.getPersonalFax1();
        contact.setPersonalFax1(personalFax1Value);

        String otherPhoneAreaCode1Value = params.getOtherPhoneAreaCode1();
        contact.setOtherPhoneAreaCode1(otherPhoneAreaCode1Value);

        String otherPhone1Value = params.getOtherPhone1();
        contact.setOtherPhone1(otherPhone1Value);

        String otherMobileValue = params.getOtherMobile();
        contact.setOtherMobile(otherMobileValue);

        String otherFirstNameValue = params.getOtherFirstName();
        contact.setOtherFirstName(otherFirstNameValue);

        String otherLastNameValue = params.getOtherLastName();
        contact.setOtherLastName(otherLastNameValue);

        String otherTitleValue = params.getOtherTitle();
        contact.setOtherTitle(otherTitleValue);

        String statusValue = params.getStatus();
        contact.setStatus(statusValue);

        String companyNameValue = params.getCompanyName();
        contact.setCompanyName(companyNameValue);

        String jobTitleValue = params.getJobTitle();
        contact.setJobTitle(jobTitleValue);

        String divisionValue = params.getDivision();
        contact.setDivision(divisionValue);

        String businessUnitValue = params.getBusinessUnit();
        contact.setBusinessUnit(businessUnitValue);

        String departmentValue = params.getDepartment();
        contact.setDepartment(departmentValue);

        String teamName1Value = params.getTeamName1();
        contact.setTeamName1(teamName1Value);

        String teamName2Value = params.getTeamName2();
        contact.setTeamName2(teamName2Value);

        String role1Value = params.getRole1();
        contact.setRole1(role1Value);

        String role2Value = params.getRole2();
        contact.setRole2(role2Value);

        List<com.whispir.api.ContactsApi.ContactCreateParams.Location> locationsList = params.getLocations();
        List<com.whispir.model.Location> locationsValue = null;
        if(locationsList != null) {
            List<Object> locations = new ArrayList<Object>(params.getLocations());
            locationsValue = locations.stream()
                .map(e -> (com.whispir.model.Location) e).collect(Collectors.toList());
        }
        contact.setLocations(locationsValue);

        List<com.whispir.api.ContactsApi.ContactCreateParams.MessagingOption> messagingoptionsList = params.getMessagingoptions();
        List<com.whispir.model.MessagingOption> messagingoptionsValue = null;
        if(messagingoptionsList != null) {
            List<Object> messagingoptions = new ArrayList<Object>(params.getMessagingoptions());
            messagingoptionsValue = messagingoptions.stream()
                .map(e -> (com.whispir.model.MessagingOption) e).collect(Collectors.toList());
        }
        contact.setMessagingoptions(messagingoptionsValue);

        ContactCreateRequest request = new ContactCreateRequest(workspaceId, xApiKey, accept, contentType, contact);

        // Ensure to include all of the 'optionalParams' that are passed

        return request.execute();
    }
    private static okhttp3.Call contactDeleteCall(String workspaceId, String xApiKey, String contactId, String action, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/workspaces/{workspaceId}/contacts/{contactId}"
            .replace("{" + "workspaceId" + "}", localVarApiClient.escapeString(workspaceId.toString()))
            .replace("{" + "contactId" + "}", localVarApiClient.escapeString(contactId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarHeaderParams.put("Authorization", String.format("Basic %s", authHeader));
        localVarHeaderParams.put("User-Agent", String.format("whispir-java-%s", Version.VERSION));

        if (action != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("action", action));
        }

        if (xApiKey != null) {
            localVarHeaderParams.put("X-Api-Key", localVarApiClient.parameterToString(xApiKey));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth", "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private static okhttp3.Call contactDeleteValidateBeforeCall(String workspaceId, String xApiKey, String contactId, String action, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'workspaceId' is set
        if (workspaceId == null) {
            throw new ApiException("Missing the required parameter 'workspaceId' when calling contactDelete(Async)");
        }

        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling contactDelete(Async)");
        }

        // verify the required parameter 'contactId' is set
        if (contactId == null) {
            throw new ApiException("Missing the required parameter 'contactId' when calling contactDelete(Async)");
        }

        return contactDeleteCall(workspaceId, xApiKey, contactId, action, _callback);
    }

    private static ApiResponse<Void> contactDeleteWithHttpInfo(String workspaceId, String xApiKey, String contactId, String action) throws ApiException {
        okhttp3.Call localVarCall = contactDeleteCall(workspaceId, xApiKey, contactId, action, null);
        return localVarApiClient.execute(localVarCall);
    }

    private static okhttp3.Call contactDeleteAsync(String workspaceId, String xApiKey, String contactId, String action, final ApiCallback<Void> _callback) throws ApiException {
        okhttp3.Call localVarCall = contactDeleteValidateBeforeCall(workspaceId, xApiKey, contactId, action, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public static class ContactDeleteParams {
        private String workspaceId;
        private String contactId;
        private String action;

        private ContactDeleteParams(
            String workspaceId,
            String contactId,
            String action
        ){
            this.workspaceId = workspaceId;
            this.contactId = contactId;
            this.action = action;
        }
            public String getWorkspaceId() {
                return workspaceId;
            }
            public String getContactId() {
                return contactId;
            }
            public String getAction() {
                return action;
            }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private String workspaceId;
            private String contactId;
            private String action;

            public ContactDeleteParams build() {
                return new ContactDeleteParams(
                    workspaceId,
                    contactId,
                    action
                );
            }

            public Builder setWorkspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }
            public Builder setContactId(String contactId) {
                this.contactId = contactId;
                return this;
            }
            public Builder setAction(String action) {
                this.action = action;
                return this;
            }
        }
        
    }

    public static class ContactDeleteRequest {
        private final String workspaceId;
        private final String xApiKey;
        private final String contactId;
        private String action;
        ApiResponse _lastResponse;

        private ContactDeleteRequest(String workspaceId, String xApiKey, String contactId) {
            this.workspaceId = workspaceId;
            this.xApiKey = xApiKey;
            this.contactId = contactId;
        }

        /**
         * Set action
         * @param action The API call involves passing an &#x60;action&#x3D;deleteAll&#x60; query parameter. Once this action is triggered, all the contact references in all workspaces for a given &#x60;contact_id&#x60; are deleted asynchronously. There is no way to stop the process once it’s triggered. **Use the action only when you’re definitely sure you want to delete the contact from all workspaces** (optional)
         * @return APIcontactDeleteRequest
         */
        public ContactDeleteRequest action(String action) {
            this.action = action;
            return this;
        }

        /**
         * Build call for contactDelete
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return contactDeleteCall(workspaceId, xApiKey, contactId, action, _callback);
        }

        /**
         * Execute contactDelete request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public void execute() throws ApiException {
            contactDeleteWithHttpInfo(workspaceId, xApiKey, contactId, action);
        }
        /**
         * Return the last executed API response
         * @return ApiResponse
         */
        public ApiResponse getLastResponse()  {
            return _lastResponse;
        }


        /**
         * Execute contactDelete request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return contactDeleteAsync(workspaceId, xApiKey, contactId, action, _callback);
        }
    }

    /**
     * Delete a contact
     * @param params The param instance required to create ContactDeleteRequest
     * @return void
     */

    public static void delete(Map<String, Object> params) throws ApiException {
        String action = null;
        if(params.containsKey("action") && params.get("action") != null){
            action = (String) params.get("action");
        }
        String workspaceId = (String) params.get("workspaceId");

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }
        String contactId = (String) params.get("contactId");

        if(contactId == null || contactId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'contactId'");
        }
        ContactDeleteParams tempParams = ContactDeleteParams.builder()
            .setWorkspaceId(workspaceId)
            .setContactId(contactId)
            .setAction(action).build();

        delete(tempParams);
    }

    public static void delete(ContactDeleteParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }


        String workspaceId = params.getWorkspaceId();

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }


        String contactId = params.getContactId();

        if(contactId == null || contactId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'contactId'");
        }
        ContactDeleteRequest request = new ContactDeleteRequest(workspaceId, xApiKey, contactId);

        // Ensure to include all of the 'optionalParams' that are passed
        if(params.action != null){
            String action = params.getAction();
            request.action(action);
        }

        request.execute();
    }
    private static okhttp3.Call contactListCall(String workspaceId, String xApiKey, String accept, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields, String fieldname, Boolean customFields, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/workspaces/{workspaceId}/contacts"
            .replace("{" + "workspaceId" + "}", localVarApiClient.escapeString(workspaceId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarHeaderParams.put("Authorization", String.format("Basic %s", authHeader));
        localVarHeaderParams.put("User-Agent", String.format("whispir-java-%s", Version.VERSION));

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (offset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offset", offset));
        }

        if (sortOrder != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sortOrder", sortOrder));
        }

        if (sortFields != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sortFields", sortFields));
        }

        if (fieldname != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldname", fieldname));
        }

        if (customFields != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("customFields", customFields));
        }

        if (xApiKey != null) {
            localVarHeaderParams.put("X-Api-Key", localVarApiClient.parameterToString(xApiKey));
        }

        if (accept != null) {
            localVarHeaderParams.put("Accept", localVarApiClient.parameterToString(accept));
        }

        final String[] localVarAccepts = {
            "application/vnd.whispir.contact-v1+json",
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth", "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private static okhttp3.Call contactListValidateBeforeCall(String workspaceId, String xApiKey, String accept, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields, String fieldname, Boolean customFields, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'workspaceId' is set
        if (workspaceId == null) {
            throw new ApiException("Missing the required parameter 'workspaceId' when calling contactList(Async)");
        }

        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling contactList(Async)");
        }

        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling contactList(Async)");
        }

        return contactListCall(workspaceId, xApiKey, accept, limit, offset, sortOrder, sortFields, fieldname, customFields, _callback);
    }

    private static ApiResponse<ContactCollection> contactListWithHttpInfo(String workspaceId, String xApiKey, String accept, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields, String fieldname, Boolean customFields) throws ApiException {
        okhttp3.Call localVarCall = contactListCall(workspaceId, xApiKey, accept, limit, offset, sortOrder, sortFields, fieldname, customFields, null);
        Type localVarReturnType = new TypeToken<ContactCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private static okhttp3.Call contactListAsync(String workspaceId, String xApiKey, String accept, BigDecimal limit, BigDecimal offset, String sortOrder, String sortFields, String fieldname, Boolean customFields, final ApiCallback<ContactCollection> _callback) throws ApiException {
        okhttp3.Call localVarCall = contactListValidateBeforeCall(workspaceId, xApiKey, accept, limit, offset, sortOrder, sortFields, fieldname, customFields, _callback);
        Type localVarReturnType = new TypeToken<ContactCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public static class ContactListParams {
        private String workspaceId;
        private BigDecimal limit;
        private BigDecimal offset;
        private String sortOrder;
        private String sortFields;
        private String fieldname;
        private Boolean customFields;

        private ContactListParams(
            String workspaceId,
            BigDecimal limit,
            BigDecimal offset,
            String sortOrder,
            String sortFields,
            String fieldname,
            Boolean customFields
        ){
            this.workspaceId = workspaceId;
            this.limit = limit;
            this.offset = offset;
            this.sortOrder = sortOrder;
            this.sortFields = sortFields;
            this.fieldname = fieldname;
            this.customFields = customFields;
        }
            public String getWorkspaceId() {
                return workspaceId;
            }
            public BigDecimal getLimit() {
                return limit;
            }
            public BigDecimal getOffset() {
                return offset;
            }
            public String getSortOrder() {
                return sortOrder;
            }
            public String getSortFields() {
                return sortFields;
            }
            public String getFieldname() {
                return fieldname;
            }
            public Boolean getCustomFields() {
                return customFields;
            }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private String workspaceId;
            private BigDecimal limit;
            private BigDecimal offset;
            private String sortOrder;
            private String sortFields;
            private String fieldname;
            private Boolean customFields;

            public ContactListParams build() {
                return new ContactListParams(
                    workspaceId,
                    limit,
                    offset,
                    sortOrder,
                    sortFields,
                    fieldname,
                    customFields
                );
            }

            public Builder setWorkspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }
            public Builder setLimit(BigDecimal limit) {
                this.limit = limit;
                return this;
            }
            public Builder setOffset(BigDecimal offset) {
                this.offset = offset;
                return this;
            }
            public Builder setSortOrder(String sortOrder) {
                this.sortOrder = sortOrder;
                return this;
            }
            public Builder setSortFields(String sortFields) {
                this.sortFields = sortFields;
                return this;
            }
            public Builder setFieldname(String fieldname) {
                this.fieldname = fieldname;
                return this;
            }
            public Builder setCustomFields(Boolean customFields) {
                this.customFields = customFields;
                return this;
            }
        }
        
    }

    public static class ContactListRequest {
        private final String workspaceId;
        private final String xApiKey;
        private final String accept;
        private BigDecimal limit;
        private BigDecimal offset;
        private String sortOrder;
        private String sortFields;
        private String fieldname;
        private Boolean customFields;
        ApiResponse _lastResponse;

        private ContactListRequest(String workspaceId, String xApiKey, String accept) {
            this.workspaceId = workspaceId;
            this.xApiKey = xApiKey;
            this.accept = accept;
        }

        /**
         * Set limit
         * @param limit The number of records to be returned. (optional, default to 20)
         * @return APIcontactListRequest
         */
        public ContactListRequest limit(BigDecimal limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Set offset
         * @param offset The record number to start returning from. (optional, default to 0)
         * @return APIcontactListRequest
         */
        public ContactListRequest offset(BigDecimal offset) {
            this.offset = offset;
            return this;
        }

        /**
         * Set sortOrder
         * @param sortOrder The order in which you require the results to be returned. Either ‘asc’ or ‘desc’ (optional)
         * @return APIcontactListRequest
         */
        public ContactListRequest sortOrder(String sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * Set sortFields
         * @param sortFields The fields that you require the ordering to be performed on. Multiple fields can be provided, separated by a comma. (optional)
         * @return APIcontactListRequest
         */
        public ContactListRequest sortFields(String sortFields) {
            this.sortFields = sortFields;
            return this;
        }

        /**
         * Set fieldname
         * @param fieldname String Specifies the field name of the contact object. The field name could be any thing as long as it is a valid contact attribute.   Example: &#x60;http://api.whispir.com/contacts?firstName&#x3D;Sam&#x60;  (optional)
         * @return APIcontactListRequest
         */
        public ContactListRequest fieldname(String fieldname) {
            this.fieldname = fieldname;
            return this;
        }

        /**
         * Set customFields
         * @param customFields Custom Fields (optional)
         * @return APIcontactListRequest
         */
        public ContactListRequest customFields(Boolean customFields) {
            this.customFields = customFields;
            return this;
        }

        /**
         * Build call for contactList
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return contactListCall(workspaceId, xApiKey, accept, limit, offset, sortOrder, sortFields, fieldname, customFields, _callback);
        }

        /**
         * Execute contactList request
         * @return ContactCollection
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public ContactCollection execute() throws ApiException {
            ApiResponse<ContactCollection> localVarResp = contactListWithHttpInfo(workspaceId, xApiKey, accept, limit, offset, sortOrder, sortFields, fieldname, customFields);
            _lastResponse = localVarResp;
            ContactCollection data = localVarResp.getData();

            
            data.lastResponse = localVarResp;
            return data;
        }
        /**
         * Return the last executed API response
         * @return ApiResponse
         */
        public ApiResponse getLastResponse()  {
            return _lastResponse;
        }


        /**
         * Execute contactList request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<ContactCollection> _callback) throws ApiException {
            return contactListAsync(workspaceId, xApiKey, accept, limit, offset, sortOrder, sortFields, fieldname, customFields, _callback);
        }
    }

    /**
     * List contacts
     * @param params The param instance required to create ContactListRequest
     * @return ContactCollection
     */

    public static ContactCollection list(Map<String, Object> params) throws ApiException {
        BigDecimal limit = null;
        if(params.containsKey("limit") && params.get("limit") != null){
            limit = (BigDecimal) params.get("limit");
        }
        BigDecimal offset = null;
        if(params.containsKey("offset") && params.get("offset") != null){
            offset = (BigDecimal) params.get("offset");
        }
        String sortOrder = null;
        if(params.containsKey("sortOrder") && params.get("sortOrder") != null){
            sortOrder = (String) params.get("sortOrder");
        }
        String sortFields = null;
        if(params.containsKey("sortFields") && params.get("sortFields") != null){
            sortFields = (String) params.get("sortFields");
        }
        String fieldname = null;
        if(params.containsKey("fieldname") && params.get("fieldname") != null){
            fieldname = (String) params.get("fieldname");
        }
        Boolean customFields = null;
        if(params.containsKey("customFields") && params.get("customFields") != null){
            customFields = (Boolean) params.get("customFields");
        }
        String workspaceId = (String) params.get("workspaceId");

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }
        ContactListParams tempParams = ContactListParams.builder()
            .setWorkspaceId(workspaceId)
            .setLimit(limit)
            .setOffset(offset)
            .setSortOrder(sortOrder)
            .setSortFields(sortFields)
            .setFieldname(fieldname)
            .setCustomFields(customFields).build();

        return list(tempParams);
    }

    public static ContactCollection list(ContactListParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }


        String workspaceId = params.getWorkspaceId();

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }

        String accept = "application/vnd.whispir.contact-v1+json";

        ContactListRequest request = new ContactListRequest(workspaceId, xApiKey, accept);

        // Ensure to include all of the 'optionalParams' that are passed
        if(params.limit != null){
            BigDecimal limit = params.getLimit();
            request.limit(limit);
        }
        if(params.offset != null){
            BigDecimal offset = params.getOffset();
            request.offset(offset);
        }
        if(params.sortOrder != null){
            String sortOrder = params.getSortOrder();
            request.sortOrder(sortOrder);
        }
        if(params.sortFields != null){
            String sortFields = params.getSortFields();
            request.sortFields(sortFields);
        }
        if(params.fieldname != null){
            String fieldname = params.getFieldname();
            request.fieldname(fieldname);
        }
        if(params.customFields != null){
            Boolean customFields = params.getCustomFields();
            request.customFields(customFields);
        }

        return request.execute();
    }
    private static okhttp3.Call contactRetrieveCall(String workspaceId, String xApiKey, String contactId, String accept, String fields, String sortOrder, String sortFields, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/workspaces/{workspaceId}/contacts/{contactId}"
            .replace("{" + "workspaceId" + "}", localVarApiClient.escapeString(workspaceId.toString()))
            .replace("{" + "contactId" + "}", localVarApiClient.escapeString(contactId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarHeaderParams.put("Authorization", String.format("Basic %s", authHeader));
        localVarHeaderParams.put("User-Agent", String.format("whispir-java-%s", Version.VERSION));

        if (fields != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fields", fields));
        }

        if (sortOrder != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sortOrder", sortOrder));
        }

        if (sortFields != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sortFields", sortFields));
        }

        if (xApiKey != null) {
            localVarHeaderParams.put("X-Api-Key", localVarApiClient.parameterToString(xApiKey));
        }

        if (accept != null) {
            localVarHeaderParams.put("Accept", localVarApiClient.parameterToString(accept));
        }

        final String[] localVarAccepts = {
            "application/vnd.whispir.contact-v1+json",
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth", "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private static okhttp3.Call contactRetrieveValidateBeforeCall(String workspaceId, String xApiKey, String contactId, String accept, String fields, String sortOrder, String sortFields, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'workspaceId' is set
        if (workspaceId == null) {
            throw new ApiException("Missing the required parameter 'workspaceId' when calling contactRetrieve(Async)");
        }

        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling contactRetrieve(Async)");
        }

        // verify the required parameter 'contactId' is set
        if (contactId == null) {
            throw new ApiException("Missing the required parameter 'contactId' when calling contactRetrieve(Async)");
        }

        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling contactRetrieve(Async)");
        }

        return contactRetrieveCall(workspaceId, xApiKey, contactId, accept, fields, sortOrder, sortFields, _callback);
    }

    private static ApiResponse<Contact> contactRetrieveWithHttpInfo(String workspaceId, String xApiKey, String contactId, String accept, String fields, String sortOrder, String sortFields) throws ApiException {
        okhttp3.Call localVarCall = contactRetrieveCall(workspaceId, xApiKey, contactId, accept, fields, sortOrder, sortFields, null);
        Type localVarReturnType = new TypeToken<Contact>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private static okhttp3.Call contactRetrieveAsync(String workspaceId, String xApiKey, String contactId, String accept, String fields, String sortOrder, String sortFields, final ApiCallback<Contact> _callback) throws ApiException {
        okhttp3.Call localVarCall = contactRetrieveValidateBeforeCall(workspaceId, xApiKey, contactId, accept, fields, sortOrder, sortFields, _callback);
        Type localVarReturnType = new TypeToken<Contact>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public static class ContactRetrieveParams {
        private String workspaceId;
        private String contactId;
        private String fields;
        private String sortOrder;
        private String sortFields;

        private ContactRetrieveParams(
            String workspaceId,
            String contactId,
            String fields,
            String sortOrder,
            String sortFields
        ){
            this.workspaceId = workspaceId;
            this.contactId = contactId;
            this.fields = fields;
            this.sortOrder = sortOrder;
            this.sortFields = sortFields;
        }
            public String getWorkspaceId() {
                return workspaceId;
            }
            public String getContactId() {
                return contactId;
            }
            public String getFields() {
                return fields;
            }
            public String getSortOrder() {
                return sortOrder;
            }
            public String getSortFields() {
                return sortFields;
            }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private String workspaceId;
            private String contactId;
            private String fields;
            private String sortOrder;
            private String sortFields;

            public ContactRetrieveParams build() {
                return new ContactRetrieveParams(
                    workspaceId,
                    contactId,
                    fields,
                    sortOrder,
                    sortFields
                );
            }

            public Builder setWorkspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }
            public Builder setContactId(String contactId) {
                this.contactId = contactId;
                return this;
            }
            public Builder setFields(String fields) {
                this.fields = fields;
                return this;
            }
            public Builder setSortOrder(String sortOrder) {
                this.sortOrder = sortOrder;
                return this;
            }
            public Builder setSortFields(String sortFields) {
                this.sortFields = sortFields;
                return this;
            }
        }
        
    }

    public static class ContactRetrieveRequest {
        private final String workspaceId;
        private final String xApiKey;
        private final String contactId;
        private final String accept;
        private String fields;
        private String sortOrder;
        private String sortFields;
        ApiResponse _lastResponse;

        private ContactRetrieveRequest(String workspaceId, String xApiKey, String contactId, String accept) {
            this.workspaceId = workspaceId;
            this.xApiKey = xApiKey;
            this.contactId = contactId;
            this.accept = accept;
        }

        /**
         * Set fields
         * @param fields NOTE: once again, the equal sign must be intended as \&quot;contains\&quot; rather than \&quot;equals\&quot;. So if we search the people whose firstName equals Sam we might be given back e.g. Sam, Samantha, Samuel. Similarly for numbers: if we search Contacts with staffId equal to 1234 we will given back e.g. the contact with staffID equal to 1234 but also e.g. a contact with staffID equal to 98123456. If you need to narrow down please consider applying additional filters (optional)
         * @return APIcontactRetrieveRequest
         */
        public ContactRetrieveRequest fields(String fields) {
            this.fields = fields;
            return this;
        }

        /**
         * Set sortOrder
         * @param sortOrder The order in which you require the results to be returned. Either ‘asc’ or ‘desc’ (optional)
         * @return APIcontactRetrieveRequest
         */
        public ContactRetrieveRequest sortOrder(String sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * Set sortFields
         * @param sortFields The fields that you require the ordering to be performed on. Multiple fields can be provided, separated by a comma. (optional)
         * @return APIcontactRetrieveRequest
         */
        public ContactRetrieveRequest sortFields(String sortFields) {
            this.sortFields = sortFields;
            return this;
        }

        /**
         * Build call for contactRetrieve
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return contactRetrieveCall(workspaceId, xApiKey, contactId, accept, fields, sortOrder, sortFields, _callback);
        }

        /**
         * Execute contactRetrieve request
         * @return Contact
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public Contact execute() throws ApiException {
            ApiResponse<Contact> localVarResp = contactRetrieveWithHttpInfo(workspaceId, xApiKey, contactId, accept, fields, sortOrder, sortFields);
            _lastResponse = localVarResp;
            Contact data = localVarResp.getData();

            
            data.lastResponse = localVarResp;
            return data;
        }
        /**
         * Return the last executed API response
         * @return ApiResponse
         */
        public ApiResponse getLastResponse()  {
            return _lastResponse;
        }


        /**
         * Execute contactRetrieve request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<Contact> _callback) throws ApiException {
            return contactRetrieveAsync(workspaceId, xApiKey, contactId, accept, fields, sortOrder, sortFields, _callback);
        }
    }

    /**
     * Retrieve a contact
     * @param params The param instance required to create ContactRetrieveRequest
     * @return Contact
     */

    public static Contact retrieve(Map<String, Object> params) throws ApiException {
        String fields = null;
        if(params.containsKey("fields") && params.get("fields") != null){
            fields = (String) params.get("fields");
        }
        String sortOrder = null;
        if(params.containsKey("sortOrder") && params.get("sortOrder") != null){
            sortOrder = (String) params.get("sortOrder");
        }
        String sortFields = null;
        if(params.containsKey("sortFields") && params.get("sortFields") != null){
            sortFields = (String) params.get("sortFields");
        }
        String workspaceId = (String) params.get("workspaceId");

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }
        String contactId = (String) params.get("contactId");

        if(contactId == null || contactId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'contactId'");
        }
        ContactRetrieveParams tempParams = ContactRetrieveParams.builder()
            .setWorkspaceId(workspaceId)
            .setContactId(contactId)
            .setFields(fields)
            .setSortOrder(sortOrder)
            .setSortFields(sortFields).build();

        return retrieve(tempParams);
    }

    public static Contact retrieve(ContactRetrieveParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }


        String workspaceId = params.getWorkspaceId();

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }


        String contactId = params.getContactId();

        if(contactId == null || contactId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'contactId'");
        }
        String accept = "application/vnd.whispir.contact-v1+json";

        ContactRetrieveRequest request = new ContactRetrieveRequest(workspaceId, xApiKey, contactId, accept);

        // Ensure to include all of the 'optionalParams' that are passed
        if(params.fields != null){
            String fields = params.getFields();
            request.fields(fields);
        }
        if(params.sortOrder != null){
            String sortOrder = params.getSortOrder();
            request.sortOrder(sortOrder);
        }
        if(params.sortFields != null){
            String sortFields = params.getSortFields();
            request.sortFields(sortFields);
        }

        return request.execute();
    }
    private static okhttp3.Call contactUpdateCall(String workspaceId, String xApiKey, String contactId, String accept, String contentType, Contact contact, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = contact;

        // create path and map variables
        String localVarPath = "/workspaces/{workspaceId}/contacts/{contactId}"
            .replace("{" + "workspaceId" + "}", localVarApiClient.escapeString(workspaceId.toString()))
            .replace("{" + "contactId" + "}", localVarApiClient.escapeString(contactId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarHeaderParams.put("Authorization", String.format("Basic %s", authHeader));
        localVarHeaderParams.put("User-Agent", String.format("whispir-java-%s", Version.VERSION));

        if (xApiKey != null) {
            localVarHeaderParams.put("X-Api-Key", localVarApiClient.parameterToString(xApiKey));
        }

        if (accept != null) {
            localVarHeaderParams.put("Accept", localVarApiClient.parameterToString(accept));
        }

        if (contentType != null) {
            localVarHeaderParams.put("Content-Type", localVarApiClient.parameterToString(contentType));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/vnd.whispir.contact-v1+json",
            "application/vnd.whispir.contact-v1+xml"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth", "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private static okhttp3.Call contactUpdateValidateBeforeCall(String workspaceId, String xApiKey, String contactId, String accept, String contentType, Contact contact, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'workspaceId' is set
        if (workspaceId == null) {
            throw new ApiException("Missing the required parameter 'workspaceId' when calling contactUpdate(Async)");
        }

        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling contactUpdate(Async)");
        }

        // verify the required parameter 'contactId' is set
        if (contactId == null) {
            throw new ApiException("Missing the required parameter 'contactId' when calling contactUpdate(Async)");
        }

        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling contactUpdate(Async)");
        }

        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new ApiException("Missing the required parameter 'contentType' when calling contactUpdate(Async)");
        }

        // verify the required parameter 'contact' is set
        if (contact == null) {
            throw new ApiException("Missing the required parameter 'contact' when calling contactUpdate(Async)");
        }

        return contactUpdateCall(workspaceId, xApiKey, contactId, accept, contentType, contact, _callback);
    }

    private static ApiResponse<Void> contactUpdateWithHttpInfo(String workspaceId, String xApiKey, String contactId, String accept, String contentType, Contact contact) throws ApiException {
        okhttp3.Call localVarCall = contactUpdateCall(workspaceId, xApiKey, contactId, accept, contentType, contact, null);
        return localVarApiClient.execute(localVarCall);
    }

    private static okhttp3.Call contactUpdateAsync(String workspaceId, String xApiKey, String contactId, String accept, String contentType, Contact contact, final ApiCallback<Void> _callback) throws ApiException {
        okhttp3.Call localVarCall = contactUpdateValidateBeforeCall(workspaceId, xApiKey, contactId, accept, contentType, contact, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public static class ContactUpdateParams {
        private String workspaceId;
        private String contactId;
        private Contact contact;
        private String firstName;
        private String lastName;
        private String workMobilePhone1;
        private String workEmailAddress1;
        private String workCountry;
        private String timezone;
        private String title;
        private String workMobilePhone2;
        private String workEmailAddress2;
        private String workPhoneAreaCode1;
        private String workPhone1;
        private String workPhoneAreaCode2;
        private String workPhone2;
        private String workFaxAreaCode1;
        private String workFax1;
        private String workSatellitePhone;
        private String workOtherPhone;
        private String workAddress1;
        private String workAddress2;
        private String workSuburb;
        private String workState;
        private String workPostCode;
        private String workPostalAddress1;
        private String workPostalAddress2;
        private String workPostalSuburb;
        private String workPostalState;
        private String workPostalPostCode;
        private String personalEmailAddress1;
        private String personalEmailAddress2;
        private String personalAddress1;
        private String personalAddress2;
        private String personalSuburb;
        private String personalState;
        private String personalPostCode;
        private String personalCountry;
        private String personalPhoneAreaCode1;
        private String personalPhone1;
        private String personalPhoneAreaCode2;
        private String personalPhone2;
        private String personalFaxAreaCode1;
        private String personalFax1;
        private String otherPhoneAreaCode1;
        private String otherPhone1;
        private String otherMobile;
        private String otherFirstName;
        private String otherLastName;
        private String otherTitle;
        private String status;
        private String companyName;
        private String jobTitle;
        private String division;
        private String businessUnit;
        private String department;
        private String teamName1;
        private String teamName2;
        private String role1;
        private String role2;
        private List<Location> locations;
        private List<MessagingOption> messagingoptions;

        private ContactUpdateParams(
            String workspaceId,
            String contactId,
            Contact contact,
            String firstName,
            String lastName,
            String workMobilePhone1,
            String workEmailAddress1,
            String workCountry,
            String timezone,
            String title,
            String workMobilePhone2,
            String workEmailAddress2,
            String workPhoneAreaCode1,
            String workPhone1,
            String workPhoneAreaCode2,
            String workPhone2,
            String workFaxAreaCode1,
            String workFax1,
            String workSatellitePhone,
            String workOtherPhone,
            String workAddress1,
            String workAddress2,
            String workSuburb,
            String workState,
            String workPostCode,
            String workPostalAddress1,
            String workPostalAddress2,
            String workPostalSuburb,
            String workPostalState,
            String workPostalPostCode,
            String personalEmailAddress1,
            String personalEmailAddress2,
            String personalAddress1,
            String personalAddress2,
            String personalSuburb,
            String personalState,
            String personalPostCode,
            String personalCountry,
            String personalPhoneAreaCode1,
            String personalPhone1,
            String personalPhoneAreaCode2,
            String personalPhone2,
            String personalFaxAreaCode1,
            String personalFax1,
            String otherPhoneAreaCode1,
            String otherPhone1,
            String otherMobile,
            String otherFirstName,
            String otherLastName,
            String otherTitle,
            String status,
            String companyName,
            String jobTitle,
            String division,
            String businessUnit,
            String department,
            String teamName1,
            String teamName2,
            String role1,
            String role2,
            List<Location> locations,
            List<MessagingOption> messagingoptions
        ){
            this.workspaceId = workspaceId;
            this.contactId = contactId;
            this.contact = contact;
            this.firstName = firstName;
            this.lastName = lastName;
            this.workMobilePhone1 = workMobilePhone1;
            this.workEmailAddress1 = workEmailAddress1;
            this.workCountry = workCountry;
            this.timezone = timezone;
            this.title = title;
            this.workMobilePhone2 = workMobilePhone2;
            this.workEmailAddress2 = workEmailAddress2;
            this.workPhoneAreaCode1 = workPhoneAreaCode1;
            this.workPhone1 = workPhone1;
            this.workPhoneAreaCode2 = workPhoneAreaCode2;
            this.workPhone2 = workPhone2;
            this.workFaxAreaCode1 = workFaxAreaCode1;
            this.workFax1 = workFax1;
            this.workSatellitePhone = workSatellitePhone;
            this.workOtherPhone = workOtherPhone;
            this.workAddress1 = workAddress1;
            this.workAddress2 = workAddress2;
            this.workSuburb = workSuburb;
            this.workState = workState;
            this.workPostCode = workPostCode;
            this.workPostalAddress1 = workPostalAddress1;
            this.workPostalAddress2 = workPostalAddress2;
            this.workPostalSuburb = workPostalSuburb;
            this.workPostalState = workPostalState;
            this.workPostalPostCode = workPostalPostCode;
            this.personalEmailAddress1 = personalEmailAddress1;
            this.personalEmailAddress2 = personalEmailAddress2;
            this.personalAddress1 = personalAddress1;
            this.personalAddress2 = personalAddress2;
            this.personalSuburb = personalSuburb;
            this.personalState = personalState;
            this.personalPostCode = personalPostCode;
            this.personalCountry = personalCountry;
            this.personalPhoneAreaCode1 = personalPhoneAreaCode1;
            this.personalPhone1 = personalPhone1;
            this.personalPhoneAreaCode2 = personalPhoneAreaCode2;
            this.personalPhone2 = personalPhone2;
            this.personalFaxAreaCode1 = personalFaxAreaCode1;
            this.personalFax1 = personalFax1;
            this.otherPhoneAreaCode1 = otherPhoneAreaCode1;
            this.otherPhone1 = otherPhone1;
            this.otherMobile = otherMobile;
            this.otherFirstName = otherFirstName;
            this.otherLastName = otherLastName;
            this.otherTitle = otherTitle;
            this.status = status;
            this.companyName = companyName;
            this.jobTitle = jobTitle;
            this.division = division;
            this.businessUnit = businessUnit;
            this.department = department;
            this.teamName1 = teamName1;
            this.teamName2 = teamName2;
            this.role1 = role1;
            this.role2 = role2;
            this.locations = locations;
            this.messagingoptions = messagingoptions;
        }
            public String getWorkspaceId() {
                return workspaceId;
            }
            public String getContactId() {
                return contactId;
            }
            public Contact getContact() {
                return contact;
            }
            public enum TypeEnum {
            PROJECT("PROJECT"),
            
            COMPANY("COMPANY");
                private String value;
                TypeEnum(String value){
                    this.value = value;
                }

                public String getValue() {
                    return value;
                }
                
                @Override
                public String toString() {
                    return String.valueOf(value);
                }

                public static TypeEnum fromValue(String value) {
                    for (TypeEnum b : TypeEnum.values()) {
                        if (b.value.equals(value)) {
                            return b;
                        }
                    }
                    throw new IllegalArgumentException("Unexpected value '" + value + "'");
                }

            }
            public String getFirstName() {
                return firstName;
            }
            public String getLastName() {
                return lastName;
            }
            public String getWorkMobilePhone1() {
                return workMobilePhone1;
            }
            public String getWorkEmailAddress1() {
                return workEmailAddress1;
            }
            public String getWorkCountry() {
                return workCountry;
            }
            public String getTimezone() {
                return timezone;
            }
            public String getTitle() {
                return title;
            }
            public String getWorkMobilePhone2() {
                return workMobilePhone2;
            }
            public String getWorkEmailAddress2() {
                return workEmailAddress2;
            }
            public String getWorkPhoneAreaCode1() {
                return workPhoneAreaCode1;
            }
            public String getWorkPhone1() {
                return workPhone1;
            }
            public String getWorkPhoneAreaCode2() {
                return workPhoneAreaCode2;
            }
            public String getWorkPhone2() {
                return workPhone2;
            }
            public String getWorkFaxAreaCode1() {
                return workFaxAreaCode1;
            }
            public String getWorkFax1() {
                return workFax1;
            }
            public String getWorkSatellitePhone() {
                return workSatellitePhone;
            }
            public String getWorkOtherPhone() {
                return workOtherPhone;
            }
            public String getWorkAddress1() {
                return workAddress1;
            }
            public String getWorkAddress2() {
                return workAddress2;
            }
            public String getWorkSuburb() {
                return workSuburb;
            }
            public String getWorkState() {
                return workState;
            }
            public String getWorkPostCode() {
                return workPostCode;
            }
            public String getWorkPostalAddress1() {
                return workPostalAddress1;
            }
            public String getWorkPostalAddress2() {
                return workPostalAddress2;
            }
            public String getWorkPostalSuburb() {
                return workPostalSuburb;
            }
            public String getWorkPostalState() {
                return workPostalState;
            }
            public String getWorkPostalPostCode() {
                return workPostalPostCode;
            }
            public String getPersonalEmailAddress1() {
                return personalEmailAddress1;
            }
            public String getPersonalEmailAddress2() {
                return personalEmailAddress2;
            }
            public String getPersonalAddress1() {
                return personalAddress1;
            }
            public String getPersonalAddress2() {
                return personalAddress2;
            }
            public String getPersonalSuburb() {
                return personalSuburb;
            }
            public String getPersonalState() {
                return personalState;
            }
            public String getPersonalPostCode() {
                return personalPostCode;
            }
            public String getPersonalCountry() {
                return personalCountry;
            }
            public String getPersonalPhoneAreaCode1() {
                return personalPhoneAreaCode1;
            }
            public String getPersonalPhone1() {
                return personalPhone1;
            }
            public String getPersonalPhoneAreaCode2() {
                return personalPhoneAreaCode2;
            }
            public String getPersonalPhone2() {
                return personalPhone2;
            }
            public String getPersonalFaxAreaCode1() {
                return personalFaxAreaCode1;
            }
            public String getPersonalFax1() {
                return personalFax1;
            }
            public String getOtherPhoneAreaCode1() {
                return otherPhoneAreaCode1;
            }
            public String getOtherPhone1() {
                return otherPhone1;
            }
            public String getOtherMobile() {
                return otherMobile;
            }
            public String getOtherFirstName() {
                return otherFirstName;
            }
            public String getOtherLastName() {
                return otherLastName;
            }
            public String getOtherTitle() {
                return otherTitle;
            }
            public enum StatusEnum {
            A("A"),
            
            D("D");
                private String value;
                StatusEnum(String value){
                    this.value = value;
                }

                public String getValue() {
                    return value;
                }
                
                @Override
                public String toString() {
                    return String.valueOf(value);
                }

                public static StatusEnum fromValue(String value) {
                    for (StatusEnum b : StatusEnum.values()) {
                        if (b.value.equals(value)) {
                            return b;
                        }
                    }
                    throw new IllegalArgumentException("Unexpected value '" + value + "'");
                }

            }
            public String getStatus() {
                return status;
            }
            public String getCompanyName() {
                return companyName;
            }
            public String getJobTitle() {
                return jobTitle;
            }
            public String getDivision() {
                return division;
            }
            public String getBusinessUnit() {
                return businessUnit;
            }
            public String getDepartment() {
                return department;
            }
            public String getTeamName1() {
                return teamName1;
            }
            public String getTeamName2() {
                return teamName2;
            }
            public String getRole1() {
                return role1;
            }
            public String getRole2() {
                return role2;
            }
            public List<Location> getLocations() {
                return locations;
            }
            public List<MessagingOption> getMessagingoptions() {
                return messagingoptions;
            }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private String workspaceId;
            private String contactId;
            private Contact contact;
            private String firstName;
            private String lastName;
            private String workMobilePhone1;
            private String workEmailAddress1;
            private String workCountry;
            private String timezone;
            private String title;
            private String workMobilePhone2;
            private String workEmailAddress2;
            private String workPhoneAreaCode1;
            private String workPhone1;
            private String workPhoneAreaCode2;
            private String workPhone2;
            private String workFaxAreaCode1;
            private String workFax1;
            private String workSatellitePhone;
            private String workOtherPhone;
            private String workAddress1;
            private String workAddress2;
            private String workSuburb;
            private String workState;
            private String workPostCode;
            private String workPostalAddress1;
            private String workPostalAddress2;
            private String workPostalSuburb;
            private String workPostalState;
            private String workPostalPostCode;
            private String personalEmailAddress1;
            private String personalEmailAddress2;
            private String personalAddress1;
            private String personalAddress2;
            private String personalSuburb;
            private String personalState;
            private String personalPostCode;
            private String personalCountry;
            private String personalPhoneAreaCode1;
            private String personalPhone1;
            private String personalPhoneAreaCode2;
            private String personalPhone2;
            private String personalFaxAreaCode1;
            private String personalFax1;
            private String otherPhoneAreaCode1;
            private String otherPhone1;
            private String otherMobile;
            private String otherFirstName;
            private String otherLastName;
            private String otherTitle;
            private String status;
            private String companyName;
            private String jobTitle;
            private String division;
            private String businessUnit;
            private String department;
            private String teamName1;
            private String teamName2;
            private String role1;
            private String role2;
            private List<Location> locations;
            private List<MessagingOption> messagingoptions;

            public ContactUpdateParams build() {
                return new ContactUpdateParams(
                    workspaceId,
                    contactId,
                    contact,
                    firstName,
                    lastName,
                    workMobilePhone1,
                    workEmailAddress1,
                    workCountry,
                    timezone,
                    title,
                    workMobilePhone2,
                    workEmailAddress2,
                    workPhoneAreaCode1,
                    workPhone1,
                    workPhoneAreaCode2,
                    workPhone2,
                    workFaxAreaCode1,
                    workFax1,
                    workSatellitePhone,
                    workOtherPhone,
                    workAddress1,
                    workAddress2,
                    workSuburb,
                    workState,
                    workPostCode,
                    workPostalAddress1,
                    workPostalAddress2,
                    workPostalSuburb,
                    workPostalState,
                    workPostalPostCode,
                    personalEmailAddress1,
                    personalEmailAddress2,
                    personalAddress1,
                    personalAddress2,
                    personalSuburb,
                    personalState,
                    personalPostCode,
                    personalCountry,
                    personalPhoneAreaCode1,
                    personalPhone1,
                    personalPhoneAreaCode2,
                    personalPhone2,
                    personalFaxAreaCode1,
                    personalFax1,
                    otherPhoneAreaCode1,
                    otherPhone1,
                    otherMobile,
                    otherFirstName,
                    otherLastName,
                    otherTitle,
                    status,
                    companyName,
                    jobTitle,
                    division,
                    businessUnit,
                    department,
                    teamName1,
                    teamName2,
                    role1,
                    role2,
                    locations,
                    messagingoptions
                );
            }

            public Builder setWorkspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }
            public Builder setContactId(String contactId) {
                this.contactId = contactId;
                return this;
            }
            public Builder setContact(Contact contact) {
                this.contact = contact;
                return this;
            }
            public Builder setFirstName(String firstName) {
                this.firstName = firstName;
                return this;
            }
            public Builder setLastName(String lastName) {
                this.lastName = lastName;
                return this;
            }
            public Builder setWorkMobilePhone1(String workMobilePhone1) {
                this.workMobilePhone1 = workMobilePhone1;
                return this;
            }
            public Builder setWorkEmailAddress1(String workEmailAddress1) {
                this.workEmailAddress1 = workEmailAddress1;
                return this;
            }
            public Builder setWorkCountry(String workCountry) {
                this.workCountry = workCountry;
                return this;
            }
            public Builder setTimezone(String timezone) {
                this.timezone = timezone;
                return this;
            }
            public Builder setTitle(String title) {
                this.title = title;
                return this;
            }
            public Builder setWorkMobilePhone2(String workMobilePhone2) {
                this.workMobilePhone2 = workMobilePhone2;
                return this;
            }
            public Builder setWorkEmailAddress2(String workEmailAddress2) {
                this.workEmailAddress2 = workEmailAddress2;
                return this;
            }
            public Builder setWorkPhoneAreaCode1(String workPhoneAreaCode1) {
                this.workPhoneAreaCode1 = workPhoneAreaCode1;
                return this;
            }
            public Builder setWorkPhone1(String workPhone1) {
                this.workPhone1 = workPhone1;
                return this;
            }
            public Builder setWorkPhoneAreaCode2(String workPhoneAreaCode2) {
                this.workPhoneAreaCode2 = workPhoneAreaCode2;
                return this;
            }
            public Builder setWorkPhone2(String workPhone2) {
                this.workPhone2 = workPhone2;
                return this;
            }
            public Builder setWorkFaxAreaCode1(String workFaxAreaCode1) {
                this.workFaxAreaCode1 = workFaxAreaCode1;
                return this;
            }
            public Builder setWorkFax1(String workFax1) {
                this.workFax1 = workFax1;
                return this;
            }
            public Builder setWorkSatellitePhone(String workSatellitePhone) {
                this.workSatellitePhone = workSatellitePhone;
                return this;
            }
            public Builder setWorkOtherPhone(String workOtherPhone) {
                this.workOtherPhone = workOtherPhone;
                return this;
            }
            public Builder setWorkAddress1(String workAddress1) {
                this.workAddress1 = workAddress1;
                return this;
            }
            public Builder setWorkAddress2(String workAddress2) {
                this.workAddress2 = workAddress2;
                return this;
            }
            public Builder setWorkSuburb(String workSuburb) {
                this.workSuburb = workSuburb;
                return this;
            }
            public Builder setWorkState(String workState) {
                this.workState = workState;
                return this;
            }
            public Builder setWorkPostCode(String workPostCode) {
                this.workPostCode = workPostCode;
                return this;
            }
            public Builder setWorkPostalAddress1(String workPostalAddress1) {
                this.workPostalAddress1 = workPostalAddress1;
                return this;
            }
            public Builder setWorkPostalAddress2(String workPostalAddress2) {
                this.workPostalAddress2 = workPostalAddress2;
                return this;
            }
            public Builder setWorkPostalSuburb(String workPostalSuburb) {
                this.workPostalSuburb = workPostalSuburb;
                return this;
            }
            public Builder setWorkPostalState(String workPostalState) {
                this.workPostalState = workPostalState;
                return this;
            }
            public Builder setWorkPostalPostCode(String workPostalPostCode) {
                this.workPostalPostCode = workPostalPostCode;
                return this;
            }
            public Builder setPersonalEmailAddress1(String personalEmailAddress1) {
                this.personalEmailAddress1 = personalEmailAddress1;
                return this;
            }
            public Builder setPersonalEmailAddress2(String personalEmailAddress2) {
                this.personalEmailAddress2 = personalEmailAddress2;
                return this;
            }
            public Builder setPersonalAddress1(String personalAddress1) {
                this.personalAddress1 = personalAddress1;
                return this;
            }
            public Builder setPersonalAddress2(String personalAddress2) {
                this.personalAddress2 = personalAddress2;
                return this;
            }
            public Builder setPersonalSuburb(String personalSuburb) {
                this.personalSuburb = personalSuburb;
                return this;
            }
            public Builder setPersonalState(String personalState) {
                this.personalState = personalState;
                return this;
            }
            public Builder setPersonalPostCode(String personalPostCode) {
                this.personalPostCode = personalPostCode;
                return this;
            }
            public Builder setPersonalCountry(String personalCountry) {
                this.personalCountry = personalCountry;
                return this;
            }
            public Builder setPersonalPhoneAreaCode1(String personalPhoneAreaCode1) {
                this.personalPhoneAreaCode1 = personalPhoneAreaCode1;
                return this;
            }
            public Builder setPersonalPhone1(String personalPhone1) {
                this.personalPhone1 = personalPhone1;
                return this;
            }
            public Builder setPersonalPhoneAreaCode2(String personalPhoneAreaCode2) {
                this.personalPhoneAreaCode2 = personalPhoneAreaCode2;
                return this;
            }
            public Builder setPersonalPhone2(String personalPhone2) {
                this.personalPhone2 = personalPhone2;
                return this;
            }
            public Builder setPersonalFaxAreaCode1(String personalFaxAreaCode1) {
                this.personalFaxAreaCode1 = personalFaxAreaCode1;
                return this;
            }
            public Builder setPersonalFax1(String personalFax1) {
                this.personalFax1 = personalFax1;
                return this;
            }
            public Builder setOtherPhoneAreaCode1(String otherPhoneAreaCode1) {
                this.otherPhoneAreaCode1 = otherPhoneAreaCode1;
                return this;
            }
            public Builder setOtherPhone1(String otherPhone1) {
                this.otherPhone1 = otherPhone1;
                return this;
            }
            public Builder setOtherMobile(String otherMobile) {
                this.otherMobile = otherMobile;
                return this;
            }
            public Builder setOtherFirstName(String otherFirstName) {
                this.otherFirstName = otherFirstName;
                return this;
            }
            public Builder setOtherLastName(String otherLastName) {
                this.otherLastName = otherLastName;
                return this;
            }
            public Builder setOtherTitle(String otherTitle) {
                this.otherTitle = otherTitle;
                return this;
            }
            public Builder setStatus(StatusEnum status) {
                this.status = status.getValue();
                return this;
            }
            public Builder setCompanyName(String companyName) {
                this.companyName = companyName;
                return this;
            }
            public Builder setJobTitle(String jobTitle) {
                this.jobTitle = jobTitle;
                return this;
            }
            public Builder setDivision(String division) {
                this.division = division;
                return this;
            }
            public Builder setBusinessUnit(String businessUnit) {
                this.businessUnit = businessUnit;
                return this;
            }
            public Builder setDepartment(String department) {
                this.department = department;
                return this;
            }
            public Builder setTeamName1(String teamName1) {
                this.teamName1 = teamName1;
                return this;
            }
            public Builder setTeamName2(String teamName2) {
                this.teamName2 = teamName2;
                return this;
            }
            public Builder setRole1(String role1) {
                this.role1 = role1;
                return this;
            }
            public Builder setRole2(String role2) {
                this.role2 = role2;
                return this;
            }
            public Builder setLocations(List<Location> locations) {
                this.locations = locations;
                return this;
            }
            public Builder setMessagingoptions(List<MessagingOption> messagingoptions) {
                this.messagingoptions = messagingoptions;
                return this;
            }
        }
        
    public static class Location {
        private BigDecimal latitude;
        private BigDecimal longitude;
        private String type;

        private Location(BigDecimal latitude,BigDecimal longitude,String type){
            this.latitude = latitude;
            this.longitude = longitude;
            this.type = type;
        }

        public BigDecimal getLatitude(){
            return latitude;
        }
        public BigDecimal getLongitude(){
            return longitude;
        }
        public String getType(){
            return type;
        }

        public static Builder builder() {
            return new Builder();
        }   

        public static class Builder {
            private BigDecimal latitude;
            private BigDecimal longitude;
            private String type;

            public Location build() {
                return new Location(
                   this.latitude,
                   this.longitude,
                   this.type
                );
            }
            public Builder setLatitude(BigDecimal latitude) {
                this.latitude = latitude;
                return this;
            }
            public Builder setLongitude(BigDecimal longitude) {
                this.longitude = longitude;
                return this;
            }
            public Builder setType(String type) {
                this.type = type;
                return this;
            }
        }

    
    }
    public static class MessagingOption {
        private String channel;
        private Boolean enabled;
        private String primary;
        private String secondary;
        private String tertiary;

        private MessagingOption(String channel,Boolean enabled,String primary,String secondary,String tertiary){
            this.channel = channel;
            this.enabled = enabled;
            this.primary = primary;
            this.secondary = secondary;
            this.tertiary = tertiary;
        }

        public String getChannel(){
            return channel;
        }
            public enum ChannelEnum {
                SMS("sms"),
                EMAIL("email"),
                VOICE("voice");
                ChannelEnum(String value){
                    this.value = value;
                }

                private String value;
                public String getValue() {
                    return value;
                }
                
                @Override
                public String toString() {
                    return String.valueOf(value);
                }

                public static ChannelEnum fromValue(String value) {
                    for (ChannelEnum b : ChannelEnum.values()) {
                        if (b.value.equals(value)) {
                            return b;
                        }
                    }
                    throw new IllegalArgumentException("Unexpected value '" + value + "'");
                }

            }
        public Boolean getEnabled(){
            return enabled;
        }
        public String getPrimary(){
            return primary;
        }
            public enum PrimaryEnum {
                WORKMOBILEPHONE1("WorkMobilePhone1"),
                WORKMOBILEPHONE2("WorkMobilePhone2"),
                WORKEMAILADDRESS1("WorkEmailAddress1"),
                WORKEMAILADDRESS2("WorkEmailAddress2"),
                PERSONALMOBILEPHONE1("PersonalMobilePhone1"),
                PERSONALEMAILADDRESS1("PersonalEmailAddress1");
                PrimaryEnum(String value){
                    this.value = value;
                }

                private String value;
                public String getValue() {
                    return value;
                }
                
                @Override
                public String toString() {
                    return String.valueOf(value);
                }

                public static PrimaryEnum fromValue(String value) {
                    for (PrimaryEnum b : PrimaryEnum.values()) {
                        if (b.value.equals(value)) {
                            return b;
                        }
                    }
                    throw new IllegalArgumentException("Unexpected value '" + value + "'");
                }

            }
        public String getSecondary(){
            return secondary;
        }
            public enum SecondaryEnum {
                WORKMOBILEPHONE1("WorkMobilePhone1"),
                WORKMOBILEPHONE2("WorkMobilePhone2"),
                WORKEMAILADDRESS1("WorkEmailAddress1"),
                WORKEMAILADDRESS2("WorkEmailAddress2"),
                PERSONALMOBILEPHONE1("PersonalMobilePhone1"),
                PERSONALEMAILADDRESS1("PersonalEmailAddress1");
                SecondaryEnum(String value){
                    this.value = value;
                }

                private String value;
                public String getValue() {
                    return value;
                }
                
                @Override
                public String toString() {
                    return String.valueOf(value);
                }

                public static SecondaryEnum fromValue(String value) {
                    for (SecondaryEnum b : SecondaryEnum.values()) {
                        if (b.value.equals(value)) {
                            return b;
                        }
                    }
                    throw new IllegalArgumentException("Unexpected value '" + value + "'");
                }

            }
        public String getTertiary(){
            return tertiary;
        }
            public enum TertiaryEnum {
                WORKMOBILEPHONE1("WorkMobilePhone1"),
                WORKMOBILEPHONE2("WorkMobilePhone2"),
                WORKEMAILADDRESS1("WorkEmailAddress1"),
                WORKEMAILADDRESS2("WorkEmailAddress2"),
                PERSONALMOBILEPHONE1("PersonalMobilePhone1"),
                PERSONALEMAILADDRESS1("PersonalEmailAddress1");
                TertiaryEnum(String value){
                    this.value = value;
                }

                private String value;
                public String getValue() {
                    return value;
                }
                
                @Override
                public String toString() {
                    return String.valueOf(value);
                }

                public static TertiaryEnum fromValue(String value) {
                    for (TertiaryEnum b : TertiaryEnum.values()) {
                        if (b.value.equals(value)) {
                            return b;
                        }
                    }
                    throw new IllegalArgumentException("Unexpected value '" + value + "'");
                }

            }

        public static Builder builder() {
            return new Builder();
        }   

        public static class Builder {
            private String channel;
            private Boolean enabled;
            private String primary;
            private String secondary;
            private String tertiary;

            public MessagingOption build() {
                return new MessagingOption(
                   this.channel,
                   this.enabled,
                   this.primary,
                   this.secondary,
                   this.tertiary
                );
            }
            public Builder setChannel(ChannelEnum channel) {
                this.channel = channel.getValue();
                return this;
            }
            public Builder setEnabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }
            public Builder setPrimary(PrimaryEnum primary) {
                this.primary = primary.getValue();
                return this;
            }
            public Builder setSecondary(SecondaryEnum secondary) {
                this.secondary = secondary.getValue();
                return this;
            }
            public Builder setTertiary(TertiaryEnum tertiary) {
                this.tertiary = tertiary.getValue();
                return this;
            }
        }

    
    }

    }

    public static class ContactUpdateRequest {
        private final String workspaceId;
        private final String xApiKey;
        private final String contactId;
        private final String accept;
        private final String contentType;
        private final Contact contact;
        ApiResponse _lastResponse;

        private ContactUpdateRequest(String workspaceId, String xApiKey, String contactId, String accept, String contentType, Contact contact) {
            this.workspaceId = workspaceId;
            this.xApiKey = xApiKey;
            this.contactId = contactId;
            this.accept = accept;
            this.contentType = contentType;
            this.contact = contact;
        }

        /**
         * Build call for contactUpdate
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return contactUpdateCall(workspaceId, xApiKey, contactId, accept, contentType, contact, _callback);
        }

        /**
         * Execute contactUpdate request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public void execute() throws ApiException {
            contactUpdateWithHttpInfo(workspaceId, xApiKey, contactId, accept, contentType, contact);
        }
        /**
         * Return the last executed API response
         * @return ApiResponse
         */
        public ApiResponse getLastResponse()  {
            return _lastResponse;
        }


        /**
         * Execute contactUpdate request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return contactUpdateAsync(workspaceId, xApiKey, contactId, accept, contentType, contact, _callback);
        }
    }

    /**
     * Update a contact
     * @param params The param instance required to create ContactUpdateRequest
     * @return void
     */

    public static void update(Map<String, Object> params) throws ApiException {
        String workspaceId = (String) params.get("workspaceId");

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }
        String contactId = (String) params.get("contactId");

        if(contactId == null || contactId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'contactId'");
        }
        String firstNameValue = (String) params.get("firstName");
        if(firstNameValue == null) {
            throw new ApiException("Missing the required property value of 'firstName'");
        }
        String lastNameValue = (String) params.get("lastName");
        if(lastNameValue == null) {
            throw new ApiException("Missing the required property value of 'lastName'");
        }
        String workMobilePhone1Value = (String) params.get("workMobilePhone1");
        if(workMobilePhone1Value == null) {
            throw new ApiException("Missing the required property value of 'workMobilePhone1'");
        }
        String workEmailAddress1Value = (String) params.get("workEmailAddress1");
        if(workEmailAddress1Value == null) {
            throw new ApiException("Missing the required property value of 'workEmailAddress1'");
        }
        String workCountryValue = (String) params.get("workCountry");
        if(workCountryValue == null) {
            throw new ApiException("Missing the required property value of 'workCountry'");
        }
        String timezoneValue = (String) params.get("timezone");
        if(timezoneValue == null) {
            throw new ApiException("Missing the required property value of 'timezone'");
        }
        String titleValue = (String) params.get("title");
        String workMobilePhone2Value = (String) params.get("workMobilePhone2");
        String workEmailAddress2Value = (String) params.get("workEmailAddress2");
        String workPhoneAreaCode1Value = (String) params.get("workPhoneAreaCode1");
        String workPhone1Value = (String) params.get("workPhone1");
        String workPhoneAreaCode2Value = (String) params.get("workPhoneAreaCode2");
        String workPhone2Value = (String) params.get("workPhone2");
        String workFaxAreaCode1Value = (String) params.get("workFaxAreaCode1");
        String workFax1Value = (String) params.get("workFax1");
        String workSatellitePhoneValue = (String) params.get("workSatellitePhone");
        String workOtherPhoneValue = (String) params.get("workOtherPhone");
        String workAddress1Value = (String) params.get("workAddress1");
        String workAddress2Value = (String) params.get("workAddress2");
        String workSuburbValue = (String) params.get("workSuburb");
        String workStateValue = (String) params.get("workState");
        String workPostCodeValue = (String) params.get("workPostCode");
        String workPostalAddress1Value = (String) params.get("workPostalAddress1");
        String workPostalAddress2Value = (String) params.get("workPostalAddress2");
        String workPostalSuburbValue = (String) params.get("workPostalSuburb");
        String workPostalStateValue = (String) params.get("workPostalState");
        String workPostalPostCodeValue = (String) params.get("workPostalPostCode");
        String personalEmailAddress1Value = (String) params.get("personalEmailAddress1");
        String personalEmailAddress2Value = (String) params.get("personalEmailAddress2");
        String personalAddress1Value = (String) params.get("personalAddress1");
        String personalAddress2Value = (String) params.get("personalAddress2");
        String personalSuburbValue = (String) params.get("personalSuburb");
        String personalStateValue = (String) params.get("personalState");
        String personalPostCodeValue = (String) params.get("personalPostCode");
        String personalCountryValue = (String) params.get("personalCountry");
        String personalPhoneAreaCode1Value = (String) params.get("personalPhoneAreaCode1");
        String personalPhone1Value = (String) params.get("personalPhone1");
        String personalPhoneAreaCode2Value = (String) params.get("personalPhoneAreaCode2");
        String personalPhone2Value = (String) params.get("personalPhone2");
        String personalFaxAreaCode1Value = (String) params.get("personalFaxAreaCode1");
        String personalFax1Value = (String) params.get("personalFax1");
        String otherPhoneAreaCode1Value = (String) params.get("otherPhoneAreaCode1");
        String otherPhone1Value = (String) params.get("otherPhone1");
        String otherMobileValue = (String) params.get("otherMobile");
        String otherFirstNameValue = (String) params.get("otherFirstName");
        String otherLastNameValue = (String) params.get("otherLastName");
        String otherTitleValue = (String) params.get("otherTitle");
        com.whispir.api.ContactsApi.ContactUpdateParams.StatusEnum statusValue = com.whispir.api.ContactsApi.ContactUpdateParams.StatusEnum.valueOf((String) params.get("status"));
        String companyNameValue = (String) params.get("companyName");
        String jobTitleValue = (String) params.get("jobTitle");
        String divisionValue = (String) params.get("division");
        String businessUnitValue = (String) params.get("businessUnit");
        String departmentValue = (String) params.get("department");
        String teamName1Value = (String) params.get("teamName1");
        String teamName2Value = (String) params.get("teamName2");
        String role1Value = (String) params.get("role1");
        String role2Value = (String) params.get("role2");
        List<Object> locations = Arrays.asList(params.get("locations"));
        List<com.whispir.api.ContactsApi.ContactUpdateParams.Location> locationsValue = null;
        if(locations != null) {
            locationsValue = locations.stream()
                .map(e -> (com.whispir.api.ContactsApi.ContactUpdateParams.Location) e).collect(Collectors.toList());
        }
        List<Object> messagingoptions = Arrays.asList(params.get("messagingoptions"));
        List<com.whispir.api.ContactsApi.ContactUpdateParams.MessagingOption> messagingoptionsValue = null;
        if(messagingoptions != null) {
            messagingoptionsValue = messagingoptions.stream()
                .map(e -> (com.whispir.api.ContactsApi.ContactUpdateParams.MessagingOption) e).collect(Collectors.toList());
        }
        ContactUpdateParams tempParams = ContactUpdateParams.builder()
            .setWorkspaceId(workspaceId)
            .setContactId(contactId)
            .setFirstName(firstNameValue)
            .setLastName(lastNameValue)
            .setWorkMobilePhone1(workMobilePhone1Value)
            .setWorkEmailAddress1(workEmailAddress1Value)
            .setWorkCountry(workCountryValue)
            .setTimezone(timezoneValue)
            .setTitle(titleValue)
            .setWorkMobilePhone2(workMobilePhone2Value)
            .setWorkEmailAddress2(workEmailAddress2Value)
            .setWorkPhoneAreaCode1(workPhoneAreaCode1Value)
            .setWorkPhone1(workPhone1Value)
            .setWorkPhoneAreaCode2(workPhoneAreaCode2Value)
            .setWorkPhone2(workPhone2Value)
            .setWorkFaxAreaCode1(workFaxAreaCode1Value)
            .setWorkFax1(workFax1Value)
            .setWorkSatellitePhone(workSatellitePhoneValue)
            .setWorkOtherPhone(workOtherPhoneValue)
            .setWorkAddress1(workAddress1Value)
            .setWorkAddress2(workAddress2Value)
            .setWorkSuburb(workSuburbValue)
            .setWorkState(workStateValue)
            .setWorkPostCode(workPostCodeValue)
            .setWorkPostalAddress1(workPostalAddress1Value)
            .setWorkPostalAddress2(workPostalAddress2Value)
            .setWorkPostalSuburb(workPostalSuburbValue)
            .setWorkPostalState(workPostalStateValue)
            .setWorkPostalPostCode(workPostalPostCodeValue)
            .setPersonalEmailAddress1(personalEmailAddress1Value)
            .setPersonalEmailAddress2(personalEmailAddress2Value)
            .setPersonalAddress1(personalAddress1Value)
            .setPersonalAddress2(personalAddress2Value)
            .setPersonalSuburb(personalSuburbValue)
            .setPersonalState(personalStateValue)
            .setPersonalPostCode(personalPostCodeValue)
            .setPersonalCountry(personalCountryValue)
            .setPersonalPhoneAreaCode1(personalPhoneAreaCode1Value)
            .setPersonalPhone1(personalPhone1Value)
            .setPersonalPhoneAreaCode2(personalPhoneAreaCode2Value)
            .setPersonalPhone2(personalPhone2Value)
            .setPersonalFaxAreaCode1(personalFaxAreaCode1Value)
            .setPersonalFax1(personalFax1Value)
            .setOtherPhoneAreaCode1(otherPhoneAreaCode1Value)
            .setOtherPhone1(otherPhone1Value)
            .setOtherMobile(otherMobileValue)
            .setOtherFirstName(otherFirstNameValue)
            .setOtherLastName(otherLastNameValue)
            .setOtherTitle(otherTitleValue)
            .setStatus(statusValue)
            .setCompanyName(companyNameValue)
            .setJobTitle(jobTitleValue)
            .setDivision(divisionValue)
            .setBusinessUnit(businessUnitValue)
            .setDepartment(departmentValue)
            .setTeamName1(teamName1Value)
            .setTeamName2(teamName2Value)
            .setRole1(role1Value)
            .setRole2(role2Value)
            .setLocations(locationsValue)
            .setMessagingoptions(messagingoptionsValue).build();

        update(tempParams);
    }

    public static void update(ContactUpdateParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }


        String workspaceId = params.getWorkspaceId();

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }


        String contactId = params.getContactId();

        if(contactId == null || contactId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'contactId'");
        }
        String accept = "application/vnd.whispir.contact-v1+json";

        String contentType = "application/vnd.whispir.contact-v1+json";


        // Constructing 'Contact' from 'ContactUpdateParams' instance passed
        Contact contact = new Contact();
        String firstNameValue = params.getFirstName();
        if(firstNameValue == null) {
            throw new ApiException("Missing the required property value of 'firstName'");
        }
        contact.setFirstName(firstNameValue);

        String lastNameValue = params.getLastName();
        if(lastNameValue == null) {
            throw new ApiException("Missing the required property value of 'lastName'");
        }
        contact.setLastName(lastNameValue);

        String workMobilePhone1Value = params.getWorkMobilePhone1();
        if(workMobilePhone1Value == null) {
            throw new ApiException("Missing the required property value of 'workMobilePhone1'");
        }
        contact.setWorkMobilePhone1(workMobilePhone1Value);

        String workEmailAddress1Value = params.getWorkEmailAddress1();
        if(workEmailAddress1Value == null) {
            throw new ApiException("Missing the required property value of 'workEmailAddress1'");
        }
        contact.setWorkEmailAddress1(workEmailAddress1Value);

        String workCountryValue = params.getWorkCountry();
        if(workCountryValue == null) {
            throw new ApiException("Missing the required property value of 'workCountry'");
        }
        contact.setWorkCountry(workCountryValue);

        String timezoneValue = params.getTimezone();
        if(timezoneValue == null) {
            throw new ApiException("Missing the required property value of 'timezone'");
        }
        contact.setTimezone(timezoneValue);

        String titleValue = params.getTitle();
        contact.setTitle(titleValue);

        String workMobilePhone2Value = params.getWorkMobilePhone2();
        contact.setWorkMobilePhone2(workMobilePhone2Value);

        String workEmailAddress2Value = params.getWorkEmailAddress2();
        contact.setWorkEmailAddress2(workEmailAddress2Value);

        String workPhoneAreaCode1Value = params.getWorkPhoneAreaCode1();
        contact.setWorkPhoneAreaCode1(workPhoneAreaCode1Value);

        String workPhone1Value = params.getWorkPhone1();
        contact.setWorkPhone1(workPhone1Value);

        String workPhoneAreaCode2Value = params.getWorkPhoneAreaCode2();
        contact.setWorkPhoneAreaCode2(workPhoneAreaCode2Value);

        String workPhone2Value = params.getWorkPhone2();
        contact.setWorkPhone2(workPhone2Value);

        String workFaxAreaCode1Value = params.getWorkFaxAreaCode1();
        contact.setWorkFaxAreaCode1(workFaxAreaCode1Value);

        String workFax1Value = params.getWorkFax1();
        contact.setWorkFax1(workFax1Value);

        String workSatellitePhoneValue = params.getWorkSatellitePhone();
        contact.setWorkSatellitePhone(workSatellitePhoneValue);

        String workOtherPhoneValue = params.getWorkOtherPhone();
        contact.setWorkOtherPhone(workOtherPhoneValue);

        String workAddress1Value = params.getWorkAddress1();
        contact.setWorkAddress1(workAddress1Value);

        String workAddress2Value = params.getWorkAddress2();
        contact.setWorkAddress2(workAddress2Value);

        String workSuburbValue = params.getWorkSuburb();
        contact.setWorkSuburb(workSuburbValue);

        String workStateValue = params.getWorkState();
        contact.setWorkState(workStateValue);

        String workPostCodeValue = params.getWorkPostCode();
        contact.setWorkPostCode(workPostCodeValue);

        String workPostalAddress1Value = params.getWorkPostalAddress1();
        contact.setWorkPostalAddress1(workPostalAddress1Value);

        String workPostalAddress2Value = params.getWorkPostalAddress2();
        contact.setWorkPostalAddress2(workPostalAddress2Value);

        String workPostalSuburbValue = params.getWorkPostalSuburb();
        contact.setWorkPostalSuburb(workPostalSuburbValue);

        String workPostalStateValue = params.getWorkPostalState();
        contact.setWorkPostalState(workPostalStateValue);

        String workPostalPostCodeValue = params.getWorkPostalPostCode();
        contact.setWorkPostalPostCode(workPostalPostCodeValue);

        String personalEmailAddress1Value = params.getPersonalEmailAddress1();
        contact.setPersonalEmailAddress1(personalEmailAddress1Value);

        String personalEmailAddress2Value = params.getPersonalEmailAddress2();
        contact.setPersonalEmailAddress2(personalEmailAddress2Value);

        String personalAddress1Value = params.getPersonalAddress1();
        contact.setPersonalAddress1(personalAddress1Value);

        String personalAddress2Value = params.getPersonalAddress2();
        contact.setPersonalAddress2(personalAddress2Value);

        String personalSuburbValue = params.getPersonalSuburb();
        contact.setPersonalSuburb(personalSuburbValue);

        String personalStateValue = params.getPersonalState();
        contact.setPersonalState(personalStateValue);

        String personalPostCodeValue = params.getPersonalPostCode();
        contact.setPersonalPostCode(personalPostCodeValue);

        String personalCountryValue = params.getPersonalCountry();
        contact.setPersonalCountry(personalCountryValue);

        String personalPhoneAreaCode1Value = params.getPersonalPhoneAreaCode1();
        contact.setPersonalPhoneAreaCode1(personalPhoneAreaCode1Value);

        String personalPhone1Value = params.getPersonalPhone1();
        contact.setPersonalPhone1(personalPhone1Value);

        String personalPhoneAreaCode2Value = params.getPersonalPhoneAreaCode2();
        contact.setPersonalPhoneAreaCode2(personalPhoneAreaCode2Value);

        String personalPhone2Value = params.getPersonalPhone2();
        contact.setPersonalPhone2(personalPhone2Value);

        String personalFaxAreaCode1Value = params.getPersonalFaxAreaCode1();
        contact.setPersonalFaxAreaCode1(personalFaxAreaCode1Value);

        String personalFax1Value = params.getPersonalFax1();
        contact.setPersonalFax1(personalFax1Value);

        String otherPhoneAreaCode1Value = params.getOtherPhoneAreaCode1();
        contact.setOtherPhoneAreaCode1(otherPhoneAreaCode1Value);

        String otherPhone1Value = params.getOtherPhone1();
        contact.setOtherPhone1(otherPhone1Value);

        String otherMobileValue = params.getOtherMobile();
        contact.setOtherMobile(otherMobileValue);

        String otherFirstNameValue = params.getOtherFirstName();
        contact.setOtherFirstName(otherFirstNameValue);

        String otherLastNameValue = params.getOtherLastName();
        contact.setOtherLastName(otherLastNameValue);

        String otherTitleValue = params.getOtherTitle();
        contact.setOtherTitle(otherTitleValue);

        String statusValue = params.getStatus();
        contact.setStatus(statusValue);

        String companyNameValue = params.getCompanyName();
        contact.setCompanyName(companyNameValue);

        String jobTitleValue = params.getJobTitle();
        contact.setJobTitle(jobTitleValue);

        String divisionValue = params.getDivision();
        contact.setDivision(divisionValue);

        String businessUnitValue = params.getBusinessUnit();
        contact.setBusinessUnit(businessUnitValue);

        String departmentValue = params.getDepartment();
        contact.setDepartment(departmentValue);

        String teamName1Value = params.getTeamName1();
        contact.setTeamName1(teamName1Value);

        String teamName2Value = params.getTeamName2();
        contact.setTeamName2(teamName2Value);

        String role1Value = params.getRole1();
        contact.setRole1(role1Value);

        String role2Value = params.getRole2();
        contact.setRole2(role2Value);

        List<com.whispir.api.ContactsApi.ContactUpdateParams.Location> locationsList = params.getLocations();
        List<com.whispir.model.Location> locationsValue = null;
        if(locationsList != null) {
            List<Object> locations = new ArrayList<Object>(params.getLocations());
            locationsValue = locations.stream()
                .map(e -> (com.whispir.model.Location) e).collect(Collectors.toList());
        }
        contact.setLocations(locationsValue);

        List<com.whispir.api.ContactsApi.ContactUpdateParams.MessagingOption> messagingoptionsList = params.getMessagingoptions();
        List<com.whispir.model.MessagingOption> messagingoptionsValue = null;
        if(messagingoptionsList != null) {
            List<Object> messagingoptions = new ArrayList<Object>(params.getMessagingoptions());
            messagingoptionsValue = messagingoptions.stream()
                .map(e -> (com.whispir.model.MessagingOption) e).collect(Collectors.toList());
        }
        contact.setMessagingoptions(messagingoptionsValue);

        ContactUpdateRequest request = new ContactUpdateRequest(workspaceId, xApiKey, contactId, accept, contentType, contact);

        // Ensure to include all of the 'optionalParams' that are passed

        request.execute();
    }
}
