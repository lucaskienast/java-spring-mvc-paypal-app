package com.kienast.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.kienast.dto.OrderDto;

@Controller
public class AuthPaymentController {

	@RequestMapping(path="/authorize_payment", method = RequestMethod.POST)
	public String printHello(@RequestParam String product,
							@RequestParam String subtotal,
							@RequestParam String shipping,
							@RequestParam String tax,
							@RequestParam String total) {
		//model.addAttribute("message", "Hello Spring MVC Framework! This is Akash.");
		OrderDto orderDetail = new OrderDto(product, subtotal, shipping, tax, total);
		System.out.println(orderDetail);
		
		return "error";
	}
	
}