package com.org.training.wentongwu.springboot.demo;

public abstract class Bird extends Animal{
    public Bird(String name, int health)
    {
        super(name,health);
    }
    @Override
    public String breath() {
        return "bird breath";
    }
    @Override
    public String breed(){
        return "bird breed";
    }
}
