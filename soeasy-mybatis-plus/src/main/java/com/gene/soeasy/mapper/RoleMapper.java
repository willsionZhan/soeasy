package com.gene.soeasy.mapper;

import com.gene.soeasy.entity.Role;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author gene
 * @since 2022-09-25
 */
@Repository
@Mapper
public interface RoleMapper extends BaseMapper<Role> {

}
