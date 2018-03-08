package guru.springframework.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.services.GreetingService;

@Controller
public class SetterController {

	private GreetingService greetingService;

	/**
	 * @return the greetingService
	 */
	public GreetingService getGreetingService() {
		return greetingService;
	}

	/**
	 * @param greetingService the greetingService to set
	 */
	@Autowired
	public void setGreetingService( @Qualifier("setterGreetServiceImpl")GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	
}
