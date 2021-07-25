package com.masiv.casinoapi.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
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
    private Long spin() {
        Random random = new Random();
        int winningNumber = random.nextInt(36) + 1;

        return (long)winningNumber;
    }

    public List<Bill> close() {
        if (!open) {

            return null;
        } else {
            open=false;
            List<Bill> bills = new ArrayList<>();
            Long winningNumber = spin();
            for (Bet b : bets) {
                bills.add(b.collect(winningNumber));
            }
            bets.clear();

            return bills;
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
