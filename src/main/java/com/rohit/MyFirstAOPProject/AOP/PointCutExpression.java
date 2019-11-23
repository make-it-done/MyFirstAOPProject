package com.rohit.MyFirstAOPProject.AOP;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PointCutExpression {

	@Pointcut("execution(public void add*(..))")
	public void beforeAddAdvice() {
		System.out.println("Before all methods");
	}

	@Before("beforeAddAdvice()")
	public void beforeCommonAddAdvice() {
		System.out.println("before All Add advice");
	}

	@Before("beforeAddAdvice()")
	public void beforeAllAddAdvice() {
		System.out.println("Using PointCut Expression");
	}
}
