package com.muzijin.mybatisplus.entity;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author : zengjin
 * @date : 2019-11-14 08:53
 **/
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String mail;
    private Long managerId;
    private LocalDateTime createTime;
}
