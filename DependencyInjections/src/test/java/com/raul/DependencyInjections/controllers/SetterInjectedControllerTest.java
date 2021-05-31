package com.raul.DependencyInjections.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.raul.DependencyInjections.services.GreetingServiceImpl;

class SetterInjectedControllerTest {
	SetterInjectedController controller;

	@BeforeEach
	void setUp() {
		this.controller = new SetterInjectedController();
		this.controller.setGreetingService(new GreetingServiceImpl());
	}

	@Test
	void testSetGreetingService() {
		System.out.println(this.controller.getGreeting());
	}

}
