package com.practise.learning.ticketbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practise.learning.ticketbooking.model.Ticket;
import com.practise.learning.ticketbooking.service.TicketService;

@RestController
@RequestMapping(value="/tickets")
public class TicketController {
	
	@Autowired
	TicketService ticketService;
	
	@GetMapping("/all/tickets")
	public Iterable<Ticket> getAllTickets(){
		
		return ticketService.getAllTickets();
	}
	
	@PostMapping("/create")
	public Ticket createTicket(@RequestBody Ticket ticketCreate) {
		return ticketService.saveTicket(ticketCreate);
	}
	
	@GetMapping("/ticket/{ticketId}")
	public Ticket getTicketById(@PathVariable("ticketId") Integer ticketId) {
		return ticketService.getTicketById(ticketId);
	}
	
	@PutMapping("/modifyTicket/{ticketId}/{newEmail}")
	public Ticket updateTicket(@PathVariable("ticketId") Integer ticketId,
			@PathVariable("newEmail") String emailId) {
		return ticketService.updateTicketEmail(ticketId, emailId);
	}
	
	@DeleteMapping("/removeTicket/{ticketId}")
	public void deleteTicket(@PathVariable("ticketId") Integer ticketId) {
		ticketService.deleteTicket(ticketId);
	}
}
