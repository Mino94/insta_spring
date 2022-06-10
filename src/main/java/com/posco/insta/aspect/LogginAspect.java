package com.posco.insta.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
// 컴포넌트 메모리 상에 올려놓고 사용한다
public class LogginAspect {
    // service.*.까지 타고 들어가서 find*이라는 함수 찾아서 확인
//    @Before("execution(* com.posco.insta.user.service.*.find*(..))")
//    public void loggerBefore(){
////        System.out.println("------------before --------------");
//        log.info("----- before -------");
//    }
//    @After("execution(* com.posco.insta.user.service.*.find*(..))")
//    public void loggerAfter(){
////        System.out.println("------------after ---------------");
//        log.info("----- after -------");
//    }
    @Around("execution(* com.posco.insta.user.service.*.*(..))")
    public Object loggerAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long beforeTimeMillis = System.currentTimeMillis();
        log.info("start : " + beforeTimeMillis);
        Object result = proceedingJoinPoint.proceed();
        long afterTimeMills = System.currentTimeMillis();
        log.info("before : " + afterTimeMills +" 시간차 : " + (afterTimeMills-beforeTimeMillis));
        return result;
    }
}
