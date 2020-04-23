package sfgdi.springframework.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceimpl implements GreetingService{
	
	@Override
	public String sayGreeting() {
		
		return "Hello!";
	}

}
