package exam.test17;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("exam/test17/Beans.xml");
		
		System.out.println("객체명 출력");
		for (String name : ctx.getBeanDefinitionNames()) {
			
			System.out.println(name);
		}

		Car car = (Car)ctx.getBean("car");
		Car car1 = (Car)ctx.getBean("car1");
		Car car2 = (Car)ctx.getBean("car2");
		
		Engine defaultEngine = (Engine)ctx.getBean("engine");
		defaultEngine.maker="hoon";
		defaultEngine.cc=4000;
		
		car1.engine=(Engine)ctx.getBean("hyundaiEngine");
		car2.engine=(Engine)ctx.getBean("kiaEngine");
		car.engine=defaultEngine;
		
		System.out.println("component car = " + car);
		System.out.println("car1 = " + car1);
		System.out.println("car2 = " + car2);
	}
}
