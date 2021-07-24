package com.masiv.casinoapi.repositories;

import java.util.UUID;

import com.masiv.casinoapi.entities.Roulette;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouletteRepository extends CrudRepository<Roulette, UUID>{}
