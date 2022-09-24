package com.gene.soeasy.service.impl;

import com.gene.soeasy.entity.Menu;
import com.gene.soeasy.entity.Role;
import com.gene.soeasy.entity.User;
import com.gene.soeasy.mapper.UserMapper;
import com.gene.soeasy.service.UserService;
import com.gene.soeasy.tools.MenuRestructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();

    }

    @Override
    public List<Menu> getUserMenus(String usercode) {
        MenuRestructure menuRestructure = new MenuRestructure(userMapper.getUserMenus(usercode));
        return menuRestructure.buildTree();
    }

    @Override
    public List<Role> getUserRoles(String usercode) {
        return userMapper.getUserRoles(usercode);
    }

    @Override
    public User login(String userName) {
        return userMapper.getUser(userName);
    }
}
