package com.rakuten;

import org.springframework.context.annotation.Primary;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository
//@Primary
public class SavingsRepo implements Account {

	public SavingsRepo() {
		System.out.println("Savings Constructor..");
		// TODO Auto-generated constructor stub
	}
	
	public String credit(float amount) {
		return "Salary is Credited "+amount;
	}
}
