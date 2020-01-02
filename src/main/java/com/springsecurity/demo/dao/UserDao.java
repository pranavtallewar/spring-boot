package com.springsecurity.demo.dao;

import com.springsecurity.demo.entity.User;

public interface UserDao {

    public User findByUserName(String userName);
    
    public void save(User user);
    
}
