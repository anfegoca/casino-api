package com.masiv.casinoapi.entities;
import com.masiv.casinoapi.services.factories.BillFactory;
public class BetNumber extends Bet{
    private Long number;
    public BetNumber(String userId, double value, long number) {
        super(userId, value);
        this.number=number;
    }
    @Override
    public Bill collect(long number) {
        double gain = this.number == number ? value * 5 : 0;  
        
        return BillFactory.getInstance().createBill(userId, gain);
    }
    public long getNumber() {

        return number;
    }
    public void setNumber(long number) {
        this.number = number;
    }
}