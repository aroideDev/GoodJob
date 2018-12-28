package exam.test07;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("exam/test07/Beans.xml");
		
		System.out.println("객체명 출력");
		for (String name : ctx.getBeanDefinitionNames()) {
			
			System.out.println(name);
		}

		Engine engine1 = (Engine)ctx.getBean("engine1");
		engine1.cc = 3000;
		
		Car car1 = (Car)ctx.getBean("car1");
		Car car2 = (Car)ctx.getBean("car2");
		Car car3 = (Car)ctx.getBean("car3");
		Car car4 = (Car)ctx.getBean("car4");

		System.out.println("car1 = " + car1);
		System.out.println("car2 = " + car2);
		System.out.println("car3 = " + car3);
		System.out.println("car4 = " + car4);
	}
}
