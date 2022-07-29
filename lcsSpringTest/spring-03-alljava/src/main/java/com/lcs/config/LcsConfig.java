package com.lcs.config;

import com.lcs.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//这个也会交给spring容器托管
//等价于一个xml
@Configuration
public class LcsConfig {

    //相当于xml中<bean/>
    //方法名相当于id
    @Bean
    public User getUser() {
        return new User();
    }
}
