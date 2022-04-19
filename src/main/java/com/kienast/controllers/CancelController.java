package com.kienast.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CancelController {

	@RequestMapping(path="/cancel_payment", method = RequestMethod.GET)
	public String displayCheckoutPage() {
		return "cancel";
	}
	
}