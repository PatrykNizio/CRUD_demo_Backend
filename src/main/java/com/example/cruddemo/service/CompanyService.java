package com.example.cruddemo.service;

import com.example.cruddemo.models.Company;

import java.util.List;

public interface CompanyService {
    Company saveCompany(Company company);
    List<Company> getAllCompanies();
    Company getCompanyById(Integer id);
    Company updateCompany(Integer id, Company company);
    void deleteCompany(Integer id);
}