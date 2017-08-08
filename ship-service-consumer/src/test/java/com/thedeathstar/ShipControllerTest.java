package com.thedeathstar;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.MOCK)
@AutoConfigureStubRunner(workOffline = true, ids = "com.thedeathstar:ship-service:+:stubs:8090")
public class ShipControllerTest  {


    @Test public void SimpleTestToEnsureTheStubIsInitialized() throws Exception {

        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:8090/ships", String.class);

        Assert.assertTrue(response.getStatusCode().equals(HttpStatus.OK));
        Assert.assertTrue(response.getBody().toString().equals("deathstar"));
    }

}


