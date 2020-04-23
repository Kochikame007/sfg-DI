package sfgdi.springframework.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import sfgdi.springframework.service.GreetingService;

@Controller
public class PropertyInjectedController {
	
	@Qualifier("propertyInjectorGreetingService")
	@Autowired
	public GreetingService greetingService;
	
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}

}
