package com.thedeathstar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Jeremy on 7/23/17.
 */
@SpringBootApplication
@Configuration
public class ShipApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShipApplication.class, args);
    }

}
