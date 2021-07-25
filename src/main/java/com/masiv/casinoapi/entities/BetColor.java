package com.masiv.casinoapi.entities;

import com.masiv.casinoapi.services.factories.BillFactory;

public class BetColor extends Bet{
    private String color;
    public BetColor(String userId, double value, String color) {
        super(userId, value);
        this.color=color;
    }
    @Override
    public Bill collect(long number) {
        double gain = 0;
        if( (number % 2 == 0 && "red".equals(color)) || (number % 2 == 1 && "black".equals(color)) ){
            gain = value * 1.8;
        }

        return BillFactory.getInstance().createBill(userId, gain);
    } 
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    
    
}
