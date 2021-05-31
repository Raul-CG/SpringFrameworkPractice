package com.raul.DependencyInjections.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.raul.DependencyInjections.services.GreetingService;

@Controller
public class PropertyInjectedController {
	@Autowired
	public GreetingService greetingService;

	public String getGreeting() {
		return this.greetingService.sayGreeting();
	}
}
