package com.example.demo.dao;

import com.example.demo.entity.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserSDao {

    @Select("select * from user")
    List<Users> getList();
}
