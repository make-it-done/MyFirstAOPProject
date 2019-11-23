package com.rohit.MyFirstAOPProject.Component;

import org.springframework.stereotype.Component;

import com.rohit.MyFirstAOPProject.Entity.Account;

@Component
public class AccountDAO {

	public void addAccount() {
		System.out.println("Adding Account in Database");
	}
	
	public void addAccount(Account theAccount) {
		
		System.out.println("adding Account "+theAccount.toString());
	}

}
