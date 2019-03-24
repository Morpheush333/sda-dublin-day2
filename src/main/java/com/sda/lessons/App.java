package com.sda.lessons;

import com.sda.lessons.audi.AudiCarFactory;
import com.sda.lessons.bmw.BmwCarFactory;
import com.sda.lessons.core.Car;
import com.sda.lessons.core.CarFactory;


public class App {
    public static void main(String[] args) {
        CarFactory bmwCarFactory = new BmwCarFactory();
        CarFactory audiCarFactory = new AudiCarFactory();

        Car bmw = bmwCarFactory.build("X5");
        Car audi = audiCarFactory.build("RS4");

        if (bmw.getMaxSpeed() < audi.getMaxSpeed()) {
            System.out.println("Audi jest szybsze");
        } else if (bmw.getMaxSpeed() > audi.getMaxSpeed()) {
            System.out.println("Bmw jest szybsze");
        } else {
            System.out.println("Mają taką samą predkość");
        }
    }
}
