package com.masiv.casinoapi.controllers;

import java.util.UUID;

import com.masiv.casinoapi.entities.ObjectError;
import com.masiv.casinoapi.exeptions.CasinoException;
import com.masiv.casinoapi.services.CasinoService;
import java.util.Collections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/CasinoAPI")
public class CasinoController {

    @Autowired
    CasinoService casinoService;

    @RequestMapping(path = "/createRoulette", method = RequestMethod.POST)
    public ResponseEntity<?> createRoulette(){
        try{

            return new ResponseEntity<>(casinoService.createRoulette(), HttpStatus.ACCEPTED);
        }catch(CasinoException ex){
            
            return new ResponseEntity<>(new ObjectError(ex.getMessage()), HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(path = "/openRoulette/{id}", method = RequestMethod.POST)
    public ResponseEntity<?> openRoulette(@PathVariable("id") UUID id){
        try{
            casinoService.openRoulette(id);
            return ResponseEntity.status(HttpStatus.CREATED).body(Collections.singletonMap("Response", "Success"));
        }catch(CasinoException ex){
            return new ResponseEntity<>(new ObjectError(ex.getMessage()), HttpStatus.NOT_FOUND);
        }
    }
}