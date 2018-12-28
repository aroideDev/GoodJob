package exam.test14;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("exam/test14/Beans.xml");
		
		System.out.println("객체명 출력");
		for (String name : ctx.getBeanDefinitionNames()) {
			
			System.out.println(name);
		}

		Engine eng1 = (Engine)ctx.getBean("hyundaiEngine");
		Engine eng2 = (Engine)ctx.getBean("hyundaiEngine");
		eng1.cc = 1000;
		Engine eng3 = (Engine)ctx.getBean("kiaEngine");
		Engine eng4 = (Engine)ctx.getBean("kiaEngine");
		eng3.cc = 2000;
		
		System.out.println("eng1 = " + eng1);
		System.out.println("eng2 = " + eng2);
		System.out.println("eng3 = " + eng3);
		System.out.println("eng4 = " + eng4);
	}
}
