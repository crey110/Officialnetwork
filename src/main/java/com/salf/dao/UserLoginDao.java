package com.salf.dao;


import com.salf.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLoginDao {
    User Login(String username);
}
