package exam.test10;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("exam/test10/Beans.xml");
		
		System.out.println("객체명 출력");
		for (String name : ctx.getBeanDefinitionNames()) {
			
			System.out.println(name);
		}

		Car car1 = (Car)ctx.getBean("car1");
		
		System.out.println("car1 = " + car1);
	}
}
