package com.gene.soeasy.mapper;

import com.gene.soeasy.entity.Menu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 菜单(权限) Mapper 接口
 * </p>
 *
 * @author gene
 * @since 2022-09-25
 */
@Repository
@Mapper
public interface MenuMapper extends BaseMapper<Menu> {

}
