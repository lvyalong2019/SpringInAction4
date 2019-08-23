package concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@Aspect
public class Audience {

    /*
    * 常规配置
    */

//    @Before("execution(** concert.Performance.perform(..))")
//    public void silenceCellPhones() {
//        System.out.println("Silencing cell phones");
//    }
//
//    @Before("execution(** concert.Performance.perform(..))")
//    public void takeSeats() {
//        System.out.println("Taking seats");
//    }
//
//    @AfterReturning("execution(** concert.Performance.perform(..))")
//    public void applause() {
//        System.out.println("CLAP CLAP CLAP!!!");
//    }
//
//    @AfterThrowing("execution(** concert.Performance.perform(..))")
//    public void demandRefund() {
//        System.out.println("Deamand a refund");
//    }

    /*
     * 通过@Pointcut注解声明频繁使用的切点表达式
     */
//    @Pointcut("execution(** concert.Performance.perform(..))")
//    public void performance(){}
//
//    @Before("performance()")
//    public void silenceCellPhones() {
//        System.out.println("Silencing cell phones");
//    }
//
//    @Before("performance()")
//    public void takeSeats() {
//        System.out.println("Taking seats");
//    }
//
//    @AfterReturning("performance()")
//    public void applause() {
//        System.out.println("CLAP CLAP CLAP!!!");
//    }
//
//    @AfterThrowing("performance()")
//    public void demandRefund() {
//        System.out.println("Deamand a refund");
//    }

    /*
     * 使用环绕通知实现Audience切面
     */
    @Pointcut("execution(** concert.Performance.perform(..))")
    public void performance(){}

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint jp) {
        try {
            System.out.println("Silencing cell phones");
            System.out.println("Taking seats");
            jp.proceed();
            System.out.println("CLAP CLAP CLAP!!!");
        }catch (Throwable e) {
            System.out.println("Deamand a refund");
        }
    }

}
