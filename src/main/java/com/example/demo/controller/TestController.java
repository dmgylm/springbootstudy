package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.dto.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/6/23 0023.
 */
@RestController
public class TestController {


    @RequestMapping("/getUser")
    public String getUser(User user){
        String json=JSONObject.toJSONString(user);
        return json;
    }
}
