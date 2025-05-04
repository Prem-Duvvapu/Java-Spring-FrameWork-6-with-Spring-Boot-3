package com.example.SpringDataRestDemo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PeformanceMonitorAspect {
    private static final Logger LOGGER= LoggerFactory.getLogger(PeformanceMonitorAspect.class);

    @Around("execution(* com.example.SpringDataRestDemo.service.JobService.*(..))")
    public Object monitorTime(ProceedingJoinPoint jp) throws Throwable {
        long startTime=System.currentTimeMillis();

        Object obj=jp.proceed();

        long endTime=System.currentTimeMillis();

        LOGGER.info("Time taken by "+jp.getSignature().getName()+" is: "+(endTime-startTime)+" ms");
        return obj;
    }
}
