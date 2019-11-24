package com.rohit.MyFirstAOPProject.Service;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

@Component
public class TrafficFortuneService {

	public void getFortune() {

		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Lot of traffic will be there ");
	}

	public void getFortune(Boolean boolean1) {
		
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		if(boolean1==true)
			throw new RuntimeException("Throwing Exception in getFortune");

		

		System.out.println("Lot of traffic will be there ");
	}

}
