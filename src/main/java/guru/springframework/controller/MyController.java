package guru.springframework.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import guru.springframework.services.GreetingService;

@Controller
public class MyController {

	@Autowired
	private GreetingService greetingService;
	
	public GreetingService sayHello() {
		System.out.println("Hello World");
		return greetingService;
	}
	
	
}
