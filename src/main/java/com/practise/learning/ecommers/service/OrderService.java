package com.practise.learning.ecommers.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practise.learning.ecommers.model.Order;
import com.practise.learning.ecommers.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	OrderRepository orderRepo;

	public Iterable<Order> fetchAllOrders() {
		return orderRepo.findAll();
	}

	public Order saveOrder(Order ordSave) {
		return orderRepo.save(ordSave);
	}

	public Order fetchByOrderId(Integer ordId) {
		return orderRepo.findById(ordId).orElse(new Order());
	}

	public Order updateOrder(Integer ordId, String customerName) {
		Order updateOrder = fetchByOrderId(ordId);
		updateOrder.setCustomerName(customerName);
		return orderRepo.save(updateOrder);
	}

	public void removeOrder(Integer orderId) {
		orderRepo.deleteById(orderId);
	}

}
