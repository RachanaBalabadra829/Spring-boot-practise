package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class prime {
	
	int i;
    int n;
	public String check(int n) {
		for(i=3; i<=n-1 ; i++) {
			if(n%i==0) {
				// System.out.println("not a prime no");
				return "not a prime";
			}
		}
		return "prime";
	}
}
		
		
		
	


