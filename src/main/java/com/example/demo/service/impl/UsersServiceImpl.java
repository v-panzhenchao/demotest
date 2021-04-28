package com.example.demo.service.impl;

import com.example.demo.dao.UserSDao;
import com.example.demo.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl {
    @Autowired
    private UserSDao userSDao;

    public List<Users> getList() {
       return userSDao.getList();
    }
}
