package guru.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetServiceImpl implements GreetingService {

	@Override
	public void greet() {
		System.out.println("Hello From SetterGreetService");
	}

}
