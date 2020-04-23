package sfgdi.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import sfgdi.springframework.controller.ContructorInjectorController;
import sfgdi.springframework.controller.I18nController;
import sfgdi.springframework.controller.MyController;
import sfgdi.springframework.controller.PropertyInjectedController;
import sfgdi.springframework.controller.SetterInjectedController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		
		MyController controller = (MyController) ctx.getBean("myController");
		
		System.out.println(controller.sayHello()) ;
		
		I18nController icontroller = (I18nController)ctx.getBean("i18nController");
		
		System.out.println(icontroller.sayHello());
		 
		
		System.out.println("------------property");
		
		PropertyInjectedController propertyInjectorController = (PropertyInjectedController)ctx.getBean("propertyInjectedController");
		
		System.out.println(propertyInjectorController.getGreeting());
		
		System.out.println("------setter");
		
		SetterInjectedController setterInjectedController = (SetterInjectedController)ctx.getBean("setterInjectedController");
		
		System.out.println(setterInjectedController.getGreeting());
		
		System.out.println("--------constructor");
		ContructorInjectorController contructorInjectorController = (ContructorInjectorController)ctx.getBean("contructorInjectorController");
		
		System.out.println(contructorInjectorController.getGreeting());
	}
 
}
