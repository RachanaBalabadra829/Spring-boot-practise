package com.example.demo;

import org.springframework.stereotype.Component;

@Component

public class laptop {
	private String lname;
	private int lram;
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getLram() {
		return lram;
	}
	public void setLram(int lram) {
		this.lram = lram;
	}
	
	public void display2() {
		System.out.println("displaying one more content");
	}

}
