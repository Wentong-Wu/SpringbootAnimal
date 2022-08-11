package com.org.training.wentongwu.springboot.demo;

public class Bat extends Mammal implements Flying{

    public Bat(String name,int health, boolean hair, boolean isMale){
        super(name,health,hair,isMale);
    }
    public String scream(){
        return "Scream";
    }
    @Override
    public String eat() {
        return "Bat eat";
    }

    @Override
    public String takeOff() {
        return "bat take off";
    }

    @Override
    public String flying() {
        return "bat flying";
    }

    @Override
    public String landing() {
        return "bat landing";
    }
}