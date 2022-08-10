package com.org.training.wentongwu.springboot.demo;

public class Penguin extends Bird {
    public Penguin(String name, int health){
        super(name,health);
    }
    @Override
    public String eat() {
        return "Fishes...";
    }
}
