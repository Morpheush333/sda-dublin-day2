package com.sda.lessons.audi;

import com.sda.lessons.core.*;

public class AudiCarFactory extends CarFactory {

    public Car build(String model) {
        if (model.equals("RS4")) {
            Wheel[] wheels = {
                    new Wheel(18, TyreTypes.WINTER),
                    new Wheel(18, TyreTypes.WINTER),
                    new Wheel(18, TyreTypes.WINTER),
                    new Wheel(18, TyreTypes.WINTER)
            };
            Car rs4 = new Car(wheels, Make.AUDI, 15, "Blue");
            return rs4;
        } else {
            System.out.println("Nie ma takiego modelu i już");
            return null;
        }
    }
}
