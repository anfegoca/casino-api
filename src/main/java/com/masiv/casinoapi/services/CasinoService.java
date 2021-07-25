package com.masiv.casinoapi.services;

import java.util.List;
import java.util.UUID;

import com.masiv.casinoapi.entities.Bet;
import com.masiv.casinoapi.entities.Bill;
import com.masiv.casinoapi.entities.Roulette;
import com.masiv.casinoapi.exeptions.CasinoException;

public interface CasinoService {
    UUID createRoulette() throws CasinoException;
    void openRoulette(UUID id) throws CasinoException;
    void bet(UUID id, Bet bet) throws CasinoException;
    List<Bill> closeRoulette(UUID id) throws CasinoException;
    List<Roulette> getRoulettes() throws CasinoException;
}
