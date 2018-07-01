package com.example.demo.service;

import com.example.demo.dao.dba.UserDao;
import com.example.demo.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/6/24 0024.
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public List<User> showUser(){
     return  userDao.showUserList();
    }

    public User getUserById(Integer userId){
        return userDao.getUserById(userId);
    }
}
