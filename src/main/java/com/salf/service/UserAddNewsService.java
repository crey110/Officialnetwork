package com.salf.service;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

public interface UserAddNewsService {
    void useraddnews(int id, String title, String date, MultipartFile addFile, HttpServletRequest request,String main);
}
