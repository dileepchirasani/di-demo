package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/* "default" makes the current profile as active when no profile is specified as active*/ 
@Service
@Primary
@Profile({"en","default"})
public class PrimaryGreetingService implements GreetingService {

	@Override
	public void greet() {
		System.out.println("Helloo... from Primary Greeting Service");

	}

}
