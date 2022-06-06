package com.company;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Price price1 = new Price(1,"GBP/USD",1.2499, 1.2596);
        Price price2 = new Price(2,"EUR/JPY", 119.61,119.91);

        ArrayList<Price> priceFeed1 = new ArrayList<>();
        priceFeed1.add(price1);
        priceFeed1.add(price2);

        CommissionService test1 = new CommissionService();
        test1.applyBidCommission(priceFeed1);
        test1.applyAskCommission(priceFeed1);
        System.out.println(priceFeed1);



    }

}
