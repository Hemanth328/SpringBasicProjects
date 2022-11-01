package com.hemanth.sbeans;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WIshMessageGenerator {
	
	@Autowired
	private LocalDateTime localDateTime;

	public WIshMessageGenerator() {
		System.out.println("WIshMessageGenerator : 0-Param constructor");
	}
	
	
	public String generateWishMessage(String user) {
		// get current Hour of the day
		int hour = localDateTime.getHour();  // 24hr format
		//generate Wish Message
		if(hour<12)
			return "Good Morning "+user;
		else if(hour<16)
			return "Good Afternoon "+user;
		else if(hour<20)
			return "Good Evening "+user;
		else
			return " Good Night "+user;
	}
	

}
