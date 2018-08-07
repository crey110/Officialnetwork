package com.salf.service;

import com.salf.controller.News;
import com.salf.dao.FindNewsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FindNewsServiceImp implements FindNewsService {
    @Autowired
    private FindNewsDao findNewsDao;

    public FindNewsDao getFindNewsDao() {
        return findNewsDao;
    }

    public void setFindNewsDao(FindNewsDao findNewsDao) {
        this.findNewsDao = findNewsDao;
    }

    public List<News> findnews(int id) {
        return findNewsDao.findnews(id);
    }
}
