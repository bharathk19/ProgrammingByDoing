package com.practise.learning.ticketbooking.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name="ticket_name")
public class Ticket {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	@Column(name = "ticket_id")
	private int tickedId;
	
	@Column(name="passenger_name")
	private String passengerName;

	@Column(name="source_station")
	private String sourceStation;
	
	@Column(name="destination_station")
	private String destinationStation;
	
	@Column(name="travel_date")
	private Date travelDate;
	
	private String email;

	public int getTickedId() {
		return tickedId;
	}

	public void setTickedId(int tickedId) {
		this.tickedId = tickedId;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public String getSourceStation() {
		return sourceStation;
	}

	public void setSourceStation(String sourceStation) {
		this.sourceStation = sourceStation;
	}

	public String getDestinationStation() {
		return destinationStation;
	}

	public void setDestinationStation(String destinationStation) {
		this.destinationStation = destinationStation;
	}

	public Date getTravelDate() {
		return travelDate;
	}

	public void setTravelDate() {
		this.travelDate = new Date();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Ticket(String passengerName, String sourceStation, String destinationStation, 
			String email) {
		super();
		this.passengerName = passengerName;
		this.sourceStation = sourceStation;
		this.destinationStation = destinationStation;
		this.travelDate = new Date();
		this.email = email;
	}
	
	public Ticket() {
		
	}
	
}
