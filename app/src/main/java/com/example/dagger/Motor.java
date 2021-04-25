package com.example.dagger;

public class Motor {
    private String motorType;

    public Motor(String motorType) {
        this.motorType = motorType;
    }

    public String getMotorType() {
        return ("Motor:" + motorType);
    }

}
