package com.example.cruddemo.controllers;

import com.example.cruddemo.models.Company;
import com.example.cruddemo.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/companies")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @GetMapping
    public List<Company> getAll() {
        return companyService.getAllCompanies();
    }

    @GetMapping("/{id}")
    public Company getById(@PathVariable Integer id) {
        return companyService.getCompanyById(id);
    }

    @PostMapping
    public Company create(@RequestBody Company company) {
        return companyService.saveCompany(company);
    }

    @PutMapping("/{id}")
    public Company update(@PathVariable Integer id, @RequestBody Company company) {
        return companyService.updateCompany(id, company);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        companyService.deleteCompany(id);
    }
}