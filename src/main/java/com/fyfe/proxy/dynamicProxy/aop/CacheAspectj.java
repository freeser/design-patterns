package com.fyfe.proxy.dynamicProxy.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class CacheAspectj {
    @Pointcut("execution(* com.fyfe.proxy.dynamicProxy.aop.DatabaseDataQuery.query(..))")
    public void pointcut() {}

    @Around("pointcut()")
    public String around(ProceedingJoinPoint joinPoint) {
        // 1、查询命中，返回缓存
        Object[] args = joinPoint.getArgs();
        String key = args[0].toString();
        String result = Cache.get(key);
        if (result != null) {
            System.out.println("数据从缓存中读取");
            return result;
        }
        // 未命中则去数据库查询，实际上是调用被代理bean的方法
       try {
           result =  joinPoint.proceed().toString();
           // 如果查询有结果，进行缓存
           Cache.put(key, result);
       } catch (Throwable e) {
           throw new RuntimeException(e);
       }
       return result;

    }
}
