package com.aldous_roy;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.aldous_roy.ShoppingCart.checkout())")
    public void loggers(){
        System.out.println("loggers");
    }
}
