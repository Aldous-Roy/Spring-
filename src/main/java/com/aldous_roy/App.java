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
//        to access the nurse from the staff interface
//        Staff staff = context.getBean(Nurse.class);
//        to access the doctor from the staff inheritance as they both are linked to the same inheritance
        Staff staff=context.getBean(Doctor.class);
        staff.assist();
    }
}
