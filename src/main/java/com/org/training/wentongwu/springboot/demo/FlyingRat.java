package com.org.training.wentongwu.springboot.demo;

public class FlyingRat extends Bird implements Flying{

    public FlyingRat(String name, int health){
        super(name,health);
    }
    @Override
    public String eat() {
        return "flying rat eat";
    }
    @Override
    public String takeOff() {
        return "flying rat take off";
    }

    @Override
    public String flying() {
        return "flying rat flying";
    }

    @Override
    public String landing() {
        return "flying rat landing";
    }
}
