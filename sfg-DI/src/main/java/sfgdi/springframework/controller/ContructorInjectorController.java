package sfgdi.springframework.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import sfgdi.springframework.service.GreetingService;

@Controller
public class ContructorInjectorController {
	
	private final GreetingService greetingService;
	
	 
	public ContructorInjectorController(@Qualifier("constructorInjectorGreetingService")GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}

}
