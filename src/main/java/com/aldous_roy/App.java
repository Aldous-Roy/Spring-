package com.aldous_roy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");

        Doctor doctor = context.getBean(Doctor.class);
        Nurse nurse = context.getBean(Nurse.class);
        doctor.assist();
        nurse.assist();
        System.out.println("This is the main class");
    }
}
