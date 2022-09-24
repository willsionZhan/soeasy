package com.gene.soeasy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginControll {

    @RequestMapping("/toLogin")
    public String toLogin(){
        return "/pages/sign-in.html";
    }

    @RequestMapping("/login")
    public String login(){
        return "/pages/sign-in.html";
    }

    @RequestMapping("/toMain")
    public String toMain(){
        return "/pages/home.html";
    }
}
