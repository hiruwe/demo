package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String sayHello() {
		System.out.println("Helloooooooooo :) ");
		return new String("Helloooo");	
	
	}
}
