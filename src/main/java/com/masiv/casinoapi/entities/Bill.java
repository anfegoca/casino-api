package com.masiv.casinoapi.entities;
public class Bill {
    private String userId;
    private double gain;
    public Bill(String userId, double gain) {
        this.userId = userId;
        this.gain = gain;
    }
    public String getUserId() {

        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public double getGain() {
        
        return gain;
    }
    public void setGain(double gain) {
        this.gain = gain;
    }
}