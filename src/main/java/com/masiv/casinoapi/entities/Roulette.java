package com.masiv.casinoapi.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.data.redis.core.RedisHash;

@RedisHash("Roulette")
public class Roulette implements Serializable{
    private UUID id;
    private boolean open;
    private List<Bet> bets;

    public Roulette(){
        id = UUID.randomUUID();
        open = false;
        bets = new ArrayList<>();
    }

    public boolean open(){
        if(open){
            return false;
        }else{
            open = true;
            return open;
        }
    }
    public boolean bet(Bet bet) {
        if (open) {

            return bets.add(bet);
        } else {

            return false;
        }
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID uuid) {
        this.id = uuid;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public List<Bet> getBets() {
        return bets;
    }

    public void setBets(List<Bet> bets) {
        this.bets = bets;
    }

    

    
}
