package com.salf.controller;


import com.salf.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/User")
public class UserLogin {

    @Autowired
    private UserLoginService userLoginService;

    public UserLoginService getUserLoginService() {
        return userLoginService;
    }

    public void setUserLoginService(UserLoginService userLoginService) {
        this.userLoginService = userLoginService;
    }

    @RequestMapping(value = "/add" , produces = "application/json; charset=utf-8")
    @ResponseBody
    public String login(String password,String username){
        if(userLoginService.Login(username,password)) return "登陆成功";
        else return "登陆失败";
    }
 }
