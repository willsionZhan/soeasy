package com.gene.soeasy.mapper;

import com.gene.soeasy.entity.Company;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 公司架构表 Mapper 接口
 * </p>
 *
 * @author gene
 * @since 2022-09-25
 */
@Repository
@Mapper
public interface CompanyMapper extends BaseMapper<Company> {

}
