package guru.springframework.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.services.GreetingService;

@Controller
public class MemberController {

	// reference name matches the bean name .i.e greetingServiceImpl instead of Qualifier();
	// Spring uses reflection to map and inject in such cases and selects bean that matches bean name.
	// provided there are no @Primary anotated Bean.. which takes precedence in such scenarios
	@Autowired
	// @Qualifier("greetingServiceImpl") /* Uncomment the line to see the difference*/
	public GreetingService greetingServiceImpl;
}
