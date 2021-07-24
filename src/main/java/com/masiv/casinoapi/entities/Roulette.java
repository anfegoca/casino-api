package com.masiv.casinoapi.entities;

import java.io.Serializable;
import java.util.UUID;

import org.springframework.data.redis.core.RedisHash;

@RedisHash("Roulette")
public class Roulette implements Serializable{
    private UUID id;

    public Roulette(){
        id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID uuid) {
        this.id = uuid;
    }
}
