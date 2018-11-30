package com.service;

import com.dao.UserDao;
import com.pojo.Result;
import com.pojo.User;
import com.pojo.User_info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public Result Check_user(User_info user_info){
        User user=userDao.QueryByName(user_info.getName());
        Result result=new Result();

/*        System.out.println(user.getName());
        System.out.println(user.getPwd());
        System.out.println(user.getSex());
        System.out.println(user.getInfo());
        System.out.println(user_info.getName());
        System.out.println(user_info.getPwd());*/
        if(user==null){
            result.setFlag(false);
            result.setErr_code(2);
            result.setMsg("Failed!");
        }else if(user.getPwd().equals(user_info.getPwd())){
            result.setFlag(true);
            result.setErr_code(0);
            result.setMsg(user.getInfo());
        }else{
            result.setFlag(false);
            result.setErr_code(1);
            result.setMsg("Failed!");
        }
        return result;
    }

    @Override
    public void Insert_users(User user){
        userDao.Insert_users(user);
    }

    @Override
    public void Insert_test(){
        userDao.Insert_test();
    }
}
