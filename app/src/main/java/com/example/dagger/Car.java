package com.example.dagger;

public class Car {
    private Motor motor;

    public Car(Motor motor) {
        this.motor = motor;
    }

    public String getMotor() {
        return ("Car with "+ motor.getMotorType());
    }

}
