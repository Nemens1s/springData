package com.sda.springdata.controller;

import com.sda.springdata.domain.Company;
import com.sda.springdata.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/company")
public class CompanyController{

    private final CompanyRepository companyRepository;

    @Autowired
    public CompanyController(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }


    @PostMapping(value = "/add")
    public Company addCompany(@RequestBody Company company){

       return companyRepository.save(company);
    }

    @GetMapping(value = "/")
    public String helloCompany(){
        return "Hello Timur!";
    }

    @GetMapping(value = "/{id}")
    public Optional<Company> findById(@PathVariable Long id){
        return companyRepository.findById(id);
    }

}
