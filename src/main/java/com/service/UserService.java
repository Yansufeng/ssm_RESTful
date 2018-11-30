package com.service;

import com.pojo.Result;
import com.pojo.User;
import com.pojo.User_info;

public interface UserService {
    Result Check_user(User_info user_info);
    void Insert_users(User user);
    void Insert_test();
}
