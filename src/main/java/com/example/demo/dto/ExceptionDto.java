package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by Administrator on 2018/6/23 0023.
 */
@Data
@Slf4j
@AllArgsConstructor
@NoArgsConstructor
public class ExceptionDto {
    private String errorMessage;
    private String code;
}
