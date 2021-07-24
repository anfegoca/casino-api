package com.masiv.casinoapi.services.impl;

import java.util.UUID;

import com.masiv.casinoapi.entities.Roulette;
import com.masiv.casinoapi.exeptions.CasinoException;
import com.masiv.casinoapi.repositories.RouletteRepository;
import com.masiv.casinoapi.services.CasinoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class CasinoServiceImpl implements CasinoService{

    @Autowired
    RouletteRepository rouletteRepository;
    
    @Override
    public UUID createRoulette() throws CasinoException{
        try{
            Roulette roulette = new Roulette();
            rouletteRepository.save(roulette);
            return roulette.getId();
        }catch(Exception e){
            throw new CasinoException("Roulette could not be created description: "+ e.getMessage());
        }
    
    }
    
}
