package com.whispir.model;
import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.whispir.model.Link;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.net.URI;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.whispir.client.ApiResponse;
import com.whispir.client.JSON;

/**
 * The user object.
 */

public class User {
  @SerializedName("docId")
  private String docId;
  @SerializedName("rawOutput")
  private String rawOutput;
  // Additional getters/setters
  /**
   * The identifier for the resource
   * 
   * @return docId
   **/
  public String getDocId() {
    return docId;
  }
  public void setDocId(String docId) {
    this.docId = docId;
  }
  public String getRawOutput() {
    return rawOutput;
  }
  public ApiResponse lastResponse;
  @SerializedName("id")
  private String id;

  @SerializedName("link")
  private List<Link> link;

  @SerializedName("userName")
  private String userName;

  @SerializedName("password")
  private String password;

  @SerializedName("firstName")
  private String firstName;

  @SerializedName("middleName")
  private String middleName;

  @SerializedName("lastName")
  private String lastName;

  @SerializedName("title")
  private String title;

  @SerializedName("nickname")
  private String nickname;

  @SerializedName("status")
  private String status;

  @SerializedName("workMobilePhone1")
  private String workMobilePhone1;

  @SerializedName("workEmailAddress1")
  private String workEmailAddress1;

  @SerializedName("workCountry")
  private String workCountry;

  @SerializedName("timezone")
  private String timezone;

  @SerializedName("workMobilePhone2")
  private String workMobilePhone2;

  @SerializedName("workEmailAddress2")
  private String workEmailAddress2;

  @SerializedName("workPhoneAreaCode1")
  private String workPhoneAreaCode1;

  @SerializedName("workPhone1")
  private String workPhone1;

  @SerializedName("workPhoneAreaCode2")
  private String workPhoneAreaCode2;

  @SerializedName("workPhone2")
  private String workPhone2;

  @SerializedName("workFaxAreaCode1")
  private String workFaxAreaCode1;

  @SerializedName("workFax1")
  private String workFax1;

  @SerializedName("workSatellitePhone")
  private String workSatellitePhone;

  @SerializedName("workOtherPhone")
  private String workOtherPhone;

  @SerializedName("workAddress1")
  private String workAddress1;

  @SerializedName("workAddress2")
  private String workAddress2;

  @SerializedName("workSuburb")
  private String workSuburb;

  @SerializedName("workState")
  private String workState;

  @SerializedName("workPostCode")
  private String workPostCode;

  @SerializedName("workPostalAddress1")
  private String workPostalAddress1;

  @SerializedName("workPostalAddress2")
  private String workPostalAddress2;

  @SerializedName("workPostalSuburb")
  private String workPostalSuburb;

  @SerializedName("workPostalState")
  private String workPostalState;

  @SerializedName("workPostalPostCode")
  private String workPostalPostCode;

  @SerializedName("personalEmailAddress1")
  private String personalEmailAddress1;

  @SerializedName("personalEmailAddress2")
  private String personalEmailAddress2;

  @SerializedName("personalAddress1")
  private String personalAddress1;

  @SerializedName("personalAddress2")
  private String personalAddress2;

  @SerializedName("personalSuburb")
  private String personalSuburb;

  @SerializedName("personalState")
  private String personalState;

  @SerializedName("personalPostCode")
  private String personalPostCode;

  @SerializedName("personalCountry")
  private String personalCountry;

  @SerializedName("personalPhoneAreaCode1")
  private String personalPhoneAreaCode1;

  @SerializedName("personalPhone1")
  private String personalPhone1;

  @SerializedName("personalPhoneAreaCode2")
  private String personalPhoneAreaCode2;

  @SerializedName("personalPhone2")
  private String personalPhone2;

  @SerializedName("personalFaxAreaCode1")
  private String personalFaxAreaCode1;

  @SerializedName("personalFax1")
  private String personalFax1;

  @SerializedName("otherPhoneAreaCode1")
  private String otherPhoneAreaCode1;

  @SerializedName("otherPhone1")
  private String otherPhone1;

  @SerializedName("otherMobile")
  private String otherMobile;

  @SerializedName("otherFirstName")
  private String otherFirstName;

  @SerializedName("otherLastName")
  private String otherLastName;

