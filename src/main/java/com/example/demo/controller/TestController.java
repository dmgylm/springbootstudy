package com.example.demo.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.dto.City;
import com.example.demo.dto.User;
import com.example.demo.dto.UserQg;
import com.example.demo.service.CityService;
import com.example.demo.service.UserQgService;
import com.example.demo.service.UserService;
import com.example.demo.util.RedisUtil;
import com.example.demo.util.serialize.RedisClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2018/6/23 0023.
 */
@RestController
public class TestController {
    @Autowired
    private UserService userService;

    @Autowired
    private CityService cityService;

    @Autowired
    private UserQgService userQgService;

    @Autowired
    private RedisClient redisClient;

    @RequestMapping("/showUser/{key}")
    public List<User> showUser(@PathVariable String key)  {
        if(StringUtils.isEmpty(key)){
            return null;
        }else{
            List<User> userList=redisClient.getList(key,User.class);
            if(userList!=null){
                return userList;
            }
        }
          redisClient.setList(key,userService.showUser());
        return  redisClient.getList(key,User.class);

    }


    @RequestMapping("/getUserByid/{id}")
    public User getUserbyId(@PathVariable Integer id)  {
        String key= id+"userInfo";
        if(StringUtils.isEmpty(id)){
            return null;
        }else{
            User user=redisClient.get(key,User.class);
            if(key!=null){
                return user;
            }
        }
        redisClient.set(key,userService.getUserById(id));
        return redisClient.get(key,User.class);
    }


    @RequestMapping("/showCityList")
    public List<City> showCityList()  {
        return cityService.showCityList();
    }

    @RequestMapping("/userQg")
    public void userQgController(UserQg userQg){
        userQgService.insert(userQg);
    }


    @RequestMapping("/showUserQgList")
    public List<UserQg> showUserQgList(){
       return userQgService.showUserQgList();
    }
}
