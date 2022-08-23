package com.pluralsight.main;

import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;

public class Application {
	
	public static void main (String args[]) {
		SpeakerService service = new SpeakerServiceImpl();
		
		System.out.println("This is test code");
		System.out.println(service.findAll().get(0).getFirstName());
		System.out.println(service.findAll().get(0).getLastName());
		System.out.println("Test successful");
	}

}