  @SerializedName("otherTitle")
  private String otherTitle;

  @SerializedName("companyName")
  private String companyName;

  @SerializedName("jobTitle")
  private String jobTitle;

  @SerializedName("division")
  private String division;

  @SerializedName("businessUnit")
  private String businessUnit;

  @SerializedName("department")
  private String department;

  @SerializedName("teamName1")
  private String teamName1;

  @SerializedName("teamName2")
  private String teamName2;

  @SerializedName("role1")
  private String role1;

  @SerializedName("role2")
  private String role2;

  public User() {
    super();
  }

  public User(
    String id, 
    List<Link> link
  ) {
    this();
    this.id = id;
    this.link = link;
  }
   /**
   * The ID of the user.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }
   /**
   * A [HATEOAS](https://en.wikipedia.org/wiki/HATEOAS) link array, describing all discoverable resources in relation to the original request.
   * @return link
  **/
  @javax.annotation.Nullable
  public List<Link> getLink() {
    return link;
  }

   /**
   * Specifies the username for the account
   * @return userName
  **/
  @javax.annotation.Nonnull
  public String getUserName() {
    return userName;
  }
  public void setUserName(String userName) {
    this.userName = userName;
  }

   /**
   * Specifies the password for the account &lt;p&gt;&lt;b&gt;Note:&lt;/b&gt;The following are the rules for the password:&lt;/p&gt;&lt;p&gt;&lt;ul&gt;&lt;li&gt;Alpha Numeric [a-zA-Z0-9_]&lt;/li&gt;&lt;li&gt;Must have at least one uppercase and one lowercase character&lt;/li&gt;&lt;/ul&gt;&lt;/p&gt;
   * @return password
  **/
  @javax.annotation.Nonnull
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

   /**
   * The first name of the user.
   * @return firstName
  **/
  @javax.annotation.Nonnull
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

   /**
   * The middle name of the user.
   * @return middleName
  **/
  @javax.annotation.Nullable
  public String getMiddleName() {
    return middleName;
  }
  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

   /**
   * The last name of the user.
   * @return lastName
  **/
  @javax.annotation.Nonnull
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

   /**
   * The title to address the user with.
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

   /**
   * Preferred name to be shown in the platfom interface
   * @return nickname
  **/
  @javax.annotation.Nullable
  public String getNickname() {
    return nickname;
  }
  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

   /**
   * Specifies the validity status of the user. The default status is PENDING. One cannot set the status while creation of account. Read &#x60;User State Machine&#x60; again mentioned above.&lt;/p&gt;
   * @return status
  **/
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

   /**
   * The primary work mobile number of the user.
   * @return workMobilePhone1
  **/
  @javax.annotation.Nullable
  public String getWorkMobilePhone1() {
    return workMobilePhone1;
  }
  public void setWorkMobilePhone1(String workMobilePhone1) {
    this.workMobilePhone1 = workMobilePhone1;
  }

   /**
   * The primary work email address of the user.
   * @return workEmailAddress1
  **/
  @javax.annotation.Nullable
  public String getWorkEmailAddress1() {
    return workEmailAddress1;
  }
  public void setWorkEmailAddress1(String workEmailAddress1) {
    this.workEmailAddress1 = workEmailAddress1;
  }

   /**
   * The work country of the user.
   * @return workCountry
  **/
  @javax.annotation.Nonnull
  public String getWorkCountry() {
    return workCountry;
  }
  public void setWorkCountry(String workCountry) {
    this.workCountry = workCountry;
  }

   /**
   * The time zone in which the user lives in. Values are relative to GMT.  Supported values are:  * Offset from GMT in the format &#x60;+/-NN&#x60;. For example, &#x60;+10&#x60;. * Worldwide time zone in the format &#x60;Country/City&#x60;. For example, &#x60;Australia/Melbourne&#x60;  See the list of [worldwide time zones](https://en.wikipedia.org/wiki/List_of_time_zones_by_country).
   * @return timezone
  **/
  @javax.annotation.Nonnull
  public String getTimezone() {
    return timezone;
  }
  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

