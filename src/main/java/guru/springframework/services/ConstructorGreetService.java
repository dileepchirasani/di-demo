package guru.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetService implements GreetingService {

	@Override
	public void greet() {
	System.out.println("Helloo.... from Constructor Greet Service");

	}

}
