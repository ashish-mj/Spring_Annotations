package com.rakuten;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Controller {
	public static void main(String[] args) {
		System.out.println("Initializing Spring Container .....");
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Bean.xml");
		AccountService service=
				(AccountService) ctx.getBean("account");
		System.out.println(service.creditService(50000));
	
}
}
