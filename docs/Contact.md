

# Contact

The contact object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | - PROJECT - for Contacts stored in a User-defined workspace - COMPANY - for Contacts stored in the default workspace |  [optional] [readonly] |
|**mri** | **String** | Specifies the Message Resource Identifier of the Contact in Whispir |  [optional] [readonly] |
|**devices** | **List&lt;Object&gt;** | Specifies the devices associated to this contact. See Contact Devices for more details about it |  [optional] [readonly] |
|**link** | [**List&lt;Link&gt;**](Link.md) | A [HATEOAS](https://en.wikipedia.org/wiki/HATEOAS) link array, describing all discoverable resources in relation to the original request. |  [optional] [readonly] |
|**lastModifiedTime** | **String** | Last Modified data and time |  [optional] [readonly] |
|**firstName** | **String** | The first name of the contact. |  |
|**lastName** | **String** | The last name of the contact. |  |
|**workMobilePhone1** | **String** | The primary work mobile number of the contact. |  |
|**workEmailAddress1** | **String** | The primary work email address of the contact. |  |
|**workCountry** | **String** | The work country of the contact. |  |
|**timezone** | **String** | The time zone in which the contact lives in. Values are relative to GMT.  Supported values are:  * Offset from GMT in the format &#x60;+/-NN&#x60;. For example, &#x60;+10&#x60;. * Worldwide time zone in the format &#x60;Country/City&#x60;. For example, &#x60;Australia/Melbourne&#x60;  See the list of [worldwide time zones](https://en.wikipedia.org/wiki/List_of_time_zones_by_country). |  |
|**title** | **String** | The title to address the contact with. |  [optional] |
|**workMobilePhone2** | **String** | The secondary work mobile number of the contact. |  [optional] |
|**workEmailAddress2** | **String** | The secondary work email address of the contact. |  [optional] |
|**workPhoneAreaCode1** | **String** | The primary work phone number area code of the contact. |  [optional] |
|**workPhone1** | **String** | The primary work phone number of the contact. |  [optional] |
|**workPhoneAreaCode2** | **String** | The secondary work phone number area code of the contact. |  [optional] |
|**workPhone2** | **String** | The secondary work phone number of the contact. |  [optional] |
|**workFaxAreaCode1** | **String** | The work fax number area code of the contact. |  [optional] |
|**workFax1** | **String** | The work fax number of the contact. |  [optional] |
|**workSatellitePhone** | **String** | The work satellite phone number of the contact. |  [optional] |
|**workOtherPhone** | **String** | The work other phone number of the contact. |  [optional] |
|**workAddress1** | **String** | The first work address line of the contact. |  [optional] |
|**workAddress2** | **String** | The second work address line of the contact. |  [optional] |
|**workSuburb** | **String** | The work address suburb of the contact. |  [optional] |
|**workState** | **String** | The work address state of the contact. |  [optional] |
|**workPostCode** | **String** | The work address post code of the contact. |  [optional] |
|**workPostalAddress1** | **String** | The first work postal address line of the contact. |  [optional] |
|**workPostalAddress2** | **String** | The second work postal address line of the contact. |  [optional] |
|**workPostalSuburb** | **String** | The work postal address suburb of the contact. |  [optional] |
|**workPostalState** | **String** | The work postal address state of the contact. |  [optional] |
|**workPostalPostCode** | **String** | The work postal address post code of the contact. |  [optional] |
|**personalEmailAddress1** | **String** | The primary personal email address of the contact. |  [optional] |
|**personalEmailAddress2** | **String** | The secondary personal email address of the contact. |  [optional] |
|**personalAddress1** | **String** | The first personal address line of the contact. |  [optional] |
|**personalAddress2** | **String** | The second personal address line of the contact. |  [optional] |
|**personalSuburb** | **String** | The personal address suburb of the contact. |  [optional] |
|**personalState** | **String** | The personal address state of the contact. |  [optional] |
|**personalPostCode** | **String** | The personal address post code of the contact. |  [optional] |
|**personalCountry** | **String** | The personal address country of the contact. |  [optional] |
|**personalPhoneAreaCode1** | **String** | The primary personal phone number area code of the contact. |  [optional] |
|**personalPhone1** | **String** | The primary personal phone number of the contact. |  [optional] |
|**personalPhoneAreaCode2** | **String** | The secondary personal phone number area code of the contact. |  [optional] |
|**personalPhone2** | **String** | The secondary personal phone number of the contact. |  [optional] |
|**personalFaxAreaCode1** | **String** | The personal fax number area code of the contact. |  [optional] |
|**personalFax1** | **String** | The personal fax number of the contact. |  [optional] |
|**otherPhoneAreaCode1** | **String** | The other phone number area code of the contact. |  [optional] |
|**otherPhone1** | **String** | The other phone number of the contact. |  [optional] |
|**otherMobile** | **String** | The other mobile number of the contact. |  [optional] |
|**otherFirstName** | **String** | The other first name of the contact. |  [optional] |
|**otherLastName** | **String** | The other last name of the contact. |  [optional] |
|**otherTitle** | **String** | The other title to address the contact with. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The validity status of the contact, either &#x60;A&#x60;ctive or &#x60;D&#x60;isabled. |  [optional] |
|**companyName** | **String** | The company name of the contact. |  [optional] |
|**jobTitle** | **String** | The job title of the contact. |  [optional] |
|**division** | **String** | The division in the company to which the contact is associated. |  [optional] |
|**businessUnit** | **String** | The business unit in the company to which the contact is associated. |  [optional] |
|**department** | **String** | The department in the company to which the contact is associated. |  [optional] |
|**teamName1** | **String** | The primary team name of the contact. |  [optional] |
|**teamName2** | **String** | The secondary team name of the contact. |  [optional] |
|**role1** | **String** | The primary role of the contact. |  [optional] |
|**role2** | **String** | The secondary role of the contact. |  [optional] |
|**locations** | [**List&lt;Location&gt;**](Location.md) | The locations for the contact. |  [optional] |
|**messagingoptions** | [**List&lt;MessagingOption&gt;**](MessagingOption.md) | The message channel options for the contact. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| PROJECT | &quot;PROJECT&quot; |
| COMPANY | &quot;COMPANY&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| A | &quot;A&quot; |
| D | &quot;D&quot; |



