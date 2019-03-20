package com.strategy;

public class UnitDuesDiscounted implements Dues {

    @Override
    public double getFee(double dues) {
        return dues*0.5;
    }
}
