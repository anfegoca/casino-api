package com.masiv.casinoapi.services.impl;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.masiv.casinoapi.entities.Bet;
import com.masiv.casinoapi.entities.Bill;
import com.masiv.casinoapi.entities.Roulette;
import com.masiv.casinoapi.exeptions.CasinoException;
import com.masiv.casinoapi.repositories.RouletteRepository;
import com.masiv.casinoapi.services.CasinoService;
import com.masiv.casinoapi.services.factories.RouletteFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class CasinoServiceImpl implements CasinoService{
    @Autowired
    RouletteRepository rouletteRepository;
    @Override
    public UUID createRoulette() throws CasinoException{
        try{
            Roulette roulette = RouletteFactory.getInstance().createRoulette();
            rouletteRepository.save(roulette);

            return roulette.getId();
        }catch(Exception e){
            throw new CasinoException("Roulette could not be created, description: "+ e.getMessage());
        }
    }
    @Override
    public void openRoulette(UUID id) throws CasinoException {
        try{
            Roulette roulette = rouletteRepository.findById(id).orElseThrow();
            if( !roulette.open()){
                throw new CasinoException(CasinoException.ROULETTE_ALREADY_OPEN);
            }
            rouletteRepository.save(roulette);
        }catch(Exception e){
            throw new CasinoException("Roulette could not be opened, description: "+e.getMessage());
        }
    }
    @Override
    public void bet(UUID id, Bet bet) throws CasinoException {
        try{
            Roulette roulette = rouletteRepository.findById(id).orElseThrow();
            if(!roulette.bet(bet)){
                throw new CasinoException(CasinoException.ROULETTE_CLOSE);
            }
            rouletteRepository.save(roulette);
        }catch(Exception e){
            throw new CasinoException("The bet could not be placed, description: "+e.getMessage());
        }
        
    }
    @Override
    public List<Bill> closeRoulette(UUID id) throws CasinoException {
        try{
            Roulette roulette = rouletteRepository.findById(id).orElseThrow();
            List<Bill> bills = roulette.close();
            rouletteRepository.save(roulette);

            return bills;
        }catch(Exception e){
            throw new CasinoException("There was an error closing the roulette, description: "+e.getMessage());
        }  
    }
    @Override
    public List<Roulette> getRoulettes() throws CasinoException {
        try{
            List<Roulette> roulettes = new ArrayList<>();
            for(Roulette r: rouletteRepository.findAll()){
                roulettes.add(r);
            }
    
            return roulettes;
        }catch(Exception e){
            throw new CasinoException("There was an error getting the roulettes, description: "+e.getMessage());
        }
    }
}