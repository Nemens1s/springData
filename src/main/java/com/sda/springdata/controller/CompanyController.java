package com.sda.springdata.controller;

import com.sda.springdata.domain.Company;
import com.sda.springdata.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("company/")
public class CompanyController {

    private final CompanyRepository companyRepository;

    @Autowired
    public CompanyController(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }


    @RequestMapping(value = "add", method = RequestMethod.POST)
    public Company addCompany(Company company){
       return companyRepository.save(company);
    }
}
