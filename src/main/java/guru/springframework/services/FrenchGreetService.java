package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

// @Primary in below doesn't effect the Spring until the profiles is specified as active in properties
// Once Active you must set  existing @Primary Service to some other profile to remove conflicts
@Service
@Primary
@Profile("fr")
public class FrenchGreetService implements GreetingService {

	@Override
	public void greet() {
		System.out.println("Bonjour... ceci est du service de salutatio francais");
	}

}
