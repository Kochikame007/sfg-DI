package sfgdi.springframework.service;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectorGreetingService implements GreetingService {
	
	@Override
	public String sayGreeting() {
		
		return "Hello! from property";
	}

}
