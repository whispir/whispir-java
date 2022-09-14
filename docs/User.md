

# User

The user object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The ID of the user. |  [optional] [readonly] |
|**userName** | **String** | Specifies the username for the account |  |
|**password** | **String** | Specifies the password for the account &lt;p&gt;&lt;b&gt;Note:&lt;/b&gt;The following are the rules for the password:&lt;/p&gt;&lt;p&gt;&lt;ul&gt;&lt;li&gt;Alpha Numeric [a-zA-Z0-9_]&lt;/li&gt;&lt;li&gt;Must have at least one uppercase and one lowercase character&lt;/li&gt;&lt;/ul&gt;&lt;/p&gt; |  |
|**firstName** | **String** | The first name of the user. |  |
|**middleName** | **String** | The middle name of the user. |  [optional] |
|**lastName** | **String** | The last name of the user. |  |
|**title** | **String** | The title to address the user with. |  [optional] |
|**nickname** | **String** | Preferred name to be shown in the platfom interface |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Specifies the validity status of the user. The default status is PENDING. One cannot set the status while creation of account. Read &#x60;User State Machine&#x60; again mentioned above.&lt;/p&gt; |  [optional] |
|**workMobilePhone1** | **String** | The primary work mobile number of the user. |  [optional] |
|**workEmailAddress1** | **String** | The primary work email address of the user. |  [optional] |
|**workCountry** | **String** | The work country of the user. |  |
|**timezone** | **String** | The time zone in which the user lives in. Values are relative to GMT.  Supported values are:  * Offset from GMT in the format &#x60;+/-NN&#x60;. For example, &#x60;+10&#x60;. * Worldwide time zone in the format &#x60;Country/City&#x60;. For example, &#x60;Australia/Melbourne&#x60;  See the list of [worldwide time zones](https://en.wikipedia.org/wiki/List_of_time_zones_by_country). |  |
|**workMobilePhone2** | **String** | The secondary work mobile number of the user. |  [optional] |
|**workEmailAddress2** | **String** | The secondary work email address of the user. |  [optional] |
|**workPhoneAreaCode1** | **String** | The primary work phone number area code of the user. |  [optional] |
|**workPhone1** | **String** | The primary work phone number of the user. |  [optional] |
|**workPhoneAreaCode2** | **String** | The secondary work phone number area code of the user. |  [optional] |
|**workPhone2** | **String** | The secondary work phone number of the user. |  [optional] |
|**workFaxAreaCode1** | **String** | The work fax number area code of the user. |  [optional] |
|**workFax1** | **String** | The work fax number of the user. |  [optional] |
|**workSatellitePhone** | **String** | The work satellite phone number of the user. |  [optional] |
|**workOtherPhone** | **String** | The work other phone number of the user. |  [optional] |
|**workAddress1** | **String** | The first work address line of the user. |  [optional] |
|**workAddress2** | **String** | The second work address line of the user. |  [optional] |
|**workSuburb** | **String** | The work address suburb of the user. |  [optional] |
|**workState** | **String** | The work address state of the user. |  [optional] |
|**workPostCode** | **String** | The work address post code of the user. |  [optional] |
|**workPostalAddress1** | **String** | The first work postal address line of the user. |  [optional] |
|**workPostalAddress2** | **String** | The second work postal address line of the user. |  [optional] |
|**workPostalSuburb** | **String** | The work postal address suburb of the user. |  [optional] |
|**workPostalState** | **String** | The work postal address state of the user. |  [optional] |
|**workPostalPostCode** | **String** | The work postal address post code of the user. |  [optional] |
|**personalEmailAddress1** | **String** | The primary personal email address of the user. |  [optional] |
|**personalEmailAddress2** | **String** | The secondary personal email address of the user. |  [optional] |
|**personalAddress1** | **String** | The first personal address line of the user. |  [optional] |
|**personalAddress2** | **String** | The second personal address line of the user. |  [optional] |
|**personalSuburb** | **String** | The personal address suburb of the user. |  [optional] |
|**personalState** | **String** | The personal address state of the user. |  [optional] |
|**personalPostCode** | **String** | The personal address post code of the user. |  [optional] |
|**personalCountry** | **String** | The personal address country of the user. |  [optional] |
|**personalPhoneAreaCode1** | **String** | The primary personal phone number area code of the user. |  [optional] |
|**personalPhone1** | **String** | The primary personal phone number of the user. |  [optional] |
|**personalPhoneAreaCode2** | **String** | The secondary personal phone number area code of the user. |  [optional] |
|**personalPhone2** | **String** | The secondary personal phone number of the user. |  [optional] |
|**personalFaxAreaCode1** | **String** | The personal fax number area code of the user. |  [optional] |
|**personalFax1** | **String** | The personal fax number of the user. |  [optional] |
|**otherPhoneAreaCode1** | **String** | The other phone number area code of the user. |  [optional] |
|**otherPhone1** | **String** | The other phone number of the user. |  [optional] |
|**otherMobile** | **String** | The other mobile number of the user. |  [optional] |
|**otherFirstName** | **String** | The other first name of the user. |  [optional] |
|**otherLastName** | **String** | The other last name of the user. |  [optional] |
|**otherTitle** | **String** | The other title to address the user with. |  [optional] |
|**companyName** | **String** | The company name of the user. |  [optional] |
|**jobTitle** | **String** | The job title of the user. |  [optional] |
|**division** | **String** | The division in the company to which the user is associated. |  [optional] |
|**businessUnit** | **String** | The business unit in the company to which the user is associated. |  [optional] |
|**department** | **String** | The department in the company to which the user is associated. |  [optional] |
|**teamName1** | **String** | The primary team name of the user. |  [optional] |
|**teamName2** | **String** | The secondary team name of the user. |  [optional] |
|**role1** | **String** | The primary role of the user. |  [optional] |
|**role2** | **String** | The secondary role of the user. |  [optional] |
|**link** | [**List&lt;LinkInner&gt;**](LinkInner.md) | A [HATEOAS](https://en.wikipedia.org/wiki/HATEOAS) link object, describing all discoverable resources in relation to the original request. |  [optional] [readonly] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| A | &quot;A&quot; |
| INACTIVE | &quot;INACTIVE&quot; |
| I | &quot;I&quot; |
| PENDING | &quot;PENDING&quot; |
| P | &quot;P&quot; |
| SUSPENDED | &quot;SUSPENDED&quot; |
| B | &quot;B&quot; |
| DELETED | &quot;DELETED&quot; |
| D | &quot;D&quot; |



