package com.example.demo.dao.dba;

import com.example.demo.dto.User;

import java.util.List;

/**
 * Created by Administrator on 2018/6/24 0024.
 */
public interface UserDao {

    public List<User> showUserList();


    public User getUserById(Integer userId);
}
