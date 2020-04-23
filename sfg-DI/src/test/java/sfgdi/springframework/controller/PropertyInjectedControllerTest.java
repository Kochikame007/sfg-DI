package sfgdi.springframework.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import sfgdi.springframework.service.GreetingServiceimpl;

class PropertyInjectedControllerTest {
	
	PropertyInjectedController controller;
	
	@BeforeEach
	void setUp() {
		controller = new PropertyInjectedController();
		controller.greetingService = new GreetingServiceimpl();
	}

	@Test
	void testGetGreeting() {
		System.out.println(controller.getGreeting());
	}

}
