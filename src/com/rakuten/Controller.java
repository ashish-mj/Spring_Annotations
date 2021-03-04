package com.rakuten;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Controller {
	public static void main(String[] args) {
		System.out.println("Initializing Spring Container .....");
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Bean.xml");
		Service service=
				(Service)ctx.getBean("service");
		System.out.println(service.creditService(100000));
	
}
}
