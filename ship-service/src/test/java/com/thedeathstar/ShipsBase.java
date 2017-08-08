package com.thedeathstar;


import com.thedeathstar.controller.ShipController;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public abstract class ShipsBase {

    @InjectMocks
    ShipController shipController;

    @Before
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(shipController);

    }

}