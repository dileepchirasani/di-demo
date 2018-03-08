package guru.springframework.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.services.GreetingService;

@Controller
public class ConstructorController {
// In order to remove the confusion for spring framework in which GreetingService implementations
	// to  choose from, we are using Qualifier() to provide exact name that we are looking for 
	public GreetingService greetingService;
	public ConstructorController( @Qualifier("constructorGreetService") GreetingService greetingService) {
		this.greetingService = greetingService;
	}
}
