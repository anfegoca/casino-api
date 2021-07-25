package com.masiv.casinoapi.entities;



public abstract class Bet{
    protected String userId;
    protected double value;

    public Bet(String userId, double value){
        this.userId=userId;
        this.value=value;
    }

    public Bet(){

    }

    public abstract Bill collect(long number);

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    
}