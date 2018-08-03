package com.salf.controller;


import com.salf.service.QueryNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/query")
public class News {
    @Autowired
    private QueryNewsService queryNewsService;

    public QueryNewsService getQueryNewsService() {
        return queryNewsService;
    }

    public void setQueryNewsService(QueryNewsService queryNewsService) {
        this.queryNewsService = queryNewsService;
    }

    @RequestMapping(value = "/news" , produces = "application/json; charset=utf-8")
    @ResponseBody
    public List querynews(){
        return queryNewsService.querynews();
    }

}
