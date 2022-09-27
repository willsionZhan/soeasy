package com.gene.soeasy.system.service.impl;

import com.gene.soeasy.entity.Menu;
import com.gene.soeasy.entity.Role;
import com.gene.soeasy.entity.User;
import com.gene.soeasy.mapper.UserMapper;
import com.gene.soeasy.system.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gene.soeasy.tools.MenuRestructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * <p>
 * 系统用户表 服务实现类
 * </p>
 *
 * @author gene
 * @since 2022-09-25
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    private UserMapper userMapper;

    public List<Menu> getUserMenus(String userCode){
        MenuRestructure menuRestructure = new MenuRestructure(userMapper.getUserMenus(userCode));
        return menuRestructure.buildTree();
    }

    public List<Role> getUserRoles(String userCode){
        return userMapper.getUserRoles(userCode);
    }



}
