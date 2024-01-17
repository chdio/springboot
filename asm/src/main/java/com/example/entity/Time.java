package com.example.entity;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class Time {

  private int id;//主键
  private String execute_no;//操作账号
  private String no;//被修改账号
  private String datetime;//修改时间
  private String before_attendance_state;//修改前状态
  private String after_attendance_state;//修改后状态

}
