package com.org.training.wentongwu.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {
	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}
	@CrossOrigin("http://localhost:3000")
	@GetMapping("/customRoute")
	public String myResponse(){
		AnimalCollection animalCollection = new AnimalCollection();
		animalCollection.addAnimalCollection(new Cat("Tom",100,true,true,10));
		animalCollection.addAnimalCollection(new Bat("Vamp",100,true,true));
		animalCollection.addAnimalCollection(new FlyingRat("Rat",20));
		animalCollection.addAnimalCollection(new Penguin("Peng",30));
		return animalCollection.toString();
	}
}
