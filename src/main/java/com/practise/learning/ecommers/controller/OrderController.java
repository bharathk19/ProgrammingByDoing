package com.practise.learning.ecommers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practise.learning.ecommers.model.Order;
import com.practise.learning.ecommers.service.OrderService;

@RestController()
@RequestMapping(value = "/Orders")
public class OrderController {

	@Autowired
	OrderService orderService;

	@GetMapping("/AllOrders")
	public Iterable<Order> fetchAllOrders() {
		return orderService.fetchAllOrders();
	}

	@GetMapping("/ByOrderId/{orderId}")
	public Order fetchOrder(@PathVariable("orderId") Integer orderId) {

		return orderService.fetchByOrderId(orderId);
	}

	@PostMapping("/persistOrder")
	public Order persistOrder(@RequestBody Order order) {
		return orderService.saveOrder(order);
	}

	@PutMapping("/alterOrder/{orderId}/{customername}")
	public Order updateOrder(@PathVariable("orderId") Integer orderId,
			@PathVariable("customername") String customerName) {
		return orderService.updateOrder(orderId, customerName);
	}

	@DeleteMapping("/deleteOrder/{orderId}")
	public void removeOrder(@PathVariable("orderId") Integer orderId) {
		orderService.removeOrder(orderId);
	}

}
