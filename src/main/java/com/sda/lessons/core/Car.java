package com.sda.lessons.core;

public class Car {
    private Wheel[] wheels;
    private Make make;
    private int maxSpeed;
    private String colour;

    public Car(Wheel[] wheels, Make make, int maxSpeed, String colour) {
        this.wheels = wheels;
        this.make = make;
        this.maxSpeed = maxSpeed;
        this.colour = colour;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public Make getMake() {
        return make;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
