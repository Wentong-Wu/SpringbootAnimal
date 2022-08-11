package com.org.training.wentongwu.springboot.demo;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;
public class AnimalCollection {
    private List<Animal> animalCollection = new ArrayList<>();

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
