package com.rohit.MyFirstAOPProject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rohit.MyFirstAOPProject.Component.AccountDAO;
import com.rohit.MyFirstAOPProject.Component.MemberShipDAO;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(DemoApp.class);

		AccountDAO accountDAO = applicationContext.getBean("accountDAO",AccountDAO.class);
		accountDAO.addAccount();
		
		MemberShipDAO memberShipDAO = applicationContext.getBean(MemberShipDAO.class);
		
		memberShipDAO.addAccount();
		memberShipDAO.addSillyMethod();

	}
}
