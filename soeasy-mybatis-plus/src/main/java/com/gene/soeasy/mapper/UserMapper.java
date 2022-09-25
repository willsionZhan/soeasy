package com.gene.soeasy.mapper;

import com.gene.soeasy.entity.Menu;
import com.gene.soeasy.entity.Role;
import com.gene.soeasy.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 系统用户表 Mapper 接口
 * </p>
 *
 * @author gene
 * @since 2022-09-25
 */
@Repository
@Mapper
public interface UserMapper extends BaseMapper<User> {

    /**
     *根据用户编码得到用户角色
     *
     * */
    public List<Role> getUserRoles(String userCode);

    /**
     * 根据用户编码得到用户菜单
     *
     * */
    public List<Menu> getUserMenus(String userCode);

}
