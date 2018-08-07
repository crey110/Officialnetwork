package com.salf.dao;

import com.salf.controller.News;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FindNewsDao {
    List<News> findnews(@Param(value = "id") int id);
}
