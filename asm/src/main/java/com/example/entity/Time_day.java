package com.example.entity;

import lombok.Data;

@Data
public class Time_day {
    private int id;//主键
    private String execute_no;//操作账号
    private String no;//被修改账号
    private String before_datetime;//开始时间(左闭右开)
    private String after_datetime;//结束时间
    private String before_attendance_state;//修改前状态
    private String after_attendance_state;//修改后状态
}