   /**
   * The secondary work mobile number of the user.
   * @return workMobilePhone2
  **/
  @javax.annotation.Nullable
  public String getWorkMobilePhone2() {
    return workMobilePhone2;
  }
  public void setWorkMobilePhone2(String workMobilePhone2) {
    this.workMobilePhone2 = workMobilePhone2;
  }

   /**
   * The secondary work email address of the user.
   * @return workEmailAddress2
  **/
  @javax.annotation.Nullable
  public String getWorkEmailAddress2() {
    return workEmailAddress2;
  }
  public void setWorkEmailAddress2(String workEmailAddress2) {
    this.workEmailAddress2 = workEmailAddress2;
  }

   /**
   * The primary work phone number area code of the user.
   * @return workPhoneAreaCode1
  **/
  @javax.annotation.Nullable
  public String getWorkPhoneAreaCode1() {
    return workPhoneAreaCode1;
  }
  public void setWorkPhoneAreaCode1(String workPhoneAreaCode1) {
    this.workPhoneAreaCode1 = workPhoneAreaCode1;
  }

   /**
   * The primary work phone number of the user.
   * @return workPhone1
  **/
  @javax.annotation.Nullable
  public String getWorkPhone1() {
    return workPhone1;
  }
  public void setWorkPhone1(String workPhone1) {
    this.workPhone1 = workPhone1;
  }

   /**
   * The secondary work phone number area code of the user.
   * @return workPhoneAreaCode2
  **/
  @javax.annotation.Nullable
  public String getWorkPhoneAreaCode2() {
    return workPhoneAreaCode2;
  }
  public void setWorkPhoneAreaCode2(String workPhoneAreaCode2) {
    this.workPhoneAreaCode2 = workPhoneAreaCode2;
  }

   /**
   * The secondary work phone number of the user.
   * @return workPhone2
  **/
  @javax.annotation.Nullable
  public String getWorkPhone2() {
    return workPhone2;
  }
  public void setWorkPhone2(String workPhone2) {
    this.workPhone2 = workPhone2;
  }

   /**
   * The work fax number area code of the user.
   * @return workFaxAreaCode1
  **/
  @javax.annotation.Nullable
  public String getWorkFaxAreaCode1() {
    return workFaxAreaCode1;
  }
  public void setWorkFaxAreaCode1(String workFaxAreaCode1) {
    this.workFaxAreaCode1 = workFaxAreaCode1;
  }

   /**
   * The work fax number of the user.
   * @return workFax1
  **/
  @javax.annotation.Nullable
  public String getWorkFax1() {
    return workFax1;
  }
  public void setWorkFax1(String workFax1) {
    this.workFax1 = workFax1;
  }

   /**
   * The work satellite phone number of the user.
   * @return workSatellitePhone
  **/
  @javax.annotation.Nullable
  public String getWorkSatellitePhone() {
    return workSatellitePhone;
  }
  public void setWorkSatellitePhone(String workSatellitePhone) {
    this.workSatellitePhone = workSatellitePhone;
  }

   /**
   * The work other phone number of the user.
   * @return workOtherPhone
  **/
  @javax.annotation.Nullable
  public String getWorkOtherPhone() {
    return workOtherPhone;
  }
  public void setWorkOtherPhone(String workOtherPhone) {
    this.workOtherPhone = workOtherPhone;
  }

   /**
   * The first work address line of the user.
   * @return workAddress1
  **/
  @javax.annotation.Nullable
  public String getWorkAddress1() {
    return workAddress1;
  }
  public void setWorkAddress1(String workAddress1) {
    this.workAddress1 = workAddress1;
  }

   /**
   * The second work address line of the user.
   * @return workAddress2
  **/
  @javax.annotation.Nullable
  public String getWorkAddress2() {
    return workAddress2;
  }
  public void setWorkAddress2(String workAddress2) {
    this.workAddress2 = workAddress2;
  }

   /**
   * The work address suburb of the user.
   * @return workSuburb
  **/
  @javax.annotation.Nullable
  public String getWorkSuburb() {
    return workSuburb;
  }
  public void setWorkSuburb(String workSuburb) {
    this.workSuburb = workSuburb;
  }

   /**
   * The work address state of the user.
   * @return workState
  **/
  @javax.annotation.Nullable
  public String getWorkState() {
    return workState;
  }
  public void setWorkState(String workState) {
    this.workState = workState;
  }

