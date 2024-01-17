package com.example.controler;

import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    //根据id查询用户
    @GetMapping("/selectId")
    public User selectID(int id) {
        return userService.selectId(id);
    }
    //条件查询(薪资不能为0,不能查询id)
    @GetMapping  ("/select")
    public List<User> select(User user) {
        System.out.println(user.toString());
        return userService.select(user);
    }
    //新增用户
    @PostMapping("/insert")
    public boolean insert(User user)
    {
        System.out.println(user.toString());
        boolean b;
        try{
            userService.insert(user);
            b=true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            b=false;
        }
        return b;
    }
    //根据id修改User其他值
    @PostMapping("/update")
    public boolean update(User user)
    {
        System.out.println(user.toString());
        boolean b;
        try{
            userService.update(user);
            b=true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            b=false;
        }
        return b;
    }
    //根据ids删除User
    @PostMapping("/deletes")
    public boolean deletes(int[] ids)
    {
        System.out.println(ids.length);
        boolean b;
        try{
            userService.deletes(ids);
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



