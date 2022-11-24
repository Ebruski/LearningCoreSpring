package com.ebruski.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
public class LuvAopExpressions {

    @Pointcut("execution(* com.ebruski.aopdemo.dao.*.*(..))")
    public void forDaoPackage() {
    }

    // create pointcut for getter methods
    @Pointcut("execution(* com.ebruski.aopdemo.dao.*.get*(..))")
    public void getter() {
    }

    // create pointcut for setter methods
    @Pointcut("execution(* com.ebruski.aopdemo.dao.*.set*(..))")
    public void setter() {
    }

    // create pointcut: include package ... exclude getter/setter
    @Pointcut("forDaoPackage() && !(getter() || setter())")
    public void forDaoPackageNoGetterSetter() {
    }

}

