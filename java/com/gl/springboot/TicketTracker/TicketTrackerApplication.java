package com.gl.springboot.TicketTracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication (exclude = {DataSourceAutoConfiguration.class })
@EntityScan( basePackages = {"com.gl.springboot.TicketTracker.Entity"} )
public class TicketTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketTrackerApplication.class, args);
	}

}
