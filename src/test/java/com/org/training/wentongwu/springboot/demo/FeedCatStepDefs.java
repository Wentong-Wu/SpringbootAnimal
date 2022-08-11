package com.org.training.wentongwu.springboot.demo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IsTomHealth100{
    static String IsTomHealth100(int health){
        return health == 100 ? "Yes" : "No";
    }
}
public class FeedCatStepDefs {
    private String actualAnswer;
    private int health;


    @Given("Tom's health is 100")
    public void tom_s_health_is_100() {
        Cat Tom = new Cat("Tom",100,true,true,10);
        health = Tom.getHealth();
    }
    @Given("Tom's health is not 100")
    public void tom_s_health_is_not_100(){
        Cat Tom = new Cat("Tom",50,true,true,10);
        health = Tom.getHealth();
    }
    @When("I ask if Tom has 100 health")
    public void i_ask_if_tom_has_100_health() {
        actualAnswer = IsTomHealth100.IsTomHealth100(health);
    }
    @Then("I should be told {string}")
    public void i_should_be_told(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }

}