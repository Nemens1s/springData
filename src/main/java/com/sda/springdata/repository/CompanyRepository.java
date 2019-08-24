package com.sda.springdata.repository;

import com.sda.springdata.domain.Company;
import org.springframework.data.repository.CrudRepository;

public interface CompanyRepository extends CrudRepository<Company, Long> {
}
