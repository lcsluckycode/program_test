package com.lcs.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect  //标注这个类是一个切面
public class AnnotationPointCut {

    @Before("execution(* com.lcs.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("===方法执行前===");
    }

    @Around("execution(* com.lcs.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("---环绕前---");
        Signature signature = jp.getSignature();
        System.out.println(signature);

        //执行方法
        Object proceed = jp.proceed();
        System.out.println("---环绕后---");
        System.out.println(proceed);
    }
}
