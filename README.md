<div align="center">

[![Visit Gusto](./header.png)](https://gusto.com)

# [Gusto](https://gusto.com)

Welcome to Gusto's Embedded Payroll API documentation!

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Gusto&serviceName=App%20Integrations&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>gusto-app-integrations-java-sdk</artifactId>
  <version>2024-03-01</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:gusto-app-integrations-java-sdk:2024-03-01"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/gusto-app-integrations-java-sdk-2024-03-01.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoAppIntegrations;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompaniesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.gusto-demo.com";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    GustoAppIntegrations client = new GustoAppIntegrations(configuration);
    CompaniesCreateCompanyRequestUser user = new CompaniesCreateCompanyRequestUser();
    CompaniesCreateCompanyRequestCompany company = new CompaniesCreateCompanyRequestCompany();
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      CompaniesCreateCompanyResponse result = client
              .companies
              .createCompany(user, company)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccountClaimUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompaniesApi#createCompany");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CompaniesCreateCompanyResponse> response = client
              .companies
              .createCompany(user, company)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompaniesApi#createCompany");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.gusto-demo.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CompaniesApi* | [**createCompany**](docs/CompaniesApi.md#createCompany) | **POST** /v1/provision | Create a company
*CompaniesApi* | [**getCompanyInfo**](docs/CompaniesApi.md#getCompanyInfo) | **GET** /v1/companies/{company_id} | Get a company
*CompaniesApi* | [**getCustomFields**](docs/CompaniesApi.md#getCustomFields) | **GET** /v1/companies/{company_id}/custom_fields | Get the custom fields of a company
*CompanyBenefitsApi* | [**createCompanyBenefit**](docs/CompanyBenefitsApi.md#createCompanyBenefit) | **POST** /v1/companies/{company_id}/company_benefits | Create a company benefit
*CompanyBenefitsApi* | [**getAllSupportedBenefits**](docs/CompanyBenefitsApi.md#getAllSupportedBenefits) | **GET** /v1/benefits | Get all benefits supported by Gusto
*CompanyBenefitsApi* | [**getByCompanyId**](docs/CompanyBenefitsApi.md#getByCompanyId) | **GET** /v1/companies/{company_id}/company_benefits | Get benefits for a company
*CompanyBenefitsApi* | [**getById**](docs/CompanyBenefitsApi.md#getById) | **GET** /v1/company_benefits/{company_benefit_id} | Get a company benefit
*CompanyBenefitsApi* | [**getFieldsRequirementsById**](docs/CompanyBenefitsApi.md#getFieldsRequirementsById) | **GET** /v1/benefits/{benefit_id}/requirements | Get benefit fields requirements by ID
*CompanyBenefitsApi* | [**getSummaryById**](docs/CompanyBenefitsApi.md#getSummaryById) | **GET** /v1/company_benefits/{company_benefit_id}/summary | Get company benefit summary by company benefit id.
*CompanyBenefitsApi* | [**getSupportedBenefitById**](docs/CompanyBenefitsApi.md#getSupportedBenefitById) | **GET** /v1/benefits/{benefit_id} | Get a supported benefit by ID
*CompanyBenefitsApi* | [**removeBenefit**](docs/CompanyBenefitsApi.md#removeBenefit) | **DELETE** /v1/company_benefits/{company_benefit_id} | Delete a company benefit
*CompanyBenefitsApi* | [**updateBenefit**](docs/CompanyBenefitsApi.md#updateBenefit) | **PUT** /v1/company_benefits/{company_benefit_id} | Update a company benefit
*ContractorPaymentsApi* | [**getSingle**](docs/ContractorPaymentsApi.md#getSingle) | **GET** /v1/companies/{company_id}/contractor_payments/{contractor_payment_id} | Get a single contractor payment
*ContractorPaymentsApi* | [**listForCompany**](docs/ContractorPaymentsApi.md#listForCompany) | **GET** /v1/companies/{company_id}/contractor_payments | Get contractor payments for a company
*ContractorsApi* | [**createIndividualOrBusiness**](docs/ContractorsApi.md#createIndividualOrBusiness) | **POST** /v1/companies/{company_id}/contractors | Create a contractor
*ContractorsApi* | [**getAll**](docs/ContractorsApi.md#getAll) | **GET** /v1/companies/{company_id}/contractors | Get contractors of a company
*ContractorsApi* | [**getDetails**](docs/ContractorsApi.md#getDetails) | **GET** /v1/contractors/{contractor_id} | Get a contractor
*ContractorsApi* | [**updateContractor**](docs/ContractorsApi.md#updateContractor) | **PUT** /v1/contractors/{contractor_id} | Update a contractor
*DepartmentsApi* | [**addPeopleToDepartment**](docs/DepartmentsApi.md#addPeopleToDepartment) | **PUT** /v1/departments/{department_uuid}/add | Add people to a department
*DepartmentsApi* | [**createDepartment**](docs/DepartmentsApi.md#createDepartment) | **POST** /v1/companies/{company_uuid}/departments | Create a department
*DepartmentsApi* | [**deleteDepartment**](docs/DepartmentsApi.md#deleteDepartment) | **DELETE** /v1/departments/{department_uuid} | Delete a department
*DepartmentsApi* | [**getByUuid**](docs/DepartmentsApi.md#getByUuid) | **GET** /v1/departments/{department_uuid} | Get a department
*DepartmentsApi* | [**listForCompany**](docs/DepartmentsApi.md#listForCompany) | **GET** /v1/companies/{company_uuid}/departments | Get all departments of a company
*DepartmentsApi* | [**removeEmployees**](docs/DepartmentsApi.md#removeEmployees) | **PUT** /v1/departments/{department_uuid}/remove | Remove people from a department
*DepartmentsApi* | [**updateDepartment**](docs/DepartmentsApi.md#updateDepartment) | **PUT** /v1/departments/{department_uuid} | Update a department
*EarningTypesApi* | [**createCustomEarningType**](docs/EarningTypesApi.md#createCustomEarningType) | **POST** /v1/companies/{company_id}/earning_types | Create a custom earning type
*EarningTypesApi* | [**deactivate**](docs/EarningTypesApi.md#deactivate) | **DELETE** /v1/companies/{company_id}/earning_types/{earning_type_uuid} | Deactivate an earning type
*EarningTypesApi* | [**getAll**](docs/EarningTypesApi.md#getAll) | **GET** /v1/companies/{company_id}/earning_types | Get all earning types for a company
*EarningTypesApi* | [**updateTypeById**](docs/EarningTypesApi.md#updateTypeById) | **PUT** /v1/companies/{company_id}/earning_types/{earning_type_uuid} | Update an earning type
*EmployeeAddressesApi* | [**createHomeAddress**](docs/EmployeeAddressesApi.md#createHomeAddress) | **POST** /v1/employees/{employee_id}/home_addresses | Create an employee&#39;s home address
*EmployeeAddressesApi* | [**createWorkAddress**](docs/EmployeeAddressesApi.md#createWorkAddress) | **POST** /v1/employees/{employee_id}/work_addresses | Create an employee work address
*EmployeeAddressesApi* | [**deleteEmployeeHomeAddress**](docs/EmployeeAddressesApi.md#deleteEmployeeHomeAddress) | **DELETE** /v1/home_addresses/{home_address_uuid} | Delete an employee&#39;s home address
*EmployeeAddressesApi* | [**deleteEmployeeWorkAddress**](docs/EmployeeAddressesApi.md#deleteEmployeeWorkAddress) | **DELETE** /v1/work_addresses/{work_address_uuid} | Delete an employee&#39;s work address
*EmployeeAddressesApi* | [**get**](docs/EmployeeAddressesApi.md#get) | **GET** /v1/work_addresses/{work_address_uuid} | Get an employee work address
*EmployeeAddressesApi* | [**getHomeAddress**](docs/EmployeeAddressesApi.md#getHomeAddress) | **GET** /v1/home_addresses/{home_address_uuid} | Get an employee&#39;s home address
*EmployeeAddressesApi* | [**getHomeAddresses**](docs/EmployeeAddressesApi.md#getHomeAddresses) | **GET** /v1/employees/{employee_id}/home_addresses | Get an employee&#39;s home addresses
*EmployeeAddressesApi* | [**getWorkAddresses**](docs/EmployeeAddressesApi.md#getWorkAddresses) | **GET** /v1/employees/{employee_id}/work_addresses | Get an employee&#39;s work addresses
*EmployeeAddressesApi* | [**updateHomeAddress**](docs/EmployeeAddressesApi.md#updateHomeAddress) | **PUT** /v1/home_addresses/{home_address_uuid} | Update an employee&#39;s home address
*EmployeeAddressesApi* | [**updateWorkAddress**](docs/EmployeeAddressesApi.md#updateWorkAddress) | **PUT** /v1/work_addresses/{work_address_uuid} | Update an employee work address
*EmployeeBenefitsApi* | [**createBenefit**](docs/EmployeeBenefitsApi.md#createBenefit) | **POST** /v1/employees/{employee_id}/employee_benefits | Create an employee benefit
*EmployeeBenefitsApi* | [**createYtdBenefitAmountsFromDifferentCompany**](docs/EmployeeBenefitsApi.md#createYtdBenefitAmountsFromDifferentCompany) | **POST** /v1/employees/{employee_id}/ytd_benefit_amounts_from_different_company | Create year-to-date benefit amounts from a different company
*EmployeeBenefitsApi* | [**getAllForEmployee**](docs/EmployeeBenefitsApi.md#getAllForEmployee) | **GET** /v1/employees/{employee_id}/employee_benefits | Get all benefits for an employee
*EmployeeBenefitsApi* | [**getById**](docs/EmployeeBenefitsApi.md#getById) | **GET** /v1/employee_benefits/{employee_benefit_id} | Get an employee benefit
*EmployeeBenefitsApi* | [**removeBenefit**](docs/EmployeeBenefitsApi.md#removeBenefit) | **DELETE** /v1/employee_benefits/{employee_benefit_id} | Delete an employee benefit
*EmployeeBenefitsApi* | [**updateBenefit**](docs/EmployeeBenefitsApi.md#updateBenefit) | **PUT** /v1/employee_benefits/{employee_benefit_id} | Update an employee benefit
*EmployeeEmploymentsApi* | [**createRehire**](docs/EmployeeEmploymentsApi.md#createRehire) | **POST** /v1/employees/{employee_id}/rehire | Create an employee rehire
*EmployeeEmploymentsApi* | [**createTermination**](docs/EmployeeEmploymentsApi.md#createTermination) | **POST** /v1/employees/{employee_id}/terminations | Create an employee termination
*EmployeeEmploymentsApi* | [**deleteRehire**](docs/EmployeeEmploymentsApi.md#deleteRehire) | **DELETE** /v1/employees/{employee_id}/rehire | Delete an employee rehire
*EmployeeEmploymentsApi* | [**deleteTermination**](docs/EmployeeEmploymentsApi.md#deleteTermination) | **DELETE** /v1/employees/{employee_id}/terminations | Delete an employee termination
*EmployeeEmploymentsApi* | [**getHistory**](docs/EmployeeEmploymentsApi.md#getHistory) | **GET** /v1/employees/{employee_id}/employment_history | Get employment history for an employee
*EmployeeEmploymentsApi* | [**getRehireInfo**](docs/EmployeeEmploymentsApi.md#getRehireInfo) | **GET** /v1/employees/{employee_id}/rehire | Get an employee rehire
*EmployeeEmploymentsApi* | [**listTerminationsForEmployee**](docs/EmployeeEmploymentsApi.md#listTerminationsForEmployee) | **GET** /v1/employees/{employee_id}/terminations | Get terminations for an employee
*EmployeeEmploymentsApi* | [**updateRehire**](docs/EmployeeEmploymentsApi.md#updateRehire) | **PUT** /v1/employees/{employee_id}/rehire | Update an employee rehire
*EmployeeEmploymentsApi* | [**updateTermination**](docs/EmployeeEmploymentsApi.md#updateTermination) | **PUT** /v1/terminations/{employee_id} | Update an employee termination
*EmployeesApi* | [**createEmployee**](docs/EmployeesApi.md#createEmployee) | **POST** /v1/companies/{company_id}/employees | Create an employee
*EmployeesApi* | [**deleteOnboardingEmployee**](docs/EmployeesApi.md#deleteOnboardingEmployee) | **DELETE** /v1/employees/{employee_id} | Delete an onboarding employee
*EmployeesApi* | [**getCompanyEmployees**](docs/EmployeesApi.md#getCompanyEmployees) | **GET** /v1/companies/{company_id}/employees | Get employees of a company
*EmployeesApi* | [**getCustomFields**](docs/EmployeesApi.md#getCustomFields) | **GET** /v1/employees/{employee_id}/custom_fields | Get an employee&#39;s custom fields
*EmployeesApi* | [**getDetails**](docs/EmployeesApi.md#getDetails) | **GET** /v1/employees/{employee_id} | Get an employee
*EmployeesApi* | [**getTimeOffActivities**](docs/EmployeesApi.md#getTimeOffActivities) | **GET** /v1/employees/{employee_uuid}/time_off_activities | Get employee time off activities
*EmployeesApi* | [**updateEmployee**](docs/EmployeesApi.md#updateEmployee) | **PUT** /v1/employees/{employee_id} | Update an employee
*EventsApi* | [**getAll**](docs/EventsApi.md#getAll) | **GET** /v1/events | Get all events
*GarnishmentsApi* | [**createGarnishment**](docs/GarnishmentsApi.md#createGarnishment) | **POST** /v1/employees/{employee_id}/garnishments | Create a garnishment
*GarnishmentsApi* | [**get**](docs/GarnishmentsApi.md#get) | **GET** /v1/garnishments/{garnishment_id} | Get a garnishment
*GarnishmentsApi* | [**getEmployeeGarnishments**](docs/GarnishmentsApi.md#getEmployeeGarnishments) | **GET** /v1/employees/{employee_id}/garnishments | Get garnishments for an employee
*GarnishmentsApi* | [**update**](docs/GarnishmentsApi.md#update) | **PUT** /v1/garnishments/{garnishment_id} | Update a garnishment
*IntrospectionApi* | [**accessTokenInfo**](docs/IntrospectionApi.md#accessTokenInfo) | **GET** /v1/token_info | Get info about the current access token
*IntrospectionApi* | [**exchangeRefreshToken**](docs/IntrospectionApi.md#exchangeRefreshToken) | **POST** /oauth/token | Refresh access token
*JobsAndCompensationsApi* | [**createCompensation**](docs/JobsAndCompensationsApi.md#createCompensation) | **POST** /v1/jobs/{job_id}/compensations | Create a compensation
*JobsAndCompensationsApi* | [**createJob**](docs/JobsAndCompensationsApi.md#createJob) | **POST** /v1/employees/{employee_id}/jobs | Create a job
*JobsAndCompensationsApi* | [**deleteCompensation**](docs/JobsAndCompensationsApi.md#deleteCompensation) | **DELETE** /v1/compensations/{compensation_id} | Delete a compensation
*JobsAndCompensationsApi* | [**deleteSpecificJob**](docs/JobsAndCompensationsApi.md#deleteSpecificJob) | **DELETE** /v1/jobs/{job_id} | Delete an individual job
*JobsAndCompensationsApi* | [**getCompensationById**](docs/JobsAndCompensationsApi.md#getCompensationById) | **GET** /v1/compensations/{compensation_id} | Get a compensation
*JobsAndCompensationsApi* | [**getCompensationsByJobId**](docs/JobsAndCompensationsApi.md#getCompensationsByJobId) | **GET** /v1/jobs/{job_id}/compensations | Get compensations for a job
*JobsAndCompensationsApi* | [**getDetails**](docs/JobsAndCompensationsApi.md#getDetails) | **GET** /v1/jobs/{job_id} | Get a job
*JobsAndCompensationsApi* | [**getEmployeeJobs**](docs/JobsAndCompensationsApi.md#getEmployeeJobs) | **GET** /v1/employees/{employee_id}/jobs | Get jobs for an employee
*JobsAndCompensationsApi* | [**updateCompensation**](docs/JobsAndCompensationsApi.md#updateCompensation) | **PUT** /v1/compensations/{compensation_id} | Update a compensation
*JobsAndCompensationsApi* | [**updateJob**](docs/JobsAndCompensationsApi.md#updateJob) | **PUT** /v1/jobs/{job_id} | Update a job
*LocationsApi* | [**createCompanyLocation**](docs/LocationsApi.md#createCompanyLocation) | **POST** /v1/companies/{company_id}/locations | Create a company location
*LocationsApi* | [**getDetails**](docs/LocationsApi.md#getDetails) | **GET** /v1/locations/{location_id} | Get a location
*LocationsApi* | [**getMinimumWages**](docs/LocationsApi.md#getMinimumWages) | **GET** /v1/locations/{location_uuid}/minimum_wages | Get minimum wages for a location
*LocationsApi* | [**listCompanyLocations**](docs/LocationsApi.md#listCompanyLocations) | **GET** /v1/companies/{company_id}/locations | Get company locations
*LocationsApi* | [**updateLocation**](docs/LocationsApi.md#updateLocation) | **PUT** /v1/locations/{location_id} | Update a location
*PaySchedulesApi* | [**getAssignments**](docs/PaySchedulesApi.md#getAssignments) | **GET** /v1/companies/{company_id}/pay_schedules/assignments | Get pay schedule assignments for a company
*PaySchedulesApi* | [**getDetails**](docs/PaySchedulesApi.md#getDetails) | **GET** /v1/companies/{company_id}/pay_schedules/{pay_schedule_id} | Get a pay schedule
*PaySchedulesApi* | [**list**](docs/PaySchedulesApi.md#list) | **GET** /v1/companies/{company_id}/pay_schedules | Get the pay schedules for a company
*PaySchedulesApi* | [**listUnprocessedTerminationPayPeriods**](docs/PaySchedulesApi.md#listUnprocessedTerminationPayPeriods) | **GET** /v1/companies/{company_id}/pay_periods/unprocessed_termination_pay_periods | Get termination pay periods for a company
*PaySchedulesApi* | [**list_0**](docs/PaySchedulesApi.md#list_0) | **GET** /v1/companies/{company_id}/pay_periods | Get pay periods for a company
*PayrollsApi* | [**getAllForCompany**](docs/PayrollsApi.md#getAllForCompany) | **GET** /v1/companies/{company_id}/payrolls | Get all payrolls for a company
*PayrollsApi* | [**getSinglePayroll**](docs/PayrollsApi.md#getSinglePayroll) | **GET** /v1/companies/{company_id}/payrolls/{payroll_id} | Get a single payroll
*PayrollsApi* | [**prepareForUpdate**](docs/PayrollsApi.md#prepareForUpdate) | **PUT** /v1/companies/{company_id}/payrolls/{payroll_id}/prepare | Prepare a payroll for update
*PayrollsApi* | [**updateById**](docs/PayrollsApi.md#updateById) | **PUT** /v1/companies/{company_id}/payrolls/{payroll_id} | Update a payroll by ID
*TimeOffPoliciesApi* | [**calculateAccruingTimeOffHours**](docs/TimeOffPoliciesApi.md#calculateAccruingTimeOffHours) | **POST** /v1/payrolls/{payroll_id}/employees/{employee_id}/calculate_accruing_time_off_hours | Calculate accruing time off hours
*WebhooksApi* | [**createSubscription**](docs/WebhooksApi.md#createSubscription) | **POST** /v1/webhook_subscriptions | Create a webhook subscription
*WebhooksApi* | [**deleteSubscriptionByUuid**](docs/WebhooksApi.md#deleteSubscriptionByUuid) | **DELETE** /v1/webhook_subscriptions/{webhook_subscription_uuid} | Delete a webhook subscription
*WebhooksApi* | [**getSubscriptionByUuid**](docs/WebhooksApi.md#getSubscriptionByUuid) | **GET** /v1/webhook_subscriptions/{webhook_subscription_uuid} | Get a webhook subscription
*WebhooksApi* | [**listSubscriptions**](docs/WebhooksApi.md#listSubscriptions) | **GET** /v1/webhook_subscriptions | List webhook subscriptions
*WebhooksApi* | [**requestVerificationToken**](docs/WebhooksApi.md#requestVerificationToken) | **GET** /v1/webhook_subscriptions/{webhook_subscription_uuid}/request_verification_token | Request the webhook subscription verification_token
*WebhooksApi* | [**updateSubscriptionByUuid**](docs/WebhooksApi.md#updateSubscriptionByUuid) | **PUT** /v1/webhook_subscriptions/{webhook_subscription_uuid} | Update a webhook subscription
*WebhooksApi* | [**verifySubscriptionToken**](docs/WebhooksApi.md#verifySubscriptionToken) | **PUT** /v1/webhook_subscriptions/{webhook_subscription_uuid}/verify | Verify the webhook subscription


## Documentation for Models

 - [AccruingTimeOffHour](docs/AccruingTimeOffHour.md)
 - [AchTransaction](docs/AchTransaction.md)
 - [Address](docs/Address.md)
 - [AddressAllOf](docs/AddressAllOf.md)
 - [Admin](docs/Admin.md)
 - [Authentication](docs/Authentication.md)
 - [BenefitSummary](docs/BenefitSummary.md)
 - [BenefitSummaryEmployees](docs/BenefitSummaryEmployees.md)
 - [BenefitSummaryEmployeesPayrollBenefits](docs/BenefitSummaryEmployeesPayrollBenefits.md)
 - [BenefitSummaryEmployeesPayrollBenefitsPayPeriod](docs/BenefitSummaryEmployeesPayrollBenefitsPayPeriod.md)
 - [BenefitTypeRequirements](docs/BenefitTypeRequirements.md)
 - [BenefitTypeRequirementsEmployeeDeduction](docs/BenefitTypeRequirementsEmployeeDeduction.md)
 - [BenefitTypeRequirementsEmployeeDeductionDefaultValue](docs/BenefitTypeRequirementsEmployeeDeductionDefaultValue.md)
 - [CompaniesCreateCompanyRequest](docs/CompaniesCreateCompanyRequest.md)
 - [CompaniesCreateCompanyRequestCompany](docs/CompaniesCreateCompanyRequestCompany.md)
 - [CompaniesCreateCompanyRequestCompanyAddressesInner](docs/CompaniesCreateCompanyRequestCompanyAddressesInner.md)
 - [CompaniesCreateCompanyRequestUser](docs/CompaniesCreateCompanyRequestUser.md)
 - [CompaniesCreateCompanyResponse](docs/CompaniesCreateCompanyResponse.md)
 - [CompaniesGetCustomFieldsResponse](docs/CompaniesGetCustomFieldsResponse.md)
 - [Company](docs/Company.md)
 - [CompanyAddress](docs/CompanyAddress.md)
 - [CompanyBankAccount](docs/CompanyBankAccount.md)
 - [CompanyBenefit](docs/CompanyBenefit.md)
 - [CompanyBenefitWithEmployeeBenefits](docs/CompanyBenefitWithEmployeeBenefits.md)
 - [CompanyBenefitWithEmployeeBenefitsEmployeeBenefitsInner](docs/CompanyBenefitWithEmployeeBenefitsEmployeeBenefitsInner.md)
 - [CompanyBenefitWithEmployeeBenefitsEmployeeBenefitsInnerContribution](docs/CompanyBenefitWithEmployeeBenefitsEmployeeBenefitsInnerContribution.md)
 - [CompanyBenefitsCreateCompanyBenefitRequest](docs/CompanyBenefitsCreateCompanyBenefitRequest.md)
 - [CompanyBenefitsUpdateBenefitRequest](docs/CompanyBenefitsUpdateBenefitRequest.md)
 - [CompanyCompensations](docs/CompanyCompensations.md)
 - [CompanyCompensationsFixedInner](docs/CompanyCompensationsFixedInner.md)
 - [CompanyCompensationsHourlyInner](docs/CompanyCompensationsHourlyInner.md)
 - [CompanyCompensationsPaidTimeOffInner](docs/CompanyCompensationsPaidTimeOffInner.md)
 - [CompanyCustomField](docs/CompanyCustomField.md)
 - [CompanyOnboardingStatus](docs/CompanyOnboardingStatus.md)
 - [CompanyPrimaryPayrollAdmin](docs/CompanyPrimaryPayrollAdmin.md)
 - [CompanyPrimarySignatory](docs/CompanyPrimarySignatory.md)
 - [CompanyPrimarySignatoryHomeAddress](docs/CompanyPrimarySignatoryHomeAddress.md)
 - [Compensation](docs/Compensation.md)
 - [Contractor](docs/Contractor.md)
 - [ContractorAddress](docs/ContractorAddress.md)
 - [ContractorAddressAllOf](docs/ContractorAddressAllOf.md)
 - [ContractorBankAccount](docs/ContractorBankAccount.md)
 - [ContractorBody](docs/ContractorBody.md)
 - [ContractorOnboardingStatus](docs/ContractorOnboardingStatus.md)
 - [ContractorPayment](docs/ContractorPayment.md)
 - [ContractorPaymentMethod](docs/ContractorPaymentMethod.md)
 - [ContractorPaymentReceipt](docs/ContractorPaymentReceipt.md)
 - [ContractorPaymentReceiptContractorPaymentsInner](docs/ContractorPaymentReceiptContractorPaymentsInner.md)
 - [ContractorPaymentReceiptLicensee](docs/ContractorPaymentReceiptLicensee.md)
 - [ContractorPaymentReceiptTotals](docs/ContractorPaymentReceiptTotals.md)
 - [ContractorPaymentSummary](docs/ContractorPaymentSummary.md)
 - [ContractorPaymentSummaryByDates](docs/ContractorPaymentSummaryByDates.md)
 - [ContractorPaymentSummaryByDatesContractorPaymentsInner](docs/ContractorPaymentSummaryByDatesContractorPaymentsInner.md)
 - [ContractorPaymentSummaryByDatesTotal](docs/ContractorPaymentSummaryByDatesTotal.md)
 - [ContractorPaymentSummaryContractorPaymentsInner](docs/ContractorPaymentSummaryContractorPaymentsInner.md)
 - [ContractorPaymentSummaryTotal](docs/ContractorPaymentSummaryTotal.md)
 - [ContractorsCreateIndividualOrBusinessRequest](docs/ContractorsCreateIndividualOrBusinessRequest.md)
 - [ContractorsUpdateContractorRequest](docs/ContractorsUpdateContractorRequest.md)
 - [CustomFieldType](docs/CustomFieldType.md)
 - [Department](docs/Department.md)
 - [DepartmentAllOf](docs/DepartmentAllOf.md)
 - [DepartmentsAddPeopleToDepartmentRequest](docs/DepartmentsAddPeopleToDepartmentRequest.md)
 - [DepartmentsAddPeopleToDepartmentRequestEmployeesInner](docs/DepartmentsAddPeopleToDepartmentRequestEmployeesInner.md)
 - [DepartmentsCreateDepartmentRequest](docs/DepartmentsCreateDepartmentRequest.md)
 - [DepartmentsRemoveEmployeesRequest](docs/DepartmentsRemoveEmployeesRequest.md)
 - [DepartmentsUpdateDepartmentRequest](docs/DepartmentsUpdateDepartmentRequest.md)
 - [EarningType](docs/EarningType.md)
 - [EarningTypesCreateCustomEarningTypeRequest](docs/EarningTypesCreateCustomEarningTypeRequest.md)
 - [EarningTypesGetAllResponse](docs/EarningTypesGetAllResponse.md)
 - [EarningTypesUpdateTypeByIdRequest](docs/EarningTypesUpdateTypeByIdRequest.md)
 - [Employee](docs/Employee.md)
 - [EmployeeAddress](docs/EmployeeAddress.md)
 - [EmployeeAddressAllOf](docs/EmployeeAddressAllOf.md)
 - [EmployeeAddressesCreateHomeAddressRequest](docs/EmployeeAddressesCreateHomeAddressRequest.md)
 - [EmployeeAddressesCreateWorkAddressRequest](docs/EmployeeAddressesCreateWorkAddressRequest.md)
 - [EmployeeAddressesUpdateHomeAddressRequest](docs/EmployeeAddressesUpdateHomeAddressRequest.md)
 - [EmployeeAddressesUpdateWorkAddressRequest](docs/EmployeeAddressesUpdateWorkAddressRequest.md)
 - [EmployeeBankAccount](docs/EmployeeBankAccount.md)
 - [EmployeeBenefit](docs/EmployeeBenefit.md)
 - [EmployeeBenefitContribution](docs/EmployeeBenefitContribution.md)
 - [EmployeeBenefitsCreateBenefitRequest](docs/EmployeeBenefitsCreateBenefitRequest.md)
 - [EmployeeBenefitsCreateBenefitRequestContribution](docs/EmployeeBenefitsCreateBenefitRequestContribution.md)
 - [EmployeeBenefitsCreateYtdBenefitAmountsFromDifferentCompanyRequest](docs/EmployeeBenefitsCreateYtdBenefitAmountsFromDifferentCompanyRequest.md)
 - [EmployeeBenefitsUpdateBenefitRequest](docs/EmployeeBenefitsUpdateBenefitRequest.md)
 - [EmployeeBenefitsUpdateBenefitRequestContribution](docs/EmployeeBenefitsUpdateBenefitRequestContribution.md)
 - [EmployeeCustomField](docs/EmployeeCustomField.md)
 - [EmployeeEmploymentsCreateTerminationRequest](docs/EmployeeEmploymentsCreateTerminationRequest.md)
 - [EmployeeEmploymentsGetHistoryResponseInner](docs/EmployeeEmploymentsGetHistoryResponseInner.md)
 - [EmployeeEmploymentsUpdateRehireRequest](docs/EmployeeEmploymentsUpdateRehireRequest.md)
 - [EmployeeEmploymentsUpdateTerminationRequest](docs/EmployeeEmploymentsUpdateTerminationRequest.md)
 - [EmployeeEmploymentsUpdateTerminationRequestAllOf](docs/EmployeeEmploymentsUpdateTerminationRequestAllOf.md)
 - [EmployeeFederalTax](docs/EmployeeFederalTax.md)
 - [EmployeeOnboardingStatus](docs/EmployeeOnboardingStatus.md)
 - [EmployeePayStub](docs/EmployeePayStub.md)
 - [EmployeePaymentMethod](docs/EmployeePaymentMethod.md)
 - [EmployeeStateTax](docs/EmployeeStateTax.md)
 - [EmployeeStateTaxAnswer](docs/EmployeeStateTaxAnswer.md)
 - [EmployeeStateTaxInputQuestionFormat](docs/EmployeeStateTaxInputQuestionFormat.md)
 - [EmployeeStateTaxInputQuestionFormatOptionsInner](docs/EmployeeStateTaxInputQuestionFormatOptionsInner.md)
 - [EmployeeStateTaxQuestion](docs/EmployeeStateTaxQuestion.md)
 - [EmployeeWorkAddress](docs/EmployeeWorkAddress.md)
 - [EmployeesCreateEmployeeRequest](docs/EmployeesCreateEmployeeRequest.md)
 - [EmployeesGetCustomFieldsResponse](docs/EmployeesGetCustomFieldsResponse.md)
 - [EmployeesUpdateEmployeeRequest](docs/EmployeesUpdateEmployeeRequest.md)
 - [Event](docs/Event.md)
 - [ExternalPayroll](docs/ExternalPayroll.md)
 - [ExternalPayrollApplicableBenefitsInner](docs/ExternalPayrollApplicableBenefitsInner.md)
 - [ExternalPayrollApplicableEarningsInner](docs/ExternalPayrollApplicableEarningsInner.md)
 - [ExternalPayrollApplicableTaxesInner](docs/ExternalPayrollApplicableTaxesInner.md)
 - [ExternalPayrollBasic](docs/ExternalPayrollBasic.md)
 - [ExternalPayrollExternalPayrollItemsInner](docs/ExternalPayrollExternalPayrollItemsInner.md)
 - [ExternalPayrollExternalPayrollItemsInnerBenefitsInner](docs/ExternalPayrollExternalPayrollItemsInnerBenefitsInner.md)
 - [ExternalPayrollExternalPayrollItemsInnerEarningsInner](docs/ExternalPayrollExternalPayrollItemsInnerEarningsInner.md)
 - [ExternalPayrollExternalPayrollItemsInnerTaxesInner](docs/ExternalPayrollExternalPayrollItemsInnerTaxesInner.md)
 - [ExternalPayrollMetadata](docs/ExternalPayrollMetadata.md)
 - [ExternalPayrollTaxSuggestions](docs/ExternalPayrollTaxSuggestions.md)
 - [ExternalPayrollTaxSuggestionsTaxSuggestions](docs/ExternalPayrollTaxSuggestionsTaxSuggestions.md)
 - [FederalTaxDetails](docs/FederalTaxDetails.md)
 - [Flow](docs/Flow.md)
 - [FlsaStatusType](docs/FlsaStatusType.md)
 - [Form](docs/Form.md)
 - [Form1099](docs/Form1099.md)
 - [FormPdf](docs/FormPdf.md)
 - [Garnishment](docs/Garnishment.md)
 - [GarnishmentsCreateGarnishmentRequest](docs/GarnishmentsCreateGarnishmentRequest.md)
 - [GarnishmentsUpdateRequest](docs/GarnishmentsUpdateRequest.md)
 - [GeneratedDocument](docs/GeneratedDocument.md)
 - [GrossUpPay](docs/GrossUpPay.md)
 - [HolidayPayPolicy](docs/HolidayPayPolicy.md)
 - [HolidayPayPolicyFederalHolidaysInner](docs/HolidayPayPolicyFederalHolidaysInner.md)
 - [HolidayPayPolicyFederalHolidaysInnerNewYearsDay](docs/HolidayPayPolicyFederalHolidaysInnerNewYearsDay.md)
 - [Industry](docs/Industry.md)
 - [IntrospectionAccessTokenInfoResponse](docs/IntrospectionAccessTokenInfoResponse.md)
 - [IntrospectionAccessTokenInfoResponseResource](docs/IntrospectionAccessTokenInfoResponseResource.md)
 - [IntrospectionExchangeRefreshTokenRequest](docs/IntrospectionExchangeRefreshTokenRequest.md)
 - [InvoiceData](docs/InvoiceData.md)
 - [InvoiceDataActiveCompaniesInner](docs/InvoiceDataActiveCompaniesInner.md)
 - [Job](docs/Job.md)
 - [JobsAndCompensationsCreateCompensationRequest](docs/JobsAndCompensationsCreateCompensationRequest.md)
 - [JobsAndCompensationsCreateCompensationRequestMinimumWagesInner](docs/JobsAndCompensationsCreateCompensationRequestMinimumWagesInner.md)
 - [JobsAndCompensationsCreateJobRequest](docs/JobsAndCompensationsCreateJobRequest.md)
 - [JobsAndCompensationsUpdateCompensationRequest](docs/JobsAndCompensationsUpdateCompensationRequest.md)
 - [JobsAndCompensationsUpdateJobRequest](docs/JobsAndCompensationsUpdateJobRequest.md)
 - [Location](docs/Location.md)
 - [LocationsCreateCompanyLocationRequest](docs/LocationsCreateCompanyLocationRequest.md)
 - [LocationsCreateCompanyLocationRequest1](docs/LocationsCreateCompanyLocationRequest1.md)
 - [LocationsUpdateLocationRequest](docs/LocationsUpdateLocationRequest.md)
 - [LocationsUpdateLocationRequestAllOf](docs/LocationsUpdateLocationRequestAllOf.md)
 - [MinimumWage](docs/MinimumWage.md)
 - [Notification](docs/Notification.md)
 - [NotificationResourcesInner](docs/NotificationResourcesInner.md)
 - [OffCycleReasonType](docs/OffCycleReasonType.md)
 - [OnboardingStep](docs/OnboardingStep.md)
 - [OnboardingStep1](docs/OnboardingStep1.md)
 - [OnboardingStep2](docs/OnboardingStep2.md)
 - [PaidHolidays](docs/PaidHolidays.md)
 - [PaidHolidaysSchema](docs/PaidHolidaysSchema.md)
 - [PaidTimeOff](docs/PaidTimeOff.md)
 - [PayPeriod](docs/PayPeriod.md)
 - [PayPeriodPayroll](docs/PayPeriodPayroll.md)
 - [PaySchedule](docs/PaySchedule.md)
 - [PayScheduleAssignment](docs/PayScheduleAssignment.md)
 - [PayScheduleAssignmentBody](docs/PayScheduleAssignmentBody.md)
 - [PayScheduleAssignmentBodyDepartmentsInner](docs/PayScheduleAssignmentBodyDepartmentsInner.md)
 - [PayScheduleAssignmentBodyEmployeesInner](docs/PayScheduleAssignmentBodyEmployeesInner.md)
 - [PayScheduleAssignmentDepartment](docs/PayScheduleAssignmentDepartment.md)
 - [PayScheduleAssignmentEmployee](docs/PayScheduleAssignmentEmployee.md)
 - [PayScheduleAssignmentEmployeeChange](docs/PayScheduleAssignmentEmployeeChange.md)
 - [PayScheduleAssignmentPayPeriod](docs/PayScheduleAssignmentPayPeriod.md)
 - [PayScheduleAssignmentPreview](docs/PayScheduleAssignmentPreview.md)
 - [PayScheduleAssignmentTransitionPayPeriod](docs/PayScheduleAssignmentTransitionPayPeriod.md)
 - [PaymentConfigs](docs/PaymentConfigs.md)
 - [PaymentMethodBankAccount](docs/PaymentMethodBankAccount.md)
 - [Payroll](docs/Payroll.md)
 - [PayrollBlocker](docs/PayrollBlocker.md)
 - [PayrollBlockersError](docs/PayrollBlockersError.md)
 - [PayrollBlockersErrorErrorsInner](docs/PayrollBlockersErrorErrorsInner.md)
 - [PayrollBlockersErrorErrorsInnerMetadata](docs/PayrollBlockersErrorErrorsInnerMetadata.md)
 - [PayrollCheck](docs/PayrollCheck.md)
 - [PayrollCompanyTaxesTypeInner](docs/PayrollCompanyTaxesTypeInner.md)
 - [PayrollEmployeeCompensationsTypeInner](docs/PayrollEmployeeCompensationsTypeInner.md)
 - [PayrollEmployeeCompensationsTypeInnerBenefitsInner](docs/PayrollEmployeeCompensationsTypeInnerBenefitsInner.md)
 - [PayrollEmployeeCompensationsTypeInnerDeductionsInner](docs/PayrollEmployeeCompensationsTypeInnerDeductionsInner.md)
 - [PayrollEmployeeCompensationsTypeInnerFixedCompensationsInner](docs/PayrollEmployeeCompensationsTypeInnerFixedCompensationsInner.md)
 - [PayrollEmployeeCompensationsTypeInnerHourlyCompensationsInner](docs/PayrollEmployeeCompensationsTypeInnerHourlyCompensationsInner.md)
 - [PayrollEmployeeCompensationsTypeInnerPaidTimeOffInner](docs/PayrollEmployeeCompensationsTypeInnerPaidTimeOffInner.md)
 - [PayrollEmployeeCompensationsTypeInnerTaxesInner](docs/PayrollEmployeeCompensationsTypeInnerTaxesInner.md)
 - [PayrollFixedCompensationTypesTypeInner](docs/PayrollFixedCompensationTypesTypeInner.md)
 - [PayrollMinimal](docs/PayrollMinimal.md)
 - [PayrollPayPeriodType](docs/PayrollPayPeriodType.md)
 - [PayrollPaymentSpeedChangedType](docs/PayrollPaymentSpeedChangedType.md)
 - [PayrollPayrollStatusMetaType](docs/PayrollPayrollStatusMetaType.md)
 - [PayrollPrepared](docs/PayrollPrepared.md)
 - [PayrollReceipt](docs/PayrollReceipt.md)
 - [PayrollReceiptEmployeeCompensationsInner](docs/PayrollReceiptEmployeeCompensationsInner.md)
 - [PayrollReceiptLicensee](docs/PayrollReceiptLicensee.md)
 - [PayrollReceiptTaxesInner](docs/PayrollReceiptTaxesInner.md)
 - [PayrollReceiptTotals](docs/PayrollReceiptTotals.md)
 - [PayrollReversal](docs/PayrollReversal.md)
 - [PayrollTotalsType](docs/PayrollTotalsType.md)
 - [PayrollWithholdingPayPeriodType](docs/PayrollWithholdingPayPeriodType.md)
 - [PayrollsUpdateByIdRequest](docs/PayrollsUpdateByIdRequest.md)
 - [PayrollsUpdateByIdRequestEmployeeCompensationsInner](docs/PayrollsUpdateByIdRequestEmployeeCompensationsInner.md)
 - [PayrollsUpdateByIdRequestEmployeeCompensationsInnerFixedCompensationsInner](docs/PayrollsUpdateByIdRequestEmployeeCompensationsInnerFixedCompensationsInner.md)
 - [PayrollsUpdateByIdRequestEmployeeCompensationsInnerHourlyCompensationsInner](docs/PayrollsUpdateByIdRequestEmployeeCompensationsInnerHourlyCompensationsInner.md)
 - [PayrollsUpdateByIdRequestEmployeeCompensationsInnerPaidTimeOffInner](docs/PayrollsUpdateByIdRequestEmployeeCompensationsInnerPaidTimeOffInner.md)
 - [RecoveryCase](docs/RecoveryCase.md)
 - [Rehire](docs/Rehire.md)
 - [RehireBody](docs/RehireBody.md)
 - [Signatory](docs/Signatory.md)
 - [SignatoryHomeAddress](docs/SignatoryHomeAddress.md)
 - [SupportedBenefit](docs/SupportedBenefit.md)
 - [TaxLiabilitiesSelections](docs/TaxLiabilitiesSelections.md)
 - [TaxLiabilitiesSelectionsPossibleLiabilities](docs/TaxLiabilitiesSelectionsPossibleLiabilities.md)
 - [TaxRequirement](docs/TaxRequirement.md)
 - [TaxRequirementApplicableIfInner](docs/TaxRequirementApplicableIfInner.md)
 - [TaxRequirementMetadata](docs/TaxRequirementMetadata.md)
 - [TaxRequirementMetadataOptionsInner](docs/TaxRequirementMetadataOptionsInner.md)
 - [TaxRequirementMetadataValidation](docs/TaxRequirementMetadataValidation.md)
 - [TaxRequirementSet](docs/TaxRequirementSet.md)
 - [TaxRequirementsState](docs/TaxRequirementsState.md)
 - [Termination](docs/Termination.md)
 - [TimeOffActivity](docs/TimeOffActivity.md)
 - [TimeOffPoliciesCalculateAccruingTimeOffHoursRequest](docs/TimeOffPoliciesCalculateAccruingTimeOffHoursRequest.md)
 - [TimeOffPolicy](docs/TimeOffPolicy.md)
 - [TimeOffPolicyEmployeesInner](docs/TimeOffPolicyEmployeesInner.md)
 - [TimeOffRequest](docs/TimeOffRequest.md)
 - [TimeOffRequestApprover](docs/TimeOffRequestApprover.md)
 - [TimeOffRequestEmployee](docs/TimeOffRequestEmployee.md)
 - [TimeOffRequestInitiator](docs/TimeOffRequestInitiator.md)
 - [UnprocessedTerminationPayPeriod](docs/UnprocessedTerminationPayPeriod.md)
 - [Versionable](docs/Versionable.md)
 - [VersionableRequired](docs/VersionableRequired.md)
 - [WebhookSubscription](docs/WebhookSubscription.md)
 - [WebhooksCreateSubscriptionRequest](docs/WebhooksCreateSubscriptionRequest.md)
 - [WebhooksUpdateSubscriptionByUuidRequest](docs/WebhooksUpdateSubscriptionByUuidRequest.md)
 - [WebhooksVerifySubscriptionTokenRequest](docs/WebhooksVerifySubscriptionTokenRequest.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
