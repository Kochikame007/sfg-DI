package sfgdi.springframework.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import sfgdi.springframework.service.GreetingServiceimpl;

class SetterInjectedControllerTest {

		 SetterInjectedController controller;
	@BeforeEach
	 void setUp() {
		controller = new SetterInjectedController();
		controller.setGreetingService(new GreetingServiceimpl());
		
	}

	@Test
	void test() {
		System.out.println(controller.getGreeting());
	}

}
