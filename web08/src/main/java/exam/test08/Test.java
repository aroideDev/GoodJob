package exam.test08;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("exam/test08/Beans.xml");
		
		System.out.println("객체명 출력");
		for (String name : ctx.getBeanDefinitionNames()) {
			
			System.out.println(name);
		}

		Car car1 = (Car)ctx.getBean("car1");
		Car car2 = (Car)ctx.getBean("car2");
		car1.engine.cc = 3500;
		
		System.out.println("car1 = " + car1);
		System.out.println("car2 = " + car2);
	}
}
