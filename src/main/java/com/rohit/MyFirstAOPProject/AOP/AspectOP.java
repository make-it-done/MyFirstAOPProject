package com.rohit.MyFirstAOPProject.AOP;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectOP {

	@Before("execution(public void com.rohit.MyFirstAOPProject.Component.AccountDAO.addAccount())")
	public void beforeAddAccountAdvice() {
		System.out.println("Before Add Advice");
	}

	@Before("execution(public void com.rohit.MyFirstAOPProject.Component.MemberShipDAO.addAccount())")
	public void beforeAddMemberShipAccountAdvice() {
		System.out.println("Before MemberShipDAO addAccount");
	}

	@Before("execution(public void add*())")
	public void beforeAddAdvice() {
		System.out.println("Before all method starting with add");
	}

}
