package com.rohit.MyFirstAOPProject.Component;

import org.springframework.stereotype.Component;

import com.rohit.MyFirstAOPProject.Entity.Account;

@Component
public class MemberShipDAO {

	public void addAccount() {

		System.out.println("Adding MemberShip in Database");
	}

	public void addSillyMethod() {
		System.out.println("Adding Silly Method");
	}
	
	
}
