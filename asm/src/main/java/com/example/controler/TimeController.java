package com.example.controler;


import com.example.entity.Time;
import com.example.entity.Time_day;
import com.example.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/time")
public class TimeController {

    @Autowired
    TimeService timeService;

    //根据id查询time
    @GetMapping("/selectId")
    public Time selectId(int id) {
        return timeService.selectId(id);
    }
    //条件查询(不能查询id)
    @GetMapping  ("/select")
    public List<Time> select(Time_day time) {
        System.out.println(time.toString());
        return timeService.select(time);
    }

    @PostMapping("/insert")
    public boolean insert(Time time){
        System.out.println(time.toString());
        boolean b;
        try{
            timeService.insert(time);
            b=true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            b=false;
        }
        return b;
    }
    //根据id修改Time其他值
    @PostMapping("/update")
    public boolean update(Time time)
    {
        System.out.println(time.toString());
        boolean b;
        try{
            timeService.update(time);
            b=true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            b=false;
        }
        return b;
    }
    //根据ids删除Time
    @PostMapping("/deleteIds")
    public boolean deletes(int[] ids)
    {
        System.out.println(ids.length);
        boolean b;
        try{
            timeService.deletes(ids);
            b=true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            b=false;
        }
        return b;
    }
    @PostMapping("/deleteDays")
    public boolean deleteDays(Time_day time)
    {
        System.out.println(time.toString());
        boolean b;
        try{
            timeService.deleteDays(time);
            b=true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            b=false;
        }
        return b;
    }
}
