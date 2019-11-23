package com.rohit.MyFirstAOPProject.Component;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

	public void addAccount() {
		System.out.println("Adding Account in Database");
	}

}
