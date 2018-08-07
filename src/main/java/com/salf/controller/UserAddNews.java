package com.salf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping(value = "add")
public class UserAddNews {
    @Autowired
    private UserAddNews userAddNews;

    public UserAddNews getUserAddNews() {
        return userAddNews;
    }

    public void setUserAddNews(UserAddNews userAddNews) {
        this.userAddNews = userAddNews;
    }
    @RequestMapping(value = "news")
    public void useraddnews(int id,String title,String date,MultipartFile addFile,HttpServletRequest request,String main){
        userAddNews.useraddnews(id,title, date,addFile,request,main);
    }
}
