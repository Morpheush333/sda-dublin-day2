package com.sda.lessons.bmw;

import com.sda.lessons.core.*;


public class BmwCarFactory extends CarFactory {
    @Override
    public Car build(String model) {
        if (model.equals("X5")) {
            Wheel[] wheels = {
                    new Wheel(14, TyreTypes.SUMMER),
                    new Wheel(14, TyreTypes.SUMMER),
                    new Wheel(14, TyreTypes.SUMMER),
                    new Wheel(14, TyreTypes.SUMMER)
            };
            Car x5 = new Car(wheels, Make.BMW, 300, "Red", null);
            return x5;
        } else {
            System.out.println("Nie ma takiego modelu");
            return null;
        }
    }

    @Override
    public void addSymbol() {
        System.out.println("added bmw");

    }
}
