package com.practise.learning.ticketbooking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practise.learning.ticketbooking.model.Ticket;
import com.practise.learning.ticketbooking.repository.TicketingRepository;

@Service
public class TicketService {
	
	@Autowired
	TicketingRepository ticketingRepository;
	
	
	public Iterable<Ticket> getAllTickets()
	{
		return ticketingRepository.findAll();
	}
	
	
	public Ticket getTicketById(Integer ticketId) {
		return ticketingRepository.findById(ticketId)
				.orElse(new Ticket());
	}
	
	public Ticket saveTicket(Ticket saveTicket) {
		return ticketingRepository.save(saveTicket);
	}
	
	
	public Ticket updateTicketEmail(Integer ticketId,String newEmail) {
		Ticket ticketReter = getTicketById(ticketId);
		ticketReter.setEmail(newEmail);
		return ticketingRepository.save(ticketReter);
	}
	
	
	public void deleteTicket(Integer ticketId) {
		 ticketingRepository.deleteById(ticketId);
	}

}
