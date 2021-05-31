package com.raul.DependencyInjections.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.raul.DependencyInjections.services.GreetingServiceImpl;

class ConstructorInjectedControllerTest {

	ConstructorInjectedController controller;

	@BeforeEach
	void setUp() {
		this.controller = new ConstructorInjectedController(new GreetingServiceImpl());
	}

	@Test
	void testGetGreetingService() {
		System.out.println(this.controller.getGreeting());
	}

}
