package com.gene.soeasy.service.impl;

import com.gene.soeasy.entity.Dept;
import com.gene.soeasy.mapper.DeptMapper;
import com.gene.soeasy.service.IDeptService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 组织架构表 服务实现类
 * </p>
 *
 * @author gene
 * @since 2022-09-25
 */
@Service
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept> implements IDeptService {

}
