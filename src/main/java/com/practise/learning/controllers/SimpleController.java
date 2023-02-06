package com.practise.learning.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
	
	@RequestMapping(value = "/")
	public String getHelloWorld()
	{
		return "Hello World !! from the Spring boot base APP.";
	}

}
