package exam.test03;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("exam/test03/beans.xml");
		
		System.out.println("객체명 출력");
		for (String name : ctx.getBeanDefinitionNames()) {
			
			System.out.println(name);
		}

		Score score = (Score)ctx.getBean(exam.test03.Score.class);
		
		if (score != null) {
			System.out.println("클래스에서 객체 가져오기 성공 (여러개 있는 경우는 안되요)");
		}
		
	}
}
