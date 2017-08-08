package com.thedeathstar.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ShipController {

public ShipController(){

}

    @RequestMapping(value = "/ships", method = RequestMethod.GET)
    public ResponseEntity<String> GetShips(){

        //Oh yea, the controller is that simple
       return new ResponseEntity<String>("deathstar", HttpStatus.OK);

    }
}

