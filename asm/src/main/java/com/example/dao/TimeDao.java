package com.example.dao;

import com.example.entity.Time;
import com.example.entity.Time_day;
import com.example.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TimeDao {

    void insert(Time time);

    @Select("select * from time where id=#{id}")
    Time selectId(int id);

    List<Time> select(Time_day time);

    void update(Time times);

    void deletes(int[] ids);

    void deleteDays(Time_day time);

    void aa();
}
