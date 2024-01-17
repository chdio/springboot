package com.example.service.impl;

import com.example.dao.TimeDao;
import com.example.entity.Time;
import com.example.entity.Time_day;
import com.example.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class TimeServiceImpl implements TimeService {
    @Autowired
    private TimeDao timeDao;

    @Override
    public Time selectId(int id) {
        return timeDao.selectId(id);
    }

    @Override
    public List<Time> select(Time_day time) {
        return timeDao.select(time);
    }

    @Override
    public void update(Time time) {
        timeDao.update(time);
    }

    @Override
    public void deletes(int[] ids) {
        timeDao.deletes(ids);
    }

    @Override
    public void deleteDays(Time_day time) {
        timeDao.deleteDays(time);
    }

    @Override
    public void insert(Time time) {
        timeDao.insert(time);
    }

}
