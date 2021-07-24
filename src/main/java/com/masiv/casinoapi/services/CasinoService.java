package com.masiv.casinoapi.services;

import java.util.UUID;

import com.masiv.casinoapi.exeptions.CasinoException;

public interface CasinoService {
    UUID createRoulette() throws CasinoException;
    
}
