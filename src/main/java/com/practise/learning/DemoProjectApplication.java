package com.practise.learning;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.practise.learning.ticketbooking.model.Ticket;
import com.practise.learning.ticketbooking.service.TicketService;

@SpringBootApplication
public class DemoProjectApplication implements CommandLineRunner {
	
	@Autowired
	private TicketService ticketService;

	public static void main(String[] args) {
		SpringApplication.run(DemoProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Ticket ticket = new Ticket();
		ticket.setTickedId(1);
		ticket.setDestinationStation("GOA");
		ticket.setPassengerName("Ramu");
		ticket.setSourceStation("Hyderabad");
		ticket.setTravelDate(new Date());
		ticket.setEmail("ramu@gmail.com");
		
		ticketService.saveTicket(ticket);
	}

}
