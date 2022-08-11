package com.org.training.wentongwu.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class DemoApplication {
	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}
	public static AnimalCollection animalCollection = new AnimalCollection();
	@CrossOrigin("http://localhost:3000")
	@GetMapping("/customRoute")
	@ResponseBody
	public String myResponse(){
		return animalCollection.toString();
	}

	@PutMapping("/add")
	@ResponseBody
	public void change(@RequestParam String name, @RequestParam int health){
		animalCollection.addAnimalCollection(new FlyingRat(name,health));
	}
}
