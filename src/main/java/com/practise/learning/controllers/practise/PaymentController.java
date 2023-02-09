package com.practise.learning.controllers.practise;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/paymentgateway")
public class PaymentController {
	
	@RequestMapping("/credit")
	public String getCreditCard() {
		return "GateWay ===> Reached to CreditCard Method";
	}
	
	@RequestMapping("/net")
	public String getNetBanking() {
		return "GateWay ===> Reached to NetBanking Method";
	}
	
	@RequestMapping("/wallet")
	public String getWalletPayment() {
		return "GateWay ===> Reached to wallet Payment Method";
	}
	
	@RequestMapping("/gift")
	public String getGiftCard() {
		return "GateWay ===> Reached to Gift Card Payment Method";
	}

}
