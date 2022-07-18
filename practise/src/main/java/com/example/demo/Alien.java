package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Alien {
	private int aid;
	private String aname;
	public laptop laptop;
	
	
	
	
	public Alien() {
		super();
		System.out.println("obj created");
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	
	public void display() {
		System.out.println("displaying content");
	}

}
