package com.salf.service;

import com.salf.dao.UserLoginDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLonginServiceImp implements UserLoginService {

    @Autowired
    private UserLoginDao userLoginDao;

    public UserLoginDao getUserLoginDao() {
        return userLoginDao;
    }

    public void setUserLoginDao(UserLoginDao userLoginDao) {
        this.userLoginDao = userLoginDao;
    }

    public boolean Login(String username, String password) {
        if(userLoginDao.Login(username).getPassword() == password) return true;
        else return false;
    }
}
