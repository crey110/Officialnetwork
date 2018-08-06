package com.salf.util;

import com.salf.entity.News;

import java.util.List;

public class MainWordsUtil {
    public static List<News> mainWordsUtil(List<News> list,List<News> newlist){
        for(News news:list){
            String title = news.getTitle();
            String main = news.getMain();
            int count = title.length();
            int countmain = main.length();
            if(count > 17) {
                News newnews= new News();
                newnews.setTitle(title.substring(0,15)+"...");
                newnews.setId(news.getId());
                newnews.setDate(news.getDate());
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
                newnews.setDate(news.getDate());
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
