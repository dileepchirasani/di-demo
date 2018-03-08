package guru.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.controller.ConstructorController;
import guru.springframework.controller.MemberController;
import guru.springframework.controller.MyController;
import guru.springframework.controller.SetterController;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");
		myController.sayHello().greet();
		
		ConstructorController conController = (ConstructorController) ctx.getBean("constructorController");
		MemberController memController = (MemberController) ctx.getBean("memberController");
		SetterController setterController = (SetterController) ctx.getBean("setterController");
		conController.greetingService.greet();
		memController.greetingServiceImpl.greet();
		setterController.getGreetingService().greet();
	}
}
