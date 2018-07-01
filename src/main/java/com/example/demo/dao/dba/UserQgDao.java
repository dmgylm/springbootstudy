package com.example.demo.dao.dba;

import com.example.demo.dto.UserQg;

import java.util.List;

/**
 * Created by Administrator on 2018/7/1 0001.
 */
public interface UserQgDao {
    public void insert(UserQg userQg);

    public List<UserQg> showUserQgInfoList();
}
