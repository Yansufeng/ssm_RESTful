package com.controller;

import com.pojo.Result;
import com.pojo.User;
import com.pojo.User_info;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String Get_index(){
        return "login";
    }

    @RequestMapping(value = "/login_check",method = RequestMethod.POST)
    @ResponseBody
    public Result Check_user(@RequestBody User_info user_info){
        System.out.println(user_info.getName());
        System.out.println(user_info.getPwd());
        return userService.Check_user(user_info);
    }

    @RequestMapping(value = "/regist",method = RequestMethod.GET)
    public String Get_regist(){
        return "regist";
    }

    @RequestMapping(value = "/regist_input",method = RequestMethod.POST)
    @ResponseBody
    public Result Regist(@RequestBody User user){
        System.out.println(user.getName());
        System.out.println(user.getPwd());
        System.out.println(user.getSex());
        System.out.println(user.getInfo());
        userService.Insert_users(user);
        Result result=new Result();
        result.setFlag(true);
        result.setErr_code(0);
        result.setMsg("Success");
        return result;
    }
}

