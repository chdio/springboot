package com.example.service;

import com.example.entity.Time;
import com.example.entity.Time_day;


import java.util.List;

public interface TimeService {
    void insert(Time time);

    Time selectId(int id);

    List<Time> select(Time_day time);

    void update(Time time);

    void deletes(int[] ids);

    void deleteDays(Time_day time);
}
