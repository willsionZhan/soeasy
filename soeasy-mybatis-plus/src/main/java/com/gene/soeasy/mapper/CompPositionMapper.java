package com.gene.soeasy.mapper;

import com.gene.soeasy.entity.CompPosition;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 公司职位表 Mapper 接口
 * </p>
 *
 * @author gene
 * @since 2022-09-25
 */
@Mapper
@Repository
public interface CompPositionMapper extends BaseMapper<CompPosition> {

}
