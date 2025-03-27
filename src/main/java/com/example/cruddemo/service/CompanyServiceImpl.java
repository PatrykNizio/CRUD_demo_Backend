package com.example.cruddemo.service;

import com.example.cruddemo.models.Company;
import com.example.cruddemo.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public Company saveCompany(Company company) {
        return companyRepository.save(company);
    }

    @Override
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    @Override
    public Company getCompanyById(Integer id) {
        return companyRepository.findById((long)id).orElse(null);
    }

    @Override
    public Company updateCompany(Integer id, Company company) {
        Company existing = companyRepository.findById((long)id).orElse(null);
        if (existing != null) {
            existing.setCompanyName(company.getCompanyName());
            existing.setCompanyFound(company.getCompanyFound());
            existing.setTown(company.getTown());
            existing.setRadius(company.getRadius());
            return companyRepository.save(existing);
        }
        return null;
    }

    @Override
    public void deleteCompany(Integer id) {
        companyRepository.deleteById((long)id);
    }
}