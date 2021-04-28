package com.example.demo.controller;

import com.example.demo.dasasd.UserLevel;
import com.example.demo.entity.Users;
import com.example.demo.service.impl.UsersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsersController {

    @Autowired
    private UsersServiceImpl usersService;

    @RequestMapping("list")
    public List<Users> list(){
        List<Users> list = usersService.getList();
        List huiyuan = new ArrayList();
        UserLevel primary = UserLevel.primary;
        UserLevel advanced = UserLevel.advanced;
        return list;
    }

}
