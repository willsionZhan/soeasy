package com.gene.soeasy.hr.service.impl;

import com.gene.soeasy.entity.Company;
import com.gene.soeasy.mapper.CompanyMapper;
import com.gene.soeasy.hr.service.ICompanyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 公司架构表 服务实现类
 * </p>
 *
 * @author gene
 * @since 2022-09-25
 */
@Service
public class CompanyServiceImpl extends ServiceImpl<CompanyMapper, Company> implements ICompanyService {

}
