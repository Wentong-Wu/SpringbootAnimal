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
}
