package exam.test13;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("exam/test13/Beans.xml");
		
		System.out.println("객체명 출력");
		for (String name : ctx.getBeanDefinitionNames()) {
			
			System.out.println(name);
		}

		Tire t1 = (Tire)ctx.getBean("hankookTire");
		Tire t2 = (Tire)ctx.getBean("kumhoTire");
		
		System.out.println("hankookTire = " + t1);
		System.out.println("kumhoTire = " + t2);
	}
}
