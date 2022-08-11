package com.org.training.wentongwu.springboot.demo;

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
}
