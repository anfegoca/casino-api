package com.masiv.casinoapi.entities;

import java.io.Serializable;
import java.util.UUID;

import org.springframework.data.redis.core.RedisHash;

@RedisHash("Roulette")
public class Roulette implements Serializable{
    private UUID id;
    private boolean open;

    public Roulette(){
        id = UUID.randomUUID();
        open = false;
    }

    public boolean open(){
        if(open){
            return false;
        }else{
            open = true;
            return open;
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

    
}
