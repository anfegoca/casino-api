package com.masiv.casinoapi.services.factories;

import com.masiv.casinoapi.entities.Roulette;

public class RouletteFactory {
    private static class helper {
        private static final RouletteFactory INSTANCE = new RouletteFactory();
    }
    public static RouletteFactory getInstance() {

        return helper.INSTANCE;
    }
    public Roulette createRoulette(){

        return new Roulette();
    }
}