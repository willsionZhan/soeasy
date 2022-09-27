package com.gene.soeasy.test;

import com.gene.soeasy.entity.Dept;
import com.gene.soeasy.mapper.DeptMapper;
import com.gene.soeasy.hr.service.IDeptService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DeptTest {
    @Autowired
    private DeptMapper deptMapper;
    @Autowired
    private IDeptService deptService;
    @Test
    public void deptMapperTest(){
        Dept dept = new Dept();
        dept.setDeptName("test");
        dept.setDeptDesc("test");
        deptMapper.insert(dept);
    }
    @Test
    public void deptServiceTest(){
        Dept dept = new Dept();
        dept.setDeptName("test1");
        dept.setDeptDesc("test1");
        deptService.save(dept);

    }
}
