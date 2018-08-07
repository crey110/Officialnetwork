package com.salf.service;

import com.salf.controller.News;

import java.util.List;

public interface FindNewsService {
    List<News> findnews(int id);
}