   /**
   * The work address post code of the user.
   * @return workPostCode
  **/
  @javax.annotation.Nullable
  public String getWorkPostCode() {
    return workPostCode;
  }
  public void setWorkPostCode(String workPostCode) {
    this.workPostCode = workPostCode;
  }

   /**
   * The first work postal address line of the user.
   * @return workPostalAddress1
  **/
  @javax.annotation.Nullable
  public String getWorkPostalAddress1() {
    return workPostalAddress1;
  }
  public void setWorkPostalAddress1(String workPostalAddress1) {
    this.workPostalAddress1 = workPostalAddress1;
  }

   /**
   * The second work postal address line of the user.
   * @return workPostalAddress2
  **/
  @javax.annotation.Nullable
  public String getWorkPostalAddress2() {
    return workPostalAddress2;
  }
  public void setWorkPostalAddress2(String workPostalAddress2) {
    this.workPostalAddress2 = workPostalAddress2;
  }

   /**
   * The work postal address suburb of the user.
   * @return workPostalSuburb
  **/
  @javax.annotation.Nullable
  public String getWorkPostalSuburb() {
    return workPostalSuburb;
  }
  public void setWorkPostalSuburb(String workPostalSuburb) {
    this.workPostalSuburb = workPostalSuburb;
  }

   /**
   * The work postal address state of the user.
   * @return workPostalState
  **/
  @javax.annotation.Nullable
  public String getWorkPostalState() {
    return workPostalState;
  }
  public void setWorkPostalState(String workPostalState) {
    this.workPostalState = workPostalState;
  }

   /**
   * The work postal address post code of the user.
   * @return workPostalPostCode
  **/
  @javax.annotation.Nullable
  public String getWorkPostalPostCode() {
    return workPostalPostCode;
  }
  public void setWorkPostalPostCode(String workPostalPostCode) {
    this.workPostalPostCode = workPostalPostCode;
  }

   /**
   * The primary personal email address of the user.
   * @return personalEmailAddress1
  **/
  @javax.annotation.Nullable
  public String getPersonalEmailAddress1() {
    return personalEmailAddress1;
  }
  public void setPersonalEmailAddress1(String personalEmailAddress1) {
    this.personalEmailAddress1 = personalEmailAddress1;
  }

   /**
   * The secondary personal email address of the user.
   * @return personalEmailAddress2
  **/
  @javax.annotation.Nullable
  public String getPersonalEmailAddress2() {
    return personalEmailAddress2;
  }
  public void setPersonalEmailAddress2(String personalEmailAddress2) {
    this.personalEmailAddress2 = personalEmailAddress2;
  }

   /**
   * The first personal address line of the user.
   * @return personalAddress1
  **/
  @javax.annotation.Nullable
  public String getPersonalAddress1() {
    return personalAddress1;
  }
  public void setPersonalAddress1(String personalAddress1) {
    this.personalAddress1 = personalAddress1;
  }

   /**
   * The second personal address line of the user.
   * @return personalAddress2
  **/
  @javax.annotation.Nullable
  public String getPersonalAddress2() {
    return personalAddress2;
  }
  public void setPersonalAddress2(String personalAddress2) {
    this.personalAddress2 = personalAddress2;
  }

   /**
   * The personal address suburb of the user.
   * @return personalSuburb
  **/
  @javax.annotation.Nullable
  public String getPersonalSuburb() {
    return personalSuburb;
  }
  public void setPersonalSuburb(String personalSuburb) {
    this.personalSuburb = personalSuburb;
  }

   /**
   * The personal address state of the user.
   * @return personalState
  **/
  @javax.annotation.Nullable
  public String getPersonalState() {
    return personalState;
  }
  public void setPersonalState(String personalState) {
    this.personalState = personalState;
  }

   /**
   * The personal address post code of the user.
   * @return personalPostCode
  **/
  @javax.annotation.Nullable
  public String getPersonalPostCode() {
    return personalPostCode;
  }
  public void setPersonalPostCode(String personalPostCode) {
    this.personalPostCode = personalPostCode;
  }

