package com.dao;

import com.pojo.User;

public interface UserDao {
    User QueryByName(String name);
    void Insert_users(User user);
    void Insert_test();
}
