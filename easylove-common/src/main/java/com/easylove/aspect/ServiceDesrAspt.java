package com.easylove.aspect;

import com.easylove.anotation.ServiceDesrAnt;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 2017/2/8 16:29.
 * <p>
 * Email: cheerUpPing@163.com
 * <p>
 * 服务描述切面
 */
@Aspect
@Component
public class ServiceDesrAspt {

    @Pointcut("@annotation(com.easylove.anotation.ServiceDesrAnt)")
    public void serviceDesrCut() {

    }

    /**
     * 这里需要取得userAccessAnnotation,
     * 如果注解是在方法上,可以得到,如果注解在类上则为null
     *
     * @param proceedingJoinPoint
     * @throws Throwable
     */
    @Around(value = "serviceDesrCut()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("around...............");
    }

    @AfterThrowing(value = "serviceDesrCut()",throwing ="e")
    public void afterMethod(JoinPoint joinPoint, Throwable e) {
        System.out.println("after returning...............");
    }

    @Before(value = "serviceDesrCut()")
    public void before(JoinPoint joinPoint) throws Throwable {
        System.out.println("before...............");
    }

    @After(value = "serviceDesrCut()")
    public void after(JoinPoint joinPoint) throws Throwable {
        System.out.println("after...............");
    }


}
