package com.sda.lessons.core;

import com.sda.lessons.core.TyreTypes;

public class Wheel {
    private int size;
    private TyreTypes type;

    public Wheel(int size, TyreTypes type) {
        this.size = size;
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public TyreTypes getType() {
        return type;
    }

    public void setType(TyreTypes type) {
        this.type = type;
    }
}
