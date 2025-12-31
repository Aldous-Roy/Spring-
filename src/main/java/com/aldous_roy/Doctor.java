package com.aldous_roy;

public class Doctor implements Staff {

    private String qualification;

    public Doctor(String qualification) {
        this.qualification = qualification;
    }

    public void assist(){
        System.out.println("Doctor assist");
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualitfication) {
        this.qualification = qualitfication;
    }
}
