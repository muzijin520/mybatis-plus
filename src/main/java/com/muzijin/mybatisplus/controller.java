package com.muzijin.mybatisplus;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : zengjin
 * @date : 2019-11-14 08:27
 **/
@RestController
public class controller {

    @GetMapping("/test")
    public String test(){
        return "OK";
    }
}
