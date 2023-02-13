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
import com.whispir.model.User;
import com.whispir.model.UserCollection;

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

public class UsersApi {
    private static ApiClient localVarApiClient = Configuration.getDefaultApiClient();

    private static okhttp3.Call userCreateCall(String xApiKey, String contentType, String accept, User user, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = user;

        // create path and map variables
        String localVarPath = "/users";

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

        if (contentType != null) {
            localVarHeaderParams.put("Content-Type", localVarApiClient.parameterToString(contentType));
        }

        if (accept != null) {
            localVarHeaderParams.put("Accept", localVarApiClient.parameterToString(accept));
        }

        final String[] localVarAccepts = {
            "application/vnd.whispir.user-v1+json",
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/vnd.whispir.user-v1+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth", "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private static okhttp3.Call userCreateValidateBeforeCall(String xApiKey, String contentType, String accept, User user, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling userCreate(Async)");
        }

        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new ApiException("Missing the required parameter 'contentType' when calling userCreate(Async)");
        }

        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling userCreate(Async)");
        }

        // verify the required parameter 'user' is set
        if (user == null) {
            throw new ApiException("Missing the required parameter 'user' when calling userCreate(Async)");
        }

        return userCreateCall(xApiKey, contentType, accept, user, _callback);
    }

    private static ApiResponse<User> userCreateWithHttpInfo(String xApiKey, String contentType, String accept, User user) throws ApiException {
        okhttp3.Call localVarCall = userCreateCall(xApiKey, contentType, accept, user, null);
        Type localVarReturnType = new TypeToken<User>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private static okhttp3.Call userCreateAsync(String xApiKey, String contentType, String accept, User user, final ApiCallback<User> _callback) throws ApiException {
        okhttp3.Call localVarCall = userCreateValidateBeforeCall(xApiKey, contentType, accept, user, _callback);
        Type localVarReturnType = new TypeToken<User>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public static class UserCreateParams {
        private User user;
        private String userName;
        private String password;
        private String firstName;
        private String middleName;
        private String lastName;
        private String title;
        private String nickname;
        private String status;
        private String workMobilePhone1;
        private String workEmailAddress1;
        private String workCountry;
        private String timezone;
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
        private String companyName;
        private String jobTitle;
        private String division;
        private String businessUnit;
        private String department;
        private String teamName1;
        private String teamName2;
        private String role1;
        private String role2;

        private UserCreateParams(
            User user,
            String userName,
            String password,
            String firstName,
            String middleName,
            String lastName,
            String title,
            String nickname,
            String status,
            String workMobilePhone1,
            String workEmailAddress1,
            String workCountry,
            String timezone,
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
            String companyName,
            String jobTitle,
            String division,
            String businessUnit,
            String department,
            String teamName1,
            String teamName2,
            String role1,
            String role2
        ){
            this.user = user;
            this.userName = userName;
            this.password = password;
            this.firstName = firstName;
            this.middleName = middleName;
            this.lastName = lastName;
            this.title = title;
            this.nickname = nickname;
            this.status = status;
            this.workMobilePhone1 = workMobilePhone1;
            this.workEmailAddress1 = workEmailAddress1;
            this.workCountry = workCountry;
            this.timezone = timezone;
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
            this.companyName = companyName;
            this.jobTitle = jobTitle;
            this.division = division;
            this.businessUnit = businessUnit;
            this.department = department;
            this.teamName1 = teamName1;
            this.teamName2 = teamName2;
            this.role1 = role1;
            this.role2 = role2;
        }
            public User getUser() {
                return user;
            }
            public String getUserName() {
                return userName;
            }
            public String getPassword() {
                return password;
            }
            public String getFirstName() {
                return firstName;
            }
            public String getMiddleName() {
                return middleName;
            }
            public String getLastName() {
                return lastName;
            }
            public String getTitle() {
                return title;
            }
            public String getNickname() {
                return nickname;
            }
            public enum StatusEnum {
            ACTIVE("ACTIVE"),
            
            A("A"),
            
            INACTIVE("INACTIVE"),
            
            I("I"),
            
            PENDING("PENDING"),
            
            P("P"),
            
            SUSPENDED("SUSPENDED"),
            
            B("B"),
            
            DELETED("DELETED"),
            
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

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private User user;
            private String userName;
            private String password;
            private String firstName;
            private String middleName;
            private String lastName;
            private String title;
            private String nickname;
            private String status;
            private String workMobilePhone1;
            private String workEmailAddress1;
            private String workCountry;
            private String timezone;
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
            private String companyName;
            private String jobTitle;
            private String division;
            private String businessUnit;
            private String department;
            private String teamName1;
            private String teamName2;
            private String role1;
            private String role2;

            public UserCreateParams build() {
                return new UserCreateParams(
                    user,
                    userName,
                    password,
                    firstName,
                    middleName,
                    lastName,
                    title,
                    nickname,
                    status,
                    workMobilePhone1,
                    workEmailAddress1,
                    workCountry,
                    timezone,
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
                    companyName,
                    jobTitle,
                    division,
                    businessUnit,
                    department,
                    teamName1,
                    teamName2,
                    role1,
                    role2
                );
            }

            public Builder setUser(User user) {
                this.user = user;
                return this;
            }
            public Builder setUserName(String userName) {
                this.userName = userName;
                return this;
            }
            public Builder setPassword(String password) {
                this.password = password;
                return this;
            }
            public Builder setFirstName(String firstName) {
                this.firstName = firstName;
                return this;
            }
            public Builder setMiddleName(String middleName) {
                this.middleName = middleName;
                return this;
            }
            public Builder setLastName(String lastName) {
                this.lastName = lastName;
                return this;
            }
            public Builder setTitle(String title) {
                this.title = title;
                return this;
            }
            public Builder setNickname(String nickname) {
                this.nickname = nickname;
                return this;
            }
            public Builder setStatus(StatusEnum status) {
                this.status = status.getValue();
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
        }
        

    }

    public static class UserCreateRequest {
        private final String xApiKey;
        private final String contentType;
        private final String accept;
        private final User user;
        ApiResponse _lastResponse;

        private UserCreateRequest(String xApiKey, String contentType, String accept, User user) {
            this.xApiKey = xApiKey;
            this.contentType = contentType;
            this.accept = accept;
            this.user = user;
        }

        /**
         * Build call for userCreate
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return userCreateCall(xApiKey, contentType, accept, user, _callback);
        }

        /**
         * Execute userCreate request
         * @return User
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public User execute() throws ApiException {
            ApiResponse<User> localVarResp = userCreateWithHttpInfo(xApiKey, contentType, accept, user);
            _lastResponse = localVarResp;
            User data = localVarResp.getData();

            
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
         * Execute userCreate request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<User> _callback) throws ApiException {
            return userCreateAsync(xApiKey, contentType, accept, user, _callback);
        }
    }

    /**
     * Create a user
     * @param params The param instance required to create UserCreateRequest
     * @return User
     */

    public static User create(Map<String, Object> params) throws ApiException {
        String userNameValue = (String) params.get("userName");
        if(userNameValue == null) {
            throw new ApiException("Missing the required property value of 'userName'");
        }
        String passwordValue = (String) params.get("password");
        if(passwordValue == null) {
            throw new ApiException("Missing the required property value of 'password'");
        }
        String firstNameValue = (String) params.get("firstName");
        if(firstNameValue == null) {
            throw new ApiException("Missing the required property value of 'firstName'");
        }
        String middleNameValue = (String) params.get("middleName");
        String lastNameValue = (String) params.get("lastName");
        if(lastNameValue == null) {
            throw new ApiException("Missing the required property value of 'lastName'");
        }
        String titleValue = (String) params.get("title");
        String nicknameValue = (String) params.get("nickname");
        com.whispir.api.UsersApi.UserCreateParams.StatusEnum statusValue = com.whispir.api.UsersApi.UserCreateParams.StatusEnum.valueOf((String) params.get("status"));
        String workMobilePhone1Value = (String) params.get("workMobilePhone1");
        String workEmailAddress1Value = (String) params.get("workEmailAddress1");
        String workCountryValue = (String) params.get("workCountry");
        if(workCountryValue == null) {
            throw new ApiException("Missing the required property value of 'workCountry'");
        }
        String timezoneValue = (String) params.get("timezone");
        if(timezoneValue == null) {
            throw new ApiException("Missing the required property value of 'timezone'");
        }
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
        String companyNameValue = (String) params.get("companyName");
        String jobTitleValue = (String) params.get("jobTitle");
        String divisionValue = (String) params.get("division");
        String businessUnitValue = (String) params.get("businessUnit");
        String departmentValue = (String) params.get("department");
        String teamName1Value = (String) params.get("teamName1");
        String teamName2Value = (String) params.get("teamName2");
        String role1Value = (String) params.get("role1");
        String role2Value = (String) params.get("role2");
        UserCreateParams tempParams = UserCreateParams.builder()
            .setUserName(userNameValue)
            .setPassword(passwordValue)
            .setFirstName(firstNameValue)
            .setMiddleName(middleNameValue)
            .setLastName(lastNameValue)
            .setTitle(titleValue)
            .setNickname(nicknameValue)
            .setStatus(statusValue)
            .setWorkMobilePhone1(workMobilePhone1Value)
            .setWorkEmailAddress1(workEmailAddress1Value)
            .setWorkCountry(workCountryValue)
            .setTimezone(timezoneValue)
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
            .setCompanyName(companyNameValue)
            .setJobTitle(jobTitleValue)
            .setDivision(divisionValue)
            .setBusinessUnit(businessUnitValue)
            .setDepartment(departmentValue)
            .setTeamName1(teamName1Value)
            .setTeamName2(teamName2Value)
            .setRole1(role1Value)
            .setRole2(role2Value).build();

        return create(tempParams);
    }

    public static User create(UserCreateParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }


        String contentType = "application/vnd.whispir.user-v1+json";

        String accept = "application/vnd.whispir.user-v1+json";


        // Constructing 'User' from 'UserCreateParams' instance passed
        User user = new User();
        String userNameValue = params.getUserName();
        if(userNameValue == null) {
            throw new ApiException("Missing the required property value of 'userName'");
        }
        user.setUserName(userNameValue);

        String passwordValue = params.getPassword();
        if(passwordValue == null) {
            throw new ApiException("Missing the required property value of 'password'");
        }
        user.setPassword(passwordValue);

        String firstNameValue = params.getFirstName();
        if(firstNameValue == null) {
            throw new ApiException("Missing the required property value of 'firstName'");
        }
        user.setFirstName(firstNameValue);

        String middleNameValue = params.getMiddleName();
        user.setMiddleName(middleNameValue);

        String lastNameValue = params.getLastName();
        if(lastNameValue == null) {
            throw new ApiException("Missing the required property value of 'lastName'");
        }
        user.setLastName(lastNameValue);

        String titleValue = params.getTitle();
        user.setTitle(titleValue);

        String nicknameValue = params.getNickname();
        user.setNickname(nicknameValue);

        String statusValue = params.getStatus();
        user.setStatus(statusValue);

        String workMobilePhone1Value = params.getWorkMobilePhone1();
        user.setWorkMobilePhone1(workMobilePhone1Value);

        String workEmailAddress1Value = params.getWorkEmailAddress1();
        user.setWorkEmailAddress1(workEmailAddress1Value);

        String workCountryValue = params.getWorkCountry();
        if(workCountryValue == null) {
            throw new ApiException("Missing the required property value of 'workCountry'");
        }
        user.setWorkCountry(workCountryValue);

        String timezoneValue = params.getTimezone();
        if(timezoneValue == null) {
            throw new ApiException("Missing the required property value of 'timezone'");
        }
        user.setTimezone(timezoneValue);

        String workMobilePhone2Value = params.getWorkMobilePhone2();
        user.setWorkMobilePhone2(workMobilePhone2Value);

        String workEmailAddress2Value = params.getWorkEmailAddress2();
        user.setWorkEmailAddress2(workEmailAddress2Value);

        String workPhoneAreaCode1Value = params.getWorkPhoneAreaCode1();
        user.setWorkPhoneAreaCode1(workPhoneAreaCode1Value);

        String workPhone1Value = params.getWorkPhone1();
        user.setWorkPhone1(workPhone1Value);

        String workPhoneAreaCode2Value = params.getWorkPhoneAreaCode2();
        user.setWorkPhoneAreaCode2(workPhoneAreaCode2Value);

        String workPhone2Value = params.getWorkPhone2();
        user.setWorkPhone2(workPhone2Value);

        String workFaxAreaCode1Value = params.getWorkFaxAreaCode1();
        user.setWorkFaxAreaCode1(workFaxAreaCode1Value);

        String workFax1Value = params.getWorkFax1();
        user.setWorkFax1(workFax1Value);

        String workSatellitePhoneValue = params.getWorkSatellitePhone();
        user.setWorkSatellitePhone(workSatellitePhoneValue);

        String workOtherPhoneValue = params.getWorkOtherPhone();
        user.setWorkOtherPhone(workOtherPhoneValue);

        String workAddress1Value = params.getWorkAddress1();
        user.setWorkAddress1(workAddress1Value);

        String workAddress2Value = params.getWorkAddress2();
        user.setWorkAddress2(workAddress2Value);

        String workSuburbValue = params.getWorkSuburb();
        user.setWorkSuburb(workSuburbValue);

        String workStateValue = params.getWorkState();
        user.setWorkState(workStateValue);

        String workPostCodeValue = params.getWorkPostCode();
        user.setWorkPostCode(workPostCodeValue);

        String workPostalAddress1Value = params.getWorkPostalAddress1();
        user.setWorkPostalAddress1(workPostalAddress1Value);

        String workPostalAddress2Value = params.getWorkPostalAddress2();
        user.setWorkPostalAddress2(workPostalAddress2Value);

        String workPostalSuburbValue = params.getWorkPostalSuburb();
        user.setWorkPostalSuburb(workPostalSuburbValue);

        String workPostalStateValue = params.getWorkPostalState();
        user.setWorkPostalState(workPostalStateValue);

        String workPostalPostCodeValue = params.getWorkPostalPostCode();
        user.setWorkPostalPostCode(workPostalPostCodeValue);

        String personalEmailAddress1Value = params.getPersonalEmailAddress1();
        user.setPersonalEmailAddress1(personalEmailAddress1Value);

        String personalEmailAddress2Value = params.getPersonalEmailAddress2();
        user.setPersonalEmailAddress2(personalEmailAddress2Value);

        String personalAddress1Value = params.getPersonalAddress1();
        user.setPersonalAddress1(personalAddress1Value);

        String personalAddress2Value = params.getPersonalAddress2();
        user.setPersonalAddress2(personalAddress2Value);

        String personalSuburbValue = params.getPersonalSuburb();
        user.setPersonalSuburb(personalSuburbValue);

        String personalStateValue = params.getPersonalState();
        user.setPersonalState(personalStateValue);

        String personalPostCodeValue = params.getPersonalPostCode();
        user.setPersonalPostCode(personalPostCodeValue);

        String personalCountryValue = params.getPersonalCountry();
        user.setPersonalCountry(personalCountryValue);

        String personalPhoneAreaCode1Value = params.getPersonalPhoneAreaCode1();
        user.setPersonalPhoneAreaCode1(personalPhoneAreaCode1Value);

        String personalPhone1Value = params.getPersonalPhone1();
        user.setPersonalPhone1(personalPhone1Value);

        String personalPhoneAreaCode2Value = params.getPersonalPhoneAreaCode2();
        user.setPersonalPhoneAreaCode2(personalPhoneAreaCode2Value);

        String personalPhone2Value = params.getPersonalPhone2();
        user.setPersonalPhone2(personalPhone2Value);

        String personalFaxAreaCode1Value = params.getPersonalFaxAreaCode1();
        user.setPersonalFaxAreaCode1(personalFaxAreaCode1Value);

        String personalFax1Value = params.getPersonalFax1();
        user.setPersonalFax1(personalFax1Value);

        String otherPhoneAreaCode1Value = params.getOtherPhoneAreaCode1();
        user.setOtherPhoneAreaCode1(otherPhoneAreaCode1Value);

        String otherPhone1Value = params.getOtherPhone1();
        user.setOtherPhone1(otherPhone1Value);

        String otherMobileValue = params.getOtherMobile();
        user.setOtherMobile(otherMobileValue);

        String otherFirstNameValue = params.getOtherFirstName();
        user.setOtherFirstName(otherFirstNameValue);

        String otherLastNameValue = params.getOtherLastName();
        user.setOtherLastName(otherLastNameValue);

        String otherTitleValue = params.getOtherTitle();
        user.setOtherTitle(otherTitleValue);

        String companyNameValue = params.getCompanyName();
        user.setCompanyName(companyNameValue);

        String jobTitleValue = params.getJobTitle();
        user.setJobTitle(jobTitleValue);

        String divisionValue = params.getDivision();
        user.setDivision(divisionValue);

        String businessUnitValue = params.getBusinessUnit();
        user.setBusinessUnit(businessUnitValue);

        String departmentValue = params.getDepartment();
        user.setDepartment(departmentValue);

        String teamName1Value = params.getTeamName1();
        user.setTeamName1(teamName1Value);

        String teamName2Value = params.getTeamName2();
        user.setTeamName2(teamName2Value);

        String role1Value = params.getRole1();
        user.setRole1(role1Value);

        String role2Value = params.getRole2();
        user.setRole2(role2Value);

        UserCreateRequest request = new UserCreateRequest(xApiKey, contentType, accept, user);

        // Ensure to include all of the 'optionalParams' that are passed

        return request.execute();
    }
    private static okhttp3.Call userDeleteCall(String xApiKey, String contentType, String accept, String userId, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/users/{userId}"
            .replace("{" + "userId" + "}", localVarApiClient.escapeString(userId.toString()));

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

        if (contentType != null) {
            localVarHeaderParams.put("Content-Type", localVarApiClient.parameterToString(contentType));
        }

        if (accept != null) {
            localVarHeaderParams.put("Accept", localVarApiClient.parameterToString(accept));
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
    private static okhttp3.Call userDeleteValidateBeforeCall(String xApiKey, String contentType, String accept, String userId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling userDelete(Async)");
        }

        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new ApiException("Missing the required parameter 'contentType' when calling userDelete(Async)");
        }

        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling userDelete(Async)");
        }

        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling userDelete(Async)");
        }

        return userDeleteCall(xApiKey, contentType, accept, userId, _callback);
    }

    private static ApiResponse<Void> userDeleteWithHttpInfo(String xApiKey, String contentType, String accept, String userId) throws ApiException {
        okhttp3.Call localVarCall = userDeleteCall(xApiKey, contentType, accept, userId, null);
        return localVarApiClient.execute(localVarCall);
    }

    private static okhttp3.Call userDeleteAsync(String xApiKey, String contentType, String accept, String userId, final ApiCallback<Void> _callback) throws ApiException {
        okhttp3.Call localVarCall = userDeleteValidateBeforeCall(xApiKey, contentType, accept, userId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public static class UserDeleteParams {
        private String userId;

        private UserDeleteParams(
            String userId
        ){
            this.userId = userId;
        }
            public String getUserId() {
                return userId;
            }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private String userId;

            public UserDeleteParams build() {
                return new UserDeleteParams(
                    userId
                );
            }

            public Builder setUserId(String userId) {
                this.userId = userId;
                return this;
            }
        }
        
    }

    public static class UserDeleteRequest {
        private final String xApiKey;
        private final String contentType;
        private final String accept;
        private final String userId;
        ApiResponse _lastResponse;

        private UserDeleteRequest(String xApiKey, String contentType, String accept, String userId) {
            this.xApiKey = xApiKey;
            this.contentType = contentType;
            this.accept = accept;
            this.userId = userId;
        }

        /**
         * Build call for userDelete
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return userDeleteCall(xApiKey, contentType, accept, userId, _callback);
        }

        /**
         * Execute userDelete request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public void execute() throws ApiException {
            userDeleteWithHttpInfo(xApiKey, contentType, accept, userId);
        }
        /**
         * Return the last executed API response
         * @return ApiResponse
         */
        public ApiResponse getLastResponse()  {
            return _lastResponse;
        }


        /**
         * Execute userDelete request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return userDeleteAsync(xApiKey, contentType, accept, userId, _callback);
        }
    }

    /**
     * Delete a user
     * @param params The param instance required to create UserDeleteRequest
     * @return void
     */

    public static void delete(Map<String, Object> params) throws ApiException {
        String userId = (String) params.get("userId");

        if(userId == null || userId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'userId'");
        }
        UserDeleteParams tempParams = UserDeleteParams.builder()
            .setUserId(userId).build();

        delete(tempParams);
    }

    public static void delete(UserDeleteParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }


        String contentType = "application/vnd.whispir.user-v1+json";

        String accept = "application/vnd.whispir.user-v1+json";


        String userId = params.getUserId();

        if(userId == null || userId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'userId'");
        }
        UserDeleteRequest request = new UserDeleteRequest(xApiKey, contentType, accept, userId);

        // Ensure to include all of the 'optionalParams' that are passed

        request.execute();
    }
    private static okhttp3.Call userListCall(String xApiKey, String accept, String fieldname, String sortOrder, String sortFields, BigDecimal limit, BigDecimal offset, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/users";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarHeaderParams.put("Authorization", String.format("Basic %s", authHeader));
        localVarHeaderParams.put("User-Agent", String.format("whispir-java-%s", Version.VERSION));

        if (fieldname != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldname", fieldname));
        }

        if (sortOrder != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sortOrder", sortOrder));
        }

        if (sortFields != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sortFields", sortFields));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (offset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offset", offset));
        }

        if (xApiKey != null) {
            localVarHeaderParams.put("X-Api-Key", localVarApiClient.parameterToString(xApiKey));
        }

        if (accept != null) {
            localVarHeaderParams.put("Accept", localVarApiClient.parameterToString(accept));
        }

        final String[] localVarAccepts = {
            "application/vnd.whispir.user-v1+json",
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
    private static okhttp3.Call userListValidateBeforeCall(String xApiKey, String accept, String fieldname, String sortOrder, String sortFields, BigDecimal limit, BigDecimal offset, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling userList(Async)");
        }

        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling userList(Async)");
        }

        return userListCall(xApiKey, accept, fieldname, sortOrder, sortFields, limit, offset, _callback);
    }

    private static ApiResponse<UserCollection> userListWithHttpInfo(String xApiKey, String accept, String fieldname, String sortOrder, String sortFields, BigDecimal limit, BigDecimal offset) throws ApiException {
        okhttp3.Call localVarCall = userListCall(xApiKey, accept, fieldname, sortOrder, sortFields, limit, offset, null);
        Type localVarReturnType = new TypeToken<UserCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private static okhttp3.Call userListAsync(String xApiKey, String accept, String fieldname, String sortOrder, String sortFields, BigDecimal limit, BigDecimal offset, final ApiCallback<UserCollection> _callback) throws ApiException {
        okhttp3.Call localVarCall = userListValidateBeforeCall(xApiKey, accept, fieldname, sortOrder, sortFields, limit, offset, _callback);
        Type localVarReturnType = new TypeToken<UserCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public static class UserListParams {
        private String fieldname;
        private String sortOrder;
        private String sortFields;
        private BigDecimal limit;
        private BigDecimal offset;

        private UserListParams(
            String fieldname,
            String sortOrder,
            String sortFields,
            BigDecimal limit,
            BigDecimal offset
        ){
            this.fieldname = fieldname;
            this.sortOrder = sortOrder;
            this.sortFields = sortFields;
            this.limit = limit;
            this.offset = offset;
        }
            public String getFieldname() {
                return fieldname;
            }
            public String getSortOrder() {
                return sortOrder;
            }
            public String getSortFields() {
                return sortFields;
            }
            public BigDecimal getLimit() {
                return limit;
            }
            public BigDecimal getOffset() {
                return offset;
            }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private String fieldname;
            private String sortOrder;
            private String sortFields;
            private BigDecimal limit;
            private BigDecimal offset;

            public UserListParams build() {
                return new UserListParams(
                    fieldname,
                    sortOrder,
                    sortFields,
                    limit,
                    offset
                );
            }

            public Builder setFieldname(String fieldname) {
                this.fieldname = fieldname;
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
            public Builder setLimit(BigDecimal limit) {
                this.limit = limit;
                return this;
            }
            public Builder setOffset(BigDecimal offset) {
                this.offset = offset;
                return this;
            }
        }
        
    }

    public static class UserListRequest {
        private final String xApiKey;
        private final String accept;
        private String fieldname;
        private String sortOrder;
        private String sortFields;
        private BigDecimal limit;
        private BigDecimal offset;
        ApiResponse _lastResponse;

        private UserListRequest(String xApiKey, String accept) {
            this.xApiKey = xApiKey;
            this.accept = accept;
        }

        /**
         * Set fieldname
         * @param fieldname A filter on the User attributes. Only Users with matching attributes will be returned. (optional)
         * @return APIuserListRequest
         */
        public UserListRequest fieldname(String fieldname) {
            this.fieldname = fieldname;
            return this;
        }

        /**
         * Set sortOrder
         * @param sortOrder The order in which you require the results to be returned. Either ‘asc’ or ‘desc’ (optional)
         * @return APIuserListRequest
         */
        public UserListRequest sortOrder(String sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * Set sortFields
         * @param sortFields The fields that you require the ordering to be performed on. Multiple fields can be provided, separated by a comma. (optional)
         * @return APIuserListRequest
         */
        public UserListRequest sortFields(String sortFields) {
            this.sortFields = sortFields;
            return this;
        }

        /**
         * Set limit
         * @param limit The number of records to be returned. (optional, default to 20)
         * @return APIuserListRequest
         */
        public UserListRequest limit(BigDecimal limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Set offset
         * @param offset The record number to start returning from. (optional, default to 0)
         * @return APIuserListRequest
         */
        public UserListRequest offset(BigDecimal offset) {
            this.offset = offset;
            return this;
        }

        /**
         * Build call for userList
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return userListCall(xApiKey, accept, fieldname, sortOrder, sortFields, limit, offset, _callback);
        }

        /**
         * Execute userList request
         * @return UserCollection
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public UserCollection execute() throws ApiException {
            ApiResponse<UserCollection> localVarResp = userListWithHttpInfo(xApiKey, accept, fieldname, sortOrder, sortFields, limit, offset);
            _lastResponse = localVarResp;
            UserCollection data = localVarResp.getData();

            
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
         * Execute userList request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<UserCollection> _callback) throws ApiException {
            return userListAsync(xApiKey, accept, fieldname, sortOrder, sortFields, limit, offset, _callback);
        }
    }

    /**
     * List users
     * @param params The param instance required to create UserListRequest
     * @return UserCollection
     */

    public static UserCollection list(Map<String, Object> params) throws ApiException {
        String fieldname = null;
        if(params.containsKey("fieldname") && params.get("fieldname") != null){
            fieldname = (String) params.get("fieldname");
        }
        String sortOrder = null;
        if(params.containsKey("sortOrder") && params.get("sortOrder") != null){
            sortOrder = (String) params.get("sortOrder");
        }
        String sortFields = null;
        if(params.containsKey("sortFields") && params.get("sortFields") != null){
            sortFields = (String) params.get("sortFields");
        }
        BigDecimal limit = null;
        if(params.containsKey("limit") && params.get("limit") != null){
            limit = (BigDecimal) params.get("limit");
        }
        BigDecimal offset = null;
        if(params.containsKey("offset") && params.get("offset") != null){
            offset = (BigDecimal) params.get("offset");
        }
        UserListParams tempParams = UserListParams.builder()
            .setFieldname(fieldname)
            .setSortOrder(sortOrder)
            .setSortFields(sortFields)
            .setLimit(limit)
            .setOffset(offset).build();

        return list(tempParams);
    }

    public static UserCollection list(UserListParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }


        String accept = "application/vnd.whispir.user-v1+json";

        UserListRequest request = new UserListRequest(xApiKey, accept);

        // Ensure to include all of the 'optionalParams' that are passed
        if(params.fieldname != null){
            String fieldname = params.getFieldname();
            request.fieldname(fieldname);
        }
        if(params.sortOrder != null){
            String sortOrder = params.getSortOrder();
            request.sortOrder(sortOrder);
        }
        if(params.sortFields != null){
            String sortFields = params.getSortFields();
            request.sortFields(sortFields);
        }
        if(params.limit != null){
            BigDecimal limit = params.getLimit();
            request.limit(limit);
        }
        if(params.offset != null){
            BigDecimal offset = params.getOffset();
            request.offset(offset);
        }

        return request.execute();
    }
    private static okhttp3.Call userRetrieveCall(String xApiKey, String accept, String userId, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/users/{userId}"
            .replace("{" + "userId" + "}", localVarApiClient.escapeString(userId.toString()));

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

        final String[] localVarAccepts = {
            "application/vnd.whispir.user-v1+json",
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
    private static okhttp3.Call userRetrieveValidateBeforeCall(String xApiKey, String accept, String userId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling userRetrieve(Async)");
        }

        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling userRetrieve(Async)");
        }

        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling userRetrieve(Async)");
        }

        return userRetrieveCall(xApiKey, accept, userId, _callback);
    }

    private static ApiResponse<User> userRetrieveWithHttpInfo(String xApiKey, String accept, String userId) throws ApiException {
        okhttp3.Call localVarCall = userRetrieveCall(xApiKey, accept, userId, null);
        Type localVarReturnType = new TypeToken<User>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private static okhttp3.Call userRetrieveAsync(String xApiKey, String accept, String userId, final ApiCallback<User> _callback) throws ApiException {
        okhttp3.Call localVarCall = userRetrieveValidateBeforeCall(xApiKey, accept, userId, _callback);
        Type localVarReturnType = new TypeToken<User>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public static class UserRetrieveParams {
        private String userId;

        private UserRetrieveParams(
            String userId
        ){
            this.userId = userId;
        }
            public String getUserId() {
                return userId;
            }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private String userId;

            public UserRetrieveParams build() {
                return new UserRetrieveParams(
                    userId
                );
            }

            public Builder setUserId(String userId) {
                this.userId = userId;
                return this;
            }
        }
        
    }

    public static class UserRetrieveRequest {
        private final String xApiKey;
        private final String accept;
        private final String userId;
        ApiResponse _lastResponse;

        private UserRetrieveRequest(String xApiKey, String accept, String userId) {
            this.xApiKey = xApiKey;
            this.accept = accept;
            this.userId = userId;
        }

        /**
         * Build call for userRetrieve
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return userRetrieveCall(xApiKey, accept, userId, _callback);
        }

        /**
         * Execute userRetrieve request
         * @return User
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public User execute() throws ApiException {
            ApiResponse<User> localVarResp = userRetrieveWithHttpInfo(xApiKey, accept, userId);
            _lastResponse = localVarResp;
            User data = localVarResp.getData();

            
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
         * Execute userRetrieve request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<User> _callback) throws ApiException {
            return userRetrieveAsync(xApiKey, accept, userId, _callback);
        }
    }

    /**
     * Retrieve a user
     * @param params The param instance required to create UserRetrieveRequest
     * @return User
     */

    public static User retrieve(Map<String, Object> params) throws ApiException {
        String userId = (String) params.get("userId");

        if(userId == null || userId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'userId'");
        }
        UserRetrieveParams tempParams = UserRetrieveParams.builder()
            .setUserId(userId).build();

        return retrieve(tempParams);
    }

    public static User retrieve(UserRetrieveParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }


        String accept = "application/vnd.whispir.user-v1+json";


        String userId = params.getUserId();

        if(userId == null || userId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'userId'");
        }
        UserRetrieveRequest request = new UserRetrieveRequest(xApiKey, accept, userId);

        // Ensure to include all of the 'optionalParams' that are passed

        return request.execute();
    }
    private static okhttp3.Call userUpdateCall(String xApiKey, String contentType, String accept, String userId, User user, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = user;

        // create path and map variables
        String localVarPath = "/users/{userId}"
            .replace("{" + "userId" + "}", localVarApiClient.escapeString(userId.toString()));

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

        if (contentType != null) {
            localVarHeaderParams.put("Content-Type", localVarApiClient.parameterToString(contentType));
        }

        if (accept != null) {
            localVarHeaderParams.put("Accept", localVarApiClient.parameterToString(accept));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/vnd.whispir.user-v1+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth", "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private static okhttp3.Call userUpdateValidateBeforeCall(String xApiKey, String contentType, String accept, String userId, User user, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling userUpdate(Async)");
        }

        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new ApiException("Missing the required parameter 'contentType' when calling userUpdate(Async)");
        }

        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling userUpdate(Async)");
        }

        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling userUpdate(Async)");
        }

        // verify the required parameter 'user' is set
        if (user == null) {
            throw new ApiException("Missing the required parameter 'user' when calling userUpdate(Async)");
        }

        return userUpdateCall(xApiKey, contentType, accept, userId, user, _callback);
    }

    private static ApiResponse<Void> userUpdateWithHttpInfo(String xApiKey, String contentType, String accept, String userId, User user) throws ApiException {
        okhttp3.Call localVarCall = userUpdateCall(xApiKey, contentType, accept, userId, user, null);
        return localVarApiClient.execute(localVarCall);
    }

    private static okhttp3.Call userUpdateAsync(String xApiKey, String contentType, String accept, String userId, User user, final ApiCallback<Void> _callback) throws ApiException {
        okhttp3.Call localVarCall = userUpdateValidateBeforeCall(xApiKey, contentType, accept, userId, user, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public static class UserUpdateParams {
        private String userId;
        private User user;
        private String userName;
        private String password;
        private String firstName;
        private String middleName;
        private String lastName;
        private String title;
        private String nickname;
        private String status;
        private String workMobilePhone1;
        private String workEmailAddress1;
        private String workCountry;
        private String timezone;
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
        private String companyName;
        private String jobTitle;
        private String division;
        private String businessUnit;
        private String department;
        private String teamName1;
        private String teamName2;
        private String role1;
        private String role2;

        private UserUpdateParams(
            String userId,
            User user,
            String userName,
            String password,
            String firstName,
            String middleName,
            String lastName,
            String title,
            String nickname,
            String status,
            String workMobilePhone1,
            String workEmailAddress1,
            String workCountry,
            String timezone,
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
            String companyName,
            String jobTitle,
            String division,
            String businessUnit,
            String department,
            String teamName1,
            String teamName2,
            String role1,
            String role2
        ){
            this.userId = userId;
            this.user = user;
            this.userName = userName;
            this.password = password;
            this.firstName = firstName;
            this.middleName = middleName;
            this.lastName = lastName;
            this.title = title;
            this.nickname = nickname;
            this.status = status;
            this.workMobilePhone1 = workMobilePhone1;
            this.workEmailAddress1 = workEmailAddress1;
            this.workCountry = workCountry;
            this.timezone = timezone;
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
            this.companyName = companyName;
            this.jobTitle = jobTitle;
            this.division = division;
            this.businessUnit = businessUnit;
            this.department = department;
            this.teamName1 = teamName1;
            this.teamName2 = teamName2;
            this.role1 = role1;
            this.role2 = role2;
        }
            public String getUserId() {
                return userId;
            }
            public User getUser() {
                return user;
            }
            public String getUserName() {
                return userName;
            }
            public String getPassword() {
                return password;
            }
            public String getFirstName() {
                return firstName;
            }
            public String getMiddleName() {
                return middleName;
            }
            public String getLastName() {
                return lastName;
            }
            public String getTitle() {
                return title;
            }
            public String getNickname() {
                return nickname;
            }
            public enum StatusEnum {
            ACTIVE("ACTIVE"),
            
            A("A"),
            
            INACTIVE("INACTIVE"),
            
            I("I"),
            
            PENDING("PENDING"),
            
            P("P"),
            
            SUSPENDED("SUSPENDED"),
            
            B("B"),
            
            DELETED("DELETED"),
            
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

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private String userId;
            private User user;
            private String userName;
            private String password;
            private String firstName;
            private String middleName;
            private String lastName;
            private String title;
            private String nickname;
            private String status;
            private String workMobilePhone1;
            private String workEmailAddress1;
            private String workCountry;
            private String timezone;
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
            private String companyName;
            private String jobTitle;
            private String division;
            private String businessUnit;
            private String department;
            private String teamName1;
            private String teamName2;
            private String role1;
            private String role2;

            public UserUpdateParams build() {
                return new UserUpdateParams(
                    userId,
                    user,
                    userName,
                    password,
                    firstName,
                    middleName,
                    lastName,
                    title,
                    nickname,
                    status,
                    workMobilePhone1,
                    workEmailAddress1,
                    workCountry,
                    timezone,
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
                    companyName,
                    jobTitle,
                    division,
                    businessUnit,
                    department,
                    teamName1,
                    teamName2,
                    role1,
                    role2
                );
            }

            public Builder setUserId(String userId) {
                this.userId = userId;
                return this;
            }
            public Builder setUser(User user) {
                this.user = user;
                return this;
            }
            public Builder setUserName(String userName) {
                this.userName = userName;
                return this;
            }
            public Builder setPassword(String password) {
                this.password = password;
                return this;
            }
            public Builder setFirstName(String firstName) {
                this.firstName = firstName;
                return this;
            }
            public Builder setMiddleName(String middleName) {
                this.middleName = middleName;
                return this;
            }
            public Builder setLastName(String lastName) {
                this.lastName = lastName;
                return this;
            }
            public Builder setTitle(String title) {
                this.title = title;
                return this;
            }
            public Builder setNickname(String nickname) {
                this.nickname = nickname;
                return this;
            }
            public Builder setStatus(StatusEnum status) {
                this.status = status.getValue();
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
        }
        

    }

    public static class UserUpdateRequest {
        private final String xApiKey;
        private final String contentType;
        private final String accept;
        private final String userId;
        private final User user;
        ApiResponse _lastResponse;

        private UserUpdateRequest(String xApiKey, String contentType, String accept, String userId, User user) {
            this.xApiKey = xApiKey;
            this.contentType = contentType;
            this.accept = accept;
            this.userId = userId;
            this.user = user;
        }

        /**
         * Build call for userUpdate
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return userUpdateCall(xApiKey, contentType, accept, userId, user, _callback);
        }

        /**
         * Execute userUpdate request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public void execute() throws ApiException {
            userUpdateWithHttpInfo(xApiKey, contentType, accept, userId, user);
        }
        /**
         * Return the last executed API response
         * @return ApiResponse
         */
        public ApiResponse getLastResponse()  {
            return _lastResponse;
        }


        /**
         * Execute userUpdate request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return userUpdateAsync(xApiKey, contentType, accept, userId, user, _callback);
        }
    }

    /**
     * Update a user
     * @param params The param instance required to create UserUpdateRequest
     * @return void
     */

    public static void update(Map<String, Object> params) throws ApiException {
        String userId = (String) params.get("userId");

        if(userId == null || userId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'userId'");
        }
        String userNameValue = (String) params.get("userName");
        if(userNameValue == null) {
            throw new ApiException("Missing the required property value of 'userName'");
        }
        String passwordValue = (String) params.get("password");
        if(passwordValue == null) {
            throw new ApiException("Missing the required property value of 'password'");
        }
        String firstNameValue = (String) params.get("firstName");
        if(firstNameValue == null) {
            throw new ApiException("Missing the required property value of 'firstName'");
        }
        String middleNameValue = (String) params.get("middleName");
        String lastNameValue = (String) params.get("lastName");
        if(lastNameValue == null) {
            throw new ApiException("Missing the required property value of 'lastName'");
        }
        String titleValue = (String) params.get("title");
        String nicknameValue = (String) params.get("nickname");
        com.whispir.api.UsersApi.UserUpdateParams.StatusEnum statusValue = com.whispir.api.UsersApi.UserUpdateParams.StatusEnum.valueOf((String) params.get("status"));
        String workMobilePhone1Value = (String) params.get("workMobilePhone1");
        String workEmailAddress1Value = (String) params.get("workEmailAddress1");
        String workCountryValue = (String) params.get("workCountry");
        if(workCountryValue == null) {
            throw new ApiException("Missing the required property value of 'workCountry'");
        }
        String timezoneValue = (String) params.get("timezone");
        if(timezoneValue == null) {
            throw new ApiException("Missing the required property value of 'timezone'");
        }
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
        String companyNameValue = (String) params.get("companyName");
        String jobTitleValue = (String) params.get("jobTitle");
        String divisionValue = (String) params.get("division");
        String businessUnitValue = (String) params.get("businessUnit");
        String departmentValue = (String) params.get("department");
        String teamName1Value = (String) params.get("teamName1");
        String teamName2Value = (String) params.get("teamName2");
        String role1Value = (String) params.get("role1");
        String role2Value = (String) params.get("role2");
        UserUpdateParams tempParams = UserUpdateParams.builder()
            .setUserId(userId)
            .setUserName(userNameValue)
            .setPassword(passwordValue)
            .setFirstName(firstNameValue)
            .setMiddleName(middleNameValue)
            .setLastName(lastNameValue)
            .setTitle(titleValue)
            .setNickname(nicknameValue)
            .setStatus(statusValue)
            .setWorkMobilePhone1(workMobilePhone1Value)
            .setWorkEmailAddress1(workEmailAddress1Value)
            .setWorkCountry(workCountryValue)
            .setTimezone(timezoneValue)
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
            .setCompanyName(companyNameValue)
            .setJobTitle(jobTitleValue)
            .setDivision(divisionValue)
            .setBusinessUnit(businessUnitValue)
            .setDepartment(departmentValue)
            .setTeamName1(teamName1Value)
            .setTeamName2(teamName2Value)
            .setRole1(role1Value)
            .setRole2(role2Value).build();

        update(tempParams);
    }

    public static void update(UserUpdateParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }


        String contentType = "application/vnd.whispir.user-v1+json";

        String accept = "application/vnd.whispir.user-v1+json";


        String userId = params.getUserId();

        if(userId == null || userId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'userId'");
        }

        // Constructing 'User' from 'UserUpdateParams' instance passed
        User user = new User();
        String userNameValue = params.getUserName();
        if(userNameValue == null) {
            throw new ApiException("Missing the required property value of 'userName'");
        }
        user.setUserName(userNameValue);

        String passwordValue = params.getPassword();
        if(passwordValue == null) {
            throw new ApiException("Missing the required property value of 'password'");
        }
        user.setPassword(passwordValue);

        String firstNameValue = params.getFirstName();
        if(firstNameValue == null) {
            throw new ApiException("Missing the required property value of 'firstName'");
        }
        user.setFirstName(firstNameValue);

        String middleNameValue = params.getMiddleName();
        user.setMiddleName(middleNameValue);

        String lastNameValue = params.getLastName();
        if(lastNameValue == null) {
            throw new ApiException("Missing the required property value of 'lastName'");
        }
        user.setLastName(lastNameValue);

        String titleValue = params.getTitle();
        user.setTitle(titleValue);

        String nicknameValue = params.getNickname();
        user.setNickname(nicknameValue);

        String statusValue = params.getStatus();
        user.setStatus(statusValue);

        String workMobilePhone1Value = params.getWorkMobilePhone1();
        user.setWorkMobilePhone1(workMobilePhone1Value);

        String workEmailAddress1Value = params.getWorkEmailAddress1();
        user.setWorkEmailAddress1(workEmailAddress1Value);

        String workCountryValue = params.getWorkCountry();
        if(workCountryValue == null) {
            throw new ApiException("Missing the required property value of 'workCountry'");
        }
        user.setWorkCountry(workCountryValue);

        String timezoneValue = params.getTimezone();
        if(timezoneValue == null) {
            throw new ApiException("Missing the required property value of 'timezone'");
        }
        user.setTimezone(timezoneValue);

        String workMobilePhone2Value = params.getWorkMobilePhone2();
        user.setWorkMobilePhone2(workMobilePhone2Value);

        String workEmailAddress2Value = params.getWorkEmailAddress2();
        user.setWorkEmailAddress2(workEmailAddress2Value);

        String workPhoneAreaCode1Value = params.getWorkPhoneAreaCode1();
        user.setWorkPhoneAreaCode1(workPhoneAreaCode1Value);

        String workPhone1Value = params.getWorkPhone1();
        user.setWorkPhone1(workPhone1Value);

        String workPhoneAreaCode2Value = params.getWorkPhoneAreaCode2();
        user.setWorkPhoneAreaCode2(workPhoneAreaCode2Value);

        String workPhone2Value = params.getWorkPhone2();
        user.setWorkPhone2(workPhone2Value);

        String workFaxAreaCode1Value = params.getWorkFaxAreaCode1();
        user.setWorkFaxAreaCode1(workFaxAreaCode1Value);

        String workFax1Value = params.getWorkFax1();
        user.setWorkFax1(workFax1Value);

        String workSatellitePhoneValue = params.getWorkSatellitePhone();
        user.setWorkSatellitePhone(workSatellitePhoneValue);

        String workOtherPhoneValue = params.getWorkOtherPhone();
        user.setWorkOtherPhone(workOtherPhoneValue);

        String workAddress1Value = params.getWorkAddress1();
        user.setWorkAddress1(workAddress1Value);

        String workAddress2Value = params.getWorkAddress2();
        user.setWorkAddress2(workAddress2Value);

        String workSuburbValue = params.getWorkSuburb();
        user.setWorkSuburb(workSuburbValue);

        String workStateValue = params.getWorkState();
        user.setWorkState(workStateValue);

        String workPostCodeValue = params.getWorkPostCode();
        user.setWorkPostCode(workPostCodeValue);

        String workPostalAddress1Value = params.getWorkPostalAddress1();
        user.setWorkPostalAddress1(workPostalAddress1Value);

        String workPostalAddress2Value = params.getWorkPostalAddress2();
        user.setWorkPostalAddress2(workPostalAddress2Value);

        String workPostalSuburbValue = params.getWorkPostalSuburb();
        user.setWorkPostalSuburb(workPostalSuburbValue);

        String workPostalStateValue = params.getWorkPostalState();
        user.setWorkPostalState(workPostalStateValue);

        String workPostalPostCodeValue = params.getWorkPostalPostCode();
        user.setWorkPostalPostCode(workPostalPostCodeValue);

        String personalEmailAddress1Value = params.getPersonalEmailAddress1();
        user.setPersonalEmailAddress1(personalEmailAddress1Value);

        String personalEmailAddress2Value = params.getPersonalEmailAddress2();
        user.setPersonalEmailAddress2(personalEmailAddress2Value);

        String personalAddress1Value = params.getPersonalAddress1();
        user.setPersonalAddress1(personalAddress1Value);

        String personalAddress2Value = params.getPersonalAddress2();
        user.setPersonalAddress2(personalAddress2Value);

        String personalSuburbValue = params.getPersonalSuburb();
        user.setPersonalSuburb(personalSuburbValue);

        String personalStateValue = params.getPersonalState();
        user.setPersonalState(personalStateValue);

        String personalPostCodeValue = params.getPersonalPostCode();
        user.setPersonalPostCode(personalPostCodeValue);

        String personalCountryValue = params.getPersonalCountry();
        user.setPersonalCountry(personalCountryValue);

        String personalPhoneAreaCode1Value = params.getPersonalPhoneAreaCode1();
        user.setPersonalPhoneAreaCode1(personalPhoneAreaCode1Value);

        String personalPhone1Value = params.getPersonalPhone1();
        user.setPersonalPhone1(personalPhone1Value);

        String personalPhoneAreaCode2Value = params.getPersonalPhoneAreaCode2();
        user.setPersonalPhoneAreaCode2(personalPhoneAreaCode2Value);

        String personalPhone2Value = params.getPersonalPhone2();
        user.setPersonalPhone2(personalPhone2Value);

        String personalFaxAreaCode1Value = params.getPersonalFaxAreaCode1();
        user.setPersonalFaxAreaCode1(personalFaxAreaCode1Value);

        String personalFax1Value = params.getPersonalFax1();
        user.setPersonalFax1(personalFax1Value);

        String otherPhoneAreaCode1Value = params.getOtherPhoneAreaCode1();
        user.setOtherPhoneAreaCode1(otherPhoneAreaCode1Value);

        String otherPhone1Value = params.getOtherPhone1();
        user.setOtherPhone1(otherPhone1Value);

        String otherMobileValue = params.getOtherMobile();
        user.setOtherMobile(otherMobileValue);

        String otherFirstNameValue = params.getOtherFirstName();
        user.setOtherFirstName(otherFirstNameValue);

        String otherLastNameValue = params.getOtherLastName();
        user.setOtherLastName(otherLastNameValue);

        String otherTitleValue = params.getOtherTitle();
        user.setOtherTitle(otherTitleValue);

        String companyNameValue = params.getCompanyName();
        user.setCompanyName(companyNameValue);

        String jobTitleValue = params.getJobTitle();
        user.setJobTitle(jobTitleValue);

        String divisionValue = params.getDivision();
        user.setDivision(divisionValue);

        String businessUnitValue = params.getBusinessUnit();
        user.setBusinessUnit(businessUnitValue);

        String departmentValue = params.getDepartment();
        user.setDepartment(departmentValue);

        String teamName1Value = params.getTeamName1();
        user.setTeamName1(teamName1Value);

        String teamName2Value = params.getTeamName2();
        user.setTeamName2(teamName2Value);

        String role1Value = params.getRole1();
        user.setRole1(role1Value);

        String role2Value = params.getRole2();
        user.setRole2(role2Value);

        UserUpdateRequest request = new UserUpdateRequest(xApiKey, contentType, accept, userId, user);

        // Ensure to include all of the 'optionalParams' that are passed

        request.execute();
    }
    private static okhttp3.Call userWorkspaceListCall(String workspaceId, String xApiKey, String accept, String sortOrder, String sortFields, BigDecimal limit, BigDecimal offset, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/workspaces/{workspaceId}/users"
            .replace("{" + "workspaceId" + "}", localVarApiClient.escapeString(workspaceId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarHeaderParams.put("Authorization", String.format("Basic %s", authHeader));
        localVarHeaderParams.put("User-Agent", String.format("whispir-java-%s", Version.VERSION));

        if (sortOrder != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sortOrder", sortOrder));
        }

        if (sortFields != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sortFields", sortFields));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (offset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offset", offset));
        }

        if (xApiKey != null) {
            localVarHeaderParams.put("X-Api-Key", localVarApiClient.parameterToString(xApiKey));
        }

        if (accept != null) {
            localVarHeaderParams.put("Accept", localVarApiClient.parameterToString(accept));
        }

        final String[] localVarAccepts = {
            "application/vnd.whispir.user-v1+json",
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
    private static okhttp3.Call userWorkspaceListValidateBeforeCall(String workspaceId, String xApiKey, String accept, String sortOrder, String sortFields, BigDecimal limit, BigDecimal offset, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'workspaceId' is set
        if (workspaceId == null) {
            throw new ApiException("Missing the required parameter 'workspaceId' when calling userWorkspaceList(Async)");
        }

        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling userWorkspaceList(Async)");
        }

        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling userWorkspaceList(Async)");
        }

        return userWorkspaceListCall(workspaceId, xApiKey, accept, sortOrder, sortFields, limit, offset, _callback);
    }

    private static ApiResponse<UserCollection> userWorkspaceListWithHttpInfo(String workspaceId, String xApiKey, String accept, String sortOrder, String sortFields, BigDecimal limit, BigDecimal offset) throws ApiException {
        okhttp3.Call localVarCall = userWorkspaceListCall(workspaceId, xApiKey, accept, sortOrder, sortFields, limit, offset, null);
        Type localVarReturnType = new TypeToken<UserCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private static okhttp3.Call userWorkspaceListAsync(String workspaceId, String xApiKey, String accept, String sortOrder, String sortFields, BigDecimal limit, BigDecimal offset, final ApiCallback<UserCollection> _callback) throws ApiException {
        okhttp3.Call localVarCall = userWorkspaceListValidateBeforeCall(workspaceId, xApiKey, accept, sortOrder, sortFields, limit, offset, _callback);
        Type localVarReturnType = new TypeToken<UserCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public static class UserWorkspaceListParams {
        private String workspaceId;
        private String sortOrder;
        private String sortFields;
        private BigDecimal limit;
        private BigDecimal offset;

        private UserWorkspaceListParams(
            String workspaceId,
            String sortOrder,
            String sortFields,
            BigDecimal limit,
            BigDecimal offset
        ){
            this.workspaceId = workspaceId;
            this.sortOrder = sortOrder;
            this.sortFields = sortFields;
            this.limit = limit;
            this.offset = offset;
        }
            public String getWorkspaceId() {
                return workspaceId;
            }
            public String getSortOrder() {
                return sortOrder;
            }
            public String getSortFields() {
                return sortFields;
            }
            public BigDecimal getLimit() {
                return limit;
            }
            public BigDecimal getOffset() {
                return offset;
            }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private String workspaceId;
            private String sortOrder;
            private String sortFields;
            private BigDecimal limit;
            private BigDecimal offset;

            public UserWorkspaceListParams build() {
                return new UserWorkspaceListParams(
                    workspaceId,
                    sortOrder,
                    sortFields,
                    limit,
                    offset
                );
            }

            public Builder setWorkspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
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
            public Builder setLimit(BigDecimal limit) {
                this.limit = limit;
                return this;
            }
            public Builder setOffset(BigDecimal offset) {
                this.offset = offset;
                return this;
            }
        }
        
    }

    public static class UserWorkspaceListRequest {
        private final String workspaceId;
        private final String xApiKey;
        private final String accept;
        private String sortOrder;
        private String sortFields;
        private BigDecimal limit;
        private BigDecimal offset;
        ApiResponse _lastResponse;

        private UserWorkspaceListRequest(String workspaceId, String xApiKey, String accept) {
            this.workspaceId = workspaceId;
            this.xApiKey = xApiKey;
            this.accept = accept;
        }

        /**
         * Set sortOrder
         * @param sortOrder The order in which you require the results to be returned. Either ‘asc’ or ‘desc’ (optional)
         * @return APIuserWorkspaceListRequest
         */
        public UserWorkspaceListRequest sortOrder(String sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * Set sortFields
         * @param sortFields The fields that you require the ordering to be performed on. Multiple fields can be provided, separated by a comma. (optional)
         * @return APIuserWorkspaceListRequest
         */
        public UserWorkspaceListRequest sortFields(String sortFields) {
            this.sortFields = sortFields;
            return this;
        }

        /**
         * Set limit
         * @param limit The number of records to be returned. (optional, default to 20)
         * @return APIuserWorkspaceListRequest
         */
        public UserWorkspaceListRequest limit(BigDecimal limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Set offset
         * @param offset The record number to start returning from. (optional, default to 0)
         * @return APIuserWorkspaceListRequest
         */
        public UserWorkspaceListRequest offset(BigDecimal offset) {
            this.offset = offset;
            return this;
        }

        /**
         * Build call for userWorkspaceList
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return userWorkspaceListCall(workspaceId, xApiKey, accept, sortOrder, sortFields, limit, offset, _callback);
        }

        /**
         * Execute userWorkspaceList request
         * @return UserCollection
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public UserCollection execute() throws ApiException {
            ApiResponse<UserCollection> localVarResp = userWorkspaceListWithHttpInfo(workspaceId, xApiKey, accept, sortOrder, sortFields, limit, offset);
            _lastResponse = localVarResp;
            UserCollection data = localVarResp.getData();

            
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
         * Execute userWorkspaceList request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<UserCollection> _callback) throws ApiException {
            return userWorkspaceListAsync(workspaceId, xApiKey, accept, sortOrder, sortFields, limit, offset, _callback);
        }
    }

    /**
     * List workspace users
     * @param params The param instance required to create UserWorkspaceListRequest
     * @return UserCollection
     */

    public static UserCollection listByWorkspace(Map<String, Object> params) throws ApiException {
        String sortOrder = null;
        if(params.containsKey("sortOrder") && params.get("sortOrder") != null){
            sortOrder = (String) params.get("sortOrder");
        }
        String sortFields = null;
        if(params.containsKey("sortFields") && params.get("sortFields") != null){
            sortFields = (String) params.get("sortFields");
        }
        BigDecimal limit = null;
        if(params.containsKey("limit") && params.get("limit") != null){
            limit = (BigDecimal) params.get("limit");
        }
        BigDecimal offset = null;
        if(params.containsKey("offset") && params.get("offset") != null){
            offset = (BigDecimal) params.get("offset");
        }
        String workspaceId = (String) params.get("workspaceId");

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }
        UserWorkspaceListParams tempParams = UserWorkspaceListParams.builder()
            .setWorkspaceId(workspaceId)
            .setSortOrder(sortOrder)
            .setSortFields(sortFields)
            .setLimit(limit)
            .setOffset(offset).build();

        return listByWorkspace(tempParams);
    }

    public static UserCollection listByWorkspace(UserWorkspaceListParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }


        String workspaceId = params.getWorkspaceId();

        if(workspaceId == null || workspaceId.isEmpty()) {
            throw new ApiException("Missing the required parameter 'workspaceId'");
        }

        String accept = "application/vnd.whispir.user-v1+json";

        UserWorkspaceListRequest request = new UserWorkspaceListRequest(workspaceId, xApiKey, accept);

        // Ensure to include all of the 'optionalParams' that are passed
        if(params.sortOrder != null){
            String sortOrder = params.getSortOrder();
            request.sortOrder(sortOrder);
        }
        if(params.sortFields != null){
            String sortFields = params.getSortFields();
            request.sortFields(sortFields);
        }
        if(params.limit != null){
            BigDecimal limit = params.getLimit();
            request.limit(limit);
        }
        if(params.offset != null){
            BigDecimal offset = params.getOffset();
            request.offset(offset);
        }

        return request.execute();
    }
    private static okhttp3.Call usersDeleteCall(String xApiKey, String contentType, String accept, final ApiCallback _callback) throws ApiException {
        String basePath = Whispir.host;
        String authHeader = Whispir.getAuthorizationHeader();

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/users";

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

        if (contentType != null) {
            localVarHeaderParams.put("Content-Type", localVarApiClient.parameterToString(contentType));
        }

        if (accept != null) {
            localVarHeaderParams.put("Accept", localVarApiClient.parameterToString(accept));
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
    private static okhttp3.Call usersDeleteValidateBeforeCall(String xApiKey, String contentType, String accept, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling usersDelete(Async)");
        }

        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new ApiException("Missing the required parameter 'contentType' when calling usersDelete(Async)");
        }

        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling usersDelete(Async)");
        }

        return usersDeleteCall(xApiKey, contentType, accept, _callback);
    }

    private static ApiResponse<Void> usersDeleteWithHttpInfo(String xApiKey, String contentType, String accept) throws ApiException {
        okhttp3.Call localVarCall = usersDeleteCall(xApiKey, contentType, accept, null);
        return localVarApiClient.execute(localVarCall);
    }

    private static okhttp3.Call usersDeleteAsync(String xApiKey, String contentType, String accept, final ApiCallback<Void> _callback) throws ApiException {
        okhttp3.Call localVarCall = usersDeleteValidateBeforeCall(xApiKey, contentType, accept, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public static class UsersDeleteParams {

        private UsersDeleteParams(
        ){
        }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {

            public UsersDeleteParams build() {
                return new UsersDeleteParams(
                );
            }

        }
        
    }

    public static class UsersDeleteRequest {
        private final String xApiKey;
        private final String contentType;
        private final String accept;
        ApiResponse _lastResponse;

        private UsersDeleteRequest(String xApiKey, String contentType, String accept) {
            this.xApiKey = xApiKey;
            this.contentType = contentType;
            this.accept = accept;
        }

        /**
         * Build call for usersDelete
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return usersDeleteCall(xApiKey, contentType, accept, _callback);
        }

        /**
         * Execute usersDelete request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         */
        public void execute() throws ApiException {
            usersDeleteWithHttpInfo(xApiKey, contentType, accept);
        }
        /**
         * Return the last executed API response
         * @return ApiResponse
         */
        public ApiResponse getLastResponse()  {
            return _lastResponse;
        }


        /**
         * Execute usersDelete request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return usersDeleteAsync(xApiKey, contentType, accept, _callback);
        }
    }

    /**
     * Delete all users
     * @param params The param instance required to create UsersDeleteRequest
     * @return void
     */

    public static void deleteAll(Map<String, Object> params) throws ApiException {
        UsersDeleteParams tempParams = null;

        deleteAll(tempParams);
    }

    public static void deleteAll(UsersDeleteParams params) throws ApiException {
        // retrieving apiKeyAuth value from apiClient
        String xApiKey = Whispir.apiKey;
        
        if(xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey'");
        }


        String contentType = "application/vnd.whispir.user-v1+json";

        String accept = "application/vnd.whispir.user-v1+json";

        UsersDeleteRequest request = new UsersDeleteRequest(xApiKey, contentType, accept);

        // Ensure to include all of the 'optionalParams' that are passed

        request.execute();
    }
}
