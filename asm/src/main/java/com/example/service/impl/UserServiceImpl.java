package com.example.service.impl;

import com.example.dao.UserDao;
import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User selectId(int id) {
        return userDao.selectId(id);
    }

    @Override
    public List<User> select(User user) {
        return userDao.select(user);
    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }

    @Override
    public void deletes(int[] ids) {
        userDao.deletes(ids);
    }

    @Override
    public void insert(User user) {
        userDao.insert(user);
    }


}
