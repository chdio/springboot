package com.example.service;

import com.example.entity.User;

import java.util.List;

public interface UserService {

    void insert(User user);

    User selectId(int id);

    List<User> select(User user);

    void update(User user);

    void deletes(int[] ids);
}
