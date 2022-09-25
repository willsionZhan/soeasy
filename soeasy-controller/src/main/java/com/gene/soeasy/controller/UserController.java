package com.gene.soeasy.controller;

import com.gene.soeasy.entity.Menu;
import com.gene.soeasy.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 系统用户表 前端控制器
 * </p>
 *
 * @author gene
 * @since 2022-09-25
 */
@RestController
@RequestMapping("/soeasy/user")
public class UserController {

    @Autowired
    IUserService userService;

    @RequestMapping(value = "getUserMenu", produces = { "application/json; charset=utf-8"})
    @ResponseBody
    public List<Menu> getUserMenus(){
        return userService.getUserMenus("admin");
    }

}
