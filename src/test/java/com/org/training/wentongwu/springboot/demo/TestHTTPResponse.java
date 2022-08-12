package com.org.training.wentongwu.springboot.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TestHTTPResponse {
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void test_my_Response() {
        String json = "[{\"Damagepower\":10,\"hair\":true,\"isMale\":true,\"health\":100,\"isAlive\":true,\"name\":\"Tom\"},{\"hair\":true,\"isMale\":true,\"health\":100,\"isAlive\":true,\"name\":\"Vamp\"},{\"health\":20,\"isAlive\":true,\"name\":\"Rat\"},{\"health\":30,\"isAlive\":true,\"name\":\"Peng\"}]";
        assertThat(restTemplate.getForObject("http://localhost:" + port + "/customRoute",
                String.class)).contains(json);
    }
}
