package com.gene.soeasy.mapper;

import com.gene.soeasy.entity.Menu;
import com.gene.soeasy.entity.Role;
import com.gene.soeasy.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserMapper {




    /***
     *
     *
     */

    public List<User> getAllUser();

    /***
     *
     */

    public User getUser(String usercode);

    /**
     *
     *
     * */
    public List<Role> getUserRoles(String usercode);

    /**
     *
     * */
    public List<Menu> getUserMenus(String usercode);



}