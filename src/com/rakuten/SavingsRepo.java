package com.rakuten;

import org.springframework.stereotype.Component;

@Component
public class SavingsRepo implements Account {

	public SavingsRepo() {
		System.out.println("Savings Constructor..");
		// TODO Auto-generated constructor stub
	}
	
	public String credit(float amount) {
		return "Salary is Credited "+amount;
	}
}
