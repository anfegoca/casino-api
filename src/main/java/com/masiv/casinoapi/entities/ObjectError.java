package com.masiv.casinoapi.entities;
public class ObjectError {
    private String error;
    private String error_description; 
    public ObjectError(String error_description){
        this.error="CasinoAPI_exception";
        this.error_description=error_description;
    }
    public ObjectError(){}
    public String getError() {
        
        return error;
    }
    public String getError_description() {
        
        return error_description;
    }
    public void setError(String error) {
        this.error = error;
    }
    public void setError_description(String error_description) {
        this.error_description = error_description;
    }   
}