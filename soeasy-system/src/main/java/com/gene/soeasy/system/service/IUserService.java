package com.gene.soeasy.system.service;

import com.gene.soeasy.entity.Menu;
import com.gene.soeasy.entity.Role;
import com.gene.soeasy.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 系统用户表 服务类
 * </p>
 *
 * @author gene
 * @since 2022-09-25
 */
public interface IUserService extends IService<User> {

    /***
     * 根据用户代码获取该用户菜单列表
     *
     */
    public List<Menu> getUserMenus(String userCode);

    /**
     * 根据用户代码获取该用户的角色列表
     * */
    public List<Role> getUserRoles(String userCode);

}
