package com.raul.DependencyInjections.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.raul.DependencyInjections.services.GreetingService;

@Controller
public class ConstructorInjectedController {
	private final GreetingService greetingService;

	@Autowired
	public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}

	public String getGreeting() {
		return this.greetingService.sayGreeting();
	}

}
