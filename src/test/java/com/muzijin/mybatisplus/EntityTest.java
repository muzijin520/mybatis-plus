package com.muzijin.mybatisplus;

import com.muzijin.mybatisplus.entity.User;
import com.muzijin.mybatisplus.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 实体类测试
 *
 * @author : zengjin
 * @date : 2019-11-14 08:53
 **/
@SpringBootTest
public class EntityTest {

    @Autowired
    private UserMapper mapper;

    @Test
    public void insertTest() {
        User user = new User();
        user.setAge(27);
        user.setName("张三");
        user.setManagerId(1088248166370832385L);
        int insert = mapper.insert(user);
        System.out.println("受影响行数 " + insert);

    }
}
