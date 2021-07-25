package com.masiv.casinoapi.services.factories;

import com.masiv.casinoapi.entities.Bet;
import com.masiv.casinoapi.entities.BetNumber;
import com.masiv.casinoapi.exeptions.CasinoException;

public class BetFactory {
    private static class helper {
        private static final BetFactory INSTANCE = new BetFactory();
    }
    public static BetFactory getInstance() {

        return BetFactory.helper.INSTANCE;
    }
    public Bet createBet(String userId, double value, long number) throws CasinoException {
        if(value < 0 || value > 10000){
            throw new CasinoException(CasinoException.INVALID_VALUE);
        }else if(number < 0 || number > 36){
            throw new CasinoException(CasinoException.INVALID_NUMBER);
        }else{
            
            return new BetNumber(userId, value, number);
        }
    }
}
