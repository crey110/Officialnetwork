package com.salf.dao;

import com.salf.entity.News;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewsPagingDao {
    List<News> newspaging(int pagefirst);
}
