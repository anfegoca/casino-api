package com.masiv.casinoapi.entities;



public class BetColor extends Bet{
    private String color;
    public BetColor(String userId, double value, String color) {
        super(userId, value);
        this.color=color;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    } 
    
}
