package com.org.training.wentongwu.springboot.demo;

public abstract class Animal {
    private int health;
    private boolean isAlive = true;
    private String name;
    protected Animal(String name, int health)
    {
        super();
        this.name = name;
        this.health = health;
    }
    public abstract String eat();
    public abstract String breath();
    public abstract String breed();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String Move() {
        return "Zoom..";
    }
    public String Sleep(){
        return "Zzz..";
    }
    public String Poop(){
        return "Stinky..";
    }
    public void Died(){
        this.isAlive = false;
    }
    public boolean getIsAlive(){
        return isAlive;
    }
}