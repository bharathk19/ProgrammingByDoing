package com.practise.learning.ticketbooking.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.practise.learning.ticketbooking.model.Ticket;

@Repository
public interface TicketingRepository extends CrudRepository<Ticket, Integer>
{
	
	

}
