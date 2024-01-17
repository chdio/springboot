package com.example.entity;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class User {

  private long id;
  private String no;//
  private String password;
  private String name;
  private String sex;
  private String phone;
  private String attendance_state;
  private String post;
  private long pay;
  private long role_id;//3超级管理员 2普通管理员 1普通员工

}
