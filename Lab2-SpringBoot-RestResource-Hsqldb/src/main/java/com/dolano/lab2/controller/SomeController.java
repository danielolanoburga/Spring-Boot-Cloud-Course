package com.dolano.lab2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SomeController {
	
	@RequestMapping("/")
	public String someMethod() {
		String valueToReturn = "hello";
		return valueToReturn;
	}

}
