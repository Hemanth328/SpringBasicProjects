package com.hemanth.beans;

import java.util.Random;

import org.springframework.stereotype.Component;
@Component("bat")
public class CricketBat {
	
	public CricketBat() {
		System.out.println("CricketBat : 0-Param Constructor");
	}
	
	public int scoreRuns() {
		return new Random().nextInt(200);
	}

}
