package com.strategy;

public class PersonalDiscountedFee implements Dues {

    @Override
    public double getFee(double dues) {
        return dues*0.9;
    }
}
