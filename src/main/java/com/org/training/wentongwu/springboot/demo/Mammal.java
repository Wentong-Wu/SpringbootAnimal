package com.org.training.wentongwu.springboot.demo;

import java.lang.reflect.Constructor;

public abstract class Mammal extends Animal{

    private boolean hair = true;
    private boolean isMale;

    public Mammal(String name,int health ,boolean hair, boolean isMale)
    {
        super(name,health);
        this.hair = hair;
        this.isMale = isMale;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public boolean isHair() {
        return hair;
    }

    public void setHair(boolean hair) {
        this.hair = hair;
    }

    @Override
    public String breath() {
        return "Inhale...";
    }

    @Override
    public String breed(){
        return "Breeding";
    }
}
