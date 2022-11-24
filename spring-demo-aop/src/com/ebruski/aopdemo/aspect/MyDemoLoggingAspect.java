package com.ebruski.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

    // this is where we add all of our related advices for logging

    // let's start with an @Before advice

//    @Before("execution(public void addAccount())") // applies to any addAccount() method in the app
//    @Before("execution(public void com.ebruski.aopdemo.dao.AccountDAO.addAccount())") // applies to only one specific method
//    @Before("execution(public void add*())") // applies to any method that name begins with add and have a return type of void
//    @Before("execution(* add*())") // applies to any method that name begins with add and have any return type
//    @Before("execution(* add*(com.ebruski.aopdemo.Account, ..))") // applies to any method with any that begins with add in a particular class with any number of parameter
//    @Before("execution(* add*(..))")  // applies to any method with any that begins with add and accepts any parameter
    @Before("execution(* com.ebruski.aopdemo.dao.*.*(..))") // applies to methods on a given package with any return type any class name any number of parameters
    public void beforeAddAccountAdvice() {

        System.out.println("\n=====>>> Executing @Before advice on addAccount()");

    }
}
