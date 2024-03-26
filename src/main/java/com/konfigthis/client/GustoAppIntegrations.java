package com.konfigthis.client;

import com.konfigthis.client.api.CompaniesApi;
import com.konfigthis.client.api.CompanyBenefitsApi;
import com.konfigthis.client.api.ContractorPaymentsApi;
import com.konfigthis.client.api.ContractorsApi;
import com.konfigthis.client.api.DepartmentsApi;
import com.konfigthis.client.api.EarningTypesApi;
import com.konfigthis.client.api.EmployeeAddressesApi;
import com.konfigthis.client.api.EmployeeBenefitsApi;
import com.konfigthis.client.api.EmployeeEmploymentsApi;
import com.konfigthis.client.api.EmployeesApi;
import com.konfigthis.client.api.EventsApi;
import com.konfigthis.client.api.GarnishmentsApi;
import com.konfigthis.client.api.IntrospectionApi;
import com.konfigthis.client.api.JobsAndCompensationsApi;
import com.konfigthis.client.api.LocationsApi;
import com.konfigthis.client.api.PaySchedulesApi;
import com.konfigthis.client.api.PayrollsApi;
import com.konfigthis.client.api.TimeOffPoliciesApi;
import com.konfigthis.client.api.WebhooksApi;

public class GustoAppIntegrations {
    private ApiClient apiClient;
    public final CompaniesApi companies;
    public final CompanyBenefitsApi companyBenefits;
    public final ContractorPaymentsApi contractorPayments;
    public final ContractorsApi contractors;
    public final DepartmentsApi departments;
    public final EarningTypesApi earningTypes;
    public final EmployeeAddressesApi employeeAddresses;
    public final EmployeeBenefitsApi employeeBenefits;
    public final EmployeeEmploymentsApi employeeEmployments;
    public final EmployeesApi employees;
    public final EventsApi events;
    public final GarnishmentsApi garnishments;
    public final IntrospectionApi introspection;
    public final JobsAndCompensationsApi jobsAndCompensations;
    public final LocationsApi locations;
    public final PaySchedulesApi paySchedules;
    public final PayrollsApi payrolls;
    public final TimeOffPoliciesApi timeOffPolicies;
    public final WebhooksApi webhooks;

    public GustoAppIntegrations() {
        this(null);
    }

    public GustoAppIntegrations(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.companies = new CompaniesApi(this.apiClient);
        this.companyBenefits = new CompanyBenefitsApi(this.apiClient);
        this.contractorPayments = new ContractorPaymentsApi(this.apiClient);
        this.contractors = new ContractorsApi(this.apiClient);
        this.departments = new DepartmentsApi(this.apiClient);
        this.earningTypes = new EarningTypesApi(this.apiClient);
        this.employeeAddresses = new EmployeeAddressesApi(this.apiClient);
        this.employeeBenefits = new EmployeeBenefitsApi(this.apiClient);
        this.employeeEmployments = new EmployeeEmploymentsApi(this.apiClient);
        this.employees = new EmployeesApi(this.apiClient);
        this.events = new EventsApi(this.apiClient);
        this.garnishments = new GarnishmentsApi(this.apiClient);
        this.introspection = new IntrospectionApi(this.apiClient);
        this.jobsAndCompensations = new JobsAndCompensationsApi(this.apiClient);
        this.locations = new LocationsApi(this.apiClient);
        this.paySchedules = new PaySchedulesApi(this.apiClient);
        this.payrolls = new PayrollsApi(this.apiClient);
        this.timeOffPolicies = new TimeOffPoliciesApi(this.apiClient);
        this.webhooks = new WebhooksApi(this.apiClient);
    }

}
