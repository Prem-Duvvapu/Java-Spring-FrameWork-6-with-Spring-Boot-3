package com.example.SpringDataRestDemo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ValidationAspect {

    private static final Logger LOGGER= LoggerFactory.getLogger(LoggingAspect.class);

    @Around("execution(* com.example.SpringDataRestDemo.service.JobService.getJob(..)) && args(postId)")
    public Object validateAndUpdate(ProceedingJoinPoint jp, int postId) throws Throwable {
        if (postId<0) {
            LOGGER.info("PostId is negative, updating it ");
            postId = -1 * postId;
            LOGGER.info("PostId new value is: "+postId);
        }

        Object obj=jp.proceed(new Object[]{postId});

        return obj;
    }


}
