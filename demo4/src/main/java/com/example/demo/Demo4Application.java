package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
@ComponentScan(basePackages= {"com.example"})
public class Demo4Application {
	static String   h;
	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Demo4Application.class, args);
		prime a = context.getBean(prime.class);
		
		
		
		h=a.check(17);
		System.out.println(h);
	}
	@RequestMapping("/p")
	public String display() {
		return h ;
	}
   
}
