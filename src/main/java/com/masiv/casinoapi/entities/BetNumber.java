package com.masiv.casinoapi.entities;

public class BetNumber extends Bet{
    private Long number;
    public BetNumber(String userId, double value, long number) {
        super(userId, value);
        this.number=number;
    }
    public long getNumber() {
        return number;
    }
    public void setNumber(long number) {
        this.number = number;
    }
    
}
