package com.example.demo.dto;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/6/23 0023.
 */
@Slf4j
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable{

    private String name;
    private int gender;


    public static void main(String[] args) {
        User u=new User("lm",12);
        log.info(u.toString());
    }

}
