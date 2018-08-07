package com.salf.controller;

import com.salf.service.FindNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/find")
public class FindNews {
    @Autowired
    private FindNewsService findNewsService;

    public FindNewsService getFindNewsService() {
        return findNewsService;
    }

    public void setFindNewsService(FindNewsService findNewsService) {
        this.findNewsService = findNewsService;
    }
    @RequestMapping(value = "/news" , produces = "application/json; charset=utf-8")
    @ResponseBody
    public List<News> findnews(int id){
        return findNewsService.findnews(id);
    }


}
