package com.service.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {

    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("执行");
        before();
        Object proceed = proceedingJoinPoint.proceed();
        after();

        return proceed;
    }

    public void before(){
        System.out.println("前方法");
    }

    public void after(){
        System.out.println("前方法");
    }
}
