package com.rohit.MyFirstAOPProject.Component;

import java.util.ArrayList;
import java.util.List;

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
	
	public List<Account> findAccounts(){
		List<Account> lAccounts = new ArrayList<Account>();
		Account account = new Account("rohit", "1.0");
		Account account2 = new Account("kumar", "2.0");
		
		lAccounts.add(account);
		lAccounts.add(account2);
		return lAccounts;
	}
	
	public List<Account> findAccounts(Boolean boolean1){
		if(boolean1 == true)
			throw new RuntimeException("Boolean value is true");
		List<Account> lAccounts = new ArrayList<Account>();
		Account account = new Account("rohit", "1.0");
		Account account2 = new Account("kumar", "2.0");
		
		lAccounts.add(account);
		lAccounts.add(account2);
		return lAccounts;
	}
}
