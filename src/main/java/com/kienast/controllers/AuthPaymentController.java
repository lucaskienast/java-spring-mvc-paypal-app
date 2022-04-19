package com.kienast.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.kienast.services.PaymentService;
import com.kienast.dto.OrderDto;
import com.paypal.base.rest.PayPalRESTException;

@Controller
public class AuthPaymentController {

	@RequestMapping(path="/authorize_payment", method = RequestMethod.POST)
	public ModelAndView printHello(@RequestParam String product,
									@RequestParam String subtotal,
									@RequestParam String shipping,
									@RequestParam String tax,
									@RequestParam String total) {
		
		OrderDto orderDetail = new OrderDto(product, subtotal, shipping, tax, total);
		System.out.println(orderDetail);
		
		try {
			PaymentService paymentService = new PaymentService();
			String approvalLink = paymentService.authorizePayment(orderDetail);
			ModelAndView mav = new ModelAndView("redirect:" + approvalLink);
			return mav;
		} catch(PayPalRESTException ex) {
			ex.printStackTrace();
			ModelAndView mav = new ModelAndView("error");
            mav.addObject("errorMessage", "Could not execute payment");
			return mav;
		}		
	}
	
}