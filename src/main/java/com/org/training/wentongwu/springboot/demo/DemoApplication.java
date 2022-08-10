package com.org.training.wentongwu.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
		return animalCollection.toString();
	}

}
