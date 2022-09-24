package com.gene.soeasy.service;

import com.gene.soeasy.entity.Menu;
import com.gene.soeasy.entity.Role;
import com.gene.soeasy.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {

    /*
    *获取用户列表
    **/
    public List<User> getAllUser();


    /***
     * 根据用户代码获取该用户角色列表
     *
     */
    public List<Role> getUserRoles(String usercode);

    /***
     * 根据用户代码获取该用户菜单列表
     *
     */
    public List<Menu> getUserMenus(String usercode);

    /**
     * 用户登陆
     * */
    public User login(String userName);

}
