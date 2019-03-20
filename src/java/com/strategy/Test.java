package com.strategy;

public class Test {

    public static void main(String[] args) {

        Dues dues = new PersonalFee();
        System.out.println("个人会员应交会费："+dues.getFee(20));
        dues = new PersonalDiscountedFee();
        System.out.println("打九折后，个人会员应交会费："+dues.getFee(20));


        dues = new UnitDues();
        System.out.println("单位会员应交会费："+dues.getFee(500));

        dues = new UnitDuesDiscounted();
        System.out.println("打五折后，单位会员应交会费："+dues.getFee(500));

    }
}
