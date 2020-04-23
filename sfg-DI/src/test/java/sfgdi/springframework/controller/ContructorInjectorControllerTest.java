package sfgdi.springframework.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import sfgdi.springframework.service.GreetingServiceimpl;

class ContructorInjectorControllerTest {

	ContructorInjectorController controller;
	@BeforeEach
	void setUp() throws Exception {
		controller = new ContructorInjectorController(new GreetingServiceimpl());
	}

	@Test
	void test() {
		System.out.println(controller.getGreeting());
	}

}
