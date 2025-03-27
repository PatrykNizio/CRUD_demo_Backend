package com.example.cruddemo.repositories;

import com.example.cruddemo.models.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}