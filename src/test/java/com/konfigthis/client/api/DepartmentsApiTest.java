/*
 * Gusto API
 * Welcome to Gusto's Embedded Payroll API documentation!
 *
 * The version of the OpenAPI document: 2024-03-01
 * Contact: developer@gusto.com
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.Department;
import com.konfigthis.client.model.DepartmentsAddPeopleToDepartmentRequest;
import com.konfigthis.client.model.DepartmentsAddPeopleToDepartmentRequestEmployeesInner;
import com.konfigthis.client.model.DepartmentsCreateDepartmentRequest;
import com.konfigthis.client.model.DepartmentsRemoveEmployeesRequest;
import com.konfigthis.client.model.DepartmentsUpdateDepartmentRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DepartmentsApi
 */
@Disabled
public class DepartmentsApiTest {

    private static DepartmentsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new DepartmentsApi(apiClient);
    }

    /**
     * Add people to a department
     *
     * Add employees and contractors to a department  scope: &#x60;departments:write&#x60; 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addPeopleToDepartmentTest() throws ApiException {
        String departmentUuid = null;
        String version = null;
        List<DepartmentsAddPeopleToDepartmentRequestEmployeesInner> employees = null;
        List<DepartmentsAddPeopleToDepartmentRequestEmployeesInner> contractors = null;
        String xGustoAPIVersion = null;
        Department response = api.addPeopleToDepartment(departmentUuid)
                .version(version)
                .employees(employees)
                .contractors(contractors)
                .xGustoAPIVersion(xGustoAPIVersion)
                .execute();
        // TODO: test validations
    }

    /**
     * Create a department
     *
     * Create a department  scope: &#x60;departments:write&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createDepartmentTest() throws ApiException {
        String companyUuid = null;
        String title = null;
        String xGustoAPIVersion = null;
        Department response = api.createDepartment(companyUuid)
                .title(title)
                .xGustoAPIVersion(xGustoAPIVersion)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a department
     *
     * Delete a department. You cannot delete a department until all employees and contractors have been removed.  scope: &#x60;departments:write&#x60; 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteDepartmentTest() throws ApiException {
        String departmentUuid = null;
        String xGustoAPIVersion = null;
        api.deleteDepartment(departmentUuid)
                .xGustoAPIVersion(xGustoAPIVersion)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a department
     *
     * Get a department given the UUID  scope: &#x60;departments:read&#x60; 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByUuidTest() throws ApiException {
        String departmentUuid = null;
        String xGustoAPIVersion = null;
        Department response = api.getByUuid(departmentUuid)
                .xGustoAPIVersion(xGustoAPIVersion)
                .execute();
        // TODO: test validations
    }

    /**
     * Get all departments of a company
     *
     * Get all of the departments for a given company with the employees and contractors assigned to that department.  scope: &#x60;departments:read&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listForCompanyTest() throws ApiException {
        String companyUuid = null;
        String xGustoAPIVersion = null;
        List<Department> response = api.listForCompany(companyUuid)
                .xGustoAPIVersion(xGustoAPIVersion)
                .execute();
        // TODO: test validations
    }

    /**
     * Remove people from a department
     *
     * Remove employees and contractors from a department  scope: &#x60;departments:write&#x60; 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeEmployeesTest() throws ApiException {
        String departmentUuid = null;
        String version = null;
        List<DepartmentsAddPeopleToDepartmentRequestEmployeesInner> employees = null;
        List<DepartmentsAddPeopleToDepartmentRequestEmployeesInner> contractors = null;
        String xGustoAPIVersion = null;
        Department response = api.removeEmployees(departmentUuid)
                .version(version)
                .employees(employees)
                .contractors(contractors)
                .xGustoAPIVersion(xGustoAPIVersion)
                .execute();
        // TODO: test validations
    }

    /**
     * Update a department
     *
     * Update a department  scope: &#x60;departments:write&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateDepartmentTest() throws ApiException {
        String version = null;
        String departmentUuid = null;
        String title = null;
        String xGustoAPIVersion = null;
        Department response = api.updateDepartment(version, departmentUuid)
                .title(title)
                .xGustoAPIVersion(xGustoAPIVersion)
                .execute();
        // TODO: test validations
    }

}
