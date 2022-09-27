package com.gene.soeasy.hr.service.impl;

import com.gene.soeasy.entity.Employee;
import com.gene.soeasy.mapper.EmployeeMapper;
import com.gene.soeasy.hr.service.IEmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 员工表 服务实现类
 * </p>
 *
 * @author gene
 * @since 2022-09-25
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements IEmployeeService {

}
