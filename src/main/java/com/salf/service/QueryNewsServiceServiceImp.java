package com.salf.service;

import com.salf.dao.QueryNewsDao;
import com.salf.entity.News;
import com.salf.util.MainWordsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QueryNewsServiceServiceImp implements QueryNewsService {
    @Autowired
    private QueryNewsDao queryNewsDao;

    public QueryNewsDao getQueryNewsDao() {
        return queryNewsDao;
    }

    public void setQueryNewsDao(QueryNewsDao queryNewsDao) {
        this.queryNewsDao = queryNewsDao;
    }

    public List<News> querynews() {
        List<News> newlist = new ArrayList<News>();
        List<News> list = queryNewsDao.querynews();
        return MainWordsUtil.mainWordsUtil(list,newlist);
    }

}
