package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PractiseApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(PractiseApplication.class, args);
		
		Alien a = context.getBean(Alien.class);
		a.display();
		
		Alien a1 = context.getBean(Alien.class);
		a1.display();
		
		laptop l = context.getBean(laptop.class);
		l.display2();
	}

}
