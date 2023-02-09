package com.practise.learning.controllers.practise;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/HDFC")
public class HDFCController {
	
	@RequestMapping(value="/savings")
	public String getSavingsDetails() {
		return "HDFC ===> Savings Details";
	}
	
	@RequestMapping(value="/current")
	public String getCurrentDetails() {
		return "HDFC ===> Current Details";
	}
	
	@RequestMapping(value="/credit")
	public String getCreditDetails() {
		return "HDFC ===> Credit Card Details";
	}
	
	@RequestMapping(value="/homeLoan")
	public String getHomeLoanDetails() {
		return "HDFC ===> Home Loan Details";
	}

}
