package com.raul.DependencyInjections.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.raul.DependencyInjections.services.GreetingService;

@Controller
public class MyController {

	private final GreetingService greetingService;

	@Autowired
	public MyController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}

	public String sayHi() {
		System.out.println("\nExecuting MyController's method: ");

		return this.greetingService.sayGreeting();
	}

}
