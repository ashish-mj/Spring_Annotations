package com.rakuten;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service {
	private Account account;
	
	@Autowired
	void setAccount(Account account) {
		this.account=account;
		System.out.println("Setter Method");
	}
	
	String creditService(float amt) {
		return account.credit(amt);
	}

}
