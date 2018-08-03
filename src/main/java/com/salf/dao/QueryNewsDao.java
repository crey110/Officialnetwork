package com.salf.dao;

import com.salf.entity.News;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QueryNewsDao {
    List<News> querynews();
}
