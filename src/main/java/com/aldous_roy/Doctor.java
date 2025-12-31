package com.aldous_roy;

import org.springframework.stereotype.Component;

@Component
public class Doctor implements Staff {

    public void assist(){
        System.out.println("Doctor assist");
    }

}
