package com.org.training.wentongwu.springboot.demo;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;
public class AnimalCollection {
    private List<Animal> animalCollection = new ArrayList<>();

    public AnimalCollection(){
        this.animalCollection.add(new Cat("Tom",100,true,true,10));
        this.animalCollection.add(new Bat("Vamp",100,true,true));
        this.animalCollection.add(new FlyingRat("Rat",20));
        this.animalCollection.add(new Penguin("Peng",30));
    }

    public List<Animal> getAnimalCollection(){
        return this.animalCollection;
    }
    public void addAnimalCollection(Animal animal){
        this.animalCollection.add(animal);
    }
    public String toString(){
        String json = new Gson().toJson(animalCollection);
        return json;
    }
}
