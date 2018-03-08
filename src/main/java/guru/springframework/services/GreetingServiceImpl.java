package guru.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

	@Override
	public void greet() {
		System.out.println("Hello... from MainImpl");

	}

}
