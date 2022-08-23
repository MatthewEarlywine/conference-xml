package com.pluralsight.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;

public class Application {
	
	public static void main (String args[]) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//SpeakerService service = new SpeakerServiceImpl();
		SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);
		
		System.out.println("This is test code");
		System.out.println(service.findAll().get(0).getFirstName());
		System.out.println(service.findAll().get(0).getLastName());
		System.out.println("Test successful");
	}

}
