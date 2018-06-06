package com.service.aspectj;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspectss implements MethodInterceptor{

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


    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        before();
        Object proceed = methodInvocation.proceed();
        after();
        return proceed;
    }
}
