package com.gahlot.dagger2.car;

public class Wheels {
    // thjis nis a thrid party library we cannot make changes

    private Rims rims;
    private Tires tires;

    public Wheels(Rims rims, Tires tires) {
        this.rims = rims;
        this.tires = tires;
    }
}
