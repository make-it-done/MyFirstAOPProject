package com.rohit.MyFirstAOPProject.AOP;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.rohit.MyFirstAOPProject.Entity.Account;

@Aspect
@Component
@Order(2)
public class PointCutExpression {

	@Pointcut("execution(public void add*(..))")
	public void beforeAddAdvice() {
		System.out.println("Before all methods");
	}

	@Pointcut("execution(* com.rohit.MyFirstAOPProject.Component.MemberShipDAO.*(com.rohit.MyFirstAOPProject.Entity.Account))")
	public void beforeAddAdvicewithAccount() {
		System.out.println("Before all method starting with add having Account as a parameter");
	}

	@Before("beforeAddAdvice()")
	public void beforeCommonAddAdvice() {
		System.out.println("before All Add advice");
	}

//	@Before("beforeAddAdvice() && beforeAddAdvicewithAccount()")
//	public void beforeAllAddAdvice() {
//		System.out.println("Using And PointCut Expression");
//	}
//	
//	@Before("beforeAddAdvice() || beforeAddAdvicewithAccount()")
//	public void beforeAllAddAdviceOrWithAccountAsParameter() {
//		System.out.println("Account As a parameter");
//	}
//	
//	@Before("!beforeAddAdvice() && beforeAddAdvicewithAccount()")
//	public void beforeAllAddAdviceinMemberDAO() {
//		System.out.println("Add Account inside MemeberDAO");
//	}

//	@Before("beforeAddAdvice()")
//	public void addingMethodSignature(JoinPoint joinPoint) {
//		MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
//		System.out.println("Printing Method Signature "+methodSignature);
//	}
//	
//	@Before("beforeAddAdvice()")
//	public void printingMethodArgument(JoinPoint joinPoint) {
//		
//		Object[] objects= joinPoint.getArgs();
//		System.out.println("Printing Method Arguments");
//		for(Object arg: objects) {
//			System.out.println("Argument is "+arg);
//		}
//	}

//	@AfterReturning(pointcut="execution(* com.rohit.MyFirstAOPProject.Component.AccountDAO.find*())",returning = "result")
//	public void afterReturnInAccountDAO(JoinPoint joinPoint,List<Account> result){
//		System.out.println("Printing After Return Result");
//		for(Account account : result)
//		System.out.println(account.toString());
//	}

	@AfterReturning(pointcut = "execution(* com.rohit.MyFirstAOPProject.Component.AccountDAO.find*())", returning = "result")
	public void afterReturnInAccountDAOWithResultModification(JoinPoint joinPoint, List<Account> result) {
		System.out.println("Printing After Return Result");
		for (Account account : result) {
			account.setLevel(account.getLevel() + " Info");
			System.out.println(account.toString());
		}
	}
	
	//Exception is propagated to main method 
	@AfterThrowing(pointcut = "execution(* com.rohit.MyFirstAOPProject.Component.AccountDAO.find*(..))", throwing ="exp")
	public void afterThrrowingExceptionInAccountDAO(JoinPoint joinPoint, Throwable  exp) {
		System.out.println("After Throwing Method");
		System.out.println("Exception Type : "+exp.getMessage()  );
		
	}
	@After("execution(* com.rohit.MyFirstAOPProject.Component.AccountDAO.find*(..))")
	public void usingAfterAnnotation(JoinPoint joinPoint) {
		System.out.println("Using After Annotation");
		System.out.println("");
		
	}

}
