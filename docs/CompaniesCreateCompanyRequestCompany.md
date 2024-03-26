

# CompaniesCreateCompanyRequestCompany


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The legal name of the company. |  |
|**tradeName** | **String** | The name of the company. |  [optional] |
|**ein** | **String** | The employer identification number (EIN) of the company. |  [optional] |
|**states** | **List&lt;String&gt;** | The states in which the company operates. States should be included by their two letter code, i.e. NY for New York.  |  [optional] |
|**numberEmployees** | **Double** | The number of employees in the company. |  [optional] |
|**addresses** | [**List&lt;CompaniesCreateCompanyRequestCompanyAddressesInner&gt;**](CompaniesCreateCompanyRequestCompanyAddressesInner.md) | The locations for the company. This includes mailing, work, and filing addresses. |  [optional] |



