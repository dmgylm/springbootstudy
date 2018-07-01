package com.example.demo.service;

import com.example.demo.dao.dba.UserQgDao;
import com.example.demo.dto.UserQg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/7/1 0001.
 */
@Service
public class UserQgService {
    @Autowired
    private UserQgDao userQgDao;

    public void insert(UserQg userQg){
        userQgDao.insert(userQg);
    }


    public List<UserQg> showUserQgList(){
        return userQgDao.showUserQgInfoList();
    }
}
