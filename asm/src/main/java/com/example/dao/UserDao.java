package com.example.dao;

import com.example.entity.User;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserDao {

    void insert(User user);

    @Select("select * from user where id=#{id}")
    User selectId(int id);


    List<User> select(User user);

    void update(User users);

    void deletes(int[] ids);
}