   /**
   * The personal address country of the user.
   * @return personalCountry
  **/
  @javax.annotation.Nullable
  public String getPersonalCountry() {
    return personalCountry;
  }
  public void setPersonalCountry(String personalCountry) {
    this.personalCountry = personalCountry;
  }

   /**
   * The primary personal phone number area code of the user.
   * @return personalPhoneAreaCode1
  **/
  @javax.annotation.Nullable
  public String getPersonalPhoneAreaCode1() {
    return personalPhoneAreaCode1;
  }
  public void setPersonalPhoneAreaCode1(String personalPhoneAreaCode1) {
    this.personalPhoneAreaCode1 = personalPhoneAreaCode1;
  }

   /**
   * The primary personal phone number of the user.
   * @return personalPhone1
  **/
  @javax.annotation.Nullable
  public String getPersonalPhone1() {
    return personalPhone1;
  }
  public void setPersonalPhone1(String personalPhone1) {
    this.personalPhone1 = personalPhone1;
  }

   /**
   * The secondary personal phone number area code of the user.
   * @return personalPhoneAreaCode2
  **/
  @javax.annotation.Nullable
  public String getPersonalPhoneAreaCode2() {
    return personalPhoneAreaCode2;
  }
  public void setPersonalPhoneAreaCode2(String personalPhoneAreaCode2) {
    this.personalPhoneAreaCode2 = personalPhoneAreaCode2;
  }

   /**
   * The secondary personal phone number of the user.
   * @return personalPhone2
  **/
  @javax.annotation.Nullable
  public String getPersonalPhone2() {
    return personalPhone2;
  }
  public void setPersonalPhone2(String personalPhone2) {
    this.personalPhone2 = personalPhone2;
  }

   /**
   * The personal fax number area code of the user.
   * @return personalFaxAreaCode1
  **/
  @javax.annotation.Nullable
  public String getPersonalFaxAreaCode1() {
    return personalFaxAreaCode1;
  }
  public void setPersonalFaxAreaCode1(String personalFaxAreaCode1) {
    this.personalFaxAreaCode1 = personalFaxAreaCode1;
  }

   /**
   * The personal fax number of the user.
   * @return personalFax1
  **/
  @javax.annotation.Nullable
  public String getPersonalFax1() {
    return personalFax1;
  }
  public void setPersonalFax1(String personalFax1) {
    this.personalFax1 = personalFax1;
  }

   /**
   * The other phone number area code of the user.
   * @return otherPhoneAreaCode1
  **/
  @javax.annotation.Nullable
  public String getOtherPhoneAreaCode1() {
    return otherPhoneAreaCode1;
  }
  public void setOtherPhoneAreaCode1(String otherPhoneAreaCode1) {
    this.otherPhoneAreaCode1 = otherPhoneAreaCode1;
  }

   /**
   * The other phone number of the user.
   * @return otherPhone1
  **/
  @javax.annotation.Nullable
  public String getOtherPhone1() {
    return otherPhone1;
  }
  public void setOtherPhone1(String otherPhone1) {
    this.otherPhone1 = otherPhone1;
  }

   /**
   * The other mobile number of the user.
   * @return otherMobile
  **/
  @javax.annotation.Nullable
  public String getOtherMobile() {
    return otherMobile;
  }
  public void setOtherMobile(String otherMobile) {
    this.otherMobile = otherMobile;
  }

   /**
   * The other first name of the user.
   * @return otherFirstName
  **/
  @javax.annotation.Nullable
  public String getOtherFirstName() {
    return otherFirstName;
  }
  public void setOtherFirstName(String otherFirstName) {
    this.otherFirstName = otherFirstName;
  }

   /**
   * The other last name of the user.
   * @return otherLastName
  **/
  @javax.annotation.Nullable
  public String getOtherLastName() {
    return otherLastName;
  }
  public void setOtherLastName(String otherLastName) {
    this.otherLastName = otherLastName;
  }

   /**
   * The other title to address the user with.
   * @return otherTitle
  **/
  @javax.annotation.Nullable
  public String getOtherTitle() {
    return otherTitle;
  }
  public void setOtherTitle(String otherTitle) {
    this.otherTitle = otherTitle;
  }

