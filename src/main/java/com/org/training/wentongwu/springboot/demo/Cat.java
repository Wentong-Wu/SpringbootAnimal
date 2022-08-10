package com.org.training.wentongwu.springboot.demo;

public class Cat extends Mammal {
    private int Damagepower;
    private float hunger = 100;
    public Cat(String name,int health, boolean hair,boolean isMale, int damagepower)
    {
        super(name,health,hair,isMale);
        this.Damagepower = damagepower;
    }

    public int getDamagePower() {
        return Damagepower;
    }

    public void setDamagePower(int power) {
        this.Damagepower = power;
    }

    @Override
    public String eat() {
        return "Milk...";
    }

    public void Attack(Animal o)
    {
        o.setHealth(o.getHealth()-getDamagePower());
    }
    public String kill(){
        return "Sus...";
    }
}