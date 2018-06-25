package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.dto.Order;
import com.example.demo.dto.User;
import com.example.demo.mapper.master1.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/6/23 0023.
 */
@RestController
public class TestController {

    @Autowired
    private OrderMapper orderMapper;


    @RequestMapping("/getUser")
    public String getUser(User user){
        String json=JSONObject.toJSONString(user);
        return json;
    }

    @RequestMapping("/getOrderByOrderId")
    public Order getOrderByorderId(String orderId){
        return orderMapper.getOrderByOrderId(orderId);
    }
}
