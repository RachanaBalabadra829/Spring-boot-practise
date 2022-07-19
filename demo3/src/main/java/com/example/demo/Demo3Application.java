package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class Demo3Application {
	static int h;
	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(Demo3Application.class, args);
		addition x = context.getBean(addition.class);
		
		
		h=x.add(5,6);
		
		System.out.println(h);
	}
	@RequestMapping("/p")
	public String display() {
		return "hello. The sum is " + Integer.toString(h);
	}

}
