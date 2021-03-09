package com.drj.easyweb.service;

import com.drj.easyweb.entity.User;
import com.drj.easyweb.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public User Sel(int id){
        return userMapper.getUserById(id);
    }
}
