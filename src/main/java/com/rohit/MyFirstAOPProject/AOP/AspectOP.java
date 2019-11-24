package com.rohit.MyFirstAOPProject.AOP;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class AspectOP {
//
//	@Before("execution(public void com.rohit.MyFirstAOPProject.Component.AccountDAO.addAccount())")
//	public void beforeAddAccountAdvice() {
//		System.out.println("Before Add Advice");
//	}
//
//	@Before("execution(public void com.rohit.MyFirstAOPProject.Component.MemberShipDAO.addAccount())")
//	public void beforeAddMemberShipAccountAdvice() {
//		System.out.println("Before MemberShipDAO addAccount");
//	}
//
//	@Before("execution(public void add*())")
//	public void beforeAddAdvice() {
//		System.out.println("Before all methods");
//	}
//
//	@Before("execution(* com.rohit.MyFirstAOPProject.Component.*.*(..))")
//	public void beforeCommonAdvice() {
//		System.out.println("Before all method starting with add");
//	}
//
//	@Before("execution(public void add*(com.rohit.MyFirstAOPProject.Entity.Account))")
//	public void beforeAddAdvicewithAccount() {
//		System.out.println("Before all method starting with add having Account as a parameter");
//	}

}
