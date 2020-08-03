package com.tts.weatherapp.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String zipCode;

    public String getZipCode(){
        return zipCode;
    }

    public void setZipCode(String zipCode){
        this.zipCode = zipCode;
    }

    public Request(){

    }
}