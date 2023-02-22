package com.practise.learning.ecommers.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="order_tbl")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="order_id")
	private int orderId;
	@Column(name="customer_name")
	private String customerName;
	@Column(name="product")
	private String product;
	@Column(name="order_amount")
	private String orderAmount;
	@Column(name="payment_status")
	private String paymentStatus;
	@Column(name="order_status")
	private String orderStatus;
	
	public Order() {
		super();
	}

	public Order(int orderId, String customerName, String product, String orderAmount, String paymentStatus,
			String orderStatus) {
		super();
		this.customerName = customerName;
		this.product = product;
		this.orderAmount = orderAmount;
		this.paymentStatus = paymentStatus;
		this.orderStatus = orderStatus;
	}

	public int getOrderId() {
		return orderId;
	}


	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", customerName=" + customerName + ", product=" + product
				+ ", orderAmount=" + orderAmount + ", paymentStatus=" + paymentStatus + ", orderStatus=" + orderStatus
				+ "]";
	}
	
	
}
