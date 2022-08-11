package com.org.training.wentongwu.springboot.demo;

import io.cucumber.java.en_scouse.An;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {

	@Test
	protected void test_get_cat_name(){
		Cat testCat = new Cat("Timmy",100, true, true,10);
		assertEquals("Timmy",testCat.getName(),"getName method failed");
	}

	@Test
	protected void test_set_cat_name(){
		Cat testCat = new Cat("Timmy",100, true, true,10);
		testCat.setName("Tommy");
		assertEquals("Tommy",testCat.getName(),"setName method failed");
	}
	@Test
	protected void test_set_hair(){
		Cat testCat = new Cat("Timmy",100, true, true,10);
		testCat.setHair(false);
		assertEquals(false,testCat.isHair());
	}
	@Test
	protected void test_is_hair(){
		Cat testCat = new Cat("Timmy",100, true, true,10);
		assertEquals(true,testCat.isHair());
	}

	@Test
	protected void test_set_cat_power(){
		Cat testCat = new Cat("Timmy",100, true, true,10);
		testCat.setDamagePower(20);
		assertEquals(20,testCat.getDamagePower());
	}

	@Test
	protected void test_get_cat_power(){
		Cat testCat = new Cat("Timmy",100, true, true,10);
		assertEquals(10,testCat.getDamagePower());
	}

	@Test
	protected void test_attack(){
		Cat testCat = new Cat("Tim",100,true,true,10);
		Bat testBat = new Bat("Vlad",100,true,true);
		testBat.setHealth(100);
		testCat.Attack(testBat);
		assertEquals(90,testBat.getHealth(),"Attack not working");
	}
	@Test
	protected void test_isAlive(){
		Bat testBat = new Bat("vamp",100,true,true);
		assertEquals(true,testBat.getIsAlive());
	}
	@Test
	protected void test_die(){
		Bat testBat = new Bat("vamp",100,true,true);
		testBat.Died();
		assertEquals(false,testBat.getIsAlive());
	}
	@Test
	protected void test_isMale(){
		Bat testBat = new Bat("vamp",100,true,true);
		assertEquals(true,testBat.isMale());
	}
	@Test
	protected void test_set_isMale(){
		Bat testBat = new Bat("vamp",100,true,true);
		testBat.setMale(false);
		assertEquals(false,testBat.isMale());
	}
	@Test
	protected void test_get_health(){
		Bat testBat = new Bat("vamp",100,true,true);
		assertEquals(100,testBat.getHealth());
	}
	@Test
	protected void test_set_health(){
		Bat testBat = new Bat("vamp",100,true,true);
		testBat.setHealth(50);
		assertEquals(50,testBat.getHealth());
	}
	@Test
	protected void test_get_AnimalCollection(){
		AnimalCollection animalCollection = new AnimalCollection();
		List<Animal> animallength = animalCollection.getAnimalCollection();
		assertEquals(4,animallength.size());
	}
	@Test
	protected void test_add_animalCollection(){
		AnimalCollection animalCollection = new AnimalCollection();
		animalCollection.addAnimalCollection(new Cat("Tim",50,true,true,30));
		List<Animal> animalList = animalCollection.getAnimalCollection();
		assertEquals(5,animalList.size());
	}
}
