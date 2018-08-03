package com.salf.service;

import com.salf.dao.QueryNewsDao;
import com.salf.entity.News;
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
        for(News news:list){
            String title = news.getTitle();
            String main = news.getMain();
            int count = title.length();
            int countmain = main.length();
            if(count > 17) {
                News newnews= new News();
                newnews.setTitle(title.substring(0,15)+"...");
                newnews.setId(news.getId());
                if(countmain > 36){
                    newnews.setMain(main.substring(0,34)+ "..." + "<a href='#'>更多</a>");
                }else {
                    newnews.setMain(news.getMain());
                }
                newlist.add(newnews);
            }else{
                News newnews= new News();
                newnews.setTitle(title);
                newnews.setId(news.getId());
                if(countmain>36){
                    newnews.setMain(main.substring(0,34)+ "..." + "<a href='#'>更多</a>");
                }else {
                    newnews.setMain(news.getMain());
                }

                newlist.add(newnews);
            }
        }
        return newlist;
    }

}
