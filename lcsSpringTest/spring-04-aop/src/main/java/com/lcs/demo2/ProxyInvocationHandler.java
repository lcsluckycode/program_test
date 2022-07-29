package com.lcs.demo2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {

    //被代理的接口
    private Rent rent;

    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                rent.getClass().getInterfaces(),
                this);
    }

    public void seeHouse() {
        System.out.println("see house");
    }

    //处理代理实例，返回处理结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        seeHouse();
        Object result = method.invoke(rent, args);
        return result;
    }

    public void setRent(Rent rent) {
        this.rent = rent;
    }
}
