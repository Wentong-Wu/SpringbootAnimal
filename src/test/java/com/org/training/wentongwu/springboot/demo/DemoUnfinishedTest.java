package com.org.training.wentongwu.springboot.demo;

import io.cucumber.java.zh_tw.並且;
import io.cucumber.java.zh_tw.但是;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class DemoUnfinishedTest {
    @Test
    public void test_eat(){
        Cat cat = new Cat("Tom",100,true,true,10);
        assertEquals("cat eat",cat.eat());
    }
    @Test
    public void test_kill(){
        Cat cat = new Cat("Tom",100,true,true,10);
        assertEquals("cat kill",cat.kill());
    }
    @Test
    public void test_animal_move(){
        Cat cat = new Cat("Tom",100,true,true,10);
        assertEquals("Move",cat.Move());
    }
    @Test
    public void test_animal_sleep(){
        Cat cat = new Cat("Tom",100,true,true,10);
        assertEquals("Sleep",cat.Sleep());
    }
    @Test
    public void test_animal_poop(){
        Cat cat = new Cat("Tom",100,true,true,10);
        assertEquals("Poop",cat.Poop());
    }
    @Test
    public void test_bat_scream(){
        Bat bat = new Bat("Vamp",100,true,true);
        assertEquals("Scream",bat.scream());
    }
    @Test
    public void test_bat_eat(){
        Bat bat = new Bat("Vamp",100,true,true);
        assertEquals("Bat eat",bat.eat());
    }
    @Test
    public void test_bat_takeOff(){
        Bat bat = new Bat("Vamp",100,true,true);
        assertEquals("bat take off", bat.takeOff());
    }
    @Test
    public void test_bat_flying(){
        Bat bat = new Bat("Vamp",100,true,true);
        assertEquals("bat flying",bat.flying());
    }
    @Test
    public void test_bat_landing(){
        Bat bat = new Bat("Vamp",100,true,true);
        assertEquals("bat landing",bat.landing());
    }
}
