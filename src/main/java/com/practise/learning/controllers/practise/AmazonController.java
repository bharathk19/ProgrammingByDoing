package com.practise.learning.controllers.practise;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/Amazon")
public class AmazonController {
	
	@RequestMapping(value="/products")
	public String getProductDetails() {
		return "Amazon ===> Displaying Products Details";
	}
	
	@RequestMapping(value="/cart")
	public String getCarttDetails() {
		return "Amazon ===> Displaying cart Details";
	}
	
	@RequestMapping(value="/discount")
	public String getDiscountSection() {
		return "Amazon ===> Discount Section";
	}
	
	@RequestMapping(value="/return")
	public String getReturnSection() {
		return "Amazon ===> Return Section";
	}

}
