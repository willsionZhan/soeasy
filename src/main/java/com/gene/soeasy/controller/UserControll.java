package com.gene.soeasy.controller;

import com.gene.soeasy.entity.Menu;
import com.gene.soeasy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserControll {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "getusermenu", produces = { "application/json; charset=utf-8"})
    @ResponseBody
    public List<Menu> getUserMenus(){
        return userService.getUserMenus("admin");
    }

}
