package com.masiv.casinoapi.services.factories;

import com.masiv.casinoapi.entities.Bill;

public class BillFactory {
    private static class helper {
        private static final BillFactory INSTANCE = new BillFactory();
    }
    public static BillFactory getInstance() {

        return BillFactory.helper.INSTANCE;
    }
    public Bill createBill(String userId, double gain){
        
        return new Bill(userId, gain); 
    }
}
