package com.gene.soeasy.test;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gene.soeasy.SoeasyApplication;
import com.gene.soeasy.entity.User;
import com.gene.soeasy.mapper.UserMapper;
import com.gene.soeasy.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest(classes = SoeasyApplication.class)
public class UserServiceTest {
    @Autowired
    private IUserService userService;

    @Autowired
    private UserMapper userMapper;

    @Test
    public void batchInsertUser(){

        List<User> users = new ArrayList<>();
        User user;
        for(int i = 0;i < 10;i++){
            user = new User();
            user.setUserName("abc"+i);
            user.setUserPWD("123456");
            user.setUserCode("ABC"+i);
            user.setUserStatus(0);
            users.add(user);
        }
        boolean result = userService.saveBatch(users);
        System.out.println(result);

    }

    @Test
    public void pageTest(){
        Page<User> userPage = new Page<>(1,3);
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.isNotNull("userCode");
        userMapper.selectPage(userPage,null);
        System.out.println(userPage);
    }
}
