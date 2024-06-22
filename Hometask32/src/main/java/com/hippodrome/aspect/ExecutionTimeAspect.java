package com.hippodrome.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExecutionTimeAspect {

    @Around("@annotation(com.hippodrome.aspect.ExecutionTime)")
    public Object calculateExecutionTime (ProceedingJoinPoint joinPoint) {
        long startTime = System.nanoTime();
        Object result = null;
        try {
            result = joinPoint.proceed();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        long executionTime = System.nanoTime() - startTime;
        String name = joinPoint.getSignature().getName();
        System.out.println(name + ": " + executionTime + " nanoseconds");
        return result;
    }
}
