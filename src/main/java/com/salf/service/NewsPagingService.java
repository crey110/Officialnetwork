package com.salf.service;

import com.salf.entity.News;

import java.util.List;

public interface NewsPagingService {
    List<News> newspaging(Integer pageno);
}
