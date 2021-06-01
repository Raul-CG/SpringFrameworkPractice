package com.raul.DependencyInjections.controllers;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import com.raul.DependencyInjections.services.ConstructorGreetingService;

public class PropertyInjectedControllerTest {

	PropertyInjectedController controller;

	@BeforeEach
	void setUp() {
		this.controller = new PropertyInjectedController();
		this.controller.greetingService = new ConstructorGreetingService();
	}

	@Test
	void getGreeting() {
		System.out.println(this.controller.getGreeting());
	}

}
