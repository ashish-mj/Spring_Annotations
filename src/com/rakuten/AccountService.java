package com.rakuten;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("account")
public class AccountService {
	@Autowired
	//@Qualifier("CreditCardAcc")
	private Account account;
	
	AccountService() {
		System.out.println("Service Constructor");
	}
	/*
	@Autowired
	void setAccount(Account account) {
		this.account=account;
		System.out.println("Setter Method");
	}
   */
	String creditService(float amt) {
		return account.credit(amt);
	}

}