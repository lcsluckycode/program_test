package com.lcs.demo3;

import com.lcs.demo1.UserService;
import com.lcs.demo1.UserServiceImpl;
import com.lcs.demo2.Host;
import com.lcs.demo2.Rent;

public class Client {
    public static void main(String[] args) {
        // 真实角色
        UserServiceImpl userService = new UserServiceImpl();

        //代理角色，不存在
        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        //设置要代理的对象
        pih.setTarget(userService);

        //生成动态代理类
        UserService proxy = (UserService) pih.getProxy();

        proxy.add();
    }
}
