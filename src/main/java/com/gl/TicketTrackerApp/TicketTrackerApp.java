package com.gl.TicketTrackerApp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gl.TicketTrackerApp.Service.*;

///////////////////////////Driver class/////////////////////////////////////

@SpringBootApplication
public class TicketTrackerApp implements CommandLineRunner {
	
	@Autowired
	TicketService serviceImpl;
	
	public static void main(String[] args) {
		SpringApplication.run(TicketTrackerApp.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	}

}
