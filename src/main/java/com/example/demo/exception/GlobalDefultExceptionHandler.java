package com.example.demo.exception;

import com.example.demo.dto.ExceptionDto;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2018/6/23 0023.
 */
@ControllerAdvice
@ComponentScan("com.example.demo.controller")
public class GlobalDefultExceptionHandler {

    @ResponseBody
    @ExceptionHandler(Exception.class)
    public ExceptionDto dealWithExcp(HttpServletRequest request,Exception e){
        ExceptionDto dto=null;
        if(e!=null){
             dto=new ExceptionDto("500",e.getMessage());
        }
       return dto;
    }

}