   /**
   * The company name of the user.
   * @return companyName
  **/
  @javax.annotation.Nullable
  public String getCompanyName() {
    return companyName;
  }
  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

   /**
   * The job title of the user.
   * @return jobTitle
  **/
  @javax.annotation.Nullable
  public String getJobTitle() {
    return jobTitle;
  }
  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }

   /**
   * The division in the company to which the user is associated.
   * @return division
  **/
  @javax.annotation.Nullable
  public String getDivision() {
    return division;
  }
  public void setDivision(String division) {
    this.division = division;
  }

   /**
   * The business unit in the company to which the user is associated.
   * @return businessUnit
  **/
  @javax.annotation.Nullable
  public String getBusinessUnit() {
    return businessUnit;
  }
  public void setBusinessUnit(String businessUnit) {
    this.businessUnit = businessUnit;
  }

   /**
   * The department in the company to which the user is associated.
   * @return department
  **/
  @javax.annotation.Nullable
  public String getDepartment() {
    return department;
  }
  public void setDepartment(String department) {
    this.department = department;
  }

   /**
   * The primary team name of the user.
   * @return teamName1
  **/
  @javax.annotation.Nullable
  public String getTeamName1() {
    return teamName1;
  }
  public void setTeamName1(String teamName1) {
    this.teamName1 = teamName1;
  }

   /**
   * The secondary team name of the user.
   * @return teamName2
  **/
  @javax.annotation.Nullable
  public String getTeamName2() {
    return teamName2;
  }
  public void setTeamName2(String teamName2) {
    this.teamName2 = teamName2;
  }

   /**
   * The primary role of the user.
   * @return role1
  **/
  @javax.annotation.Nullable
  public String getRole1() {
    return role1;
  }
  public void setRole1(String role1) {
    this.role1 = role1;
  }

   /**
   * The secondary role of the user.
   * @return role2
  **/
  @javax.annotation.Nullable
  public String getRole2() {
    return role2;
  }
  public void setRole2(String role2) {
    this.role2 = role2;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.id, user.id) &&
        Objects.equals(this.link, user.link) &&
        Objects.equals(this.userName, user.userName) &&
        Objects.equals(this.password, user.password) &&
        Objects.equals(this.firstName, user.firstName) &&
        Objects.equals(this.middleName, user.middleName) &&
        Objects.equals(this.lastName, user.lastName) &&
        Objects.equals(this.title, user.title) &&
        Objects.equals(this.nickname, user.nickname) &&
        Objects.equals(this.status, user.status) &&
        Objects.equals(this.workMobilePhone1, user.workMobilePhone1) &&
        Objects.equals(this.workEmailAddress1, user.workEmailAddress1) &&
        Objects.equals(this.workCountry, user.workCountry) &&
        Objects.equals(this.timezone, user.timezone) &&
        Objects.equals(this.workMobilePhone2, user.workMobilePhone2) &&
        Objects.equals(this.workEmailAddress2, user.workEmailAddress2) &&
        Objects.equals(this.workPhoneAreaCode1, user.workPhoneAreaCode1) &&
        Objects.equals(this.workPhone1, user.workPhone1) &&
        Objects.equals(this.workPhoneAreaCode2, user.workPhoneAreaCode2) &&
        Objects.equals(this.workPhone2, user.workPhone2) &&
        Objects.equals(this.workFaxAreaCode1, user.workFaxAreaCode1) &&
        Objects.equals(this.workFax1, user.workFax1) &&
        Objects.equals(this.workSatellitePhone, user.workSatellitePhone) &&
        Objects.equals(this.workOtherPhone, user.workOtherPhone) &&
        Objects.equals(this.workAddress1, user.workAddress1) &&
        Objects.equals(this.workAddress2, user.workAddress2) &&
        Objects.equals(this.workSuburb, user.workSuburb) &&
        Objects.equals(this.workState, user.workState) &&
        Objects.equals(this.workPostCode, user.workPostCode) &&
        Objects.equals(this.workPostalAddress1, user.workPostalAddress1) &&
        Objects.equals(this.workPostalAddress2, user.workPostalAddress2) &&
        Objects.equals(this.workPostalSuburb, user.workPostalSuburb) &&
        Objects.equals(this.workPostalState, user.workPostalState) &&
        Objects.equals(this.workPostalPostCode, user.workPostalPostCode) &&
        Objects.equals(this.personalEmailAddress1, user.personalEmailAddress1) &&
        Objects.equals(this.personalEmailAddress2, user.personalEmailAddress2) &&
        Objects.equals(this.personalAddress1, user.personalAddress1) &&
        Objects.equals(this.personalAddress2, user.personalAddress2) &&
        Objects.equals(this.personalSuburb, user.personalSuburb) &&
        Objects.equals(this.personalState, user.personalState) &&
        Objects.equals(this.personalPostCode, user.personalPostCode) &&
        Objects.equals(this.personalCountry, user.personalCountry) &&
        Objects.equals(this.personalPhoneAreaCode1, user.personalPhoneAreaCode1) &&
        Objects.equals(this.personalPhone1, user.personalPhone1) &&
        Objects.equals(this.personalPhoneAreaCode2, user.personalPhoneAreaCode2) &&
        Objects.equals(this.personalPhone2, user.personalPhone2) &&
        Objects.equals(this.personalFaxAreaCode1, user.personalFaxAreaCode1) &&
        Objects.equals(this.personalFax1, user.personalFax1) &&
        Objects.equals(this.otherPhoneAreaCode1, user.otherPhoneAreaCode1) &&
        Objects.equals(this.otherPhone1, user.otherPhone1) &&
        Objects.equals(this.otherMobile, user.otherMobile) &&
        Objects.equals(this.otherFirstName, user.otherFirstName) &&
        Objects.equals(this.otherLastName, user.otherLastName) &&
        Objects.equals(this.otherTitle, user.otherTitle) &&
        Objects.equals(this.companyName, user.companyName) &&
        Objects.equals(this.jobTitle, user.jobTitle) &&
        Objects.equals(this.division, user.division) &&
        Objects.equals(this.businessUnit, user.businessUnit) &&
        Objects.equals(this.department, user.department) &&
        Objects.equals(this.teamName1, user.teamName1) &&
        Objects.equals(this.teamName2, user.teamName2) &&
        Objects.equals(this.role1, user.role1) &&
        Objects.equals(this.role2, user.role2);
  }
  @Override
  public int hashCode() {
    return Objects.hash(id, link, userName, password, firstName, middleName, lastName, title, nickname, status, workMobilePhone1, workEmailAddress1, workCountry, timezone, workMobilePhone2, workEmailAddress2, workPhoneAreaCode1, workPhone1, workPhoneAreaCode2, workPhone2, workFaxAreaCode1, workFax1, workSatellitePhone, workOtherPhone, workAddress1, workAddress2, workSuburb, workState, workPostCode, workPostalAddress1, workPostalAddress2, workPostalSuburb, workPostalState, workPostalPostCode, personalEmailAddress1, personalEmailAddress2, personalAddress1, personalAddress2, personalSuburb, personalState, personalPostCode, personalCountry, personalPhoneAreaCode1, personalPhone1, personalPhoneAreaCode2, personalPhone2, personalFaxAreaCode1, personalFax1, otherPhoneAreaCode1, otherPhone1, otherMobile, otherFirstName, otherLastName, otherTitle, companyName, jobTitle, division, businessUnit, department, teamName1, teamName2, role1, role2);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    workMobilePhone1: ").append(toIndentedString(workMobilePhone1)).append("\n");
    sb.append("    workEmailAddress1: ").append(toIndentedString(workEmailAddress1)).append("\n");
    sb.append("    workCountry: ").append(toIndentedString(workCountry)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    workMobilePhone2: ").append(toIndentedString(workMobilePhone2)).append("\n");
    sb.append("    workEmailAddress2: ").append(toIndentedString(workEmailAddress2)).append("\n");
    sb.append("    workPhoneAreaCode1: ").append(toIndentedString(workPhoneAreaCode1)).append("\n");
    sb.append("    workPhone1: ").append(toIndentedString(workPhone1)).append("\n");
    sb.append("    workPhoneAreaCode2: ").append(toIndentedString(workPhoneAreaCode2)).append("\n");
    sb.append("    workPhone2: ").append(toIndentedString(workPhone2)).append("\n");
    sb.append("    workFaxAreaCode1: ").append(toIndentedString(workFaxAreaCode1)).append("\n");
    sb.append("    workFax1: ").append(toIndentedString(workFax1)).append("\n");
    sb.append("    workSatellitePhone: ").append(toIndentedString(workSatellitePhone)).append("\n");
    sb.append("    workOtherPhone: ").append(toIndentedString(workOtherPhone)).append("\n");
    sb.append("    workAddress1: ").append(toIndentedString(workAddress1)).append("\n");
    sb.append("    workAddress2: ").append(toIndentedString(workAddress2)).append("\n");
    sb.append("    workSuburb: ").append(toIndentedString(workSuburb)).append("\n");
    sb.append("    workState: ").append(toIndentedString(workState)).append("\n");
    sb.append("    workPostCode: ").append(toIndentedString(workPostCode)).append("\n");
    sb.append("    workPostalAddress1: ").append(toIndentedString(workPostalAddress1)).append("\n");
    sb.append("    workPostalAddress2: ").append(toIndentedString(workPostalAddress2)).append("\n");
    sb.append("    workPostalSuburb: ").append(toIndentedString(workPostalSuburb)).append("\n");
    sb.append("    workPostalState: ").append(toIndentedString(workPostalState)).append("\n");
    sb.append("    workPostalPostCode: ").append(toIndentedString(workPostalPostCode)).append("\n");
    sb.append("    personalEmailAddress1: ").append(toIndentedString(personalEmailAddress1)).append("\n");
    sb.append("    personalEmailAddress2: ").append(toIndentedString(personalEmailAddress2)).append("\n");
    sb.append("    personalAddress1: ").append(toIndentedString(personalAddress1)).append("\n");
    sb.append("    personalAddress2: ").append(toIndentedString(personalAddress2)).append("\n");
    sb.append("    personalSuburb: ").append(toIndentedString(personalSuburb)).append("\n");
    sb.append("    personalState: ").append(toIndentedString(personalState)).append("\n");
    sb.append("    personalPostCode: ").append(toIndentedString(personalPostCode)).append("\n");
    sb.append("    personalCountry: ").append(toIndentedString(personalCountry)).append("\n");
    sb.append("    personalPhoneAreaCode1: ").append(toIndentedString(personalPhoneAreaCode1)).append("\n");
    sb.append("    personalPhone1: ").append(toIndentedString(personalPhone1)).append("\n");
    sb.append("    personalPhoneAreaCode2: ").append(toIndentedString(personalPhoneAreaCode2)).append("\n");
    sb.append("    personalPhone2: ").append(toIndentedString(personalPhone2)).append("\n");
    sb.append("    personalFaxAreaCode1: ").append(toIndentedString(personalFaxAreaCode1)).append("\n");
    sb.append("    personalFax1: ").append(toIndentedString(personalFax1)).append("\n");
    sb.append("    otherPhoneAreaCode1: ").append(toIndentedString(otherPhoneAreaCode1)).append("\n");
    sb.append("    otherPhone1: ").append(toIndentedString(otherPhone1)).append("\n");
    sb.append("    otherMobile: ").append(toIndentedString(otherMobile)).append("\n");
    sb.append("    otherFirstName: ").append(toIndentedString(otherFirstName)).append("\n");
    sb.append("    otherLastName: ").append(toIndentedString(otherLastName)).append("\n");
    sb.append("    otherTitle: ").append(toIndentedString(otherTitle)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    businessUnit: ").append(toIndentedString(businessUnit)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    teamName1: ").append(toIndentedString(teamName1)).append("\n");
    sb.append("    teamName2: ").append(toIndentedString(teamName2)).append("\n");
    sb.append("    role1: ").append(toIndentedString(role1)).append("\n");
    sb.append("    role2: ").append(toIndentedString(role2)).append("\n");
    sb.append("}");
    return sb.toString();
  }
  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!User.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'User' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<User> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(User.class));

       return (TypeAdapter<T>) new TypeAdapter<User>() {
           @Override
           public void write(JsonWriter out, User value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public User read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of User given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of User
  * @throws IOException if the JSON string is invalid with respect to User
  */
  public static User fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, User.class);
  }

 /**
  * Convert an instance of User to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

