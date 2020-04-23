package sfgdi.springframework.controller;

import org.springframework.stereotype.Controller;

import sfgdi.springframework.service.PrimaryGreetingService;

@Controller
public class MyController {
	
	private final PrimaryGreetingService greetingService;
	
	public MyController(PrimaryGreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String sayHello() {
		return  greetingService.sayGreeting();
	}
	
}
