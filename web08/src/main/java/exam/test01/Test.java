package exam.test01;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("exam/test01/beans.xml");
		
		new GenericXmlApplicationContext()
		
		Score score = (Score)ctx.getBean("score");
		
		System.out.println("sum = " + score.sum());
		System.out.println("ave = " + score.average());
	}
}
