package com.gene.soeasy.test;

import com.gene.soeasy.entity.Company;
import com.gene.soeasy.mapper.CompanyMapper;
import com.gene.soeasy.hr.service.ICompanyService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CompanyTest {
    @Autowired
    private CompanyMapper companyMapper;
  //  @Autowired
    private ICompanyService companyService;
    @Test
    public void companyMapperTest(){
        Company company = new Company();
        company.setCompanyCode("soeasy");
        company.setCompanyName("soeasy");
        companyMapper.insert(company);

    }
    @Test
    public void companyServiceTest(){
        Company company = new Company();
        company.setCompanyCode("soeasy1");
        company.setCompanyName("soeasy1");
        companyService.save(company);
    }
}
