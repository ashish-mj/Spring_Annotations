package com.rakuten;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class CreditCardAcc implements Account {
	
	CreditCardAcc(){
		System.out.println("CreditAccount Constructor ");
	}
	
	public String credit(float amt) {
		return "The amt of "+amt+" credited in ur Credit Card account";
	}

}