package exam.test15;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("exam/test15/Beans.xml");
		
		System.out.println("객체명 출력");
		for (String name : ctx.getBeanDefinitionNames()) {
			
			System.out.println(name);
		}

		Tire tire1 = (Tire)ctx.getBean("kumhoTire");
		Tire tire2 = (Tire)ctx.getBean("hankookTire");
		
		System.out.println("tire1 = " + tire1);
		System.out.println("tire2 = " + tire2);
	}
}
