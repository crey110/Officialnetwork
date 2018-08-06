package com.salf.controller;


import com.salf.service.NewsPagingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/news")
public class NewsPaging {
    @Autowired
    private NewsPagingService newsPagingService;

    public NewsPagingService getNewsPagingService() {
        return newsPagingService;
    }

    public void setNewsPagingService(NewsPagingService newsPagingService) {
        this.newsPagingService = newsPagingService;
    }

    @RequestMapping(value = "/paging" , produces = "application/json; charset=utf-8")
    @ResponseBody
    public List querynews(Integer pageno){
        return newsPagingService.newspaging(pageno);
    }

}
