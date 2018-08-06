package com.salf.service;


import com.salf.dao.NewsPagingDao;
import com.salf.entity.News;
import com.salf.util.MainWordsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NewsPagingServiceServiceImp implements NewsPagingService {
    @Autowired
    private NewsPagingDao newsPagingDao;

    public NewsPagingDao getNewsPagingDao() {
        return newsPagingDao;
    }

    public void setNewsPagingDao(NewsPagingDao newsPagingDao) {
        this.newsPagingDao = newsPagingDao;
    }

    public List<News> newspaging(Integer pageno) {
        int page;

        if (pageno == null){
            page = 1;
        }else {
            page = pageno;
        }
        int pagefirst;
        int pageend;
        if (page <= 1){
            pagefirst = 0;
            pageend = 6;
        }else {
            pagefirst = (page - 1) * 6;
            pageend = page * 6;
        }
        List<News> newlist = new ArrayList<News>();
        List<News> list = newsPagingDao.newspaging(pagefirst,pageend);
        return MainWordsUtil.mainWordsUtil(list,newlist);
    }

}