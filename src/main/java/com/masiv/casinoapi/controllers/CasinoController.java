package com.masiv.casinoapi.controllers;

import com.masiv.casinoapi.entities.ObjectError;
import com.masiv.casinoapi.exeptions.CasinoException;
import com.masiv.casinoapi.services.CasinoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
}
