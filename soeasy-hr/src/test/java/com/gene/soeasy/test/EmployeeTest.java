package com.gene.soeasy.test;

import com.gene.soeasy.entity.Employee;
import com.gene.soeasy.mapper.EmployeeMapper;
import com.gene.soeasy.hr.service.IEmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmployeeTest {
    @Autowired
    private EmployeeMapper employeeMapper;
    @Autowired
    private IEmployeeService employeeService;

    @Test
    public void employeeMapperTest(){
        Employee employee = new Employee();
        employee.setEmpFullName("zhanfei");
        employee.setMobileNumber("123131");
        employeeMapper.insert(employee);
    }

    @Test
    public void employeeServiceTest(){
        Employee employee = new Employee();
        employee.setEmpFullName("zhanfei111");
        employee.setMobileNumber("121121");
        employeeService.save(employee);

    }
}
