package com.practise.learning.ecommers.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.practise.learning.ecommers.model.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, Integer> {

}
