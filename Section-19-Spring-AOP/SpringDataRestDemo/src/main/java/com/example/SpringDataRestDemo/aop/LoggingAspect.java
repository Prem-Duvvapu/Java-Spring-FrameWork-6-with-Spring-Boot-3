package com.example.SpringDataRestDemo.aop;

import lombok.extern.java.Log;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    private static final Logger LOGGER= LoggerFactory.getLogger(LoggingAspect.class);

    //return-type fully-qualified-class-name.method-name(args)

    @Before("execution(* com.example.SpringDataRestDemo.service.JobService.*(..))")
    public void logMethodCall(JoinPoint jp) {
        LOGGER.info("Method called "+jp.getSignature().getName());
    }

    @After("execution(* com.example.SpringDataRestDemo.service.JobService.*(..))")
    public void logMethodExecuted(JoinPoint jp) {
        LOGGER.info("Method executed "+jp.getSignature().getName());
    }

    @AfterThrowing("execution(* com.example.SpringDataRestDemo.service.JobService.*(..))")
    public void logMethodCrash(JoinPoint jp) {
        LOGGER.info("Method has some issues "+jp.getSignature().getName());
    }

    @AfterReturning("execution(* com.example.SpringDataRestDemo.service.JobService.*(..))")
    public void logMethodExecutedSuccessfuly(JoinPoint jp) {
        LOGGER.info("Method executed successfully"+jp.getSignature().getName());
    }
}
