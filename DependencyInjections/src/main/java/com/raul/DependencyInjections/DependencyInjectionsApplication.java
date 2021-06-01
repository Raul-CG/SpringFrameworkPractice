package com.raul.DependencyInjections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.raul.DependencyInjections.controllers.ConstructorInjectedController;
import com.raul.DependencyInjections.controllers.MyController;
import com.raul.DependencyInjections.controllers.PropertyInjectedController;
import com.raul.DependencyInjections.controllers.SetterInjectedController;

@SpringBootApplication
public class DependencyInjectionsApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DependencyInjectionsApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println("----------- Primary Bean");
		System.out.println(myController.sayHi());

		System.out.println("----------- Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("----------- Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("----------- Constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
