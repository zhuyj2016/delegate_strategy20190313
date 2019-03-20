package com.strategy;

public class PersonalFee implements Dues{


    @Override
    public double getFee(double dues) {
        return dues;
    }
}
