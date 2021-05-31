package com.raul.DependencyInjections.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

	public String sayHi() {
		System.out.println("\nExecuting MyController's method: ");

		return "Hello o/";
	}

}
