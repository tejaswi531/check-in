package com.flightcheckin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//@EnableEurekaClient
@EnableSwagger2
public class FlightCheckinApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightCheckinApplication.class, args);
	}

}
